package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class nameRecords {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "firstname",nullable = false)
	private String firstname;
	@Column(name = "lastname",nullable = false)
	private String lastname;
	//空建構子
	public nameRecords() {
		
	}
	public nameRecords(Integer id,String firstname,String lastname) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
	}
	  public void updateNameRecord(String newFirstName, String newLastName) {
	        this.firstname = newFirstName;
	        this.lastname = newLastName;
	    }
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	@Override
	public String toString() {
		return "nameRecords [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + "]";
	}
	
}
