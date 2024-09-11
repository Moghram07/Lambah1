package com.example.lamba.Model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ZoomMeeting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer meetingId;

    private String url;

    private double price;

    @OneToOne
    @JoinColumn(name = "session_id")
    private Session session;
}
