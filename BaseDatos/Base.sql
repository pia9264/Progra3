-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema SystemAir
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema SystemAir
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `SystemAir` DEFAULT CHARACTER SET utf8 ;
USE `SystemAir` ;

-- -----------------------------------------------------
-- Table `SystemAir`.`Pais`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SystemAir`.`Pais` (
  `id` VARCHAR(2) NOT NULL,
  `name` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
MAX_ROWS = 250
MIN_ROWS = 1;


-- -----------------------------------------------------
-- Table `SystemAir`.`Ciudad`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SystemAir`.`Ciudad` (
  `id` VARCHAR(6) NOT NULL,
  `Pais_id` VARCHAR(6) NOT NULL,
  `name` VARCHAR(45) NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_Cuiudad_Pais1_idx` (`Pais_id` ASC) VISIBLE,
  CONSTRAINT `fk_Cuiudad_Pais1`
    FOREIGN KEY (`Pais_id`)
    REFERENCES `SystemAir`.`Pais` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SystemAir`.`Ruta`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SystemAir`.`Ruta` (
  `id` VARCHAR(15) NOT NULL,
  `name` VARCHAR(45) NULL,
  `duration` VARCHAR(45) NULL,
  `origin_id` VARCHAR(6) NOT NULL,
  `destiny_id` VARCHAR(6) NOT NULL,
  `escale_id` VARCHAR(6) NOT NULL,
  `price` VARCHAR(45) NULL,
  `discount` VARCHAR(2) NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_Ruta_Ciudad1_idx` (`origin_id` ASC) VISIBLE,
  INDEX `fk_Ruta_Ciudad2_idx` (`destiny_id` ASC) VISIBLE,
  INDEX `fk_Ruta_Ciudad3_idx` (`escale_id` ASC) VISIBLE,
  CONSTRAINT `fk_Ruta_Ciudad1`
    FOREIGN KEY (`origin_id`)
    REFERENCES `SystemAir`.`Ciudad` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Ruta_Ciudad2`
    FOREIGN KEY (`destiny_id`)
    REFERENCES `SystemAir`.`Ciudad` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Ruta_Ciudad3`
    FOREIGN KEY (`escale_id`)
    REFERENCES `SystemAir`.`Ciudad` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SystemAir`.`ModeloAvion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SystemAir`.`ModeloAvion` (
  `id` VARCHAR(10) NOT NULL,
  `age` VARCHAR(4) NULL,
  `capacity` VARCHAR(3) NULL,
  `numberRows` VARCHAR(3) NULL,
  `seatsPeRrow` VARCHAR(2) NULL,
  `trademark` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SystemAir`.`Avion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SystemAir`.`Avion` (
  `id` VARCHAR(10) NOT NULL,
  `ModeloAvion_id` VARCHAR(10) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_Avion_ModeloAvion1_idx` (`ModeloAvion_id` ASC) VISIBLE,
  CONSTRAINT `fk_Avion_ModeloAvion1`
    FOREIGN KEY (`ModeloAvion_id`)
    REFERENCES `SystemAir`.`ModeloAvion` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SystemAir`.`Vuelo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SystemAir`.`Vuelo` (
  `id` VARCHAR(20) NOT NULL,
  `Ruta_id` VARCHAR(10) NOT NULL DEFAULT 0,
  `Avion_id` VARCHAR(10) NOT NULL DEFAULT 0,
  `Time` TIME NULL,
  `Day` VARCHAR(20) NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_Vuelo_Ruta_idx` (`Ruta_id` ASC) VISIBLE,
  INDEX `fk_Vuelo_Avion1_idx` (`Avion_id` ASC) VISIBLE,
  CONSTRAINT `fk_Vuelo_Ruta`
    FOREIGN KEY (`Ruta_id`)
    REFERENCES `SystemAir`.`Ruta` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Vuelo_Avion1`
    FOREIGN KEY (`Avion_id`)
    REFERENCES `SystemAir`.`Avion` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SystemAir`.`FormaPago`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SystemAir`.`FormaPago` (
  `id` VARCHAR(15) NOT NULL,
  `data` VARCHAR(15) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SystemAir`.`Usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SystemAir`.`Usuario` (
  `user` VARCHAR(15) NOT NULL,
  `pass` VARCHAR(45) NULL,
  `name` VARCHAR(45) NULL,
  `lastName` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  `datebirth` VARCHAR(45) NULL,
  `address` VARCHAR(45) NULL,
  `workphone` VARCHAR(15) NULL,
  `mobile` VARCHAR(13) NULL,
  `isAdmin` VARCHAR(1) NULL,
  PRIMARY KEY (`user`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SystemAir`.`Reservacion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SystemAir`.`Reservacion` (
  `id` VARCHAR(10) NOT NULL,
  `Date` DATETIME NULL,
  `FormaPago_id` VARCHAR(15) NOT NULL,
  `Usuario_user` VARCHAR(15) NOT NULL,
  `Tiquete_id` VARCHAR(10) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_Reservacion_FormaPago1_idx` (`FormaPago_id` ASC) VISIBLE,
  INDEX `fk_Reservacion_Usuario1_idx` (`Usuario_user` ASC) VISIBLE,
  CONSTRAINT `fk_Reservacion_FormaPago1`
    FOREIGN KEY (`FormaPago_id`)
    REFERENCES `SystemAir`.`FormaPago` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Reservacion_Usuario1`
    FOREIGN KEY (`Usuario_user`)
    REFERENCES `SystemAir`.`Usuario` (`user`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SystemAir`.`Tiquete`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SystemAir`.`Tiquete` (
  `id` VARCHAR(10) NOT NULL,
  `price` VARCHAR(10) NULL,
  `departureDate` DATETIME NULL,
  `returnDate` DATETIME NULL,
  `Reservacion_id` VARCHAR(10) NOT NULL,
  `Vuelo_id` VARCHAR(20) NOT NULL,
  `Seat` VARCHAR(23) NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_Viaje_Reservacion1_idx` (`Reservacion_id` ASC) VISIBLE,
  INDEX `fk_Viaje_Vuelo1_idx` (`Vuelo_id` ASC) VISIBLE,
  CONSTRAINT `fk_Viaje_Reservacion1`
    FOREIGN KEY (`Reservacion_id`)
    REFERENCES `SystemAir`.`Reservacion` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Viaje_Vuelo1`
    FOREIGN KEY (`Vuelo_id`)
    REFERENCES `SystemAir`.`Vuelo` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SystemAir`.`Seat`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SystemAir`.`Seat` (
  `numero` VARCHAR(3) NOT NULL,
  `Vuelo_id` VARCHAR(20) NOT NULL,
  INDEX `fk_Seat_Vuelo1_idx` (`Vuelo_id` ASC) VISIBLE,
  CONSTRAINT `fk_Seat_Vuelo1`
    FOREIGN KEY (`Vuelo_id`)
    REFERENCES `SystemAir`.`Vuelo` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
