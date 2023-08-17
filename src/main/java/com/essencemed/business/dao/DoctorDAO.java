package com.essencemed.business.dao;

import com.essencemed.domain.Appointment;
import com.essencemed.infrastructure.database.entity.DoctorEntity;

import java.util.List;
import java.util.Optional;

public interface DoctorDAO {
    Optional<DoctorEntity> findById(Integer id);
}
