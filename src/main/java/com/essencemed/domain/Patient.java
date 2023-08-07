package com.essencemed.domain;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Patient {
    Long patientId;
    String firstName;
    String lastName;
    String email;
    String phone;
    String password;
}
