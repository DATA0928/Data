-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 13, 2025 at 08:08 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `apartment (2)`
--

-- --------------------------------------------------------

--
-- Table structure for table `amenities`
--

CREATE TABLE `amenities` (
  `ID` int(11) NOT NULL,
  `name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `costs` decimal(10,0) NOT NULL,
  `describe` text CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `amenities`
--

INSERT INTO `amenities` (`ID`, `name`, `costs`, `describe`) VALUES
(1, 'Hồ bơi', 0, 'Hồ bơi ngoài trời.'),
(2, 'Gym', 0, 'Phòng tập thể dục với trang thiết bị hiện đại.'),
(3, 'Khu vui chơi trẻ em', 0, 'Không gian vui chơi an toàn cho trẻ em.'),
(4, 'Phòng sinh hoạt cộng đồng', 0, 'Phòng họp và tổ chức sự kiện nhỏ.'),
(5, 'Sân vườn BBQ', 0, 'Khu vực tổ chức tiệc ngoài trời'),
(6, 'Sân thể dục, thể thao', 0, 'Sân chơi hiện đại, sạch sẽ.');

-- --------------------------------------------------------

--
-- Table structure for table `apartment`
--

CREATE TABLE `apartment` (
  `ID` int(11) NOT NULL,
  `name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `describe` text CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `price` decimal(15,0) NOT NULL,
  `typeID` int(11) NOT NULL,
  `area` decimal(10,0) NOT NULL,
  `bedroom` int(10) NOT NULL,
  `bathroom` int(10) NOT NULL,
  `toilet` int(10) NOT NULL,
  `interior` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `legal` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `addressID` int(11) NOT NULL,
  `userID` int(11) NOT NULL,
  `posted_date` datetime NOT NULL,
  `categoryID` int(11) NOT NULL,
  `amenitiesID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `apartment`
--

INSERT INTO `apartment` (`ID`, `name`, `describe`, `price`, `typeID`, `area`, `bedroom`, `bathroom`, `toilet`, `interior`, `legal`, `addressID`, `userID`, `posted_date`, `categoryID`, `amenitiesID`) VALUES
(1, 'Dự án Vinhomes Central Park.', 'Số phòng ngủ: 1pn+\r\nNhà vệ sinh: 1\r\nDiện tích: 54m2\r\nTiện ích: Hồ bơi, sân bóng gỗ, sân bóng chuyền,sân tennis', 1350000000, 1, 54, 1, 1, 1, 'Full nội thất', 'Sổ đỏ và sổ hồng', 1, 1, '2024-07-18 19:00:44', 1, 1),
(2, 'S103, Vinhome Ocen Park.', 'Số phòng ngủ: 2pn1Wc\r\nNhà vệ sinh: 1\r\nDiện tích: 59m2\r\nTiện ích: Hồ bơi, sân bóng gỗ, sân bóng chuyền,sân tennis.', 2300000000, 1, 59, 2, 1, 1, 'Nội thất nhập khẩu', 'Sổ đỏ và sổ hồng', 2, 2, '2022-05-19 18:09:01', 1, 2),
(3, 'S302, Vinhome Central Park.', 'Số phòng ngủ: 2pn2Wc\r\nNhà vệ sinh: 2\r\nDiện tích: 68m2\r\nTiện ích: Hồ bơi, sân bóng gỗ, sân bóng chuyền,sân tennis.', 2600000000, 1, 68, 2, 2, 2, 'Full nội thất', 'Sổ đỏ và sổ hồng', 3, 3, '2024-02-24 18:13:27', 1, 3),
(4, 'S702, Nguyễn Xiển, Vinhome GrandPark Q9.', 'Số phòng ngủ: 2pn1Wc\r\nNhà vệ sinh: 1\r\nDiện tích: 59m2\r\nTiện ích: Hồ bơi, sân bóng gỗ, sân bóng chuyền,sân tennis.', 2900000000, 1, 59, 2, 1, 1, 'Full nội thất', 'Sổ dỏ và sổ hồng', 4, 4, '2024-03-24 18:17:43', 1, 4),
(5, 'S803, Vinhome Ocen Park.', 'Số phòng ngủ: 2pn2Wc\r\nNhà vệ sinh: 2\r\nDiện tích: 69m2\r\nTiện ích: Hồ bơi, sân bóng gỗ, sân bóng chuyền,sân tennis', 3100000000, 1, 69, 2, 2, 2, 'Nội thất nhập khẩu', 'Sổ đỏ và sổ hồng', 5, 5, '2025-01-13 18:57:50', 1, 5),
(6, 'S302, Vinhome Central Park', 'Số phòng ngủ: 1pn1Wc\r\nNhà vệ sinh: 1\r\nDiện tích: 59m2\r\nTiện ích: Hồ bơi, sân bóng gỗ, sân bóng chuyền,sân tennis', 2300000000, 1, 59, 1, 1, 1, 'Nội thất cơ bản', 'Sổ đỏ và sổ hồng', 6, 6, '2024-12-17 18:59:18', 1, 6),
(7, 'A3,Vinhome GrandPark Q9.', 'Số phòng ngủ: 1pn1Wc\r\nNhà vệ sinh: 1\r\nDiện tích: 59m2\r\nTiện ích: Hồ bơi, sân bóng gỗ, sân bóng chuyền,sân tennis,phòng gym', 4900000000, 1, 59, 1, 1, 1, 'Nội thất cơ bản', 'Sổ đỏ và sổ hồng', 7, 7, '2023-06-07 19:00:32', 1, 1),
(8, 'A2,Vinhome GrandPark Q9', 'Số phòng ngủ: 2pn1Wc\r\nNhà vệ sinh: 1\r\nDiện tích: 67m2\r\nTiện ích: Hồ bơi, sân bóng gỗ, sân bóng chuyền,sân tennis, phòng gym.', 5300000000, 1, 67, 2, 1, 1, 'Nội thất cơ bản', 'Sổ đỏ và sổ hồng', 8, 8, '2024-12-09 19:01:57', 1, 2),
(9, 'T1 Master', 'Số phòng ngủ: 2pn2Wc\r\nNhà vệ sinh: 2\r\nDiện tích: 78m2\r\nTiện ích: Hồ bơi, sân bóng gỗ, sân bóng chuyền,sân tennis, phòng gym.', 6200000000, 1, 78, 2, 2, 2, 'Full nội thất', 'Sổ đỏ và sổ hồng', 9, 9, '2023-07-05 19:04:56', 1, 3),
(10, 'B3, Vinhome GrandPark.', 'Số phòng ngủ: 1pn1WC\r\nNhà vệ sinh: 1\r\nDiện tích: 68m2\r\nTiện ích: Hồ bơi, sân bóng gỗ, sân bóng chuyền,sân tennis, phòng gym, phòng xông hơi', 6490000000, 1, 68, 1, 1, 1, 'Nội thất cơ bản', 'Sổ đỏ và sổ hồng', 10, 10, '2024-09-16 19:07:28', 1, 4),
(11, 'B3, Vinhome GrandPark, Q9', 'Số tầng: 2 tầng\r\nNhà vệ sinh: 3\r\nDiện tích: 78m2\r\nTiện ích: view thoáng mát, gần các chợ', 7800000000, 1, 79, 2, 2, 2, 'Nội thất cơ bản', 'Sổ đỏ và sổ hồng', 11, 11, '2023-11-13 19:09:23', 1, 5),
(12, 'B3, Vinhome GrandPark, Q9', 'Số tầng: 2 tầng\r\nNhà vệ sinh: 2\r\nDiện tích: 59m2\r\nTiện ích: view thoáng mát, có sân, gần siêu thị, chợ', 8400000000, 1, 87, 3, 2, 2, 'Nội thất cơ bản', 'Sổ đỏ và sổ hồng', 12, 12, '2023-05-22 19:13:33', 1, 6),
(13, '112, Phường 11, Quận 5, TP.Hồ Chí Minh', 'Số tầng: 3 tầng\r\nNhà vệ sinh: 4\r\nDiện tích: 90m2\r\nSố tầng: 2 tầng\r\nNhà vệ sinh: 3\r\nDiện tích: 78m2\r\nTiện ích: view thoáng mát, gần các chợ', 1300000000, 1, 78, 3, 2, 2, 'Full nội thất', 'Sổ đỏ và sổ hồng', 13, 13, '2023-01-17 19:15:07', 1, 1),
(14, 'Đường Nguyễn Văn Linh, Hải Châu, Đà Nẵng', 'Số tầng: 2 lầu\r\nNhà vệ sinh: 2\r\nDiện tích: 70m2\r\nTiện ích: view thoáng mát, gần siêu thị, chợ, trường học.', 9990000000, 1, 59, 2, 2, 2, 'Nội thất cơ bản', 'Sổ đỏ và sổ hồng', 14, 14, '2024-10-21 19:17:34', 1, 2),
(15, 'Phạm Văn Chiêu, Phường 9, Gò Vấp, TP. Hồ Chí Minh', 'Số tầng: 3 tầng\r\nSố tầng: 3 tầng\r\nNhà vệ sinh: 4\r\nDiện tích: 90m2\r\nTiện ích: view thoáng mát, có sân, gần siêu thị, chợ\r\nDiện tích: 100m2\r\nTiện ích: view thoáng mát, gần Chợ, Gần bệnh viện, trường học', 1500000000, 1, 90, 4, 3, 3, 'Nội thất cơ bản', 'Sổ đỏ và sổ hồng', 15, 15, '2023-01-01 19:19:27', 1, 3),
(16, 'Đường số 10, An Bình, Dĩ An,Bình Dương', 'Số tầng: 2 lầu\r\nNhà vệ sinh: 2\r\nDiện tích: 70m2\r\nTiện ích: view thoáng mát, gần siêu thị, chợ, trường học', 8850000000, 1, 59, 2, 2, 1, 'Nội thất cơ bản', 'Sổ hồng và sổ đỏ', 16, 16, '2022-01-03 19:21:11', 1, 4),
(17, '28 Đường Thi Sách,Phường 8, Vũng Tàu', 'Số tầng: 1 trệt\r\nNhà vệ sinh: 1\r\nDiện tích: 59m2\r\nTiện ích: view thoáng mát, gần siêu thị, cách bãi sau 5 phút', 6000000000, 1, 59, 2, 1, 1, 'Nội thất nhập khẩu', 'Sổ hồng và sổ đỏ', 17, 17, '2022-05-16 19:22:17', 1, 5),
(18, 'Đường Phạm Thế Hiển, Phường 6, Quận 8\r\nĐường Phạm Thế Hiển, Phường 6, Quận 8\r\nĐường Phạm Thế Hiển, P', 'Số tầng: 3 tầng\r\nNhà vệ sinh: 3\r\nDiện tích: 100m2\r\nSố tầng: 2 tầng\r\nNhà vệ sinh: 2\r\nDiện tích: 59m2\r\nTiện ích: view thoáng mát, gần Chợ, Gần bệnh viện, trường học', 9000000000, 1, 59, 2, 1, 1, 'Nội thất nhập khẩu', 'Sổ hồng và sổ đỏ', 18, 18, '2021-07-01 19:23:42', 1, 6),
(19, 'Đại Dương, Đa Tốn, Gia Lâm, Hà Nội', 'Số tầng: 3 tầng\r\nNhà vệ sinh: 3\r\nDiện tích: 100m2\r\nTiện ích: view thoáng mát, gần Chợ, Gần bệnh viện, trường học', 8990000000, 1, 100, 4, 3, 3, 'Nội thất cơ bản', 'Sổ hồng và sổ đỏ', 19, 19, '2021-04-07 19:24:54', 1, 1),
(20, '3 Đ.Nguyễn Du, Bình Hòa, Thuận An, Bình Dương', 'Số tầng: 2 tầng\r\nNhà vệ sinh: 2\r\nDiện tích: 92m2\r\nTiện ích: view thoáng mát, gần Chợ, Gần bệnh viện, trường học', 6950000000, 1, 92, 3, 2, 2, 'Nội thất cơ bản', 'Sổ hồng và sổ đỏ', 20, 20, '2024-03-01 19:26:23', 1, 2),
(21, 'S103, Vinhome Central Park, Bình Thạnh, TP.Hồ Chí Minh', 'Số phòng ngủ: 2pn1Wc\r\nNhà vệ sinh: 1\r\nDiện tích: 59m2\r\nTiện ích: Hồ bơi, sân bóng gỗ, sân bóng chuyền,sân tennis', 5300000000, 1, 59, 2, 1, 1, 'Nội thất nhập khẩu', 'Sổ hồng và sổ đỏ', 21, 21, '2025-08-22 19:27:40', 1, 3),
(22, 'Đường Lê Văn Thọ, Phường 11, Gò Vấp, TP.Hồ Chí Minh', 'Số tầng: 3 tầng\r\nNhà vệ sinh: 2\r\nDiện tích: 112m2\r\nTiện ích: view thoáng mát, gần Chợ, Gần bệnh viện, trường học', 1200000000, 1, 112, 3, 2, 2, 'Nội thất cơ bản', 'Sổ hồng và sổ đỏ', 22, 22, '2023-05-15 19:29:02', 1, 4),
(23, 'Đường Nguyễn Thái Sơn, Phường 3, Gò Vấp, TP.Hồ Chí Minh', 'Số Tầng: 1 Trệt\r\nNhà vệ sinh: 1\r\nDiện tích: 75m2\r\nTiện ích: view thoáng mát, gần Chợ, Gần bệnh viện, trường học', 7000000000, 1, 75, 3, 2, 2, 'Nội thất nhập khẩu', 'Sổ hồng và sổ đỏ', 23, 23, '2021-03-04 19:44:12', 1, 5),
(24, 'T2, Masteri Thảo Điền, Quận 2, TP. Hồ Chí Minh', 'Số phòng ngủ: 3pn2wc\r\nNhà vệ sinh: 2\r\nDiện tích: 80m2\r\nTiện ích: Hồ bơi, sân bóng gỗ, sân bóng chuyền,sân tennis, phòng xông hơi', 6300000000, 1, 59, 20, 1, 1, 'Nội thất nhập khẩu', 'Sổ hồng và sổ đỏ', 24, 24, '2023-10-02 19:45:53', 1, 6),
(25, 'T2, Masteri Thảo Điền, Quận 2, TP. Hồ Chí Minh', 'Số phòng ngủ: 2pn1Wc\r\nNhà vệ sinh: 1\r\nDiện tích: 59m2\r\nTiện ích: Hồ bơi, sân bóng gỗ, sân bóng chuyền,sân tennisSố phòng ngủ: 2pn1Wc\r\nNhà vệ sinh: 1\r\nDiện tích: 69m2\r\nTiện ích: Hồ bơi, sân bóng gỗ, sân bóng chuyền,sân tennis', 4300000000, 1, 69, 2, 1, 1, 'Nội thất nhập khẩu', 'Sổ hồng và sổ đỏ', 25, 25, '2021-07-07 19:49:08', 1, 1),
(26, 'S103, Vinhome Ocen Park, Đại Dương, Đa Tốn, Gia Lâm, Hà Nội', 'Số phòng ngủ: 2pn1Wc\r\nNhà vệ sinh: 1\r\nDiện tích: 59m2\r\nTiện ích: Hồ bơi, sân bóng gỗ, sân bóng chuyền,sân tennis', 2300000000, 1, 59, 2, 1, 1, 'Nội thất nhập khẩu', 'Sổ hồng và sổ đỏ', 26, 26, '2024-04-28 19:50:33', 1, 2),
(27, 'B2,Vinhome GranPark Q9', 'Số phòng ngủ: 2pn1Wc\r\nNhà vệ sinh: 1\r\nDiện tích: 59m2\r\nTiện ích: Hồ bơi, sân bóng gỗ, sân bóng chuyền,sân tennis', 2300000000, 1, 59, 2, 1, 1, 'Nội thất nhập khẩu', 'Sổ hồng và sổ đỏ', 27, 27, '2024-09-15 19:51:29', 1, 3),
(28, 'S103, Vinhome Ocen Park', 'Số phòng ngủ: 2pn1Wc\r\nNhà vệ sinh: 1\r\nDiện tích: 59m2\r\nTiện ích: Hồ bơi, sân bóng gỗ, sân bóng chuyền,sân tennis', 4300000000, 1, 59, 2, 1, 1, 'Nội thất nhập khẩu', 'Sổ hồng và sổ đỏ', 28, 28, '2025-01-07 19:52:22', 1, 4),
(29, 'S303, Vinhome Ocen Park', 'Số phòng ngủ: 2pn1Wc\r\nNhà vệ sinh: 1\r\nDiện tích: 59m2\r\nTiện ích: Hồ bơi, sân bóng gỗ, sân bóng chuyền,sân tennis', 2300000000, 1, 59, 2, 1, 1, 'Nội thất nhập khẩu', 'Sổ hồng và sổ đỏ', 29, 29, '2023-12-10 19:53:22', 1, 5),
(30, 'S203, Vinhome Ocen Park', 'Số phòng ngủ: 2pn1Wc\r\nNhà vệ sinh: 1\r\nDiện tích: 59m2\r\nTiện ích: Hồ bơi, sân bóng gỗ, sân bóng chuyền,sân tennis', 2300000000, 1, 59, 2, 1, 1, 'Full nội thất', 'Sổ hồng và sổ đỏ', 30, 30, '2024-07-01 19:55:20', 1, 6),
(31, 'S303, Vinhome Ocen Park', 'Số phòng ngủ: 2pn1Wc\r\nNhà vệ sinh: 1\r\nDiện tích: 59m2\r\nTiện ích: Hồ bơi, sân bóng gỗ, sân bóng chuyền,sân tennis', 2300000000, 1, 59, 2, 1, 1, 'Full nội thất', 'Sổ hồng và sổ đỏ', 31, 31, '2023-03-22 19:56:44', 1, 1),
(32, 'S503, Vinhome Ocen Park', 'Số phòng ngủ: 2pn1Wc\r\nNhà vệ sinh: 1\r\nDiện tích: 59m2\r\nTiện ích: Hồ bơi, sân bóng gỗ, sân bóng chuyền,sân tennis', 2300000000, 1, 59, 2, 1, 1, 'Nội thất nhập khẩu', 'Sổ hồng và sổ đỏ', 32, 32, '2023-01-04 19:57:48', 1, 2),
(33, 'S105, Vinhome Ocen Park', 'Số phòng ngủ: 2pn1Wc\r\nNhà vệ sinh: 1\r\nDiện tích: 59m2\r\nTiện ích: Hồ bơi, sân bóng gỗ, sân bóng chuyền,sân tennis', 2300000000, 1, 120, 6, 5, 5, 'Nội thất nhập khẩu', 'Sổ hồng và sổ đỏ', 33, 33, '2024-12-31 12:34:25', 1, 3),
(34, 'Trần Phú, Lộc Thọ, Nha Trang,Khánh Hòa', 'Số tầng: 3 tầng\r\nNhà vệ sinh: 2\r\nDiện tích: 100m2\r\nTiện ích: View biển, gần bãi trước và bãi sau', 9999999999, 1, 1230, 4, 0, 0, 'Full nội thất', 'ư', 34, 34, '2025-01-07 13:28:46', 1, 4),
(35, 'Thùy Vân, Phường 2, Vũng Tàu', 'Số tầng: 3 tầng\r\nNhà vệ sinh: 2\r\nDiện tích: 100m2\r\nTiện ích: View biển, gần bãi trước và bãi sau', 9000000000, 1, 100, 5, 4, 4, 'Nội thất nhập khẩu', 'Sổ hồng và sổ đỏ', 35, 35, '2024-01-17 13:39:01', 1, 5),
(36, 'S803, Vinhome Ocen Park', 'Số phòng ngủ: 2pn1Wc\r\nNhà vệ sinh: 1\r\nDiện tích: 59m2\r\nTiện ích: Hồ bơi, sân bóng gỗ, sân bóng chuyền,sân tennis', 3300000000, 1, 59, 2, 1, 1, 'Nội thất nhập khẩu', 'Sổ hồng và sổ đỏ', 36, 36, '2024-12-08 13:40:13', 1, 6),
(37, 'Masteri Thảo Điền', 'Số phòng ngủ: 1pn+\r\nNhà vệ sinh: 1\r\nDiện tích: 54m2\r\nTiện ích: Hồ bơi, sân bóng gỗ, sân bóng chuyền,sân tennis', 11000000, 1, 54, 1, 1, 1, 'Full nội thất', 'Không sổ', 37, 37, '2024-10-24 07:28:04', 2, 5),
(38, 'S103, Vinhome Ocen Park', 'Số phòng ngủ: 2pn1Wc\r\nNhà vệ sinh: 1\r\nDiện tích: 59m2\r\nTiện ích: Hồ bơi, sân bóng gỗ, sân bóng chuyền,sân tennis', 8000000, 1, 59, 2, 1, 1, 'Nội thất nhập khẩu', 'Không sổ', 38, 38, '2024-09-09 13:33:03', 2, 1),
(39, 'S302, Vinhome Central Park', 'Số phòng ngủ: 1pn1Wc\r\nNhà vệ sinh: 1\r\nDiện tích: 59m2\r\nTiện ích: Hồ bơi, sân bóng gỗ, sân bóng chuyền,sân tennis\r\n', 6000000, 1, 59, 2, 1, 1, 'Nội thất cơ bản', 'Không sổ', 39, 39, '2025-01-13 07:38:46', 2, 1),
(40, 'S702, Nguyễn Xiển, Vinhome GrandPark Q9', 'Số phòng ngủ: 2pn1Wc\r\nNhà vệ sinh: 1\r\nDiện tích: 59m2\r\nTiện ích: Hồ bơi, sân bóng gỗ, sân bóng chuyền,sân tennis', 25000000, 1, 59, 2, 1, 1, 'Full nội thất', 'Không sổ', 40, 40, '2025-01-13 08:42:08', 2, 1),
(41, 'S803, Vinhome GrandPark,Q9', 'Số phòng ngủ: 2pn2Wc\r\nNhà vệ sinh: 2\r\nDiện tích: 69m2\r\nTiện ích: Hồ bơi, sân bóng gỗ, sân bóng chuyền,sân tennis', 8000000, 1, 69, 2, 2, 2, 'Full nội thất nhập khẩu', 'Không sổ ', 41, 41, '2024-11-10 19:55:12', 2, 3),
(42, 'S302, Vinhome Central Park', 'Số phòng ngủ: 1pn1Wc\r\nNhà vệ sinh: 1\r\nDiện tích: 59m2\r\nTiện ích: Hồ bơi, sân bóng gỗ, sân bóng chuyền,sân tennis', 6000000, 1, 59, 1, 1, 1, 'Nội thất cơ bản', 'Không sổ', 42, 42, '2025-01-13 13:55:12', 2, 2),
(43, 'A3,Vinhome GrandPark Q9', 'Số phòng ngủ: 1pn1Wc\r\nNhà vệ sinh: 1\r\nDiện tích: 59m2\r\nTiện ích: Hồ bơi, sân bóng gỗ, sân bóng chuyền,sân tennis,phòng gym', 7000000, 7, 59, 1, 1, 1, 'Nội thất cơ bản', 'Không sổ ', 43, 43, '2024-11-11 20:00:59', 2, 4),
(44, 'A2,Vinhome Grand Park Q9', 'Số phòng ngủ: 2pn1Wc\r\nNhà vệ sinh: 1\r\nDiện tích: 67m2\r\nTiện ích: Hồ bơi, sân bóng gỗ, sân bóng chuyền,sân tennis, phòng gym', 8000000, 3, 67, 2, 1, 1, 'Nội thất cơ bản', 'Không sổ ', 44, 44, '2025-01-13 15:03:42', 2, 4),
(45, 'T1 Masteri', 'Số phòng ngủ: 2pn2Wc\r\nNhà vệ sinh: 2\r\nDiện tích: 78m2\r\nTiện ích: Hồ bơi, sân bóng gỗ, sân bóng chuyền,sân tennis, phòng gym', 12000000, 3, 78, 2, 2, 2, 'Full nội thất', 'Không sổ', 45, 45, '2025-01-13 15:03:42', 2, 3),
(46, 'B3, Vinhome GrandPark, Q9', 'Số phòng ngủ: 1pn1WC\r\nNhà vệ sinh: 1\r\nDiện tích: 68m2\r\nTiện ích: Hồ bơi, sân bóng gỗ, sân bóng chuyền,sân tennis, phòng gym, phòng xông hơi', 8000000, 3, 68, 1, 1, 1, 'Nội thất cơ bản', 'Không sổ ', 46, 46, '2025-01-13 15:08:33', 2, 2),
(47, 'B3, Vinhome GrandPark, Q9', 'Số phòng ngủ: 2pn2Wc\r\nNhà vệ sinh: 2\r\nDiện tích: 79m2\r\nTiện ích: Hồ bơi, sân bóng gỗ, sân bóng chuyền,sân tennis, phòng gym, phòng xông hơi', 7800000, 3, 79, 2, 2, 2, 'Nội thất cơ bản', 'Không sổ', 47, 47, '2025-01-13 15:08:33', 2, 3),
(48, 'B3, Vinhome GrandPark, Q9', 'Số phòng ngủ: 3pn2Wc\r\nNhà vệ sinh: 2\r\nDiện tích: 87m2\r\nTiện ích: Hồ bơi, sân bóng gỗ, sân bóng chuyền,sân tennis, phòng gym, phòng xông hơi', 8400000, 4, 87, 3, 2, 2, 'Nội thất cơ bản', 'Không sổ ', 48, 48, '2025-01-13 15:11:06', 2, 5),
(49, '112, Phường 11, Quận 5, TP.Hồ Chí Minh', 'Số tầng: 2 tầng\r\nNhà vệ sinh: 3\r\nDiện tích: 78m2\r\nTiện ích: view thoáng mát, gần các chợ', 13000000, 4, 78, 4, 3, 3, 'Full nội thất', 'Không sổ', 49, 49, '2025-01-13 15:11:06', 2, 1),
(50, 'Đường Nguyễn Văn Linh, Hải Châu, Đà Nẵng', 'Số tầng: 2 tầng\r\nNhà vệ sinh: 2\r\nDiện tích: 59m2\r\nTiện ích: view thoáng mát, có sân, gần siêu thị, chợ', 10000000, 4, 59, 3, 2, 2, 'Full nội thất', 'Không sổ ', 50, 50, '2025-01-13 18:06:03', 2, 3),
(51, 'Phạm Văn Chiêu, Phường 9, Gò Vấp, TP. Hồ Chí Minh', 'Số tầng: 3 tầng\r\nNhà vệ sinh: 4\r\nDiện tích: 90m2\r\nTiện ích: view thoáng mát, có sân, gần siêu thị, chợ', 15350000, 4, 90, 4, 4, 4, 'Nội thất cơ bản', 'Không sổ', 51, 51, '2025-01-13 18:06:03', 2, 4),
(52, 'Đường số 10, An Bình, Dĩ An,Bình Dương\r\n', 'Số tầng: 2 lầu\r\nNhà vệ sinh: 2\r\nDiện tích: 70m2\r\nTiện ích: view thoáng mát, gần siêu thị, chợ, trường học', 8850000, 5, 70, 3, 2, 2, 'Full nội thất', 'Không sổ ', 52, 52, '2024-10-30 00:08:39', 2, 6),
(53, '28 Đường Thi Sách,Phường 8, Vũng Tàu', 'Số tầng: 1 trệt\r\nNhà vệ sinh: 1\r\nDiện tích: 59m2\r\nTiện ích: view thoáng mát, gần siêu thị, cách bãi sau 5 phút', 6000000, 5, 59, 2, 1, 1, 'Full nội thất ', 'Không sổ', 53, 53, '2025-01-13 18:08:39', 2, 4),
(54, 'Đường Phạm Thế Hiển, Phường 6, Quận 8', 'Số tầng: 2 tầng\r\nNhà vệ sinh: 2\r\nDiện tích: 59m2\r\nTiện ích: view thoáng mát, gần Chợ, Gần bệnh viện, trường học', 9000000, 5, 59, 3, 2, 2, 'Full nội thất', 'Không sổ ', 54, 54, '2025-01-13 18:11:02', 2, 4),
(55, 'Đại Dương, Đa Tốn, Gia Lâm, Hà Nội', 'Số tầng: 3 tầng\r\nNhà vệ sinh: 3\r\nDiện tích: 100m2\r\nTiện ích: view thoáng mát, gần Chợ, Gần bệnh viện, trường học', 8990000, 5, 100, 5, 3, 3, 'Nội thất cơ bản', 'Không sổ', 55, 55, '2025-01-13 18:11:02', 2, 3),
(57, 'S103, Vinhome Central Park, ', 'Số phòng ngủ: 2pn1Wc\r\nNhà vệ sinh: 1\r\nDiện tích: 59m2\r\nTiện ích: Hồ bơi, sân bóng gỗ, sân bóng chuyền,sân tennis', 5300000, 1, 59, 2, 1, 1, 'Full nội thất', 'Không sổ ', 57, 59, '2025-01-13 18:13:20', 2, 4),
(58, 'Đường Lê Văn Thọ, Phường 11, Gò Vấp, TP.Hồ Chí Minh', 'Số tầng: 3 tầng\r\nNhà vệ sinh: 2\r\nDiện tích: 112m2\r\nTiện ích:', 11300000, 5, 112, 5, 2, 2, 'Full nội thất nhập khẩu', 'Không sổ', 58, 58, '2025-01-13 18:13:20', 2, 6),
(59, 'Đường Nguyễn Thái Sơn, Phường 3, Gò Vấp, TP.Hồ Chí Minh', 'Số tầng: 2 tầng\r\nNhà vệ sinh: 2\r\nDiện tích: 98m2\r\nTiện ích: view thoáng mát, gần Chợ, Gần bệnh viện, trường học', 12000000, 5, 98, 3, 2, 2, 'Full nội thất', 'Không sổ ', 59, 59, '2025-01-13 18:18:17', 2, 6),
(60, '1/32, Đường Thuận Giao 21, Thuận Giao, Thuận An,Bình Dương', 'Số Tầng: 1 Trệt\r\nNhà vệ sinh: 1\r\nDiện tích: 75m2\r\nTiện ích: view thoáng mát, gần Chợ, Gần bệnh viện, trường học', 7000000, 10, 75, 3, 1, 1, 'Nội thất cơ bản', 'Không sổ', 60, 60, '2025-01-13 18:18:17', 2, 5),
(61, 'T2, Masteri Thảo Điền', 'Số phòng ngủ: 3pn2wc\r\nNhà vệ sinh: 2\r\nDiện tích: 80m2\r\nTiện ích: Hồ bơi, sân bóng gỗ, sân bóng chuyền,sân tennis, phòng xông hơi', 6300000, 6, 80, 3, 2, 2, 'Full nội thất nhập khẩu', 'Không sổ ', 61, 61, '2025-01-13 18:20:51', 2, 5),
(62, 'S103, Vinhome Ocen Park', 'Số phòng ngủ: 2pn1Wc\r\nNhà vệ sinh: 1\r\nDiện tích: 69m2\r\nTiện ích: Hồ bơi, sân bóng gỗ, sân bóng chuyền,sân tennis', 4300000, 4, 69, 2, 1, 1, 'Nội thất cơ bản', 'Không sổ', 62, 62, '2025-01-13 18:20:51', 2, 6),
(63, 'B2,Vinhome GranPark Q9.', 'Số phòng ngủ: 2pn1Wc\r\nNhà vệ sinh: 1\r\nDiện tích: 59m2\r\nTiện ích: Hồ bơi, sân bóng gỗ, sân bóng chuyền,sân tennis', 23000000, 6, 59, 2, 1, 1, 'Full nội thất nhập khẩu', 'Không sổ ', 63, 63, '2025-01-13 18:23:20', 2, 5),
(64, 'S103, Vinhome Ocen Park', 'Số phòng ngủ: 2pn1Wc\r\nNhà vệ sinh: 1\r\nDiện tích: 59m2\r\nTiện ích: Hồ bơi, sân bóng gỗ, sân bóng chuyền,sân tennis', 23000000, 9, 59, 2, 1, 1, 'Nội thất nhập khẩu', 'Không sổ ', 64, 64, '2025-01-13 18:24:24', 2, 5),
(65, 'S103, Vinhome Ocen Park ', 'Số phòng ngủ: 2pn1Wc\r\nNhà vệ sinh: 1\r\nDiện tích: 59m2\r\nTiện ích: Hồ bơi, sân bóng gỗ, sân bóng chuyền,sân tennis', 2300000, 5, 59, 2, 1, 1, 'Full nội thất nhập khẩu', 'Không sổ', 65, 65, '2025-01-13 18:24:24', 2, 6),
(66, 'S103, Vinhome Ocen Park', 'Số phòng ngủ: 2pn1Wc\r\nNhà vệ sinh: 1\r\nDiện tích: 59m2\r\nTiện ích: Hồ bơi, sân bóng gỗ, sân bóng chuyền,sân tennis', 23000000, 3, 59, 2, 1, 1, 'Nội thất nhập khẩu', 'Không sổ ', 66, 66, '2025-01-13 18:26:58', 2, 5),
(67, 'S103, Vinhome Ocen Park', 'Số phòng ngủ: 2pn1Wc\r\nNhà vệ sinh: 1\r\nDiện tích: 59m2\r\nTiện ích: Hồ bơi, sân bóng gỗ, sân bóng chuyền,sân tennis', 2300000, 5, 59, 2, 1, 1, 'Full nội thất nhập khẩu', 'Không sổ', 67, 67, '2025-01-13 18:26:58', 2, 5),
(68, 'S103, Vinhome Ocen Park', 'Số phòng ngủ: 2pn1Wc\r\nNhà vệ sinh: 1\r\nDiện tích: 59m2\r\nTiện ích: Hồ bơi, sân bóng gỗ, sân bóng chuyền,sân tennis', 23000000, 5, 59, 2, 1, 1, 'Full nội thất nhập khẩu', 'Không sổ ', 68, 68, '2025-01-13 18:29:55', 2, 4),
(69, 'S103, Vinhome Ocen Park', 'Số phòng ngủ: 2pn1Wc\r\nNhà vệ sinh: 1\r\nDiện tích: 59m2\r\nTiện ích: Hồ bơi, sân bóng gỗ, sân bóng chuyền,sân tennis', 2300000, 3, 59, 2, 1, 1, 'Full nội thất nhập khẩu', 'Không sổ', 69, 69, '2025-01-13 18:29:55', 2, 2),
(70, 'Trần Phú, Lộc Thọ, Nha Trang,Khánh Hòa', 'Số tầng: 3 tầng\r\nNhà vệ sinh: 1\r\nDiện tích: 59m2\r\nTiện ích: view thoáng mát, gần trường học, gần biển', 23000000, 10, 59, 2, 1, 1, 'Full nội thất ', 'Không sổ ', 70, 70, '2025-01-13 18:32:02', 2, 2),
(71, 'Thùy Vân, Phường 2, Vũng Tàu', 'Số tầng: 3 tầng\r\nNhà vệ sinh: 2\r\nDiện tích: 89m2\r\nTiện ích: View biển, gần bãi trước và bãi sau', 9000000, 4, 89, 4, 2, 2, 'Full nội thất nhập khẩu', 'Không sổ', 71, 71, '2025-01-13 18:32:02', 2, 1),
(72, 'S803, Vinhome Ocen Park', 'Số phòng ngủ: 2pn1Wc\r\nNhà vệ sinh: 1\r\nDiện tích: 59m2\r\nTiện ích: Hồ bơi, sân bóng gỗ, sân bóng chuyền,sân tennis', 3300000, 2, 59, 3, 1, 1, 'Full nội thất nhập khẩu', 'Không sổ ', 72, 72, '2025-01-13 18:34:14', 2, 2);

-- --------------------------------------------------------

--
-- Table structure for table `apartmenttype`
--

CREATE TABLE `apartmenttype` (
  `ID` int(11) NOT NULL,
  `name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `categoryID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `apartmenttype`
--

INSERT INTO `apartmenttype` (`ID`, `name`, `categoryID`) VALUES
(1, 'Chung cư', 1),
(2, 'Chung cư mini', 1),
(3, 'Nhà riêng', 1),
(4, 'Biệt thự', 1),
(5, 'Nhà mặt phố', 1),
(6, 'Chung cư', 2),
(7, 'Chung cư mini', 2),
(9, 'Biệt thự', 2),
(10, 'Nhà mặt phố', 2);

-- --------------------------------------------------------

--
-- Table structure for table `apartmentview`
--

CREATE TABLE `apartmentview` (
  `ID` int(11) NOT NULL,
  `userID` int(11) NOT NULL,
  `apartmentID` int(11) NOT NULL,
  `view_count` int(255) NOT NULL,
  `viewed_at` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `apartmentview`
--

INSERT INTO `apartmentview` (`ID`, `userID`, `apartmentID`, `view_count`, `viewed_at`) VALUES
(1, 1, 1, 123, '2024-11-21 18:01:34'),
(2, 2, 2, 221, '2024-12-24 18:10:04'),
(3, 3, 3, 164, '2024-05-24 18:14:28'),
(4, 4, 4, 212, '2025-01-24 18:18:35'),
(5, 5, 5, 123, '2024-07-16 19:02:33'),
(6, 6, 6, 231, '2023-05-04 19:02:53');

-- --------------------------------------------------------

--
-- Table structure for table `appartment_address`
--

CREATE TABLE `appartment_address` (
  `ID` int(11) NOT NULL,
  `nameAddress` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `appartment_address`
--

INSERT INTO `appartment_address` (`ID`, `nameAddress`) VALUES
(1, 'Phường 22, Quận Bình Thạnh, TP.Hồ Chí Minh'),
(2, ' Đại Dương, Đa Tốn, Gia Lâm, Hà Nội'),
(3, 'Phường 22, Bình Thạnh, TP.Hồ Chí Minh'),
(4, '88, KP Phước Thiện, P.Long Bình, TP.Thủ Đức'),
(5, ' Đại Dương,Đa Tốn,Gia Lâm,Hà Nội\r\n'),
(6, 'Phường 22, Bình Thạnh, Thành phố Hồ Chí Minh'),
(7, '88 KP Phước Thiện, P.Long Bình, TP.Thủ Đức'),
(8, '88 KP Phước Thiện, P.Long Bình, TP. Thủ Đức'),
(9, 'Đ159, Võ Nguyên Giáp, Thảo Điền, Quận 2, TP.Thủ Đức\r\n'),
(10, '88 KP Phước Thiện, P.Long Bình, TP.Thủ Đức'),
(11, '88 KP Phước Thiện, P.Long Bình, TP.Thủ Đức'),
(12, '88 KP Phước Thiện, P.Long Bình, TP.Thủ Đức'),
(13, '112, Phường 11, Quận 5, TP.Hồ Chí Minh'),
(14, 'Đường Nguyễn Văn Linh, Hải Châu, Đà Nẵng'),
(15, 'Phạm Văn Chiêu, Phường 9, Gò Vấp, TP. Hồ Chí Minh'),
(16, 'Đường số 10, An Bình, Dĩ An,Bình Dương'),
(17, '28 Đường Thi Sách,Phường 8, Vũng Tàu'),
(18, 'Đường Phạm Thế Hiển, Phường 6, Quận 8'),
(19, 'Đại Dương, Đa Tốn, Gia Lâm, Hà Nội\r\n'),
(20, '3 Đ.Nguyễn Du, Bình Hòa, Thuận An, Bình Dương'),
(21, 'Phường 22, Bình Thạnh, TP.Hồ Chí Minh\r\n'),
(22, 'Đường Lê Văn Thọ, Phường 11, Gò Vấp, TP.Hồ Chí Minh'),
(23, 'Đường Nguyễn Thái Sơn, Phường 3, Gò Vấp, TP.Hồ Chí Minh'),
(24, '1/32, Đường Thuận Giao 21, Thuận Giao, Thuận An,Bình Dương'),
(25, 'T2, Masteri Thảo Điền, Quận 2, TP. Hồ Chí Minh'),
(26, ' Đại Dương, Đa Tốn, Gia Lâm, Hà Nội'),
(27, '88 KP Phước Thiện, P.Long Bình, TP.Thủ Đức'),
(28, 'Đại Dương, Đa Tốn, Gia Lâm, Hà Nội\r\n'),
(29, 'Đại Dương, Đa Tốn, Gia Lâm, Hà Nội'),
(30, 'Đại Dương, Đa Tốn, Gia Lâm, Hà Nội'),
(31, 'Đại Dương, Đa Tốn, Gia Lâm, Hà Nội'),
(32, 'Đại Dương, Đa Tốn, Gia Lâm, Hà Nội'),
(33, 'Đại Dương, Đa Tốn, Gia Lâm, Hà Nội'),
(34, 'Trần Phú, Lộc Thọ, Nha Trang,Khánh Hòa'),
(35, 'Thùy Vân, Phường 2, Vũng Tàu\r\n'),
(36, '88 KP Phước Thiện, P.Long Bình, TP.Thủ Đức\r\n'),
(37, ' 159 Đ.Võ Nguyên Giáp, Quận 2, TP.HCM'),
(38, 'Đại Dương, Đa Tốn, Gia Lâm, Hà Nội'),
(39, 'Phường 22, Bình Thạnh, TP.Hồ Chí Minh'),
(40, '88 KP Phước Thiện, P.Long Bình, TP.Thủ Đức'),
(41, '88 KP Phước Thiện, P.Long Bình, TP.Thủ Đức'),
(42, 'Phường 22, Bình Thạnh, TP.Hồ Chí Minh'),
(43, '88 KP Phước Thiện, P.Long Bình, TP.Thủ Đức'),
(44, '88 KP Phước Thiện, P.Long Bình, TP.Thủ Đức'),
(45, ' Đ159,Võ Nguyên Giáp, Thảo Điền, Q2, TP.Hồ Chí Minh'),
(46, '88 KP Phước Thiện, P.Long Bình, TP.Thủ Đức'),
(47, '88 KP Phước Thiện, P.Long Bình, TP.Thủ Đức'),
(48, '88 KP Phước Thiện, P.Long Bình, TP.Thủ Đức'),
(49, '112, Phường 11, Quận 5, TP.Hồ Chí Minh'),
(50, 'Đường Nguyễn Văn Linh, Hải Châu, Đà Nẵng'),
(51, 'Phạm Văn Chiêu, Phường 9, Gò Vấp, TP. Hồ Chí Minh'),
(52, 'Đường số 10, An Bình, Dĩ An,Bình Dương'),
(53, '28 Đường Thi Sách,Phường 8, Vũng Tàu'),
(54, 'Đường Phạm Thế Hiển, Phường 6, Quận 8'),
(55, 'Đại Dương, Đa Tốn, Gia Lâm, Hà Nội'),
(56, '3 Đ.Nguyễn Du, Bình Hòa, Thuận An, Bình Dương'),
(57, '22 Bình Thạnh, TP.Hồ Chí Minh'),
(58, 'Đường Lê Văn Thọ, Phường 11, Gò Vấp, TP.Hồ Chí Minh'),
(59, 'Đường Nguyễn Thái Sơn, Phường 3, Gò Vấp, TP.Hồ Chí Minh'),
(60, '1/32, Đường Thuận Giao 21, Thuận Giao, Thuận An,Bình Dương'),
(61, 'T2, Masteri Thảo Điền, Quận 2, TP. Hồ Chí Minh'),
(62, 'Đại Dương, Đa Tốn, Gia Lâm, Hà Nội'),
(63, '88 KP Phước Thiện, P.Long Bình, TP.Thủ Đức'),
(64, 'Đại Dương, Đa Tốn, Gia Lâm, Hà Nội'),
(65, 'Đại Dương, Đa Tốn, Gia Lâm, Hà Nội'),
(66, 'Đại Dương, Đa Tốn, Gia Lâm, Hà Nội'),
(67, 'Đại Dương, Đa Tốn, Gia Lâm, Hà Nội'),
(68, 'Đại Dương, Đa Tốn, Gia Lâm, Hà Nội'),
(69, 'Đại Dương, Đa Tốn, Gia Lâm, Hà Nội'),
(70, 'Trần Phú, Lộc Thọ, Nha Trang,Khánh Hòa'),
(71, 'Thùy Vân, Phường 2, Vũng Tàu'),
(72, 'Đại Dương, Đa Tốn, Gia Lâm, Hà Nội'),
(73, '88 KP Phước Thiện, P.Long Bình, TP.Thủ Đức');

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

CREATE TABLE `category` (
  `ID` int(11) NOT NULL,
  `name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `category`
--

INSERT INTO `category` (`ID`, `name`) VALUES
(1, 'Căn Hộ Bán'),
(2, 'Căn Hộ Thuê');

-- --------------------------------------------------------

--
-- Table structure for table `favorites`
--

CREATE TABLE `favorites` (
  `ID` int(11) NOT NULL,
  `add_date` datetime NOT NULL,
  `userID` int(11) NOT NULL,
  `apartmentID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `favorites`
--

INSERT INTO `favorites` (`ID`, `add_date`, `userID`, `apartmentID`) VALUES
(1, '2024-06-18 19:59:13', 1, 1),
(2, '2025-01-07 19:59:32', 2, 2),
(3, '2024-07-04 19:59:45', 3, 3),
(4, '2024-07-30 20:00:02', 4, 4),
(5, '2024-11-11 20:00:25', 5, 5);

-- --------------------------------------------------------

--
-- Table structure for table `images`
--

CREATE TABLE `images` (
  `ID` int(11) NOT NULL,
  `apartmentID` int(11) NOT NULL,
  `URL` text CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `created_at` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `images`
--

INSERT INTO `images` (`ID`, `apartmentID`, `URL`, `created_at`) VALUES
(1, 1, ' rainbow3.jpg', '2024-02-24 12:00:16'),
(2, 2, 'rainbow.jpg', '2024-02-25 12:02:04'),
(3, 3, 'rainbow1.jpg', '2024-02-26 12:02:49'),
(4, 4, 'Origami1.jpg', '2024-02-27 12:03:19'),
(5, 5, 'Origami2.jpg', '2024-02-28 12:03:51'),
(6, 6, 'Origami3.jpg', '2024-02-27 12:04:17'),
(7, 7, 'masteri3.jpg', '2024-02-29 12:04:41'),
(8, 8, 'masteri2.jpg', '2024-02-27 12:05:22'),
(9, 9, 'masteri1.jpg', '2024-02-26 12:05:53'),
(10, 10, 'Beverly.jpg', '2024-02-28 12:07:02'),
(11, 11, 'Bervely4.jpg', '2024-03-02 12:08:05'),
(12, 12, 'Beverly3.jpg', '2024-06-07 12:08:56'),
(13, 13, '1.jpg', '2024-12-01 12:10:13'),
(14, 14, '2.jpg', '2024-05-02 12:14:17'),
(15, 15, '3.jpg', '2024-07-10 12:14:54'),
(16, 16, '4.jpg', '2024-11-06 12:15:17'),
(17, 17, '5.jpg', '2024-12-04 12:15:33'),
(18, 18, '6.jpg', '2024-11-12 12:15:49'),
(19, 19, '7.jpg', '2024-11-04 12:16:08'),
(20, 20, '8.jpg', '2024-11-04 12:16:27'),
(21, 21, '10.jpg', '2024-09-09 12:16:53'),
(22, 22, '11.jpg', '2024-09-02 12:17:12'),
(23, 23, '13.jpg', '2024-07-18 12:17:32'),
(24, 24, '14.jpg', '2024-09-11 12:17:53'),
(25, 25, '15.jpg', '2024-07-08 12:18:10'),
(26, 26, '17.jpg', '2024-09-02 12:18:31'),
(27, 27, '18.jpg', '2025-01-13 12:18:56'),
(28, 28, '19.jpg', '2024-10-21 12:19:16'),
(29, 29, '20.jpg', '2024-12-02 12:19:38'),
(30, 30, '21.jpg', '2024-10-06 12:19:57'),
(31, 31, '22.jpg', '2024-01-23 12:20:13'),
(32, 32, '23.jpg', '2025-01-21 12:20:38'),
(33, 33, '24.jpg', '2024-09-02 13:42:29'),
(34, 34, '25.jpg', '2024-10-21 13:42:53'),
(35, 35, '27.jpg', '0000-00-00 00:00:00'),
(36, 36, '29.jpg', '0000-00-00 00:00:00'),
(37, 37, 'h48.jpg', '2024-10-15 01:13:17'),
(38, 38, 'h49.jpg', '2025-01-13 19:13:17'),
(39, 39, 'h50.jpg', '2025-01-13 19:13:17'),
(40, 40, 'h55.jpg', '2025-01-13 19:13:17'),
(41, 41, 'h60.jpg', '2025-01-13 19:13:17'),
(42, 42, 'h66.jpg', '2025-01-13 19:13:17'),
(43, 43, 'h75.jpg', '2025-01-13 19:13:17'),
(44, 44, 'h76.jpg', '2025-01-13 19:13:17'),
(45, 45, 'h77.jpg', '2025-01-13 19:13:17'),
(46, 46, 'h78.jpg', '2025-01-13 19:13:17'),
(47, 47, 'h80.jpg', '2025-01-13 19:13:17'),
(48, 48, 'Beverly3.jpg', '2025-01-13 19:13:17'),
(49, 49, '1.jpg', '2025-01-13 19:13:17'),
(50, 50, '2.jpg', '2025-01-13 19:13:17'),
(51, 51, '3.jpg', '2025-01-13 19:13:17'),
(52, 52, '4.jpg', '2025-01-13 19:13:17'),
(53, 53, '5.jpg', '2025-01-13 19:13:17'),
(54, 54, '6.jpg', '2025-01-13 19:13:17'),
(55, 55, '7.jpg', '2025-01-13 19:13:17'),
(56, 57, '8.jpg', '2025-01-13 19:13:17'),
(57, 57, '10.jpg', '2025-01-13 19:13:17'),
(58, 58, '11.jpg', '2025-01-13 19:13:17'),
(59, 59, '13.jpg', '2025-01-13 19:13:17'),
(60, 60, '14.jpg', '2025-01-13 19:13:17'),
(61, 61, '15.jpg', '2025-01-13 19:13:17'),
(62, 62, '17.jpg', '2025-01-13 19:13:17'),
(63, 63, '18.jpg', '2025-01-13 19:13:17'),
(64, 64, '19.jpg', '2025-01-13 19:13:17'),
(65, 65, '20.jpg', '2025-01-13 19:13:17'),
(66, 66, '21.jpg', '2025-01-13 19:13:17'),
(67, 67, '22.jpg', '2025-01-13 19:13:17'),
(68, 68, '23.jpg', '2025-01-13 19:13:17'),
(69, 69, '24.jpg', '2025-01-13 19:13:17'),
(70, 70, '25.jpg', '2025-01-13 19:13:17'),
(71, 71, '27.jpg', '2025-01-13 19:13:17'),
(72, 72, '29.jpg', '2025-01-13 19:13:17');

-- --------------------------------------------------------

--
-- Table structure for table `messenger`
--

CREATE TABLE `messenger` (
  `ID` int(11) NOT NULL,
  `userID` int(11) NOT NULL,
  `content` text CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `sent_at` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `messenger`
--

INSERT INTO `messenger` (`ID`, `userID`, `content`, `sent_at`) VALUES
(1, 1, 'Căn hộ đã được mua.!', '2025-01-08 13:44:25'),
(2, 2, 'Khách hàng muốn xem căn hộ.!', '2024-05-14 13:44:59'),
(3, 3, 'Hy vọng bạn sẽ hài lòng với lựa chọn của mình. Nếu cần hỗ trợ thêm, đừng ngần ngại nhắn tin cho chúng tôi nhé!', '2025-01-12 16:41:46'),
(4, 4, 'Vui lòng sắp xếp thời gian và liên hệ với chúng tôi để hoàn tất thủ tục nhận tài sản. Chúc bạn một ngày vui vẻ!', '2025-01-12 16:41:46'),
(5, 5, 'Chào bạn! Giao dịch mua căn hộ của bạn đã được xác nhận thành công. Cảm ơn bạn đã lựa chọn dịch vụ của chúng tôi!', '2025-01-12 16:41:46'),
(6, 6, 'Xin chúc mừng! Việc mua căn hộ của bạn đã hoàn tất. Đừng ngần ngại liên hệ nếu bạn cần hỗ trợ thêm nhé!', '2025-01-12 16:41:46'),
(7, 7, 'Căn hộ của bạn tại Vinhome Grand park đã được xác nhận giao dịch thành công. Chúc mừng bạn và gia đình! ', '2025-01-12 16:41:46'),
(8, 8, 'Hồ sơ mua nhà của bạn đã hoàn tất. Xin chân thành cảm ơn bạn đã sử dụng dịch vụ của chúng tôi.', '2025-01-12 16:41:46'),
(9, 9, 'Chào bạn! Lịch gặp gỡ để hoàn tất hồ sơ căn hộ sẽ diễn ra vào 11/2/2024. Hẹn gặp bạn nhé!', '2025-01-12 16:41:46'),
(10, 10, 'Hồ sơ mua nhà của bạn đã hoàn tất. Xin chân thành cảm ơn bạn đã sử dụng dịch vụ của chúng tôi.', '2025-01-12 16:41:46'),
(11, 11, 'Tin vui đây! Khoản thanh toán của bạn đã được nhận. Chúng tôi sẽ liên hệ để cập nhật tiến trình.', '2025-01-12 16:41:46'),
(12, 12, 'Hồ sơ mua nhà của bạn đã hoàn tất. Xin chân thành cảm ơn bạn đã sử dụng dịch vụ của chúng tôi.', '2025-01-12 16:41:46'),
(13, 13, 'Chúng tôi luôn sẵn sàng hỗ trợ bạn. Nếu có bất kỳ vấn đề nào liên quan đến tài sản, đừng ngần ngại liên hệ nhé!', '2025-01-12 16:41:46'),
(14, 14, 'Tin vui đây! Khoản thanh toán của bạn đã được nhận. Chúng tôi sẽ liên hệ để cập nhật tiến trình.\"', '2025-01-12 16:41:46'),
(15, 15, 'Bạn đã đặt cọc thành công.!', '2025-01-12 16:41:46'),
(16, 16, 'Tin vui đây! Khoản thanh toán của bạn đã được nhận. Chúng tôi sẽ liên hệ để cập nhật tiến trình.\"', '2025-01-12 16:41:46'),
(17, 17, 'Bạn đã đặt cọc thành công.!', '2025-01-12 16:41:46'),
(18, 18, 'Chúng tôi luôn sẵn sàng hỗ trợ bạn. Nếu có bất kỳ vấn đề nào liên quan đến tài sản, đừng ngần ngại liên hệ nhé!', '2025-01-12 16:41:46'),
(19, 19, 'Tin vui đây! Khoản thanh toán của bạn đã được nhận. Chúng tôi sẽ liên hệ để cập nhật tiến trình.\"', '2025-01-12 16:41:46'),
(20, 20, 'Bạn đã thanh toán thành công.!', '2025-01-12 16:41:46'),
(21, 21, 'Chúng tôi luôn sẵn sàng hỗ trợ bạn. Nếu có bất kỳ vấn đề nào liên quan đến tài sản, đừng ngần ngại liên hệ nhé!', '2025-01-12 16:41:46'),
(22, 22, 'Chúng tôi luôn sẵn sàng hỗ trợ bạn. Nếu có bất kỳ vấn đề nào liên quan đến tài sản, đừng ngần ngại liên hệ nhé!', '2025-01-12 16:41:46'),
(23, 23, '\"Chúng tôi rất vui khi được đồng hành cùng bạn trong hành trình sở hữu nhà đất. Cảm ơn bạn!', '2025-01-12 16:41:46'),
(24, 24, 'Chúng tôi luôn sẵn sàng hỗ trợ bạn. Nếu có bất kỳ vấn đề nào liên quan đến tài sản, đừng ngần ngại liên hệ nhé!', '2025-01-12 16:41:46'),
(25, 25, 'Chúng tôi rất vui khi được đồng hành cùng bạn trong hành trình sở hữu nhà đất. Cảm ơn bạn!', '2025-01-12 16:41:46'),
(26, 26, 'Chúng tôi luôn sẵn sàng hỗ trợ bạn. Nếu có bất kỳ vấn đề nào liên quan đến tài sản, đừng ngần ngại liên hệ nhé!', '2025-01-12 16:41:46'),
(27, 27, 'Căn nhà của bạn đã sẵn sàng! Hãy liên hệ với chúng tôi để nhận tài sản sớm nhất', '2025-01-12 16:41:46'),
(28, 28, 'Căn nhà của bạn đã sẵn sàng! Hãy liên hệ với chúng tôi để nhận tài sản sớm nhất', '2025-01-12 16:41:46'),
(29, 29, 'Bạn đã thanh toán thành công.!', '2025-01-12 16:41:46'),
(30, 30, 'Căn nhà của bạn đã sẵn sàng! Hãy liên hệ với chúng tôi để nhận tài sản sớm nhất', '2025-01-12 16:41:46'),
(31, 31, 'Căn nhà của bạn đã sẵn sàng! Hãy liên hệ với chúng tôi để nhận tài sản sớm nhất', '2025-01-12 16:41:46'),
(32, 32, 'Chúng tôi đã nhận khoản thanh toán từ bạn. Cảm ơn bạn đã hợp tác nhanh chóng!', '2025-01-12 16:41:46'),
(33, 33, 'Bạn đã thanh toán thành công.!', '2025-01-12 16:41:46'),
(34, 34, 'Chúng tôi đã nhận khoản thanh toán từ bạn. Cảm ơn bạn đã hợp tác nhanh chóng!', '2025-01-12 16:41:46'),
(35, 35, 'Bạn đã đặt cọc thành công.!', '2025-01-12 16:41:46'),
(36, 36, 'Tin vui đây! Khoản thanh toán của bạn đã được nhận. Chúng tôi sẽ liên hệ để cập nhật tiến trình.\"', '2025-01-12 16:41:46'),
(37, 37, 'Bạn đã thanh toán thành công.!', '2023-05-13 01:02:12'),
(38, 38, 'Tin vui đây! Khoản thanh toán của bạn đã được nhận. Chúng tôi sẽ liên hệ để cập nhật tiến trình.\"', '2023-09-05 01:02:12'),
(39, 39, 'Bạn đã thanh toán thành công.!', '2024-01-14 01:02:12'),
(40, 40, 'Tin vui đây! Khoản thanh toán của bạn đã được nhận. Chúng tôi sẽ liên hệ để cập nhật tiến trình.\"', '2023-04-06 01:02:12'),
(41, 41, 'Bạn đã thanh toán thành công.!', '2023-05-10 01:02:12'),
(42, 42, 'Tin vui đây! Khoản thanh toán của bạn đã được nhận. Chúng tôi sẽ liên hệ để cập nhật tiến trình.\"', '2024-04-29 01:02:12'),
(43, 43, 'Bạn đã thanh toán thành công.!', '2023-10-16 01:02:12'),
(44, 44, 'Căn nhà của bạn đã sẵn sàng! Hãy liên hệ với chúng tôi để nhận tài sản sớm nhất', '2023-07-19 01:02:12'),
(45, 45, 'Bạn đã thanh toán thành công.!', '2023-05-18 01:02:12'),
(46, 46, 'Tin vui đây! Khoản thanh toán của bạn đã được nhận. Chúng tôi sẽ liên hệ để cập nhật tiến trình.\"', '2023-05-17 01:02:12'),
(47, 47, 'Bạn đã thanh toán thành công.!', '2023-04-06 01:02:12'),
(48, 48, 'Tin vui đây! Khoản thanh toán của bạn đã được nhận. Chúng tôi sẽ liên hệ để cập nhật tiến trình.\"', '2023-04-06 01:02:12'),
(49, 49, 'Bạn đã thanh toán thành công.!', '2023-01-10 01:02:12'),
(50, 50, 'Tin vui đây! Khoản thanh toán của bạn đã được nhận. Chúng tôi sẽ liên hệ để cập nhật tiến trình.\"', '2024-10-07 01:02:12'),
(51, 51, 'Bạn đã thanh toán thành công.!', '2024-11-11 01:02:12'),
(52, 52, 'Căn nhà của bạn đã sẵn sàng! Hãy liên hệ với chúng tôi để nhận tài sản sớm nhất', '2024-11-04 01:02:12'),
(53, 53, 'Bạn đã thanh toán thành công.!', '2024-11-04 01:02:12'),
(54, 54, 'Tin vui đây! Khoản thanh toán của bạn đã được nhận. Chúng tôi sẽ liên hệ để cập nhật tiến trình.\"', '2024-12-31 01:02:12'),
(55, 55, 'Bạn đã thanh toán thành công.!', '2024-12-02 01:02:12'),
(56, 56, 'Chúng tôi luôn sẵn sàng hỗ trợ bạn. Nếu có bất kỳ vấn đề nào liên quan đến tài sản, đừng ngần ngại liên hệ nhé!', '2024-12-25 01:02:12'),
(57, 57, 'Chúng tôi luôn sẵn sàng hỗ trợ bạn. Nếu có bất kỳ vấn đề nào liên quan đến tài sản, đừng ngần ngại liên hệ nhé!', '2024-12-17 01:02:12'),
(58, 58, 'Bạn đã thanh toán thành công.!', '2024-12-10 01:02:12'),
(59, 59, 'Tin vui đây! Khoản thanh toán của bạn đã được nhận. Chúng tôi sẽ liên hệ để cập nhật tiến trình.\"', '2024-12-16 01:02:12'),
(60, 60, 'Căn nhà của bạn đã sẵn sàng! Hãy liên hệ với chúng tôi để nhận tài sản sớm nhất', '2024-12-16 01:02:12'),
(61, 61, 'Bạn đã thanh toán thành công.!', '2024-12-09 01:02:12'),
(62, 62, 'Căn nhà của bạn đã sẵn sàng! Hãy liên hệ với chúng tôi để nhận tài sản sớm nhất', '2024-11-11 01:02:12'),
(63, 63, 'Bạn đã thanh toán thành công.!', '2024-11-04 01:02:12'),
(64, 64, 'Tin vui đây! Khoản thanh toán của bạn đã được nhận. Chúng tôi sẽ liên hệ để cập nhật tiến trình.\"', '2024-11-19 01:02:12'),
(65, 65, 'Bạn đã thanh toán thành công.!', '2024-12-03 01:02:12'),
(66, 66, 'Căn nhà của bạn đã sẵn sàng! Hãy liên hệ với chúng tôi để nhận tài sản sớm nhất', '2024-11-04 01:02:12'),
(67, 67, 'Căn nhà của bạn đã sẵn sàng! Hãy liên hệ với chúng tôi để nhận tài sản sớm nhất', '2024-11-27 01:02:12'),
(68, 68, 'Bạn đã thanh toán thành công.!', '2024-11-18 01:02:12'),
(69, 69, 'Tin vui đây! Khoản thanh toán của bạn đã được nhận. Chúng tôi sẽ liên hệ để cập nhật tiến trình.\"', '2024-11-04 01:02:12'),
(70, 70, 'Căn nhà của bạn đã sẵn sàng! Hãy liên hệ với chúng tôi để nhận tài sản sớm nhất', '2025-01-13 19:02:04'),
(71, 71, 'Tin vui đây! Khoản thanh toán của bạn đã được nhận. Chúng tôi sẽ liên hệ để cập nhật tiến trình.\"', '2024-11-05 01:02:12'),
(72, 72, 'Bạn đã thanh toán thành công.!', '2024-10-15 01:02:12');

-- --------------------------------------------------------

--
-- Table structure for table `notification`
--

CREATE TABLE `notification` (
  `ID` int(11) NOT NULL,
  `userID` int(11) NOT NULL,
  `messenger` text CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `created_at` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `notification`
--

INSERT INTO `notification` (`ID`, `userID`, `messenger`, `created_at`) VALUES
(1, 1, '🎉 Dự án Opus ra mắt với thiết kế hiện đại, vị trí đắc địa! Giá chỉ từ 5 tỷ. Nhanh tay đăng ký để nhận ưu đãi đặc biệt.', '2024-11-07 16:34:32'),
(2, 2, '🔥 Giảm ngay 15% khi đặt mua căn hộ OPus trước ngày [20/6/2025]! Đừng bỏ lỡ cơ hội sở hữu không gian sống đẳng cấp.', '2025-01-02 16:43:38'),
(3, 3, '💥 Ưu đãi cuối năm: Thanh toán linh hoạt, chiết khấu hấp dẫn, và quà tặng giá trị cao khi mua căn hộ tại Beverly! Liên hệ ngay để biết thêm chi tiết.', '2025-01-02 16:44:29'),
(4, 4, '📅 Lời nhắc: Bạn có lịch tham quan dự án Beverly vào 19/11/2024. Vui lòng liên hệ 0896456789 để xác nhận.', '2024-10-10 16:55:53'),
(5, 5, '🏢 Đừng quên sự kiện Open House tại Masteri vào ngày 15/10/2024! Tham gia để trải nghiệm thực tế không gian sống lý tưởng.', '2024-05-21 16:56:06'),
(6, 6, '✅ Đặt cọc thành công: Bạn đã đặt cọc căn hộ Rainbow S1.01 1503 với giá trị 2 tỷ. Chi tiết giao dịch sẽ được gửi qua email.', '2024-11-28 16:56:17'),
(7, 7, '🌟 Dự án Beverly vừa mở bán đợt 1! Cơ hội sở hữu căn hộ vị trí đẹp với giá ưu đãi. Nhanh tay đặt chỗ ngay hôm nay.', '2024-10-17 16:56:28'),
(8, 8, '🚀 Đừng bỏ lỡ: Mở bán giai đoạn cuối của dự án Ocen park. Cơ hội cuối cùng để sở hữu căn hộ tại vị trí đắc địa này.', '2025-01-13 16:56:41'),
(9, 9, '🎁 Đặt mua ngay hôm nay để nhận quà tặng trị giá 500 triệu đồng khi sở hữu căn hộ Masteri. Số lượng có hạn!', '2024-10-08 16:56:45'),
(10, 10, '💥 Ưu đãi độc quyền: Giảm ngay 20% khi ký hợp đồng trong tuần này. Liên hệ để biết thêm chi tiết', '2025-01-05 16:56:54'),
(11, 11, '🌟 Dự án Beverly vừa mở bán đợt 1! Cơ hội sở hữu căn hộ vị trí đẹp với giá ưu đãi. Nhanh tay đặt chỗ ngay hôm nay.', '2024-09-20 16:56:59'),
(12, 12, '🎉 Đặc quyền vàng: Miễn phí 2 năm phí quản lý khi sở hữu căn hộ Origami. Liên hệ ngay để nhận thông tin chi tiết.', '2024-10-22 16:57:10'),
(13, 13, '📅 Đừng quên tham gia lễ mở bán dự án Ocen Park vào ngày 17/2/2025.Rất nhiều ưu đãi đang chờ bạn.', '2024-11-19 16:57:19'),
(14, 14, '🚧 Tiến độ xây dựng: Khu căn hộ Masteri đã hoàn thiện phần thô và đang bắt đầu hoàn thiện nội thất.', '2024-12-23 16:57:26'),
(15, 15, '🔑 Nhà là nơi để trở về! Opus mang đến không gian sống đẳng cấp cho gia đình bạn. Đặt lịch tư vấn ngay!', '2024-12-16 16:57:31'),
(16, 16, '🎉 Chúc mừng bạn đã hoàn tất giao dịch mua nhà tại Vũng Tàu! Chúng tôi rất hân hạnh được đồng hành cùng bạn.', '0000-00-00 00:00:00'),
(17, 17, '✅ Giao dịch thành công: Bạn đã sở hữu căn nhà Gò Vấp. Xin cảm ơn và chúc mừng bạn đã có tổ ấm mới!', '0000-00-00 00:00:00'),
(18, 18, '🚧 Tiến độ xây dựng: Khu căn hộ Masteri đã hoàn thiện phần thô và đang bắt đầu hoàn thiện nội thất.', '0000-00-00 00:00:00'),
(19, 19, ' Giao dịch thành công: Bạn đã sở hữu căn nhà ở Phạm Thế Hiển, Quận 8 . Xin cảm ơn và chúc mừng bạn đã có tổ ấm mới!', '0000-00-00 00:00:00'),
(20, 20, '💼 Giao dịch hoàn tất: Hợp đồng mua bán nhà ở Bình Hòa, Bình Dương của bạn đã được ký. Cảm ơn bạn đã tin tưởng!', '0000-00-00 00:00:00'),
(21, 21, '💼 Giao dịch hoàn tất: Hợp đồng mua bán nhà ở Bình Hòa, Bình Dương của bạn đã được ký. Cảm ơn bạn đã tin tưởng!', '0000-00-00 00:00:00'),
(22, 22, '💥 Cơ hội cuối cùng: Nhận chiết khấu lên đến 20% khi mua nhà trước ngày 20/10/2024. Đặt lịch tư vấn ngay hôm nay', '0000-00-00 00:00:00'),
(23, 23, '✨ Sở hữu ngôi nhà mơ ước tại Thuận An, Bình Dương với giá chỉ từ 7 tỷ đồng. Liên hệ để biết thêm chi tiết', '0000-00-00 00:00:00'),
(24, 24, '✨ Bạn đang tìm kiếm căn hộ mơ ước? Masteri chính là lựa chọn hoàn hảo với giá chỉ từ 3 tỷ đồng.', '0000-00-00 00:00:00'),
(25, 25, '📣 Cơ hội đầu tư sinh lời! Dự án Rainbow sở hữu vị trí đắc địa, tiềm năng tăng giá cao. Tìm hiểu ngay hôm nay!', '0000-00-00 00:00:00'),
(26, 26, '📜 Hợp đồng mua bán căn hộ Beverly đã được phê duyệt. Mọi thông tin chi tiết sẽ được gửi qua email.', '0000-00-00 00:00:00'),
(27, 27, '🔑 Nhà là nơi để trở về! Rainbow mang đến không gian sống đẳng cấp cho gia đình bạn. Đặt lịch tư vấn ngay!', '0000-00-00 00:00:00'),
(28, 28, '🚧 Tiến độ xây dựng: Khu căn hộ Opus đã hoàn thiện phần thô và đang bắt đầu hoàn thiện nội thất.', '0000-00-00 00:00:00'),
(29, 29, '💥 Ưu đãi độc quyền: Giảm ngay 30% khi ký hợp đồng trong tuần này. Liên hệ để biết thêm chi tiết!', '0000-00-00 00:00:00'),
(30, 30, '🏢 Lời nhắc: Tham quan căn hộ mẫu Beverly vào 20/9/2024 tại Nội khu vinhome GrankPark. Liên hệ 0984752123 để xác nhận.', '0000-00-00 00:00:00'),
(31, 31, '📣 Cơ hội đầu tư sinh lời! Dự án Rainbow sở hữu vị trí đắc địa, tiềm năng tăng giá cao. Tìm hiểu ngay hôm nay!', '2025-01-12 16:36:38'),
(32, 32, '📣 Cơ hội đầu tư sinh lời! Dự án Rainbow sở hữu vị trí đắc địa, tiềm năng tăng giá cao. Tìm hiểu ngay hôm nay!', '2025-01-12 16:36:38'),
(33, 33, '📣 Cơ hội đầu tư sinh lời! Dự án Rainbow sở hữu vị trí đắc địa, tiềm năng tăng giá cao. Tìm hiểu ngay hôm nay!', '2025-01-12 16:36:38'),
(34, 34, '🎉 Tin vui! Nhà của bạn tại Khánh Hòa được bàn giao vào ngày 1/1/2025. Chúng tôi sẽ liên hệ để hướng dẫn chi tiết.', '2025-01-12 16:36:38'),
(35, 35, '\"🔔 Lời nhắc: Đợt thanh toán tiếp theo cho căn nhà của bạn tại Vũng Tàu là vào ngày 12/4/2024. Vui lòng đảm bảo thanh toán đúng hạn.', '2025-01-12 16:36:38'),
(36, 36, '🔔 Lời nhắc: Đợt thanh toán tiếp theo cho căn hộ của bạn tại Rainbow là vào ngày 20/12/2024. Vui lòng đảm bảo thanh toán đúng hạn.', '2025-01-12 16:36:38'),
(37, 37, '🎉 Dự án Opus ra mắt với thiết kế hiện đại, vị trí đắc địa! Giá chỉ từ 5 tỷ. Nhanh tay đăng ký để nhận ưu đãi đặc biệt.', '2025-01-13 19:27:56'),
(38, 38, '🔥 Giảm ngay 15% khi đặt mua căn hộ OPus trước ngày [12/12/2024]! Đừng bỏ lỡ cơ hội sở hữu không gian sống đẳng cấp.', '2025-01-13 19:27:56'),
(39, 39, '📣 Cơ hội đầu tư sinh lời! Dự án Rainbow sở hữu vị trí đắc địa, tiềm năng tăng giá cao. Tìm hiểu ngay hôm nay!', '2025-01-13 19:27:56'),
(40, 40, '💥 Ưu đãi cuối năm: Thanh toán linh hoạt, chiết khấu hấp dẫn, và quà tặng giá trị cao khi mua căn hộ tại Beverly! Liên hệ ngay để biết thêm chi tiết.', '2025-01-13 19:27:56'),
(41, 41, '💥 Ưu đãi độc quyền: Giảm ngay 20% khi ký hợp đồng trong tuần này. Liên hệ để biết thêm chi tiết', '2025-01-13 19:27:56'),
(42, 42, '📜 Hợp đồng mua bán căn hộ Beverly đã được phê duyệt. Mọi thông tin chi tiết sẽ được gửi qua email.', '2025-01-13 19:27:56'),
(43, 43, '\"🔔 Lời nhắc: Đợt thanh toán tiếp theo cho căn nhà của bạn tại Vũng Tàu là vào ngày 12/7/2024. Vui lòng đảm bảo thanh toán đúng hạn.', '2025-01-13 19:27:56'),
(44, 44, '📣 Cơ hội đầu tư sinh lời! Dự án Rainbow sở hữu vị trí đắc địa, tiềm năng tăng giá cao. Tìm hiểu ngay hôm nay!', '2025-01-13 19:27:56'),
(45, 45, '💥 Ưu đãi cuối năm: Thanh toán linh hoạt, chiết khấu hấp dẫn, và quà tặng giá trị cao khi mua căn hộ tại Beverly! Liên hệ ngay để biết thêm chi tiết.', '2025-01-13 19:27:56'),
(46, 46, '💼 Giao dịch hoàn tất: Hợp đồng mua bán nhà ở Bình Hòa, Bình Dương của bạn đã được ký. Cảm ơn bạn đã tin tưởng!', '2025-01-13 19:27:56'),
(47, 47, '💼 Giao dịch hoàn tất: Hợp đồng mua bán nhà ở Bình Hòa, Bình Dương của bạn đã được ký. Cảm ơn bạn đã tin tưởng!', '2025-01-13 19:27:56'),
(48, 48, '🌟 Dự án Beverly vừa mở bán đợt 1! Cơ hội sở hữu căn hộ vị trí đẹp với giá ưu đãi. Nhanh tay đặt chỗ ngay hôm nay.', '2025-01-13 19:27:56'),
(49, 49, '🌟 Dự án Beverly vừa mở bán đợt 1! Cơ hội sở hữu căn hộ vị trí đẹp với giá ưu đãi. Nhanh tay đặt chỗ ngay hôm nay.', '2025-01-13 19:27:56'),
(50, 50, '🚧 Tiến độ xây dựng: Khu căn hộ Masteri đã hoàn thiện phần thô và đang bắt đầu hoàn thiện nội thất.', '2025-01-13 19:27:56'),
(51, 51, '🚧 Tiến độ xây dựng: Khu căn hộ Masteri đã hoàn thiện phần thô.', '2025-01-13 19:27:56'),
(52, 52, '🔑 Nhà là nơi để trở về! Opus mang đến không gian sống đẳng cấp cho gia đình bạn. Đặt lịch tư vấn ngay!', '2025-01-13 19:27:56'),
(53, 53, '📅 Đừng quên tham gia lễ mở bán dự án Ocen Park vào ngày 17/2/2025.Rất nhiều ưu đãi đang chờ bạn.', '2025-01-13 19:27:56'),
(54, 54, '🔥 Giảm ngay 15% khi đặt mua căn hộ OPus trước ngày [20/6/2025]! Đừng bỏ lỡ cơ hội sở hữu không gian sống đẳng cấp', '2025-01-13 19:27:56'),
(55, 55, '💥 Ưu đãi cuối năm: Thanh toán linh hoạt, chiết khấu hấp dẫn, và quà tặng giá trị cao khi mua căn hộ tại Beverly! Liên hệ ngay để biết thêm chi tiết.', '2025-01-13 19:27:56'),
(56, 56, '🚧 Tiến độ xây dựng: Khu căn hộ Masteri đã hoàn thiện phần thô và đang bắt đầu hoàn thiện nội thất.', '2025-01-13 19:27:56'),
(57, 57, '📅 Đừng quên tham gia lễ mở bán dự án Ocen Park vào ngày 17/2/2025.Rất nhiều ưu đãi đang chờ bạn.', '2025-01-13 19:27:56'),
(58, 58, '🔑 Nhà là nơi để trở về! Opus mang đến không gian sống đẳng cấp cho gia đình bạn. Đặt lịch tư vấn ngay!', '2025-01-13 19:27:56'),
(59, 59, '📅 Đừng quên tham gia lễ mở bán dự án Ocen Park vào ngày 17/2/2025.Rất nhiều ưu đãi đang chờ bạn.', '2025-01-13 19:27:56'),
(60, 60, '🚧 Tiến độ xây dựng: Khu căn hộ Masteri đã hoàn thiện phần thô và đang bắt đầu hoàn thiện nội thất.', '2025-01-13 19:27:56'),
(61, 61, '🔑 Nhà là nơi để trở về! Opus mang đến không gian sống đẳng cấp cho gia đình bạn. Đặt lịch tư vấn ngay!', '2025-01-13 19:27:56'),
(62, 62, '🔑 Nhà là nơi để trở về! Opus mang đến không gian sống đẳng cấp cho gia đình bạn. Đặt lịch tư vấn ngay!', '2025-01-13 19:27:56'),
(63, 63, '🔥 Giảm ngay 15% khi đặt mua căn hộ OPus trước ngày [20/6/2025]! Đừng bỏ lỡ cơ hội sở hữu không gian sống đẳng cấp', '2025-01-13 19:27:56'),
(64, 64, '🔥 Giảm ngay 15% khi đặt mua căn hộ OPus trước ngày [20/6/2025]! Đừng bỏ lỡ cơ hội sở hữu không gian sống đẳng cấp', '2025-01-13 19:27:56'),
(65, 65, '🚧 Tiến độ xây dựng: Khu căn hộ Masteri đã hoàn thiện phần thô và đang bắt đầu hoàn thiện nội thất.', '2025-01-13 19:27:56'),
(66, 66, '🔑 Nhà là nơi để trở về! Opus mang đến không gian sống đẳng cấp cho gia đình bạn. Đặt lịch tư vấn ngay!', '2025-01-13 19:27:56'),
(67, 67, '📅 Đừng quên tham gia lễ mở bán dự án Ocen Park vào ngày 17/2/2025.Rất nhiều ưu đãi đang chờ bạn.', '2025-01-13 19:27:56'),
(68, 68, '🚧 Tiến độ xây dựng: Khu căn hộ Masteri đã hoàn thiện phần thô và đang bắt đầu hoàn thiện nội thất.', '2025-01-13 19:27:56'),
(69, 69, '🔥 Giảm ngay 15% khi đặt mua căn hộ OPus trước ngày [20/6/2025]! Đừng bỏ lỡ cơ hội sở hữu không gian sống đẳng cấp', '2025-01-13 19:27:56'),
(70, 70, '🔑 Nhà là nơi để trở về! Opus mang đến không gian sống đẳng cấp cho gia đình bạn. Đặt lịch tư vấn ngay!', '2025-01-13 19:27:56'),
(71, 71, '📅 Đừng quên tham gia lễ mở bán dự án Ocen Park vào ngày 17/2/2025.Rất nhiều ưu đãi đang chờ bạn.', '2025-01-13 19:27:56'),
(72, 72, '🚧 Tiến độ xây dựng: Khu căn hộ Masteri đã hoàn thiện phần thô và đang bắt đầu hoàn thiện nội thất.', '2025-01-13 19:27:56');

-- --------------------------------------------------------

--
-- Table structure for table `paymentmethod`
--

CREATE TABLE `paymentmethod` (
  `ID` int(11) NOT NULL,
  `name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `paymentmethod`
--

INSERT INTO `paymentmethod` (`ID`, `name`) VALUES
(1, 'Tiền mặt '),
(2, 'Đặt cọc'),
(3, 'Chuyển Khoản');

-- --------------------------------------------------------

--
-- Table structure for table `provinces`
--

CREATE TABLE `provinces` (
  `ID` int(11) NOT NULL,
  `name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `apartmentID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `roles`
--

CREATE TABLE `roles` (
  `ID` int(11) NOT NULL,
  `name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `roles`
--

INSERT INTO `roles` (`ID`, `name`) VALUES
(0, 'user'),
(1, 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `transaction`
--

CREATE TABLE `transaction` (
  `ID` int(11) NOT NULL,
  `paymentID` int(11) NOT NULL,
  `userID` int(11) NOT NULL,
  `apartmentID` int(11) NOT NULL,
  `pay_status` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `trans_date` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `transaction`
--

INSERT INTO `transaction` (`ID`, `paymentID`, `userID`, `apartmentID`, `pay_status`, `trans_date`) VALUES
(1, 1, 1, 1, 'Đang chờ thanh toán.!', '2025-01-13 09:06:53'),
(2, 2, 2, 2, 'Đang chờ thanh toán', '2025-01-13 09:06:53'),
(3, 2, 3, 3, 'Đang chờ thanh toán.!', '2024-10-30 15:08:45'),
(4, 1, 4, 4, 'Thanh toán thành công.!', '2024-10-21 15:08:45'),
(5, 3, 5, 5, 'Đang chờ thanh toán.!', '2025-01-13 09:08:37'),
(6, 3, 6, 6, 'Đang chờ xử lí.!', '2025-01-13 09:08:37'),
(7, 3, 7, 7, 'Đang xử lí.!', '2025-01-13 09:08:37'),
(8, 2, 8, 8, 'Thanh toán thành công.!', '2025-01-13 09:08:37'),
(9, 2, 9, 9, 'Đang chờ thanh toán.!', '2024-11-12 15:08:45'),
(10, 1, 10, 10, 'Thanh toán thành công.!', '2024-11-12 15:08:45'),
(11, 2, 11, 11, 'Thanh toán thành công.!', '2025-01-13 09:08:37'),
(12, 3, 12, 12, 'Đang chờ xử lí', '2025-01-13 09:08:37'),
(13, 1, 13, 13, 'Đang chờ thanh toán.!', '2024-11-04 15:15:42'),
(14, 2, 14, 14, 'Đang chờ thanh toán.!', '2024-10-07 15:15:42'),
(15, 3, 15, 15, 'Đang chờ xử lí.!', '2024-11-18 15:15:42'),
(16, 2, 16, 16, 'Đang chờ thanh toán.!', '2025-01-13 09:15:37'),
(17, 1, 17, 17, 'Thanh toán thành công.!', '2025-01-13 09:15:37'),
(18, 2, 18, 18, 'Thanh toán thành công.!', '2025-01-13 09:15:37'),
(19, 3, 19, 19, 'Đang chờ xử lí.!', '2025-01-13 09:15:37'),
(20, 2, 20, 20, 'Thanh toán thành công.!', '2025-01-13 09:15:37'),
(21, 3, 21, 21, 'Thanh toán thành công.!', '2025-01-13 09:15:37'),
(22, 2, 22, 22, 'Đang chờ xử lí.!', '2025-01-13 09:15:37'),
(23, 1, 23, 23, 'Thanh toán thành công.!', '2024-10-16 15:15:42'),
(24, 1, 24, 24, 'Đang chờ thanh toán.!', '2025-01-13 09:15:37'),
(25, 2, 25, 25, 'Thanh toán thành công.!', '2025-01-13 09:15:37'),
(26, 1, 26, 26, 'Thanh toán thành công.', '2025-01-13 09:15:37'),
(27, 3, 27, 27, 'Đang chờ thanh toán.!', '2025-01-13 09:22:08'),
(28, 2, 28, 28, 'Thanh toán thành công.!', '2025-01-13 09:22:08'),
(29, 2, 29, 29, 'Đang chờ thanh toán.!', '2025-01-13 09:23:44'),
(30, 3, 30, 30, 'Đang chờ xử lí.!', '2025-01-13 09:23:45'),
(31, 1, 31, 31, 'Đang chờ thanh toán.!', '2025-01-13 09:31:09'),
(32, 2, 32, 32, 'Đang chờ xử lí.!', '2025-01-13 09:31:09'),
(33, 1, 33, 33, 'Đang chờ thanh toán.!', '2025-01-13 09:31:43'),
(34, 1, 34, 34, 'Đang chờ xử lí.!', '2025-01-13 09:31:43'),
(35, 1, 35, 35, 'Đang chờ thanh toán.!', '2025-01-13 09:32:40'),
(36, 2, 36, 36, 'Đang chờ thanh toán.!', '2025-01-13 09:33:02'),
(37, 2, 37, 37, 'Thanh toán thành công.!', '2025-01-13 09:33:02'),
(38, 3, 38, 38, 'Đang chờ thanh toán.!', '2024-10-14 01:39:55'),
(39, 1, 39, 39, 'Thanh toán thành công.!', '2024-10-14 01:39:55'),
(40, 2, 40, 40, 'Đặt cọc thành công.!', '2024-10-07 01:39:55'),
(41, 3, 41, 41, 'Đang chờ xử lí.!', '2025-01-13 19:56:31'),
(42, 1, 42, 42, 'Thanh toán thành công.!', '2025-01-13 19:56:31'),
(43, 2, 43, 43, 'Đang chờ xử lí', '2025-01-13 19:56:31'),
(44, 2, 44, 44, 'Đang chờ xử lí.!', '2025-01-13 19:56:31'),
(45, 3, 45, 45, 'Đang chờ xử lí.!', '2025-01-13 19:56:31'),
(46, 1, 46, 46, 'Thanh toán thành công.!', '2025-01-13 19:56:31'),
(47, 1, 47, 47, 'Đang chờ xử lí.!', '2025-01-13 19:56:31'),
(48, 1, 48, 48, 'Đang chờ xử lí.!', '2025-01-13 19:56:31'),
(49, 2, 49, 49, 'Thanh toán thành công.!', '2025-01-13 19:56:31'),
(50, 1, 50, 50, 'Thanh toán thành công.!', '2025-01-13 19:56:31'),
(51, 3, 51, 51, 'Thanh toán thành công.!', '2025-01-13 19:56:31'),
(52, 3, 52, 52, 'Đang chờ xử lí.!', '2025-01-13 19:56:31'),
(53, 2, 53, 53, 'Thanh toán thành công.!', '2025-01-13 19:56:31'),
(54, 3, 54, 54, 'Thanh toán thành công.!', '2025-01-13 19:56:31'),
(55, 1, 55, 55, 'Đang chờ thanh toán./', '2025-01-13 19:56:31'),
(56, 2, 56, 57, 'Đang chờ thanh toán.!', '2025-01-13 19:56:31'),
(57, 1, 57, 57, 'Đang chờ thanh toán.!', '2025-01-13 19:56:31'),
(58, 1, 58, 58, 'Thanh toán thành công.!', '2025-01-13 19:56:31'),
(59, 1, 59, 59, 'Đang chờ thanh toán.!', '2025-01-13 19:56:31'),
(60, 3, 60, 60, 'Đang xử lí.!', '2025-01-13 19:56:31'),
(61, 2, 61, 61, 'Thanh toán thành công.!', '2025-01-13 19:56:31'),
(62, 1, 62, 62, 'Đang chờ thanh toán.!', '2025-01-13 19:56:31'),
(63, 2, 63, 63, 'Đang chờ xử lí.!', '2025-01-13 19:56:31'),
(64, 1, 64, 64, 'Thanh toán thành công.!', '2025-01-13 19:56:31'),
(65, 1, 65, 65, 'Thanh toán thành công.!', '2025-01-13 19:56:31'),
(66, 3, 66, 66, 'Đang chờ thanh toán.!', '2025-01-13 19:56:31'),
(67, 1, 67, 67, 'Thanh toán thành công.!', '2025-01-13 19:56:31'),
(68, 3, 68, 68, 'Đang chờ xử lí.!', '2025-01-13 19:56:31'),
(69, 3, 69, 69, 'Đang chờ thanh toán.!', '2025-01-13 19:56:31'),
(70, 2, 70, 70, 'Thanh toán thành công.!', '2025-01-13 19:56:31'),
(71, 1, 71, 71, 'Đang chờ thanh toán.!', '2025-01-13 19:56:31'),
(72, 1, 72, 72, 'Đang chờ thanh toán.!', '2025-01-13 19:56:31');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `ID` int(11) NOT NULL,
  `roleID` int(11) NOT NULL,
  `name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `created_at` datetime NOT NULL,
  `phone` varchar(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `email` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`ID`, `roleID`, `name`, `password`, `created_at`, `phone`, `email`) VALUES
(1, 1, 'Phạm Trần Nhựt Quang', '111', '2024-03-07 06:48:24', '0821234567', 'quang10a128@gmail.com'),
(2, 0, 'Nguyễn Chí Sơn', '111', '2024-12-29 06:50:01', '0821234568', 'chison@gmail.com'),
(3, 0, 'Lê Thị Thanh Ngân', '111', '2024-12-20 17:10:52', '0456435644', 'thanhngan@gmail.com'),
(4, 0, 'Nguyễn Thị Ngọc Giàu', '111', '2024-02-01 18:39:13', '0254858485', 'ngocgiau@gmail.com'),
(5, 0, 'Ngô Nhã Thi ', '111', '2024-08-17 18:40:28', '0255855485', 'nhathi@gmail.com'),
(6, 0, 'Nguyễn Thị Hồng', '111', '2024-11-27 18:41:21', '0258558885', 'thihong@gmail.com'),
(7, 0, 'Nguyễn Diễm Quỳnh', '111', '2024-06-19 18:43:05', '0788455445', 'diemquynh@gmail.com'),
(8, 0, 'Huỳnh Chí Hướng', '111', '2024-06-19 18:44:13', '0557885555', 'chihuong@gmail.com'),
(9, 0, 'Nguyễn Quốc Đạt', '111', '2023-07-20 18:44:55', '0586545554', 'quocdat@gmail.com'),
(10, 0, 'Nguyễn Công Danh', '111', '2024-06-26 18:45:41', '0375266252', 'congdanh@gmail.com'),
(11, 0, 'Nguyễn Thị Triều Mến', '111', '2024-07-26 18:46:36', '0858145577', 'trieumen@gmail.com'),
(12, 0, 'Võ Thị Như Ý', '111', '2024-11-26 18:47:34', '0588785544', 'nhuy@gmail.com'),
(13, 0, 'Nguyễn Khôi Vĩ', '111', '2023-05-20 18:48:16', '0244747785', 'khoivi@gmail.com'),
(14, 0, 'Trương Linh Sang', '111', '2024-12-02 18:49:09', '0255755874', 'linhsang@gmail.com'),
(15, 0, 'Nguyễn Thị Trâm Anh', '111', '2024-02-21 18:49:55', '0939922313', 'tramanh@gmail.com'),
(16, 0, 'Nguyễn Thùy Dung', '111', '2024-01-16 18:50:46', '0235889977', 'thuydung@gmail.com'),
(17, 0, 'Lê Chí Hiếu', '111', '2024-06-18 18:51:29', '0258778877', 'chihieu@gmail.com'),
(18, 0, 'Võ Thanh Sang', '111', '2024-11-10 18:52:05', '0211458788', 'thanhsang@gmail.com'),
(19, 0, 'Nguyễn Cẩm Trang', '111', '2024-12-09 18:52:50', '0145777844', 'camtrang@gmail.com'),
(20, 0, ' Lê Thị Thanh Nguyên', '111', '2024-08-01 18:53:34', '0345879845', 'thanhnguyen@gmail.com'),
(21, 0, ' Nguyễn Văn Phú', '111', '2024-11-11 18:54:30', '0859755455', 'vanphu@gmail.com'),
(22, 0, 'Đỗ Thị Thiện Nhi', '111', '2023-11-21 18:55:20', '0399488532', 'thiennhi@gmail.com'),
(23, 0, 'Huỳnh Thị Ngọc Như', '111', '2021-04-29 19:30:15', '0248788988', 'ngocnhu@gmail.com'),
(24, 0, 'Nguyễn Thị Mỹ Tuyền', '111', '2025-01-14 19:31:02', '0245878965', 'mytuyen@gmail.com'),
(25, 0, 'Trần Thị Trúc Kiều', '111', '2024-01-22 19:31:34', '0258988999', 'truckieu@gmail.com'),
(26, 0, 'Đặng Văn Nghĩa', '111', '2023-03-25 19:32:06', '0376002446', 'vannghia@gmail.com'),
(27, 0, 'Nguyễn Thị Mỹ Kim', '111', '2023-01-01 19:32:56', '0455789545', 'mykim@gmail.com'),
(28, 0, 'Nguyễn Phước Sang', '111', '2023-05-30 19:33:45', '0424588887', 'phuocsang@gmail.com'),
(29, 0, 'Trần Ngô Bảo Châu', '111', '2023-01-10 19:34:22', '0587788877', 'baochau@gmail.com'),
(30, 0, 'Lê Ngọc Mai', '111', '2024-01-22 19:34:53', '0355777898', 'ngocmai@gmail.com'),
(31, 0, 'Nguyễn Thị Kim Ngân', '111', '2023-09-18 19:35:19', '0478545545', 'kimngan@gmail.com'),
(32, 0, 'Lê Hoàng Thái', '111', '2024-01-29 19:36:00', '0248877554', 'hoangthai@gmail.com'),
(33, 0, 'Trần Quốc Anh', '111', '2024-09-02 19:36:50', '0347884545', 'quocanh@gmail.com'),
(34, 0, 'Nguyễn Thị Tuyết Nhung', '111', '2024-08-01 19:37:24', '0785456255', 'tuyetnhung@gmail.com'),
(35, 0, 'Lê Phước Hải', '111', '2020-06-09 19:38:41', '0148888878', 'phuochai@gmail.com'),
(36, 0, 'Trần Đại Thăng', '111', '2023-01-23 19:39:16', '0345789584', 'daithang@gmail.com'),
(37, 0, 'Phan Quốc Huy', '111', '2024-06-26 19:39:53', '0145847751', 'quochuy@gmail.com'),
(38, 0, 'Phan Thúy Vy', '111', '2022-11-24 19:40:23', '0478544555', 'thuyvy@gmail.com'),
(39, 0, 'Nguyễn Ngọc Oanh', '111', '2022-04-09 19:40:59', '0314577554', 'ngocoanh@gmail.com'),
(40, 0, 'Hoàng Như Lan', '111', '2024-06-10 19:42:28', '0245554788', 'nhulan@gmail.com'),
(41, 0, 'Huỳnh Ngọc Lanh', '111', '2024-01-31 16:58:39', '0458752145', 'ngoclanh@gmail.com'),
(42, 0, 'Huỳnh Thiện Nhân', '111', '2024-07-17 16:59:53', '0876521123', 'thiennhan@gmail.com'),
(43, 0, 'Hoàng Kim Uyên', '111', '2024-06-12 16:59:53', '0123854417', 'kimuyen@gmail.com'),
(44, 0, 'Trần Trúc Ly', '111', '2024-10-15 17:01:31', '0874524114', 'trucly@gmail.com'),
(45, 0, 'Nguyễn Lệ Hằng', '111', '2024-06-27 17:02:40', '0647621457', 'lehang@gmail.com'),
(46, 0, 'Đặng Tố Như', '111', '2024-06-27 17:02:40', '0789256147', 'tonhu@gmail.com'),
(47, 0, 'Lê Hoàng Tuấn', '111', '2024-09-03 17:02:40', '0789245123', 'hoangtuan@gmail.com\r\n'),
(48, 0, 'Huỳnh Hữu Tình', '111', '2024-10-08 19:58:16', '0741454888', 'huutinh@gmail.com'),
(49, 0, 'Nguyễn Hà Tuyết Duy', '111', '2024-10-13 19:59:29', '0895464561', 'tuyetduy@gmail.com'),
(50, 0, 'Nguyễn Bảo Khánh', '111', '2024-09-10 20:02:40', '0875891017', 'baokhanh@gmail.com'),
(51, 0, 'Nguyễn Huyền Trang', '111', '2025-01-12 14:03:55', '0879456123', 'huyentrang@gmail.com'),
(52, 0, 'Đặng Minh Anh', '111', '2024-10-08 20:03:55', '0897601231', 'minhanh@gmail.com'),
(53, 0, 'Nguyễn Thị Thanh Thơ', '111', '2024-10-16 21:36:10', '0987545651', 'thanhtho@gmail.com'),
(54, 0, 'Trần Mai Phương', '111', '2024-10-14 21:36:10', '0896441234', 'maiphuong@gmail.com'),
(55, 0, 'Nguyễn Kim Tuyền', '111', '2024-10-15 21:36:10', '0909670909', 'kimtuyen@gmail.com'),
(56, 0, 'Cao Đoàn Kim Loan', '111', '2024-10-07 21:36:10', '0909764545', 'kimloan@gmail.com'),
(57, 0, 'Hoàng Mạnh Hải', '111', '2024-10-24 21:36:10', '0601455789', 'manhhai@gmail.com'),
(58, 0, 'Huỳnh Lâm Phúc Thịnh ', '111', '2024-10-14 21:36:10', '0907666437', 'phucthinh@gmail.com'),
(59, 0, 'Huỳnh Mỹ Hạnh', '111', '2024-11-19 21:36:10', '0307664512', 'myhanh@gmail.com\r\n'),
(60, 0, 'Trần Mỹ Anh', '111', '2024-10-15 21:36:10', '0907444423', 'myanh@gmail.com'),
(61, 0, 'Trần Quang Trạng ', '111', '2024-10-28 21:36:10', '0278787784', 'quangtrang@gmail.com'),
(62, 0, 'Nguyễn Thanh Sơn', '111', '2025-01-12 15:36:00', '0987536541', 'thanhson@gmail.com'),
(63, 0, 'Phạm Thị Cẩm Tiên', '111', '2025-01-12 15:36:00', '0235648877', 'camtien@gmail.com'),
(64, 0, 'Phan Thị Mai Trinh', '0789452223', '2024-11-06 21:36:10', '0907055123', 'maitrinh@gmail.com'),
(65, 0, 'Nguyễn Phú Sĩ', '111', '2024-09-16 21:36:10', '0907888456', 'phusi@gmail.com'),
(66, 0, 'Trần Ngọc Mai Linh', '111', '2024-11-04 21:36:10', '0645542157', 'mailinh@gmail.com'),
(67, 0, 'Nguyễn Văn Tính', '111', '2024-12-30 21:36:10', '0707555489', 'vantinh@gmail.com'),
(68, 0, 'Nguyễn Ngọc Minh', '111', '2025-01-12 15:36:00', '0785634789', 'ngocminh@gmail.com'),
(69, 0, 'Nguyễn Văn Bảo', '111', '2024-10-14 21:36:10', '0787845169', 'vanbao@gmail.com'),
(70, 0, 'Nguyễn Thị Mỹ Hậu', '111', '2024-11-05 21:36:10', '0987814345', 'myhau@gmail.com'),
(71, 0, 'Huỳnh Ngọc Ngân', '111', '2024-11-03 21:36:10', '0786321458', 'ngocngan@gmail.com'),
(72, 0, 'Lê Hoàng Sáng', '111', '2025-01-12 15:36:00', '0674569821', 'hoangsang@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `useraddress`
--

CREATE TABLE `useraddress` (
  `ID` int(11) NOT NULL,
  `userID` int(11) NOT NULL,
  `addresstext` text CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `useraddress`
--

INSERT INTO `useraddress` (`ID`, `userID`, `addresstext`) VALUES
(1, 1, 'Gia Lộc, Trảng Bàng, Tây Ninh.'),
(2, 2, 'Đông Hòa, Phú Yên'),
(3, 3, 'Bình Thạnh Đông, Phú Tân, An Giang'),
(4, 4, 'Xã Tả Phìn - Huyện Sa Pa - Tỉnh Lào Cai'),
(5, 5, 'Xã Đồng Văn - Huyện Đồng Văn - Tỉnh Hà Giang'),
(6, 6, 'Xã Ngọc Động - Huyện Thông Nông - Tỉnh Cao Bằng'),
(7, 7, 'Xã Chiêu Lưu - Huyện Kỳ Sơn - Tỉnh Nghệ An'),
(8, 8, 'Xã Phú Cường - Huyện Sóc Sơn - TP Hà Nội'),
(9, 9, 'Xã Tam Sơn - Huyện Từ Sơn - Tỉnh Bắc Ninh'),
(10, 10, 'Xã Hồng Thái Tây - Huyện Đông Triều - Tỉnh Quảng Ninh'),
(11, 11, 'Xã Đông Hưng - Huyện Tiên Lãng - TP Hải Phòng'),
(12, 12, 'Xã Thượng Lan - Huyện Việt Yên - Tỉnh Bắc Giang'),
(13, 13, 'Xã Sơn Dương - Huyện Sơn Dương - Tỉnh Tuyên Quang'),
(14, 14, 'Xã Sơn Dương - Huyện Sơn Dương - Tỉnh Tuyên Quang'),
(15, 15, 'Xã Cẩm Hà - Huyện Cẩm Xuyên - Tỉnh Hà Tĩnh'),
(16, 16, 'Xã Nghi Phú - TP Vinh - Tỉnh Nghệ An'),
(17, 17, 'Xã Lộc Thủy - Huyện Phú Lộc - Tỉnh Thừa Thiên Huế'),
(18, 18, 'Xã Cát Hải - Huyện Phù Cát - Tỉnh Bình Định'),
(19, 19, 'Xã Hòa Quý - Huyện Hòa Vang - TP Đà Nẵng'),
(20, 20, 'Xã Cam Thủy - Huyện Cam Lộ - Tỉnh Quảng Trị'),
(21, 21, 'Xã Diên Điền - Huyện Diên Khánh - Tỉnh Khánh Hòa'),
(22, 22, 'Xã Kỳ Long - Huyện Kỳ Anh - Tỉnh Hà Tĩnh'),
(23, 23, 'Xã Hương Long - Huyện Hương Khê - Tỉnh Hà Tĩnh'),
(24, 24, 'Xã Sơn Thọ - Huyện Vũ Quang - Tỉnh Hà Tĩnh'),
(25, 25, 'Xã Bến Củi - Huyện Dương Minh Châu - Tỉnh Tây Ninh'),
(26, 26, 'Xã Tân Thạnh - Huyện Long Phú - Tỉnh Sóc Trăng'),
(27, 27, 'Xã Châu Thới - Huyện Vĩnh Lợi - Tỉnh Bạc Liêu\r\n'),
(28, 28, 'Xã Châu Thới - Huyện Vĩnh Lợi - Tỉnh Bạc Liêu\r\n'),
(29, 29, 'Xã Hưng Điền - Huyện Tân Hưng - Tỉnh Long An\r\n'),
(30, 30, 'Xã An Phú - Huyện Củ Chi - TP Hồ Chí Minh\r\n\r\n'),
(31, 31, 'Xã Mỹ Khánh - Huyện Phong Điền - TP Cần Thơ\r\n'),
(32, 32, 'Xã Hiệp Phước - Huyện Nhà Bè - TP Hồ Chí Minh\r\n'),
(33, 33, 'Xã An Bình - Huyện Phú Giáo - Tỉnh Bình Dương\r\n'),
(34, 34, 'Xã Tân Đông - Huyện Gò Công Đông - Tỉnh Tiền Giang\r\n'),
(35, 35, 'Xã Cư Kuin - Huyện Cư Kuin - Tỉnh Đắk Lắk'),
(36, 36, 'Xã Ea Súp - Huyện Ea Súp - Tỉnh Đắk Lắk'),
(37, 37, 'Xã Nam Yang - Huyện Đak Đoa - Tỉnh Gia Lai'),
(38, 38, 'Xã Tân Hà - Huyện Lâm Hà - Tỉnh Lâm Đồng'),
(39, 39, 'Xã Đạ Tông - Huyện Đam Rông - Tỉnh Lâm Đồng'),
(40, 40, 'Xã Quảng Sơn - Huyện Đắk Glong - Tỉnh Đắk Nông'),
(41, 41, 'Xã Ea Tóh - Huyện Krông Năng - Tỉnh Đắk Lắk'),
(42, 42, 'Xã Đắk Plao - Huyện Đắk Glong - Tỉnh Đắk Nông'),
(43, 43, 'Xã Đinh Trang Hòa - Huyện Di Linh - Tỉnh Lâm Đồng'),
(44, 44, 'Xã Chư Á - Huyện Ia Grai - Tỉnh Gia Lai'),
(45, 45, 'Xã Phước Tân - TP Biên Hòa - Tỉnh Đồng Nai'),
(46, 46, 'Xã Tân Hòa - Huyện Tân Thành - Tỉnh Bà Rịa - Vũng Tàu'),
(47, 47, 'Xã Mỹ Lộc - Huyện Cần Đước - Tỉnh Long An'),
(48, 48, 'Xã Suối Nghệ - Huyện Châu Đức - Tỉnh Bà Rịa - Vũng Tàu'),
(49, 49, 'Xã Bảo Hòa - Huyện Xuân Lộc - Tỉnh Đồng Nai'),
(50, 50, 'Xã Tân Thành - Huyện Đồng Phú - Tỉnh Bình Phước'),
(51, 51, 'Xã Đức Hạnh - Huyện Bù Gia Mập - Tỉnh Bình Phước'),
(52, 52, 'Xã Long Hòa - Huyện Phú Tân - Tỉnh An Giang'),
(53, 53, 'Xã Định Hòa - TP Thủ Dầu Một - Tỉnh Bình Dương'),
(54, 54, 'Xã Long Thành - Huyện Nhơn Trạch - Tỉnh Đồng Nai'),
(55, 55, 'Xã Tân Thành - Huyện Gò Công Tây - Tỉnh Tiền Giang'),
(56, 56, 'Xã Hòa Khánh - Huyện Cái Bè - Tỉnh Tiền Giang'),
(57, 57, 'Xã Trường Long - Huyện Phong Điền - TP Cần Thơ'),
(58, 58, 'Xã Đông Thạnh - Huyện An Minh - Tỉnh Kiên Giang'),
(59, 59, 'Xã Mỹ Đức - Huyện Cái Bè - Tỉnh Tiền Giang'),
(60, 60, 'Xã Hòa Bình - Huyện Chợ Mới - Tỉnh An Giang'),
(61, 61, 'Xã Phú Hưng - Huyện Cái Nước - Tỉnh Cà Mau'),
(62, 62, 'Xã Hưng Hội - Huyện Vĩnh Lợi - Tỉnh Bạc Liêu'),
(63, 63, 'Xã Tân Phong - Huyện Giá Rai - Tỉnh Bạc Liêu'),
(64, 64, 'Xã Mỹ Long - Huyện Cai Lậy - Tỉnh Tiền Giang'),
(65, 65, 'Xã Sơn Hà - Huyện Nho Quan - Tỉnh Ninh Bình'),
(66, 66, 'Xã Đồng Hóa - Huyện Kim Bảng - Tỉnh Hà Nam'),
(67, 67, 'Xã Yên Hòa - Huyện Yên Mô - Tỉnh Ninh Bình'),
(68, 68, 'Xã Đông Cao - Huyện Phổ Yên - Tỉnh Thái Nguyên'),
(69, 69, 'Xã Thanh Sơn - Huyện Thanh Hà - Tỉnh Hải Dương'),
(70, 70, 'Xã An Bình - Huyện Nam Sách - Tỉnh Hải Dương'),
(71, 71, 'Xã Phong An - Huyện Phong Điền - Tỉnh Thừa Thiên Huế'),
(72, 72, 'Xã Cẩm Bình - Huyện Cẩm Xuyên - Tỉnh Hà Tĩnh');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `amenities`
--
ALTER TABLE `amenities`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `apartment`
--
ALTER TABLE `apartment`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `typeID` (`typeID`),
  ADD KEY `userID` (`userID`),
  ADD KEY `addressID` (`addressID`),
  ADD KEY `categoryID` (`categoryID`),
  ADD KEY `amenitiesID` (`amenitiesID`);

--
-- Indexes for table `apartmenttype`
--
ALTER TABLE `apartmenttype`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `categoryID` (`categoryID`);

--
-- Indexes for table `apartmentview`
--
ALTER TABLE `apartmentview`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `userID` (`userID`),
  ADD KEY `apartmentID` (`apartmentID`);

--
-- Indexes for table `appartment_address`
--
ALTER TABLE `appartment_address`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `favorites`
--
ALTER TABLE `favorites`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `apartmentID` (`apartmentID`),
  ADD KEY `userID` (`userID`);

--
-- Indexes for table `images`
--
ALTER TABLE `images`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `apartmentID` (`apartmentID`);

--
-- Indexes for table `messenger`
--
ALTER TABLE `messenger`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `userID` (`userID`);

--
-- Indexes for table `notification`
--
ALTER TABLE `notification`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `userID` (`userID`);

--
-- Indexes for table `paymentmethod`
--
ALTER TABLE `paymentmethod`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `provinces`
--
ALTER TABLE `provinces`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `apartmentID` (`apartmentID`);

--
-- Indexes for table `roles`
--
ALTER TABLE `roles`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `transaction`
--
ALTER TABLE `transaction`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `apartmentID` (`apartmentID`),
  ADD KEY `paymentID` (`paymentID`),
  ADD KEY `userID` (`userID`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `roleID` (`roleID`);

--
-- Indexes for table `useraddress`
--
ALTER TABLE `useraddress`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `userID` (`userID`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `apartment`
--
ALTER TABLE `apartment`
  ADD CONSTRAINT `apartment_ibfk_1` FOREIGN KEY (`typeID`) REFERENCES `apartmenttype` (`ID`),
  ADD CONSTRAINT `apartment_ibfk_2` FOREIGN KEY (`userID`) REFERENCES `user` (`ID`),
  ADD CONSTRAINT `apartment_ibfk_3` FOREIGN KEY (`addressID`) REFERENCES `appartment_address` (`ID`),
  ADD CONSTRAINT `apartment_ibfk_4` FOREIGN KEY (`categoryID`) REFERENCES `category` (`ID`),
  ADD CONSTRAINT `apartment_ibfk_5` FOREIGN KEY (`amenitiesID`) REFERENCES `amenities` (`ID`);

--
-- Constraints for table `apartmenttype`
--
ALTER TABLE `apartmenttype`
  ADD CONSTRAINT `apartmenttype_ibfk_1` FOREIGN KEY (`categoryID`) REFERENCES `category` (`ID`);

--
-- Constraints for table `apartmentview`
--
ALTER TABLE `apartmentview`
  ADD CONSTRAINT `apartmentview_ibfk_1` FOREIGN KEY (`userID`) REFERENCES `user` (`ID`),
  ADD CONSTRAINT `apartmentview_ibfk_2` FOREIGN KEY (`apartmentID`) REFERENCES `apartment` (`ID`);

--
-- Constraints for table `favorites`
--
ALTER TABLE `favorites`
  ADD CONSTRAINT `favorites_ibfk_1` FOREIGN KEY (`apartmentID`) REFERENCES `apartment` (`ID`),
  ADD CONSTRAINT `favorites_ibfk_2` FOREIGN KEY (`userID`) REFERENCES `user` (`ID`);

--
-- Constraints for table `images`
--
ALTER TABLE `images`
  ADD CONSTRAINT `images_ibfk_1` FOREIGN KEY (`apartmentID`) REFERENCES `apartment` (`ID`);

--
-- Constraints for table `messenger`
--
ALTER TABLE `messenger`
  ADD CONSTRAINT `messenger_ibfk_1` FOREIGN KEY (`userID`) REFERENCES `user` (`ID`);

--
-- Constraints for table `notification`
--
ALTER TABLE `notification`
  ADD CONSTRAINT `notification_ibfk_1` FOREIGN KEY (`userID`) REFERENCES `user` (`ID`);

--
-- Constraints for table `provinces`
--
ALTER TABLE `provinces`
  ADD CONSTRAINT `provinces_ibfk_1` FOREIGN KEY (`apartmentID`) REFERENCES `apartment` (`ID`);

--
-- Constraints for table `transaction`
--
ALTER TABLE `transaction`
  ADD CONSTRAINT `transaction_ibfk_1` FOREIGN KEY (`apartmentID`) REFERENCES `apartment` (`ID`),
  ADD CONSTRAINT `transaction_ibfk_2` FOREIGN KEY (`paymentID`) REFERENCES `paymentmethod` (`ID`),
  ADD CONSTRAINT `transaction_ibfk_3` FOREIGN KEY (`userID`) REFERENCES `user` (`ID`);

--
-- Constraints for table `user`
--
ALTER TABLE `user`
  ADD CONSTRAINT `user_ibfk_1` FOREIGN KEY (`roleID`) REFERENCES `roles` (`ID`);

--
-- Constraints for table `useraddress`
--
ALTER TABLE `useraddress`
  ADD CONSTRAINT `useraddress_ibfk_1` FOREIGN KEY (`userID`) REFERENCES `user` (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
