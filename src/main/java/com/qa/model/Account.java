package com.qa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {

	@Id 
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int account_id;
	@Column (nullable = false, length = 512)
	private String firstname;
	private String surname;
	
	public void setId(int id) {
		this.account_id = id;
	}

	public int getId() {
		return this.account_id;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getFirstname() {
		return this.firstname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getSurname() {
		return this.surname;
	}
}
