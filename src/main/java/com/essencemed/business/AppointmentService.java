package com.essencemed.business;

import com.essencemed.business.dao.AppointmentDAO;
import com.essencemed.domain.Appointment;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@AllArgsConstructor
public class AppointmentService {
    private final AppointmentDAO appointmentDAO;

    @Transactional
    public List<Appointment> findAppointments(Integer patientId) {
        List<Appointment> appointmentList = appointmentDAO.findAppointments(patientId);
        return appointmentList;
    }
    @Transactional
    public void cancelAppointment(Integer appointmentId) {
        appointmentDAO.cancelAppointment(appointmentId);
    }
}
