package com.example.hospitalmanagementsystem.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "patients")
@Data
public class PatientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @Size(min = 3, max = 50)
    private String fullName;

    @Email
    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    @NotBlank
    @Pattern(regexp = "^[0-9]{10}$")
    private String phoneNumber;

    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AppointmentEntity> appointments;

}
