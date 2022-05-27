-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: localhost    Database: ebshop
-- ------------------------------------------------------
-- Server version	8.0.28

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
-- Table structure for table `authors`
--

DROP TABLE IF EXISTS `authors`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `authors` (
  `id_authors` bigint NOT NULL AUTO_INCREMENT,
  `description` varchar(255) DEFAULT NULL,
  `first_name_author` varchar(255) DEFAULT NULL,
  `last_name_author` varchar(255) DEFAULT NULL,
  `organization` varchar(255) DEFAULT NULL,
  `website_author` varchar(255) DEFAULT NULL,
  `year_of_birth` int NOT NULL,
  PRIMARY KEY (`id_authors`)
) ENGINE=MyISAM AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `authors`
--

LOCK TABLES `authors` WRITE;
/*!40000 ALTER TABLE `authors` DISABLE KEYS */;
INSERT INTO `authors` VALUES (1,'Mô tả','Nguyễn Nhật','Ánh','Cá nhân','https://vi.wikipedia.org/wiki/Nguy%E1%BB%85n_Nh%E1%BA%ADt_%C3%81nh',1955),(2,'Mô tả','Hạ','Trang','Cá nhân','https://vi.wikipedia.org/wiki/Trang_H%E1%BA%A1_(nh%C3%A0_v%C4%83n)',1975),(3,'Mô tả','Nguyễn Phong','Việt','Cá nhân','https://vi.wikipedia.org/wiki/Nguy%E1%BB%85n_Phong_Vi%E1%BB%87t',1980),(4,'Mô tả','Ma Văn','Kháng','Cá nhân','https://vi.wikipedia.org/wiki/Ma_V%C4%83n_Kh%C3%A1ng',1936),(5,'Mô tả','Hồ Anh','Thái','Cá nhân','https://vi.wikipedia.org/wiki/H%E1%BB%93_Anh_Th%C3%A1i',1960),(6,'Mô tả','Viktor','Mayer','Profestional','https://en.wikipedia.org/wiki/Viktor_Mayer-Sch%C3%B6nberger',1966),(7,'Mô tả','Nicholas G.','Carr','Profestional','https://en.wikipedia.org/wiki/Nicholas_G._Carr',1959),(8,'Mô tả','Jeff ','Atwood','Profestional','https://vi.wikipedia.org/wiki/Jeff_Atwood',1970),(9,'Mô tả','Terrence',' J Sejnowski','Profestional','https://en.wikipedia.org/wiki/Terry_Sejnowski',1947),(10,'Mô tả','Nguyễn Đức',' Hiếu','Profestional','https://en.wikipedia.org/wiki/',1982);
/*!40000 ALTER TABLE `authors` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `books`
--

DROP TABLE IF EXISTS `books`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `books` (
  `id_book` bigint NOT NULL AUTO_INCREMENT,
  `description_book` varchar(255) DEFAULT NULL,
  `is_deleted` bit(1) DEFAULT b'0',
  `pages` int NOT NULL,
  `price` bigint DEFAULT NULL,
  `publication_date` datetime DEFAULT NULL,
  `quantity` int NOT NULL,
  `standard_book_number` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `id_authors` bigint DEFAULT NULL,
  `id_publisher` bigint DEFAULT NULL,
  PRIMARY KEY (`id_book`),
  KEY `FKtdia8d394djoabgog6eyddwke` (`id_authors`),
  KEY `FKix55a38nhgwihjsecwmyvl8qq` (`id_publisher`)
) ENGINE=MyISAM AUTO_INCREMENT=148 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `books`
--

LOCK TABLES `books` WRITE;
/*!40000 ALTER TABLE `books` DISABLE KEYS */;
INSERT INTO `books` VALUES (1,'Đáng để đọc',_binary '\0',606,606,'2020-04-01 00:00:00',100,'979932','Thành Phố Thông Minh – Nền Tảng, Nguyên Lý Và Ứng Dụng',1,5),(2,'Đáng để đọc',_binary '\0',523,523,'2020-04-01 00:00:00',200,'974236','Dữ Liệu Lớn – Viktor Mayer – SchÖnberger & Kenneth Cukier',2,4),(3,'Đáng để đọc',_binary '\0',424,424,'2020-04-01 00:00:00',125,'967067','Trí Tuệ Giả Tạo',3,3),(4,'Đáng để đọc',_binary '\0',15,15,'2020-04-01 00:00:00',300,'911715','Thiết kế mạng Intranet',4,2),(5,'Đáng để đọc',_binary '\0',1252,1252,'2020-04-01 00:00:00',230,'933093','Lập Trình Và Cuộc Sống',5,1),(6,'Đáng để đọc',_binary '\0',5234,5234,'2020-04-01 00:00:00',212,'981783','LIFE 3.0 – Loài Người Trong Kỷ Nguyên Trí Tuệ Nhân Tạo',6,6),(7,'Đáng để đọc',_binary '\0',1234,1234,'2020-04-01 00:00:00',123,'950091','Deep Learning – Cuộc Cách Mạng Học Sâu',7,7),(8,'Đáng để đọc',_binary '\0',1256,1256,'2020-04-01 00:00:00',543,'939609','Giáo Trình C++ Và Lập Trình Hướng Đối Tượng',8,8),(9,'Đáng để đọc',_binary '\0',1255,1255,'2020-04-01 00:00:00',285,'969366','Lập trình hướng đối tượng JAVA core dành cho người mới bắt đầu học lập trình',9,9),(10,'Đáng để đọc',_binary '\0',1256,1256,'2020-04-01 00:00:00',954,'937537','Giáo Trình Kỹ Thuật Lập Trình C Căn Bản Và Nâng Cao',9,10),(11,'Đáng để đọc',_binary '\0',1267,1267,'2020-04-01 00:00:00',52,'958839','Tớ Học Lập Trình – Làm Quen Với PYTHON',2,10),(12,'Đáng để đọc',_binary '\0',761,761,'2020-04-01 00:00:00',84,'985348','Tớ Học Lập Trình – Làm Quen Với Lập Trình Scratch',4,2),(13,'Đáng để đọc',_binary '\0',126,126,'2020-04-01 00:00:00',52,'965093','Lập Trình Java Căn Bản',5,3),(14,'Đáng để đọc',_binary '\0',426,426,'2020-04-01 00:00:00',85,'963517','Bạn Sẽ Thành Thạo Pascal Chỉ Trong 21 Ngày',6,5),(15,'Đáng để đọc',_binary '\0',245,245,'2020-04-01 00:00:00',952,'964970','Thiết Kế Cho Người Mới Bắt Đầu',1,6),(16,'Đáng để đọc',_binary '\0',2323,2323,'2020-04-01 00:00:00',752,'969468','Tự Học Thiết Kế Đồ Họa Trên Photoshop CS6',2,7),(17,'Đáng để đọc',_binary '\0',2424,2424,'2020-04-01 00:00:00',123,'935693','Tự Học Nhanh Đồ Họa Trên Illustrator 8.0 Và 9.0',6,8),(18,'Đáng để đọc',_binary '\0',2525,2525,'2020-04-01 00:00:00',574,'976240','Tự Học Nhanh Đồ Họa Trên Corel Draw 12 Và X3',4,2),(19,'Đáng để đọc',_binary '\0',266,266,'2020-04-01 00:00:00',824,'927264','Hướng Dẫn Sử Dụng Microsoft Office',10,4),(20,'Đáng để đọc',_binary '\0',2727,2727,'2020-04-01 00:00:00',825,'952489','Cuộc Chiến Công Nghệ Số',9,6),(21,'Đáng để đọc',_binary '\0',2828,2828,'2020-04-01 00:00:00',475,'938427','Cải Tổ Doanh Nghiệp Trong Thời Đại Số',9,7),(22,'Đáng để đọc',_binary '\0',2929,2929,'2020-04-01 00:00:00',128,'981384','Liệu IT Đã Hết Thời',9,2),(23,'Đáng để đọc',_binary '\0',3000,3000,'2020-04-01 00:00:00',594,'959181','12 Xu Hướng Công Nghệ Trong Thời Đại 4.0',8,4),(24,'Đáng để đọc',_binary '\0',1212,1212,'2020-04-01 00:00:00',258,'954882','Từ Điển Bách Khoa Công Nghệ Thông Tin & Kỹ Thuật Máy Tính',7,1),(25,'Đáng để đọc',_binary '\0',1313,1313,'2020-04-01 00:00:00',257,'977075','Tuổi Thơ Dữ Dội',4,3),(26,'Đáng để đọc',_binary '\0',1414,1414,'2020-04-01 00:00:00',582,'969916','Chí Phèo',1,4),(27,'Đáng để đọc',_binary '\0',1515,1515,'2020-04-01 00:00:00',584,'933461','Vợ Nhặt',5,5),(28,'Đáng để đọc',_binary '\0',1616,1616,'2020-04-01 00:00:00',295,'936047','Tắt Đèn',2,6),(29,'Đáng để đọc',_binary '\0',1717,1717,'2020-04-01 00:00:00',238,'959362','Số Đỏ',4,7),(30,'Đáng để đọc',_binary '\0',1818,1818,'2020-04-01 00:00:00',586,'980367','Bỉ Vỏ',5,1),(31,'Đáng để đọc',_binary '\0',2425,2425,'2020-04-01 00:00:00',285,'919433','Cánh Đồng Bất Tận',6,4),(32,'Đáng để đọc',_binary '\0',2324,2324,'2020-04-01 00:00:00',294,'911210','Nỗi Buồn Chiến Tranh',7,5),(33,'Đáng để đọc',_binary '\0',2523,2523,'2020-04-01 00:00:00',258,'926820','Giông Tố',8,7),(34,'Đáng để đọc',_binary '\0',612,612,'2020-04-01 00:00:00',284,'985127','Sống Mòn',9,8),(35,'Đáng để đọc',_binary '\0',4252,4252,'2020-04-01 00:00:00',285,'976360','Vỡ Đê',10,2),(36,'Đáng để đọc',_binary '\0',2324,2324,'2020-04-01 00:00:00',238,'947240','Bước Đường Cùng',2,1),(37,'Đáng để đọc',_binary '\0',2423,2423,'2020-04-01 00:00:00',565,'930904','Con Hoang',4,5),(38,'Đáng để đọc',_binary '\0',1244,1244,'2020-04-01 00:00:00',864,'926373','Chuyện Nhà Quê',2,6),(39,'Đáng để đọc',_binary '\0',5234,5234,'2020-04-01 00:00:00',925,'963252','Quảng Trị 1972',3,7),(40,'Đáng để đọc',_binary '\0',2523,2523,'2020-04-01 00:00:00',248,'946229','Bến Không Chồng',6,1),(41,'Đáng để đọc',_binary '\0',626,626,'2020-04-01 00:00:00',582,'983496','Hà Nội 36 Phố Phường',4,2),(42,'Đáng để đọc',_binary '\0',125,125,'2020-04-01 00:00:00',241,'959590','Nhật ký Đặng Thị Thùy Trâm',5,4),(43,'Đáng để đọc',_binary '\0',671,671,'2020-04-01 00:00:00',125,'976387','Hà Nội Lầm Than',1,3),(44,'Đáng để đọc',_binary '\0',125,125,'2020-04-01 00:00:00',243,'915747','Tố Tâm',9,7),(45,'Đáng để đọc',_binary '\0',232,232,'2020-04-01 00:00:00',582,'980057','Vàng Và Máu',8,8),(46,'Đáng để đọc',_binary '\0',252,252,'2020-04-01 00:00:00',586,'970738','Thương Nhớ Mười Hai',8,1),(47,'Đáng để đọc',_binary '\0',252,252,'2020-04-01 00:00:00',293,'930734','Những Ngày Thơ Ấu',8,7),(48,'Đáng để đọc',_binary '\0',234,234,'2020-04-01 00:00:00',582,'959733','Việc Làng',1,8),(49,'Đáng để đọc',_binary '\0',1512,1512,'2020-04-01 00:00:00',293,'973376','Bốn Mươi Năm Nói Láo',4,9),(50,'Đáng để đọc',_binary '\0',606,606,'2020-04-01 00:00:00',100,'979932','Thành Phố Thông Minh – Nền Tảng, Nguyên Lý Và Ứng Dụng',1,5);
/*!40000 ALTER TABLE `books` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customers`
--

DROP TABLE IF EXISTS `customers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customers` (
  `id_customers` bigint NOT NULL AUTO_INCREMENT,
  `address_customers` varchar(255) DEFAULT NULL,
  `email_customers` varchar(255) DEFAULT NULL,
  `first_name_customers` varchar(255) DEFAULT NULL,
  `last_name_customers` varchar(255) DEFAULT NULL,
  `phone_customers` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_customers`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customers`
--

LOCK TABLES `customers` WRITE;
/*!40000 ALTER TABLE `customers` DISABLE KEYS */;
INSERT INTO `customers` VALUES (1,'HN','hao@gmail.com','Tran Anh','Hao','0985723472'),(2,'HD','huan@gmail.com','Tran Tan','Huan','0928428785'),(3,'ND','huyen@gmail.com','Nguyen Thi','Huyen','0982588234'),(4,'HD','duong@gmail.com','Nguyen Hoang','Duong','0912688523'),(5,'QN','nam@gmail.com','Nguyen Hong','Nam','0985288585');
/*!40000 ALTER TABLE `customers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `orders` (
  `id_orders` bigint NOT NULL AUTO_INCREMENT,
  `created_date` datetime DEFAULT NULL,
  `id_customers` bigint DEFAULT NULL,
  PRIMARY KEY (`id_orders`),
  KEY `FKtcdy8p4r478ib6va1j1nc0dnn` (`id_customers`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `publishers`
--

DROP TABLE IF EXISTS `publishers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `publishers` (
  `id_publisher` bigint NOT NULL AUTO_INCREMENT,
  `address_publisher` varchar(255) DEFAULT NULL,
  `founded_year` int NOT NULL,
  `founder_name` varchar(255) DEFAULT NULL,
  `name_publisher` varchar(255) DEFAULT NULL,
  `website_publisher` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_publisher`)
) ENGINE=MyISAM AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `publishers`
--

LOCK TABLES `publishers` WRITE;
/*!40000 ALTER TABLE `publishers` DISABLE KEYS */;
INSERT INTO `publishers` VALUES (1,'Số 6 Ngõ 86 Duy Tân, Dịch Vọng Hậu, Cầu Giấy, Hà Nội',2012,'Phạm Minh Tuấn','Nhà xuất bản Chính trị quốc gia Sự thật','https://www.nxbctqg.org.vn/'),(2,'Số 35 Trần Quốc Toản, Hoàn Kiếm, Hà Nội - Việt Nam',2022,'Hồ Quang Huy',' Nhà xuất bản Tư pháp','https://nxbtuphap.moj.gov.vn/'),(3,'23 Lý Nam Đế, Hoàn Kiếm, Hà Nội',1950,'Đậu Xuân Luận','Nhà xuất bản Quân đội','http://nxbqdnd.com.vn/'),(4,' Số 55 Quang Trung, Nguyễn Du, Hai Bà Trưng, Hà Nội',1956,'Bùi Tuấn Nghĩa',' Nhà xuất bản Kim Đồng','https://nxbkimdong.com.vn/'),(5,'64 Bà Triệu, Trần Hưng Đạo, Hoàn Kiếm, Hà Nội',1954,'Bùi Quang Huy','Nhà xuất bản Thanh niên','https://www.nhaxuatbanthanhnien.vn/pages/frontpage'),(6,'175 Giảng Võ, Q. Đống Đa, Hà Nội',1956,'Võ Thị Kim Thanh','Nhà xuất bản Lao động','http://www.nxblaodong.com.vn/'),(7,' 207 Giải Phóng, Đồng Tâm, Hai Bà Trưng, Hà Nội',2005,'Nguyễn Anh Tú','Nhà xuất bản Đại học kinh tế quốc dân','https://nxb.neu.edu.vn/'),(8,' Nhà E – Ngõ 17 – Tạ Quang Bửu – Hai Bà Trưng – Hà Nội.',2005,'Ngụy Thị Liễu','Nhà xuất bản Đại học Bách khoa Hà Nội','http://nxbbk.hust.edu.vn/'),(9,'16 P. Hàng Chuối, Phạm Đình Hổ, Hai Bà Trưng, Hà Nội 100000',1995,'Phạm Thị Trâm','Nhà xuất bản Đại học Quốc gia Hà Nội','https://press.vnu.edu.vn/gioi-thieu/'),(10,'Phòng 501, Nhà Điều hành ĐHQG-HCM, phường Linh Trung, quận Thủ Đức, TP Hồ Chí Minh',1999,'Đỗ Văn Biên','Nhà xuất bản Đại học Quốc gia thành phố Hồ Chí Minh','https://vnuhcmpress.edu.vn/');
/*!40000 ALTER TABLE `publishers` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-05-26 23:28:53
