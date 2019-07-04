-- MySQL Script generated by MySQL Workbench
-- Дс 24 Мау 2019 23:19:21
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mambodb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mambodb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mambodb` DEFAULT CHARACTER SET utf8 ;
USE `mambodb` ;

-- -----------------------------------------------------
-- Table `mambodb`.`admin`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `xixledb`.`Admin` (
  `userId` INT NOT NULL AUTO_INCREMENT,
  `adminName` VARCHAR(32) NOT NULL,
  `email` VARCHAR(32) NOT NULL,
  `password` VARCHAR(32) NOT NULL,
  `loginStatus` VARCHAR(32) NOT NULL,
  PRIMARY KEY (`userId`))
 ENGINE = InnoDB;





SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
