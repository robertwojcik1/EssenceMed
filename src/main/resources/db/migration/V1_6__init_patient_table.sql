CREATE TABLE patient
(
    patient_id   SERIAL         NOT NULL,
    first_name   VARCHAR(40)    NOT NULL,
    last_name    VARCHAR(40)    NOT NULL,
    pesel        VARCHAR(12)    NOT NULL,
    phone        VARCHAR(20),
    user_id      INT            NOT NULL,
    UNIQUE (pesel),
    PRIMARY KEY (patient_id),
    CONSTRAINT fk_patient_user
        FOREIGN KEY (user_id)
            REFERENCES users (user_id)
);