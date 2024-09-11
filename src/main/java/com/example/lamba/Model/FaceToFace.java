package com.example.lamba.Model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class FaceToFace {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String location;

    private double price;

    @OneToOne
    @JoinColumn(name = "session_id")
    private Session session;
}
