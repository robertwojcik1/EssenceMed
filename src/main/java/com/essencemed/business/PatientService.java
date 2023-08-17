package com.essencemed.business;

import com.essencemed.business.dao.PatientDAO;
import com.essencemed.infrastructure.database.entity.PatientEntity;
import com.essencemed.infrastructure.security.UserEntity;
import com.essencemed.infrastructure.security.UserRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class PatientService {

    private final UserRepository userRepository;
    private final PatientDAO patientDAO;


    public String getLoggedInPatientEmail() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Object principal = authentication.getPrincipal();
        UserDetails userDetails = (UserDetails) principal;

        return userDetails.getUsername();
    }

    public Integer getUserIdByEmail(String email) {
        UserEntity entity = userRepository.findByEmail(email);
        return entity.getId();
    }

    public Integer getPatientId(Integer userId) {
        PatientEntity entity = patientDAO.findByUserId(userId);
        return Math.toIntExact(entity.getId());
    }
}
