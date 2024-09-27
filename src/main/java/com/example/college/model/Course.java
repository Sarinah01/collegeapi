// src/main/java/com/example/demo/Course.java
package com.example.college.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String courseName;
    private double courseFee;
    private int duration; // in months
    private String accommodationType; // AC or Non-AC
    private double accommodationFee;

    @ManyToOne
    @JoinColumn(name = "college_id")
    private College college;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getCourseName() { return courseName; }
    public void setCourseName(String courseName) { this.courseName = courseName; }

    public double getCourseFee() { return courseFee; }
    public void setCourseFee(double courseFee) { this.courseFee = courseFee; }

    public int getDuration() { return duration; }
    public void setDuration(int duration) { this.duration = duration; }

    public String getAccommodationType() { return accommodationType; }
    public void setAccommodationType(String accommodationType) { this.accommodationType = accommodationType; }

    public double getAccommodationFee() { return accommodationFee; }
    public void setAccommodationFee(double accommodationFee) { this.accommodationFee = accommodationFee; }

    public College getCollege() { return college; }
    public void setCollege(College college) { this.college = college; }
}
