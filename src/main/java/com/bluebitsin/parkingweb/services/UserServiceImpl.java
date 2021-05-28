package com.bluebitsin.parkingweb.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bluebitsin.parkingweb.model.Customer;
import com.bluebitsin.parkingweb.model.User;

@Service
public class UserServiceImpl implements UserService {

	//@Autowired
	//private UserDao userDao;
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	@Override
	public User getLoginUser(String mobile, String password) {
		
		User user = null;
		
		// check if inputs are not null and not empty
		if(mobile != null && !mobile.trim().isEmpty()
				&& password != null && !password.trim().isEmpty()) {
			
			user = getUserDetails(mobile, password);
			return user;
			
		}else {
			
			return user;
		}
		
	}

	private User getUserDetails(String mobile, String password) {
		
		EntityManager session = entityManagerFactory.createEntityManager();
		User user = null;
		
		try {
			
			String hqlQuery = "FROM Customer WHERE contactNumber = :mobile AND password = :password";
			Query query = session.createQuery(hqlQuery, Customer.class);
			query.setParameter("mobile", Integer.parseInt(mobile));
			query.setParameter("password", password);
			
			Customer customer = (Customer) query.getSingleResult();
			System.out.println(customer.toString());
			
			user = new User();
			user.setMobileNumber(mobile);
			user.setPassword(password);
			user.setUserId(customer.getCustomerId());
			user.setUserName(customer.getName());
			user.setVechileModel(customer.getVehicleModel());
			user.setVechileNumber(customer.getVehicleNumber());
			
			return user;
			
		}catch (Exception e) {
			e.printStackTrace();
			return user;
		}finally {
			
			if(session.isOpen()) {
				
				session.close();
			}
		}
		
	}
	
}
