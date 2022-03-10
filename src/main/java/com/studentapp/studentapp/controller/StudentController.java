package com.studentapp.studentapp.controller;
import java.util.Optional;
import com.studentapp.studentapp.entities.Student;
import com.studentapp.studentapp.repositories.StudentRepository;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin()
@RestController()
public class StudentController {
    
    
   private StudentRepository studentRepository;
   

   public StudentController(StudentRepository studentRepository){
       this.studentRepository=studentRepository;
   }

   @GetMapping(value = "/student/{id}")
   public Optional<Student> getStudent (@PathVariable Integer id){
        return studentRepository.findById(id); 
    }

    // @GetMapping(value = "/user/{id}")
    // public Student getUser (@AuthenticationPrincipal OAuth2User principal, @PathVariable Integer id) {
    //     Student student =studentRepository.findById(id).orElse(null);
    //             student.setUserName(principal.getAttribute("login"));
    //         return studentRepository.findById(id).orElse(null);
    // } try https://dimitr.im/bundling-react-spring-boot maven plugin running front and backend
    // on the same port
}