package it.unimib.campus.swdevcourse.mycrudapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class IntegrityViolationException extends RuntimeException {

	private static final long serialVersionUID = 7517575131063831289L;
	
	public IntegrityViolationException(String error) {
		super("Cannot complete the operation: " + error);
	}

}
