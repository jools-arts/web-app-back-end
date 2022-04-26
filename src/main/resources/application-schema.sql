USE hobby_web_application;

DROP TABLE IF EXISTS `hobby_web_application`.`dinosaur`;
DROP TABLE IF EXISTS `hobby_web_applicatoin`.`fossil_site`;
DROP TABLE IF EXISTS `hobby_web_application`.`paleotologist`;

CREATE TABLE `hobby_web_application`.`dinosaur` (
	`dinosaur_id` INTEGER NOT NULL AUTO_INCREMENT,
    `species` VARCHAR(50) NOT NULL,
    `diet` VARCHAR(50) NOT NULL, 
    `habitat` VARCHAR(50) NOT NULL,
    `region` VARCHAR(50) NOT NULL, 
    `period` VARCHAR(50) NOT NULL, 
    PRIMARY KEY (`dinosaur_id`)
);

CREATE TABLE `hobby_web_application`.`fossil_site` (
	`fossil_site_id` INTEGER NOT NULL AUTO_INCREMENT,
    `dinosaur_id` INTEGER,
    `name` VARCHAR(50) NOT NULL,
    `city` VARCHAR(50) NOT NULL,
	`country` VARCHAR(50) NOT NULL,
    `continent` VARCHAR(50) NOT NULL,
    PRIMARY KEY (`fossil_site_id`),
    FOREIGN KEY (`dinosaur_id`) REFERENCES `dinosaur` (`dinosaur_id`) ON DELETE SET NULL
);

CREATE TABLE `hobby_web_application`.`paleontologist` (
	`paleontologist_id` INTEGER NOT NULL AUTO_INCREMENT,
    `fossil_site_id` INTEGER,
    `forename` VARCHAR(50) NOT NULL,
    `surname` VARCHAR(50) NOT NULL,
    `username` VARCHAR(50) NOT NULL, 
	`email_address` VARCHAR(50) NOT NULL,
    `specialism` VARCHAR(50) NOT NULL,
    `institution` VARCHAR(50) NOT NULL,
	PRIMARY KEY (`paleontologist_id`),
    FOREIGN KEY (`fossil_site_id`) REFERENCES `fossil_site` (`fossil_site_id`) ON DELETE SET NULL
);