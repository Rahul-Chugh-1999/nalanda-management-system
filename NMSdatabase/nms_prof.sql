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
-- Table structure for table `prof`
--

DROP TABLE IF EXISTS `prof`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `prof` (
  `Name` varchar(255) DEFAULT NULL,
  `Id` varchar(255) NOT NULL,
  `Pass` varchar(255) DEFAULT NULL,
  `Dept` varchar(255) DEFAULT NULL,
  `Year` varchar(255) DEFAULT NULL,
  `Age` varchar(255) DEFAULT NULL,
  `ContactNo` varchar(255) DEFAULT NULL,
  UNIQUE KEY `Userid` (`Id`),
  UNIQUE KEY `Userid_2` (`Id`),
  UNIQUE KEY `Userid_3` (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prof`
--

LOCK TABLES `prof` WRITE;
/*!40000 ALTER TABLE `prof` DISABLE KEYS */;
INSERT INTO `prof` VALUES ('AG001N','AG001','AG001','Agriculture','AG001Y','AG001A','AG001P'),('AG002N','AG002','AG002','Agriculture','AG002Y','AG002A','AG002P'),('AG003N','AG003','AG003','Agriculture','AG003Y','AG003A','AG003P'),('AG004N','AG004','AG004','Agriculture','AG004Y','AG004A','AG004P'),('CS001N','CS001','CS001','Computer Science','CS001Y','CS001A','CS001P'),('CS002N','CS002','CS002','Computer Science','CS002Y','CS002A','CS002P'),('CS003N','CS003','CS003','Computer Science','CS003Y','CS003A','CS003P'),('CS004N','CS004','CS004','Computer Science','CS004Y','CS004A','CS004P'),('ME001N','ME001','ME001','Mechanical','ME001Y','ME001A','ME001P'),('ME002N','ME002','ME002','Mechanical','ME002Y','ME002A','ME002P'),('ME003N','ME003','ME003','Mechanical','ME003Y','ME003A','ME003P'),('ME004N','ME004','ME004','Mechanical','ME004Y','ME004A','ME004P');
/*!40000 ALTER TABLE `prof` ENABLE KEYS */;
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
