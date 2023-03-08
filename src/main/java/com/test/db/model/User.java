package com.test.db.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;
	private String userName;
	
	private String password;;
	
	private String Roles;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRoles() {
		return Roles;
	}

	public void setRoles(String roles) {
		Roles = roles;
	}

	public User(String userName, String password, String roles) {
		super();
		this.userName = userName;
		this.password = password;
		Roles = roles;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
		

}
