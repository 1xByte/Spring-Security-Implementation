package com.test.db.cont;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.db.model.User;
import com.test.db.service.userSer;

@RestController
public class userCont {
	
	@Autowired
	private userSer ser;

	@GetMapping(value = "/show")
	@PreAuthorize("hasAuthority('ROLE_USER')")
	public String show() {
		
		return "Show TTT";
	}
	
	@GetMapping(value = "/show1")
	public String show1() {
		
		return "Show SSSSS";
	}
	
	@PostMapping(value = "/add")
	//@PreAuthorize("hasAuthority('ROLE_ADMIN','ROLE_USER')")
	public String addUser(@RequestBody User user) {
		
		ser.AddUser(user);
		
		return "user Added";
	}
}
