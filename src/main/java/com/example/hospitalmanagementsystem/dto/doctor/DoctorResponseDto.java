package com.example.hospitalmanagementsystem.dto.doctor;


import lombok.Data;

@Data
public class DoctorResponseDto {

    private Long id;
    private String doctorFullName;
    private String specialization;
    private boolean available;
}
