package com.essencemed.domain;

import lombok.Builder;
import lombok.Value;

import java.time.Duration;

@Value
@Builder
public class Specialization {
    Long specializationId;
    String name;
    Duration visitTime;
}
