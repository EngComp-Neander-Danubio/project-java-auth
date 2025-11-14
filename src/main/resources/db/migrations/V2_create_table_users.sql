CREATE TABLE users (
    id INT PRIMARY KEY  UNIQUE   not null,
    login TEXT NOT NULL UNIQUE ,
    password TEXT NOT NULL ,
    role TEXT NOT NULL
);