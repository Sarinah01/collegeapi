package com.example.college.service; // adjust to your package

import com.example.college.model.College;
import com.example.college.repository.CollegeRepository; // Adjust the package name


import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CollegeService {

    // Assuming you have a repository to interact with your database
    private final CollegeRepository collegeRepository;

    public CollegeService(CollegeRepository collegeRepository) {
        this.collegeRepository = collegeRepository;
    }

    public List<College> getAllColleges() {
        return collegeRepository.findAll(); // This assumes you have a method in your repository
    }
}
