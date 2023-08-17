package com.essencemed.infrastructure.database.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@EqualsAndHashCode(of = "doctorId")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "doctor")
public class DoctorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "doctor_id")
    private Integer doctorId;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "pesel", unique = true)
    private String pesel;
    @Column(name = "user_id")
    private Integer userId;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "specialization_id")
    private SpecializationEntity specialization;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<DoctorScheduleEntity> scheduleSet;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<AppointmentEntity> appointmentsSet;

}
