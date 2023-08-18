package com.essencemed.infrastructure.database.repository.jpa;

import com.essencemed.infrastructure.database.entity.AppointmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppointmentJpaRepository extends JpaRepository<AppointmentEntity, Integer> {

    List<AppointmentEntity> findAllByPatientId(Integer patientId);

    @Query(value = """
            UPDATE appointment
            SET cancelled = true 
            WHERE appointment_id = :appointmentId
            """,
            nativeQuery = true)
    @Modifying(clearAutomatically = true)
    void cancelAppointment(final @Param("appointmentId")Integer appointmentId);
}
