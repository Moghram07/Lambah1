package com.example.lamba.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Tutor {

    @Id
    private Integer id; // Same as User ID

    private String major;

    private String subject;

    private double gpa;

    private String phone;

    private String bio;

    private boolean hasRecommendation;

    private String workPermit;

    @OneToOne
    @MapsId
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "tutor")
    private List<Course> courses;

    @OneToMany(mappedBy = "tutor")
    private List<Session> sessions;

    @OneToMany(mappedBy = "tutor")
    private List<Exam> exams;
}

