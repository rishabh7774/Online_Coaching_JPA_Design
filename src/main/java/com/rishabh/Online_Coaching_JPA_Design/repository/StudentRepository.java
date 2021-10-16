package com.rishabh.Online_Coaching_JPA_Design.repository;

import com.rishabh.Online_Coaching_JPA_Design.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    public List<Student> findByFirstName(String name);
    public List<Student> findByLastName(String name);

    // JPQL Query
    @Query("select s from Student s where s.emailId = ?1")
    Student getStudentByEmailAddress(String emailId);

    // Native Query

    @Query(value = "select * from tbl_student where email_address = ?1",
    nativeQuery = true)
    Student getStudentByEmailAddress1(String emailId);
}
