// src/main/java/com/example/demo/CollegeRepository.java
package com.example.college.repository;

import com.example.college.model.College;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CollegeRepository extends JpaRepository<College, Long> {
}
