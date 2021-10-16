package com.rishabh.Online_Coaching_JPA_Design.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name = "tbl_student",
        uniqueConstraints = @UniqueConstraint(
                name = "emailId_unique",
                columnNames = "email_address"
        )
)
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long studentId;
    private String firstName;
    private String lastName;
    @Column(name = "email_address",
            nullable = false
    )
    private String emailId;
    @Embedded
    private Guardian guardian;
}
