package it.unimib.campus.swdevcourse.mycrudapp.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -7424647885984063601L;

    public ResourceNotFoundException( String resourceName, String attributeName, Object attributeValue) {
        super(resourceName + " not found with " + attributeName + " : '" + attributeValue +"'");
    }    
    
}
