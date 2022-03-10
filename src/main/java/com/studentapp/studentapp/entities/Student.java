package com.studentapp.studentapp.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;

import lombok.Setter;
import lombok.Getter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student{
    
  //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer studentId;
    private String firstName;
    private String lastName;
    private int age;
    private String userName;
    
    // @Enumerated(EnumType.STRING)
    // private Major major; 

    @ManyToMany
    @JoinTable(
    name = "student_course", 
    joinColumns = @JoinColumn(name = "student_id"), 
    inverseJoinColumns = @JoinColumn(name = "course_id"))
    private Set<Course> courseList= new HashSet(); 
   
    // do you need null values?
    @OneToMany
    private Set<Enrollment> enrollmentList= new HashSet();

}