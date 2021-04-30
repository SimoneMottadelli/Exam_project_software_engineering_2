package it.unimib.campus.swdevcourse.mycrudapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.unimib.campus.swdevcourse.mycrudapp.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
