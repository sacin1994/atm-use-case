package com.user.atm.models;

public class GenericResponse<T> {

	private T response;
	private Error error;

	public GenericResponse() {
	}

	public GenericResponse(T response, Error error) {
		this.response = response;
		this.error = error;
	}

	public T getResponse() {
		return response;
	}

	public void setResponse(T response) {
		this.response = response;
	}

	public Error getError() {
		return error;
	}

	public void setError(Error error) {
		this.error = error;
	}

}
