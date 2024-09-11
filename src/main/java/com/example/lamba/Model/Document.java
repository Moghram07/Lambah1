package com.example.lamba.Model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String content;

    private double price;

    @OneToOne
    @JoinColumn(name = "session_id")
    private Session session;
}
