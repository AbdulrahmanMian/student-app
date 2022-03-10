package com.studentapp.studentapp.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;


@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courseId;
    private String courseName;
    private int length;
    
    // @Enumerated(EnumType.STRING)
    // private Major major;

    @ManyToMany
    private Set<Student> studentList= new HashSet(); 
    @OneToMany
    private Set<Enrollment> enrollmentList= new HashSet();

} 
