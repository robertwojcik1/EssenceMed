CREATE TABLE admin
(
    admin_id          SERIAL         NOT NULL,
    email             VARCHAR(64)    NOT NULL,
    password          VARCHAR(256)   NOT NULL,
    UNIQUE (email),
    PRIMARY KEY (admin_id)
);