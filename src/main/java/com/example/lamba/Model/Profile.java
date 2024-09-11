package com.example.lamba.Model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String gender;

    private String bio;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
}

