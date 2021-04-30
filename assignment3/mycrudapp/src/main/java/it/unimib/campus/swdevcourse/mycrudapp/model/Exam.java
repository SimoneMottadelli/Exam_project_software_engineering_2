package it.unimib.campus.swdevcourse.mycrudapp.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Positive;

@Entity
@IdClass(ExamKeys.class)
public class Exam implements Serializable {

	private static final long serialVersionUID = -223978826036788989L;

	@Id
	@ManyToOne
	@JoinColumn
	private Student student;

	@Id
	@ManyToOne
	@JoinColumn
	private Course course;

	@Column(nullable = false)
	@Positive
	private Byte evaluation;

	public Exam() {
	}

	public Exam(Student student, Course course, Byte evaluation) {
		this.student = student;
		this.course = course;
		this.evaluation = evaluation;
	}
	
	public void setEvaluation(Byte evaluation) {
		this.evaluation = evaluation;
	}

	public Student getStudent() {
		return student;
	}

	public Course getCourse() {
		return course;
	}

	public Byte getEvaluation() {
		return evaluation;
	}

}
