package com.studentdetails.globalexception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.studentdetails.customexception.AgeException;


@RestControllerAdvice
public class GlobalExceptionHandler {

		@ExceptionHandler(AgeException.class)
		public ResponseEntity<Object> ageException() {
			return new ResponseEntity<Object>("someone is underage",HttpStatus.BAD_REQUEST);
		}
	}

