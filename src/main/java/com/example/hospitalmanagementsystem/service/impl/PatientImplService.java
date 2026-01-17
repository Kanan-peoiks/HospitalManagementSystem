package com.example.hospitalmanagementsystem.service.impl;

import com.example.hospitalmanagementsystem.dto.patient.PatientRequestDto;
import com.example.hospitalmanagementsystem.dto.patient.PatientResponseDto;
import com.example.hospitalmanagementsystem.entity.PatientEntity;
import com.example.hospitalmanagementsystem.repository.PatientRepository;
import com.example.hospitalmanagementsystem.service.AppointmentService;
import com.example.hospitalmanagementsystem.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Pageable;



@Service
@RequiredArgsConstructor
public class PatientImplService implements PatientService {

    final private PatientRepository patientRepository;

    @Override
    public PatientResponseDto create(PatientRequestDto patientRequestDto) {
        PatientEntity patientEntity = new PatientEntity();

        // melumatlari yaziriq
        patientEntity.setFullName(patientRequestDto.getFullName());
        patientEntity.setEmail(patientRequestDto.getEmail());
        patientEntity.setPhoneNumber(patientRequestDto.getPhoneNumber());
        //save edirik
        PatientEntity saved = patientRepository.save(patientEntity);


        PatientResponseDto patientResponseDto = new PatientResponseDto();

        //daxil etdiyimiz melumatleri geri verir
        patientResponseDto.setId(saved.getId());
        patientResponseDto.setFullName(saved.getFullName());
        patientResponseDto.setEmail(saved.getEmail());
        patientResponseDto.setPhoneNumber(saved.getPhoneNumber());

        return patientResponseDto;
    }


    //Məqsəd: səhifələnmiş məlumatlar qaytarmaq
    @Override
    public Page<PatientResponseDto> getAll(Pageable pageable) {
        //Entityden melumatlari aliriq
        Page<PatientEntity> patientEntityPage = patientRepository.findAll(pageable);

        return patientEntityPage.map(patientEntity -> {
            PatientResponseDto patientResponseDto = new PatientResponseDto();
            patientResponseDto.setId(patientEntity.getId());
            patientResponseDto.setFullName(patientEntity.getFullName());
            patientResponseDto.setEmail(patientEntity.getEmail());
            patientResponseDto.setPhoneNumber(patientEntity.getPhoneNumber());
            return patientResponseDto;
        });
    }

    @Override
    public PatientResponseDto getById(Long id) {
        return null;
    }

    @Override
    public PatientResponseDto update(Long id, PatientRequestDto patientRequestDto) {
        return null;
    }

    @Override
    public PatientResponseDto deleteById(Long id) {
        return null;
    }

    @Override
    public PatientResponseDto findByName(String name) {
        return null;
    }


}
