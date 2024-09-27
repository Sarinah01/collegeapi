package com.example.course.service;

import com.example.course.model.College;
import com.example.course.repository.CollegeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class CollegeServiceTests {

    @InjectMocks
    private CollegeService collegeService; // The service being tested

    @Mock
    private CollegeRepository collegeRepository; // Mocking the repository

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this); // Initialize mocks
    }

    @Test
    public void testGetAllColleges() {
        // Arrange: Prepare the data
        College college1 = new College(1, "College A");
        College college2 = new College(2, "College B");
        List<College> expectedColleges = Arrays.asList(college1, college2);

        // Mock the repository response
        when(collegeRepository.findAll()).thenReturn(expectedColleges);

        // Act: Call the method to be tested
        List<College> actualColleges = collegeService.getAllColleges();

        // Assert: Check the result
        assertEquals(expectedColleges, actualColleges);
    }
}
