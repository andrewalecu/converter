DROP USER 'conUser'@'localhost';
create user 'conUser'@'localhost' identified with mysql_native_password;
set old_passwords = 0;
set password for 'conUser'@'localhost' = PASSWORD('conPass');
GRANT ALL on converter.* TO 'conUser'@'localhost'; 

DROP TABLE `converter`.`magazine`;

create table if not exists magazine(
	id INT primary key not null AUTO_INCREMENT,
	volumeNumber int not null,
	yearNumber int not null,
	magNumber int not null,
	releaseDate date
);
