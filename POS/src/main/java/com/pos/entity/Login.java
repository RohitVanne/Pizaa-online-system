package com.pos.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Login {
	
	@Id
	@GeneratedValue
	private int loginId;
	
	private String email;
	private String password;
	private String role;
	@OneToOne(mappedBy="login")
	private Customer customer;
	public int getLoginId() {
		return loginId;
	}




	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}




	public String getRole() {
		return role;
	}




	public void setRole(String role) {
		this.role = role;
	}




	public Customer getCustomer() {
		return customer;
	}




	public void setCustomer(Customer customer) {
		this.customer = customer;
	}




	@Override
	public String toString() {
		return "Login [loginId=" + loginId + ", email=" + email + ", password=" + password + ", role=" + role
				+ ", customer=" + customer + "]";
	}




	// OneToOne - bidirectional
	
}