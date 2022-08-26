-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: nms
-- ------------------------------------------------------
-- Server version	8.0.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `courses`
--

DROP TABLE IF EXISTS `courses`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `courses` (
  `Prof` varchar(255) DEFAULT NULL,
  `Dept` varchar(255) DEFAULT NULL,
  `Year` varchar(255) DEFAULT NULL,
  `Id` varchar(255) NOT NULL,
  `Hours` varchar(255) DEFAULT NULL,
  `Name` varchar(255) DEFAULT NULL,
  `Type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Id`),
  UNIQUE KEY `Id_UNIQUE` (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `courses`
--

LOCK TABLES `courses` WRITE;
/*!40000 ALTER TABLE `courses` DISABLE KEYS */;
INSERT INTO `courses` VALUES ('AG003','Agriculture','1','AG1AT001','1','AG1AT001N','Autumn'),('AG003','Agriculture','1','AG1AT002','2','AG1AT002N','Autumn'),('AG004','Agriculture','1','AG1AT004','3','AG1AT004N','Autumn'),('AG003','Agriculture','2','AG2AT001','1','AG2AT001N','Autumn'),('AG003','Agriculture','2','AG2AT002','3','AG2AT002N','Autumn'),('AG004','Agriculture','2','AG2AT004','3','AG2AT004N','Autumn'),('AG004','Mechanical','2','AG2AT006','3','AG2AT006N','Autumn'),('AG001','Agriculture','3','AG3AT001','2','AG3AT001N','Autumn'),('AG001','Agriculture','3','AG3AT002','2','AG3AT002N','Autumn'),('AG002','Agriculture','3','AG3AT004','4','AG3AT004N','Autumn'),('AG001','Computer Science','3','AG3AT005','2','AG3AT005N','Autumn'),('AG002','Mechanical','3','AG3AT006','2','AG3AT006N','Autumn'),('AG001','Agriculture','4','AG4AT001','3','AG4AT001N','Autumn'),('AG001','Agriculture','4','AG4AT002','2','AG4AT002N','Autumn'),('AG002','Agriculture','4','AG4AT004','3','AG4AT004N','Autumn'),('CS002','Agriculture','1','CS1AT001','3','CS1AT001N','Autumn'),('CS003','Computer Science','1','CS1AT002','1','CS1AT002N','Autumn'),('CS003','Computer Science','1','CS1AT003','4','CS1AT003N','Autumn'),('CS004','Computer Science','1','CS1AT005','3','CS1AT005N','Autumn'),('CS002','Mechanical','1','CS1AT006','4','CS1AT006N','Autumn'),('CS003','Computer Science','2','CS2AT002','3','CS2AT002N','Autumn'),('CS003','Computer Science','2','CS2AT003','4','CS2AT003N','Autumn'),('CS004','Computer Science','2','CS2AT004','2','CS2AT004N','Autumn'),('CS001','Computer Science','3','CS3AT002','3','CS3AT002N','Autumn'),('CS001','Computer Science','3','CS3AT003','3','CS3AT003N','Autumn'),('CS002','Computer Science','3','CS3AT005','2','CS3AT005N','Autumn'),('CS001','Agriculture','4','CS4AT001','1','CS4AT001N','Autumn'),('CS001','Computer Science','4','CS4AT002','2','CS4AT002N','Autumn'),('CS002','Computer Science','4','CS4AT004','2','CS4AT004N','Autumn'),('CS002','Computer Science','4','CS4AT005','3','CS4AT005N','Autumn'),('CS001','Mechanical','4','CS4AT006','2','CS4AT006N','Autumn'),('ME003','Computer Science','1','ME1AT002','2','ME1AT002N','Autumn'),('ME003','Mechanical','1','ME1AT003','1','ME1AT003N','Autumn'),('ME004','Mechanical','1','ME1AT004','3','ME1AT004N','Autumn'),('ME002','Mechanical','1','ME1AT005','1','ME1AT005N','Autumn'),('ME002','Agriculture','2','ME2AT001','3','ME2AT001','Autumn'),('ME003','Computer Science','2','ME2AT002','1','ME2AT002N','Autumn'),('ME002','Mechanical','2','ME2AT003','1','ME2AT003N','Autumn'),('ME002','Mechanical','2','ME2AT005','4','ME2AT005N','Autumn'),('ME004','Mechanical','2','ME2AT006','2','ME2AT006N','Autumn'),('ME001','Agriculture','3','ME3AT001','2','ME3AT001N','Autumn'),('ME004','Mechanical','3','ME3AT003','4','ME3AT003N','Autumn'),('ME003','Mechanical','3','ME3AT004','2','ME3AT004N','Autumn'),('ME004','Mechanical','3','ME3AT006','2','ME3AT006N','Autumn'),('ME001','Mechanical','4','ME4AT002','1','ME4AT002N','Autumn'),('ME002','Mechanical','4','ME4AT004','3','ME4AT004N','Autumn'),('ME001','Computer Science','4','ME4AT005','4','ME4AT005N','Autumn'),('ME003','Mechanical','4','ME4AT006','3','ME4AT006N','Autumn');
/*!40000 ALTER TABLE `courses` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-04-25 14:05:05
