// src/main/java/com/example/demo/CourseRepository.java
package com.example.college.repository;

import com.example.college.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {
    List<Course> findByCollegeId(Long collegeId);
}
