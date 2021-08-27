package com.s2e.studentservice.controller;

import com.s2e.studentservice.model.Student;
import com.s2e.studentservice.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/students")
@Slf4j //cause lombok to generate a logger field
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping()
    public Collection<Student> getAllStudents(){
        return studentService.findAllStudents();
    }

    @PostMapping("/")
    public Student studentService(@RequestBody Student student){// requestbody to save the data in our database
        log.info("Inside saveStudent method of StudentController");
        return studentService.saveStudent(student);
    }

    //find student by id
    @GetMapping("/{id}")
    public Optional<Student> findStudentById(@PathVariable("id") int id){
        log.info("Inside findStudentById method of StudentController");
        return studentService.findStudentById(id);
    }
}
