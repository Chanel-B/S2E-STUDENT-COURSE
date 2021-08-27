package com.s2e.courseservice.repository;

import com.s2e.courseservice.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/courses")
public interface CourseRepository extends JpaRepository<Course, Integer> {

}
