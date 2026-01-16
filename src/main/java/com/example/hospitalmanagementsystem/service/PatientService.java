package com.example.hospitalmanagementsystem.service;

import com.example.hospitalmanagementsystem.dto.patient.PatientRequestDto;
import com.example.hospitalmanagementsystem.dto.patient.PatientResponseDto;
import org.springframework.stereotype.Service;


public interface PatientService {

    PatientResponseDto create (PatientRequestDto patientRequestDto);

    PatientResponseDto getById(Long id);

    PatientResponseDto update(Long id,PatientRequestDto patientRequestDto);

    PatientResponseDto deleteById(Long id);

    PatientResponseDto findByName(String name);

}
