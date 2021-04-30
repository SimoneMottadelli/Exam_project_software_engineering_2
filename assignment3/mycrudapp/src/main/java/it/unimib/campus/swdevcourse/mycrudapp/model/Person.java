package it.unimib.campus.swdevcourse.mycrudapp.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Person implements Serializable {

	private static final long serialVersionUID = -664557407036313772L;

	@Id
	@Column(updatable = false, nullable = false)
	@GeneratedValue(generator = "seq")
	@GenericGenerator(name = "seq", strategy = "increment")
	private Long id;

	@Column(updatable = true, nullable = false)
	private String name;

	@Column(updatable = true, nullable = false)
	private String surname;

	@ManyToOne
	@JoinColumn(referencedColumnName = "id", updatable = true, nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Municipality birthMunicipality;

	public Municipality getBirthMunicipality() {
		return birthMunicipality;
	}
	
	public void setBirthMunicipality(Municipality birthMunicipality) {
		this.birthMunicipality = birthMunicipality;
	}

	public Person() {
	}

	public Person(String name, String surname, Municipality birthMunicipality) {
		this.name = name;
		this.surname = surname;
		this.birthMunicipality = birthMunicipality;
	}

	public Person(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Long getId() {
		return id;
	}

}
