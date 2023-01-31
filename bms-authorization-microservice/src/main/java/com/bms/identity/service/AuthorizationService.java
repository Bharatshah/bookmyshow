package com.bms.identity.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AuthorizationService {
	

	public UserDetails authorizeUser(String username) throws UsernameNotFoundException {
		//DAOUser user = userDao.findByUsername(username);
//		if (user == null) {
//			throw new UsernameNotFoundException("User not found with username: " + username);
//		}
		return new org.springframework.security.core.userdetails.User("bharat", "test",
				new ArrayList<>());
	}


}