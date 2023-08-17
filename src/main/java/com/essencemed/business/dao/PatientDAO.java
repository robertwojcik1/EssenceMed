package com.essencemed.business.dao;

import com.essencemed.infrastructure.database.entity.PatientEntity;

import java.util.Optional;

public interface PatientDAO {

    PatientEntity findByUserId(Integer userId);
}
