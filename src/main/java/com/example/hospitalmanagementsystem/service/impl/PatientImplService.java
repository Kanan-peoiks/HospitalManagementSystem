package com.example.hospitalmanagementsystem.service.impl;

import com.example.hospitalmanagementsystem.dto.patient.PatientRequestDto;
import com.example.hospitalmanagementsystem.entity.PatientEntity;
import com.example.hospitalmanagementsystem.repository.PatientRepository;
import com.example.hospitalmanagementsystem.service.AppointmentService;
import com.example.hospitalmanagementsystem.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
class PatientImplService implements PatientService {
    private final PatientService patientService;

    public PatientRequestDto createPatient(PatientRequestDto patientRequestDto) {
        PatientEntity patient = new PatientEntity();
        patient.setFullName(patientRequestDto.getFullName());
        patient.setEmail(patientRequestDto.getEmail());
        patient.setPhoneNumber(patientRequestDto.getPhoneNumber());

        PatientEntity savedPatient = PatientRepository.save(patient);
        return mapToResponseDto(savedPatient);
    }




}
