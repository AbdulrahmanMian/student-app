package com.studentapp.studentapp.entities;

import javax.persistence.*;

@Entity
public class Enrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long enrollmentId;
    private String teacherFirstName;
    private String teacherLastName;
    @ManyToOne
    private Course course;
    @ManyToOne
    private Student student;
}
