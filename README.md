# SpringCrud-Thymeleaf


Para ejecutar el proyecto debes hacerlo con el siguiente comando

mvn spring-boot:run  


Mysql :

create database springdataboot;

CREATE TABLE product(id INT NOT NULL AUTO_INCREMENT,
                     name VARCHAR(35) NULL,
                     price DECIMAL(19,2) NULL,
                     PRIMARY KEY (id));
