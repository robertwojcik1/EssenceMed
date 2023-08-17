//package com.essencemed.infrastructure.database.repository.mapper;
//
//import com.essencemed.domain.Appointment;
//import com.essencemed.infrastructure.database.entity.AppointmentEntity;
//import org.mapstruct.Mapper;
//import org.mapstruct.Mapping;
//import org.mapstruct.ReportingPolicy;
//
//@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
//public interface AppointmentEntityMapper {
//    @Mapping(source = "entity.getDoctor().getDoctorId()", target = "doctorId")
//    Appointment mapFromEntity(AppointmentEntity entity);
//}
