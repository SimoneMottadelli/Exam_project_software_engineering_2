package it.unimib.campus.swdevcourse.mycrudapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class DomainConstraintViolationException extends RuntimeException {

	private static final long serialVersionUID = 1938013967093611758L;
	
	public DomainConstraintViolationException(String field, String constraint) {
		super("The field " + field + " must be " + constraint);
	}

}
