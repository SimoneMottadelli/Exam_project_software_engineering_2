package it.unimib.campus.swdevcourse.mycrudapp.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Course {

	@Id
	@Column(updatable = false, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(updatable = true, nullable = false)
	private String name;

	@OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
	private List<Exam> exams;

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Course() {
	}

	public Course(Long id) {
		this.id = id;
	}
	
	public Course(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
