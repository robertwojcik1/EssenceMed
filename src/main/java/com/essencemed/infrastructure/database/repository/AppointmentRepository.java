package com.essencemed.infrastructure.database.repository;

import com.essencemed.business.dao.AppointmentDAO;
import com.essencemed.domain.Appointment;
import com.essencemed.infrastructure.database.entity.AppointmentEntity;
import com.essencemed.infrastructure.database.repository.jpa.AppointmentJpaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@AllArgsConstructor
public class AppointmentRepository implements AppointmentDAO {

    private final AppointmentJpaRepository appointmentJpaRepository;
//    private final AppointmentEntityMapper appointmentEntityMapper;

    @Override
    public List<Appointment> findAppointments() {
        List<AppointmentEntity> entityList = appointmentJpaRepository.findAll();
        List<Appointment> appointmentList = new ArrayList<>();

        for (AppointmentEntity entity : entityList) {
            appointmentList.add(Appointment.builder()
                    .date(entity.getDate())
                    .startTime(entity.getStartTime())
                    .endTime(entity.getEndTime())
                    .doctorId(entity.getDoctor().getDoctorId())
                    .patientId(entity.getPatient().getPatientId())
                    .cancelled(entity.getCancelled())
                    .notes(entity.getNotes())
                    .build());
        }
        return appointmentList;
    }
}
