package com.example.hospitalmanagementsystem.dto.patient;


import lombok.Data;

@Data
public class PatientResponseDto {
    private String id;
    private String fullName;
    private String email;
    private String phoneNumber;

}
