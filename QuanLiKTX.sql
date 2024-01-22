CREATE DATABASE  IF NOT EXISTS `quanlikitucxa` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `quanlikitucxa`;
-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: quanlikitucxa
-- ------------------------------------------------------
-- Server version	8.0.35

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
-- Table structure for table `nhanvienquanli`
--

DROP TABLE IF EXISTS `nhanvienquanli`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nhanvienquanli` (
  `MaNV` varchar(20) NOT NULL,
  `TenNV` varchar(45) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `GioiTinh` varchar(4) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `NgaySinh` date NOT NULL,
  `QueQuan` varchar(45) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `NoiO` varchar(45) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `ChucVu` varchar(45) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `CCCD` varchar(45) NOT NULL,
  PRIMARY KEY (`MaNV`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nhanvienquanli`
--

LOCK TABLES `nhanvienquanli` WRITE;
/*!40000 ALTER TABLE `nhanvienquanli` DISABLE KEYS */;
INSERT INTO `nhanvienquanli` VALUES ('001TK','Lý Thị Đào','Nữ','1997-05-27','Đà Nẵng','Thanh Khê','Thư Ký','0453QD');
/*!40000 ALTER TABLE `nhanvienquanli` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `phongktx`
--

DROP TABLE IF EXISTS `phongktx`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `phongktx` (
  `MaPhong` varchar(20) NOT NULL,
  `TenPhong` varchar(30) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `DienTich` int NOT NULL,
  `Tang` int NOT NULL,
  `SoNguoiO` int NOT NULL,
  `GiaTien/Nguoi` double NOT NULL,
  PRIMARY KEY (`MaPhong`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `phongktx`
--

LOCK TABLES `phongktx` WRITE;
/*!40000 ALTER TABLE `phongktx` DISABLE KEYS */;
INSERT INTO `phongktx` VALUES ('A101','Phòng A101',32,1,4,1200000),('A102','Phòng A102',32,1,4,1200000),('A103','Phòng A103',64,1,4,1200000),('A112','Phòng A112',64,1,8,600000),('A204','Phòng A204',32,2,4,1200000),('A205','Phòng A205',32,2,8,600000),('A206','Phòng A206',32,2,4,1200000),('A223','Phòng A223',32,2,8,600000),('A305','Phòng A305',32,3,4,1200000),('A306','Phòng A306',32,3,4,1200000),('A307','Phòng A307',64,3,8,600000),('A313','Phòng A313',32,3,4,1200000),('A326','Phòng A326',64,3,8,600000),('A406','Phòng A406',32,4,4,1200000),('A412','Phòng A412',64,4,8,600000),('A525','Phòng A525',32,5,4,1200000),('A527','Phòng A527',64,5,8,600000);
/*!40000 ALTER TABLE `phongktx` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sinhvienktx`
--

DROP TABLE IF EXISTS `sinhvienktx`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sinhvienktx` (
  `MaSV` varchar(20) NOT NULL,
  `TenSV` varchar(40) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `GioiTinh` varchar(5) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `NgaySinh` date NOT NULL,
  `QueQuan` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `NoiO` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `SDT` int NOT NULL,
  `CCCD` varchar(30) NOT NULL,
  `NgayVao` varchar(20) NOT NULL,
  `NgayRa` varchar(20) NOT NULL,
  `MaNV` varchar(20) DEFAULT NULL,
  `MaPhong` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`MaSV`),
  KEY `MaNV` (`MaNV`),
  KEY `MaPhong` (`MaPhong`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sinhvienktx`
--

LOCK TABLES `sinhvienktx` WRITE;
/*!40000 ALTER TABLE `sinhvienktx` DISABLE KEYS */;
INSERT INTO `sinhvienktx` VALUES ('20BA340','Lưu Thị Kim Linh','Nữ','2002-01-24','Bình Định','Liên Chiểu',324405161,'0454SV','2023-01-02','2024-01-06','001TK','A112'),('22IT056','Bùi Thị Kim Ngân','Nữ','2003-07-23','Quảng Nam','Hải Châu',324568362,'0454SV','2023-01-02','2024-01-06','001TK','A525'),('23AI005','Nguyễn Như Phương','Nam','2006-09-15','Quảng Nam','Cẩm Lệ',862441005,'04532V','2023-01-02','2024-01-06','001TK','A525'),('23AI012','Phạm Thị Tuyết Trinh','Nữ','2005-07-14','Quảng Trị','Hải Thái',962100248,'01234V','2023-01-02','2024-01-06','001TK','A412'),('23BA021','Nguyễn Ngọc Như Thảo','Nữ','2004-04-26','Ninh Bình','Hải Châu',123456782,'012345V','2023-01-02','2024-01-06','001TK','A412'),('23BA098','Nguyễn Văn Hiếu','Nam','2002-07-16','Thừa Thiên Huế','Hải Châu',324568123,'0454SV','2023-01-02','2024-01-06','001TK','A223'),('23BA099','Nguyễn Huy Toàn','Nam','2006-08-21','Bình Định','Hải Châu',124242219,'023453V','2023-01-02','2024-01-06','001TK','A525'),('23BA101','Nguyễn Việt Hoàng','Nam','2000-09-09','Thái Bình','Thanh Khê',949500248,'045306V','2023-01-02','2024-01-06','001TK','A525'),('23BA206','Tô Hữu Bằng','Nam','1991-06-04','Hà Nội','Hải Châu',91237689,'0987V','2023-01-02','2024-01-06','001TK','A326'),('23CE112','Nguyễn Văn Thuần','Nam','2005-09-23','Đà Nẵng','Hải Châu',324568012,'0454SV','2023-01-02','2024-01-06','001TK','A306'),('23DA112','Nguyễn Thanh Tùng','Nam','2001-07-04','Thái Bình','Hải Châu',912003321,'054305V','2023-01-02','2024-01-06','001TK','A412'),('23DM005','Võ Thị Ý Nhi','Nữ','2005-01-22','Quảng Trị','Liên Chiểu',324568248,'0454SV','2023-01-02','2024-01-06','001TK','A306'),('23DM008','Nguyễn Hữu Đạt','Nam','2005-06-24','Hồ Chí Minh','Hải Châu',329008213,'0454SV','2023-01-02','2024-01-06','001TK','A412'),('23DM098','Phùng Thị Thanh Thảo','Nữ','2001-02-03','Quảng Trị','Hải Châu',98000235,'98674V','2023-01-02','2024-01-06','001TK','A525'),('23DM100','Huỳnh Ngọc Mai','Nữ','2005-01-09','Bình Định','Hải Châu',154660098,'0987M','2024-01-01','2024-06-01','001TK','A527'),('23DM125','Nguyễn Văn Toản','Nam','2005-04-21','Đà Nẵng','Ngũ Hành Sơn',329018123,'0454SV','2023-01-02','2024-01-06','001TK','A412'),('23EL001','Đặng Phạm Hoài Trân','Nữ','2005-04-14','Quảng Trị','Hải Châu',823054789,'0454SV','2023-01-02','2024-01-06','001TK','A527'),('23EL002','Võ Thị Hoài Nguyên','Nữ','2005-01-24','Bình Định','Thanh Khê',324600123,'0454SV','2023-01-02','2024-01-06','001TK','A525'),('23EL003','Nguyễn Văn Minh Triết','Nam','2005-02-24','Quảng Nam','Hải Thái',132456843,'0454SV','2023-01-02','2024-01-06','001TK','A406'),('23EL005','Lê Thị Ánh Tuyết','Nữ','2005-07-22','Quảng Trị','Hải Châu',123869504,'0454SV','2023-01-02','2024-01-06','001TK','A412'),('23EL025','Nguyễn Như Ý','Nữ','2005-10-12','Thừa Thiên Huế','Hải Thái',987002132,'0454SV','2023-01-02','2024-01-06','001TK','A412'),('23EL053','Nguyễn Như Quỳnh','Nữ','2004-12-12','Thừa Thiên Huế','Hải Thái',983400504,'0454SV','2023-01-02','2024-01-06','001TK','A527'),('23EL066','Trần Quốc Huy','Nam','2005-02-25','Bình Định','Liên Chiểu',329018123,'0454SV','2023-01-02','2024-01-06','001TK','A525'),('23EL076','Võ Hoàng Tin','Nam','2005-01-28','Quảng Nam','Liên Chiểu',324288123,'0454SV','2023-01-02','2024-01-06','001TK','A305'),('23EL123','Trương Thị Thúy Kiều','Nữ','2004-09-12','Bình Định','Ngũ Hành Sơn',324020123,'0454SV','2023-01-02','2024-01-06','001TK','A101'),('23EL124','Trần Thị Thảo','Nữ','2003-09-06','Quảng Nam','Hải Châu',374278965,'0454SV','2023-01-02','2024-01-06','001TK','A412'),('23EL141','Huỳnh Thị Kim Ngân','Nữ','2004-11-11','Quảng Nam','Hải Châu',823665876,'0454SV','2023-01-02','2024-01-06','001TK','A527'),('23EL149','Trần Thị Tố Nhi','Nữ','2005-12-14','Thừa Thiên Huế','Thanh Khê',962345008,'0454SV','2023-01-02','2024-01-06','001TK','A412'),('23EL151','Huỳnh Văn Phú','Nam','2005-05-06','Phú Thọ','Hải Châu',863400054,'0454SV','2023-01-02','2024-01-06','001TK','A406'),('23EL155','Hoàng Hải Sơn','Nam','2004-10-15','Phú Thọ','Thanh Khê',374267876,'0454SV','2023-01-02','2024-01-06','001TK','A406'),('23ET107','Lại Văn Quốc Tuấn','Nam','2005-06-03','Đà Nẵng','Ngũ Hành Sơn',324561003,'0454SV','2023-01-02','2024-01-06','001TK','A326'),('23ET119','Nguyễn Xuân Nhi','Nam','2005-07-04','Quảng Ngãi','Ngũ Hành Sơn',866234765,'0987V','2023-01-02','2024-01-06','001TK','A326'),('23IB072','Nguyễn Thị Mỹ Lệ','Nữ','2004-03-15','Hà Tĩnh','Ngũ Hành Sơn',320877625,'0454SV','2023-01-02','2024-01-06','001TK','A306'),('23IM006','Đỗ Như Phương','Nam','2005-03-04','Phú Thọ','Đà Nẵng',123456732,'0123V','2023-01-02','2024-01-06','001TK','A223'),('23IM059','Lê Vinh Dự','Nam','2005-01-26','Quảng Trị','Thanh Khê',324568005,'0454SV','2023-01-02','2024-01-06','001TK','A412'),('23IM081','Huỳnh Thanh Cảnh','Nam','2005-12-19','Quảng Nam','Thanh Khê',949100321,'0987AS','2023-01-02','2024-01-06','001TK','A101'),('23IT071','Lê Thị Thu Hiền','Nữ','2005-08-25','Quảng Trị','Hải Thái',123456784,'0453V','2023-01-02','2024-01-06','001TK','A326'),('23it2b','Nguyễn Thị Ngọc Nga','Nữ','2001-01-01','Quảng Trị','Hải Thái',987654300,'0987V','2023-01-02','2024-01-06','001TK','A112'),('23MF','Huỳnh Như Phương','Nam','2001-09-07','Quảng Bình','Thanh Khê',978234890,'0987V','2023-01-02','2024-01-06','001TK','A102'),('vvjm','Nguyễn Thị Như Thảo','Nam','2005-01-01','Quảng Trị','Hải Châu',987501234,'0453B','2023-01-02','2024-01-07','001TK','A103');
/*!40000 ALTER TABLE `sinhvienktx` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-01-22 15:49:08
