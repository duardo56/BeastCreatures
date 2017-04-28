
CREATE TABLE `courses_data` (
  `cd_sn` varchar(2) NOT NULL,
  `course_id` varchar(50) NOT NULL,
  `Course_name` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `courses_data`
--

INSERT INTO `courses_data` (`cd_sn`, `course_id`, `Course_name`) VALUES
('1', 'BIO3311 ', 'Biology'),
('10', 'BIO3311 ', 'Biology'),
('11', 'BIO3311 ', 'Biology'),
('12', 'BIO3311 ', 'Biology'),
('13', 'BIO3311 ', 'Biology'),
('14', 'BUS2401', 'Business Analytics'),
('15', 'BUS2401', 'Business Analytics'),
('16', 'BUS2401', 'Business Analytics'),
('17', 'BUS2401', 'Business Analytics'),
('18', 'BUS2401', 'Business Analytics'),
('19', 'BUS2401', 'Business Analytics'),
('2', 'BIO3311 ', 'Biology'),
('20', 'BUS2401', 'Business Analytics'),
('21', 'BUS2401', 'Business Analytics'),
('22', 'BUS2401', 'Business Analytics'),
('23', 'BUS2401', 'Business Analytics'),
('24', 'BUS2401', 'Business Analytics'),
('25', 'BUS2401', 'Business Analytics'),
('26', 'CHEM1105 ', 'Chemistry'),
('27', 'CHEM1105 ', 'Chemistry'),
('28', 'CHEM1105 ', 'Chemistry'),
('29', 'CHEM1105 ', 'Chemistry'),
('3', 'BIO3311 ', 'Biology'),
('30', 'CHEM1105 ', 'Chemistry'),
('31', 'CHEM1105 ', 'Chemistry'),
('32', 'CS1401', 'Computer Organization'),
('33', 'CS1401', 'Computer Organization'),
('34', 'CS1401', 'Computer Organization'),
('35', 'CS1401', 'Computer Organization'),
('36', 'CS1401', 'Computer Organization'),
('37', 'CS1401', 'Computer Organization'),
('38', 'CS1401', 'Computer Organization'),
('39', 'CS1401', 'Computer Organization'),
('4', 'BIO3311 ', 'Biology'),
('40', 'CS1401', 'Computer Organization'),
('41', 'CS1402', 'Data Structure I'),
('42', 'CS1402', 'Data Structure I'),
('43', 'CS1402', 'Data Structure I'),
('44', 'CS1402', 'Data Structure I'),
('45', 'CS1402', 'Data Structure I'),
('46', 'CS1402', 'Data Structure I'),
('47', 'CS1402', 'Data Structure I'),
('48', 'CS1402', 'Data Structure I'),
('49', 'CS1402', 'Data Structure I'),
('5', 'BIO3311 ', 'Biology'),
('50', 'CS2308', 'Theory of Computation'),
('51', 'CS2308', 'Theory of Computation'),
('52', 'CS2308', 'Theory of Computation'),
('53', 'CS2308', 'Theory of Computation'),
('54', 'CS2308', 'Theory of Computation'),
('55', 'CS2308', 'Theory of Computation'),
('56', 'CS2401', 'Object Oriented Programming'),
('57', 'CS2401', 'Object Oriented Programming'),
('58', 'CS2401', 'Object Oriented Programming'),
('59', 'CS2401', 'Object Oriented Programming'),
('6', 'BIO3311 ', 'Biology'),
('60', 'CS2401', 'Object Oriented Programming'),
('61', 'CS2401', 'Object Oriented Programming'),
('62', 'CS2401', 'Object Oriented Programming'),
('63', 'CS2401', 'Object Oriented Programming'),
('64', 'CS2401', 'Object Oriented Programming'),
('65', 'CS2412', 'Data Structure II'),
('66', 'CS2412', 'Data Structure II'),
('67', 'CS2412', 'Data Structure II'),
('68', 'CS2412', 'Data Structure II'),
('69', 'CS2412', 'Data Structure II'),
('7', 'BIO3311 ', 'Biology'),
('70', 'CS2412', 'Data Structure II'),
('71', 'CS2412', 'Data Structure II'),
('72', 'CS2412', 'Data Structure II'),
('73', 'CS2412', 'Data Structure II'),
('74', 'CS2412', 'Data Structure II'),
('75', 'CS2412', 'Data Structure II'),
('76', 'CS2412', 'Data Structure II'),
('77', 'CS2412', 'Data Structure II'),
('78', 'CS3304', 'Operating System'),
('79', 'CS3304', 'Operating System'),
('8', 'BIO3311 ', 'Biology'),
('80', 'CS3304', 'Operating System'),
('81', 'CS3304', 'Operating System'),
('82', 'CS3304', 'Operating System'),
('83', 'CS3304', 'Operating System'),
('84', 'CS3304', 'Operating System'),
('85', 'CS3306', 'Software Engineering'),
('86', 'CS3306', 'Software Engineering'),
('87', 'CS3306', 'Software Engineering'),
('88', 'CS3306', 'Software Engineering'),
('89', 'CS3306', 'Software Engineering'),
('9', 'BIO3311 ', 'Biology'),
('90', 'CS3306', 'Software Engineering'),
('91', 'CS3306', 'Data Structure III'),
('92', 'CS4316', 'Data Structure III'),
('93', 'CS4316', 'Data Structure III'),
('94', 'CS4316', 'Data Structure III'),
('95', 'CS4316', 'Data Structure III'),
('96', 'CS4316', 'Data Structure III'),
('97', 'ENG1101', 'Techincal Writing'),
('98', 'ENG1101', 'Techincal Writing'),
('99', 'ENG1101', 'Techincal Writing');

-- --------------------------------------------------------

--
-- Table structure for table `student_data`
--

CREATE TABLE `student_data` (
  `Student_id` varchar(20) NOT NULL,
  `first_name` varchar(20) NOT NULL,
  `last_name` varchar(20) NOT NULL,
  `email` varchar(50) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `date_of_birth` varchar(20) NOT NULL,
  `Street_address` varchar(50) NOT NULL,
  `city` varchar(20) NOT NULL,
  `State` varchar(20) NOT NULL,
  `password` varchar(50) NOT NULL,
  `GPA` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student_data`
--

INSERT INTO `student_data` (`Student_id`, `first_name`, `last_name`, `email`, `gender`, `date_of_birth`, `Street_address`, `city`, `State`, `password`, `GPA`) VALUES
('90017341235', 'Jesse', 'Vasquez', 'vasquezj@bcit.edu', 'Male', '7/16/1975', '2570 Merry Road', 'Panama City', 'Florida', 'Vasquez1', 0),
('90017341236', 'Russell', 'Carr', 'carrr@bcit.edu', 'Male', '11/12/1980', '2 Harbort Park', 'El Paso', 'Texas', 'Carr1', 0),
('90017341237', 'Joshua', 'Bradley', 'bradleyj@bcit.edu', 'Male', '3/12/1978', '032 Cambridge Avenue', 'Harrisburg', 'Pennsylvania', 'Bradley1', 0),
('90017341238', 'Maria', 'Wells', 'wellsm@bcit.edu', 'Female', '6/21/1992', '9033 Corben Junction', 'San Diego', 'California', 'Wells1', 0),
('90017341239', 'Amanda', 'Price', 'pricea@bcit.edu', 'Female', '3/19/1980', '6 Northview Hill', 'Denver', 'Colorado', 'Price1', 0),
('90017341240', 'Roy', 'James', 'jamesr@bcit.edu', 'Male', '11/21/1997', '5 Gulseth Plaza', 'Bronx', 'New York', 'James1', 0),
('90017341241', 'Clarence', 'Fernandez', 'fernandezc@bcit.edu', 'Male', '7/21/1988', '0 Comanche Pass', 'Fresno', 'California', 'Fernandez1', 0),
('90017341242', 'Matthew', 'Perry', 'perrym@bcit.edu', 'Male', '6/12/1988', '62895 Blue Bill Park Plaza', 'New Haven', 'Connecticut', 'Perry1', 0),
('90017341243', 'Angela', 'Carr', 'carra@bcit.edu', 'Female', '12/20/1975', '5 Sutherland Place', 'Young America', 'Minnesota', 'Carr2', 0),
('90017341244', 'Roy', 'Coleman', 'colemanr@bcit.edu', 'Male', '5/18/1997', '3648 Corry Point', 'Aurora', 'Illinois', 'Coleman1', 0),
('90017341245', 'Carolyn', 'Fisher', 'fisherc@bcit.edu', 'Female', '4/19/1975', '546 Amoth Hill', 'Lafayette', 'Louisiana', 'Fisher1', 0),
('90017341246', 'Debra', 'Roberts', 'robertsd@bcit.edu', 'Female', '7/20/1996', '865 Marcy Crossing', 'Plano', 'Texas', 'Roberts1', 0),
('90017341247', 'Christine', 'Washington', 'washingtonc@bcit.edu', 'Female', '1/27/1991', '93 Sycamore Alley', 'Houston', 'Texas', 'Washington1', 0),
('90017341248', 'Patricia', 'Lynch', 'lynchp@bcit.edu', 'Female', '2/29/1976', '14 Meadow Valley Hill', 'Huntington', 'West Virginia', 'Lynch1', 0),
('90017341249', 'Earl', 'Martin', 'martin.e@bcit.edu', 'Male', '7/14/1998', '5 Buell Alley', 'Fort Myers', 'Florida', 'Martin1', 0),
('90017341250', 'Joyce', 'Kelly', 'kelly.j@bcit.edu', 'Female', '1/29/1989', '6 Eagle Crest Park', 'Colorado Springs', 'Colorado', 'Kelly1', 0),
('90017341251', 'Craig', 'West', 'west.c@bcit.edu', 'Male', '1/5/1982', '427 Sunfield Lane', 'Laredo', 'Texas', 'West1', 0),
('90017341252', 'Lawrence', 'Rice', 'rice.l@bcit.edu', 'Male', '3/27/1987', '13058 Talmadge Way', 'Cincinnati', 'Ohio', 'Rice1', 0),
('90017341253', 'Linda', 'Almirez ', 'almirez .l@bcit.edu', 'Female', '10/21/1998', '6 Nobel Plaza', 'Albuquerque', 'New Mexico', 'Almirez1', 0),
('90017341254', 'Cynthia', 'Brown', 'brown.c@bcit.edu', 'Female', '5/19/1978', '52183 Green Lane', 'Cincinnati', 'Ohio', 'Brown1', 0),
('90017341255', 'Billy', 'Kennedy', 'kennedy.b@bcit.edu', 'Male', '10/22/1977', '34 Lawn Lane', 'Troy', 'Michigan', 'Kennedy1', 0),
('90017341256', 'Theresa', 'Dixon', 'dixon.t@bcit.edu', 'Female', '4/29/1987', '291 Declaration Park', 'Nashville', 'Tennessee', 'Dixon1', 0),
('90017341257', 'Heather', 'Martinez', 'martinez.h@bcit.edu', 'Female', '1/22/1996', '28106 Donald Pass', 'Houston', 'Texas', 'Martinez1', 0),
('90017341258', 'Carol', 'Thompson', 'thompson.c@bcit.edu', 'Female', '4/2/1991', '39295 Little Fleur Point', 'Jamaica', 'New York', 'Thompson1', 0),
('90017341259', 'Kenneth', 'Hughes', 'hughes.k@bcit.edu', 'Male', '5/18/1992', '92 2nd Hill', 'Columbus', 'Ohio', 'Hughes1', 0);

-- --------------------------------------------------------

--
-- Table structure for table `student_schedule`
--

CREATE TABLE `student_schedule` (
  `ss_sn` int(11) NOT NULL,
  `student_id` varchar(20) NOT NULL,
  `Faculty_id` varchar(50) NOT NULL,
  `course_id` varchar(50) NOT NULL,
  `course_name` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student_schedule`
--

INSERT INTO `student_schedule` (`ss_sn`, `student_id`, `Faculty_id`, `course_id`, `course_name`) VALUES
(1, '90017341235', '100200', 'BIO3311 ', 'Biology '),
(2, '90017341237', '100200', 'BIO3311 ', 'Biology '),
(3, '90017341239', '100200', 'BIO3311 ', 'Biology '),
(4, '90017341241', '100200', 'BIO3311 ', 'Biology '),
(5, '90017341243', '100200', 'BIO3311 ', 'Biology '),
(6, '90017341245', '100200', 'BIO3311 ', 'Biology '),
(7, '90017341247', '100200', 'BIO3311 ', 'Biology '),
(8, '90017341249', '100200', 'BIO3311 ', 'Biology '),
(9, '90017341251', '100200', 'BIO3311 ', 'Biology '),
(10, '90017341253', '100200', 'BIO3311 ', 'Biology '),
(11, '90017341255', '100200', 'BIO3311 ', 'Biology '),
(12, '90017341257', '100200', 'BIO3311 ', 'Biology '),
(13, '90017341259', '100200', 'BIO3311 ', 'Biology '),
(14, '90017341240', '100201', 'BUS2401', 'Business Analytics'),
(15, '90017341241', '100201', 'BUS2401', 'Business Analytics'),
(16, '90017341242', '100201', 'BUS2401', 'Business Analytics'),
(17, '90017341243', '100201', 'BUS2401', 'Business Analytics'),
(18, '90017341244', '100201', 'BUS2401', 'Business Analytics'),
(19, '90017341245', '100201', 'BUS2401', 'Business Analytics'),
(20, '90017341246', '100201', 'BUS2401', 'Business Analytics'),
(21, '90017341247', '100201', 'BUS2401', 'Business Analytics'),
(22, '90017341249', '100201', 'BUS2401', 'Business Analytics'),
(23, '90017341252', '100201', 'BUS2401', 'Business Analytics'),
(24, '90017341258', '100201', 'BUS2401', 'Business Analytics'),
(25, '90017341236', '100202', 'CHEM1105 ', 'Chemistry'),
(26, '90017341237', '100202', 'CHEM1105 ', 'Chemistry'),
(27, '90017341239', '100202', 'CHEM1105 ', 'Chemistry'),
(28, '90017341255', '100202', 'CHEM1105 ', 'Chemistry'),
(29, '90017341257', '100202', 'CHEM1105 ', 'Chemistry'),
(30, '90017341258', '100202', 'CHEM1105 ', 'Chemistry'),
(31, '90017341237', '100203', 'CS1401', 'Computer Organization'),
(32, '90017341239', '100203', 'CS1401', 'Computer Organization'),
(33, '90017341240', '100206', 'CS1401', 'Computer Organization'),
(34, '90017341242', '100203', 'CS1401', 'Computer Organization'),
(35, '90017341244', '100203', 'CS1401', 'Computer Organization'),
(36, '90017341248', '100203', 'CS1401', 'Computer Organization'),
(37, '90017341249', '100204', 'CS1401', 'Computer Organization'),
(38, '90017341251', '100203', 'CS1401', 'Computer Organization'),
(39, '90017341254', '100203', 'CS1401', 'Computer Organization'),
(40, '90017341235', '100204', 'CS1402', 'Data Structure I'),
(41, '90017341237', '100204', 'CS1402', 'Data Structure I'),
(42, '90017341240', '100204', 'CS1402', 'Data Structure I'),
(43, '90017341243', '100204', 'CS1402', 'Data Structure I'),
(44, '90017341246', '100204', 'CS1402', 'Data Structure I'),
(45, '90017341249', '100204', 'CS1402', 'Data Structure I'),
(46, '90017341252', '100204', 'CS1402', 'Data Structure I'),
(47, '90017341255', '100204', 'CS1402', 'Data Structure I'),
(48, '90017341258', '100204', 'CS1402', 'Data Structure I'),
(49, '90017341237', '100205', 'CS2308', 'Theory of Computation'),
(50, '90017341241', '100205', 'CS2308', 'Theory of Computation'),
(51, '90017341245', '100205', 'CS2308', 'Theory of Computation'),
(52, '90017341249', '100206', 'CS2308', 'Theory of Computation'),
(53, '90017341253', '100205', 'CS2308', 'Theory of Computation'),
(54, '90017341257', '100205', 'CS2308', 'Theory of Computation'),
(55, '90017341236', '100206', 'CS2401', 'Object Oriented Programming'),
(56, '90017341238', '100206', 'CS2401', 'Object Oriented Programming'),
(57, '90017341239', '100206', 'CS2401', 'Object Oriented Programming'),
(58, '90017341241', '100206', 'CS2401', 'Object Oriented Programming'),
(59, '90017341242', '100206', 'CS2401', 'Object Oriented Programming'),
(60, '90017341244', '100206', 'CS2401', 'Object Oriented Programming'),
(61, '90017341245', '100206', 'CS2401', 'Object Oriented Programming'),
(62, '90017341247', '100206', 'CS2401', 'Object Oriented Programming'),
(63, '90017341257', '100206', 'CS2401', 'Object Oriented Programming'),
(64, '90017341235', '100207', 'CS2412', 'Data Structure II'),
(65, '90017341236', '100207', 'CS2412', 'Data Structure II'),
(66, '90017341238', '100207', 'CS2412', 'Data Structure II'),
(67, '90017341246', '100207', 'CS2412', 'Data Structure II'),
(68, '90017341250', '100207', 'CS2412', 'Data Structure II'),
(69, '90017341252', '100207', 'CS2412', 'Data Structure II'),
(70, '90017341256', '100207', 'CS2412', 'Data Structure II'),
(71, '90017341248', '100208', 'CS3304', 'Operating System'),
(72, '90017341250', '100208', 'CS3304', 'Operating System'),
(73, '90017341251', '100208', 'CS3304', 'Operating System'),
(74, '90017341253', '100208', 'CS3304', 'Operating System'),
(75, '90017341254', '100208', 'CS3304', 'Operating System'),
(76, '90017341256', '100208', 'CS3304', 'Operating System'),
(77, '90017341259', '100208', 'CS3304', 'Operating System'),
(78, '90017341248', '100209', 'CS3306', 'Software Engineering'),
(79, '90017341250', '100209', 'CS3306', 'Software Engineering'),
(80, '90017341251', '100209', 'CS3306', 'Software Engineering'),
(81, '90017341253', '100209', 'CS3306', 'Software Engineering'),
(82, '90017341254', '100209', 'CS3306', 'Software Engineering'),
(83, '90017341256', '100209', 'CS3306', 'Software Engineering'),
(84, '90017341259', '100209', 'CS3306', 'Software Engineering'),
(85, '90017341238', '100207', 'CS4316', 'Data Structure III'),
(86, '90017341242', '100207', 'CS4316', 'Data Structure III'),
(87, '90017341246', '100207', 'CS4316', 'Data Structure III'),
(88, '90017341250', '100207', 'CS4316', 'Data Structure III'),
(89, '90017341254', '100207', 'CS4316', 'Data Structure III'),
(90, '90017341236', '100201', 'ENG1101', 'Techincal Writing'),
(91, '90017341238', '100201', 'ENG1101', 'Techincal Writing'),
(92, '90017341240', '100201', 'ENG1101', 'Techincal Writing'),
(93, '90017341242', '100201', 'ENG1101', 'Techincal Writing'),
(94, '90017341244', '100201', 'ENG1101', 'Techincal Writing'),
(95, '90017341246', '100201', 'ENG1101', 'Techincal Writing'),
(96, '90017341248', '100201', 'ENG1101', 'Techincal Writing'),
(97, '90017341250', '100201', 'ENG1101', 'Techincal Writing'),
(98, '90017341252', '100201', 'ENG1101', 'Techincal Writing'),
(99, '90017341254', '100201', 'ENG1101', 'Techincal Writing'),
(100, '90017341256', '100201', 'ENG1101', 'Techincal Writing'),
(101, '90017341258', '100201', 'ENG1101', 'Techincal Writing'),
(102, '90017341235', '100200', 'MATH1101', 'Calculus I '),
(103, '90017341241', '100200', 'MATH1101', 'Calculus I '),
(104, '90017341243', '100200', 'MATH1101', 'Calculus I '),
(105, '90017341245', '100200', 'MATH1101', 'Calculus I '),
(106, '90017341247', '100200', 'MATH1101', 'Calculus I '),
(107, '90017341253', '100200', 'MATH1101', 'Calculus I '),
(108, '90017341255', '100200', 'MATH1101', 'Calculus I '),
(109, '90017341257', '100200', 'MATH1101', 'Calculus I '),
(110, '90017341259', '100200', 'MATH1101', 'Calculus I '),
(111, '90017341236', '100209', 'PHY2431', 'Phisics'),
(112, '90017341240', '100209', 'PHY2431', 'Phisics'),
(113, '90017341244', '100209', 'PHY2431', 'Phisics'),
(114, '90017341248', '100209', 'PHY2431', 'Phisics'),
(115, '90017341252', '100209', 'PHY2431', 'Phisics'),
(116, '90017341256', '100209', 'PHY2431', 'Phisics'),
(117, '90017341259', '100209', 'PHY2431', 'Phisics'),
(118, '90017341235', '100204', 'STAT3311 ', 'Regressional Statistics'),
(119, '90017341239', '100204', 'STAT3311 ', 'Regressional Statistics'),
(120, '90017341243', '100204', 'STAT3311 ', 'Regressional Statistics'),
(121, '90017341247', '100204', 'STAT3311 ', 'Regressional Statistics'),
(122, '90017341251', '100204', 'STAT3311 ', 'Regressional Statistics'),
(123, '90017341255', '100204', 'STAT3311 ', 'Regressional Statistics'),
(124, '90017341258', '100204', 'STAT3311 ', 'Regressional Statistics');

-- --------------------------------------------------------

--
-- Table structure for table `teacher_data`
--

CREATE TABLE `teacher_data` (
  `Faculty_id` varchar(50) NOT NULL,
  `first_name` varchar(50) NOT NULL,
  `last_name` varchar(50) NOT NULL,
  `email` varchar(100) NOT NULL,
  `Gender` varchar(7) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `teacher_data`
--

INSERT INTO `teacher_data` (`Faculty_id`, `first_name`, `last_name`, `email`, `Gender`, `password`) VALUES
('100200', 'William', 'Long', 'long.w@bcit.edu', 'Male', 'Long1'),
('100201', 'Gerald', 'Miller', 'miller.g@bcit.edu', 'Male', 'Miller1'),
('100202', 'Anne', 'Richardson', 'richardson.a@bcit.edu', 'Female', 'Richardson1'),
('100203', 'Michael', 'Ross', 'ross.m@bcit.edu', 'Male', 'Ross1');

-- --------------------------------------------------------

--
-- Table structure for table `teacher_schedule`
--

CREATE TABLE `teacher_schedule` (
  `ts_sn` int(11) NOT NULL,
  `Facutly_id` varchar(50) NOT NULL,
  `course_id` varchar(50) NOT NULL,
  `course_name` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `teacher_schedule`
--

INSERT INTO `teacher_schedule` (`ts_sn`, `Facutly_id`, `course_id`, `course_name`) VALUES
(1, '100200', 'BIO3311 ', 'Biology'),
(2, '100201', 'BUS2401', 'Business Analytics '),
(3, '100202', 'CHEM1105 ', 'Chemistry'),
(4, '100203', 'CS1401', 'Computer Organization'),
(5, '100204', 'CS1402', 'Data Structure I'),
(6, '100205', 'CS2308', 'Theory of Computation'),
(7, '100206', 'CS2401', 'Object Oriented Programming '),
(8, '100207', 'CS2412', 'Data Structure II'),
(9, '100208', 'CS3304', 'Operating System '),
(10, '100209', 'CS3306', 'Software Engineering '),
(11, '100207', 'CS4316', 'Data Structure III'),
(12, '100201', 'ENG1101', 'Technical Writing '),
(13, '100200', 'MATH1101', 'Calculus I'),
(14, '100209', 'PHY2431', 'Phisics '),
(15, '100204', 'STAT3311 ', 'Regressional Statistics ');

-- --------------------------------------------------------

--
-- Table structure for table `tests_data`
--

CREATE TABLE `tests_data` (
  `td_sn` int(11) NOT NULL,
  `student_id` varchar(20) NOT NULL,
  `course_id` varchar(50) NOT NULL,
  `Test_1` double DEFAULT NULL,
  `Test_2` double DEFAULT NULL,
  `Test_3` double DEFAULT NULL,
  `Average` double DEFAULT NULL,
  `final_grade` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tests_data`
--

INSERT INTO `tests_data` (`td_sn`, `student_id`, `course_id`, `Test_1`, `Test_2`, `Test_3`, `Average`, `final_grade`) VALUES
(1, '90017341235', 'BIO3311 ', 0, 0, 0, 0, 0),
(2, '90017341237', 'BIO3311 ', 0, 0, 0, 0, 0),
(3, '90017341239', 'BIO3311 ', 96, 83, 73, 84, 3),
(4, '90017341241', 'BIO3311 ', 0, 0, 0, 0, 0),
(5, '90017341243', 'BIO3311 ', 0, 0, 0, 0, 0),
(6, '90017341245', 'BIO3311 ', 0, 0, 0, 0, 0),
(7, '90017341247', 'BIO3311 ', 0, 0, 0, 0, 0),
(8, '90017341249', 'BIO3311 ', 0, 0, 0, 0, 0),
(9, '90017341251', 'BIO3311 ', 0, 0, 0, 0, 0),
(10, '90017341253', 'BIO3311 ', 0, 0, 0, 0, 0),
(11, '90017341255', 'BIO3311 ', 0, 0, 0, 0, 0),
(12, '90017341257', 'BIO3311 ', 0, 0, 0, 0, 0),
(13, '90017341259', 'BIO3311 ', 0, 0, 0, 0, 0),
(14, '90017341236', 'ENG1101', 0, 0, 0, 0, 0),
(15, '90017341238', 'ENG1101', 0, 0, 0, 0, 0),
(16, '90017341240', 'ENG1101', 0, 0, 0, 0, 0),
(17, '90017341242', 'ENG1101', 0, 0, 0, 0, 0),
(18, '90017341244', 'ENG1101', 0, 0, 0, 0, 0),
(19, '90017341246', 'ENG1101', 0, 0, 0, 0, 0),
(20, '90017341248', 'ENG1101', 0, 0, 0, 0, 0),
(21, '90017341250', 'ENG1101', 0, 0, 0, 0, 0),
(22, '90017341252', 'ENG1101', 0, 0, 0, 0, 0),
(23, '90017341254', 'ENG1101', 0, 0, 0, 0, 0),
(24, '90017341256', 'ENG1101', 0, 0, 0, 0, 0),
(25, '90017341258', 'ENG1101', 0, 0, 0, 0, 0),
(26, '90017341235', 'CS1402', 0, 0, 0, 0, 0),
(27, '90017341237', 'CS1402', 0, 0, 0, 0, 0),
(28, '90017341240', 'CS1402', 0, 0, 0, 0, 0),
(29, '90017341243', 'CS1402', 0, 0, 0, 0, 0),
(30, '90017341246', 'CS1402', 0, 0, 0, 0, 0),
(31, '90017341249', 'CS1402', 0, 0, 0, 0, 0),
(32, '90017341252', 'CS1402', 0, 0, 0, 0, 0),
(33, '90017341255', 'CS1402', 0, 0, 0, 0, 0),
(34, '90017341258', 'CS1402', 0, 0, 0, 0, 0),
(35, '90017341236', 'CS2401', 0, 0, 0, 0, 0),
(36, '90017341238', 'CS2401', 0, 0, 0, 0, 0),
(37, '90017341239', 'CS2401', 0, 0, 0, 0, 0),
(38, '90017341241', 'CS2401', 0, 0, 0, 0, 0),
(39, '90017341242', 'CS2401', 0, 0, 0, 0, 0),
(40, '90017341244', 'CS2401', 0, 0, 0, 0, 0),
(41, '90017341245', 'CS2401', 0, 0, 0, 0, 0),
(42, '90017341247', 'CS2401', 0, 0, 0, 0, 0),
(43, '90017341257', 'CS2401', 0, 0, 0, 0, 0),
(44, '90017341248', 'CS3306', 0, 0, 0, 0, 0),
(45, '90017341250', 'CS3306', 0, 0, 0, 0, 0),
(46, '90017341251', 'CS3306', 0, 0, 0, 0, 0),
(47, '90017341253', 'CS3306', 0, 0, 0, 0, 0),
(48, '90017341254', 'CS3306', 0, 0, 0, 0, 0),
(49, '90017341256', 'CS3306', 0, 0, 0, 0, 0),
(50, '90017341259', 'CS3306', 0, 0, 0, 0, 0),
(51, '90017341237', 'CS2308', 0, 0, 0, 0, 0),
(52, '90017341241', 'CS2308', 0, 0, 0, 0, 0),
(53, '90017341245', 'CS2308', 0, 0, 0, 0, 0),
(54, '90017341249', 'CS2308', 0, 0, 0, 0, 0),
(55, '90017341253', 'CS2308', 0, 0, 0, 0, 0),
(56, '90017341257', 'CS2308', 0, 0, 0, 0, 0),
(57, '90017341238', 'CS4316', 0, 0, 0, 0, 0),
(58, '90017341242', 'CS4316', 0, 0, 0, 0, 0),
(59, '90017341246', 'CS4316', 0, 0, 0, 0, 0),
(60, '90017341250', 'CS4316', 0, 0, 0, 0, 0),
(61, '90017341254', 'CS4316', 0, 0, 0, 0, 0),
(62, '90017341236', 'PHY2431', 0, 0, 0, 0, 0),
(63, '90017341240', 'PHY2431', 0, 0, 0, 0, 0),
(64, '90017341244', 'PHY2431', 0, 0, 0, 0, 0),
(65, '90017341248', 'PHY2431', 0, 0, 0, 0, 0),
(66, '90017341252', 'PHY2431', 0, 0, 0, 0, 0),
(67, '90017341256', 'PHY2431', 0, 0, 0, 0, 0),
(68, '90017341259', 'PHY2431', 0, 0, 0, 0, 0),
(69, '90017341235', 'STAT3311 ', 0, 0, 0, 0, 0),
(70, '90017341239', 'STAT3311 ', 0, 0, 0, 0, 0),
(71, '90017341243', 'STAT3311 ', 0, 0, 0, 0, 0),
(72, '90017341247', 'STAT3311 ', 0, 0, 0, 0, 0),
(73, '90017341251', 'STAT3311 ', 0, 0, 0, 0, 0),
(74, '90017341255', 'STAT3311 ', 0, 0, 0, 0, 0),
(75, '90017341258', 'STAT3311 ', 0, 0, 0, 0, 0),
(76, '90017341237', 'CS1401', 0, 0, 0, 0, 0),
(77, '90017341239', 'CS1401', 0, 0, 0, 0, 0),
(78, '90017341240', 'CS1401', 0, 0, 0, 0, 0),
(79, '90017341242', 'CS1401', 0, 0, 0, 0, 0),
(80, '90017341244', 'CS1401', 0, 0, 0, 0, 0),
(81, '90017341248', 'CS1401', 0, 0, 0, 0, 0),
(82, '90017341249', 'CS1401', 0, 0, 0, 0, 0),
(83, '90017341251', 'CS1401', 0, 0, 0, 0, 0),
(84, '90017341254', 'CS1401', 0, 0, 0, 0, 0),
(85, '90017341236', 'CS2412', 0, 0, 0, 0, 0),
(86, '90017341238', 'CS2412', 0, 0, 0, 0, 0),
(87, '90017341246', 'CS2412', 0, 0, 0, 0, 0),
(88, '90017341250', 'CS2412', 0, 0, 0, 0, 0),
(89, '90017341252', 'CS2412', 0, 0, 0, 0, 0),
(90, '90017341256', 'CS2412', 0, 0, 0, 0, 0),
(91, '90017341235', 'MATH1101', 0, 0, 0, 0, 0),
(92, '90017341241', 'MATH1101', 0, 0, 0, 0, 0),
(93, '90017341243', 'MATH1101', 0, 0, 0, 0, 0),
(94, '90017341245', 'MATH1101', 0, 0, 0, 0, 0),
(95, '90017341247', 'MATH1101', 0, 0, 0, 0, 0),
(96, '90017341253', 'MATH1101', 0, 0, 0, 0, 0),
(97, '90017341255', 'MATH1101', 0, 0, 0, 0, 0),
(98, '90017341257', 'MATH1101', 0, 0, 0, 0, 0),
(99, '90017341259', 'MATH1101', 0, 0, 0, 0, 0),
(100, '90017341258', 'BUS2401', 0, 0, 0, 0, 0),
(101, '90017341238', 'BUS2401', 0, 0, 0, 0, 0),
(102, '90017341240', 'BUS2401', 0, 0, 0, 0, 0),
(103, '90017341241', 'BUS2401', 0, 0, 0, 0, 0),
(104, '90017341242', 'BUS2401', 0, 0, 0, 0, 0),
(105, '90017341243', 'BUS2401', 0, 0, 0, 0, 0),
(106, '90017341244', 'BUS2401', 0, 0, 0, 0, 0),
(107, '90017341245', 'BUS2401', 0, 0, 0, 0, 0),
(108, '90017341246', 'BUS2401', 0, 0, 0, 0, 0),
(109, '90017341247', 'BUS2401', 0, 0, 0, 0, 0),
(110, '90017341249', 'BUS2401', 0, 0, 0, 0, 0),
(111, '90017341252', 'BUS2401', 0, 0, 0, 0, 0),
(112, '90017341237', 'CHEM1105 ', 0, 0, 0, 0, 0),
(113, '90017341239', 'CHEM1105 ', 0, 0, 0, 0, 0),
(114, '90017341255', 'CHEM1105 ', 0, 0, 0, 0, 0),
(115, '90017341257', 'CHEM1105 ', 0, 0, 0, 0, 0),
(116, '90017341258', 'CHEM1105 ', 0, 0, 0, 0, 0),
(117, '90017341236', 'CS2412', 0, 0, 0, 0, 0),
(118, '90017341238', 'CS2412', 0, 0, 0, 0, 0),
(119, '90017341246', 'CS2412', 0, 0, 0, 0, 0),
(120, '90017341250', 'CS2412', 0, 0, 0, 0, 0),
(121, '90017341252', 'CS2412', 0, 0, 0, 0, 0),
(122, '90017341256', 'CS2412', 0, 0, 0, 0, 0),
(123, '90017341235', 'CS2412', 0, 0, 0, 0, 0),
(124, '90017341235', 'MATH1101', 0, 0, 0, 0, 0),
(125, '90017341241', 'MATH1101', 0, 0, 0, 0, 0),
(126, '90017341243', 'MATH1101', 0, 0, 0, 0, 0),
(127, '90017341245', 'MATH1101', 0, 0, 0, 0, 0),
(128, '90017341247', 'MATH1101', 0, 0, 0, 0, 0),
(129, '90017341253', 'MATH1101', 0, 0, 0, 0, 0),
(130, '90017341255', 'MATH1101', 0, 0, 0, 0, 0),
(131, '90017341257', 'MATH1101', 0, 0, 0, 0, 0),
(132, '90017341259', 'MATH1101', 0, 0, 0, 0, 0),
(133, '90017341248', 'CS3304', 0, 0, 0, 0, 0),
(134, '90017341250', 'CS3304', 0, 0, 0, 0, 0),
(135, '90017341251', 'CS3304', 0, 0, 0, 0, 0),
(136, '90017341253', 'CS3304', 0, 0, 0, 0, 0),
(137, '90017341254', 'CS3304', 0, 0, 0, 0, 0),
(138, '90017341256', 'CS3304', 0, 0, 0, 0, 0),
(139, '90017341259', 'CS3304', 0, 0, 0, 0, 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `courses_data`
--
ALTER TABLE `courses_data`
  ADD PRIMARY KEY (`cd_sn`),
  ADD UNIQUE KEY `cd_sn` (`cd_sn`);

--
-- Indexes for table `student_data`
--
ALTER TABLE `student_data`
  ADD PRIMARY KEY (`Student_id`);

--
-- Indexes for table `student_schedule`
--
ALTER TABLE `student_schedule`
  ADD PRIMARY KEY (`ss_sn`);

--
-- Indexes for table `teacher_data`
--
ALTER TABLE `teacher_data`
  ADD PRIMARY KEY (`Faculty_id`),
  ADD UNIQUE KEY `ak_47` (`last_name`);

--
-- Indexes for table `teacher_schedule`
--
ALTER TABLE `teacher_schedule`
  ADD PRIMARY KEY (`ts_sn`);

--
-- Indexes for table `tests_data`
--
ALTER TABLE `tests_data`
  ADD PRIMARY KEY (`td_sn`);