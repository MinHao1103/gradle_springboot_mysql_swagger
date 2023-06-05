CREATE TABLE IF NOT EXISTS users
(
    userId             INT           NOT NULL PRIMARY KEY AUTO_INCREMENT,
    email              VARCHAR(256)  NOT NULL UNIQUE,
    password           VARCHAR(256)  NOT NULL,
    createdDate        TIMESTAMP     NOT NULL,
    lastModifiedDate   TIMESTAMP     NOT NULL
);
