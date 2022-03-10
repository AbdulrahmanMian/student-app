package com.studentapp.studentapp.repositories;

import com.studentapp.studentapp.entities.Enrollment;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {
    
}
