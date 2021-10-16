package com.rishabh.Online_Coaching_JPA_Design.entity;

import lombok.*;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = {"course"})
public class CourseMaterial {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long courseMaterialId;
    private String courseMaterialUrl;

    @OneToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            optional = false
    )
    @JoinColumn(
            name = "course_Id",
            referencedColumnName = "courseId"
    )
    private Course course;
}
