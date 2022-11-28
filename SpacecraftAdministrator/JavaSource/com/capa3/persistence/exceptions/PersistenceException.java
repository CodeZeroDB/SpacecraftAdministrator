package com.capa3.persistence.exceptions;

public class PersistenceException extends Exception{

	private static final long serialVersionUID = 1L;

	public PersistenceException(String s,Throwable t) {
		super(s,t);
	}

	public PersistenceException(String s) {
		super(s);
	}

}
