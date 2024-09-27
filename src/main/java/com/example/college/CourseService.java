// src/main/java/com/example/demo/CourseService.java
package com.example.college;

import com.example.college.model.Course;
import com.example.college.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getCoursesByCollegeId(Long collegeId) {
        return courseRepository.findByCollegeId(collegeId);
    }
}
