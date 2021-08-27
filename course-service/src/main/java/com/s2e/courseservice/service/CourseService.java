package com.s2e.courseservice.service;

import com.s2e.courseservice.model.Course;
import com.s2e.courseservice.repository.CourseRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
@Slf4j
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;


    public Collection<Course> findAllCourses() {
        log.info("Inside findAllCourseS method of CourseService");
        return courseRepository.findAll();
    }

    public Course saveCourse(Course course) {
        log.info("Inside saveCourse method of CourseService");
        return courseRepository.save(course);
    }

    public Optional<Course> findCourseById(int id) {

        return courseRepository.findById(id);
    }
}
