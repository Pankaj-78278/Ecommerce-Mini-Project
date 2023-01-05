package com.masai.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserLogin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	
	private String name;
	
	private String email;
	
	private String phoneNo;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "UserLogin [userId=" + userId + ", name=" + name + ", email=" + email + ", phoneNo=" + phoneNo + "]";
	}

	public UserLogin(int userId, String name, String email, String phoneNo) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.phoneNo = phoneNo;
	}

	public UserLogin() {
		super();
	}
	
	
	
}