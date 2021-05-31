package com.bluebitsin.parkingweb.services;

import com.bluebitsin.parkingweb.model.User;

public interface UserService {

	public User getLoginUser(String mobile, String password);
	public User getLoginAgent(String mobile, String password);
	
}
