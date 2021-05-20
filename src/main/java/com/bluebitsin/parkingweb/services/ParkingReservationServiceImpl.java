package com.bluebitsin.parkingweb.services;

import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bluebitsin.parkingweb.dao.ParkingReservationDao;
import com.bluebitsin.parkingweb.model.Customer;
import com.bluebitsin.parkingweb.model.ParkingReservation;
import com.bluebitsin.parkingweb.model.ParkingSlip;
import com.bluebitsin.parkingweb.model.ParkingSlot;
import com.bluebitsin.parkingweb.model.ParkingTicket;
import com.bluebitsin.parkingweb.model.QRData;

import helper.Utility;

@Service
public class ParkingReservationServiceImpl implements ParkingReservationService {

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	@Autowired
	private ParkingReservationDao parkingReservationDao;

	public ParkingReservationServiceImpl() {
		super();
	}

	@Override
	public ParkingTicket addParkingReservation(Customer customer) {

		// before reservation, check if slot available or not.
		ParkingTicket ticket = new ParkingTicket();
		List<ParkingSlot> slotList = getAllAvailableSlots();
		if (slotList.size() > 0) {

			// if yes, get slot no - randomly get one available slot
			ParkingSlot slot = getRandomSlot(slotList);
			System.out.println(slot.toString());

			// gather other required information for booking
			String reservationId = Utility.generateRandomStringByUUID();
			int customerId = customer.getCustomerId();
			int slotId = slot.getId();
			int durationInMiniuts = 0; // default
			Date bookingTimestamp = new Date(); //
			int reservationStatus = 0; // default

			// create reservation object
			ParkingReservation reservation = new ParkingReservation();
			reservation.setCustomerId(customerId);
			reservation.setDate(bookingTimestamp);
			reservation.setDurationInMinuits(durationInMiniuts);
			reservation.setParkingSlotId(slotId);
			reservation.setReservationId(reservationId);
			reservation.setReservationStatus(reservationStatus);

			// create reservation slip
			ParkingSlip parkingSlip = new ParkingSlip();
			parkingSlip.setParkingReservation(reservation);
			parkingSlip.setReservationId(reservationId);
			parkingSlip.setScanStatus(1);
			parkingSlip.setActualEntryTime(null);
			parkingSlip.setActualExitTime(null);
			parkingSlip.setBasicCost(0);
			parkingSlip.setIsPaid(0);
			parkingSlip.setPenalty(0);
			parkingSlip.setTotalCost(0);
			reservation.setParkingSlip(parkingSlip);

			// insert new record in ParkingReservation and ParkingSlip Table
			parkingReservationDao.save(reservation);
			System.out.println("New Booking Created.");

			// and update ParkingSlot 'slot' to occupied
			int rowCount = updateOccupiedSlot(slot);

			// create ParkingTicket and return generated ticket
			if(rowCount > 0) {
				
				ticket.setDate(bookingTimestamp);
				ticket.setFloor(0);
				ticket.setLocation("FF1 Square On Plaza, Ratan Khand, Sharda Nagar, Lucknow - 226002");
				ticket.setReservationId(reservationId);
				ticket.setSlotNumber(slot.getSlotNumber());
				ticket.setWing(slot.getWingCode());
				System.out.println("Parking Ticket is Generated.");
				
			}

			return ticket;

		} else {
			// if no, return null
			System.out.println("No Slot Availaible");

			return ticket;
		}

	}

	/**
	 * On basis of slot availability fun return one random slot
	 * 
	 * @return
	 */
	private List<ParkingSlot> getAllAvailableSlots() {

		EntityManager session = entityManagerFactory.createEntityManager();

		try {

			String sql = "select * from parking_slot where is_slot_booked=0";
			Query nativeQuery = session.createNativeQuery(sql, ParkingSlot.class);

			List<?> slotList = nativeQuery.getResultList();
			System.out.println("Slot List Count: " + slotList.size());

			return (List<ParkingSlot>) slotList;

		} catch (NoResultException e) {

			return null;

		} finally {
			if (session.isOpen())
				session.close();
		}

	}

	private ParkingSlot getRandomSlot(List<ParkingSlot> slotList) {

		// return random parking slot
		Random rand = new Random();
		int index = rand.nextInt(slotList.size());
		System.out.println("Index no: " + index);
		return (ParkingSlot) slotList.get(index);

	}

	private int updateOccupiedSlot(ParkingSlot slot) {

		EntityManager session = entityManagerFactory.createEntityManager();
		EntityTransaction tx = session.getTransaction();

		try {
			
			tx.begin();
			String sql = "UPDATE ParkingSlot SET isSlotBooked = 1 WHERE id=:slotId ";
			System.out.println(sql);
			Query nativeQuery = session.createQuery(sql);
			nativeQuery.setParameter("slotId", slot.getId());
			int rowCount = nativeQuery.executeUpdate();
			System.out.println("Rows Affected: " + rowCount);
			return rowCount;

		} catch (NoResultException e) {

			return 0;

		} finally {
			if (session.isOpen())
				tx.commit();
				session.close();
		}
	}

	
	
	/**
	 * Verify Parking Ticket
	 * @return QRData
	 */
	@Override
	public QRData verifyParkingTicket(String reservationId) {
		
		QRData qrData = new QRData();
		qrData.setMessage("QR is Verified");
		
		
		return qrData;
	}
	
	
}
