package com.worldbank.atm.models;

import java.util.Date;

public class User {

	private String userName;
	private Long accNum;
	private Date expiryDate;
	private Integer cvv;
	private Integer pin;

	public User() {
	}

	public User(String userName, Long accNum, Date expiryDate, Integer cvv, Integer pin) {
		super();
		this.userName = userName;
		this.accNum = accNum;
		this.expiryDate = expiryDate;
		this.cvv = cvv;
		this.pin = pin;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Long getAccNum() {
		return accNum;
	}

	public void setAccNum(Long accNum) {
		this.accNum = accNum;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public Integer getCvv() {
		return cvv;
	}

	public void setCvv(Integer cvv) {
		this.cvv = cvv;
	}

	public Integer getPin() {
		return pin;
	}

	public void setPin(Integer pin) {
		this.pin = pin;
	}

}
