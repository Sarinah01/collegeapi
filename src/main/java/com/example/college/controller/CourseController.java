package com.example.college.controller; // Update this to match your base package

import com.example.college.model.College;
import com.example.college.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/colleges")
public class CourseController {

    @Autowired
    private CollegeService collegeService;

    /**
     * Endpoint to get a list of all colleges.
     * @return List of colleges
     */
    @GetMapping
    public List<College> getAllColleges() {
        return collegeService.getAllColleges();
    }
}
