package com.waytosuccess1705.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFound extends RuntimeException {

	public ResourceNotFound(String message) {
		// TODO Auto-generated constructor stub
		super(message);
}
}
