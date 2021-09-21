package com.user.atm;

public class ValidationException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = -9125092193035480579L;
	
	private String errorCode;
	private String errorMessage;
	
	public ValidationException(String errorCode, String errorMessage) {
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}
	
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
}
