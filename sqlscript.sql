-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `mydb` ;

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`Supervisiors`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Supervisiors` (
  `supervisior_id` INT NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(60) NOT NULL,
  `second_name` VARCHAR(60) NOT NULL,
  `email` VARCHAR(60) NOT NULL,
  `phone_number` VARCHAR(10) NOT NULL,
  `address` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`supervisior_id`),
  UNIQUE INDEX `supervisior_id_UNIQUE` (`supervisior_id` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Students`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Students` (
  `student_id` INT NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(60) NOT NULL,
  `second_name` VARCHAR(60) NOT NULL,
  `age` INT NOT NULL,
  `class` VARCHAR(3) NOT NULL,
  `phone_number` VARCHAR(10) NOT NULL,
  `email` VARCHAR(60) NOT NULL,
  `address` VARCHAR(100) NOT NULL,
  `supervisior_id` INT NOT NULL,
  PRIMARY KEY (`student_id`),
  UNIQUE INDEX `student_id_UNIQUE` (`student_id` ASC) VISIBLE,
  INDEX `fk_Students_Supervisiors_idx` (`supervisior_id` ASC) VISIBLE,
  CONSTRAINT `fk_Students_Supervisiors`
    FOREIGN KEY (`supervisior_id`)
    REFERENCES `mydb`.`Supervisiors` (`supervisior_id`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `mydb`.`Supervisiors`
-- -----------------------------------------------------
START TRANSACTION;
USE `mydb`;
INSERT INTO `mydb`.`Supervisiors` (`supervisior_id`, `first_name`, `second_name`, `email`, `phone_number`, `address`) VALUES (1, 'John', 'Doe', 'theDoe@gmail.com', '4567890356', 'Hello stree of the city 67a');
INSERT INTO `mydb`.`Supervisiors` (`supervisior_id`, `first_name`, `second_name`, `email`, `phone_number`, `address`) VALUES (2, 'Samuel', 'Kenzie', 's.kenzie@emal.com', '4589076512', 'Main street 98I');
INSERT INTO `mydb`.`Supervisiors` (`supervisior_id`, `first_name`, `second_name`, `email`, `phone_number`, `address`) VALUES (3, 'Gabriel', 'Tor', 'gabrieltor18@gmail.com', '4509901356', 'Flowerhood 2c');

COMMIT;


-- -----------------------------------------------------
-- Data for table `mydb`.`Students`
-- -----------------------------------------------------
START TRANSACTION;
USE `mydb`;
INSERT INTO `mydb`.`Students` (`student_id`, `first_name`, `second_name`, `age`, `class`, `phone_number`, `email`, `address`, `supervisior_id`) VALUES (1, 'Alex', 'Minchev', 12, '6A', '4587689164', 'father@email.com', 'the street of streets 60b', 1);
INSERT INTO `mydb`.`Students` (`student_id`, `first_name`, `second_name`, `age`, `class`, `phone_number`, `email`, `address`, `supervisior_id`) VALUES (2, 'Nikola', 'Web', 16, '10C', '4509872314', 'n.web17@gmaik.com', 'another stree 45a', 2);
INSERT INTO `mydb`.`Students` (`student_id`, `first_name`, `second_name`, `age`, `class`, `phone_number`, `email`, `address`, `supervisior_id`) VALUES (3, 'Christian', 'Brown', 10, '4E', '4588911425', 'brownie98@yahoo.com', 'my street 91c', 3);

COMMIT;

