package com.essencemed.api.controller;

import com.essencemed.business.AppointmentService;
import com.essencemed.business.PatientService;
import com.essencemed.domain.Appointment;
import lombok.AllArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Objects;

@Controller
@AllArgsConstructor
public class ShowAppointmentsController {

    private final AppointmentService appointmentService;
    private final PatientService patientService;
    @GetMapping(value = "/appointments")
    public String showUserAppointments(Model model) throws Exception {
        String loggedInPatientEmail = patientService.getLoggedInPatientEmail();
        Integer userIdForPatient = patientService.getUserIdByEmail(loggedInPatientEmail);
        Integer patientId = patientService.getPatientId(userIdForPatient);

        List<Appointment> appointmentList = appointmentService.findAppointments(patientId);
            model.addAttribute("appointments", appointmentList);
            return "appointments";
        }
    }

