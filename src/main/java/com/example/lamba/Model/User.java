package com.example.lamba.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String userName;

    private String password;

    private String email;

    private int age;

    private String role; // TUTOR, STUDENT

    private String educationLevel;

    private Date joiningDate;

    private Boolean isVerified;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Student student;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Tutor tutor;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Profile profile;
}

