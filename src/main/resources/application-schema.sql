USE hobby_web_application;

drop table if exists dinosaur
drop table if exists paleontologist
create table dinosaur (id integer not null auto_increment, diet varchar(50) not null, habitat varchar(50) not null, period varchar(50) not null, region varchar(50) not null, species varchar(50) not null, paleontologist_id integer, primary key (id)) engine=InnoDB
create table paleontologist (id integer not null auto_increment, email_address varchar(50) not null, forename varchar(50) not null, institution varchar(50) not null, specialism varchar(50) not null, surname varchar(50) not null, username varchar(50) not null, primary key (id)) engine=InnoDB
alter table dinosaur add constraint FKmfg8s4d7dqtrtm6hqop4cflsq foreign key (paleontologist_id) references paleontologist (id)