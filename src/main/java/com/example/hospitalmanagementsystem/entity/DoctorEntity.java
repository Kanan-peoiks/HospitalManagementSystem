package com.example.hospitalmanagementsystem.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "doctors")
@Data
public class DoctorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @Size(min = 3, max = 50)
    private String doctorFullName;


    @Column(nullable = false)
    @Size(min = 3, max = 50)
    private String specialization;

    @Column(nullable = false)
    @Size(min = 3, max = 50)
    private String available;

    @OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AppointmentEntity> appointments;
}

