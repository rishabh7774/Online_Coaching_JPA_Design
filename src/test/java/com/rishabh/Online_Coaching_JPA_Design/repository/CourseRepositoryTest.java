package com.rishabh.Online_Coaching_JPA_Design.repository;

import com.rishabh.Online_Coaching_JPA_Design.entity.Course;
import com.rishabh.Online_Coaching_JPA_Design.entity.Guardian;
import com.rishabh.Online_Coaching_JPA_Design.entity.Student;
import com.rishabh.Online_Coaching_JPA_Design.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.Modifying;

import javax.transaction.Transactional;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseRepositoryTest {

    @Autowired
    private CourseRepository courseRepository;

    @Test
    public void printCourses(){
        List<Course> courseList = courseRepository.findAll();
        courseList.stream().forEach(System.out::println);
    }

    @Test
    @Transactional
    @Modifying
    public void saveCourseWithTeacher(){
        Teacher teacher = Teacher.builder()
                .firstName("RG")
                .lastName("RG L")
                .build();

        Course course = Course.builder()
                .courseTitle("AWS3")
                .courseCredit("100")
                .teacher(teacher)
                .build();

        Course course1 = Course.builder()
                .courseTitle("AWS4")
                .courseCredit("10")
                .teacher(teacher)
                .build();

        courseRepository.save(course);
        courseRepository.save(course1);

    }

    @Test
    public void deleteCourseByTitle(){
        courseRepository.deleteById(30L);
    }

    @Test
    public void saveCourseWithStudentAndTeacher(){
        Student student = Student.builder()
                .firstName("jk")
                .lastName("JK")
                .emailId("JK@gmail.com")
                .guardian(new Guardian("JKP","JKP@gmail.com","9999"))
                .build();

        Student student2 = Student.builder()
                .firstName("pk")
                .lastName("pK")
                .emailId("pK@gmail.com")
                .guardian(new Guardian("P","P@gmail.com","9999"))
                .build();

        Teacher teacher = Teacher.builder().firstName("Miss").lastName("ROZY").build();
        Course course = Course.builder()
                .courseTitle("IOT")
                .courseCredit("30")
                .teacher(teacher)
                .studentList(List.of(student,student2))
                .build();

        courseRepository.save(course);
    }
}