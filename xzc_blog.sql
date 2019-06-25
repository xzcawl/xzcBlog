/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : xzc_blog

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2019-06-25 22:54:37
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `blog_detail`
-- ----------------------------
DROP TABLE IF EXISTS `blog_detail`;
CREATE TABLE `blog_detail` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '索引id',
  `title` varchar(255) DEFAULT NULL COMMENT '博文标题',
  `author` varchar(50) DEFAULT NULL COMMENT '作者',
  `createTime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `updateTime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `state` tinyint(1) NOT NULL COMMENT '状态 1有效 0无效',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of blog_detail
-- ----------------------------

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '索引号',
  `nickname` varchar(255) DEFAULT NULL COMMENT '昵称',
  `username` varchar(255) NOT NULL COMMENT '用户名',
  `password` varchar(255) NOT NULL COMMENT '密码',
  `createTime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '创建账号的时间',
  `updateTime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '修改账号信息的时间',
  `description` varchar(255) DEFAULT NULL COMMENT '描述',
  `state` tinyint(4) NOT NULL COMMENT '状态 1有效 0无效',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
