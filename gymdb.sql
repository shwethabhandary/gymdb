-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Nov 24, 2018 at 10:18 AM
-- Server version: 5.7.23
-- PHP Version: 7.2.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `gymdb`
--

DELIMITER $$
--
-- Procedures
--
DROP PROCEDURE IF EXISTS `getCount`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `getCount` (IN `id` VARCHAR(20))  NO SQL
select * from equipment where eid=id$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `branch`
--

DROP TABLE IF EXISTS `branch`;
CREATE TABLE IF NOT EXISTS `branch` (
  `brnid` varchar(10) NOT NULL,
  `brnname` varchar(10) NOT NULL,
  `brnloc` varchar(20) NOT NULL,
  PRIMARY KEY (`brnloc`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `branch`
--

INSERT INTO `branch` (`brnid`, `brnname`, `brnloc`) VALUES
('1', 'cncone', 'Koramangala'),
('2', 'cnctwo', 'Indiranagar'),
('3', 'cncthree', 'Jayanagar');

-- --------------------------------------------------------

--
-- Table structure for table `class`
--

DROP TABLE IF EXISTS `class`;
CREATE TABLE IF NOT EXISTS `class` (
  `classid` varchar(10) NOT NULL,
  `name` varchar(20) NOT NULL,
  `cost` double NOT NULL,
  `duration` int(11) NOT NULL,
  `instrid` varchar(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `class`
--

INSERT INTO `class` (`classid`, `name`, `cost`, `duration`, `instrid`) VALUES
('1001', 'Zumba', 2000, 120, '10001'),
('1002', 'Yoga', 2000, 120, '10002'),
('1003', 'Strength', 5000, 300, '10003'),
('2001', 'Zumba', 2000, 120, '20001'),
('2002', 'Yoga', 2000, 120, '20002'),
('2003', 'Strength', 5000, 300, '20003'),
('3001', 'Zumba', 2000, 120, '30001'),
('3002', 'Yoga', 2000, 120, '30002'),
('3003', 'Strength', 5000, 300, '30003');

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
CREATE TABLE IF NOT EXISTS `customer` (
  `memid` bigint(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  `gender` char(1) NOT NULL,
  `dob` varchar(15) NOT NULL,
  `phno` varchar(20) NOT NULL,
  `addr` varchar(20) NOT NULL,
  `brnloc` varchar(20) NOT NULL,
  `classid` varchar(10) NOT NULL,
  `email` varchar(20) NOT NULL,
  `pass` varchar(20) NOT NULL,
  `cdate` datetime DEFAULT NULL,
  PRIMARY KEY (`memid`)
) ENGINE=MyISAM AUTO_INCREMENT=1000000010 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`memid`, `name`, `gender`, `dob`, `phno`, `addr`, `brnloc`, `classid`, `email`, `pass`, `cdate`) VALUES
(1000000007, 'Preethi Shenoy', 'F', '28-04-1998', '9876543219', 'Bantwal', 'Koramangala', '1001', 'preethi@gmail.com', 'preethi', NULL),
(81970, 'root', 'r', 'root', 'root', 'root', 'root', 'root', 'root', 'r', NULL),
(1000000009, 's', 's', 's', 's', 's', 's', 's', 's', 's', '2018-11-16 13:38:53');

--
-- Triggers `customer`
--
DROP TRIGGER IF EXISTS `addDateTime`;
DELIMITER $$
CREATE TRIGGER `addDateTime` BEFORE INSERT ON `customer` FOR EACH ROW SET new.cdate=now()
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `equilend`
--

DROP TABLE IF EXISTS `equilend`;
CREATE TABLE IF NOT EXISTS `equilend` (
  `memid` bigint(10) NOT NULL,
  `eid` varchar(10) NOT NULL,
  `checkin` varchar(10) NOT NULL,
  `checkout` varchar(10) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `equilend`
--

INSERT INTO `equilend` (`memid`, `eid`, `checkin`, `checkout`) VALUES
(81970, '', '', ''),
(81970, '101', '56', '549'),
(81970, '101', '54', '84'),
(81970, '101', '55', '548'),
(81970, '101', '4848', '8488'),
(81970, '101', '49', '96'),
(81970, '101', '8484', '8484'),
(81970, '101', '848', '848'),
(81970, '101', '848', '48'),
(81970, '101', '548', '548'),
(81970, '101', '549', '5646'),
(81970, '101', '114', '546'),
(81970, '101', '545', '646');

-- --------------------------------------------------------

--
-- Table structure for table `equipment`
--

DROP TABLE IF EXISTS `equipment`;
CREATE TABLE IF NOT EXISTS `equipment` (
  `eid` varchar(10) NOT NULL,
  `copies` int(11) NOT NULL,
  PRIMARY KEY (`eid`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `equipment`
--

INSERT INTO `equipment` (`eid`, `copies`) VALUES
('101', 3),
('102', 3),
('103', 3),
('104', 3);

-- --------------------------------------------------------

--
-- Table structure for table `instructor`
--

DROP TABLE IF EXISTS `instructor`;
CREATE TABLE IF NOT EXISTS `instructor` (
  `instrid` varchar(10) NOT NULL,
  `name` varchar(20) NOT NULL,
  `gender` char(1) NOT NULL,
  `age` int(10) NOT NULL,
  `phno` varchar(20) NOT NULL,
  `addr` varchar(20) NOT NULL,
  `brnloc` varchar(20) NOT NULL,
  `classid` varchar(10) NOT NULL,
  `rating` varchar(20) NOT NULL,
  `email` varchar(50) NOT NULL,
  `pass` varchar(20) NOT NULL,
  PRIMARY KEY (`instrid`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `instructor`
--

INSERT INTO `instructor` (`instrid`, `name`, `gender`, `age`, `phno`, `addr`, `brnloc`, `classid`, `rating`, `email`, `pass`) VALUES
('10001', 'Rahul Kakkadan', 'M', 25, '9876543219', 'Mangalore', 'Koramangala', '1001', '4', 'rahulkakkadan@gmail.com', 'rahul10001'),
('10002', 'Siddharth K', 'M', 30, '8745963214', 'Mumbai', 'Koramangala', '1002', '4', 'siddharthk@gmail.com', 'siddharth10002'),
('10003', 'Saurav B', 'M', 30, '9632587415', 'Jaipur', 'Koramangala', '1003', '4', 'sauravb@gmail.com', 'sauravb10003'),
('20001', 'Priyanka N', 'F', 25, '9874563217', 'Chennai', 'Indiranagar', '2001', '5', 'priyankan@gmail.com', 'priyankan20001'),
('20002', 'Shravani G', 'F', 28, '9874563215', 'Shimla', 'Indiranagar', '2002', '5', 'shravanig@gmail.com', 'shravanig2002'),
('20003', 'Sridhar B', 'M', 30, '9876543218', 'Kolkatta', 'Indiranagar', '2003', '5', 'sridharb@gmail.com', 'sridharb2003'),
('30001', 'Adrian D', 'M', 29, '8456321795', 'Delhi', 'Jayanagar', '3001', '4', 'adriand@gmail.com', 'adriand30001'),
('30002', 'Aditya B', 'M', 27, '8456971235', 'Udupi', 'Jayanagar', '3002', '4', 'adityab@gmail.com', 'adityab30002'),
('30003', 'Ramesh', 'M', 32, '7412589635', 'Kerala', 'Jayanagar', '3003', '4', 'ramesh@gmail.com', 'ramesh30003');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
