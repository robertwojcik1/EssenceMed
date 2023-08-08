CREATE TABLE doctor
(
    doctor_id           SERIAL          NOT NULL,
    first_name          VARCHAR(40)     NOT NULL,
    last_name           VARCHAR(40)     NOT NULL,
    pesel               VARCHAR(12)     NOT NULL,
    user_id             INT             NOT NULL,
    specialization_id   INT             NOT NULL,
    UNIQUE (pesel),
    PRIMARY KEY (doctor_id),
    CONSTRAINT fk_doctor_specialization
        FOREIGN KEY (specialization_id)
            REFERENCES specialization (specialization_id),
    CONSTRAINT fk_doctor_user
        FOREIGN KEY (user_id)
            REFERENCES users (user_id)
);