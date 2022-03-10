package com.studentapp.studentapp.repositories;

import com.studentapp.studentapp.entities.Course;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{



}