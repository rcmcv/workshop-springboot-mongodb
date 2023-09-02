package com.robertoviana.workshopmongo.services.exception;

public class ObjectNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public ObjectNotFoundException(String id) {
		super("Objeto não encontrado. Id " + id);
	}

}
