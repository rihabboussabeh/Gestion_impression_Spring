package com.plateform.impression.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ObjetIntrouvableException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3889818753639113932L;

	public ObjetIntrouvableException(String s) {
		super(s);
	}
}
