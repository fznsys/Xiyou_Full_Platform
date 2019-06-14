-- MySQL dump 10.13  Distrib 5.7.26, for Win64 (x86_64)
--
-- Host: localhost    Database: db_xfp
-- ------------------------------------------------------
-- Server version	5.7.26

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
-- Table structure for table `tb_express_order`
--

DROP TABLE IF EXISTS `tb_express_order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_express_order` (
  `id` varchar(50) NOT NULL,
  `reciveid` varchar(50) NOT NULL,
  `phonenumber` varchar(11) NOT NULL,
  `recivename` varchar(20) NOT NULL,
  `company` varchar(20) NOT NULL,
  `address` varchar(50) NOT NULL,
  `expressnum` varchar(20) NOT NULL,
  `courierid` varchar(50) DEFAULT NULL,
  `couriername` varchar(20) DEFAULT NULL,
  `price` varchar(10) NOT NULL,
  `status` varchar(5) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_express_order`
--

LOCK TABLES `tb_express_order` WRITE;
/*!40000 ALTER TABLE `tb_express_order` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_express_order` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_life_payment`
--

DROP TABLE IF EXISTS `tb_life_payment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_life_payment` (
  `id` varchar(50) NOT NULL,
  `userid` varchar(50) NOT NULL,
  `type` varchar(5) NOT NULL,
  `num` varchar(10) NOT NULL,
  `date` varchar(20) NOT NULL,
  `status` varchar(5) NOT NULL DEFAULT '0',
  `way` varchar(20) NOT NULL,
  `mark` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_life_payment`
--

LOCK TABLES `tb_life_payment` WRITE;
/*!40000 ALTER TABLE `tb_life_payment` DISABLE KEYS */;
INSERT INTO `tb_life_payment` VALUES ('0c0e9d18-865b-49a4-8ac9-4f216eec7131','11','0','1442','2019-6-12 9:57:58','1','Visa',''),('1aefc63a-752d-41f6-ad06-d79b498cfd08','11','0','23','2019-6-12 10:27:27','1','支付宝',''),('25dc5d85-649c-4fc5-bb8a-106abf8a218a','11','0','23','2019-6-12 9:59:01','1','支付宝',''),('273db662-da5a-4371-a839-20d5f9dd1a88','11','0','11','2019-6-12 9:49:32','1','微信支付',''),('58355d38-6897-4f72-9760-50a695a4588f','11','0','12','2019-6-12 9:31:39','1','支付宝',''),('63bdb230-cd7f-4bac-af91-be009d40a287','11','0','123','2019-6-12 9:57:46','1','Visa',''),('880eb48e-64a1-403e-8254-b6a21cb30d83','11','0','123','2019-6-12 10:43:00','1','支付宝',''),('8cbf9bbc-8e8f-4df2-adc8-1013eac91361','11','0','12.1','2019-6-12 9:24:09','1','支付宝',''),('a7bb34b2-71a8-4512-a241-61fbee28848a','11','0','22','2019-6-12 9:33:31','1','支付宝',''),('a9bbee1f-c83e-4af4-9a7d-ccb2cc57ae12','11','0','22','2019-6-12 9:52:05','1','银联',''),('aff774e0-7d83-4e34-88d3-b53b54beed19','11','0','33','2019-6-12 10:06:53','1','支付宝',''),('b9424b02-d6b9-4893-a83b-04370332d6cd','123','0','11.123','2019-6-12 12:17:21','1','银联',''),('e29133db-9f13-40ef-b0e9-ca83236dbff5','123','0','12.12','2019-6-12 12:17:37','1','Visa',''),('e4d43c81-6298-4eba-9df4-92af52f1f365','11','0','996.99','2019-6-5 10:12:47','2','支付宝',''),('fa670224-9159-4f13-94b9-e077785ec0fc','11','0','21','2019-6-12 10:10:11','1','支付宝',''),('feb6ae17-3627-40cb-adbd-a9bf20df35db','11','0','33','2019-6-12 9:53:26','1','Visa','');
/*!40000 ALTER TABLE `tb_life_payment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_takeout_food`
--

DROP TABLE IF EXISTS `tb_takeout_food`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_takeout_food` (
  `id` varchar(50) NOT NULL,
  `name` varchar(10) NOT NULL,
  `off` varchar(5) NOT NULL,
  `price` varchar(10) NOT NULL,
  `offprice` varchar(10) NOT NULL,
  `status` varchar(5) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_takeout_food`
--

LOCK TABLES `tb_takeout_food` WRITE;
/*!40000 ALTER TABLE `tb_takeout_food` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_takeout_food` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_takeout_menu`
--

DROP TABLE IF EXISTS `tb_takeout_menu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_takeout_menu` (
  `id` varchar(50) NOT NULL,
  `foodid` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_takeout_menu`
--

LOCK TABLES `tb_takeout_menu` WRITE;
/*!40000 ALTER TABLE `tb_takeout_menu` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_takeout_menu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_takeout_merchant`
--

DROP TABLE IF EXISTS `tb_takeout_merchant`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_takeout_merchant` (
  `id` varchar(50) NOT NULL,
  `name` varchar(50) NOT NULL,
  `menuid` varchar(50) NOT NULL,
  `announcement` varchar(100) DEFAULT NULL,
  `type` varchar(5) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_takeout_merchant`
--

LOCK TABLES `tb_takeout_merchant` WRITE;
/*!40000 ALTER TABLE `tb_takeout_merchant` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_takeout_merchant` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_takeout_order`
--

DROP TABLE IF EXISTS `tb_takeout_order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_takeout_order` (
  `id` varchar(50) NOT NULL,
  `userid` varchar(50) NOT NULL,
  `date` varchar(50) NOT NULL,
  `num` varchar(10) NOT NULL,
  `mark` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_takeout_order`
--

LOCK TABLES `tb_takeout_order` WRITE;
/*!40000 ALTER TABLE `tb_takeout_order` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_takeout_order` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_takeout_order_food`
--

DROP TABLE IF EXISTS `tb_takeout_order_food`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_takeout_order_food` (
  `orderid` varchar(50) NOT NULL,
  `foodid` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_takeout_order_food`
--

LOCK TABLES `tb_takeout_order_food` WRITE;
/*!40000 ALTER TABLE `tb_takeout_order_food` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_takeout_order_food` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_user_user`
--

DROP TABLE IF EXISTS `tb_user_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_user_user` (
  `id` varchar(50) NOT NULL,
  `name` varchar(20) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(50) NOT NULL,
  `role` varchar(5) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_user_user`
--

LOCK TABLES `tb_user_user` WRITE;
/*!40000 ALTER TABLE `tb_user_user` DISABLE KEYS */;
INSERT INTO `tb_user_user` VALUES ('11','啊啊啊','111','dc483e80a7a0bd9ef71d8cf973673924','1'),('123','aaa','test','dc483e80a7a0bd9ef71d8cf973673924','2'),('456','admin','test1','dc483e80a7a0bd9ef71d8cf973673924','0');
/*!40000 ALTER TABLE `tb_user_user` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `insertpassword` BEFORE INSERT ON `tb_user_user` FOR EACH ROW begin
set new.password=md5(new.password);
end */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 trigger updatepassword
before update on tb_user_user
for each row
BEGIN
if(NEW.password!=OLD.password) then
set NEW.password=md5(NEW.password);
END if;
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-06-14 10:03:51
