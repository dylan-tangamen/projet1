package com.example.ProfileService;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.http.HttpStatus;

@RestControllerAdvice
public class ProfileExceptionController {
	
	@ExceptionHandler(ProfileNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String profileNotFOundHandler(ProfileNotFoundException ex) {
		return ex.getMessage();
	}
	
	@ExceptionHandler(EmailInUseException.class)
	@ResponseStatus(HttpStatus.CONFLICT)
	String emailInUseHandler(EmailInUseException ex) {
		return ex.getMessage();
	}
	

}
