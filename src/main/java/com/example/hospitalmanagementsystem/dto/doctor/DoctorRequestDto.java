package com.example.hospitalmanagementsystem.dto.doctor;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DoctorRequestDto {

    private String doctorFullName;
    private String specialization;
    private boolean available;
}
