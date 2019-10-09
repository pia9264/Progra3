-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema SystemAirline
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema SystemAirline
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `SystemAirline` DEFAULT CHARACTER SET utf8 ;
USE `SystemAirline` ;

-- -----------------------------------------------------
-- Table `SystemAirline`.`Vuelo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SystemAirline`.`Vuelo` (
  `id` VARCHAR(4) NOT NULL,
  `origin` VARCHAR(30) NULL,
  `destiny` VARCHAR(30) NULL,
  `date` DATE NULL,
  `dateBack` DATE NULL,
  `quantity` VARCHAR(3) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SystemAirline`.`Persona`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SystemAirline`.`Persona` (
  `user` VARCHAR(15) NOT NULL,
  `pass` VARCHAR(20) NULL,
  `name` VARCHAR(15) NULL,
  `lastName` VARCHAR(20) NULL,
  `email` VARCHAR(30) NULL,
  `dateBirth` DATE NULL,
  `address` VARCHAR(45) NULL,
  `workPhone` VARCHAR(12) NULL,
  `mobile` VARCHAR(12) NULL,
  `Vuelo_id` VARCHAR(4) NOT NULL,
  `isAdmin` VARCHAR(1) NULL,
  PRIMARY KEY (`user`),
  INDEX `fk_Persona_Vuelo1_idx` (`Vuelo_id` ASC) VISIBLE,
  CONSTRAINT `fk_Persona_Vuelo1`
    FOREIGN KEY (`Vuelo_id`)
    REFERENCES `SystemAirline`.`Vuelo` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SystemAirline`.`Ruta`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SystemAirline`.`Ruta` (
  `id` VARCHAR(4) NOT NULL,
  `routeName` VARCHAR(30) NULL,
  `duration` VARCHAR(5) NULL,
  `price` VARCHAR(12) NULL,
  `arrivalTime` TIME NULL,
  `discount` VARCHAR(2) NULL,
  `horario` DATETIME NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SystemAirline`.`Avion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SystemAirline`.`Avion` (
  `id` VARCHAR(10) NOT NULL,
  `age` VARCHAR(4) NULL,
  `model` VARCHAR(10) NULL,
  `trademark` VARCHAR(15) NULL,
  `numberPassengers` VARCHAR(3) NULL,
  `numberRows` VARCHAR(2) NULL,
  `seatsPeRrow` VARCHAR(1) NULL,
  `Ruta_id` VARCHAR(4) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_Avion_Ruta_idx` (`Ruta_id` ASC) VISIBLE,
  CONSTRAINT `fk_Avion_Ruta`
    FOREIGN KEY (`Ruta_id`)
    REFERENCES `SystemAirline`.`Ruta` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
