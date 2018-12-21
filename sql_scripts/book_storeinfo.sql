
-- ----------------------------
-- Table structure for `book_storeinfo`
-- ----------------------------
DROP TABLE IF EXISTS `book_storeinfo`;
CREATE TABLE `book_storeinfo` (
  `loc_barcode` varchar(20) NOT NULL,
  `loc_callNo` varchar(50) NOT NULL,
  `loc_voliss` varchar(50) DEFAULT NULL,
  `loc_rom` varchar(20) DEFAULT NULL,
  `loc_status` varchar(10) DEFAULT NULL,
  `loc_location` varchar(20) DEFAULT NULL,
  `book_left` int(11) DEFAULT NULL,
  PRIMARY KEY (`loc_barcode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of book_storeinfo
-- ----------------------------
