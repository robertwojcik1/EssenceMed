package com.essencemed.infrastructure.database.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.OffsetDateTime;

@Getter
@Setter
@EqualsAndHashCode(of = "doctorScheduleId")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "doctor_schedule")
public class DoctorScheduleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "doctor_schedule_id")
    private Long doctorScheduleId;
    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private DoctorEntity doctor;
    @Column(name = "start_hour")
    private LocalTime startHour;
    @Column(name = "end_hour")
    private LocalTime endHour;
    @Column(name = "date")
    private LocalDate date;
}
