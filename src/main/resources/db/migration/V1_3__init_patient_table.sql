CREATE TABLE patient
(
    patient_id   SERIAL         NOT NULL,
    first_name   VARCHAR(40)    NOT NULL,
    last_name    VARCHAR(40)    NOT NULL,
    email        VARCHAR(64)    NOT NULL,
    phone        VARCHAR(20),
    password     VARCHAR(256)   NOT NULL,
    UNIQUE (email),
    PRIMARY KEY (patient_id)
);