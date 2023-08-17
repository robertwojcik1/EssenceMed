package com.essencemed.infrastructure.database.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@EqualsAndHashCode(of = "patientId")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "patient")
public class PatientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "patient_id")
    //private Long patientId;
    private Integer id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "pesel", unique = true)
    private String pesel;
    @Column(name = "phone")
    private String phone;
    @Column(name = "user_id")
    private Long userId;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<AppointmentEntity> appointmentSet;
}
