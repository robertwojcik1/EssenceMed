package com.essencemed.domain;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Admin {

    Long adminId;
    String firstName;
    String lastName;
    String pesel;
    Long userId;
}
