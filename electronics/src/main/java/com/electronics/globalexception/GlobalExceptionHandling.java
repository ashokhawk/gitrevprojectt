package com.electronics.globalexception;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.electronics.exception.IdNotFound;
import com.electronics.exception.lowPriceException;

@RestControllerAdvice
public class GlobalExceptionHandling {

	@ExceptionHandler(lowPriceException.class)
	public ResponseEntity<Object>lowPriceHandle() {
		return new ResponseEntity<Object>("Its an exception",HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<Object> handleNoSuchElementException() {
		return new ResponseEntity<Object>("no element",HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(IdNotFound.class)
	public ResponseEntity<Object> handleIdNotFound() {
		return new ResponseEntity<Object>("id not found",HttpStatus.BAD_REQUEST);
	}
	
}
