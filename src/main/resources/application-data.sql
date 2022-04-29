USE  hobby_web_applicaton;

INSERT INTO `hobby_web_application`.`dinosaur` (`species`, `diet`, `habitat`, `region`, `period`) VALUES ('Tyrannosaurus Rex', 'Carnivore', 'Coastal swamps and open forests', 'North America and Asia', 'Cretaceous');
INSERT INTO `hobby_web_application`.`dinosaur` (`species`, `diet`, `habitat`, `region`, `period`) VALUES ('Triceratops', 'Herbivore', 'Forests', 'North America and Canada', 'Cretaceous');
INSERT INTO `hobby_web_application`.`dinosaur` (`species`, `diet`, `habitat`, `region`, `period`) VALUES ('Stegosaurus', 'Herbivore', 'Flat floodplains and savannas', 'North America', 'Jurassic');
INSERT INTO `hobby_web_application`.`dinosaur` (`species`, `diet`, `habitat`, `region`, `period`) VALUES ('Velociraptor', 'Carnivore', 'Dry and arid plains', 'Mongolia and China', 'Cretaceous');
INSERT INTO `hobby_web_application`.`dinosaur` (`species`, `diet`, `habitat`, `region`, `period`) VALUES ('Spinosaurus', 'Carnivore', 'Coastal swamps', 'North Africa', 'Cretaceous');

INSERT INTO `hobby_web_application`.`fossil_site` (`name`, `city`, `country`, `continent`) VALUES ('Pine Hills', 'San Francisco', 'The United States of America', 'North America');
INSERT INTO `hobby_web_application`.`fossil_site` (`name`, `city`, `country`, `continent`) VALUES ('Highland Streams', 'Helena', 'The United States of America', 'North America');
INSERT INTO `hobby_web_application`.`fossil_site` (`name`, `city`, `country`, `continent`) VALUES ('Forest Grove', 'Berlin', 'Germany', 'Europe');
INSERT INTO `hobby_web_application`.`fossil_site` (`name`, `city`, `country`, `continent`) VALUES ('Sunset Park', 'Beijing', 'China', 'Asia');
INSERT INTO `hobby_web_application`.`fossil_site` (`name`, `city`, `country`, `continent`) VALUES ('Volcano Island', 'Antananarivo', 'Madagascar', 'Africa');

INSERT INTO `hobby_web_application`.`paleontolgist`(`forename`, `surname`, `username`, `email_address`, `specialism`, `institution`) VALUES ('Richard', 'Martin', 'richardmartin', 'richard.martin@mail.com', 'Marine dinosaurs');
INSERT INTO `hobby_web_application`.`paleontolgist`(`forename`, `surname`, `username`, `email_address`, `specialism`, `institution`) VALUES ('Amy', 'Smith', 'amysmith', 'amy.smith@mail.com', 'Amphibious dinosaurs');
INSERT INTO `hobby_web_application`.`paleontolgist`(`forename`, `surname`, `username`, `email_address`, `specialism`, `institution`) VALUES ('Charlotte', 'Pike', 'charlottepike', 'charlotte.pike@mail.com', 'Carnivorous dinosaurs');
INSERT INTO `hobby_web_application`.`paleontolgist`(`forename`, `surname`, `username`, `email_address`, `specialism`, `institution`) VALUES ('Neil', 'Grant', 'neilgrant', 'neil.grant@mail.com', 'Herbivorous dinosaurs');
INSERT INTO `hobby_web_application`.`paleontolgist`(`forename`, `surname`, `username`, `email_address`, `specialism`, `institution`) VALUES ('Alan', 'Spencer', 'alanspencer', 'alan.spencer@mail.com', 'Prehistoric birds');