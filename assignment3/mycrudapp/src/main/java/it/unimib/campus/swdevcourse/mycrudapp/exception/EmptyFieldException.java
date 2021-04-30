package it.unimib.campus.swdevcourse.mycrudapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class EmptyFieldException extends RuntimeException {
	
	private static final long serialVersionUID = -503656646033925166L;

	public EmptyFieldException(String fields) {
        super("The request body must contain non-emptry fields: " + fields);
    }

}
