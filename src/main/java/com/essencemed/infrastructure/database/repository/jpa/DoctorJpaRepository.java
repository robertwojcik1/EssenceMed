package com.essencemed.infrastructure.database.repository.jpa;

import com.essencemed.infrastructure.database.entity.DoctorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorJpaRepository extends JpaRepository<DoctorEntity, Integer> {

}
