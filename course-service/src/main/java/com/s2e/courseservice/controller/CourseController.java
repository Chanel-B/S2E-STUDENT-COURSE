package com.s2e.courseservice.controller;

import com.s2e.courseservice.model.Course;
import com.s2e.courseservice.repository.CourseRepository;
import com.s2e.courseservice.service.CourseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("courses")
@Slf4j
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping
    public Collection<Course> getAllCourse(){
        return courseService.findAllCourses();
    }

    @PostMapping("/")
    public Course saveCourse(@RequestBody Course course){
        log.info("Inside saveCourse method of CourseController");
        return courseService.saveCourse(course);
    }

}
