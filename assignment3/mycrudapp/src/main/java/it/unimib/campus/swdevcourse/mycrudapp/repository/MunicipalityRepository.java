package it.unimib.campus.swdevcourse.mycrudapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import it.unimib.campus.swdevcourse.mycrudapp.model.Municipality;

public interface MunicipalityRepository extends JpaRepository<Municipality, Long> {
	
	@Query(value = "select m from Municipality m where m.name = ?1")
	Iterable<Municipality> findAllByName(String name);
}
