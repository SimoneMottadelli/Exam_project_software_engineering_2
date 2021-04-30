package it.unimib.campus.swdevcourse.mycrudapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class ResourceAlreadyExistsException extends RuntimeException {
	
	private static final long serialVersionUID = -5359855301837308204L;

	public ResourceAlreadyExistsException(String resourceName, String attributeName, Object attributeValue) {
	        super(resourceName + " with " + attributeName + " " + attributeValue +" already exists");
	 }
}
