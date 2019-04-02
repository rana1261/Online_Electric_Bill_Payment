-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 14, 2018 at 09:57 AM
-- Server version: 10.1.30-MariaDB
-- PHP Version: 7.2.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `myproject`
--

-- --------------------------------------------------------

--
-- Table structure for table `registration`
--

CREATE TABLE `registration` (
  `id` int(6) NOT NULL,
  `name` varchar(60) NOT NULL,
  `father` varchar(60) NOT NULL,
  `mobile` varchar(60) NOT NULL,
  `division` varchar(60) NOT NULL,
  `district` varchar(60) NOT NULL,
  `thana` varchar(60) NOT NULL,
  `address` varchar(200) NOT NULL,
  `rusername` varchar(60) DEFAULT NULL,
  `rpassword` varchar(60) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `registration`
--

INSERT INTO `registration` (`id`, `name`, `father`, `mobile`, `division`, `district`, `thana`, `address`, `rusername`, `rpassword`) VALUES
(1, 'Sohel Rana', 'Abdul Motin', '01788090340', 'Rangpur', 'Dinajpur', 'Chirirbandar', '8 No. Saita Union porishod, khochuna, khoeruddinsha para.', 'rana1261', 'rana1261'),
(2, 'Razib', 'talem', '01719464738', 'Rangpur', 'Gaibandha', 'Gobindaganj', 'sador road', 'razib', 'razib123'),
(4, 'saif', 'sadikul', '01788090340', 'Rajshahi', 'Naogaon', 'Manda', '5 road bosir uddin', 'saif', 'saif123');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `registration`
--
ALTER TABLE `registration`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `registration`
--
ALTER TABLE `registration`
  MODIFY `id` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
