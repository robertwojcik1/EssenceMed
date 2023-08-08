package com.essencemed.infrastructure.database.repository.jpa;

import com.essencemed.infrastructure.database.entity.SpecializationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecializationJpaRepository extends JpaRepository<SpecializationEntity, Integer> {

}
