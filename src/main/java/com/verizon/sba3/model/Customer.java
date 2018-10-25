package com.verizon.sba3.model;

import java.sql.Date;

public class Customer {

	private int cid;
	private String customerName;
	private Date dateOfJoining;
	private String city;
	private String contactNumber;
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int cid, String customerName, Date dateOfJoining, String city, String contactNumber) {
		super();
		this.cid = cid;
		this.customerName = customerName;
		this.dateOfJoining = dateOfJoining;
		this.city = city;
		this.contactNumber = contactNumber;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public Date getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	
}
