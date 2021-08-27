package com.s2e.courseservice.controller;

import com.s2e.courseservice.model.Course;
import com.s2e.courseservice.service.CourseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("courses")
@Slf4j
public class CourseController {

    @Autowired
    private CourseService courseService;

    //find all courses
    @GetMapping
    public Collection<Course> getAllCourse(){
        return courseService.findAllCourses();
    }

    //find course by id
    @GetMapping("/{id}")
    Optional<Course> getCourseById(@PathVariable("id") int id){
        return courseService.findCourseById(id);
    }

    //insert a new course
    @PostMapping("/")
    public Course saveCourse(@RequestBody Course course){
        log.info("Inside saveCourse method of CourseController");
        return courseService.saveCourse(course);
    }

}
