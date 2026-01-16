package com.example.hospitalmanagementsystem.repository;

import com.example.hospitalmanagementsystem.dto.patient.PatientResponseDto;
import com.example.hospitalmanagementsystem.entity.PatientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<PatientEntity,Long> {
//
//    @Query("select p From PatientEntity p where p.appointments.patient :patientId")
//    List<PatientEntity> getByPatientIdFromAppointment(@Param("patientId") Long patientId);
//
//

    @Query("select p from PatientEntity p where p.appointments")
    List<PatientEntity> getPatientEntityByIdDoctorId(@Param("patient_id") Long id);
}
