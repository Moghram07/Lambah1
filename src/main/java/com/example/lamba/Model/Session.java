package com.example.lamba.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private double duration;

    private Date date;

    private String type; // ZOOM, FACE_TO_FACE, VIDEO, DOCUMENT

    private int maxParticipants;

    private double price;

    @ManyToOne
    @JoinColumn(name = "tutor_id")
    private Tutor tutor;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    @OneToMany(mappedBy = "session")
    private List<Review> reviews;

    @OneToOne(mappedBy = "session", cascade = CascadeType.ALL)
    private ZoomMeeting zoomMeeting;

    @OneToOne(mappedBy = "session", cascade = CascadeType.ALL)
    private FaceToFace faceToFace;

    @OneToOne(mappedBy = "session", cascade = CascadeType.ALL)
    private Video video;

    @OneToOne(mappedBy = "session", cascade = CascadeType.ALL)
    private Document document;
}

