package com.rishabh.Online_Coaching_JPA_Design;

import com.rishabh.Online_Coaching_JPA_Design.entity.Guardian;
import com.rishabh.Online_Coaching_JPA_Design.entity.Student;
import com.rishabh.Online_Coaching_JPA_Design.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class StudentRepositoryTest {
    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saveStudent() {
        /*Student student = Student.builder()
                .emailId("student3@gmail.com")
                .firstName("student")
                .lastName("3")
                .guardianName("parent 3")
                .guardianMobile("parent mobile 3")
                .guardianEmail("parent email 3")
                .build();
        studentRepository.save(student);*/
    }

    @Test
    public void saveStudentWithGuardian() {
        Student student = Student.builder()
                .firstName("student 4")
                .lastName("4")
                .emailId("student4@gmail.com")
                .guardian(new Guardian("parent 4", "parent Email 4", "parent mobile 4"))
                .build();

        studentRepository.save(student);
    }

    @Test
    public void getStudents() {
        List<Student> studentList = studentRepository.findAll();
        studentList.stream().forEach(student -> System.out.println(student));
    }

    @Test
    public void getStudentByFirstName() {
        Student s1 = studentRepository.getStudentByEmailAddress1("student4@gmail.com");
        System.out.println(s1);
    }

}
