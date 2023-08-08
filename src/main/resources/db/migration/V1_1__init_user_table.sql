CREATE TABLE users
(
    user_id           SERIAL         NOT NULL,
    email             VARCHAR(64)    NOT NULL,
    password          VARCHAR(80)    NOT NULL,
    UNIQUE (email),
    PRIMARY KEY (user_id)
);