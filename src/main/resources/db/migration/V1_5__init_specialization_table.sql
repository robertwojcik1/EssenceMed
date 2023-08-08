CREATE TABLE specialization
(
    specialization_id   SERIAL          NOT NULL,
    name                VARCHAR(40)     NOT NULL,
    visit_time          TIME            NOT NULL,
    UNIQUE (name),
    PRIMARY KEY (specialization_id)
);