package com.rishabh.Online_Coaching_JPA_Design.repository;

import com.rishabh.Online_Coaching_JPA_Design.entity.Course;
import com.rishabh.Online_Coaching_JPA_Design.entity.CourseMaterial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseMaterialRepositoryTest {
    @Autowired
    private CourseMaterialRepository courseMaterialRepository;

    @Test
    public void saveCourseMaterialWithCourse() {
        Course course = Course.builder().courseTitle(".net").courseCredit("1").build();

        CourseMaterial courseMaterial = CourseMaterial.builder()
                .courseMaterialUrl("www.daily.com")
                .course(course)
                .build();

        courseMaterialRepository.save(courseMaterial);
    }

    @Test
    public void printAllCourseMaterials() {
       courseMaterialRepository.findAll().stream().forEach(System.out::println);
    }
}