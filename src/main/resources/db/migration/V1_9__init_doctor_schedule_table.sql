CREATE TABLE doctor_schedule
(
    doctor_schedule_id   SERIAL  NOT NULL,
    doctor_id            INT     NOT NULL,
    start_hour           TIME    NOT NULL,
    end_hour             TIME    NOT NULL,
    date                 DATE    NOT NULL,
    PRIMARY KEY (doctor_schedule_id),
    CONSTRAINT fk_schedule_doctor
        FOREIGN KEY (doctor_id)
            REFERENCES doctor (doctor_id)
);