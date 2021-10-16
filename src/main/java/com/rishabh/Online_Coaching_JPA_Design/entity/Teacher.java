package com.rishabh.Online_Coaching_JPA_Design.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long teacherId;
    private String firstName;
    private String lastName;
    /*@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(
            name = "teacher_Id",
            referencedColumnName = "teacherId"
    )
    private List<Course> courseList;*/

}
