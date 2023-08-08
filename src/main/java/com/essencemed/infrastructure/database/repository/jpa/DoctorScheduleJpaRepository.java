package com.essencemed.infrastructure.database.repository.jpa;

import com.essencemed.infrastructure.database.entity.DoctorScheduleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorScheduleJpaRepository extends JpaRepository<DoctorScheduleEntity, Integer> {

}
