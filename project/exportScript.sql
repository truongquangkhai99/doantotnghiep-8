drop table if exists users;
create table users (id INT UNSIGNED not null auto_increment, avatar varchar(8), created_at timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP not null, email varchar(100) not null, email_verified_at timestamp NULL, password varchar(60) not null, remember_token varchar(60), reset_token varchar(60), updated_at timestamp NULL, primary key (id)) engine=InnoDB;
