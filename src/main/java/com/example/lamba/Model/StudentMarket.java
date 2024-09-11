package com.example.lamba.Model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class StudentMarket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String description;

    private double price;

    private String category; // Example: Books, Notes, Tools, etc.

    private boolean isUsed;

    @ManyToOne
    @JoinColumn(name = "seller_id")
    private Student seller;  // The student who sells the product

    @ManyToOne
    @JoinColumn(name = "buyer_id")
    private Student buyer;  // The student who buys the product (null if not sold)
}

