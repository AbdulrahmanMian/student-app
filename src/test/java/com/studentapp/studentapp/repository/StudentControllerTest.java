package com.studentapp.studentapp.repository;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.mockito.Mockito.when;

import java.util.Optional;
import java.util.ArrayList;
import java.util.List;
import com.studentapp.studentapp.entities.Student;
import com.studentapp.studentapp.entities.Course;
import com.studentapp.studentapp.repositories.StudentRepository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.header;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import org.springframework.test.web.servlet.MockMvc;
//is there a better way to test this without the mvc?

@SpringBootTest()
@AutoConfigureMockMvc()
public class StudentControllerTest {
    
    @Autowired
    //how to do this via constructor?
    private MockMvc mockMvc;

    @MockBean
	private StudentRepository mockRepository;

    @MockBean
    private StudentController mockController;


    @BeforeEach
    public  void init() {
        mockController=new StudentController(mockRepository);
        
    }

    
    @Test
    void getstudent() throws Exception{
        Student student = new Student(1, "Hernando", "Dos Santos", 24, null, null, null);
      when(mockRepository.findById(1)).thenReturn(Optional.of(student));
      mockMvc.perform(get("/student/1")
     .contentType(MediaType.APPLICATION_JSON)
     .accept(MediaType.APPLICATION_JSON))
     .andExpect(status().is2xxSuccessful())
     .andExpect(content().contentType(MediaType.APPLICATION_JSON))
     .andExpect(jsonPath("$.age").value(24)); 
    }

    @Test
    void studentNotFound() throws Exception{
     
}
}