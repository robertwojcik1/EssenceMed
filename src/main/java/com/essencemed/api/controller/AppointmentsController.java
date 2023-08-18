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
    private final AppointmentService appointmentService;
    private final PatientService patientService;
    @GetMapping(value = "/appointments")
    public String showPatientAppointments(Model model) throws Exception {
        Integer patientId = patientService.getPatientId();
        List<Appointment> appointmentList = appointmentService.findAppointments(patientId);
            model.addAttribute("appointments", appointmentList);
            return "appointments";
        }

    @PostMapping("/appointments/cancel/{appointmentId}")
    public ResponseEntity<String> cancelAppointment(@PathVariable Integer appointmentId) {
        appointmentService.cancelAppointment(appointmentId);

        return ResponseEntity.ok("Wizyta została anulowana");
    }
}

