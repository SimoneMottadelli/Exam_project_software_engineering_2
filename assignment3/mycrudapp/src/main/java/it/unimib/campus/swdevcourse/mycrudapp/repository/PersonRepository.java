package it.unimib.campus.swdevcourse.mycrudapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import it.unimib.campus.swdevcourse.mycrudapp.model.Person;
import it.unimib.campus.swdevcourse.mycrudapp.model.Professor;
import it.unimib.campus.swdevcourse.mycrudapp.model.Student;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
	
	@Query(value = "select s from Person s where s.name = ?1 and s.surname = ?2")
	Iterable<Person> findAllByNameAndSurname(String name, String surname);
	
	@Query(value = "select s from Student s")
	Iterable<Student> findAllStudents();
	
	@Query(value = "select p from Professor p")
	Iterable<Professor> findAllProfessors();
	
}