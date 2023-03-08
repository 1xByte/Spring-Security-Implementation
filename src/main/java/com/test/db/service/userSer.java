package com.test.db.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.test.db.model.User;
import com.test.db.repo.userRepo;

@Service
public class userSer {
	
	@Autowired
	private userRepo repo;
	
	@Autowired
	private PasswordEncoder encoder;
	
	
	public void AddUser(User user)
	{
		
	user.setPassword(encoder.encode(user.getPassword()));
		
		repo.save(user);

	}
	

}
