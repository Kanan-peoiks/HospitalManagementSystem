package com.example.hospitalmanagementsystem.dto.patient;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PatientRequestDto {

    private String fullName;
    private String email;
    private String phoneNumber;

}
