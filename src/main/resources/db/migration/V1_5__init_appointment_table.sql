CREATE TABLE appointment
(
    appointment_id  SERIAL  NOT NULL,
    date            DATE    NOT NULL,
    start_time      TIME    NOT NULL,
    end_time        TIME    NOT NULL,
    doctor_id       INT     NOT NULL,
    patient_id      INT     NOT NULL,
    cancelled       BOOLEAN,
    notes           VARCHAR(1000),
    PRIMARY KEY (appointment_id),
    CONSTRAINT fk_appointment_doctor
        FOREIGN KEY (doctor_id)
            REFERENCES doctor (doctor_id),
    CONSTRAINT fk_appointment_patient
        FOREIGN KEY (patient_id)
            REFERENCES patient (patient_id)
);