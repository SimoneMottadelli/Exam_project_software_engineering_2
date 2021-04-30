package it.unimib.campus.swdevcourse.mycrudapp.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Municipality {

	@Id
	@Column(updatable = false, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(updatable = true, nullable = false)
	private String name;
	
	@OneToMany(mappedBy = "birthMunicipality", cascade = CascadeType.ALL)
	private List<Person> people;

	@ManyToOne
	@JoinColumn(referencedColumnName = "id", updatable = true, nullable = true) 
	private Municipality province;
	
	@OneToMany(mappedBy = "province", cascade = CascadeType.ALL)
	private List<Municipality> municipalities; 

	public Municipality() {
	}

	public Municipality(Long id) {
		this.id = id;
	}
	
	public List<Municipality> getMunicipalities() {
		return municipalities;
	}

	public Municipality getProvince() {
		return province;
	}

	public void setProvince(Municipality province) {
		this.province = province;
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
	
	public boolean isProvince() {
		return id.equals(province.id);
	}

}
