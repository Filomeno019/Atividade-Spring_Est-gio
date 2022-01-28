package com.example.apiRest.exception;

public class ObjectNotFoundException extends RuntimeException {
	
	static final long serialVersionUID = 1L;
	
	//Sobrecarga dos construtores
	public ObjectNotFoundException (String message) {
		super(message);
	}
	
	public ObjectNotFoundException (String message, Exception exception) {
		super(message, exception);
	}
	
	public ObjectNotFoundException (Exception exception) {
		super(exception);
	}

}
