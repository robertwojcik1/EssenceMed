package com.essencemed.business.dao;

import com.essencemed.domain.Appointment;

import java.util.List;

public interface AppointmentDAO {

    List<Appointment> findAppointments(Integer patientId);
    void cancelAppointment(Integer appointmentId);
}
