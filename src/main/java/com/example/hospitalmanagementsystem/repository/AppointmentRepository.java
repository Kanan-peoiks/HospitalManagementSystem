package com.example.hospitalmanagementsystem.repository;

import com.example.hospitalmanagementsystem.entity.AppointmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppointmentRepository extends JpaRepository<AppointmentEntity,Long> {


    @Query("select p from AppointmentEntity p  where p.patient.id = :patientId")
    List<AppointmentEntity> findByPatientId(@Param("patientId") Long patientId);
}
