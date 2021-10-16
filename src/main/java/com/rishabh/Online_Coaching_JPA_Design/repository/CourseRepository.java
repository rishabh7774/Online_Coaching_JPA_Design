package com.rishabh.Online_Coaching_JPA_Design.repository;

import com.rishabh.Online_Coaching_JPA_Design.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    void deleteAllByCourseTitle(String name);
}
