package it.unimib.campus.swdevcourse.mycrudapp.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.PositiveOrZero;

@Entity
public class Department {

	@Id
	@Column(updatable = false, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(updatable = true, nullable = false)
	private String name;

	@Column(updatable = true, nullable = false)
	@PositiveOrZero
	private Long telephone;
	
	@OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
	List <Professor> professors;
	
	public Department() {}
	
	public Department(Long id) {
		this.id = id;
	}
	
	public List<Professor> getProfessors() {
		return professors;
	}
	
	public Department(String name, Long telephone) {
		this.name = name;
		this.telephone = telephone;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getTelephone() {
		return telephone;
	}

	public void setTelephone(Long telephone) {
		this.telephone = telephone;
	}

}
