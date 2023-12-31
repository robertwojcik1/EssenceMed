package com.essencemed.infrastructure.database.repository;

import com.essencemed.business.dao.AppointmentDAO;
import com.essencemed.domain.Appointment;
import com.essencemed.infrastructure.database.entity.AppointmentEntity;
import com.essencemed.infrastructure.database.repository.jpa.AppointmentJpaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Repository
@AllArgsConstructor
public class AppointmentRepository implements AppointmentDAO {

    private final AppointmentJpaRepository appointmentJpaRepository;
    private final DoctorRepository doctorRepository;

    @Override
    public List<Appointment> findAppointments(Integer patientId) {
        List<AppointmentEntity> entityList = appointmentJpaRepository.findAllByPatientId(patientId);
        List<AppointmentEntity> sortedEntityList = entityList.stream()
                .sorted(Comparator.comparing(AppointmentEntity::getDate)
                .thenComparing(AppointmentEntity::getStartTime))
                .collect(Collectors.toList());
        List<Appointment> appointmentList = new ArrayList<>();

        for (AppointmentEntity entity : sortedEntityList) {
            appointmentList.add(Appointment.builder()
                    .appointmentId(entity.getAppointmentId())
                    .date(entity.getDate())
                    .startTime(entity.getStartTime())
                    .endTime(entity.getEndTime())
                    .doctorsCredentials(doctorRepository.getDoctorCredentials(entity.getDoctor().getDoctorId()))
                    .patientId(entity.getPatient().getId())
                    .cancelled(entity.getCancelled())
                    .notes(entity.getNotes())
                    .build());
        }
        return appointmentList;
    }

    @Override
    public void cancelAppointment(Integer appointmentId) {
        appointmentJpaRepository.cancelAppointment(appointmentId);
    }
}
