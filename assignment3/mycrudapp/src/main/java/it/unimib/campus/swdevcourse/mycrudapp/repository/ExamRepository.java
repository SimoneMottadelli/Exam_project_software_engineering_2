package it.unimib.campus.swdevcourse.mycrudapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import it.unimib.campus.swdevcourse.mycrudapp.model.Exam;
import it.unimib.campus.swdevcourse.mycrudapp.model.ExamKeys;

public interface ExamRepository extends JpaRepository<Exam, ExamKeys> {
	@Query(nativeQuery = true, value = "select course_id, student_id, evaluation from exam e where e.student_id = ?1")
	Iterable<Exam> findAllByUserID(Long studentID);
	
	@Query(nativeQuery = true, value = "select course_id, student_id, evaluation from exam e where e.course_id = ?1")
	Iterable<Exam> findAllByCourseID(Long courseID);
}
