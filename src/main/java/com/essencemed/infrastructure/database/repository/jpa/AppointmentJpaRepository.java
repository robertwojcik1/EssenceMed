package com.essencemed.infrastructure.database.repository.jpa;

import com.essencemed.infrastructure.database.entity.AppointmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppointmentJpaRepository extends JpaRepository<AppointmentEntity, Integer> {

    List<AppointmentEntity> findAllByPatientId(Integer patientId);
}
