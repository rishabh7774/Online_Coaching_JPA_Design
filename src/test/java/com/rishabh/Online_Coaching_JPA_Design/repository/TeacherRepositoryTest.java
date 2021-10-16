package com.rishabh.Online_Coaching_JPA_Design.repository;

import com.rishabh.Online_Coaching_JPA_Design.entity.Course;
import com.rishabh.Online_Coaching_JPA_Design.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TeacherRepositoryTest {

    @Autowired
    private TeacherRepository teacherRepository;

    @Test
    public void saveTeacherWithCourse(){
      /*  Course course = Course.builder()
                .courseTitle("Apple")
                .courseCredit("5")
                .build();
        Course course1 = Course.builder()
                .courseTitle("Ball")
                .courseCredit("10")
                .build();
        Teacher teacher = Teacher.builder()
                .firstName("Teacher 2")
                .lastName("Teacher L2")
                //.courseList(List.of(course,course1))
                .build();
        teacherRepository.save(teacher);*/
    }

}