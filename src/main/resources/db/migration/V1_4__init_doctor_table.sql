CREATE TABLE doctor
(
    doctor_id           SERIAL          NOT NULL,
    first_name          VARCHAR(40)     NOT NULL,
    last_name           VARCHAR(40)     NOT NULL,
    email               VARCHAR(64)     NOT NULL,
    password            VARCHAR(256)    NOT NULL,
    specialization_id   INT             NOT NULL,
    UNIQUE (email),
    PRIMARY KEY (doctor_id),
    CONSTRAINT fk_doctor_specialization
        FOREIGN KEY (specialization_id)
            REFERENCES specialization (specialization_id)
);