package com.essencemed.domain;

import lombok.Builder;
import lombok.Value;

import java.time.LocalDate;
import java.time.LocalTime;

@Value
@Builder
public class Appointment {
    Long id;
    LocalDate date;
    LocalTime startTime;
    LocalTime endTime;
    Long doctorId;
    Long patientId;
    Boolean cancelled;
    String notes;
}
