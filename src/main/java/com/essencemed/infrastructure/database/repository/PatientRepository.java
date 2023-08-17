package com.essencemed.infrastructure.database.repository;

import com.essencemed.business.dao.PatientDAO;
import com.essencemed.infrastructure.database.entity.PatientEntity;
import com.essencemed.infrastructure.database.repository.jpa.PatientJpaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@AllArgsConstructor
public class PatientRepository implements PatientDAO {

    private final PatientJpaRepository patientJpaRepository;

    @Override
    public PatientEntity findByUserId(Integer userId) {
        Optional<PatientEntity> entity = patientJpaRepository.findByUserId(userId);
        return entity.orElse(PatientEntity.builder().build());
    }
}
