package com.essencemed.domain;

import lombok.Builder;
import lombok.Value;

import java.time.LocalDate;
import java.time.LocalTime;

@Value
@Builder
public class DoctorSchedule {
    Long doctorScheduleId;
    Long doctorId;
    LocalTime startHour;
    LocalTime endHour;
    LocalDate date;
}
