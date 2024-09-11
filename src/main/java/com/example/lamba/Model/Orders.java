package com.example.lamba.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Date orderDate;

    private double totalPrice;

    private String status; // PENDING, COMPLETED, CANCELLED

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;  // The student who placed the order

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<OrderItem> orderItems;  // List of products/used items in the order
}

