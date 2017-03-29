-- MySQL dump 10.13  Distrib 5.5.54, for debian-linux-gnu (x86_64)
--
-- Host: localhost    Database: student_database
-- ------------------------------------------------------
-- Server version	5.5.54-0ubuntu0.14.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Courses_data`
--

DROP TABLE IF EXISTS `Courses_data`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Courses_data` (
  `Course_Name` varchar(50) NOT NULL,
  `student_id` varchar(20) NOT NULL,
  PRIMARY KEY (`student_id`),
  UNIQUE KEY `Courses_data_ak_1` (`student_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Courses_data`
--

LOCK TABLES `Courses_data` WRITE;
/*!40000 ALTER TABLE `Courses_data` DISABLE KEYS */;
/*!40000 ALTER TABLE `Courses_data` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Student_data`
--

DROP TABLE IF EXISTS `Student_data`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Student_data` (
  `Student_id` varchar(20) NOT NULL,
  `first_name` varchar(20) NOT NULL,
  `last_name` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `email` varchar(50) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `date_of_birth` varchar(20) NOT NULL,
  `Street_address` varchar(50) NOT NULL,
  `city` varchar(20) NOT NULL,
  `State` varchar(20) NOT NULL,
  PRIMARY KEY (`Student_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Student_data`
--

LOCK TABLES `Student_data` WRITE;
/*!40000 ALTER TABLE `Student_data` DISABLE KEYS */;
/*!40000 ALTER TABLE `Student_data` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Teacher_data`
--

DROP TABLE IF EXISTS `Teacher_data`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Teacher_data` (
  `Faculty_id` varchar(50) NOT NULL,
  `Password` varchar(50) NOT NULL,
  `first_name` varchar(50) NOT NULL,
  `last_name` varchar(50) NOT NULL,
  `email` varchar(100) NOT NULL,
  `Gender` varchar(7) NOT NULL,
  `Courses_taught` varchar(20) NOT NULL,
  PRIMARY KEY (`Faculty_id`,`Password`,`Courses_taught`),
  UNIQUE KEY `ak_47` (`Courses_taught`,`last_name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Teacher_data`
--

LOCK TABLES `Teacher_data` WRITE;
/*!40000 ALTER TABLE `Teacher_data` DISABLE KEYS */;
/*!40000 ALTER TABLE `Teacher_data` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Tests_data`
--

DROP TABLE IF EXISTS `Tests_data`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Tests_data` (
  `student_id` varchar(20) NOT NULL,
  `course_id` varchar(50) NOT NULL,
  `Test_1` double(2,0) NOT NULL,
  `Test_2` double(2,0) NOT NULL,
  `Test_3` double(2,0) NOT NULL,
  PRIMARY KEY (`course_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Tests_data`
--

LOCK TABLES `Tests_data` WRITE;
/*!40000 ALTER TABLE `Tests_data` DISABLE KEYS */;
/*!40000 ALTER TABLE `Tests_data` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student_schedule`
--

DROP TABLE IF EXISTS `student_schedule`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student_schedule` (
  `student_id` varchar(20) NOT NULL,
  `Courses` varchar(20) NOT NULL,
  PRIMARY KEY (`student_id`,`Courses`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student_schedule`
--

LOCK TABLES `student_schedule` WRITE;
/*!40000 ALTER TABLE `student_schedule` DISABLE KEYS */;
/*!40000 ALTER TABLE `student_schedule` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `teacher_schedule`
--

DROP TABLE IF EXISTS `teacher_schedule`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `teacher_schedule` (
  `Facutly_id` varchar(50) NOT NULL,
  `Courses` varchar(50) NOT NULL,
  PRIMARY KEY (`Facutly_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teacher_schedule`
--

LOCK TABLES `teacher_schedule` WRITE;
/*!40000 ALTER TABLE `teacher_schedule` DISABLE KEYS */;
/*!40000 ALTER TABLE `teacher_schedule` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-03-29 15:16:56
