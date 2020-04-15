/*
 Navicat Premium Data Transfer

 Source Server         : guo
 Source Server Type    : MySQL
 Source Server Version : 50527
 Source Host           : localhost:3306
 Source Schema         : hibernatedb

 Target Server Type    : MySQL
 Target Server Version : 50527
 File Encoding         : 65001

 Date: 19/11/2019 14:31:53
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for information
-- ----------------------------
DROP TABLE IF EXISTS `information`;
CREATE TABLE `information`  (
  `studentId` int(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `sex` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `data` date DEFAULT NULL,
  `address` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`studentId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2018 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of information
-- ----------------------------
INSERT INTO `information` VALUES (413, '4', '女', '2000-12-12', '4');
INSERT INTO `information` VALUES (2017, '郭浩杰', '男', '1996-05-10', '安徽阜阳');

-- ----------------------------
-- Table structure for lesson
-- ----------------------------
DROP TABLE IF EXISTS `lesson`;
CREATE TABLE `lesson`  (
  `lessonId` int(20) NOT NULL AUTO_INCREMENT,
  `lessonName` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `teacherId` int(20) NOT NULL,
  PRIMARY KEY (`lessonId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 31 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of lesson
-- ----------------------------
INSERT INTO `lesson` VALUES (1, '英语', 2558);
INSERT INTO `lesson` VALUES (2, '数学', 2559);
INSERT INTO `lesson` VALUES (3, '美术', 2558);
INSERT INTO `lesson` VALUES (4, '体育', 2559);
INSERT INTO `lesson` VALUES (7, '汉语', 2559);
INSERT INTO `lesson` VALUES (29, '大萨达多', 2557);
INSERT INTO `lesson` VALUES (30, '历史', 2559);

-- ----------------------------
-- Table structure for score
-- ----------------------------
DROP TABLE IF EXISTS `score`;
CREATE TABLE `score`  (
  `scoreId` int(11) NOT NULL AUTO_INCREMENT,
  `studentId` int(20) DEFAULT NULL,
  `IessonId` int(20) DEFAULT NULL,
  `score` int(20) DEFAULT NULL,
  PRIMARY KEY (`scoreId`) USING BTREE,
  INDEX `sfk1`(`studentId`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 120 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Fixed;

-- ----------------------------
-- Records of score
-- ----------------------------
INSERT INTO `score` VALUES (100, 2016, 1, 100);
INSERT INTO `score` VALUES (49, 2, 0, 89);
INSERT INTO `score` VALUES (50, 2016, 0, 100);
INSERT INTO `score` VALUES (101, 2017, 1, 56);
INSERT INTO `score` VALUES (119, 1, 4, 90);

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher`  (
  `teacherId` int(20) NOT NULL AUTO_INCREMENT,
  `teacherName` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `sex` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `address` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`teacherId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2560 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES (2558, '吴院长', '男', '滁州');
INSERT INTO `teacher` VALUES (2559, '李老师', '女', '安徽芜湖');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `account` int(20) DEFAULT NULL,
  `password` int(20) DEFAULT NULL,
  `type` int(5) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 1, 1, 1);
INSERT INTO `user` VALUES (2, 2558, 2558, 2);
INSERT INTO `user` VALUES (3, 3, 3, 3);
INSERT INTO `user` VALUES (4, 2559, 2559, 2);
INSERT INTO `user` VALUES (5, 2, 2, 2);

SET FOREIGN_KEY_CHECKS = 1;
