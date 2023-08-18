package com.essencemed.api.controller;

import com.essencemed.business.AppointmentService;
import com.essencemed.business.PatientService;
import com.essencemed.domain.Appointment;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@AllArgsConstructor
public class AppointmentsController {

    private static final String APPOINTMENTS_LIST = "/appointments";
    private static final String CANCEL_APPOINTMENT = "/appointments/cancel/{appointmentId}";
    private final AppointmentService appointmentService;
    private final PatientService patientService;
    @GetMapping(value = APPOINTMENTS_LIST)
    public String showPatientAppointments(Model model) throws Exception {
        Integer patientId = patientService.getPatientId();
        List<Appointment> appointmentList = appointmentService.findAppointments(patientId);
            model.addAttribute("appointments", appointmentList);
            return "appointments";
        }

    @PostMapping(value = CANCEL_APPOINTMENT)
    public ResponseEntity<String> cancelAppointment(@PathVariable Integer appointmentId) {
        appointmentService.cancelAppointment(appointmentId);

        return ResponseEntity.ok("Wizyta została anulowana");
    }
}

