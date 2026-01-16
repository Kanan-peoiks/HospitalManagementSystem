package com.example.hospitalmanagementsystem.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Table(name = "doctors")
@Data
public class DoctorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(min = 3, max = 50)
    private String doctorFullName;

    @NotBlank
    @Size(min = 3, max = 50)
    private String specialization;

    @NotBlank
    @Size(min = 3, max = 50)
    private String available;




}
