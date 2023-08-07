package com.essencemed.domain;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Doctor {
    Long doctorId;
    String firstName;
    String lastName;
    String email;
    String password;
    Long specializationId;
}
