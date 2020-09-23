-- MySQL dump 10.13  Distrib 8.0.12, for Win64 (x86_64)
--
-- Host: localhost    Database: mailer
-- ------------------------------------------------------
-- Server version	8.0.12

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `company_mailer_message`
--

DROP TABLE IF EXISTS `company_mailer_message`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `company_mailer_message` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `SENDER` varchar(100) DEFAULT NULL,
  `RECEIVER` varchar(100) DEFAULT NULL,
  `SUBJECT` varchar(100) DEFAULT NULL,
  `MESSAGE` varchar(100) DEFAULT NULL,
  `TRASH` varchar(100) DEFAULT NULL,
  `MESSAGEDATE` date DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `company_mailer_message`
--

LOCK TABLES `company_mailer_message` WRITE;
/*!40000 ALTER TABLE `company_mailer_message` DISABLE KEYS */;
/*!40000 ALTER TABLE `company_mailer_message` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `company_mailer_user`
--

DROP TABLE IF EXISTS `company_mailer_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `company_mailer_user` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(100) NOT NULL,
  `EMAIL` varchar(100) NOT NULL,
  `PASSWORD` varchar(100) NOT NULL,
  `GENDER` varchar(100) DEFAULT NULL,
  `DOB` date DEFAULT NULL,
  `ADDRESSLINE` varchar(100) NOT NULL,
  `CITY` varchar(100) NOT NULL,
  `STATE` varchar(100) NOT NULL,
  `COUNTRY` varchar(100) NOT NULL,
  `CONTACT` varchar(100) NOT NULL,
  `REGISTEREDDATE` date NOT NULL,
  `AUTHORIZED` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `company_mailer_user`
--

LOCK TABLES `company_mailer_user` WRITE;
/*!40000 ALTER TABLE `company_mailer_user` DISABLE KEYS */;
INSERT INTO `company_mailer_user` VALUES (1,'Vishal','vishal@computway.com','1345','M','1995-08-03','gfhfgj','Jaipur','Rajasthan','India','578483989','2019-07-03','Yes'),(2,'Nishal','vishal@computway.com','1345','M','1995-08-03','gfhfgj','Jaipur','Rajasthan','India','578483989','2019-07-03','Yes'),(3,'Nishal','vishal@computway.com','1345','M','1995-08-03','gfhfgj','Jaipur','Rajasthan','India','578483989','2019-07-03','Yes'),(4,'','@cmailer.com','',NULL,NULL,'','','','Select-Country:','','2019-06-03','yes'),(5,'','@cmailer.com','',NULL,NULL,'','','','Select-Country:','','2019-06-03','yes'),(6,'','@cmailer.com','',NULL,NULL,'','','','Select-Country:','','2019-06-03','yes'),(7,'','@cmailer.com','',NULL,NULL,'','','','Select-Country:','','2019-06-03','yes'),(8,'','@cmailer.com','',NULL,NULL,'','','','Select-Country:','','2019-06-03','yes'),(9,'','@cmailer.com','',NULL,NULL,'','','','Select-Country:','','2019-06-03','yes'),(10,'','@cmailer.com','',NULL,NULL,'','','','Select-Country:','','2020-09-23','yes');
/*!40000 ALTER TABLE `company_mailer_user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-09-23 20:40:02
