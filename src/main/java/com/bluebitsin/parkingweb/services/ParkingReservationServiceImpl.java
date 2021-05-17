package com.bluebitsin.parkingweb.services;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bluebitsin.parkingweb.dao.ParkingReservationDao;
import com.bluebitsin.parkingweb.model.Customer;
import com.bluebitsin.parkingweb.model.ParkingReservation;
import com.bluebitsin.parkingweb.model.ParkingSlot;
import com.bluebitsin.parkingweb.model.ParkingTicket;

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
		// if no, return null
		// if yes, get slot no - randomly get one available slot
		// gather other required information for booking
		// insert new record in ParkingReservation and ParkingSlip Table
		// and update ParkingSlot 'slot' to occupied
		// create ParkingTicket and return generated ticket
		
		/*
		 * Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		 * 
		 * ParkingReservation parkingReservation = new ParkingReservation();
		 * parkingReservation.setCustomerId(customer.getCustomerId());
		 * parkingReservation.setReservationTimestamp(timestamp.getTime());
		 * parkingReservation.setDate(new Date());
		 * parkingReservation.setDurationInMinuits(0);
		 * parkingReservation.setParkingSlotId(1); // find on availability basis
		 * parkingReservation.setReservationStatus(0);
		 * parkingReservation.setReservationId(Utility.generateRandomStringByUUID());
		 * //UUID
		 * 
		 * parkingReservationDao.save(new ParkingReservation());
		 */
		
		getAllAvailableSlots();
		
		return null;
		
	}
	
	
	private List<ParkingSlot> getAllAvailableSlots(){
		
		EntityManager session = entityManagerFactory.createEntityManager();
		
		try {
			
			String sql = "select * from parking_slot where is_slot_booked=0";
			Query query = session.createNativeQuery(sql);
			
			List<ParkingSlot> slotList = query.getResultList();
			System.out.println("Slot List Count: "+slotList.size());
			
			return slotList;
			
		}catch (NoResultException e) {
			
			return null;
			
		}finally {
            if(session.isOpen()) session.close();
        }
		
	}
	
}
