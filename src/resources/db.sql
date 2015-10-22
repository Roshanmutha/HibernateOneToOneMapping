CREATE TABLE `employee` (
  `employee_id` bigint(10) NOT NULL AUTO_INCREMENT,
  `firstname` varchar(50) DEFAULT NULL,
  `lastname` varchar(50) DEFAULT NULL,
  `birth_date` date NOT NULL,
  `cell_phone` varchar(15) NOT NULL,
  PRIMARY KEY (`employee_id`)
) ENGINE=InnoDB AUTO_INCREMENT=217 DEFAULT CHARSET=latin1;

CREATE TABLE `employeedetail` (
  `employee_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `street` varchar(50) DEFAULT NULL,
  `city` varchar(50) DEFAULT NULL,
  `state` varchar(50) DEFAULT NULL,
  `country` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`employee_id`),
  CONSTRAINT `FKEMPL` FOREIGN KEY (`employee_id`) REFERENCES `employee` (`employee_id`)
) ENGINE=InnoDB AUTO_INCREMENT=217 DEFAULT CHARSET=latin1;

CREATE TABLE `person` (
  `person_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`person_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

CREATE TABLE `person_detail` (
  `personDetailPK` int(11) NOT NULL AUTO_INCREMENT,
  `job` varchar(45) DEFAULT NULL,
  `zipcode` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`personDetailPK`),
  CONSTRAINT `FKPERSON` FOREIGN KEY (`personDetailPK`) REFERENCES `person` (`person_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

CREATE TABLE `stock` (
  `STOCK_ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `STOCK_CODE` varchar(10) NOT NULL,
  `STOCK_NAME` varchar(20) NOT NULL,
  PRIMARY KEY (`STOCK_ID`) USING BTREE,
  UNIQUE KEY `UNI_STOCK_NAME` (`STOCK_NAME`),
  UNIQUE KEY `UNI_STOCK_CODE` (`STOCK_CODE`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8;

CREATE TABLE `stock_detail` (
  `STOCK_ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `COMP_NAME` varchar(100) NOT NULL,
  `COMP_DESC` varchar(255) NOT NULL,
  `REMARK` varchar(255) NOT NULL,
  `LISTED_DATE` date NOT NULL,
  PRIMARY KEY (`STOCK_ID`) USING BTREE,
  CONSTRAINT `FK_STOCK_ID` FOREIGN KEY (`STOCK_ID`) REFERENCES `stock` (`STOCK_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8;
