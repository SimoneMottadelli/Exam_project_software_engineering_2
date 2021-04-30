package it.unimib.campus.swdevcourse.mycrudapp.model;

import java.io.Serializable;

public class ExamKeys implements Serializable{

	private static final long serialVersionUID = 5461879520282301029L;
	
	private Long student;
    private Long course;
    
    public ExamKeys() {
    	
    }
    
    public ExamKeys(Long student, Long course) {
    	this.student = student;
    	this.course = course;
    }
    
    public Long getStudent() {
    	return student;
    }
    
    public Long getCourse() {
    	return course;
    }
	
}

