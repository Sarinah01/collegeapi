package com.example.college.controller; // Update this to match your base package
import java.util.List;
import com.example.college.service.CollegeService; // adjust the package name accordingly


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.college.model.College;

@RestController
@RequestMapping("/api/colleges")
public class CollegeController {

    @Autowired
    private CollegeService collegeService;

   
    @GetMapping
    public List<College> getAllColleges() {
        return collegeService.getAllColleges();
    }
}
