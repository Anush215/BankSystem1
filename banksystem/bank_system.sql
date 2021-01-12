-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 24, 2020 at 08:19 AM
-- Server version: 10.4.13-MariaDB
-- PHP Version: 7.2.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bank_system`
--

-- --------------------------------------------------------

--
-- Table structure for table `acc_details`
--

CREATE TABLE `acc_details` (
  `acc_no` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  `dob` varchar(45) NOT NULL,
  `address` varchar(150) NOT NULL,
  `nic` varchar(20) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `mobile` varchar(12) NOT NULL,
  `email` varchar(100) NOT NULL,
  `nationality` varchar(20) NOT NULL,
  `acc_type` varchar(10) NOT NULL,
  `int_pay` double NOT NULL,
  `balance` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `acc_details`
--

INSERT INTO `acc_details` (`acc_no`, `name`, `dob`, `address`, `nic`, `gender`, `mobile`, `email`, `nationality`, `acc_type`, `int_pay`, `balance`) VALUES
(1, 'test', '08.02.1999', 'test', '123456789', 'male', '123456789', 'test@gmail.com', 'test', 'current', 1000, 1069),
(2, 'ewq', 'ewq', 'weqeqe', 'weq', 'we', 'eqwewq', 'qweqe', 'eqe', 'we', 2500, 0),
(3, 'err', 'rewr', 'ewrwre', 'erwr', 'werrw', 'rwerw', 'erwrwe', 'erwr', 'were', 7520, 0),
(10002, 'dsfff', 'ffffds', 'fsssssss', 'ffffs', 'male', 'ddsffds', 'fsfsfsd', 'fsfdsfsd', 'current', 7845, 0),
(10003, 'wqeeq', 'weqffs', 'dfsgsgdfh', 'hdgfdg', 'male', 'fgsdfs', 'sdfsf', 'dfsfsfd', 'current', 745, 0),
(10004, 'qweqweq', 'weqqw', 'eqweqe', 'qweeqe', 'male', 'ewqeq', 'eqwqwe', 'weqe', 'current', 12344, 0),
(10005, 'yasith', '02.02.2020', 'rathnapura', '741852963V', 'male', '741852963', 'yasith@mail.com', 'LK', 'savings', 2500, 1),
(10006, 'niki', '01.02.1365', 'colombo,srilanka', '123456789V', 'female', '0123456789', 'niki@mail.com', 'LK', 'savings', 2500, 996);

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`username`, `password`) VALUES
('bank', '1234');

-- --------------------------------------------------------

--
-- Table structure for table `cashier`
--

CREATE TABLE `cashier` (
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `cashier`
--

INSERT INTO `cashier` (`username`, `password`) VALUES
('cashier', 'cashier1'),
('test', 'test1'),
('yasith', 'yasith');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `acc_details`
--
ALTER TABLE `acc_details`
  ADD PRIMARY KEY (`acc_no`);

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `cashier`
--
ALTER TABLE `cashier`
  ADD PRIMARY KEY (`username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `acc_details`
--
ALTER TABLE `acc_details`
  MODIFY `acc_no` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10007;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
