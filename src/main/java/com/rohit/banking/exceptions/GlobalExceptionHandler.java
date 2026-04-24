package com.rohit.banking.exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

	// AccountException Handler
	@ExceptionHandler(AccountException.class)
	public ResponseEntity<ExceptionDetails> handleAccountException(AccountException exceptionObj,
			WebRequest webRequest) {

		ExceptionDetails exceptionDetails = new ExceptionDetails(LocalDateTime.now(), exceptionObj.getMessage(),
				webRequest.getDescription(false), "ACCOUNT_NOT_FOUND");

		return new ResponseEntity<>(exceptionDetails, HttpStatus.NOT_FOUND);
	}

	// InsufficientBalanceException Handler
	@ExceptionHandler(InsufficientBalanceException.class)
	public ResponseEntity<ExceptionDetails> handleInsufficientBalanceException(
			InsufficientBalanceException exceptionObj, WebRequest webRequest) {

		ExceptionDetails exceptionDetails = new ExceptionDetails(LocalDateTime.now(), exceptionObj.getMessage(),
				webRequest.getDescription(false), "INSUFFICIENT_BALANCE");

		return new ResponseEntity<>(exceptionDetails, HttpStatus.BAD_REQUEST);
	}

	// GenericException Handler
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ExceptionDetails> handleGenericException(Exception exceptionObj, WebRequest webRequest) {

		ExceptionDetails exceptionDetails = new ExceptionDetails(LocalDateTime.now(), exceptionObj.getMessage(),
				webRequest.getDescription(false), "INTERNAL_SERVER_ERROR");

		return new ResponseEntity<ExceptionDetails>(exceptionDetails, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
