package com.essencemed.infrastructure.database.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@EqualsAndHashCode(of = "appointmentId")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "appointment")
public class AppointmentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "appointment_id")
    private Integer appointmentId;
    @Column(name = "date")
    private LocalDate date;
    @Column(name = "start_time")
    private LocalTime startTime;
    @Column(name = "end_time")
    private LocalTime endTime;
    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private DoctorEntity doctor;
    @ManyToOne
    @JoinColumn(name = "patient_id")
    private PatientEntity patient;
    @Column(name = "cancelled")
    private Boolean cancelled;
    @Column(name = "notes")
    private String notes;
}
