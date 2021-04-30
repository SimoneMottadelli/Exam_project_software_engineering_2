package it.unimib.campus.swdevcourse.mycrudapp.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.PositiveOrZero;

@Entity
public class Student extends Person {

	private static final long serialVersionUID = 8684847821211525243L;
	
	@Column(updatable = true, nullable = false)
	@PositiveOrZero
	private Double isee;
	
	@OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
	private List<Exam> exams;
	
	public Student() {}
	
	public List<Exam> getExams() {
		return exams;
	}
	
	public Student(String name, String surname, Double isee, Municipality birthMunicipality) {
		super(name, surname, birthMunicipality);
		this.isee = isee;
	}

	public Student(Long studentId) {
		super(studentId);
	}

	public Double getIsee() {
		return isee;
	}

	public void setIsee(Double isee) {
		this.isee = isee;
	}
	
}
