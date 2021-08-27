package com.s2e.studentservice.service;

import com.s2e.studentservice.model.Student;
import com.s2e.studentservice.repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
@Slf4j
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public Collection<Student> findAllStudents() {
        return studentRepository.findAll();
    }

    public Student saveStudent(Student student) {
        log.info("Inside saveStudent method of StudentService");
        return studentRepository.save(student);
    }

    public Optional<Student> findStudentById(int id) {
        log.info("Inside findStudentById method of StudentService");
        return studentRepository.findById(id);
    }
}
