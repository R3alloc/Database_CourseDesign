/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50724
Source Host           : localhost:3306
Source Database       : doubandb

Target Server Type    : MYSQL
Target Server Version : 50724
File Encoding         : 65001

Date: 2018-12-19 15:47:55
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `book_table`
-- ----------------------------
DROP TABLE IF EXISTS `book_table`;
CREATE TABLE `book_table` (
  `book_id` varchar(20) NOT NULL,
  `book_name` varchar(200) NOT NULL,
  `book_author` varchar(100) DEFAULT NULL,
  `book_ISBN` varchar(100) DEFAULT NULL,
  `book_price` float DEFAULT NULL,
  `book_outline` varchar(255) DEFAULT NULL,
  `book_publisher` varchar(100) DEFAULT NULL,
  `book_menu` varchar(200) DEFAULT NULL,
  `book_meta_name` varchar(50) DEFAULT NULL,
  `book_secondary_author` varchar(50) DEFAULT NULL,
  `book_CDServiceContact` varchar(200) DEFAULT NULL,
  `book_topic` varchar(200) DEFAULT NULL,
  `book_CCN` varchar(50) DEFAULT NULL,
  `book_author_ps` varchar(200) DEFAULT NULL,
  `book_abstract` varchar(200) DEFAULT NULL,
  `book_target` varchar(50) DEFAULT NULL,
  `book_douban_summarized` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`book_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of book_table
-- ----------------------------
