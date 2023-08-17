package com.essencemed.infrastructure.database.repository;

import com.essencemed.business.dao.DoctorDAO;
import com.essencemed.infrastructure.database.entity.DoctorEntity;
import com.essencemed.infrastructure.database.repository.jpa.DoctorJpaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@AllArgsConstructor
public class DoctorRepository implements DoctorDAO {

    private final DoctorJpaRepository doctorJpaRepository;

    public String getDoctorCredentials(Integer id) {
        DoctorEntity entity = findById(id).orElse(DoctorEntity.builder().build());
        return entity.getFirstName() + " " + entity.getLastName();
    }

    @Override
    public Optional<DoctorEntity> findById(Integer id) {
        return doctorJpaRepository.findById(id);
    }
}
