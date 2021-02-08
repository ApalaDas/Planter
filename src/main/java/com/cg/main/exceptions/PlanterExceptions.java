package com.cg.main.exceptions;


import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * @author Apala Das
 *
 */
@ControllerAdvice
public class PlanterExceptions extends ResponseEntityExceptionHandler {
/**
 * 
 * @param PlanterNotFoundException ex
 * @param WebRequest request
 * @return ResponseEntity<Error>
 */
	@ExceptionHandler(PlanterNotFoundException.class)
	public ResponseEntity<Error> handleException(PlanterNotFoundException ex,WebRequest request){
		Error error= new Error(ex.getMessage(), LocalDate.now(), request.getDescription(false));
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}
	/**
	 * @param MethodArgumentNotValidException ex
	 * @param HttpHeaders headers
	 * @param HttpStatus status
	 * @param WebRequest request
	 * @return the ResponseEntity<Object>
	 */
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,HttpHeaders headers, HttpStatus status, WebRequest request) {
		Map<String, String> errors = new HashMap<>();
		ex.getBindingResult().getFieldErrors().forEach(error -> errors.put(error.getField(), error.getDefaultMessage()));
		return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
	}

	

}
