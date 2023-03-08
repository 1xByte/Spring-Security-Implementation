package com.test.db.config;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.test.db.model.User;
import com.test.db.repo.userRepo;

public class CustomUserDetailsService implements UserDetailsService {
	
	@Autowired
	private userRepo repo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		Optional<User> user=repo.findByUserName(username);
	
	 return	user.map(UserToUserDetails::new).orElseThrow(()-> new UsernameNotFoundException("Not Found") );
		
		
	}

}
