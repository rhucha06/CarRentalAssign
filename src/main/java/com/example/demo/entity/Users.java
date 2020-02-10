package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;

@Entity
@Table(name="user")
@Data
public class Users {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long userId;
	private String userName;
	private long userMobile;
	private String userEmail;
	private String userAddress;
	private String userRole;
	
	@Autowired
	private Payment payment;
	
	@Autowired
	private Car car;
	
	public Users(long userId, String userName, long userMobile, String userEmail, String userAddress, String userRole) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userMobile = userMobile;
		this.userEmail = userEmail;
		this.userAddress = userAddress;
		this.userRole = userRole;
	}
	
	
	
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}


	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public long getUserMobile() {
		return userMobile;
	}
	public void setUserMobile(long userMobile) {
		this.userMobile = userMobile;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	@Override
	public String toString() {
		return "Users [userId=" + userId + ", userName=" + userName + ", userMobile=" + userMobile + ", userEmail="
				+ userEmail + ", userAddress=" + userAddress + ", userRole=" + userRole + "]";
	}
	
	

}
