-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Mar 16, 2017 at 08:52 PM
-- Server version: 10.1.10-MariaDB
-- PHP Version: 7.0.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `student_database`
--

-- --------------------------------------------------------

--
-- Table structure for table `courses_data`
--

CREATE TABLE `courses_data` (
  `Course_Id` varchar(20) NOT NULL,
  `Course_Name` varchar(20) NOT NULL,
  `Taught_by` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `courses_data`
--

INSERT INTO `courses_data` (`Course_Id`, `Course_Name`, `Taught_by`) VALUES
('acc33110', 'Accounting', 'Harden'),
('acc33110', 'Accounting', 'Rice'),
('chem2211', 'Organic Chemistry', 'Carr'),
('cs1201', 'Computer Architectur', 'Kelley'),
('cs2410', 'Digital Logic', 'Gray'),
('cs2410', 'Digital Logic', 'Jenkins'),
('cs3300', 'Object Oriented Prog', 'Ali'),
('cs3306', 'Theory of Computatio', 'Xavier'),
('cs3322', 'Artificial Intellege', 'Sims'),
('cs3404', 'Software Engineering', 'Hudson'),
('cs4302', 'Programming Language', 'Uzamaki'),
('cs4303', 'Operating Ssytems', 'Bowman'),
('cs4303', 'Operating Ssytems', 'Xavier'),
('eco2402', 'Macro Economics', 'Bradley'),
('eco2402', 'Macro Economics', 'Parker'),
('eng1011', 'English 101', 'Torres'),
('eng1301', 'English Composition', 'Parker'),
('math2405', 'Discrete Math', 'Kent'),
('math2407', 'Linear Algebra', 'Wayne');

-- --------------------------------------------------------

--
-- Table structure for table `student_data`
--

CREATE TABLE `student_data` (
  `Student_id` varchar(20) NOT NULL,
  `first_name` varchar(20) NOT NULL,
  `last_name` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `email` varchar(50) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `date_of_birth` varchar(20) NOT NULL,
  `Street_address` varchar(50) NOT NULL,
  `city` varchar(20) NOT NULL,
  `State` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student_data`
--

INSERT INTO `student_data` (`Student_id`, `first_name`, `last_name`, `password`, `email`, `gender`, `date_of_birth`, `Street_address`, `city`, `State`) VALUES
('andrewska1', 'Katherine', 'Andrews', 'student12', 'kandrewsb@senate.gov', 'Female', '2/21/2017', '36 Spaight Pass', 'Tampa', 'Florida'),
('austinal1', 'Albert', 'Austin', 'student14', 'aaustind@github.io', 'Male', '3/5/2017', '7827 Lerdahl Court', 'Sacramento', 'California'),
('bellcy1', 'Cynthia', 'Bell', 'student6', 'cbell5@theguardian.com', 'Female', '7/23/2016', '3351 Stoughton Circle', 'Lees Summit', 'Missouri'),
('bishopki1', 'Kimberly', 'Bishop', 'student17', 'kbishopg@va.gov', 'Female', '1/28/2017', '577 Wayridge Lane', 'Buffalo', 'New York'),
('butlerlo1', 'Louis', 'Butler', 'student24', 'lbutlern@blinklist.com', 'Male', '3/27/2016', '215 Tony Hill', 'Wilmington', 'Delaware'),
('cooperer1', 'Eric', 'Cooper', 'student20', 'ecooperj@alibaba.com', 'Male', '7/8/2016', '0575 Cardinal Hill', 'Louisville', 'Kentucky'),
('crawfordbr1', 'Brian', 'Crawford', 'student21', 'bcrawfordk@examiner.com', 'Male', '7/4/2016', '163 Rusk Road', 'Columbus', 'Ohio'),
('dunnro1', 'Ronald', 'Dunn', 'student19', 'rdunni@typepad.com', 'Male', '1/16/2017', '6 New Castle Crossing', 'Erie', 'Pennsylvania'),
('fowlerju1', 'Judy', 'Fowler', 'student9', 'jfowler8@miitbeian.gov.cn', 'Female', '1/26/2017', '25028 American Ash Center', 'Englewood', 'Colorado'),
('garrettma1', 'Maria', 'Garrett', 'student11', 'mgarretta@smh.com.au', 'Female', '9/16/2016', '33 Helena Drive', 'Boston', 'Massachusetts'),
('hudsonca1', 'Catherine', 'Hudson', 'student8', 'chudson7@intel.com', 'Female', '11/20/2016', '78706 Declaration Point', 'Atlanta', 'Georgia'),
('jenkinsch1', 'Christine', 'Jenkins', 'student7', 'cjenkins6@woothemes.com', 'Female', '8/14/2016', '6 Anthes Circle', 'Hampton', 'Virginia'),
('millsfr1', 'Fred', 'Mills', 'student25', 'fmillso@google.co.uk', 'Male', '3/21/2016', '3234 Kinsman Court', 'Apache Junction', 'Arizona'),
('millsjo1', 'Jose', 'Mills', 'student22', 'jmillsl@tripadvisor.com', 'Male', '2/17/2017', '17 Prentice Place', 'Aurora', 'Colorado'),
('montgomeryad1', 'Adam', 'Montgomery', 'student16', 'amontgomeryf@census.gov', 'Male', '10/14/2016', '716 Transport Court', 'Dearborn', 'Michigan'),
('mooreph1', 'Phyllis', 'Moore', 'student13', 'pmoorec@msn.com', 'Female', '7/23/2016', '9 Florence Court', 'Denver', 'Colorado'),
('pattersonka1', 'Kathleen', 'Patterson', 'student18', 'kpattersonh@google.ru', 'Female', '8/12/2016', '1504 Vahlen Alley', 'Washington', 'District of Columbia'),
('robertsonja1', 'Janice', 'Robertson', 'student10', 'jrobertson9@arizona.edu', 'Female', '5/29/2016', '13 Gina Plaza', 'San Antonio', 'Texas'),
('rossla1', 'Laura', 'Ross', 'student5', 'lross4@google.it', 'Female', '9/12/2016', '3 Harper Parkway', 'Des Moines', 'Iowa'),
('ruizbe1', 'Benjamin', 'Ruiz', 'student2', 'bruiz1@weather.com', 'Male', '9/27/2016', '3 Erie Center', 'Longview', 'Texas'),
('spencerla1', 'Laura', 'Spencer', 'student3', 'lspencer2@sun.com', 'Female', '3/4/2017', '54350 Iowa Way', 'Cedar Rapids', 'Iowa'),
('stephenseu1', 'Eugene', 'Stephens', 'student15', 'estephense@va.gov', 'Male', '7/7/2016', '1 Londonderry Parkway', 'Milwaukee', 'Wisconsin'),
('stewartra1', 'Raymond', 'Stewart', 'student4', 'rstewart3@virginia.edu', 'Male', '2/8/2017', '22 Kensington Hill', 'Los Angeles', 'California'),
('vasquezcl1', 'Clarence', 'Vasquez', 'student23', 'cvasquezm@google.ru', 'Male', '12/13/2016', '059 Bartillon Court', 'Harrisburg', 'Pennsylvania'),
('walkerha1', 'Harry', 'Walker', 'student1', 'hwalker0@usda.gov', 'Male', '8/18/2016', '75838 Susan Street', 'Rochester', 'New York');

-- --------------------------------------------------------

--
-- Table structure for table `student_schedule`
--

CREATE TABLE `student_schedule` (
  `student_id` varchar(20) NOT NULL,
  `Courses` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student_schedule`
--

INSERT INTO `student_schedule` (`student_id`, `Courses`) VALUES
('andrewska1', 'cs3404'),
('austinal1', 'acc3110'),
('bellcy1', 'eco2402'),
('bishopki1', 'cs3300'),
('butlerlo1', 'eng1301'),
('cooperer1', 'acc3111'),
('crawfordbr1', 'cs1201'),
('dunnro1', 'eco2403'),
('fowlerju1', 'cs3300'),
('garrettma1', 'eco2402'),
('hudsonca1', 'cs3306'),
('jenkinsch1', 'cs3322'),
('millsfr1', 'eco2402'),
('millsjo1', 'cs3306'),
('montgomeryad1', 'math2405'),
('mooreph1', 'cs4301'),
('pattersonka1', 'eng1301'),
('robertsonja1', 'cs4303'),
('rossla1', 'acc3110'),
('ruizbe1', 'cs4303'),
('spencerla1', 'cs4303'),
('stephenseu1', 'math2407'),
('stewartra1', 'eco2402'),
('vasquezcl1', 'cs4301'),
('walkerha1', 'cs2410');

-- --------------------------------------------------------

--
-- Table structure for table `teacher_data`
--

CREATE TABLE `teacher_data` (
  `Faculty_id` varchar(50) NOT NULL,
  `Password` varchar(50) NOT NULL,
  `first_name` varchar(50) NOT NULL,
  `last_name` varchar(50) NOT NULL,
  `email` varchar(100) NOT NULL,
  `Gender` varchar(7) NOT NULL,
  `Courses_taught` varchar(30) NOT NULL,
  `course_id` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `teacher_data`
--

INSERT INTO `teacher_data` (`Faculty_id`, `Password`, `first_name`, `last_name`, `email`, `Gender`, `Courses_taught`, `course_id`) VALUES
('alip2', 'teacher18', 'Mohammad', 'Ali', 'amohamm@jailbum.net', 'Male', 'Object Oriented Programming', 'cs3300'),
('bowmanaa1', 'teacher5', 'Aaron', 'Bowman', 'abowman4@slate.com', 'Male', 'Operating Systems', 'cs4303'),
('bradleyad1', 'teacher6', 'Adam', 'Bradley', 'abradley5@disqus.com', 'Male', 'Macro Economics', 'eco2402'),
('carrpa1', 'teacher2', 'Pamela', 'Carr', 'pcarr1@cargocollective.com', 'Female', 'Organic Chemistry', 'chem2211'),
('grayp2', 'teacher14', 'Jean ', 'Gray', 'jgray8@jailbum.net', 'Male', 'Digital Logic', 'cs2410'),
('hardenp2', 'teacher17', 'James', 'Harden', 'jharden@rambler.ru', 'Male', 'Accounting', 'acc3110'),
('hudsongl1', 'teacher8', 'Gloria', 'Hudson', 'ghudson7@hatena.ne.jp', 'Female', 'Software Engineering', 'cs3404'),
('jenkinsdo1', 'teacher9', 'Dorothy', 'Jenkins', 'djenkins8@time.com', 'Female', 'Robotics', 'cs4305'),
('jenkinsel1', 'teacher4', 'Elizabeth', 'Jenkins', 'ejenkins3@google.ca', 'Female', 'Digital Logic', 'cs2410'),
('kelleyam1', 'teacher3', 'Amy', 'Kelley', 'akelley2@studiopress.com', 'Female', 'Computer Architecture', 'cs1201'),
('kentp2', 'teacher13', 'Clark', 'Kent', 'kclark12@free.fr', 'Male', 'Discrete Math', 'math2405'),
('parkerp2', 'teacher11', 'Peter', 'Parker', 'pparker@google.com.au', 'Male', 'English Composition', 'eng1301'),
('parkerp2', 'teacher11', 'Peter', 'Parker', 'pparker@google.com.au', 'Male', 'Macro Economics', 'eco2402'),
('ricema1', 'teacher7', 'Mark', 'Rice', 'mrice6@slate.com', 'Male', 'Accounting', 'acc3110'),
('simska1', 'teacher10', 'Kathleen', 'Sims', 'ksims9@cnbc.com', 'Female', 'Artificial Intellige', 'cs3322'),
('torressa1', 'teacher1', 'Sara', 'Torres', 'storres0@csmonitor.com', 'Female', 'English 101', 'eng1011'),
('uzamakip2', 'teacher16', 'Nauroto', 'Uzamaki', 'unauroto20@umich.edu', 'Male', 'Programming Language Concepts', 'cs4302'),
('waynep2', 'teacher12', 'Bruce', 'Wayne', 'bwayne7@yandex.ru', 'Male', 'Linear Algebra', 'math2407'),
('xavierp2', 'teacher20', 'Charles', 'Xavier', 'xcharly19@ihg.com', 'Male', 'Operating Systems', 'cs4303'),
('xavierp2', 'teacher20', 'Charles', 'Xavier', 'xcharly19@ihg.com', 'Male', 'Theory of Computation', 'cs3306');

-- --------------------------------------------------------

--
-- Table structure for table `tests_data`
--

CREATE TABLE `tests_data` (
  `course_id` varchar(50) NOT NULL,
  `Test_1` double(2,0) NOT NULL,
  `Test_2` double(2,0) NOT NULL,
  `Test_3` double(2,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `courses_data`
--
ALTER TABLE `courses_data`
  ADD PRIMARY KEY (`Course_Id`,`Taught_by`);

--
-- Indexes for table `student_data`
--
ALTER TABLE `student_data`
  ADD PRIMARY KEY (`Student_id`);

--
-- Indexes for table `student_schedule`
--
ALTER TABLE `student_schedule`
  ADD PRIMARY KEY (`student_id`,`Courses`);

--
-- Indexes for table `teacher_data`
--
ALTER TABLE `teacher_data`
  ADD PRIMARY KEY (`Faculty_id`,`Password`,`Courses_taught`),
  ADD UNIQUE KEY `ak_47` (`Courses_taught`,`last_name`);

--
-- Indexes for table `tests_data`
--
ALTER TABLE `tests_data`
  ADD PRIMARY KEY (`course_id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
