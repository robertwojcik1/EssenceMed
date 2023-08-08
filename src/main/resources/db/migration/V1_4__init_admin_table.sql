CREATE TABLE admin
(
    admin_id          SERIAL         NOT NULL,
    first_name        VARCHAR(40)    NOT NULL,
    last_name         VARCHAR(40)    NOT NULL,
    pesel             VARCHAR(12)    NOT NULL,
    user_id           INT            NOT NULL,
    UNIQUE (pesel),
    PRIMARY KEY (admin_id),
    CONSTRAINT fk_admin_user
        FOREIGN KEY (user_id)
            REFERENCES users (user_id)
);