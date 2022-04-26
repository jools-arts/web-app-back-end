USE hobby_web_application;

DROP TABLE IF EXISTS `hobby_web_application`.`paleotologist`;
DROP TABLE IF EXISTS `hobby_web_application`.`dinosaur`;

CREATE TABLE `paleontologist` (
	`id` INTEGER NOT NULL AUTO_INCREMENT, 
	`email_address` VARCHAR(50) NOT NULL, 
	`forename` VARCHAR(50) NOT NULL, 
	`institution` VARCHAR(50) NOT NULL, 
	`specialism` VARCHAR(50) NOT NULL, 
	`surname` VARCHAR(50) NOT NULL, 
	`username` VARCHAR(50) NOT NULL, 
	PRIMARY KEY (id)
);

CREATE TABLE `hobby_web_application`.`dinosaur` (
	`id` integer not null auto_increment, 
    `diet` varchar(50) not null, 
    `habitat` varchar(50) not null, 
    `period` varchar(50) not null, 
    `region` varchar(50) not null, 
    `species` varchar(50) not null, paleontologist_id integer, 
    PRIMARY KEY (id)
);

alter table dinosaur add constraint FKmfg8s4d7dqtrtm6hqop4cflsq foreign key (paleontologist_id) references paleontologist (id)