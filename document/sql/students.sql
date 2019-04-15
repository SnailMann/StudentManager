# Host: localhost  (Version 5.6.26-log)
# Date: 2017-05-20 13:14:04
# Generator: MySQL-Front 6.0  (Build 1.176)


#
# Structure for table "student"
#

DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `sex` varchar(10) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `grade` varchar(20) DEFAULT NULL,
  `score` float DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1008 DEFAULT CHARSET=utf8;

#
# Data for table "student"
#

INSERT INTO `student` VALUES (1001,'张三','男',22,'14计算机2班',90),(1002,'李四','男',20,'14计算机1班',80),(1003,'王五','男',21,'14软件2班',89),(1004,'刘六','女',22,'14计算机2班',99),(1007,'1','1',12,'14计算机2班',1);

#
# Structure for table "user"
#

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `type` varchar(2) DEFAULT NULL COMMENT '0是教师，1是学生',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

#
# Data for table "user"
#

INSERT INTO `user` VALUES (1,'1001','123456','1'),(2,'101','123456','0'),(3,'1002','123456','1'),(4,'1003','123456','1'),(5,'102','123456','0');
