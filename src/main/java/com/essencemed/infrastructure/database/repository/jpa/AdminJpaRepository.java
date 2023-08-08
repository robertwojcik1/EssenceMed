package com.essencemed.infrastructure.database.repository.jpa;

import com.essencemed.infrastructure.database.entity.AdminEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminJpaRepository extends JpaRepository<AdminEntity, Integer> {

}
