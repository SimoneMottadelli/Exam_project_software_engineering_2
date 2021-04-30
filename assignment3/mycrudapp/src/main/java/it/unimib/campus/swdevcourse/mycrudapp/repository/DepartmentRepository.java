package it.unimib.campus.swdevcourse.mycrudapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.unimib.campus.swdevcourse.mycrudapp.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long>{

}
