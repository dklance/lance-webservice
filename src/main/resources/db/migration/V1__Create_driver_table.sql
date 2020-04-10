create table Driver (
	ID INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	Name VARCHAR(50) NOT NULL,
	Description TEXT NULL,
	Class VARCHAR(200) NOT NULL
) ENGINE = InnoDB;

INSERT INTO Driver (Name, Description, Class) VALUES ('MariaDB', 'The MariaDB default driver class', 'org.mariadb.jdbc.Driver');