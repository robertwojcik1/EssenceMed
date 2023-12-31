package com.essencemed.domain;

import lombok.Builder;
import lombok.Value;

import java.time.LocalDate;
import java.time.LocalTime;

@Value
@Builder
public class Appointment {
    Integer appointmentId;
    LocalDate date;
    LocalTime startTime;
    LocalTime endTime;
    String doctorsCredentials;
    Integer patientId;
    Boolean cancelled;
    String notes;
}
