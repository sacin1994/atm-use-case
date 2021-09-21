package com.user.atm.models;

public class User {

	private String userName;
	private Long accNum;
	private String expiryDate;
	private Integer cvv;
	private Integer pin;

	public User() {
	}

	public User(String userName, Long accNum, String expiryDate, Integer cvv, Integer pin) {
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

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
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
