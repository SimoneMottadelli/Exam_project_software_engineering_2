package it.unimib.campus.swdevcourse.mycrudapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.PositiveOrZero;

@Entity
public class Professor extends Person {

	private static final long serialVersionUID = -7442238965698899811L;

	@Column(updatable = true, nullable = false)
	@PositiveOrZero
	private Double salary;

	@ManyToOne
	@JoinColumn(referencedColumnName = "id", updatable = true, nullable = false)
	private Department department;

	public Professor() {
	}

	public Professor(Double salary, String name, String surname, Municipality birthMunicipality,
			Department department) {
		super(name, surname, birthMunicipality);
		this.salary = salary;
		this.department = department;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Department getDepartment() {
		return department;
	}

}
