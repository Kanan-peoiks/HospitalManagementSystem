package com.example.hospitalmanagementsystem.dto.appointment;


import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class AppointmentResponseDto {

    private Long id;
    private LocalDate appointmentDate;

    private Long patientId;
    private String patientName;

    private Long doctorId;
    private String doctorName;
}
