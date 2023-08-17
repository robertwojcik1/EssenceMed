package com.essencemed.api.controller;

import com.essencemed.business.AppointmentService;
import com.essencemed.domain.Appointment;
import lombok.AllArgsConstructor;
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
    @GetMapping(value = "/appointments")
    public String showUserAppointments(Model model) {
        List<Appointment> appointmentList = appointmentService.findAppointments();
        model.addAttribute("appointments", appointmentList);
        return "appointments";
    }
}
