package com.example.hospitalmanagementsystem.dto.appointment;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class AppointmentRequestDto {
    private LocalDate appointmentDate;
    private Long patientId;
    private Long doctorId;
}
