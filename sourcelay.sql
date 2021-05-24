/*
 Navicat Premium Data Transfer

 Source Server         : Mo
 Source Server Type    : MySQL
 Source Server Version : 80022
 Source Host           : localhost:3306
 Source Schema         : sourcelay

 Target Server Type    : MySQL
 Target Server Version : 80022
 File Encoding         : 65001

 Date: 24/05/2021 10:18:28
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for attachments
-- ----------------------------
DROP TABLE IF EXISTS `attachments`;
CREATE TABLE `attachments`  (
  `id` bigint UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '附件 id',
  `uuid` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT 'uuid',
  `user_id` bigint UNSIGNED NOT NULL COMMENT '用户 id',
  `type_id` bigint UNSIGNED NOT NULL DEFAULT 0 COMMENT '类型数据ID(post_id,dialog_message_id…)',
  `order` tinyint UNSIGNED NOT NULL DEFAULT 0 COMMENT '附件排序',
  `type` smallint UNSIGNED NOT NULL DEFAULT 0 COMMENT '附件类型(0帖子附件，1帖子图片，2帖子视频，3帖子音频，4消息图片)',
  `is_remote` tinyint UNSIGNED NOT NULL DEFAULT 0 COMMENT '是否远程附件',
  `is_approved` tinyint UNSIGNED NOT NULL DEFAULT 1 COMMENT '是否合法',
  `attachment` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '文件系统生成的名称',
  `file_path` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '文件路径',
  `file_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '文件原名称',
  `file_size` int UNSIGNED NOT NULL DEFAULT 0 COMMENT '文件大小',
  `file_type` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '文件类型',
  `ip` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT 'ip 地址',
  `created_at` datetime(0) NOT NULL COMMENT '创建时间',
  `updated_at` datetime(0) NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of attachments
-- ----------------------------

-- ----------------------------
-- Table structure for categories
-- ----------------------------
DROP TABLE IF EXISTS `categories`;
CREATE TABLE `categories`  (
  `id` bigint UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '分类 id',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '分类名称',
  `description` text CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '分类描述',
  `icon` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '分类图标',
  `banner` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '板块头图',
  `sort` smallint UNSIGNED NOT NULL DEFAULT 0 COMMENT '显示顺序',
  `property` tinyint UNSIGNED NOT NULL DEFAULT 0 COMMENT '属性：0 正常 1 首页展示',
  `thread_count` int UNSIGNED NOT NULL DEFAULT 0 COMMENT '主题数',
  `moderators` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '分类版主',
  `ip` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT 'ip 地址',
  `created_at` datetime(0) NOT NULL COMMENT '创建时间',
  `updated_at` datetime(0) NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 32 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of categories
-- ----------------------------
INSERT INTO `categories` VALUES (1, '学习驿站', '', 'book', '/statics/Banner/%E9%A9%BF%E7%AB%99.png', 0, 0, 0, NULL, '127.0.0.1', '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `categories` VALUES (2, '比赛擂台', '', 'xingqiu', '/statics/Banner/%E6%AF%94%E8%B5%9B%E6%93%82%E5%8F%B0.png', 1, 0, 0, NULL, '42.3.53.12', '2020-08-15 22:06:52', '2020-08-15 22:06:52');
INSERT INTO `categories` VALUES (3, '规划展板', '', 'yuangui ', '/statics/Banner/%E8%A7%84%E5%88%92%E5%B1%95%E6%9D%BF.png', 2, 0, 0, NULL, '42.3.53.12', '2020-08-15 22:06:52', '2020-08-15 22:06:52');
INSERT INTO `categories` VALUES (4, '学习驿站.数学', '', '/statics/Category/%E6%95%B0%E5%AD%A6.png', '/statics/Banner/%E9%A9%BF%E7%AB%99.png', 50, 0, 4, NULL, '42.3.53.12', '2020-08-15 22:06:52', '2020-12-09 20:12:36');
INSERT INTO `categories` VALUES (5, '生活茶馆', '', 'cha', '/statics/Banner/%E8%8C%B6%E9%A6%86.png', 3, 0, 0, NULL, '42.3.53.12', '2020-08-15 22:06:52', '2020-08-15 22:06:52');
INSERT INTO `categories` VALUES (6, '站务区', '', 'chilun', '/statics/Banner/%E7%AB%99%E5%8A%A1%E5%8C%BA.png', 4, 0, 0, NULL, '42.3.53.12', '2020-08-15 22:06:52', '2020-08-15 22:06:52');
INSERT INTO `categories` VALUES (7, '生活茶馆.校园闲聊', '', '/statics/Category/%E9%97%B2%E8%81%8A%E7%A4%BE%E5%8C%BA.png', '/statics/Banner/%E8%8C%B6%E9%A6%86.png', 300, 0, 9, NULL, '42.3.53.12', '2020-08-15 22:06:52', '2020-12-22 14:13:17');
INSERT INTO `categories` VALUES (8, '生活茶馆.同好交友', '', '/statics/Category/%E4%BA%A4%E5%8F%8B.png', '/statics/Banner/%E8%8C%B6%E9%A6%86.png', 301, 0, 1, NULL, '42.3.53.12', '2020-08-15 22:06:52', '2020-12-15 11:42:22');
INSERT INTO `categories` VALUES (9, '站务区.版务投诉', '', '/statics/Category/%E6%8A%95%E8%AF%89.png', '/statics/Banner/%E7%AB%99%E5%8A%A1%E5%8C%BA.png', 401, 0, 0, NULL, '42.3.53.12', '2020-08-15 22:06:52', '2020-08-15 22:06:52');
INSERT INTO `categories` VALUES (10, '学习驿站.计算机', '', '/statics/Category/%E8%AE%A1%E7%AE%97%E6%9C%BA.png', '/statics/Banner/%E9%A9%BF%E7%AB%99.png', 51, 0, 6, NULL, '42.3.53.12', '2020-12-10 13:14:45', '2020-12-09 19:58:16');
INSERT INTO `categories` VALUES (11, '学习驿站.文', '', '/statics/Category/%E4%B9%A6%E7%B1%8D.png', '/statics/Banner/%E9%A9%BF%E7%AB%99.png', 54, 0, 3, NULL, '42.3.53.12', '2020-12-18 13:16:17', '2020-12-08 21:41:49');
INSERT INTO `categories` VALUES (12, '学习驿站.法', '', '/statics/Category/%E6%B3%95%E5%BE%8B.png', '/statics/Banner/%E9%A9%BF%E7%AB%99.png', 55, 0, 0, NULL, '42.3.53.12', '2020-12-07 13:17:15', '2020-12-07 13:17:19');
INSERT INTO `categories` VALUES (13, '学习驿站.理', '', '/statics/Category/%E5%8C%96%E5%AD%A6.png', '/statics/Banner/%E9%A9%BF%E7%AB%99.png', 56, 0, 0, NULL, '42.3.53.12', '2020-12-07 13:17:57', '2020-12-08 22:05:23');
INSERT INTO `categories` VALUES (14, '学习驿站.工', '', '/statics/Category/%E5%B7%A5%E5%85%B7.png', '/statics/Banner/%E9%A9%BF%E7%AB%99.png', 57, 0, 0, NULL, '42.3.53.12', '2020-12-07 13:19:05', '2020-12-07 13:19:08');
INSERT INTO `categories` VALUES (15, '学习驿站.农', '', '/statics/Category/%E5%86%9C.png', '/statics/Banner/%E9%A9%BF%E7%AB%99.png', 58, 0, 0, NULL, '42.3.53.12', '2020-12-10 13:19:46', '2020-12-08 13:19:51');
INSERT INTO `categories` VALUES (16, '学习驿站.医', '', '/statics/Category/%E5%8C%BB%E5%AD%A6.png', '/statics/Banner/%E9%A9%BF%E7%AB%99.png', 59, 0, 0, NULL, '42.3.53.12', '2020-12-07 13:21:04', '2020-12-07 13:21:07');
INSERT INTO `categories` VALUES (17, '比赛擂台.大创', '', '/statics/Category/%E5%A4%A7%E5%88%9B.png', '/statics/Banner/%E6%AF%94%E8%B5%9B%E6%93%82%E5%8F%B0.png', 100, 0, 0, NULL, '42.3.53.12', '2020-12-07 13:27:29', '2020-12-07 13:27:34');
INSERT INTO `categories` VALUES (18, '规划展板.工作', '', '/statics/Category/%E5%B7%A5%E4%BD%9C.png', '/statics/Banner/%E8%A7%84%E5%88%92%E5%B1%95%E6%9D%BF.png', 200, 0, 0, NULL, '42.3.53.12', '2020-12-07 13:27:58', '2020-12-07 13:27:55');
INSERT INTO `categories` VALUES (19, '学习驿站.外语', '', '/statics/Category/%E5%A4%96%E8%AF%AD%E5%AD%A6%E4%B9%A0.png', '/statics/Banner/%E9%A9%BF%E7%AB%99.png', 52, 0, 3, NULL, '42.3.53.12', '2020-12-07 16:07:39', '2020-12-08 22:39:45');
INSERT INTO `categories` VALUES (20, '学习驿站.思政', '', '/statics/Category/%E6%94%BF%E6%B2%BB.png', '/statics/Banner/%E9%A9%BF%E7%AB%99.png', 53, 0, 0, NULL, '42.3.53.12', '2020-12-07 16:12:01', '2020-12-07 16:12:04');
INSERT INTO `categories` VALUES (21, '比赛擂台.互联网+', '', '/statics//Category/%E4%BA%92%E8%81%94%E7%BD%91.png', '/statics/Banner/%E6%AF%94%E8%B5%9B%E6%93%82%E5%8F%B0.png', 101, 0, 1, NULL, '42.3.53.12', '2020-12-07 17:09:30', '2020-12-08 15:48:25');
INSERT INTO `categories` VALUES (22, '比赛擂台.创青春', '', '/statics/Category/%E5%88%9B%E9%9D%92%E6%98%A5.png', '/statics/Banner/%E6%AF%94%E8%B5%9B%E6%93%82%E5%8F%B0.png', 102, 0, 0, NULL, '42.3.53.12', '2020-12-07 21:22:15', '2020-12-07 21:22:18');
INSERT INTO `categories` VALUES (23, '比赛擂台.理工', '', '/statics/Category/%E7%89%A9%E7%90%86.png', '/statics/Banner/%E6%AF%94%E8%B5%9B%E6%93%82%E5%8F%B0.png', 103, 0, 0, NULL, '42.3.53.12', '2020-12-07 21:25:03', '2020-12-07 21:25:05');
INSERT INTO `categories` VALUES (24, '比赛擂台.外语', '', '/statics/Category/%E5%A4%96%E8%AF%AD%E7%AB%9E%E8%B5%9B.png', '/statics/Banner/%E6%AF%94%E8%B5%9B%E6%93%82%E5%8F%B0.png', 104, 0, 0, NULL, '42.3.53.12', '2020-12-07 21:26:44', '2020-12-07 21:26:49');
INSERT INTO `categories` VALUES (25, '比赛擂台.文社', '', '/statics/Category/%E7%A4%BE%E4%BC%9A.png', '/statics/Banner/%E6%AF%94%E8%B5%9B%E6%93%82%E5%8F%B0.png', 105, 0, 0, NULL, '42.3.53.12', '2020-12-07 21:39:50', '2020-12-07 21:39:55');
INSERT INTO `categories` VALUES (26, '比赛擂台.农医', '', '/statics/Category/%E5%86%9C%E5%8C%BB.png', '/statics/Banner/%E6%AF%94%E8%B5%9B%E6%93%82%E5%8F%B0.png', 106, 0, 0, NULL, '42.3.53.12', '2020-12-07 21:40:32', '2020-12-07 21:40:34');
INSERT INTO `categories` VALUES (27, '生活茶馆.网事杂谈', '', '/statics/Category/%E7%BD%91%E4%BA%8B%E6%9D%82%E8%B0%88.png', '/statics/Banner/%E8%8C%B6%E9%A6%86.png', 302, 0, 4, NULL, '42.3.53.12', '2020-12-07 21:41:26', '2021-04-20 11:05:21');
INSERT INTO `categories` VALUES (28, '站务区.问题解答', '', '/statics/Category/%E9%97%AE%E9%A2%98%E8%A7%A3%E7%AD%94.png', '/statics/Banner/%E7%AB%99%E5%8A%A1%E5%8C%BA.png', 400, 0, 3, NULL, '42.3.53.12', '2020-12-07 21:42:36', '2020-12-10 09:20:06');
INSERT INTO `categories` VALUES (29, '站务区.论坛开发', '', '/statics/Category/%E5%BC%80%E5%8F%91.png', '/statics/Banner/%E7%AB%99%E5%8A%A1%E5%8C%BA.png', 402, 0, 1, NULL, '42.3.53.12', '2020-12-07 21:43:14', '2021-01-21 13:50:46');
INSERT INTO `categories` VALUES (30, '规划展板.考研', '', '/statics/Category/%E8%80%83%E8%AF%95.png', '/statics/Banner/%E8%A7%84%E5%88%92%E5%B1%95%E6%9D%BF.png', 201, 0, 0, NULL, '42.3.53.12', '2020-12-07 21:43:59', '2020-12-07 21:44:01');
INSERT INTO `categories` VALUES (31, '规划展板.保研', '', '/statics/Category/%E4%BF%9D%E7%A0%94.png', '/statics/Banner/%E8%A7%84%E5%88%92%E5%B1%95%E6%9D%BF.png', 202, 0, 0, NULL, '42.3.53.12', '2020-12-07 21:44:34', '2020-12-07 21:44:36');
INSERT INTO `categories` VALUES (32, '规划展板.出国', '', '/statics/Category/%E5%87%BA%E5%9B%BD.png', '/statics/Banner/%E8%A7%84%E5%88%92%E5%B1%95%E6%9D%BF.png', 203, 0, 0, NULL, '42.3.53.12', '2020-12-07 21:45:12', '2020-12-07 21:45:14');

-- ----------------------------
-- Table structure for deny_users
-- ----------------------------
DROP TABLE IF EXISTS `deny_users`;
CREATE TABLE `deny_users`  (
  `user_id` bigint UNSIGNED NOT NULL,
  `deny_user_id` bigint UNSIGNED NOT NULL,
  `created_at` datetime(0) NOT NULL COMMENT '创建时间'
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of deny_users
-- ----------------------------

-- ----------------------------
-- Table structure for dialog
-- ----------------------------
DROP TABLE IF EXISTS `dialog`;
CREATE TABLE `dialog`  (
  `id` bigint UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `dialog_message_id` bigint UNSIGNED NOT NULL DEFAULT 0 COMMENT '最新消息ID',
  `sender_user_id` bigint UNSIGNED NOT NULL COMMENT '发送人UID',
  `recipient_user_id` bigint UNSIGNED NOT NULL COMMENT '收信人UID',
  `recipient_read_at` datetime(0) NULL DEFAULT NULL COMMENT '收信人阅读时间',
  `sender_read_at` datetime(0) NULL DEFAULT NULL COMMENT '发送人阅读时间',
  `created_at` datetime(0) NOT NULL COMMENT '创建时间',
  `updated_at` datetime(0) NOT NULL COMMENT '更新时间',
  `sender_deleted_at` datetime(0) NULL DEFAULT NULL COMMENT '发送人删除时间',
  `recipient_deleted_at` datetime(0) NULL DEFAULT NULL COMMENT '收信人删除时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `sender_user_id`(`sender_user_id`) USING BTREE,
  INDEX `recipient_user_id`(`recipient_user_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of dialog
-- ----------------------------

-- ----------------------------
-- Table structure for dialog_message
-- ----------------------------
DROP TABLE IF EXISTS `dialog_message`;
CREATE TABLE `dialog_message`  (
  `id` bigint UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `dialog_id` bigint UNSIGNED NOT NULL COMMENT '会话ID',
  `user_id` bigint UNSIGNED NOT NULL COMMENT '用户ID',
  `attachment_id` bigint UNSIGNED NOT NULL COMMENT '附件ID',
  `message_text` text CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL COMMENT '内容',
  `created_at` datetime(0) NOT NULL COMMENT '创建时间',
  `updated_at` datetime(0) NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `idx_dialog_id`(`dialog_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of dialog_message
-- ----------------------------

-- ----------------------------
-- Table structure for emoji
-- ----------------------------
DROP TABLE IF EXISTS `emoji`;
CREATE TABLE `emoji`  (
  `id` bigint UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '表情 id',
  `category` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '表情分类',
  `url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '表情地址',
  `code` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '表情符号',
  `order` smallint UNSIGNED NOT NULL DEFAULT 0 COMMENT '显示顺序',
  `created_at` datetime(0) NOT NULL COMMENT '创建时间',
  `updated_at` datetime(0) NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 92 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of emoji
-- ----------------------------
INSERT INTO `emoji` VALUES (1, 'qq', 'emoji/qq/kelian.gif', ':kelian:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (2, 'qq', 'emoji/qq/haqian.gif', ':haqian:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (3, 'qq', 'emoji/qq/woshou.gif', ':woshou:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (4, 'qq', 'emoji/qq/aixin.gif', ':aixin:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (5, 'qq', 'emoji/qq/zuohengheng.gif', ':zuohengheng:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (6, 'qq', 'emoji/qq/weixiao.gif', ':weixiao:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (7, 'qq', 'emoji/qq/jingkong.gif', ':jingkong:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (8, 'qq', 'emoji/qq/tiaopi.gif', ':tiaopi:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (9, 'qq', 'emoji/qq/touxiao.gif', ':touxiao:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (10, 'qq', 'emoji/qq/youling.gif', ':youling:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (11, 'qq', 'emoji/qq/caidao.gif', ':caidao:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (12, 'qq', 'emoji/qq/cahan.gif', ':cahan:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (13, 'qq', 'emoji/qq/hecai.gif', ':hecai:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (14, 'qq', 'emoji/qq/keai.gif', ':keai:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (15, 'qq', 'emoji/qq/ciya.gif', ':ciya:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (16, 'qq', 'emoji/qq/saorao.gif', ':saorao:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (17, 'qq', 'emoji/qq/jingxi.gif', ':jingxi:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (18, 'qq', 'emoji/qq/ku.gif', ':ku:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (19, 'qq', 'emoji/qq/piezui.gif', ':piezui:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (20, 'qq', 'emoji/qq/se.gif', ':se:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (21, 'qq', 'emoji/qq/xia.gif', ':xia:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (22, 'qq', 'emoji/qq/yinxian.gif', ':yinxian:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (23, 'qq', 'emoji/qq/zhouma.gif', ':zhouma:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (24, 'qq', 'emoji/qq/kulou.gif', ':kulou:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (25, 'qq', 'emoji/qq/xu.gif', ':xu:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (26, 'qq', 'emoji/qq/jingya.gif', ':jingya:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (27, 'qq', 'emoji/qq/doge.gif', ':doge:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (28, 'qq', 'emoji/qq/bizui.gif', ':bizui:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (29, 'qq', 'emoji/qq/yangtuo.gif', ':yangtuo:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (30, 'qq', 'emoji/qq/shouqiang.gif', ':shouqiang:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (31, 'qq', 'emoji/qq/baoquan.gif', ':baoquan:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (32, 'qq', 'emoji/qq/yun.gif', ':yun:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (33, 'qq', 'emoji/qq/lanqiu.gif', ':lanqiu:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (34, 'qq', 'emoji/qq/zhemo.gif', ':zhemo:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (35, 'qq', 'emoji/qq/guzhang.gif', ':guzhang:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (36, 'qq', 'emoji/qq/shengli.gif', ':shengli:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (37, 'qq', 'emoji/qq/zaijian.gif', ':zaijian:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (38, 'qq', 'emoji/qq/dabing.gif', ':dabing:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (39, 'qq', 'emoji/qq/deyi.gif', ':deyi:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (40, 'qq', 'emoji/qq/hanxiao.gif', ':hanxiao:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (41, 'qq', 'emoji/qq/kun.gif', ':kun:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (42, 'qq', 'emoji/qq/hexie.gif', ':hexie:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (43, 'qq', 'emoji/qq/daku.gif', ':daku:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (44, 'qq', 'emoji/qq/wozuimei.gif', ':wozuimei:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (45, 'qq', 'emoji/qq/xiaoku.gif', ':xiaoku:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (46, 'qq', 'emoji/qq/xigua.gif', ':xigua:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (47, 'qq', 'emoji/qq/huaixiao.gif', ':huaixiao:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (48, 'qq', 'emoji/qq/liulei.gif', ':liulei:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (49, 'qq', 'emoji/qq/lenghan.gif', ':lenghan:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (50, 'qq', 'emoji/qq/qiudale.gif', ':qiudale:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (51, 'qq', 'emoji/qq/zhayanjian.gif', ':zhayanjian:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (52, 'qq', 'emoji/qq/qiaoda.gif', ':qiaoda:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (53, 'qq', 'emoji/qq/baojin.gif', ':baojin:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (54, 'qq', 'emoji/qq/OK.gif', ':OK:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (55, 'qq', 'emoji/qq/xiaojiujie.gif', ':xiaojiujie:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (56, 'qq', 'emoji/qq/gouyin.gif', ':gouyin:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (57, 'qq', 'emoji/qq/youhengheng.gif', ':youhengheng:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (58, 'qq', 'emoji/qq/tuosai.gif', ':tuosai:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (59, 'qq', 'emoji/qq/nanguo.gif', ':nanguo:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (60, 'qq', 'emoji/qq/quantou.gif', ':quantou:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (61, 'qq', 'emoji/qq/haixiu.gif', ':haixiu:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (62, 'qq', 'emoji/qq/koubi.gif', ':koubi:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (63, 'qq', 'emoji/qq/qiang.gif', ':qiang:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (64, 'qq', 'emoji/qq/pijiu.gif', ':pijiu:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (65, 'qq', 'emoji/qq/bishi.gif', ':bishi:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (66, 'qq', 'emoji/qq/yiwen.gif', ':yiwen:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (67, 'qq', 'emoji/qq/liuhan.gif', ':liuhan:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (68, 'qq', 'emoji/qq/wunai.gif', ':wunai:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (69, 'qq', 'emoji/qq/aini.gif', ':aini:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (70, 'qq', 'emoji/qq/bangbangtang.gif', ':bangbangtang:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (71, 'qq', 'emoji/qq/penxue.gif', ':penxue:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (72, 'qq', 'emoji/qq/haobang.gif', ':haobang:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (73, 'qq', 'emoji/qq/qinqin.gif', ':qinqin:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (74, 'qq', 'emoji/qq/xiaoyanger.gif', ':xiaoyanger:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (75, 'qq', 'emoji/qq/fendou.gif', ':fendou:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (76, 'qq', 'emoji/qq/ganga.gif', ':ganga:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (77, 'qq', 'emoji/qq/shuai.gif', ':shuai:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (78, 'qq', 'emoji/qq/juhua.gif', ':juhua:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (79, 'qq', 'emoji/qq/baiyan.gif', ':baiyan:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (80, 'qq', 'emoji/qq/fanu.gif', ':fanu:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (81, 'qq', 'emoji/qq/jie.gif', ':jie:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (82, 'qq', 'emoji/qq/chi.gif', ':chi:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (83, 'qq', 'emoji/qq/kuaikule.gif', ':kuaikule:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (84, 'qq', 'emoji/qq/zhuakuang.gif', ':zhuakuang:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (85, 'qq', 'emoji/qq/shui.gif', ':shui:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (86, 'qq', 'emoji/qq/dan.gif', ':dan:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (87, 'qq', 'emoji/qq/aoman.gif', ':aoman:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (88, 'qq', 'emoji/qq/fadai.gif', ':fadai:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (89, 'qq', 'emoji/qq/leiben.gif', ':leiben:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (90, 'qq', 'emoji/qq/tu.gif', ':tu:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (91, 'qq', 'emoji/qq/weiqu.gif', ':weiqu:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');
INSERT INTO `emoji` VALUES (92, 'qq', 'emoji/qq/xieyanxiao.gif', ':xieyanxiao:', 0, '2020-08-15 21:56:48', '2020-08-15 21:56:48');

-- ----------------------------
-- Table structure for finance
-- ----------------------------
DROP TABLE IF EXISTS `finance`;
CREATE TABLE `finance`  (
  `id` bigint UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `income` decimal(10, 2) UNSIGNED NOT NULL COMMENT '用户充值金额',
  `withdrawal` decimal(10, 2) UNSIGNED NOT NULL COMMENT '用户提现金额',
  `order_count` int UNSIGNED NOT NULL COMMENT '订单数量',
  `order_amount` decimal(10, 2) UNSIGNED NOT NULL COMMENT '订单金额',
  `total_profit` decimal(10, 2) UNSIGNED NOT NULL COMMENT '平台盈利',
  `register_profit` decimal(10, 2) UNSIGNED NOT NULL COMMENT '注册收入',
  `master_portion` decimal(10, 2) UNSIGNED NOT NULL COMMENT '打赏贴的分成',
  `withdrawal_profit` decimal(10, 2) UNSIGNED NOT NULL COMMENT '提现手续费收入',
  `created_at` date NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of finance
-- ----------------------------

-- ----------------------------
-- Table structure for group_paid_users
-- ----------------------------
DROP TABLE IF EXISTS `group_paid_users`;
CREATE TABLE `group_paid_users`  (
  `id` bigint UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `user_id` bigint UNSIGNED NOT NULL COMMENT '所属用户',
  `group_id` bigint UNSIGNED NOT NULL COMMENT '用户组 id',
  `order_id` bigint UNSIGNED NOT NULL DEFAULT 0 COMMENT '订单 id',
  `operator_id` bigint UNSIGNED NULL DEFAULT NULL COMMENT '操作人',
  `delete_type` tinyint UNSIGNED NOT NULL DEFAULT 0 COMMENT '删除类型：1到期删除，2管理员修改，3用户复购',
  `expiration_time` datetime(0) NOT NULL COMMENT '用户组到期时间',
  `created_at` datetime(0) NOT NULL COMMENT '创建时间',
  `updated_at` datetime(0) NOT NULL COMMENT '更新时间',
  `deleted_at` datetime(0) NULL DEFAULT NULL COMMENT '删除时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of group_paid_users
-- ----------------------------

-- ----------------------------
-- Table structure for group_permission
-- ----------------------------
DROP TABLE IF EXISTS `group_permission`;
CREATE TABLE `group_permission`  (
  `group_id` bigint UNSIGNED NOT NULL COMMENT '用户组 id',
  `permission` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '权限名称',
  PRIMARY KEY (`group_id`, `permission`) USING BTREE,
  CONSTRAINT `group_permission_group_id_foreign` FOREIGN KEY (`group_id`) REFERENCES `groups` (`id`) ON DELETE CASCADE ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of group_permission
-- ----------------------------
INSERT INTO `group_permission` VALUES (6, 'order.create');
INSERT INTO `group_permission` VALUES (6, 'trade.pay.order');
INSERT INTO `group_permission` VALUES (7, 'category1.thread.viewPosts');
INSERT INTO `group_permission` VALUES (7, 'category1.viewThreads');
INSERT INTO `group_permission` VALUES (7, 'category10.thread.viewPosts');
INSERT INTO `group_permission` VALUES (7, 'category10.viewThreads');
INSERT INTO `group_permission` VALUES (7, 'category11.thread.viewPosts');
INSERT INTO `group_permission` VALUES (7, 'category11.viewThreads');
INSERT INTO `group_permission` VALUES (7, 'category12.thread.viewPosts');
INSERT INTO `group_permission` VALUES (7, 'category12.viewThreads');
INSERT INTO `group_permission` VALUES (7, 'category13.thread.viewPosts');
INSERT INTO `group_permission` VALUES (7, 'category13.viewThreads');
INSERT INTO `group_permission` VALUES (7, 'category14.thread.viewPosts');
INSERT INTO `group_permission` VALUES (7, 'category14.viewThreads');
INSERT INTO `group_permission` VALUES (7, 'category15.thread.viewPosts');
INSERT INTO `group_permission` VALUES (7, 'category15.viewThreads');
INSERT INTO `group_permission` VALUES (7, 'category16.thread.viewPosts');
INSERT INTO `group_permission` VALUES (7, 'category16.viewThreads');
INSERT INTO `group_permission` VALUES (7, 'category17.thread.viewPosts');
INSERT INTO `group_permission` VALUES (7, 'category17.viewThreads');
INSERT INTO `group_permission` VALUES (7, 'category18.thread.viewPosts');
INSERT INTO `group_permission` VALUES (7, 'category18.viewThreads');
INSERT INTO `group_permission` VALUES (7, 'category19.thread.viewPosts');
INSERT INTO `group_permission` VALUES (7, 'category19.viewThreads');
INSERT INTO `group_permission` VALUES (7, 'category2.thread.viewPosts');
INSERT INTO `group_permission` VALUES (7, 'category2.viewThreads');
INSERT INTO `group_permission` VALUES (7, 'category20.thread.viewPosts');
INSERT INTO `group_permission` VALUES (7, 'category20.viewThreads');
INSERT INTO `group_permission` VALUES (7, 'category21.thread.viewPosts');
INSERT INTO `group_permission` VALUES (7, 'category21.viewThreads');
INSERT INTO `group_permission` VALUES (7, 'category22.thread.viewPosts');
INSERT INTO `group_permission` VALUES (7, 'category22.viewThreads');
INSERT INTO `group_permission` VALUES (7, 'category23.thread.viewPosts');
INSERT INTO `group_permission` VALUES (7, 'category23.viewThreads');
INSERT INTO `group_permission` VALUES (7, 'category24.thread.viewPosts');
INSERT INTO `group_permission` VALUES (7, 'category24.viewThreads');
INSERT INTO `group_permission` VALUES (7, 'category25.thread.viewPosts');
INSERT INTO `group_permission` VALUES (7, 'category25.viewThreads');
INSERT INTO `group_permission` VALUES (7, 'category26.thread.viewPosts');
INSERT INTO `group_permission` VALUES (7, 'category26.viewThreads');
INSERT INTO `group_permission` VALUES (7, 'category27.thread.viewPosts');
INSERT INTO `group_permission` VALUES (7, 'category27.viewThreads');
INSERT INTO `group_permission` VALUES (7, 'category28.thread.viewPosts');
INSERT INTO `group_permission` VALUES (7, 'category28.viewThreads');
INSERT INTO `group_permission` VALUES (7, 'category29.thread.viewPosts');
INSERT INTO `group_permission` VALUES (7, 'category29.viewThreads');
INSERT INTO `group_permission` VALUES (7, 'category3.thread.viewPosts');
INSERT INTO `group_permission` VALUES (7, 'category3.viewThreads');
INSERT INTO `group_permission` VALUES (7, 'category30.thread.viewPosts');
INSERT INTO `group_permission` VALUES (7, 'category30.viewThreads');
INSERT INTO `group_permission` VALUES (7, 'category31.thread.viewPosts');
INSERT INTO `group_permission` VALUES (7, 'category31.viewThreads');
INSERT INTO `group_permission` VALUES (7, 'category32.thread.viewPosts');
INSERT INTO `group_permission` VALUES (7, 'category32.viewThreads');
INSERT INTO `group_permission` VALUES (7, 'category4.thread.viewPosts');
INSERT INTO `group_permission` VALUES (7, 'category4.viewThreads');
INSERT INTO `group_permission` VALUES (7, 'category5.thread.viewPosts');
INSERT INTO `group_permission` VALUES (7, 'category5.viewThreads');
INSERT INTO `group_permission` VALUES (7, 'category6.thread.viewPosts');
INSERT INTO `group_permission` VALUES (7, 'category6.viewThreads');
INSERT INTO `group_permission` VALUES (7, 'category7.thread.viewPosts');
INSERT INTO `group_permission` VALUES (7, 'category7.viewThreads');
INSERT INTO `group_permission` VALUES (7, 'category8.thread.viewPosts');
INSERT INTO `group_permission` VALUES (7, 'category8.viewThreads');
INSERT INTO `group_permission` VALUES (7, 'category9.thread.viewPosts');
INSERT INTO `group_permission` VALUES (7, 'category9.viewThreads');
INSERT INTO `group_permission` VALUES (7, 'switch.thread.viewPosts');
INSERT INTO `group_permission` VALUES (7, 'switch.viewThreads');
INSERT INTO `group_permission` VALUES (7, 'user.view');
INSERT INTO `group_permission` VALUES (10, '-category1.createThread');
INSERT INTO `group_permission` VALUES (10, '-category1.thread.reply');
INSERT INTO `group_permission` VALUES (10, '-category2.createThread');
INSERT INTO `group_permission` VALUES (10, '-category2.thread.reply');
INSERT INTO `group_permission` VALUES (10, '-category3.createThread');
INSERT INTO `group_permission` VALUES (10, '-category3.thread.reply');
INSERT INTO `group_permission` VALUES (10, '-category5.createThread');
INSERT INTO `group_permission` VALUES (10, '-category5.thread.reply');
INSERT INTO `group_permission` VALUES (10, '-category6.createThread');
INSERT INTO `group_permission` VALUES (10, '-category6.thread.reply');
INSERT INTO `group_permission` VALUES (10, 'attachment.create.0');
INSERT INTO `group_permission` VALUES (10, 'attachment.create.1');
INSERT INTO `group_permission` VALUES (10, 'cash.create');
INSERT INTO `group_permission` VALUES (10, 'category1.thread.viewPosts');
INSERT INTO `group_permission` VALUES (10, 'category1.viewThreads');
INSERT INTO `group_permission` VALUES (10, 'category10.createThread');
INSERT INTO `group_permission` VALUES (10, 'category10.thread.reply');
INSERT INTO `group_permission` VALUES (10, 'category10.thread.viewPosts');
INSERT INTO `group_permission` VALUES (10, 'category10.viewThreads');
INSERT INTO `group_permission` VALUES (10, 'category11.createThread');
INSERT INTO `group_permission` VALUES (10, 'category11.thread.reply');
INSERT INTO `group_permission` VALUES (10, 'category11.thread.viewPosts');
INSERT INTO `group_permission` VALUES (10, 'category11.viewThreads');
INSERT INTO `group_permission` VALUES (10, 'category12.createThread');
INSERT INTO `group_permission` VALUES (10, 'category12.thread.reply');
INSERT INTO `group_permission` VALUES (10, 'category12.thread.viewPosts');
INSERT INTO `group_permission` VALUES (10, 'category12.viewThreads');
INSERT INTO `group_permission` VALUES (10, 'category13.createThread');
INSERT INTO `group_permission` VALUES (10, 'category13.thread.reply');
INSERT INTO `group_permission` VALUES (10, 'category13.thread.viewPosts');
INSERT INTO `group_permission` VALUES (10, 'category13.viewThreads');
INSERT INTO `group_permission` VALUES (10, 'category14.createThread');
INSERT INTO `group_permission` VALUES (10, 'category14.thread.reply');
INSERT INTO `group_permission` VALUES (10, 'category14.thread.viewPosts');
INSERT INTO `group_permission` VALUES (10, 'category14.viewThreads');
INSERT INTO `group_permission` VALUES (10, 'category15.createThread');
INSERT INTO `group_permission` VALUES (10, 'category15.thread.reply');
INSERT INTO `group_permission` VALUES (10, 'category15.thread.viewPosts');
INSERT INTO `group_permission` VALUES (10, 'category15.viewThreads');
INSERT INTO `group_permission` VALUES (10, 'category16.createThread');
INSERT INTO `group_permission` VALUES (10, 'category16.thread.reply');
INSERT INTO `group_permission` VALUES (10, 'category16.thread.viewPosts');
INSERT INTO `group_permission` VALUES (10, 'category16.viewThreads');
INSERT INTO `group_permission` VALUES (10, 'category17.createThread');
INSERT INTO `group_permission` VALUES (10, 'category17.thread.reply');
INSERT INTO `group_permission` VALUES (10, 'category17.thread.viewPosts');
INSERT INTO `group_permission` VALUES (10, 'category17.viewThreads');
INSERT INTO `group_permission` VALUES (10, 'category18.createThread');
INSERT INTO `group_permission` VALUES (10, 'category18.thread.reply');
INSERT INTO `group_permission` VALUES (10, 'category18.thread.viewPosts');
INSERT INTO `group_permission` VALUES (10, 'category18.viewThreads');
INSERT INTO `group_permission` VALUES (10, 'category19.createThread');
INSERT INTO `group_permission` VALUES (10, 'category19.thread.reply');
INSERT INTO `group_permission` VALUES (10, 'category19.thread.viewPosts');
INSERT INTO `group_permission` VALUES (10, 'category19.viewThreads');
INSERT INTO `group_permission` VALUES (10, 'category2.thread.viewPosts');
INSERT INTO `group_permission` VALUES (10, 'category2.viewThreads');
INSERT INTO `group_permission` VALUES (10, 'category21.createThread');
INSERT INTO `group_permission` VALUES (10, 'category21.thread.reply');
INSERT INTO `group_permission` VALUES (10, 'category21.thread.viewPosts');
INSERT INTO `group_permission` VALUES (10, 'category21.viewThreads');
INSERT INTO `group_permission` VALUES (10, 'category22.createThread');
INSERT INTO `group_permission` VALUES (10, 'category22.thread.reply');
INSERT INTO `group_permission` VALUES (10, 'category22.thread.viewPosts');
INSERT INTO `group_permission` VALUES (10, 'category22.viewThreads');
INSERT INTO `group_permission` VALUES (10, 'category23.createThread');
INSERT INTO `group_permission` VALUES (10, 'category23.thread.reply');
INSERT INTO `group_permission` VALUES (10, 'category23.thread.viewPosts');
INSERT INTO `group_permission` VALUES (10, 'category23.viewThreads');
INSERT INTO `group_permission` VALUES (10, 'category24.createThread');
INSERT INTO `group_permission` VALUES (10, 'category24.thread.reply');
INSERT INTO `group_permission` VALUES (10, 'category24.thread.viewPosts');
INSERT INTO `group_permission` VALUES (10, 'category24.viewThreads');
INSERT INTO `group_permission` VALUES (10, 'category25.createThread');
INSERT INTO `group_permission` VALUES (10, 'category25.thread.reply');
INSERT INTO `group_permission` VALUES (10, 'category25.thread.viewPosts');
INSERT INTO `group_permission` VALUES (10, 'category25.viewThreads');
INSERT INTO `group_permission` VALUES (10, 'category26.createThread');
INSERT INTO `group_permission` VALUES (10, 'category26.thread.reply');
INSERT INTO `group_permission` VALUES (10, 'category26.thread.viewPosts');
INSERT INTO `group_permission` VALUES (10, 'category26.viewThreads');
INSERT INTO `group_permission` VALUES (10, 'category27.createThread');
INSERT INTO `group_permission` VALUES (10, 'category27.thread.reply');
INSERT INTO `group_permission` VALUES (10, 'category27.thread.viewPosts');
INSERT INTO `group_permission` VALUES (10, 'category27.viewThreads');
INSERT INTO `group_permission` VALUES (10, 'category28.createThread');
INSERT INTO `group_permission` VALUES (10, 'category28.thread.reply');
INSERT INTO `group_permission` VALUES (10, 'category28.thread.viewPosts');
INSERT INTO `group_permission` VALUES (10, 'category28.viewThreads');
INSERT INTO `group_permission` VALUES (10, 'category29.createThread');
INSERT INTO `group_permission` VALUES (10, 'category29.thread.reply');
INSERT INTO `group_permission` VALUES (10, 'category29.thread.viewPosts');
INSERT INTO `group_permission` VALUES (10, 'category29.viewThreads');
INSERT INTO `group_permission` VALUES (10, 'category3.thread.viewPosts');
INSERT INTO `group_permission` VALUES (10, 'category3.viewThreads');
INSERT INTO `group_permission` VALUES (10, 'category30.createThread');
INSERT INTO `group_permission` VALUES (10, 'category30.thread.reply');
INSERT INTO `group_permission` VALUES (10, 'category30.thread.viewPosts');
INSERT INTO `group_permission` VALUES (10, 'category30.viewThreads');
INSERT INTO `group_permission` VALUES (10, 'category31.createThread');
INSERT INTO `group_permission` VALUES (10, 'category31.thread.reply');
INSERT INTO `group_permission` VALUES (10, 'category31.thread.viewPosts');
INSERT INTO `group_permission` VALUES (10, 'category31.viewThreads');
INSERT INTO `group_permission` VALUES (10, 'category32.createThread');
INSERT INTO `group_permission` VALUES (10, 'category32.thread.reply');
INSERT INTO `group_permission` VALUES (10, 'category32.thread.viewPosts');
INSERT INTO `group_permission` VALUES (10, 'category32.viewThreads');
INSERT INTO `group_permission` VALUES (10, 'category4.createThread');
INSERT INTO `group_permission` VALUES (10, 'category4.thread.reply');
INSERT INTO `group_permission` VALUES (10, 'category4.thread.viewPosts');
INSERT INTO `group_permission` VALUES (10, 'category4.viewThreads');
INSERT INTO `group_permission` VALUES (10, 'category5.thread.viewPosts');
INSERT INTO `group_permission` VALUES (10, 'category5.viewThreads');
INSERT INTO `group_permission` VALUES (10, 'category6.thread.viewPosts');
INSERT INTO `group_permission` VALUES (10, 'category6.viewThreads');
INSERT INTO `group_permission` VALUES (10, 'category7.createThread');
INSERT INTO `group_permission` VALUES (10, 'category7.thread.reply');
INSERT INTO `group_permission` VALUES (10, 'category7.thread.viewPosts');
INSERT INTO `group_permission` VALUES (10, 'category7.viewThreads');
INSERT INTO `group_permission` VALUES (10, 'category8.createThread');
INSERT INTO `group_permission` VALUES (10, 'category8.thread.reply');
INSERT INTO `group_permission` VALUES (10, 'category8.thread.viewPosts');
INSERT INTO `group_permission` VALUES (10, 'category8.viewThreads');
INSERT INTO `group_permission` VALUES (10, 'category9.createThread');
INSERT INTO `group_permission` VALUES (10, 'category9.thread.reply');
INSERT INTO `group_permission` VALUES (10, 'category9.thread.viewPosts');
INSERT INTO `group_permission` VALUES (10, 'category9.viewThreads');
INSERT INTO `group_permission` VALUES (10, 'createThread.0');
INSERT INTO `group_permission` VALUES (10, 'createThread.1');
INSERT INTO `group_permission` VALUES (10, 'createThread.5');
INSERT INTO `group_permission` VALUES (10, 'createThread.6');
INSERT INTO `group_permission` VALUES (10, 'dialog.create');
INSERT INTO `group_permission` VALUES (10, 'order.create');
INSERT INTO `group_permission` VALUES (10, 'switch.createThread');
INSERT INTO `group_permission` VALUES (10, 'switch.thread.reply');
INSERT INTO `group_permission` VALUES (10, 'switch.thread.viewPosts');
INSERT INTO `group_permission` VALUES (10, 'switch.viewThreads');
INSERT INTO `group_permission` VALUES (10, 'thread.favorite');
INSERT INTO `group_permission` VALUES (10, 'thread.likePosts');
INSERT INTO `group_permission` VALUES (10, 'trade.pay.order');
INSERT INTO `group_permission` VALUES (10, 'user.view');
INSERT INTO `group_permission` VALUES (10, 'userFollow.create');

-- ----------------------------
-- Table structure for group_user
-- ----------------------------
DROP TABLE IF EXISTS `group_user`;
CREATE TABLE `group_user`  (
  `group_id` bigint UNSIGNED NOT NULL COMMENT '用户组 id',
  `user_id` bigint UNSIGNED NOT NULL COMMENT '用户 id',
  `expiration_time` datetime(0) NULL DEFAULT NULL COMMENT '用户组到期时间',
  PRIMARY KEY (`group_id`, `user_id`) USING BTREE,
  INDEX `group_user_user_id_foreign`(`user_id`) USING BTREE,
  CONSTRAINT `group_user_group_id_foreign` FOREIGN KEY (`group_id`) REFERENCES `groups` (`id`) ON DELETE CASCADE ON UPDATE RESTRICT,
  CONSTRAINT `group_user_user_id_foreign` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`) ON DELETE CASCADE ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of group_user
-- ----------------------------
INSERT INTO `group_user` VALUES (1, 1, NULL);
INSERT INTO `group_user` VALUES (1, 4, NULL);
INSERT INTO `group_user` VALUES (1, 5, NULL);
INSERT INTO `group_user` VALUES (1, 6, NULL);
INSERT INTO `group_user` VALUES (1, 7, NULL);
INSERT INTO `group_user` VALUES (1, 8, NULL);
INSERT INTO `group_user` VALUES (1, 9, NULL);
INSERT INTO `group_user` VALUES (1, 10, NULL);
INSERT INTO `group_user` VALUES (10, 2, NULL);
INSERT INTO `group_user` VALUES (10, 3, NULL);
INSERT INTO `group_user` VALUES (10, 11, NULL);
INSERT INTO `group_user` VALUES (10, 12, NULL);
INSERT INTO `group_user` VALUES (10, 13, NULL);
INSERT INTO `group_user` VALUES (10, 14, NULL);
INSERT INTO `group_user` VALUES (10, 15, NULL);
INSERT INTO `group_user` VALUES (10, 16, NULL);
INSERT INTO `group_user` VALUES (10, 17, NULL);
INSERT INTO `group_user` VALUES (10, 18, NULL);
INSERT INTO `group_user` VALUES (10, 19, NULL);
INSERT INTO `group_user` VALUES (10, 20, NULL);
INSERT INTO `group_user` VALUES (10, 21, NULL);
INSERT INTO `group_user` VALUES (10, 22, NULL);
INSERT INTO `group_user` VALUES (10, 23, NULL);
INSERT INTO `group_user` VALUES (10, 24, NULL);
INSERT INTO `group_user` VALUES (10, 25, NULL);
INSERT INTO `group_user` VALUES (10, 26, NULL);
INSERT INTO `group_user` VALUES (10, 27, NULL);
INSERT INTO `group_user` VALUES (10, 28, NULL);
INSERT INTO `group_user` VALUES (10, 29, NULL);
INSERT INTO `group_user` VALUES (10, 30, NULL);
INSERT INTO `group_user` VALUES (10, 31, NULL);
INSERT INTO `group_user` VALUES (10, 32, NULL);
INSERT INTO `group_user` VALUES (10, 33, NULL);
INSERT INTO `group_user` VALUES (10, 34, NULL);

-- ----------------------------
-- Table structure for groups
-- ----------------------------
DROP TABLE IF EXISTS `groups`;
CREATE TABLE `groups`  (
  `id` bigint UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '用户组 id',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '用户组名称',
  `type` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '类型',
  `color` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '颜色',
  `icon` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT 'icon',
  `default` tinyint UNSIGNED NOT NULL DEFAULT 0 COMMENT '是否默认',
  `is_display` tinyint UNSIGNED NOT NULL DEFAULT 0 COMMENT '是否显示在用户名后',
  `is_paid` tinyint UNSIGNED NOT NULL DEFAULT 0 COMMENT '是否收费：0不收费，1收费',
  `fee` decimal(10, 2) UNSIGNED NOT NULL DEFAULT 0.00 COMMENT '收费金额',
  `days` bigint UNSIGNED NOT NULL DEFAULT 0 COMMENT '付费获得天数',
  `scale` double(3, 1) NOT NULL DEFAULT 0.0 COMMENT '分成比例',
  `is_subordinate` tinyint UNSIGNED NOT NULL DEFAULT 0 COMMENT '是否可以 推广下线',
  `is_commission` tinyint UNSIGNED NOT NULL DEFAULT 0 COMMENT '是否可以 收入提成',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of groups
-- ----------------------------
INSERT INTO `groups` VALUES (1, '管理员', '', '', '', 0, 0, 0, 0.00, 0, 0.0, 0, 0);
INSERT INTO `groups` VALUES (6, '待付费', '', '', '', 0, 0, 0, 0.00, 0, 0.0, 0, 0);
INSERT INTO `groups` VALUES (7, '游客', '', '', '', 0, 0, 0, 0.00, 0, 0.0, 0, 0);
INSERT INTO `groups` VALUES (10, '普通会员', '', '', '', 1, 0, 0, 0.00, 0, 0.0, 0, 0);

-- ----------------------------
-- Table structure for invites
-- ----------------------------
DROP TABLE IF EXISTS `invites`;
CREATE TABLE `invites`  (
  `id` bigint UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '邀请 id',
  `group_id` bigint UNSIGNED NOT NULL COMMENT '默认用户组 id',
  `type` tinyint UNSIGNED NOT NULL DEFAULT 1 COMMENT '类型:1普通用户2管理员',
  `code` char(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '邀请码',
  `dateline` int UNSIGNED NOT NULL DEFAULT 0 COMMENT '邀请码生效时间',
  `endtime` int UNSIGNED NOT NULL DEFAULT 0 COMMENT '邀请码结束时间',
  `user_id` bigint UNSIGNED NOT NULL COMMENT '邀请用户 id',
  `to_user_id` bigint UNSIGNED NOT NULL DEFAULT 0 COMMENT '被邀请用户 id',
  `status` tinyint UNSIGNED NOT NULL DEFAULT 1 COMMENT '邀请码状态:0失效1未使用2已使用3已过期',
  `created_at` datetime(0) NOT NULL COMMENT '创建时间',
  `updated_at` datetime(0) NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `uk_code`(`code`) USING BTREE,
  INDEX `idx_user_id`(`user_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of invites
-- ----------------------------

-- ----------------------------
-- Table structure for migrations
-- ----------------------------
DROP TABLE IF EXISTS `migrations`;
CREATE TABLE `migrations`  (
  `id` int UNSIGNED NOT NULL AUTO_INCREMENT,
  `migration` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `batch` int NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 106 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of migrations
-- ----------------------------
INSERT INTO `migrations` VALUES (1, '2020_01_01_000001_create_users', 1);
INSERT INTO `migrations` VALUES (2, '2020_01_01_000002_create_groups', 1);
INSERT INTO `migrations` VALUES (3, '2020_01_01_000003_create_group_permission', 1);
INSERT INTO `migrations` VALUES (4, '2020_01_01_000004_create_group_user', 1);
INSERT INTO `migrations` VALUES (5, '2020_01_01_000005_create_categories', 1);
INSERT INTO `migrations` VALUES (6, '2020_01_01_000006_create_threads', 1);
INSERT INTO `migrations` VALUES (7, '2020_01_01_000007_create_posts', 1);
INSERT INTO `migrations` VALUES (8, '2020_01_01_000008_create_thread_user', 1);
INSERT INTO `migrations` VALUES (9, '2020_01_01_000009_create_post_user', 1);
INSERT INTO `migrations` VALUES (10, '2020_01_01_000010_create_post_mod', 1);
INSERT INTO `migrations` VALUES (11, '2020_01_01_000011_create_attachments', 1);
INSERT INTO `migrations` VALUES (12, '2020_01_01_000012_create_stop_words', 1);
INSERT INTO `migrations` VALUES (13, '2020_01_01_000013_create_operation_log', 1);
INSERT INTO `migrations` VALUES (14, '2020_01_01_000014_create_orders', 1);
INSERT INTO `migrations` VALUES (15, '2020_01_01_000015_create_pay_notify', 1);
INSERT INTO `migrations` VALUES (16, '2020_01_01_000016_create_user_wechats', 1);
INSERT INTO `migrations` VALUES (17, '2020_01_01_000017_create_user_wallets', 1);
INSERT INTO `migrations` VALUES (18, '2020_01_01_000018_create_user_wallet_cash', 1);
INSERT INTO `migrations` VALUES (19, '2020_01_01_000019_create_user_wallet_logs', 1);
INSERT INTO `migrations` VALUES (20, '2020_01_01_000020_create_user_login_fail_log', 1);
INSERT INTO `migrations` VALUES (21, '2020_01_01_000021_create_emoji', 1);
INSERT INTO `migrations` VALUES (22, '2020_01_01_000022_create_invites', 1);
INSERT INTO `migrations` VALUES (23, '2020_01_01_000023_create_mobile_codes', 1);
INSERT INTO `migrations` VALUES (24, '2020_01_01_000024_create_notifications', 1);
INSERT INTO `migrations` VALUES (25, '2020_01_01_000025_create_settings', 1);
INSERT INTO `migrations` VALUES (26, '2020_01_01_000026_create_user_follow', 1);
INSERT INTO `migrations` VALUES (27, '2020_01_01_000027_create_finance', 1);
INSERT INTO `migrations` VALUES (28, '2020_01_01_000028_create_dialog', 1);
INSERT INTO `migrations` VALUES (29, '2020_01_01_000029_create_dialog_message', 1);
INSERT INTO `migrations` VALUES (30, '2020_01_01_000030_create_notification_tpls', 1);
INSERT INTO `migrations` VALUES (31, '2020_01_01_000031_create_session_tokens', 1);
INSERT INTO `migrations` VALUES (32, '2020_01_01_000032_create_thread_video', 1);
INSERT INTO `migrations` VALUES (33, '2020_03_20_104938_add_order_to_attachments', 1);
INSERT INTO `migrations` VALUES (34, '2020_03_24_183227_create_user_wallet_fail_logs', 1);
INSERT INTO `migrations` VALUES (35, '2020_03_28_012029_alter_users', 1);
INSERT INTO `migrations` VALUES (36, '2020_04_14_101710_add_is_anonymous_to_orders', 1);
INSERT INTO `migrations` VALUES (37, '2020_04_14_104730_update_users_table', 1);
INSERT INTO `migrations` VALUES (38, '2020_04_14_174156_add_liked_count_to_users', 1);
INSERT INTO `migrations` VALUES (39, '2020_04_16_134237_create_post_mentions_user', 1);
INSERT INTO `migrations` VALUES (40, '2020_04_16_162908_add_free_words_to_threads', 1);
INSERT INTO `migrations` VALUES (41, '2020_04_17_152036_add_paid_count_to_threads', 1);
INSERT INTO `migrations` VALUES (42, '2020_04_20_185606_add_read_at_to_dialog', 1);
INSERT INTO `migrations` VALUES (43, '2020_04_23_143614_add_is_display_to_groups', 1);
INSERT INTO `migrations` VALUES (44, '2020_04_23_154946_create_topics', 1);
INSERT INTO `migrations` VALUES (45, '2020_04_23_155120_create_thread_topic', 1);
INSERT INTO `migrations` VALUES (46, '2020_04_26_111725_create_reports', 1);
INSERT INTO `migrations` VALUES (47, '2020_04_26_142056_create_deny_users', 1);
INSERT INTO `migrations` VALUES (48, '2020_04_30_150256_rename_operation_log_to_user_action_logs', 1);
INSERT INTO `migrations` VALUES (49, '2020_04_30_153136_create_operation_logs', 1);
INSERT INTO `migrations` VALUES (50, '2020_05_04_210900_add_email_to_users', 1);
INSERT INTO `migrations` VALUES (51, '2020_05_07_174510_add_location_to_posts', 1);
INSERT INTO `migrations` VALUES (52, '2020_05_08_172741_create_post_goods', 1);
INSERT INTO `migrations` VALUES (53, '2020_05_10_200400_create_references', 1);
INSERT INTO `migrations` VALUES (54, '2020_05_11_164733_create_group_paid_users', 1);
INSERT INTO `migrations` VALUES (55, '2020_05_11_164907_alter_add_expiration_time_to_groups', 1);
INSERT INTO `migrations` VALUES (56, '2020_05_11_165014_alter_add_groups_paid_mod', 1);
INSERT INTO `migrations` VALUES (57, '2020_05_11_165120_alter_add_group_id_to_orders', 1);
INSERT INTO `migrations` VALUES (58, '2020_05_11_175730_change_thread_video_columns', 1);
INSERT INTO `migrations` VALUES (59, '2020_05_21_191500_alter_user_wechats', 1);
INSERT INTO `migrations` VALUES (60, '2020_06_01_114859_alter_type_to_attachments', 1);
INSERT INTO `migrations` VALUES (61, '2020_06_01_172353_alter_attachment_to_dialog_message', 1);
INSERT INTO `migrations` VALUES (62, '2020_06_03_170416_alter_add_port_to_users', 1);
INSERT INTO `migrations` VALUES (63, '2020_06_03_170507_alter_add_port_to_posts', 1);
INSERT INTO `migrations` VALUES (64, '2020_06_08_155901_create_user_qq', 1);
INSERT INTO `migrations` VALUES (65, '2020_06_08_155901_create_user_qy_wechats', 1);
INSERT INTO `migrations` VALUES (66, '2020_06_10_105230_alter_add_foreign_key_to_user_follow', 1);
INSERT INTO `migrations` VALUES (67, '2020_06_10_115509_alter_bigint_to_all', 1);
INSERT INTO `migrations` VALUES (68, '2020_06_10_190229_alter_foreign_key_to_user_wechats', 1);
INSERT INTO `migrations` VALUES (69, '2020_06_12_185624_create_wechat_offiaccount_replies', 1);
INSERT INTO `migrations` VALUES (70, '2020_06_16_161128_change_threads_free_words_column_length', 1);
INSERT INTO `migrations` VALUES (71, '2020_06_23_170151_change_wechat_offiaccount_replies_column', 1);
INSERT INTO `migrations` VALUES (72, '2020_07_01_143404_change_user_wchats_user_id_to_null', 1);
INSERT INTO `migrations` VALUES (73, '2020_07_03_171957_change_timestamps_to_datetime', 1);
INSERT INTO `migrations` VALUES (74, '2020_07_15_183427_add_posts_reply_post_id_index', 1);
INSERT INTO `migrations` VALUES (75, '2020_07_22_180923_add_duration_to_thread_video', 1);
INSERT INTO `migrations` VALUES (76, '2020_07_24_145712_add_expired_at_to_orders', 1);
INSERT INTO `migrations` VALUES (77, '2020_08_05_114608_add_category_id_index_to_threads', 1);
INSERT INTO `migrations` VALUES (78, '2020_08_09_170544_create_paraparty_activities', 1);
INSERT INTO `migrations` VALUES (79, '2020_08_03_183433_change_scale_to_groups', 2);
INSERT INTO `migrations` VALUES (80, '2020_08_04_154120_create_user_distributions', 2);
INSERT INTO `migrations` VALUES (81, '2020_08_05_233234_add_be_scale_to_orders', 2);
INSERT INTO `migrations` VALUES (82, '2020_08_07_174108_add_code_unique_to_invites', 2);
INSERT INTO `migrations` VALUES (83, '2020_08_12_142541_create_user_ucenters', 2);
INSERT INTO `migrations` VALUES (84, '2020_08_12_161140_alert_add_recommended_to_topics', 2);
INSERT INTO `migrations` VALUES (85, '2020_08_12_161154_alert_add_recommended_at_to_topics', 2);
INSERT INTO `migrations` VALUES (86, '2020_08_17_111947_add_location_to_threads', 2);
INSERT INTO `migrations` VALUES (87, '2020_08_20_104455_add_is_subordinate_is_commission_to_groups', 2);
INSERT INTO `migrations` VALUES (88, '2020_08_26_181122_add_address_to_threads', 2);
INSERT INTO `migrations` VALUES (89, '2020_09_03_153645_add_moderators_to_categories', 2);
INSERT INTO `migrations` VALUES (90, '2020_09_04_152844_create_questions', 2);
INSERT INTO `migrations` VALUES (91, '2020_09_05_122736_add_question_id_to_user_wallet_logs', 2);
INSERT INTO `migrations` VALUES (92, '2020_09_08_111818_add_cash_type_to_user_wallet_cash', 2);
INSERT INTO `migrations` VALUES (93, '2020_09_09_184716_add_third_party_to_orders', 2);
INSERT INTO `migrations` VALUES (94, '2020_09_09_203924_add_foreign_keys_to_group_permission', 2);
INSERT INTO `migrations` VALUES (95, '2020_09_14_150620_add_is_site_to_threads', 2);
INSERT INTO `migrations` VALUES (96, '2020_09_21_184613_add_attachment_price_to_threads', 2);
INSERT INTO `migrations` VALUES (97, '2020_09_25_164242_add_delete_at_to_dialog', 2);
INSERT INTO `migrations` VALUES (98, '2020_09_27_175432_add_index_to_dialog_message', 2);
INSERT INTO `migrations` VALUES (99, '2020_09_27_184315_add_question_count_to_users', 2);
INSERT INTO `migrations` VALUES (100, '2020_10_12_160100_add_answered_at_to_questions', 2);
INSERT INTO `migrations` VALUES (101, '2020_10_13_190715_change_is_anonymous', 2);
INSERT INTO `migrations` VALUES (102, '2020_10_21_152510_add_signature_and_dialog_to_stop_words', 2);
INSERT INTO `migrations` VALUES (103, '2020_10_26_135924_add_is_display_to_threads', 2);
INSERT INTO `migrations` VALUES (104, '2020_10_26_141128_alter_thread_add_free_percent', 2);
INSERT INTO `migrations` VALUES (105, '2020_11_10_192530_add_some_index_to_user_wechats', 2);
INSERT INTO `migrations` VALUES (106, '2020_11_11_105024_change_price_to_post_goods', 2);

-- ----------------------------
-- Table structure for mobile_codes
-- ----------------------------
DROP TABLE IF EXISTS `mobile_codes`;
CREATE TABLE `mobile_codes`  (
  `id` bigint UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '验证码 id',
  `mobile` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '手机号',
  `code` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '验证码',
  `type` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '验证类型',
  `state` tinyint NOT NULL DEFAULT 0 COMMENT '验证状态',
  `ip` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT 'ip',
  `expired_at` datetime(0) NULL DEFAULT NULL COMMENT '验证码过期时间',
  `created_at` datetime(0) NOT NULL COMMENT '创建时间',
  `updated_at` datetime(0) NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of mobile_codes
-- ----------------------------

-- ----------------------------
-- Table structure for notification_tpls
-- ----------------------------
DROP TABLE IF EXISTS `notification_tpls`;
CREATE TABLE `notification_tpls`  (
  `id` bigint UNSIGNED NOT NULL AUTO_INCREMENT,
  `status` tinyint NOT NULL DEFAULT 0 COMMENT '模板状态:1开启0关闭',
  `type` tinyint UNSIGNED NOT NULL DEFAULT 0 COMMENT '通知类型:0系统1微信2短信',
  `type_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '类型名称',
  `title` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '标题',
  `content` text CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '内容',
  `vars` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '可选的变量',
  `template_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '模板ID',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 36 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of notification_tpls
-- ----------------------------
INSERT INTO `notification_tpls` VALUES (1, 1, 0, '新用户注册并加入后', '欢迎加入{sitename}', '{username}你好，你已经成为{sitename} 的{groupname} ，请你在发表言论时，遵守当地法律法规。祝你在这里玩的愉快。', 'a:3:{s:10:\"{username}\";s:9:\"用户名\";s:10:\"{sitename}\";s:12:\"站点名称\";s:11:\"{groupname}\";s:9:\"用户组\";}', '');
INSERT INTO `notification_tpls` VALUES (2, 1, 0, '注册审核通过通知', '注册审核通知', '{username}你好，你的注册申请已审核通过。', 'a:1:{s:10:\"{username}\";s:9:\"用户名\";}', '');
INSERT INTO `notification_tpls` VALUES (3, 1, 0, '注册审核不通过通知', '注册审核通知', '{username}你好，你的注册申请审核不通过，原因：{reason}', 'a:2:{s:10:\"{username}\";s:9:\"用户名\";s:8:\"{reason}\";s:6:\"原因\";}', '');
INSERT INTO `notification_tpls` VALUES (4, 1, 0, '内容审核不通过通知', '内容审核通知', '{username}你好，你发布的内容 \"{content}\" 审核不通过，原因：{reason}', 'a:3:{s:10:\"{username}\";s:9:\"用户名\";s:9:\"{content}\";s:6:\"内容\";s:8:\"{reason}\";s:6:\"原因\";}', '');
INSERT INTO `notification_tpls` VALUES (5, 1, 0, '内容审核通过通知', '内容审核通知', '{username}你好，你发布的内容 \"{content}\" 审核通过', 'a:2:{s:10:\"{username}\";s:9:\"用户名\";s:9:\"{content}\";s:6:\"内容\";}', '');
INSERT INTO `notification_tpls` VALUES (6, 1, 0, '内容删除通知', '内容通知', '{username}你好，你发布的内容 \"{content} \" 已删除，原因：{reason}', 'a:3:{s:10:\"{username}\";s:9:\"用户名\";s:9:\"{content}\";s:6:\"内容\";s:8:\"{reason}\";s:6:\"原因\";}', '');
INSERT INTO `notification_tpls` VALUES (7, 1, 0, '内容精华通知', '内容通知', '{username}你好，你发布的内容 \"{content}\" 已设为精华', 'a:2:{s:10:\"{username}\";s:9:\"用户名\";s:9:\"{content}\";s:6:\"内容\";}', '');
INSERT INTO `notification_tpls` VALUES (8, 1, 0, '内容置顶通知', '内容通知', '{username}你好，你发布的内容 \"{content}\" 已置顶', 'a:2:{s:10:\"{username}\";s:9:\"用户名\";s:9:\"{content}\";s:6:\"内容\";}', '');
INSERT INTO `notification_tpls` VALUES (9, 1, 0, '内容修改通知', '内容通知', '{username}你好，你发布的内容 \"{content}\" 已被修改', 'a:2:{s:10:\"{username}\";s:9:\"用户名\";s:9:\"{content}\";s:6:\"内容\";}', '');
INSERT INTO `notification_tpls` VALUES (10, 1, 0, '用户禁用通知', '用户通知', '{username}你好，你的帐号已禁用，原因：{reason}', 'a:2:{s:10:\"{username}\";s:9:\"用户名\";s:8:\"{reason}\";s:6:\"原因\";}', '');
INSERT INTO `notification_tpls` VALUES (11, 1, 0, '用户解除禁用通知', '用户通知', '{username}你好，你的帐号已解除禁用', 'a:1:{s:10:\"{username}\";s:9:\"用户名\";}', '');
INSERT INTO `notification_tpls` VALUES (12, 1, 0, '用户角色调整通知', '角色通知', '{username}你好，你的角色由{oldgroupname}变更为{newgroupname}', 'a:3:{s:10:\"{username}\";s:9:\"用户名\";s:14:\"{oldgroupname}\";s:12:\"老用户组\";s:14:\"{newgroupname}\";s:12:\"新用户组\";}', '');
INSERT INTO `notification_tpls` VALUES (13, 0, 1, '新用户注册并加入后', '微信注册通知', '{\"data\":{\"first\":{\"value\":\"\\u4f60\\u597d\\uff0c\\u6b22\\u8fce\\u52a0\\u5165{sitename}\",\"color\":\"#173177\"},\"keyword1\":{\"value\":\"{username}\",\"color\":\"#173177\"},\"keyword2\":{\"value\":\"{dateline}\",\"color\":\"#173177\"},\"remark\":{\"value\":\"\\u8bf7\\u4f60\\u5728\\u53d1\\u8868\\u8a00\\u8bba\\u65f6\\uff0c\\u9075\\u5b88\\u5f53\\u5730\\u6cd5\\u5f8b\\u6cd5\\u89c4\\u3002\\u795d\\u4f60\\u5728\\u8fd9\\u91cc\\u73a9\\u7684\\u6109\\u5feb\",\"color\":\"#173177\"}},\"redirect_url\":\"{redirecturl}\"}', 'a:4:{s:10:\"{sitename}\";s:12:\"站点名称\";s:10:\"{username}\";s:9:\"用户名\";s:10:\"{dateline}\";s:12:\"通知时间\";s:13:\"{redirecturl}\";s:12:\"跳转地址\";}', '');
INSERT INTO `notification_tpls` VALUES (14, 0, 1, '注册审核通过通知', '微信注册审核通知', '{\"data\":{\"first\":{\"value\":\"\\u4f60\\u7684\\u6ce8\\u518c\\u7533\\u8bf7\\u5df2\\u5ba1\\u6838\\u901a\\u8fc7\",\"color\":\"#173177\"},\"keyword1\":{\"value\":\"{username}\",\"color\":\"#173177\"},\"keyword2\":{\"value\":\"{dateline}\",\"color\":\"#173177\"},\"remark\":{\"value\":\"\\u795d\\u4f60\\u5728\\u8fd9\\u91cc\\u73a9\\u7684\\u6109\\u5feb\",\"color\":\"#173177\"}},\"redirect_url\":\"{redirecturl}\"}', 'a:3:{s:10:\"{username}\";s:9:\"用户名\";s:10:\"{dateline}\";s:12:\"通知时间\";s:13:\"{redirecturl}\";s:12:\"跳转地址\";}', '');
INSERT INTO `notification_tpls` VALUES (15, 0, 1, '注册审核不通过通知', '微信注册审核通知', '{\"data\":{\"first\":{\"value\":\"\\u4f60\\u7684\\u6ce8\\u518c\\u7533\\u8bf7\\u5ba1\\u6838\\u4e0d\\u901a\\u8fc7\",\"color\":\"#173177\"},\"keyword1\":{\"value\":\"{username}\",\"color\":\"#173177\"},\"keyword2\":{\"value\":\"{dateline}\",\"color\":\"#173177\"},\"remark\":{\"value\":\"\\u70b9\\u51fb\\u91cd\\u65b0\\u63d0\\u4ea4\\u7533\\u8bf7\",\"color\":\"#173177\"},\"keyword3\":{\"value\":\"{reason}\",\"color\":\"#173177\"}},\"redirect_url\":\"{redirecturl}\"}', 'a:4:{s:10:\"{username}\";s:9:\"用户名\";s:10:\"{dateline}\";s:6:\"时间\";s:13:\"{redirecturl}\";s:12:\"跳转地址\";s:8:\"{reason}\";s:6:\"原因\";}', '');
INSERT INTO `notification_tpls` VALUES (16, 0, 1, '内容审核通过通知', '微信内容审核通知', '{\"data\":{\"first\":{\"value\":\"\\u4f60\\u53d1\\u5e03\\u7684\\u5185\\u5bb9\\u5df2\\u5ba1\\u6838\\u901a\\u8fc7\",\"color\":\"#173177\"},\"keyword1\":{\"value\":\"{content}\",\"color\":\"#173177\"},\"keyword2\":{\"value\":\"{dateline}\",\"color\":\"#173177\"},\"remark\":{\"value\":\"\\u70b9\\u51fb\\u67e5\\u770b\",\"color\":\"#173177\"}},\"redirect_url\":\"{redirecturl}\"}', 'a:3:{s:9:\"{content}\";s:6:\"内容\";s:10:\"{dateline}\";s:12:\"通知时间\";s:13:\"{redirecturl}\";s:12:\"跳转地址\";}', '');
INSERT INTO `notification_tpls` VALUES (17, 0, 1, '内容审核不通过通知', '微信内容审核通知', '{\"data\":{\"first\":{\"value\":\"\\u4f60\\u53d1\\u5e03\\u7684\\u5185\\u5bb9\\u5ba1\\u6838\\u4e0d\\u901a\\u8fc7\",\"color\":\"#173177\"},\"keyword1\":{\"value\":\"{content}\",\"color\":\"#173177\"},\"keyword2\":{\"value\":\"{reason}\",\"color\":\"#173177\"},\"remark\":{\"value\":\"\\u70b9\\u51fb\\u67e5\\u770b\",\"color\":\"#173177\"},\"keyword3\":{\"value\":\"{dateline}\",\"color\":\"#173177\"}},\"redirect_url\":\"{redirecturl}\"}', 'a:4:{s:9:\"{content}\";s:6:\"内容\";s:10:\"{dateline}\";s:12:\"通知时间\";s:13:\"{redirecturl}\";s:12:\"跳转地址\";s:8:\"{reason}\";s:6:\"原因\";}', '');
INSERT INTO `notification_tpls` VALUES (18, 0, 1, '内容删除通知', '微信内容通知', '{\"data\":{\"first\":{\"value\":\"\\u4f60\\u53d1\\u5e03\\u7684\\u5185\\u5bb9\\u5df2\\u5220\\u9664\",\"color\":\"#173177\"},\"keyword1\":{\"value\":\"{content}\",\"color\":\"#173177\"},\"keyword2\":{\"value\":\"{reason}\",\"color\":\"#173177\"},\"remark\":{\"value\":\"\\u70b9\\u51fb\\u67e5\\u770b\",\"color\":\"#173177\"},\"keyword3\":{\"value\":\"{dateline}\",\"color\":\"#173177\"}},\"redirect_url\":\"{redirecturl}\"}', 'a:4:{s:9:\"{content}\";s:6:\"内容\";s:10:\"{dateline}\";s:12:\"通知时间\";s:13:\"{redirecturl}\";s:12:\"跳转地址\";s:8:\"{reason}\";s:6:\"原因\";}', '');
INSERT INTO `notification_tpls` VALUES (19, 0, 1, '内容精华通知', '微信内容通知', '{\"data\":{\"first\":{\"value\":\"\\u4f60\\u53d1\\u5e03\\u7684\\u5185\\u5bb9\\u5df2\\u8bbe\\u4e3a\\u7cbe\\u534e\",\"color\":\"#173177\"},\"keyword1\":{\"value\":\"{content}\",\"color\":\"#173177\"},\"keyword2\":{\"value\":\"{dateline}\",\"color\":\"#173177\"},\"remark\":{\"value\":\"\\u70b9\\u51fb\\u67e5\\u770b\",\"color\":\"#173177\"}},\"redirect_url\":\"{redirecturl}\"}', 'a:3:{s:9:\"{content}\";s:6:\"内容\";s:10:\"{dateline}\";s:12:\"通知时间\";s:13:\"{redirecturl}\";s:12:\"跳转地址\";}', '');
INSERT INTO `notification_tpls` VALUES (20, 0, 1, '内容置顶通知', '微信内容通知', '{\"data\":{\"first\":{\"value\":\"\\u4f60\\u53d1\\u5e03\\u7684\\u5185\\u5bb9\\u5df2\\u7f6e\\u9876\",\"color\":\"#173177\"},\"keyword1\":{\"value\":\"{content}\",\"color\":\"#173177\"},\"keyword2\":{\"value\":\"{dateline}\",\"color\":\"#173177\"},\"remark\":{\"value\":\"\\u70b9\\u51fb\\u67e5\\u770b\",\"color\":\"#173177\"}},\"redirect_url\":\"{redirecturl}\"}', 'a:3:{s:9:\"{content}\";s:6:\"内容\";s:10:\"{dateline}\";s:12:\"通知时间\";s:13:\"{redirecturl}\";s:12:\"跳转地址\";}', '');
INSERT INTO `notification_tpls` VALUES (21, 0, 1, '内容修改通知', '微信内容通知', '{\"data\":{\"first\":{\"value\":\"\\u4f60\\u53d1\\u5e03\\u7684\\u5185\\u5bb9\\u5df2\\u88ab\\u4fee\\u6539\",\"color\":\"#173177\"},\"keyword1\":{\"value\":\"{content}\",\"color\":\"#173177\"},\"keyword2\":{\"value\":\"{dateline}\",\"color\":\"#173177\"},\"remark\":{\"value\":\"\\u70b9\\u51fb\\u67e5\\u770b\",\"color\":\"#173177\"}},\"redirect_url\":\"{redirecturl}\"}', 'a:3:{s:9:\"{content}\";s:6:\"内容\";s:10:\"{dateline}\";s:12:\"通知时间\";s:13:\"{redirecturl}\";s:12:\"跳转地址\";}', '');
INSERT INTO `notification_tpls` VALUES (22, 0, 1, '帐号禁用通知', '微信用户通知', '{\"data\":{\"first\":{\"value\":\"\\u4f60\\u7684\\u5e10\\u53f7\\u5df2\\u7981\\u7528\",\"color\":\"#173177\"},\"keyword1\":{\"value\":\"{username}\",\"color\":\"#173177\"},\"keyword2\":{\"value\":\"{reason}\",\"color\":\"#173177\"},\"remark\":{\"value\":\"\\u70b9\\u51fb\\u67e5\\u770b\",\"color\":\"#173177\"},\"keyword3\":{\"value\":\"{dateline}\",\"color\":\"#173177\"}},\"redirect_url\":\"{redirecturl}\"}', 'a:4:{s:10:\"{username}\";s:9:\"用户名\";s:10:\"{dateline}\";s:12:\"通知时间\";s:13:\"{redirecturl}\";s:12:\"跳转地址\";s:8:\"{reason}\";s:6:\"原因\";}', '');
INSERT INTO `notification_tpls` VALUES (23, 0, 1, '用户解除禁用通知', '微信用户通知', '{\"data\":{\"first\":{\"value\":\"\\u4f60\\u7684\\u5e10\\u53f7\\u5df2\\u89e3\\u9664\\u7981\\u7528\",\"color\":\"#173177\"},\"keyword1\":{\"value\":\"{username}\",\"color\":\"#173177\"},\"keyword2\":{\"value\":\"{dateline}\",\"color\":\"#173177\"},\"remark\":{\"value\":\"\\u70b9\\u51fb\\u67e5\\u770b\",\"color\":\"#173177\"}},\"redirect_url\":\"{redirecturl}\"}', 'a:3:{s:10:\"{username}\";s:9:\"用户名\";s:10:\"{dateline}\";s:12:\"通知时间\";s:13:\"{redirecturl}\";s:12:\"跳转地址\";}', '');
INSERT INTO `notification_tpls` VALUES (24, 0, 1, '用户角色调整通知', '微信角色通知', '{\"data\":{\"first\":{\"value\":\"\\u4f60\\u7684\\u89d2\\u8272\\u5df2\\u53d8\\u66f4\",\"color\":\"#173177\"},\"keyword1\":{\"value\":\"{username}\",\"color\":\"#173177\"},\"keyword2\":{\"value\":\"{oldgroupname}\",\"color\":\"#173177\"},\"remark\":{\"value\":\"\\u70b9\\u51fb\\u67e5\\u770b\",\"color\":\"#173177\"},\"keyword3\":{\"value\":\"{newgroupname}\",\"color\":\"#173177\"}},\"redirect_url\":\"{redirecturl}\"}', 'a:4:{s:10:\"{username}\";s:9:\"用户名\";s:14:\"{oldgroupname}\";s:9:\"原角色\";s:14:\"{newgroupname}\";s:9:\"新角色\";s:13:\"{redirecturl}\";s:12:\"跳转地址\";}', '');
INSERT INTO `notification_tpls` VALUES (25, 1, 0, '内容回复通知', '内容通知', '', '', '');
INSERT INTO `notification_tpls` VALUES (26, 1, 0, '内容点赞通知', '内容通知', '', '', '');
INSERT INTO `notification_tpls` VALUES (27, 1, 0, '内容支付通知', '内容通知', '', '', '');
INSERT INTO `notification_tpls` VALUES (28, 1, 0, '内容@通知', '内容通知', '', '', '');
INSERT INTO `notification_tpls` VALUES (29, 0, 1, '内容回复通知', '微信内容通知', '{\"data\":{\"first\":{\"value\":\"{username}\\u56de\\u590d\\u4e86\\u4f60\",\"color\":\"#173177\"},\"keyword1\":{\"value\":\"{content}\",\"color\":\"#173177\"},\"keyword2\":{\"value\":\"{subject}\",\"color\":\"#173177\"},\"remark\":{\"value\":\"\\u70b9\\u51fb\\u67e5\\u770b\",\"color\":\"#173177\"},\"keyword3\":{\"value\":\"{dateline}\",\"color\":\"#173177\"}},\"redirect_url\":\"{redirecturl}\"}', 'a:5:{s:10:\"{username}\";s:18:\"回复人用户名\";s:9:\"{content}\";s:12:\"回复内容\";s:9:\"{subject}\";s:12:\"原文内容\";s:10:\"{dateline}\";s:12:\"通知时间\";s:13:\"{redirecturl}\";s:12:\"跳转地址\";}', '');
INSERT INTO `notification_tpls` VALUES (30, 0, 1, '内容点赞通知', '微信内容通知', '{\"data\":{\"first\":{\"value\":\"{username}\\u70b9\\u8d5e\\u4e86\\u4f60\",\"color\":\"#173177\"},\"keyword1\":{\"value\":\"{content}\",\"color\":\"#173177\"},\"keyword2\":{\"value\":\"{dateline}\",\"color\":\"#173177\"},\"remark\":{\"value\":\"\\u70b9\\u51fb\\u67e5\\u770b\",\"color\":\"#173177\"}},\"redirect_url\":\"{redirecturl}\"}', 'a:4:{s:10:\"{username}\";s:18:\"点赞人用户名\";s:9:\"{content}\";s:12:\"点赞内容\";s:10:\"{dateline}\";s:12:\"通知时间\";s:13:\"{redirecturl}\";s:12:\"跳转地址\";}', '');
INSERT INTO `notification_tpls` VALUES (31, 0, 1, '内容支付通知', '微信内容通知', '{\"data\":{\"first\":{\"value\":\"{username}\\u652f\\u4ed8\\u4e86\\u4f60{money}\",\"color\":\"#173177\"},\"keyword1\":{\"value\":\"{content}\",\"color\":\"#173177\"},\"keyword2\":{\"value\":\"{ordertype}\",\"color\":\"#173177\"},\"remark\":{\"value\":\"\\u70b9\\u51fb\\u67e5\\u770b\",\"color\":\"#173177\"},\"keyword3\":{\"value\":\"{dateline}\",\"color\":\"#173177\"}},\"redirect_url\":\"{redirecturl}\"}', 'a:6:{s:10:\"{username}\";s:15:\"支付用户名\";s:7:\"{money}\";s:6:\"金额\";s:9:\"{content}\";s:6:\"内容\";s:11:\"{ordertype}\";s:12:\"支付类型\";s:10:\"{dateline}\";s:12:\"通知时间\";s:13:\"{redirecturl}\";s:12:\"跳转地址\";}', '');
INSERT INTO `notification_tpls` VALUES (32, 0, 1, '内容@通知', '微信内容通知', '{\"data\":{\"first\":{\"value\":\"{username}@\\u4e86\\u4f60\",\"color\":\"#173177\"},\"keyword1\":{\"value\":\"{content}\",\"color\":\"#173177\"},\"keyword2\":{\"value\":\"{dateline}\",\"color\":\"#173177\"},\"remark\":{\"value\":\"\\u70b9\\u51fb\\u67e5\\u770b\",\"color\":\"#173177\"}},\"redirect_url\":\"{redirecturl}\"}', 'a:4:{s:10:\"{username}\";s:13:\"@人用户名\";s:9:\"{content}\";s:7:\"@内容\";s:10:\"{dateline}\";s:12:\"通知时间\";s:13:\"{redirecturl}\";s:12:\"跳转地址\";}', '');
INSERT INTO `notification_tpls` VALUES (33, 1, 0, '提现通知', '财务通知', '', '', '');
INSERT INTO `notification_tpls` VALUES (34, 1, 0, '提现失败通知', '财务通知', '', '', '');
INSERT INTO `notification_tpls` VALUES (35, 0, 1, '提现通知', '微信财务通知', '{\"data\":{\"first\":{\"value\":\"\\u4f60\\u53d1\\u8d77\\u7684\\u63d0\\u73b0\\u8bf7\\u6c42\",\"color\":\"#173177\"},\"keyword1\":{\"value\":\"{money}\",\"color\":\"#173177\"},\"keyword2\":{\"value\":\"{dateline}\",\"color\":\"#173177\"},\"remark\":{\"value\":\"\\u70b9\\u51fb\\u67e5\\u770b\",\"color\":\"#173177\"},\"keyword3\":{\"value\":\"{withdrawalStatus}\",\"color\":\"#173177\"}},\"redirect_url\":\"{redirecturl}\"}', 'a:4:{s:7:\"{money}\";s:6:\"金额\";s:10:\"{dateline}\";s:12:\"申请时间\";s:18:\"{withdrawalStatus}\";s:12:\"提现状态\";s:13:\"{redirecturl}\";s:12:\"跳转地址\";}', '');
INSERT INTO `notification_tpls` VALUES (36, 0, 1, '提现失败通知', '微信财务通知', '{\"data\":{\"first\":{\"value\":\"\\u4f60\\u53d1\\u8d77\\u7684\\u63d0\\u73b0\\u8bf7\\u6c42\",\"color\":\"#173177\"},\"keyword1\":{\"value\":\"{money}\",\"color\":\"#173177\"},\"keyword2\":{\"value\":\"{dateline}\",\"color\":\"#173177\"},\"remark\":{\"value\":\"\\u70b9\\u51fb\\u67e5\\u770b\",\"color\":\"#173177\"},\"keyword3\":{\"value\":\"{withdrawalStatus}\",\"color\":\"#173177\"},\"keyword4\":{\"value\":\"{reason}\",\"color\":\"#173177\"}},\"redirect_url\":\"{redirecturl}\"}', 'a:5:{s:7:\"{money}\";s:6:\"金额\";s:10:\"{dateline}\";s:12:\"申请时间\";s:18:\"{withdrawalStatus}\";s:12:\"提现状态\";s:8:\"{reason}\";s:6:\"原因\";s:13:\"{redirecturl}\";s:12:\"跳转地址\";}', '');

-- ----------------------------
-- Table structure for notifications
-- ----------------------------
DROP TABLE IF EXISTS `notifications`;
CREATE TABLE `notifications`  (
  `id` bigint UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '通知 id',
  `type` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '通知类型',
  `notifiable_type` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `notifiable_id` bigint UNSIGNED NOT NULL,
  `data` text CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '通知内容',
  `read_at` datetime(0) NULL DEFAULT NULL COMMENT '通知阅读时间',
  `created_at` datetime(0) NOT NULL COMMENT '创建时间',
  `updated_at` datetime(0) NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `notifications_notifiable_type_notifiable_id_index`(`notifiable_type`, `notifiable_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 129 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of notifications
-- ----------------------------
INSERT INTO `notifications` VALUES (1, 'system', 'App\\Models\\User', 2, '{\"title\":\"\\u6b22\\u8fce\\u52a0\\u5165ParaParty \\u5f00\\u53d1\\u7ad9\",\"content\":\"reference_bot\\u4f60\\u597d\\uff0c\\u4f60\\u5df2\\u7ecf\\u6210\\u4e3aParaParty \\u5f00\\u53d1\\u7ad9 \\u7684\\u666e\\u901a\\u4f1a\\u5458 \\uff0c\\u8bf7\\u4f60\\u5728\\u53d1\\u8868\\u8a00\\u8bba\\u65f6\\uff0c\\u9075\\u5b88\\u5f53\\u5730\\u6cd5\\u5f8b\\u6cd5\\u89c4\\u3002\\u795d\\u4f60\\u5728\\u8fd9\\u91cc\\u73a9\\u7684\\u6109\\u5feb\\u3002\",\"raw\":{\"tpl_id\":1}}', '2020-08-15 22:01:14', '2020-08-15 22:00:14', '2020-08-15 22:01:14');
INSERT INTO `notifications` VALUES (2, 'system', 'App\\Models\\User', 3, '{\"title\":\"\\u6b22\\u8fce\\u52a0\\u5165ParaParty \\u5f00\\u53d1\\u7ad9\",\"content\":\"111\\u4f60\\u597d\\uff0c\\u4f60\\u5df2\\u7ecf\\u6210\\u4e3aParaParty \\u5f00\\u53d1\\u7ad9 \\u7684\\u666e\\u901a\\u4f1a\\u5458 \\uff0c\\u8bf7\\u4f60\\u5728\\u53d1\\u8868\\u8a00\\u8bba\\u65f6\\uff0c\\u9075\\u5b88\\u5f53\\u5730\\u6cd5\\u5f8b\\u6cd5\\u89c4\\u3002\\u795d\\u4f60\\u5728\\u8fd9\\u91cc\\u73a9\\u7684\\u6109\\u5feb\\u3002\",\"raw\":{\"tpl_id\":1}}', '2020-11-24 16:01:53', '2020-11-24 16:01:25', '2020-11-24 16:01:53');
INSERT INTO `notifications` VALUES (3, 'system', 'App\\Models\\User', 4, '{\"title\":\"\\u6b22\\u8fce\\u52a0\\u5165ParaParty \\u5f00\\u53d1\\u7ad9\",\"content\":\"A_Salty_Fish\\u4f60\\u597d\\uff0c\\u4f60\\u5df2\\u7ecf\\u6210\\u4e3aParaParty \\u5f00\\u53d1\\u7ad9 \\u7684\\u666e\\u901a\\u4f1a\\u5458 \\uff0c\\u8bf7\\u4f60\\u5728\\u53d1\\u8868\\u8a00\\u8bba\\u65f6\\uff0c\\u9075\\u5b88\\u5f53\\u5730\\u6cd5\\u5f8b\\u6cd5\\u89c4\\u3002\\u795d\\u4f60\\u5728\\u8fd9\\u91cc\\u73a9\\u7684\\u6109\\u5feb\\u3002\",\"raw\":{\"tpl_id\":1}}', NULL, '2020-11-24 20:38:05', '2020-11-24 20:38:05');
INSERT INTO `notifications` VALUES (4, 'system', 'App\\Models\\User', 5, '{\"title\":\"\\u6b22\\u8fce\\u52a0\\u5165ParaParty \\u5f00\\u53d1\\u7ad9\",\"content\":\"\\u9646\\u9646\\u4fa0\\u4f60\\u597d\\uff0c\\u4f60\\u5df2\\u7ecf\\u6210\\u4e3aParaParty \\u5f00\\u53d1\\u7ad9 \\u7684\\u666e\\u901a\\u4f1a\\u5458 \\uff0c\\u8bf7\\u4f60\\u5728\\u53d1\\u8868\\u8a00\\u8bba\\u65f6\\uff0c\\u9075\\u5b88\\u5f53\\u5730\\u6cd5\\u5f8b\\u6cd5\\u89c4\\u3002\\u795d\\u4f60\\u5728\\u8fd9\\u91cc\\u73a9\\u7684\\u6109\\u5feb\\u3002\",\"raw\":{\"tpl_id\":1}}', NULL, '2020-11-29 18:41:59', '2020-11-29 18:41:59');
INSERT INTO `notifications` VALUES (5, 'liked', 'App\\Models\\User', 1, '{\"user_id\":5,\"thread_id\":1,\"thread_username\":\"admin\",\"thread_title\":\"[\\u53d1\\u5e16] \\u6d4b\\u8bd5\\u5e16\",\"thread_created_at\":\"2020-08-16T12:04:22+08:00\",\"post_id\":1,\"post_content\":\"\",\"reply_post_id\":0,\"post_created_at\":\"2020-08-16T12:04:22+08:00\"}', '2020-12-05 15:36:03', '2020-11-29 19:02:44', '2020-12-05 15:36:03');
INSERT INTO `notifications` VALUES (6, 'liked', 'App\\Models\\User', 1, '{\"user_id\":5,\"thread_id\":1,\"thread_username\":\"admin\",\"thread_title\":\"[\\u53d1\\u5e16] \\u6d4b\\u8bd5\\u5e16\",\"thread_created_at\":\"2020-08-16T12:04:22+08:00\",\"post_id\":104,\"post_content\":\"\",\"reply_post_id\":0,\"post_created_at\":\"2020-08-16T13:38:29+08:00\"}', '2020-12-05 15:36:03', '2020-11-29 19:05:18', '2020-12-05 15:36:03');
INSERT INTO `notifications` VALUES (7, 'liked', 'App\\Models\\User', 1, '{\"user_id\":5,\"thread_id\":1,\"thread_username\":\"admin\",\"thread_title\":\"[\\u53d1\\u5e16] \\u6d4b\\u8bd5\\u5e16\",\"thread_created_at\":\"2020-08-16T12:04:22+08:00\",\"post_id\":1,\"post_content\":\"\",\"reply_post_id\":0,\"post_created_at\":\"2020-08-16T12:04:22+08:00\"}', '2020-12-05 15:36:03', '2020-11-29 19:23:45', '2020-12-05 15:36:03');
INSERT INTO `notifications` VALUES (8, 'liked', 'App\\Models\\User', 1, '{\"user_id\":5,\"thread_id\":1,\"thread_username\":\"admin\",\"thread_title\":\"[\\u53d1\\u5e16] \\u6d4b\\u8bd5\\u5e16\",\"thread_created_at\":\"2020-08-16T12:04:22+08:00\",\"post_id\":1,\"post_content\":\"\",\"reply_post_id\":0,\"post_created_at\":\"2020-08-16T12:04:22+08:00\"}', '2020-12-05 15:36:03', '2020-11-29 19:34:58', '2020-12-05 15:36:03');
INSERT INTO `notifications` VALUES (9, 'liked', 'App\\Models\\User', 1, '{\"user_id\":5,\"thread_id\":1,\"thread_username\":\"admin\",\"thread_title\":\"[\\u53d1\\u5e16] \\u6d4b\\u8bd5\\u5e16\",\"thread_created_at\":\"2020-08-16T12:04:22+08:00\",\"post_id\":104,\"post_content\":\"\",\"reply_post_id\":0,\"post_created_at\":\"2020-08-16T13:38:29+08:00\"}', '2020-12-05 15:36:03', '2020-11-29 19:35:41', '2020-12-05 15:36:03');
INSERT INTO `notifications` VALUES (10, 'liked', 'App\\Models\\User', 1, '{\"user_id\":5,\"thread_id\":1,\"thread_username\":\"admin\",\"thread_title\":\"[\\u53d1\\u5e16] \\u6d4b\\u8bd5\\u5e16\",\"thread_created_at\":\"2020-08-16T12:04:22+08:00\",\"post_id\":1,\"post_content\":\"\",\"reply_post_id\":0,\"post_created_at\":\"2020-08-16T12:04:22+08:00\"}', '2020-12-05 15:36:03', '2020-11-29 19:40:46', '2020-12-05 15:36:03');
INSERT INTO `notifications` VALUES (11, 'liked', 'App\\Models\\User', 1, '{\"user_id\":5,\"thread_id\":1,\"thread_username\":\"admin\",\"thread_title\":\"[\\u53d1\\u5e16] \\u6d4b\\u8bd5\\u5e16\",\"thread_created_at\":\"2020-08-16T12:04:22+08:00\",\"post_id\":104,\"post_content\":\"\",\"reply_post_id\":0,\"post_created_at\":\"2020-08-16T13:38:29+08:00\"}', '2020-12-05 15:36:03', '2020-11-29 19:42:51', '2020-12-05 15:36:03');
INSERT INTO `notifications` VALUES (12, 'liked', 'App\\Models\\User', 1, '{\"user_id\":5,\"thread_id\":1,\"thread_username\":\"admin\",\"thread_title\":\"[\\u53d1\\u5e16] \\u6d4b\\u8bd5\\u5e16\",\"thread_created_at\":\"2020-08-16T12:04:22+08:00\",\"post_id\":1,\"post_content\":\"\",\"reply_post_id\":0,\"post_created_at\":\"2020-08-16T12:04:22+08:00\"}', '2020-12-05 15:36:03', '2020-11-29 19:45:21', '2020-12-05 15:36:03');
INSERT INTO `notifications` VALUES (13, 'liked', 'App\\Models\\User', 1, '{\"user_id\":5,\"thread_id\":1,\"thread_username\":\"admin\",\"thread_title\":\"[\\u53d1\\u5e16] \\u6d4b\\u8bd5\\u5e16\",\"thread_created_at\":\"2020-08-16T12:04:22+08:00\",\"post_id\":105,\"post_content\":\"\",\"reply_post_id\":0,\"post_created_at\":\"2020-08-16T13:40:21+08:00\"}', '2020-12-05 15:36:03', '2020-11-29 19:49:19', '2020-12-05 15:36:03');
INSERT INTO `notifications` VALUES (14, 'liked', 'App\\Models\\User', 1, '{\"user_id\":5,\"thread_id\":1,\"thread_username\":\"admin\",\"thread_title\":\"[\\u53d1\\u5e16] \\u6d4b\\u8bd5\\u5e16\",\"thread_created_at\":\"2020-08-16T12:04:22+08:00\",\"post_id\":105,\"post_content\":\"\",\"reply_post_id\":0,\"post_created_at\":\"2020-08-16T13:40:21+08:00\"}', '2020-12-05 15:36:03', '2020-11-29 19:53:17', '2020-12-05 15:36:03');
INSERT INTO `notifications` VALUES (15, 'liked', 'App\\Models\\User', 1, '{\"user_id\":5,\"thread_id\":1,\"thread_username\":\"admin\",\"thread_title\":\"[\\u53d1\\u5e16] \\u6d4b\\u8bd5\\u5e16\",\"thread_created_at\":\"2020-08-16T12:04:22+08:00\",\"post_id\":104,\"post_content\":\"\",\"reply_post_id\":0,\"post_created_at\":\"2020-08-16T13:38:29+08:00\"}', '2020-12-05 15:36:03', '2020-11-29 19:57:24', '2020-12-05 15:36:03');
INSERT INTO `notifications` VALUES (16, 'liked', 'App\\Models\\User', 1, '{\"user_id\":5,\"thread_id\":1,\"thread_username\":\"admin\",\"thread_title\":\"[\\u53d1\\u5e16] \\u6d4b\\u8bd5\\u5e16\",\"thread_created_at\":\"2020-08-16T12:04:22+08:00\",\"post_id\":105,\"post_content\":\"\",\"reply_post_id\":0,\"post_created_at\":\"2020-08-16T13:40:21+08:00\"}', '2020-12-05 15:36:03', '2020-11-29 19:59:04', '2020-12-05 15:36:03');
INSERT INTO `notifications` VALUES (17, 'liked', 'App\\Models\\User', 1, '{\"user_id\":5,\"thread_id\":1,\"thread_username\":\"admin\",\"thread_title\":\"[\\u53d1\\u5e16] \\u6d4b\\u8bd5\\u5e16\",\"thread_created_at\":\"2020-08-16T12:04:22+08:00\",\"post_id\":104,\"post_content\":\"\",\"reply_post_id\":0,\"post_created_at\":\"2020-08-16T13:38:29+08:00\"}', '2020-12-05 15:36:03', '2020-11-29 20:03:59', '2020-12-05 15:36:03');
INSERT INTO `notifications` VALUES (18, 'liked', 'App\\Models\\User', 1, '{\"user_id\":5,\"thread_id\":1,\"thread_username\":\"admin\",\"thread_title\":\"[\\u53d1\\u5e16] \\u6d4b\\u8bd5\\u5e16\",\"thread_created_at\":\"2020-08-16T12:04:22+08:00\",\"post_id\":104,\"post_content\":\"\",\"reply_post_id\":0,\"post_created_at\":\"2020-08-16T13:38:29+08:00\"}', '2020-12-05 15:36:03', '2020-11-29 20:04:25', '2020-12-05 15:36:03');
INSERT INTO `notifications` VALUES (19, 'liked', 'App\\Models\\User', 1, '{\"user_id\":5,\"thread_id\":1,\"thread_username\":\"admin\",\"thread_title\":\"[\\u53d1\\u5e16] \\u6d4b\\u8bd5\\u5e16\",\"thread_created_at\":\"2020-08-16T12:04:22+08:00\",\"post_id\":104,\"post_content\":\"\",\"reply_post_id\":0,\"post_created_at\":\"2020-08-16T13:38:29+08:00\"}', '2020-12-05 15:36:03', '2020-11-29 20:04:46', '2020-12-05 15:36:03');
INSERT INTO `notifications` VALUES (20, 'liked', 'App\\Models\\User', 1, '{\"user_id\":5,\"thread_id\":1,\"thread_username\":\"admin\",\"thread_title\":\"[\\u53d1\\u5e16] \\u6d4b\\u8bd5\\u5e16\",\"thread_created_at\":\"2020-08-16T12:04:22+08:00\",\"post_id\":104,\"post_content\":\"\",\"reply_post_id\":0,\"post_created_at\":\"2020-08-16T13:38:29+08:00\"}', '2020-12-05 15:36:03', '2020-11-29 20:07:44', '2020-12-05 15:36:03');
INSERT INTO `notifications` VALUES (21, 'liked', 'App\\Models\\User', 1, '{\"user_id\":5,\"thread_id\":1,\"thread_username\":\"admin\",\"thread_title\":\"[\\u53d1\\u5e16] \\u6d4b\\u8bd5\\u5e16\",\"thread_created_at\":\"2020-08-16T12:04:22+08:00\",\"post_id\":104,\"post_content\":\"\",\"reply_post_id\":0,\"post_created_at\":\"2020-08-16T13:38:29+08:00\"}', '2020-12-05 15:36:03', '2020-11-29 20:10:06', '2020-12-05 15:36:03');
INSERT INTO `notifications` VALUES (22, 'liked', 'App\\Models\\User', 1, '{\"user_id\":5,\"thread_id\":1,\"thread_username\":\"admin\",\"thread_title\":\"[\\u53d1\\u5e16] \\u6d4b\\u8bd5\\u5e16\",\"thread_created_at\":\"2020-08-16T12:04:22+08:00\",\"post_id\":1,\"post_content\":\"\",\"reply_post_id\":0,\"post_created_at\":\"2020-08-16T12:04:22+08:00\"}', '2020-12-05 15:36:03', '2020-11-29 20:12:10', '2020-12-05 15:36:03');
INSERT INTO `notifications` VALUES (23, 'liked', 'App\\Models\\User', 1, '{\"user_id\":5,\"thread_id\":1,\"thread_username\":\"admin\",\"thread_title\":\"[\\u53d1\\u5e16] \\u6d4b\\u8bd5\\u5e16\",\"thread_created_at\":\"2020-08-16T12:04:22+08:00\",\"post_id\":1,\"post_content\":\"\",\"reply_post_id\":0,\"post_created_at\":\"2020-08-16T12:04:22+08:00\"}', '2020-12-05 15:36:03', '2020-11-29 20:13:02', '2020-12-05 15:36:03');
INSERT INTO `notifications` VALUES (24, 'liked', 'App\\Models\\User', 1, '{\"user_id\":5,\"thread_id\":1,\"thread_username\":\"admin\",\"thread_title\":\"[\\u53d1\\u5e16] \\u6d4b\\u8bd5\\u5e16\",\"thread_created_at\":\"2020-08-16T12:04:22+08:00\",\"post_id\":105,\"post_content\":\"\",\"reply_post_id\":0,\"post_created_at\":\"2020-08-16T13:40:21+08:00\"}', '2020-12-05 15:36:03', '2020-11-29 20:15:04', '2020-12-05 15:36:03');
INSERT INTO `notifications` VALUES (25, 'liked', 'App\\Models\\User', 1, '{\"user_id\":5,\"thread_id\":1,\"thread_username\":\"admin\",\"thread_title\":\"[\\u53d1\\u5e16] \\u6d4b\\u8bd5\\u5e16\",\"thread_created_at\":\"2020-08-16T12:04:22+08:00\",\"post_id\":104,\"post_content\":\"\",\"reply_post_id\":0,\"post_created_at\":\"2020-08-16T13:38:29+08:00\"}', '2020-12-05 15:36:03', '2020-11-29 20:15:12', '2020-12-05 15:36:03');
INSERT INTO `notifications` VALUES (26, 'liked', 'App\\Models\\User', 1, '{\"user_id\":5,\"thread_id\":1,\"thread_username\":\"admin\",\"thread_title\":\"[\\u53d1\\u5e16] \\u6d4b\\u8bd5\\u5e16\",\"thread_created_at\":\"2020-08-16T12:04:22+08:00\",\"post_id\":1,\"post_content\":\"\",\"reply_post_id\":0,\"post_created_at\":\"2020-08-16T12:04:22+08:00\"}', '2020-12-05 15:36:03', '2020-11-29 21:30:30', '2020-12-05 15:36:03');
INSERT INTO `notifications` VALUES (27, 'liked', 'App\\Models\\User', 1, '{\"user_id\":5,\"thread_id\":1,\"thread_username\":\"admin\",\"thread_title\":\"[\\u53d1\\u5e16] \\u6d4b\\u8bd5\\u5e16\",\"thread_created_at\":\"2020-08-16T12:04:22+08:00\",\"post_id\":104,\"post_content\":\"\",\"reply_post_id\":0,\"post_created_at\":\"2020-08-16T13:38:29+08:00\"}', '2020-12-05 15:36:03', '2020-11-29 21:30:39', '2020-12-05 15:36:03');
INSERT INTO `notifications` VALUES (28, 'liked', 'App\\Models\\User', 1, '{\"user_id\":5,\"thread_id\":1,\"thread_username\":\"admin\",\"thread_title\":\"[\\u53d1\\u5e16] \\u6d4b\\u8bd5\\u5e16\",\"thread_created_at\":\"2020-08-16T12:04:22+08:00\",\"post_id\":104,\"post_content\":\"\",\"reply_post_id\":0,\"post_created_at\":\"2020-08-16T13:38:29+08:00\"}', '2020-12-05 15:36:03', '2020-11-29 21:31:12', '2020-12-05 15:36:03');
INSERT INTO `notifications` VALUES (29, 'liked', 'App\\Models\\User', 1, '{\"user_id\":5,\"thread_id\":1,\"thread_username\":\"admin\",\"thread_title\":\"[\\u53d1\\u5e16] \\u6d4b\\u8bd5\\u5e16\",\"thread_created_at\":\"2020-08-16T12:04:22+08:00\",\"post_id\":105,\"post_content\":\"\",\"reply_post_id\":0,\"post_created_at\":\"2020-08-16T13:40:21+08:00\"}', '2020-12-05 15:36:03', '2020-11-29 21:34:01', '2020-12-05 15:36:03');
INSERT INTO `notifications` VALUES (30, 'liked', 'App\\Models\\User', 1, '{\"user_id\":5,\"thread_id\":1,\"thread_username\":\"admin\",\"thread_title\":\"[\\u53d1\\u5e16] \\u6d4b\\u8bd5\\u5e16\",\"thread_created_at\":\"2020-08-16T12:04:22+08:00\",\"post_id\":105,\"post_content\":\"\",\"reply_post_id\":0,\"post_created_at\":\"2020-08-16T13:40:21+08:00\"}', '2020-12-05 15:36:03', '2020-11-29 21:34:13', '2020-12-05 15:36:03');
INSERT INTO `notifications` VALUES (31, 'liked', 'App\\Models\\User', 1, '{\"user_id\":5,\"thread_id\":1,\"thread_username\":\"admin\",\"thread_title\":\"[\\u53d1\\u5e16] \\u6d4b\\u8bd5\\u5e16\",\"thread_created_at\":\"2020-08-16T12:04:22+08:00\",\"post_id\":105,\"post_content\":\"\",\"reply_post_id\":0,\"post_created_at\":\"2020-08-16T13:40:21+08:00\"}', '2020-12-05 15:36:03', '2020-11-29 21:35:53', '2020-12-05 15:36:03');
INSERT INTO `notifications` VALUES (32, 'system', 'App\\Models\\User', 6, '{\"title\":\"\\u6b22\\u8fce\\u52a0\\u5165ParaParty \\u5f00\\u53d1\\u7ad9\",\"content\":\"yorkin\\u4f60\\u597d\\uff0c\\u4f60\\u5df2\\u7ecf\\u6210\\u4e3aParaParty \\u5f00\\u53d1\\u7ad9 \\u7684\\u666e\\u901a\\u4f1a\\u5458 \\uff0c\\u8bf7\\u4f60\\u5728\\u53d1\\u8868\\u8a00\\u8bba\\u65f6\\uff0c\\u9075\\u5b88\\u5f53\\u5730\\u6cd5\\u5f8b\\u6cd5\\u89c4\\u3002\\u795d\\u4f60\\u5728\\u8fd9\\u91cc\\u73a9\\u7684\\u6109\\u5feb\\u3002\",\"raw\":{\"tpl_id\":1}}', NULL, '2020-11-30 21:50:25', '2020-11-30 21:50:25');
INSERT INTO `notifications` VALUES (33, 'system', 'App\\Models\\User', 7, '{\"title\":\"\\u6b22\\u8fce\\u52a0\\u5165ParaParty \\u5f00\\u53d1\\u7ad9\",\"content\":\"tyty\\u4f60\\u597d\\uff0c\\u4f60\\u5df2\\u7ecf\\u6210\\u4e3aParaParty \\u5f00\\u53d1\\u7ad9 \\u7684\\u666e\\u901a\\u4f1a\\u5458 \\uff0c\\u8bf7\\u4f60\\u5728\\u53d1\\u8868\\u8a00\\u8bba\\u65f6\\uff0c\\u9075\\u5b88\\u5f53\\u5730\\u6cd5\\u5f8b\\u6cd5\\u89c4\\u3002\\u795d\\u4f60\\u5728\\u8fd9\\u91cc\\u73a9\\u7684\\u6109\\u5feb\\u3002\",\"raw\":{\"tpl_id\":1}}', NULL, '2020-12-03 23:05:21', '2020-12-03 23:05:21');
INSERT INTO `notifications` VALUES (34, 'liked', 'App\\Models\\User', 1, '{\"user_id\":5,\"thread_id\":4,\"thread_username\":\"admin\",\"thread_title\":\"[\\u6d4b\\u8bd5][LaTeX] LaTeX \\u6d4b\\u8bd5\",\"thread_created_at\":\"2020-11-24T22:10:34+08:00\",\"post_id\":107,\"post_content\":\"\",\"reply_post_id\":0,\"post_created_at\":\"2020-11-24T22:10:34+08:00\"}', '2020-12-05 15:36:03', '2020-12-04 15:40:56', '2020-12-05 15:36:03');
INSERT INTO `notifications` VALUES (35, 'system', 'App\\Models\\User', 8, '{\"title\":\"\\u6b22\\u8fce\\u52a0\\u5165ParaParty \\u5f00\\u53d1\\u7ad9\",\"content\":\"Eric_Lian\\u4f60\\u597d\\uff0c\\u4f60\\u5df2\\u7ecf\\u6210\\u4e3aParaParty \\u5f00\\u53d1\\u7ad9 \\u7684\\u666e\\u901a\\u4f1a\\u5458 \\uff0c\\u8bf7\\u4f60\\u5728\\u53d1\\u8868\\u8a00\\u8bba\\u65f6\\uff0c\\u9075\\u5b88\\u5f53\\u5730\\u6cd5\\u5f8b\\u6cd5\\u89c4\\u3002\\u795d\\u4f60\\u5728\\u8fd9\\u91cc\\u73a9\\u7684\\u6109\\u5feb\\u3002\",\"raw\":{\"tpl_id\":1}}', NULL, '2020-12-05 21:29:15', '2020-12-05 21:29:15');
INSERT INTO `notifications` VALUES (36, 'system', 'App\\Models\\User', 9, '{\"title\":\"\\u6b22\\u8fce\\u52a0\\u5165ParaParty \\u5f00\\u53d1\\u7ad9\",\"content\":\"xiye\\u4f60\\u597d\\uff0c\\u4f60\\u5df2\\u7ecf\\u6210\\u4e3aParaParty \\u5f00\\u53d1\\u7ad9 \\u7684\\u666e\\u901a\\u4f1a\\u5458 \\uff0c\\u8bf7\\u4f60\\u5728\\u53d1\\u8868\\u8a00\\u8bba\\u65f6\\uff0c\\u9075\\u5b88\\u5f53\\u5730\\u6cd5\\u5f8b\\u6cd5\\u89c4\\u3002\\u795d\\u4f60\\u5728\\u8fd9\\u91cc\\u73a9\\u7684\\u6109\\u5feb\\u3002\",\"raw\":{\"tpl_id\":1}}', NULL, '2020-12-07 11:24:46', '2020-12-07 11:24:46');
INSERT INTO `notifications` VALUES (37, 'system', 'App\\Models\\User', 10, '{\"title\":\"\\u6b22\\u8fce\\u52a0\\u5165ParaParty \\u5f00\\u53d1\\u7ad9\",\"content\":\"Mozifei\\u4f60\\u597d\\uff0c\\u4f60\\u5df2\\u7ecf\\u6210\\u4e3aParaParty \\u5f00\\u53d1\\u7ad9 \\u7684\\u666e\\u901a\\u4f1a\\u5458 \\uff0c\\u8bf7\\u4f60\\u5728\\u53d1\\u8868\\u8a00\\u8bba\\u65f6\\uff0c\\u9075\\u5b88\\u5f53\\u5730\\u6cd5\\u5f8b\\u6cd5\\u89c4\\u3002\\u795d\\u4f60\\u5728\\u8fd9\\u91cc\\u73a9\\u7684\\u6109\\u5feb\\u3002\",\"raw\":{\"tpl_id\":1}}', NULL, '2020-12-07 12:02:59', '2020-12-07 12:02:59');
INSERT INTO `notifications` VALUES (38, 'replied', 'App\\Models\\User', 1, '{\"user_id\":10,\"thread_id\":6,\"thread_username\":\"admin\",\"thread_title\":\"[\\u6d4b\\u8bd5][\\u6587\\u4ef6\\u5206\\u4eab] \\u6587\\u4ef6\\u5206\\u4eab\\u6d4b\\u8bd5\",\"thread_created_at\":\"2020-12-05T14:23:41+08:00\",\"post_id\":112,\"post_content\":\"<p>\\u6211\\u6765\\u6d4b\\u8bd5\\u4e00\\u4e0b<\\/p>\",\"reply_post_id\":0,\"post_created_at\":\"2020-12-07T12:20:25+08:00\"}', NULL, '2020-12-07 12:20:26', '2020-12-07 12:20:26');
INSERT INTO `notifications` VALUES (39, 'replied', 'App\\Models\\User', 1, '{\"user_id\":10,\"thread_id\":6,\"thread_username\":\"admin\",\"thread_title\":\"[\\u6d4b\\u8bd5][\\u6587\\u4ef6\\u5206\\u4eab] \\u6587\\u4ef6\\u5206\\u4eab\\u6d4b\\u8bd5\",\"thread_created_at\":\"2020-12-05T14:23:41+08:00\",\"post_id\":113,\"post_content\":\"<p>\\u6d4b\\u8bd5<\\/p>\",\"reply_post_id\":0,\"post_created_at\":\"2020-12-07T12:20:54+08:00\"}', NULL, '2020-12-07 12:20:54', '2020-12-07 12:20:54');
INSERT INTO `notifications` VALUES (40, 'liked', 'App\\Models\\User', 1, '{\"user_id\":10,\"thread_id\":3,\"thread_username\":\"admin\",\"thread_title\":\"[\\u6d4b\\u8bd5] \\u5e26\\u56fe\\u53d1\\u5e16 \",\"thread_created_at\":\"2020-08-16T19:53:33+08:00\",\"post_id\":106,\"post_content\":\"\",\"reply_post_id\":0,\"post_created_at\":\"2020-08-16T19:53:33+08:00\"}', NULL, '2020-12-07 23:18:15', '2020-12-07 23:18:15');
INSERT INTO `notifications` VALUES (41, 'liked', 'App\\Models\\User', 1, '{\"user_id\":10,\"thread_id\":3,\"thread_username\":\"admin\",\"thread_title\":\"[\\u6d4b\\u8bd5] \\u5e26\\u56fe\\u53d1\\u5e16 \",\"thread_created_at\":\"2020-08-16T19:53:33+08:00\",\"post_id\":106,\"post_content\":\"\",\"reply_post_id\":0,\"post_created_at\":\"2020-08-16T19:53:33+08:00\"}', NULL, '2020-12-07 23:18:18', '2020-12-07 23:18:18');
INSERT INTO `notifications` VALUES (42, 'liked', 'App\\Models\\User', 1, '{\"user_id\":10,\"thread_id\":3,\"thread_username\":\"admin\",\"thread_title\":\"[\\u6d4b\\u8bd5] \\u5e26\\u56fe\\u53d1\\u5e16 \",\"thread_created_at\":\"2020-08-16T19:53:33+08:00\",\"post_id\":106,\"post_content\":\"\",\"reply_post_id\":0,\"post_created_at\":\"2020-08-16T19:53:33+08:00\"}', NULL, '2020-12-07 23:18:24', '2020-12-07 23:18:24');
INSERT INTO `notifications` VALUES (43, 'liked', 'App\\Models\\User', 1, '{\"user_id\":10,\"thread_id\":3,\"thread_username\":\"admin\",\"thread_title\":\"[\\u6d4b\\u8bd5] \\u5e26\\u56fe\\u53d1\\u5e16 \",\"thread_created_at\":\"2020-08-16T19:53:33+08:00\",\"post_id\":106,\"post_content\":\"\",\"reply_post_id\":0,\"post_created_at\":\"2020-08-16T19:53:33+08:00\"}', NULL, '2020-12-07 23:18:42', '2020-12-07 23:18:42');
INSERT INTO `notifications` VALUES (44, 'replied', 'App\\Models\\User', 4, '{\"user_id\":9,\"thread_id\":8,\"thread_username\":\"A_Salty_Fish\",\"thread_title\":\"Java\\u865a\\u62df\\u673a\\u89c4\\u8303\\u4e2d\\u6587\\u7248\",\"thread_created_at\":\"2020-12-08T14:24:14+08:00\",\"post_id\":120,\"post_content\":\"<p>\\u68d2\\u68d2\\u54d2\\uff01<\\/p>\",\"reply_post_id\":0,\"post_created_at\":\"2020-12-08T15:07:52+08:00\"}', NULL, '2020-12-08 15:07:52', '2020-12-08 15:07:52');
INSERT INTO `notifications` VALUES (45, 'replied', 'App\\Models\\User', 10, '{\"user_id\":9,\"thread_id\":7,\"thread_username\":\"Mozifei\",\"thread_title\":\"\\u51b2\\u9e2d\",\"thread_created_at\":\"2020-12-08T11:33:18+08:00\",\"post_id\":121,\"post_content\":\"<p>#\\u51b2\\u9e2d<\\/p>\",\"reply_post_id\":0,\"post_created_at\":\"2020-12-08T15:10:13+08:00\"}', NULL, '2020-12-08 15:10:14', '2020-12-08 15:10:14');
INSERT INTO `notifications` VALUES (46, 'replied', 'App\\Models\\User', 10, '{\"user_id\":9,\"thread_id\":7,\"thread_username\":\"Mozifei\",\"thread_title\":\"\\u51b2\\u9e2d\",\"thread_created_at\":\"2020-12-08T11:33:18+08:00\",\"post_id\":122,\"post_content\":\"<p>\\u555b\\u555b\\u55b3\\u55b3c<\\/p>\",\"reply_post_id\":0,\"post_created_at\":\"2020-12-08T15:10:35+08:00\"}', NULL, '2020-12-08 15:10:35', '2020-12-08 15:10:35');
INSERT INTO `notifications` VALUES (47, 'replied', 'App\\Models\\User', 10, '{\"user_id\":9,\"thread_id\":7,\"thread_username\":\"Mozifei\",\"thread_title\":\"\\u51b2\\u9e2d\",\"thread_created_at\":\"2020-12-08T11:33:18+08:00\",\"post_id\":123,\"post_content\":\"<p>\\u866b\\u513f<\\/p>\",\"reply_post_id\":0,\"post_created_at\":\"2020-12-08T15:10:41+08:00\"}', NULL, '2020-12-08 15:10:41', '2020-12-08 15:10:41');
INSERT INTO `notifications` VALUES (48, 'replied', 'App\\Models\\User', 1, '{\"user_id\":9,\"thread_id\":4,\"thread_username\":\"admin\",\"thread_title\":\"[\\u6d4b\\u8bd5][LaTeX] LaTeX \\u6d4b\\u8bd5\",\"thread_created_at\":\"2020-11-24T22:10:34+08:00\",\"post_id\":124,\"post_content\":\"<p>\\u51b2\\u554a<\\/p>\",\"reply_post_id\":0,\"post_created_at\":\"2020-12-08T15:11:10+08:00\"}', NULL, '2020-12-08 15:11:10', '2020-12-08 15:11:10');
INSERT INTO `notifications` VALUES (49, 'replied', 'App\\Models\\User', 1, '{\"user_id\":9,\"thread_id\":4,\"thread_username\":\"admin\",\"thread_title\":\"[\\u6d4b\\u8bd5][LaTeX] LaTeX \\u6d4b\\u8bd5\",\"thread_created_at\":\"2020-11-24T22:10:34+08:00\",\"post_id\":125,\"post_content\":\"<p>\\u51b2\\u554a<\\/p>\",\"reply_post_id\":0,\"post_created_at\":\"2020-12-08T15:11:40+08:00\"}', NULL, '2020-12-08 15:11:40', '2020-12-08 15:11:40');
INSERT INTO `notifications` VALUES (50, 'system', 'App\\Models\\User', 11, '{\"title\":\"\\u6b22\\u8fce\\u52a0\\u5165ParaParty \\u5f00\\u53d1\\u7ad9\",\"content\":\"Eric\\u4f60\\u597d\\uff0c\\u4f60\\u5df2\\u7ecf\\u6210\\u4e3aParaParty \\u5f00\\u53d1\\u7ad9 \\u7684\\u666e\\u901a\\u4f1a\\u5458 \\uff0c\\u8bf7\\u4f60\\u5728\\u53d1\\u8868\\u8a00\\u8bba\\u65f6\\uff0c\\u9075\\u5b88\\u5f53\\u5730\\u6cd5\\u5f8b\\u6cd5\\u89c4\\u3002\\u795d\\u4f60\\u5728\\u8fd9\\u91cc\\u73a9\\u7684\\u6109\\u5feb\\u3002\",\"raw\":{\"tpl_id\":1}}', NULL, '2020-12-08 15:13:06', '2020-12-08 15:13:06');
INSERT INTO `notifications` VALUES (51, 'system', 'App\\Models\\User', 12, '{\"title\":\"\\u6b22\\u8fce\\u52a0\\u5165ParaParty \\u5f00\\u53d1\\u7ad9\",\"content\":\"HTTP404\\u4f60\\u597d\\uff0c\\u4f60\\u5df2\\u7ecf\\u6210\\u4e3aParaParty \\u5f00\\u53d1\\u7ad9 \\u7684\\u666e\\u901a\\u4f1a\\u5458 \\uff0c\\u8bf7\\u4f60\\u5728\\u53d1\\u8868\\u8a00\\u8bba\\u65f6\\uff0c\\u9075\\u5b88\\u5f53\\u5730\\u6cd5\\u5f8b\\u6cd5\\u89c4\\u3002\\u795d\\u4f60\\u5728\\u8fd9\\u91cc\\u73a9\\u7684\\u6109\\u5feb\\u3002\",\"raw\":{\"tpl_id\":1}}', NULL, '2020-12-08 15:20:34', '2020-12-08 15:20:34');
INSERT INTO `notifications` VALUES (52, 'system', 'App\\Models\\User', 13, '{\"title\":\"\\u6b22\\u8fce\\u52a0\\u5165ParaParty \\u5f00\\u53d1\\u7ad9\",\"content\":\"wuziqiu\\u4f60\\u597d\\uff0c\\u4f60\\u5df2\\u7ecf\\u6210\\u4e3aParaParty \\u5f00\\u53d1\\u7ad9 \\u7684\\u666e\\u901a\\u4f1a\\u5458 \\uff0c\\u8bf7\\u4f60\\u5728\\u53d1\\u8868\\u8a00\\u8bba\\u65f6\\uff0c\\u9075\\u5b88\\u5f53\\u5730\\u6cd5\\u5f8b\\u6cd5\\u89c4\\u3002\\u795d\\u4f60\\u5728\\u8fd9\\u91cc\\u73a9\\u7684\\u6109\\u5feb\\u3002\",\"raw\":{\"tpl_id\":1}}', NULL, '2020-12-08 15:23:26', '2020-12-08 15:23:26');
INSERT INTO `notifications` VALUES (53, 'system', 'App\\Models\\User', 14, '{\"title\":\"\\u6b22\\u8fce\\u52a0\\u5165ParaParty \\u5f00\\u53d1\\u7ad9\",\"content\":\"11\\u4f60\\u597d\\uff0c\\u4f60\\u5df2\\u7ecf\\u6210\\u4e3aParaParty \\u5f00\\u53d1\\u7ad9 \\u7684\\u666e\\u901a\\u4f1a\\u5458 \\uff0c\\u8bf7\\u4f60\\u5728\\u53d1\\u8868\\u8a00\\u8bba\\u65f6\\uff0c\\u9075\\u5b88\\u5f53\\u5730\\u6cd5\\u5f8b\\u6cd5\\u89c4\\u3002\\u795d\\u4f60\\u5728\\u8fd9\\u91cc\\u73a9\\u7684\\u6109\\u5feb\\u3002\",\"raw\":{\"tpl_id\":1}}', NULL, '2020-12-08 15:28:35', '2020-12-08 15:28:35');
INSERT INTO `notifications` VALUES (54, 'liked', 'App\\Models\\User', 4, '{\"user_id\":12,\"thread_id\":8,\"thread_username\":\"A_Salty_Fish\",\"thread_title\":\"Java\\u865a\\u62df\\u673a\\u89c4\\u8303\\u4e2d\\u6587\\u7248\",\"thread_created_at\":\"2020-12-08T14:24:14+08:00\",\"post_id\":117,\"post_content\":\"\",\"reply_post_id\":0,\"post_created_at\":\"2020-12-08T14:24:14+08:00\"}', NULL, '2020-12-08 15:29:35', '2020-12-08 15:29:35');
INSERT INTO `notifications` VALUES (55, 'liked', 'App\\Models\\User', 1, '{\"user_id\":12,\"thread_id\":1,\"thread_username\":\"admin\",\"thread_title\":\"[\\u53d1\\u5e16] \\u6d4b\\u8bd5\\u5e16\",\"thread_created_at\":\"2020-08-16T12:04:22+08:00\",\"post_id\":1,\"post_content\":\"\",\"reply_post_id\":0,\"post_created_at\":\"2020-08-16T12:04:22+08:00\"}', NULL, '2020-12-08 15:32:05', '2020-12-08 15:32:05');
INSERT INTO `notifications` VALUES (56, 'system', 'App\\Models\\User', 15, '{\"title\":\"\\u6b22\\u8fce\\u52a0\\u5165ParaParty \\u5f00\\u53d1\\u7ad9\",\"content\":\"NRJ\\u4f60\\u597d\\uff0c\\u4f60\\u5df2\\u7ecf\\u6210\\u4e3aParaParty \\u5f00\\u53d1\\u7ad9 \\u7684\\u666e\\u901a\\u4f1a\\u5458 \\uff0c\\u8bf7\\u4f60\\u5728\\u53d1\\u8868\\u8a00\\u8bba\\u65f6\\uff0c\\u9075\\u5b88\\u5f53\\u5730\\u6cd5\\u5f8b\\u6cd5\\u89c4\\u3002\\u795d\\u4f60\\u5728\\u8fd9\\u91cc\\u73a9\\u7684\\u6109\\u5feb\\u3002\",\"raw\":{\"tpl_id\":1}}', NULL, '2020-12-08 15:35:40', '2020-12-08 15:35:40');
INSERT INTO `notifications` VALUES (57, 'system', 'App\\Models\\User', 16, '{\"title\":\"\\u6b22\\u8fce\\u52a0\\u5165ParaParty \\u5f00\\u53d1\\u7ad9\",\"content\":\"lpdink\\u4f60\\u597d\\uff0c\\u4f60\\u5df2\\u7ecf\\u6210\\u4e3aParaParty \\u5f00\\u53d1\\u7ad9 \\u7684\\u666e\\u901a\\u4f1a\\u5458 \\uff0c\\u8bf7\\u4f60\\u5728\\u53d1\\u8868\\u8a00\\u8bba\\u65f6\\uff0c\\u9075\\u5b88\\u5f53\\u5730\\u6cd5\\u5f8b\\u6cd5\\u89c4\\u3002\\u795d\\u4f60\\u5728\\u8fd9\\u91cc\\u73a9\\u7684\\u6109\\u5feb\\u3002\",\"raw\":{\"tpl_id\":1}}', NULL, '2020-12-08 15:41:03', '2020-12-08 15:41:03');
INSERT INTO `notifications` VALUES (58, 'liked', 'App\\Models\\User', 9, '{\"user_id\":16,\"thread_id\":7,\"thread_username\":\"Mozifei\",\"thread_title\":\"\\u51b2\\u9e2d\",\"thread_created_at\":\"2020-12-08T11:33:18+08:00\",\"post_id\":123,\"post_content\":\"\",\"reply_post_id\":0,\"post_created_at\":\"2020-12-08T15:10:41+08:00\"}', NULL, '2020-12-08 15:42:40', '2020-12-08 15:42:40');
INSERT INTO `notifications` VALUES (59, 'replied', 'App\\Models\\User', 9, '{\"user_id\":11,\"thread_id\":10,\"thread_username\":\"xiye\",\"thread_title\":\"\\u670d\\u521b\\u51b2\\u51b2\\u51b2\\uff01\",\"thread_created_at\":\"2020-12-08T15:48:25+08:00\",\"post_id\":127,\"post_content\":\"<p>\\u597d\\uff01\\u52a0\\u6cb9\\uff01<\\/p>\",\"reply_post_id\":0,\"post_created_at\":\"2020-12-08T15:57:22+08:00\"}', NULL, '2020-12-08 15:57:23', '2020-12-08 15:57:23');
INSERT INTO `notifications` VALUES (60, 'system', 'App\\Models\\User', 1, '{\"title\":\"\\u5185\\u5bb9\\u901a\\u77e5\",\"content\":\"admin\\u4f60\\u597d\\uff0c\\u4f60\\u53d1\\u5e03\\u7684\\u5185\\u5bb9 \\\"\\u8bbf\\u95ee\\u8bba\\u575b\\u540e\\u9876\\u90e8\\u4e3a\\u641c\\u7d22\\u6846\\u4e0e\\u83dc\\u5355\\uff0c\\u53f3\\u4e0a\\u89d2\\u4e3a\\u4e2a\\u4eba\\u4fe1\\u606f\\uff0c\\u5de6\\u4fa7\\u4e3a\\u901a\\u77e5\\u4e2d...\\\" \\u5df2\\u88ab\\u4fee\\u6539\",\"raw\":{\"id\":119,\"thread_id\":9,\"is_first\":false,\"tpl_id\":9}}', NULL, '2020-12-08 16:06:46', '2020-12-08 16:06:46');
INSERT INTO `notifications` VALUES (61, 'system', 'App\\Models\\User', 1, '{\"title\":\"\\u5185\\u5bb9\\u901a\\u77e5\",\"content\":\"admin\\u4f60\\u597d\\uff0c\\u4f60\\u53d1\\u5e03\\u7684\\u5185\\u5bb9 \\\"\\u8bbf\\u95ee\\u8bba\\u575b\\u540e\\u9876\\u90e8\\u4e3a\\u641c\\u7d22\\u6846\\u4e0e\\u83dc\\u5355\\uff0c\\u53f3\\u4e0a\\u89d2\\u4e3a\\u4e2a\\u4eba\\u4fe1\\u606f\\uff0c\\u5de6\\u4fa7\\u4e3a\\u901a\\u77e5\\u4e2d...\\\" \\u5df2\\u88ab\\u4fee\\u6539\",\"raw\":{\"id\":119,\"thread_id\":9,\"is_first\":false,\"tpl_id\":9}}', NULL, '2020-12-08 16:08:22', '2020-12-08 16:08:22');
INSERT INTO `notifications` VALUES (62, 'liked', 'App\\Models\\User', 4, '{\"user_id\":10,\"thread_id\":8,\"thread_username\":\"A_Salty_Fish\",\"thread_title\":\"Java\\u865a\\u62df\\u673a\\u89c4\\u8303\\u4e2d\\u6587\\u7248\",\"thread_created_at\":\"2020-12-08T14:24:14+08:00\",\"post_id\":117,\"post_content\":\"\",\"reply_post_id\":0,\"post_created_at\":\"2020-12-08T14:24:14+08:00\"}', NULL, '2020-12-08 16:19:50', '2020-12-08 16:19:50');
INSERT INTO `notifications` VALUES (63, 'replied', 'App\\Models\\User', 4, '{\"user_id\":10,\"thread_id\":8,\"thread_username\":\"A_Salty_Fish\",\"thread_title\":\"Java\\u865a\\u62df\\u673a\\u89c4\\u8303\\u4e2d\\u6587\\u7248\",\"thread_created_at\":\"2020-12-08T14:24:14+08:00\",\"post_id\":129,\"post_content\":\"<p>\\u6211\\u4e3a\\u4ec0\\u4e48\\u4e0d\\u80fd\\u4e0b\\u8f7d\\uff0c\\u545c\\u545c\\u545c\\u545c<br>\\n[size=xl][color=blue]\\u5783\\u573edzy\\uff0c\\u4f60\\u80af\\u5b9a\\u662f\\u5728\\u9488\\u5bf9\\u6211[\\/color][\\/size]<\\/p>\",\"reply_post_id\":0,\"post_created_at\":\"2020-12-08T16:20:30+08:00\"}', NULL, '2020-12-08 16:20:31', '2020-12-08 16:20:31');
INSERT INTO `notifications` VALUES (64, 'liked', 'App\\Models\\User', 9, '{\"user_id\":10,\"thread_id\":8,\"thread_username\":\"A_Salty_Fish\",\"thread_title\":\"Java\\u865a\\u62df\\u673a\\u89c4\\u8303\\u4e2d\\u6587\\u7248\",\"thread_created_at\":\"2020-12-08T14:24:14+08:00\",\"post_id\":120,\"post_content\":\"\",\"reply_post_id\":0,\"post_created_at\":\"2020-12-08T15:07:52+08:00\"}', NULL, '2020-12-08 16:20:55', '2020-12-08 16:20:55');
INSERT INTO `notifications` VALUES (65, 'replied', 'App\\Models\\User', 9, '{\"user_id\":5,\"thread_id\":10,\"thread_username\":\"xiye\",\"thread_title\":\"\\u670d\\u521b\\u51b2\\u51b2\\u51b2\\uff01\",\"thread_created_at\":\"2020-12-08T15:48:25+08:00\",\"post_id\":130,\"post_content\":\"<p>[black]\\u6211\\u5c31\\u770b\\u770b\\u56de\\u590d\\u8fd8\\u6709\\u6ca1\\u6709\\u7528[\\/black]<\\/p>\",\"reply_post_id\":\"127\",\"post_created_at\":\"2020-12-08T16:21:35+08:00\",\"reply_post_user_id\":11,\"reply_post_content\":\"<p>\\u597d\\uff01\\u52a0\\u6cb9\\uff01<\\/p>\",\"reply_post_created_at\":\"2020-12-08T15:57:22+08:00\"}', NULL, '2020-12-08 16:21:35', '2020-12-08 16:21:35');
INSERT INTO `notifications` VALUES (66, 'replied', 'App\\Models\\User', 11, '{\"user_id\":5,\"thread_id\":10,\"thread_username\":\"xiye\",\"thread_title\":\"\\u670d\\u521b\\u51b2\\u51b2\\u51b2\\uff01\",\"thread_created_at\":\"2020-12-08T15:48:25+08:00\",\"post_id\":130,\"post_content\":\"<p>[black]\\u6211\\u5c31\\u770b\\u770b\\u56de\\u590d\\u8fd8\\u6709\\u6ca1\\u6709\\u7528[\\/black]<\\/p>\",\"reply_post_id\":\"127\",\"post_created_at\":\"2020-12-08T16:21:35+08:00\",\"reply_post_user_id\":11,\"reply_post_content\":\"<p>\\u597d\\uff01\\u52a0\\u6cb9\\uff01<\\/p>\",\"reply_post_created_at\":\"2020-12-08T15:57:22+08:00\"}', NULL, '2020-12-08 16:21:35', '2020-12-08 16:21:35');
INSERT INTO `notifications` VALUES (67, 'replied', 'App\\Models\\User', 10, '{\"user_id\":5,\"thread_id\":7,\"thread_username\":\"Mozifei\",\"thread_title\":\"\\u51b2\\u9e2d\",\"thread_created_at\":\"2020-12-08T11:33:18+08:00\",\"post_id\":132,\"post_content\":\"<p>[size=l]Eric\\u7684[black]\\u91d1\\u7b8d\\u68d2[\\/black]\\u8981[size=xl]\\u5927[\\/size]\\u5c31[size=xl]\\u5927[\\/size]\\uff0c\\u8981[\\/size]\\u5c0f[size=l]\\u5c31[\\/size]\\u5c0f<\\/p>\",\"reply_post_id\":0,\"post_created_at\":\"2020-12-08T17:16:20+08:00\"}', NULL, '2020-12-08 17:16:20', '2020-12-08 17:16:20');
INSERT INTO `notifications` VALUES (68, 'replied', 'App\\Models\\User', 10, '{\"user_id\":1,\"thread_id\":7,\"thread_username\":\"Mozifei\",\"thread_title\":\"\\u51b2\\u9e2d\",\"thread_created_at\":\"2020-12-08T11:33:18+08:00\",\"post_id\":133,\"post_content\":\"<p>\\u56de\\u5e16\\u6d4b\\u8bd5<\\/p>\",\"reply_post_id\":0,\"post_created_at\":\"2020-12-08T17:18:59+08:00\"}', NULL, '2020-12-08 17:18:59', '2020-12-08 17:18:59');
INSERT INTO `notifications` VALUES (69, 'replied', 'App\\Models\\User', 10, '{\"user_id\":1,\"thread_id\":7,\"thread_username\":\"Mozifei\",\"thread_title\":\"\\u51b2\\u9e2d\",\"thread_created_at\":\"2020-12-08T11:33:18+08:00\",\"post_id\":134,\"post_content\":\"<p>\\u53c8\\u4e00\\u4e2a\\u56de\\u5e16\\u6d4b\\u8bd5<\\/p>\",\"reply_post_id\":0,\"post_created_at\":\"2020-12-08T17:32:14+08:00\"}', NULL, '2020-12-08 17:32:14', '2020-12-08 17:32:14');
INSERT INTO `notifications` VALUES (70, 'liked', 'App\\Models\\User', 10, '{\"user_id\":1,\"thread_id\":8,\"thread_username\":\"A_Salty_Fish\",\"thread_title\":\"Java\\u865a\\u62df\\u673a\\u89c4\\u8303\\u4e2d\\u6587\\u7248\",\"thread_created_at\":\"2020-12-08T14:24:14+08:00\",\"post_id\":129,\"post_content\":\"\",\"reply_post_id\":0,\"post_created_at\":\"2020-12-08T16:20:30+08:00\"}', NULL, '2020-12-08 18:00:33', '2020-12-08 18:00:33');
INSERT INTO `notifications` VALUES (71, 'system', 'App\\Models\\User', 1, '{\"title\":\"\\u5185\\u5bb9\\u901a\\u77e5\",\"content\":\"admin\\u4f60\\u597d\\uff0c\\u4f60\\u53d1\\u5e03\\u7684\\u5185\\u5bb9 \\\"\\u5728\\u8bba\\u575b\\u7684\\u641c\\u7d22\\u680f\\u65c1\\u8fb9\\u7684\\u83dc\\u5355\\u4e2d\\u53ef\\u4ee5\\u8fdb\\u5165[url=\\/files]\\u6211\\u7684\\u6587\\u4ef6[\\/url]...\\\" \\u5df2\\u88ab\\u4fee\\u6539\",\"raw\":{\"id\":131,\"thread_id\":9,\"is_first\":false,\"tpl_id\":9}}', NULL, '2020-12-08 18:00:48', '2020-12-08 18:00:48');
INSERT INTO `notifications` VALUES (72, 'liked', 'App\\Models\\User', 1, '{\"user_id\":9,\"thread_id\":9,\"thread_username\":\"admin\",\"thread_title\":\"[\\u5e2e\\u52a9] SourceLay \\u793e\\u533a\\u64cd\\u4f5c\\u6307\\u5357\",\"thread_created_at\":\"2020-12-08T14:38:31+08:00\",\"post_id\":131,\"post_content\":\"\",\"reply_post_id\":0,\"post_created_at\":\"2020-12-08T16:38:48+08:00\"}', NULL, '2020-12-08 19:36:01', '2020-12-08 19:36:01');
INSERT INTO `notifications` VALUES (73, 'system', 'App\\Models\\User', 17, '{\"title\":\"\\u6b22\\u8fce\\u52a0\\u5165ParaParty \\u5f00\\u53d1\\u7ad9\",\"content\":\"ccc\\u4f60\\u597d\\uff0c\\u4f60\\u5df2\\u7ecf\\u6210\\u4e3aParaParty \\u5f00\\u53d1\\u7ad9 \\u7684\\u666e\\u901a\\u4f1a\\u5458 \\uff0c\\u8bf7\\u4f60\\u5728\\u53d1\\u8868\\u8a00\\u8bba\\u65f6\\uff0c\\u9075\\u5b88\\u5f53\\u5730\\u6cd5\\u5f8b\\u6cd5\\u89c4\\u3002\\u795d\\u4f60\\u5728\\u8fd9\\u91cc\\u73a9\\u7684\\u6109\\u5feb\\u3002\",\"raw\":{\"tpl_id\":1}}', NULL, '2020-12-08 19:39:47', '2020-12-08 19:39:47');
INSERT INTO `notifications` VALUES (74, 'replied', 'App\\Models\\User', 10, '{\"user_id\":17,\"thread_id\":7,\"thread_username\":\"Mozifei\",\"thread_title\":\"\\u51b2\\u9e2d\",\"thread_created_at\":\"2020-12-08T11:33:18+08:00\",\"post_id\":136,\"post_content\":\"<p>\\u51b2\\u51b2\\u6765\\u51b2\\u4e86<\\/p>\",\"reply_post_id\":0,\"post_created_at\":\"2020-12-08T19:40:48+08:00\"}', NULL, '2020-12-08 19:40:48', '2020-12-08 19:40:48');
INSERT INTO `notifications` VALUES (75, 'replied', 'App\\Models\\User', 10, '{\"user_id\":9,\"thread_id\":7,\"thread_username\":\"Mozifei\",\"thread_title\":\"\\u51b2\\u9e2d\",\"thread_created_at\":\"2020-12-08T11:33:18+08:00\",\"post_id\":145,\"post_content\":\"<p>CCC\\u725bX\\uff01<\\/p>\",\"reply_post_id\":\"136\",\"post_created_at\":\"2020-12-08T21:47:38+08:00\",\"reply_post_user_id\":17,\"reply_post_content\":\"<p>\\u51b2\\u51b2\\u6765\\u51b2\\u4e86<\\/p>\",\"reply_post_created_at\":\"2020-12-08T19:40:48+08:00\"}', NULL, '2020-12-08 21:47:38', '2020-12-08 21:47:38');
INSERT INTO `notifications` VALUES (76, 'replied', 'App\\Models\\User', 17, '{\"user_id\":9,\"thread_id\":7,\"thread_username\":\"Mozifei\",\"thread_title\":\"\\u51b2\\u9e2d\",\"thread_created_at\":\"2020-12-08T11:33:18+08:00\",\"post_id\":145,\"post_content\":\"<p>CCC\\u725bX\\uff01<\\/p>\",\"reply_post_id\":\"136\",\"post_created_at\":\"2020-12-08T21:47:38+08:00\",\"reply_post_user_id\":17,\"reply_post_content\":\"<p>\\u51b2\\u51b2\\u6765\\u51b2\\u4e86<\\/p>\",\"reply_post_created_at\":\"2020-12-08T19:40:48+08:00\"}', NULL, '2020-12-08 21:47:39', '2020-12-08 21:47:39');
INSERT INTO `notifications` VALUES (77, 'liked', 'App\\Models\\User', 1, '{\"user_id\":10,\"thread_id\":9,\"thread_username\":\"admin\",\"thread_title\":\"[\\u5e2e\\u52a9] SourceLay \\u793e\\u533a\\u64cd\\u4f5c\\u6307\\u5357\",\"thread_created_at\":\"2020-12-08T14:38:31+08:00\",\"post_id\":131,\"post_content\":\"\",\"reply_post_id\":0,\"post_created_at\":\"2020-12-08T16:38:48+08:00\"}', NULL, '2020-12-09 09:47:35', '2020-12-09 09:47:35');
INSERT INTO `notifications` VALUES (78, 'replied', 'App\\Models\\User', 17, '{\"user_id\":10,\"thread_id\":7,\"thread_username\":\"Mozifei\",\"thread_title\":\"\\u51b2\\u9e2d\",\"thread_created_at\":\"2020-12-08T11:33:18+08:00\",\"post_id\":150,\"post_content\":\"<p>\\u6211\\u76f4\\u547c\\u5185\\u884c<\\/p>\",\"reply_post_id\":\"136\",\"post_created_at\":\"2020-12-09T09:52:21+08:00\",\"reply_post_user_id\":17,\"reply_post_content\":\"<p>\\u51b2\\u51b2\\u6765\\u51b2\\u4e86<\\/p>\",\"reply_post_created_at\":\"2020-12-08T19:40:48+08:00\"}', NULL, '2020-12-09 09:52:21', '2020-12-09 09:52:21');
INSERT INTO `notifications` VALUES (79, 'liked', 'App\\Models\\User', 4, '{\"user_id\":1,\"thread_id\":26,\"thread_username\":\"A_Salty_Fish\",\"thread_title\":\"[LeetCode] 300. \\u6700\\u957f\\u4e0a\\u5347\\u5b50\\u5e8f\\u5217\",\"thread_created_at\":\"2020-12-09T19:58:16+08:00\",\"post_id\":157,\"post_content\":\"\",\"reply_post_id\":0,\"post_created_at\":\"2020-12-09T19:58:16+08:00\"}', NULL, '2020-12-09 20:01:50', '2020-12-09 20:01:50');
INSERT INTO `notifications` VALUES (80, 'system', 'App\\Models\\User', 9, '{\"title\":\"\\u5185\\u5bb9\\u901a\\u77e5\",\"content\":\"xiye\\u4f60\\u597d\\uff0c\\u4f60\\u53d1\\u5e03\\u7684\\u5185\\u5bb9 \\\"[size=xl]\\u5bf9\\u79f0\\u77e9\\u9635[\\/size]\\n\\u524d\\u9762\\u6211\\u4eec\\u5b66\\u4e60\\u4e86\\u77e9\\u9635\\u7684\\u7279\\u5f81\\u503c\\u4e0e\\u7279\\u5f81\\u5411...\\\" \\u5df2\\u88ab\\u4fee\\u6539\",\"raw\":{\"id\":159,\"thread_id\":28,\"is_first\":true,\"tpl_id\":9}}', NULL, '2020-12-09 20:24:34', '2020-12-09 20:24:34');
INSERT INTO `notifications` VALUES (81, 'liked', 'App\\Models\\User', 4, '{\"user_id\":10,\"thread_id\":26,\"thread_username\":\"A_Salty_Fish\",\"thread_title\":\"[LeetCode] 300. \\u6700\\u957f\\u4e0a\\u5347\\u5b50\\u5e8f\\u5217\",\"thread_created_at\":\"2020-12-09T19:58:16+08:00\",\"post_id\":157,\"post_content\":\"\",\"reply_post_id\":0,\"post_created_at\":\"2020-12-09T19:58:16+08:00\"}', NULL, '2020-12-09 20:55:08', '2020-12-09 20:55:08');
INSERT INTO `notifications` VALUES (82, 'liked', 'App\\Models\\User', 9, '{\"user_id\":10,\"thread_id\":28,\"thread_username\":\"xiye\",\"thread_title\":\"\\u5bf9\\u79f0\\u77e9\\u9635\\u53ca\\u6b63\\u5b9a\\u6027\",\"thread_created_at\":\"2020-12-09T20:12:36+08:00\",\"post_id\":159,\"post_content\":\"\",\"reply_post_id\":0,\"post_created_at\":\"2020-12-09T20:12:36+08:00\"}', NULL, '2020-12-09 21:27:09', '2020-12-09 21:27:09');
INSERT INTO `notifications` VALUES (83, 'liked', 'App\\Models\\User', 9, '{\"user_id\":1,\"thread_id\":28,\"thread_username\":\"xiye\",\"thread_title\":\"\\u5bf9\\u79f0\\u77e9\\u9635\\u53ca\\u6b63\\u5b9a\\u6027\",\"thread_created_at\":\"2020-12-09T20:12:36+08:00\",\"post_id\":159,\"post_content\":\"\",\"reply_post_id\":0,\"post_created_at\":\"2020-12-09T20:12:36+08:00\"}', NULL, '2020-12-09 21:49:42', '2020-12-09 21:49:42');
INSERT INTO `notifications` VALUES (84, 'liked', 'App\\Models\\User', 9, '{\"user_id\":4,\"thread_id\":27,\"thread_username\":\"xiye\",\"thread_title\":\"\\u5bf9\\u79f0\\u77e9\\u9635\\u53ca\\u6b63\\u5b9a\\u6027\",\"thread_created_at\":\"2020-12-09T20:12:33+08:00\",\"post_id\":158,\"post_content\":\"\",\"reply_post_id\":0,\"post_created_at\":\"2020-12-09T20:12:33+08:00\"}', NULL, '2020-12-11 17:12:44', '2020-12-11 17:12:44');
INSERT INTO `notifications` VALUES (85, 'system', 'App\\Models\\User', 18, '{\"title\":\"\\u6b22\\u8fce\\u52a0\\u5165ParaParty \\u5f00\\u53d1\\u7ad9\",\"content\":\"tw\\u4f60\\u597d\\uff0c\\u4f60\\u5df2\\u7ecf\\u6210\\u4e3aParaParty \\u5f00\\u53d1\\u7ad9 \\u7684\\u666e\\u901a\\u4f1a\\u5458 \\uff0c\\u8bf7\\u4f60\\u5728\\u53d1\\u8868\\u8a00\\u8bba\\u65f6\\uff0c\\u9075\\u5b88\\u5f53\\u5730\\u6cd5\\u5f8b\\u6cd5\\u89c4\\u3002\\u795d\\u4f60\\u5728\\u8fd9\\u91cc\\u73a9\\u7684\\u6109\\u5feb\\u3002\",\"raw\":{\"tpl_id\":1}}', NULL, '2020-12-11 20:13:56', '2020-12-11 20:13:56');
INSERT INTO `notifications` VALUES (86, 'system', 'App\\Models\\User', 9, '{\"title\":\"\\u5185\\u5bb9\\u901a\\u77e5\",\"content\":\"xiye\\u4f60\\u597d\\uff0c\\u4f60\\u53d1\\u5e03\\u7684\\u5185\\u5bb9 \\\"[size=xl]\\u5bf9\\u79f0\\u77e9\\u9635[\\/size]\\n\\u524d\\u9762\\u6211\\u4eec\\u5b66\\u4e60\\u4e86\\u77e9\\u9635\\u7684\\u7279\\u5f81\\u503c\\u4e0e\\u7279\\u5f81\\u5411...\\\" \\u5df2\\u88ab\\u4fee\\u6539\",\"raw\":{\"id\":159,\"thread_id\":28,\"is_first\":true,\"tpl_id\":9}}', NULL, '2020-12-12 23:10:01', '2020-12-12 23:10:01');
INSERT INTO `notifications` VALUES (87, 'system', 'App\\Models\\User', 19, '{\"title\":\"\\u6b22\\u8fce\\u52a0\\u5165ParaParty \\u5f00\\u53d1\\u7ad9\",\"content\":\"Hyt\\u4f60\\u597d\\uff0c\\u4f60\\u5df2\\u7ecf\\u6210\\u4e3aParaParty \\u5f00\\u53d1\\u7ad9 \\u7684\\u666e\\u901a\\u4f1a\\u5458 \\uff0c\\u8bf7\\u4f60\\u5728\\u53d1\\u8868\\u8a00\\u8bba\\u65f6\\uff0c\\u9075\\u5b88\\u5f53\\u5730\\u6cd5\\u5f8b\\u6cd5\\u89c4\\u3002\\u795d\\u4f60\\u5728\\u8fd9\\u91cc\\u73a9\\u7684\\u6109\\u5feb\\u3002\",\"raw\":{\"tpl_id\":1}}', NULL, '2020-12-12 23:16:36', '2020-12-12 23:16:36');
INSERT INTO `notifications` VALUES (88, 'replied', 'App\\Models\\User', 4, '{\"user_id\":19,\"thread_id\":26,\"thread_username\":\"A_Salty_Fish\",\"thread_title\":\"[LeetCode] 300. \\u6700\\u957f\\u4e0a\\u5347\\u5b50\\u5e8f\\u5217\",\"thread_created_at\":\"2020-12-09T19:58:16+08:00\",\"post_id\":162,\"post_content\":\"<p>\\u4ee3\\u7801\\u7684\\u989c\\u8272\\u504f\\u6d45\\u4e86()<\\/p>\",\"reply_post_id\":0,\"post_created_at\":\"2020-12-12T23:16:50+08:00\"}', NULL, '2020-12-12 23:16:50', '2020-12-12 23:16:50');
INSERT INTO `notifications` VALUES (89, 'system', 'App\\Models\\User', 20, '{\"title\":\"\\u6b22\\u8fce\\u52a0\\u5165ParaParty \\u5f00\\u53d1\\u7ad9\",\"content\":\"InkHin\\u4f60\\u597d\\uff0c\\u4f60\\u5df2\\u7ecf\\u6210\\u4e3aParaParty \\u5f00\\u53d1\\u7ad9 \\u7684\\u666e\\u901a\\u4f1a\\u5458 \\uff0c\\u8bf7\\u4f60\\u5728\\u53d1\\u8868\\u8a00\\u8bba\\u65f6\\uff0c\\u9075\\u5b88\\u5f53\\u5730\\u6cd5\\u5f8b\\u6cd5\\u89c4\\u3002\\u795d\\u4f60\\u5728\\u8fd9\\u91cc\\u73a9\\u7684\\u6109\\u5feb\\u3002\",\"raw\":{\"tpl_id\":1}}', NULL, '2020-12-13 11:58:48', '2020-12-13 11:58:48');
INSERT INTO `notifications` VALUES (90, 'system', 'App\\Models\\User', 21, '{\"title\":\"\\u6b22\\u8fce\\u52a0\\u5165ParaParty \\u5f00\\u53d1\\u7ad9\",\"content\":\"test\\u4f60\\u597d\\uff0c\\u4f60\\u5df2\\u7ecf\\u6210\\u4e3aParaParty \\u5f00\\u53d1\\u7ad9 \\u7684\\u666e\\u901a\\u4f1a\\u5458 \\uff0c\\u8bf7\\u4f60\\u5728\\u53d1\\u8868\\u8a00\\u8bba\\u65f6\\uff0c\\u9075\\u5b88\\u5f53\\u5730\\u6cd5\\u5f8b\\u6cd5\\u89c4\\u3002\\u795d\\u4f60\\u5728\\u8fd9\\u91cc\\u73a9\\u7684\\u6109\\u5feb\\u3002\",\"raw\":{\"tpl_id\":1}}', NULL, '2020-12-13 12:11:03', '2020-12-13 12:11:03');
INSERT INTO `notifications` VALUES (91, 'system', 'App\\Models\\User', 22, '{\"title\":\"\\u6b22\\u8fce\\u52a0\\u5165ParaParty \\u5f00\\u53d1\\u7ad9\",\"content\":\"15811100556\\u4f60\\u597d\\uff0c\\u4f60\\u5df2\\u7ecf\\u6210\\u4e3aParaParty \\u5f00\\u53d1\\u7ad9 \\u7684\\u666e\\u901a\\u4f1a\\u5458 \\uff0c\\u8bf7\\u4f60\\u5728\\u53d1\\u8868\\u8a00\\u8bba\\u65f6\\uff0c\\u9075\\u5b88\\u5f53\\u5730\\u6cd5\\u5f8b\\u6cd5\\u89c4\\u3002\\u795d\\u4f60\\u5728\\u8fd9\\u91cc\\u73a9\\u7684\\u6109\\u5feb\\u3002\",\"raw\":{\"tpl_id\":1}}', NULL, '2020-12-13 12:38:31', '2020-12-13 12:38:31');
INSERT INTO `notifications` VALUES (92, 'system', 'App\\Models\\User', 23, '{\"title\":\"\\u6b22\\u8fce\\u52a0\\u5165ParaParty \\u5f00\\u53d1\\u7ad9\",\"content\":\"referi\\u4f60\\u597d\\uff0c\\u4f60\\u5df2\\u7ecf\\u6210\\u4e3aParaParty \\u5f00\\u53d1\\u7ad9 \\u7684\\u666e\\u901a\\u4f1a\\u5458 \\uff0c\\u8bf7\\u4f60\\u5728\\u53d1\\u8868\\u8a00\\u8bba\\u65f6\\uff0c\\u9075\\u5b88\\u5f53\\u5730\\u6cd5\\u5f8b\\u6cd5\\u89c4\\u3002\\u795d\\u4f60\\u5728\\u8fd9\\u91cc\\u73a9\\u7684\\u6109\\u5feb\\u3002\",\"raw\":{\"tpl_id\":1}}', NULL, '2020-12-13 13:10:54', '2020-12-13 13:10:54');
INSERT INTO `notifications` VALUES (93, 'system', 'App\\Models\\User', 24, '{\"title\":\"\\u6b22\\u8fce\\u52a0\\u5165ParaParty \\u5f00\\u53d1\\u7ad9\",\"content\":\"Summer\\u4f60\\u597d\\uff0c\\u4f60\\u5df2\\u7ecf\\u6210\\u4e3aParaParty \\u5f00\\u53d1\\u7ad9 \\u7684\\u666e\\u901a\\u4f1a\\u5458 \\uff0c\\u8bf7\\u4f60\\u5728\\u53d1\\u8868\\u8a00\\u8bba\\u65f6\\uff0c\\u9075\\u5b88\\u5f53\\u5730\\u6cd5\\u5f8b\\u6cd5\\u89c4\\u3002\\u795d\\u4f60\\u5728\\u8fd9\\u91cc\\u73a9\\u7684\\u6109\\u5feb\\u3002\",\"raw\":{\"tpl_id\":1}}', NULL, '2020-12-13 16:32:15', '2020-12-13 16:32:15');
INSERT INTO `notifications` VALUES (94, 'system', 'App\\Models\\User', 25, '{\"title\":\"\\u6b22\\u8fce\\u52a0\\u5165ParaParty \\u5f00\\u53d1\\u7ad9\",\"content\":\"\\u672a\\u547d\\u540d\\u4f60\\u597d\\uff0c\\u4f60\\u5df2\\u7ecf\\u6210\\u4e3aParaParty \\u5f00\\u53d1\\u7ad9 \\u7684\\u666e\\u901a\\u4f1a\\u5458 \\uff0c\\u8bf7\\u4f60\\u5728\\u53d1\\u8868\\u8a00\\u8bba\\u65f6\\uff0c\\u9075\\u5b88\\u5f53\\u5730\\u6cd5\\u5f8b\\u6cd5\\u89c4\\u3002\\u795d\\u4f60\\u5728\\u8fd9\\u91cc\\u73a9\\u7684\\u6109\\u5feb\\u3002\",\"raw\":{\"tpl_id\":1}}', NULL, '2020-12-13 18:52:32', '2020-12-13 18:52:32');
INSERT INTO `notifications` VALUES (95, 'system', 'App\\Models\\User', 26, '{\"title\":\"\\u6b22\\u8fce\\u52a0\\u5165ParaParty \\u5f00\\u53d1\\u7ad9\",\"content\":\"test07\\u4f60\\u597d\\uff0c\\u4f60\\u5df2\\u7ecf\\u6210\\u4e3aParaParty \\u5f00\\u53d1\\u7ad9 \\u7684\\u666e\\u901a\\u4f1a\\u5458 \\uff0c\\u8bf7\\u4f60\\u5728\\u53d1\\u8868\\u8a00\\u8bba\\u65f6\\uff0c\\u9075\\u5b88\\u5f53\\u5730\\u6cd5\\u5f8b\\u6cd5\\u89c4\\u3002\\u795d\\u4f60\\u5728\\u8fd9\\u91cc\\u73a9\\u7684\\u6109\\u5feb\\u3002\",\"raw\":{\"tpl_id\":1}}', NULL, '2020-12-14 16:28:21', '2020-12-14 16:28:21');
INSERT INTO `notifications` VALUES (96, 'replied', 'App\\Models\\User', 1, '{\"user_id\":10,\"thread_id\":29,\"thread_username\":\"admin\",\"thread_title\":\"[\\u5e2e\\u52a9] SourceLay \\u6e38\\u89c8\\u987b\\u77e5\",\"thread_created_at\":\"2020-12-10T09:20:06+08:00\",\"post_id\":163,\"post_content\":\"<p>\\u597d\\u8036<\\/p>\",\"reply_post_id\":0,\"post_created_at\":\"2020-12-14T21:53:32+08:00\"}', NULL, '2020-12-14 21:53:32', '2020-12-14 21:53:32');
INSERT INTO `notifications` VALUES (97, 'replied', 'App\\Models\\User', 9, '{\"user_id\":10,\"thread_id\":28,\"thread_username\":\"xiye\",\"thread_title\":\"\\u5bf9\\u79f0\\u77e9\\u9635\\u53ca\\u6b63\\u5b9a\\u6027\",\"thread_created_at\":\"2020-12-09T20:12:36+08:00\",\"post_id\":164,\"post_content\":\"<p>\\u4e0d\\u9519\\uff0c\\u5b66\\u5230\\u4e86\\u5f88\\u591a<\\/p>\",\"reply_post_id\":0,\"post_created_at\":\"2020-12-14T21:54:09+08:00\"}', NULL, '2020-12-14 21:54:09', '2020-12-14 21:54:09');
INSERT INTO `notifications` VALUES (98, 'replied', 'App\\Models\\User', 5, '{\"user_id\":1,\"thread_id\":31,\"thread_username\":\"\\u9646\\u9646\\u4fa0\",\"thread_title\":\"[\\u597d\\u7269\\u5206\\u4eab]Key20th MEMORIAL BOOK\",\"thread_created_at\":\"2020-12-15T11:42:22+08:00\",\"post_id\":166,\"post_content\":\"<p>\\u6709\\u70b9\\u610f\\u601d<\\/p>\",\"reply_post_id\":0,\"post_created_at\":\"2020-12-15T12:47:28+08:00\"}', NULL, '2020-12-15 12:47:28', '2020-12-15 12:47:28');
INSERT INTO `notifications` VALUES (99, 'system', 'App\\Models\\User', 27, '{\"title\":\"\\u6b22\\u8fce\\u52a0\\u5165ParaParty \\u5f00\\u53d1\\u7ad9\",\"content\":\"leo\\u4f60\\u597d\\uff0c\\u4f60\\u5df2\\u7ecf\\u6210\\u4e3aParaParty \\u5f00\\u53d1\\u7ad9 \\u7684\\u666e\\u901a\\u4f1a\\u5458 \\uff0c\\u8bf7\\u4f60\\u5728\\u53d1\\u8868\\u8a00\\u8bba\\u65f6\\uff0c\\u9075\\u5b88\\u5f53\\u5730\\u6cd5\\u5f8b\\u6cd5\\u89c4\\u3002\\u795d\\u4f60\\u5728\\u8fd9\\u91cc\\u73a9\\u7684\\u6109\\u5feb\\u3002\",\"raw\":{\"tpl_id\":1}}', NULL, '2020-12-19 14:00:11', '2020-12-19 14:00:11');
INSERT INTO `notifications` VALUES (100, 'system', 'App\\Models\\User', 28, '{\"title\":\"\\u6b22\\u8fce\\u52a0\\u5165ParaParty \\u5f00\\u53d1\\u7ad9\",\"content\":\"zhang\\u4f60\\u597d\\uff0c\\u4f60\\u5df2\\u7ecf\\u6210\\u4e3aParaParty \\u5f00\\u53d1\\u7ad9 \\u7684\\u666e\\u901a\\u4f1a\\u5458 \\uff0c\\u8bf7\\u4f60\\u5728\\u53d1\\u8868\\u8a00\\u8bba\\u65f6\\uff0c\\u9075\\u5b88\\u5f53\\u5730\\u6cd5\\u5f8b\\u6cd5\\u89c4\\u3002\\u795d\\u4f60\\u5728\\u8fd9\\u91cc\\u73a9\\u7684\\u6109\\u5feb\\u3002\",\"raw\":{\"tpl_id\":1}}', NULL, '2020-12-21 18:57:18', '2020-12-21 18:57:18');
INSERT INTO `notifications` VALUES (101, 'replied', 'App\\Models\\User', 1, '{\"user_id\":5,\"thread_id\":2,\"thread_username\":\"admin\",\"thread_title\":\"[\\u6d4b\\u8bd5] \\u957f\\u5e16\\u5b50\\u6d4b\\u8bd5\",\"thread_created_at\":\"2020-08-16T12:05:04+08:00\",\"post_id\":168,\"post_content\":\"<p>\\u5728\\u670d\\u52a1\\u5668\\u54cd\\u5e94\\u591f\\u5feb\\u7684\\u60c5\\u51b5\\u4e0b\\uff0c\\u8bbf\\u95ee\\u8fd9\\u4e2a\\u5e16\\u5b50\\uff0c\\u771f\\u662f\\u4e1d\\u822c\\u6d41\\u7545\\uff0c\\u554a\\u54c8\\u54c8\\uff01<\\/p>\",\"reply_post_id\":0,\"post_created_at\":\"2020-12-22T14:15:41+08:00\"}', NULL, '2020-12-22 14:15:41', '2020-12-22 14:15:41');
INSERT INTO `notifications` VALUES (102, 'liked', 'App\\Models\\User', 1, '{\"user_id\":5,\"thread_id\":2,\"thread_username\":\"admin\",\"thread_title\":\"[\\u6d4b\\u8bd5] \\u957f\\u5e16\\u5b50\\u6d4b\\u8bd5\",\"thread_created_at\":\"2020-08-16T12:05:04+08:00\",\"post_id\":2,\"post_content\":\"\",\"reply_post_id\":0,\"post_created_at\":\"2020-08-16T12:05:04+08:00\"}', NULL, '2020-12-22 14:16:08', '2020-12-22 14:16:08');
INSERT INTO `notifications` VALUES (103, 'liked', 'App\\Models\\User', 1, '{\"user_id\":5,\"thread_id\":2,\"thread_username\":\"admin\",\"thread_title\":\"[\\u6d4b\\u8bd5] \\u957f\\u5e16\\u5b50\\u6d4b\\u8bd5\",\"thread_created_at\":\"2020-08-16T12:05:04+08:00\",\"post_id\":2,\"post_content\":\"\",\"reply_post_id\":0,\"post_created_at\":\"2020-08-16T12:05:04+08:00\"}', NULL, '2020-12-22 14:16:13', '2020-12-22 14:16:13');
INSERT INTO `notifications` VALUES (104, 'liked', 'App\\Models\\User', 1, '{\"user_id\":5,\"thread_id\":29,\"thread_username\":\"admin\",\"thread_title\":\"[\\u5e2e\\u52a9] SourceLay \\u6e38\\u89c8\\u987b\\u77e5\",\"thread_created_at\":\"2020-12-10T09:20:06+08:00\",\"post_id\":160,\"post_content\":\"\",\"reply_post_id\":0,\"post_created_at\":\"2020-12-10T09:20:06+08:00\"}', NULL, '2020-12-22 14:16:55', '2020-12-22 14:16:55');
INSERT INTO `notifications` VALUES (105, 'replied', 'App\\Models\\User', 5, '{\"user_id\":1,\"thread_id\":32,\"thread_username\":\"\\u9646\\u9646\\u4fa0\",\"thread_title\":\"\\u8bba\\u575b\\u597d\\u51b7\\u6e05\\u554a\",\"thread_created_at\":\"2020-12-22T14:13:17+08:00\",\"post_id\":169,\"post_content\":\"<p>\\u5bd2\\u5047\\u6765\\u4e00\\u8d77\\u91cd\\u6784\\u5427 \\u221a<\\/p>\",\"reply_post_id\":0,\"post_created_at\":\"2020-12-22T14:53:18+08:00\"}', NULL, '2020-12-22 14:53:18', '2020-12-22 14:53:18');
INSERT INTO `notifications` VALUES (106, 'replied', 'App\\Models\\User', 1, '{\"user_id\":5,\"thread_id\":32,\"thread_username\":\"\\u9646\\u9646\\u4fa0\",\"thread_title\":\"\\u8bba\\u575b\\u597d\\u51b7\\u6e05\\u554a\",\"thread_created_at\":\"2020-12-22T14:13:17+08:00\",\"post_id\":170,\"post_content\":\"<p>\\u987a\\u5e26\\u600e\\u4e48\\u53d1\\u56fe\\u529f\\u80fd\\u90fd\\u6ca1\\u4e86\\uff08<\\/p>\",\"reply_post_id\":\"169\",\"post_created_at\":\"2020-12-22T16:30:09+08:00\",\"reply_post_user_id\":1,\"reply_post_content\":\"<p>\\u5bd2\\u5047\\u6765\\u4e00\\u8d77\\u91cd\\u6784\\u5427 \\u221a<\\/p>\\n\\n<p>\\u7a81\\u7136\\u53d1\\u73b0 CTRL + ENTER \\u7684\\u53d1\\u9001\\u5feb\\u6377\\u952e\\u6ca1\\u5b9e\\u73b0\\u3002\\u597d\\u86cb\\u75bc\\u3002<\\/p>\",\"reply_post_created_at\":\"2020-12-22T14:53:18+08:00\"}', NULL, '2020-12-22 16:30:09', '2020-12-22 16:30:09');
INSERT INTO `notifications` VALUES (107, 'replied', 'App\\Models\\User', 5, '{\"user_id\":1,\"thread_id\":32,\"thread_username\":\"\\u9646\\u9646\\u4fa0\",\"thread_title\":\"\\u8bba\\u575b\\u597d\\u51b7\\u6e05\\u554a\",\"thread_created_at\":\"2020-12-22T14:13:17+08:00\",\"post_id\":171,\"post_content\":\"<p>\\u597d\\u95ee\\u9898\\uff0c\\u6211\\u5220\\u7684\\u3002[s]\\u56e0\\u4e3a\\u53d1\\u73b0\\u4e86\\u4e2a\\u8ff7\\u60d1bug[\\/s]<\\/p>\",\"reply_post_id\":\"170\",\"post_created_at\":\"2020-12-22T23:25:54+08:00\",\"reply_post_user_id\":5,\"reply_post_content\":\"<p>\\u987a\\u5e26\\u600e\\u4e48\\u53d1\\u56fe\\u529f\\u80fd\\u90fd\\u6ca1\\u4e86\\uff08<\\/p>\",\"reply_post_created_at\":\"2020-12-22T16:30:09+08:00\"}', NULL, '2020-12-22 23:25:54', '2020-12-22 23:25:54');
INSERT INTO `notifications` VALUES (108, 'replied', 'App\\Models\\User', 5, '{\"user_id\":9,\"thread_id\":32,\"thread_username\":\"\\u9646\\u9646\\u4fa0\",\"thread_title\":\"\\u8bba\\u575b\\u597d\\u51b7\\u6e05\\u554a\",\"thread_created_at\":\"2020-12-22T14:13:17+08:00\",\"post_id\":172,\"post_content\":\"<p>\\u56e0\\u4e3a\\u817e\\u8baf\\u7684\\u63a8\\u5e7f\\u8ba1\\u5212\\u8fd8\\u6ca1\\u5230\\u8d26\\uff08bushi<\\/p>\",\"reply_post_id\":0,\"post_created_at\":\"2020-12-24T16:14:47+08:00\"}', NULL, '2020-12-24 16:14:47', '2020-12-24 16:14:47');
INSERT INTO `notifications` VALUES (109, 'replied', 'App\\Models\\User', 4, '{\"user_id\":5,\"thread_id\":26,\"thread_username\":\"A_Salty_Fish\",\"thread_title\":\"[LeetCode] 300. \\u6700\\u957f\\u4e0a\\u5347\\u5b50\\u5e8f\\u5217\",\"thread_created_at\":\"2020-12-09T19:58:16+08:00\",\"post_id\":173,\"post_content\":\"<p>y1s1\\uff0cqs<\\/p>\",\"reply_post_id\":\"162\",\"post_created_at\":\"2020-12-31T16:59:19+08:00\",\"reply_post_user_id\":19,\"reply_post_content\":\"<p>\\u4ee3\\u7801\\u7684\\u989c\\u8272\\u504f\\u6d45\\u4e86()<\\/p>\",\"reply_post_created_at\":\"2020-12-12T23:16:50+08:00\"}', NULL, '2020-12-31 16:59:20', '2020-12-31 16:59:20');
INSERT INTO `notifications` VALUES (110, 'replied', 'App\\Models\\User', 19, '{\"user_id\":5,\"thread_id\":26,\"thread_username\":\"A_Salty_Fish\",\"thread_title\":\"[LeetCode] 300. \\u6700\\u957f\\u4e0a\\u5347\\u5b50\\u5e8f\\u5217\",\"thread_created_at\":\"2020-12-09T19:58:16+08:00\",\"post_id\":173,\"post_content\":\"<p>y1s1\\uff0cqs<\\/p>\",\"reply_post_id\":\"162\",\"post_created_at\":\"2020-12-31T16:59:19+08:00\",\"reply_post_user_id\":19,\"reply_post_content\":\"<p>\\u4ee3\\u7801\\u7684\\u989c\\u8272\\u504f\\u6d45\\u4e86()<\\/p>\",\"reply_post_created_at\":\"2020-12-12T23:16:50+08:00\"}', NULL, '2020-12-31 16:59:20', '2020-12-31 16:59:20');
INSERT INTO `notifications` VALUES (111, 'system', 'App\\Models\\User', 29, '{\"title\":\"\\u6b22\\u8fce\\u52a0\\u5165ParaParty \\u5f00\\u53d1\\u7ad9\",\"content\":\"hahahahaha\\u4f60\\u597d\\uff0c\\u4f60\\u5df2\\u7ecf\\u6210\\u4e3aParaParty \\u5f00\\u53d1\\u7ad9 \\u7684\\u666e\\u901a\\u4f1a\\u5458 \\uff0c\\u8bf7\\u4f60\\u5728\\u53d1\\u8868\\u8a00\\u8bba\\u65f6\\uff0c\\u9075\\u5b88\\u5f53\\u5730\\u6cd5\\u5f8b\\u6cd5\\u89c4\\u3002\\u795d\\u4f60\\u5728\\u8fd9\\u91cc\\u73a9\\u7684\\u6109\\u5feb\\u3002\",\"raw\":{\"tpl_id\":1}}', NULL, '2021-01-08 21:35:28', '2021-01-08 21:35:28');
INSERT INTO `notifications` VALUES (112, 'system', 'App\\Models\\User', 30, '{\"title\":\"\\u6b22\\u8fce\\u52a0\\u5165ParaParty \\u5f00\\u53d1\\u7ad9\",\"content\":\"135920\\u4f60\\u597d\\uff0c\\u4f60\\u5df2\\u7ecf\\u6210\\u4e3aParaParty \\u5f00\\u53d1\\u7ad9 \\u7684\\u666e\\u901a\\u4f1a\\u5458 \\uff0c\\u8bf7\\u4f60\\u5728\\u53d1\\u8868\\u8a00\\u8bba\\u65f6\\uff0c\\u9075\\u5b88\\u5f53\\u5730\\u6cd5\\u5f8b\\u6cd5\\u89c4\\u3002\\u795d\\u4f60\\u5728\\u8fd9\\u91cc\\u73a9\\u7684\\u6109\\u5feb\\u3002\",\"raw\":{\"tpl_id\":1}}', NULL, '2021-01-20 11:25:44', '2021-01-20 11:25:44');
INSERT INTO `notifications` VALUES (113, 'replied', 'App\\Models\\User', 4, '{\"user_id\":30,\"thread_id\":30,\"thread_username\":\"A_Salty_Fish\",\"thread_title\":\"[Windows] Windows\\u8003\\u8bd5\\u6253\\u5370\\u8d44\\u6599\",\"thread_created_at\":\"2020-12-11T17:17:55+08:00\",\"post_id\":174,\"post_content\":\"<p>[color=purple][size=m][b]fdfdsfsda[\\/b][\\/size][\\/color]<\\/p>\",\"reply_post_id\":0,\"post_created_at\":\"2021-01-20T11:26:37+08:00\"}', NULL, '2021-01-20 11:26:37', '2021-01-20 11:26:37');
INSERT INTO `notifications` VALUES (114, 'replied', 'App\\Models\\User', 1, '{\"user_id\":5,\"thread_id\":34,\"thread_username\":\"admin\",\"thread_title\":\"[\\u516c\\u544a] \\u606d\\u559c\\u672c\\u9879\\u76ee\\u65a9\\u83b7\\u817e\\u8baf\\u4e91 2020 \\u4e2d\\u5c0f\\u4f01\\u4e1a\\u5f00\\u53d1\\u8005\\u5927\\u8d5b\\u5e74\\u5ea6\\u6700\\u4f73\\u6280\\u672f\\u7a81\\u7834\\u5956\",\"thread_created_at\":\"2021-01-21T13:50:46+08:00\",\"post_id\":177,\"post_content\":\"<p>[i][b][size=xl][color=red]\\u8036[\\/color][color=yellow]\\u8036[\\/color][color=green]\\u8036[\\/color][color=blue]\\uff01[\\/color][\\/size][\\/b][\\/i]<\\/p>\",\"reply_post_id\":0,\"post_created_at\":\"2021-01-21T14:14:32+08:00\"}', NULL, '2021-01-21 14:14:33', '2021-01-21 14:14:33');
INSERT INTO `notifications` VALUES (115, 'replied', 'App\\Models\\User', 4, '{\"user_id\":5,\"thread_id\":26,\"thread_username\":\"A_Salty_Fish\",\"thread_title\":\"[LeetCode] 300. \\u6700\\u957f\\u4e0a\\u5347\\u5b50\\u5e8f\\u5217\",\"thread_created_at\":\"2020-12-09T19:58:16+08:00\",\"post_id\":178,\"post_content\":\"<p>[b]\\u800c\\u4e14\\u8fd8\\u662f\\u5b8b\\u4f53\\uff0c\\u600e\\u4e48\\u641e\\u7684\\uff08[\\/b]<\\/p>\",\"reply_post_id\":\"162\",\"post_created_at\":\"2021-01-21T14:18:28+08:00\",\"reply_post_user_id\":19,\"reply_post_content\":\"<p>\\u4ee3\\u7801\\u7684\\u989c\\u8272\\u504f\\u6d45\\u4e86()<\\/p>\",\"reply_post_created_at\":\"2020-12-12T23:16:50+08:00\"}', NULL, '2021-01-21 14:18:28', '2021-01-21 14:18:28');
INSERT INTO `notifications` VALUES (116, 'replied', 'App\\Models\\User', 19, '{\"user_id\":5,\"thread_id\":26,\"thread_username\":\"A_Salty_Fish\",\"thread_title\":\"[LeetCode] 300. \\u6700\\u957f\\u4e0a\\u5347\\u5b50\\u5e8f\\u5217\",\"thread_created_at\":\"2020-12-09T19:58:16+08:00\",\"post_id\":178,\"post_content\":\"<p>[b]\\u800c\\u4e14\\u8fd8\\u662f\\u5b8b\\u4f53\\uff0c\\u600e\\u4e48\\u641e\\u7684\\uff08[\\/b]<\\/p>\",\"reply_post_id\":\"162\",\"post_created_at\":\"2021-01-21T14:18:28+08:00\",\"reply_post_user_id\":19,\"reply_post_content\":\"<p>\\u4ee3\\u7801\\u7684\\u989c\\u8272\\u504f\\u6d45\\u4e86()<\\/p>\",\"reply_post_created_at\":\"2020-12-12T23:16:50+08:00\"}', NULL, '2021-01-21 14:18:29', '2021-01-21 14:18:29');
INSERT INTO `notifications` VALUES (117, 'liked', 'App\\Models\\User', 4, '{\"user_id\":5,\"thread_id\":26,\"thread_username\":\"A_Salty_Fish\",\"thread_title\":\"[LeetCode] 300. \\u6700\\u957f\\u4e0a\\u5347\\u5b50\\u5e8f\\u5217\",\"thread_created_at\":\"2020-12-09T19:58:16+08:00\",\"post_id\":157,\"post_content\":\"\",\"reply_post_id\":0,\"post_created_at\":\"2020-12-09T19:58:16+08:00\"}', NULL, '2021-01-21 14:18:44', '2021-01-21 14:18:44');
INSERT INTO `notifications` VALUES (118, 'system', 'App\\Models\\User', 31, '{\"title\":\"\\u6b22\\u8fce\\u52a0\\u5165ParaParty \\u5f00\\u53d1\\u7ad9\",\"content\":\"Leo1007\\u4f60\\u597d\\uff0c\\u4f60\\u5df2\\u7ecf\\u6210\\u4e3aParaParty \\u5f00\\u53d1\\u7ad9 \\u7684\\u666e\\u901a\\u4f1a\\u5458 \\uff0c\\u8bf7\\u4f60\\u5728\\u53d1\\u8868\\u8a00\\u8bba\\u65f6\\uff0c\\u9075\\u5b88\\u5f53\\u5730\\u6cd5\\u5f8b\\u6cd5\\u89c4\\u3002\\u795d\\u4f60\\u5728\\u8fd9\\u91cc\\u73a9\\u7684\\u6109\\u5feb\\u3002\",\"raw\":{\"tpl_id\":1}}', NULL, '2021-01-21 19:29:38', '2021-01-21 19:29:38');
INSERT INTO `notifications` VALUES (119, 'replied', 'App\\Models\\User', 4, '{\"user_id\":1,\"thread_id\":26,\"thread_username\":\"A_Salty_Fish\",\"thread_title\":\"[LeetCode] 300. \\u6700\\u957f\\u4e0a\\u5347\\u5b50\\u5e8f\\u5217\",\"thread_created_at\":\"2020-12-09T19:58:16+08:00\",\"post_id\":179,\"post_content\":\"<p>\\u5b8b\\u4f53\\u662f\\u56e0\\u4e3a\\u4f60\\u7684\\u6d4f\\u89c8\\u5668\\u8bbe\\u7f6e\\u662f\\u5b8b\\u4f53\\u3002\\u3002\\u3002\\u3002<\\/p>\",\"reply_post_id\":\"178\",\"post_created_at\":\"2021-01-21T21:07:06+08:00\",\"reply_post_user_id\":5,\"reply_post_content\":\"<p>[b]\\u800c\\u4e14\\u8fd8\\u662f\\u5b8b\\u4f53\\uff0c\\u600e\\u4e48\\u641e\\u7684\\uff08[\\/b]<\\/p>\",\"reply_post_created_at\":\"2021-01-21T14:18:28+08:00\"}', NULL, '2021-01-21 21:07:06', '2021-01-21 21:07:06');
INSERT INTO `notifications` VALUES (120, 'replied', 'App\\Models\\User', 5, '{\"user_id\":1,\"thread_id\":26,\"thread_username\":\"A_Salty_Fish\",\"thread_title\":\"[LeetCode] 300. \\u6700\\u957f\\u4e0a\\u5347\\u5b50\\u5e8f\\u5217\",\"thread_created_at\":\"2020-12-09T19:58:16+08:00\",\"post_id\":179,\"post_content\":\"<p>\\u5b8b\\u4f53\\u662f\\u56e0\\u4e3a\\u4f60\\u7684\\u6d4f\\u89c8\\u5668\\u8bbe\\u7f6e\\u662f\\u5b8b\\u4f53\\u3002\\u3002\\u3002\\u3002<\\/p>\",\"reply_post_id\":\"178\",\"post_created_at\":\"2021-01-21T21:07:06+08:00\",\"reply_post_user_id\":5,\"reply_post_content\":\"<p>[b]\\u800c\\u4e14\\u8fd8\\u662f\\u5b8b\\u4f53\\uff0c\\u600e\\u4e48\\u641e\\u7684\\uff08[\\/b]<\\/p>\",\"reply_post_created_at\":\"2021-01-21T14:18:28+08:00\"}', NULL, '2021-01-21 21:07:07', '2021-01-21 21:07:07');
INSERT INTO `notifications` VALUES (121, 'replied', 'App\\Models\\User', 4, '{\"user_id\":5,\"thread_id\":26,\"thread_username\":\"A_Salty_Fish\",\"thread_title\":\"[LeetCode] 300. \\u6700\\u957f\\u4e0a\\u5347\\u5b50\\u5e8f\\u5217\",\"thread_created_at\":\"2020-12-09T19:58:16+08:00\",\"post_id\":180,\"post_content\":\"<p>\\u5176\\u4ed6\\u5b57\\u4f53\\u90fd\\u662f\\u96c5\\u9ed1\\u554a\\uff0c\\u5c31\\u4ee3\\u7801\\u5757\\u662f\\u5b8b\\u7684\\uff0c\\ud83e\\udd14<\\/p>\",\"reply_post_id\":\"179\",\"post_created_at\":\"2021-01-22T08:12:51+08:00\",\"reply_post_user_id\":1,\"reply_post_content\":\"<p>\\u5b8b\\u4f53\\u662f\\u56e0\\u4e3a\\u4f60\\u7684\\u6d4f\\u89c8\\u5668\\u8bbe\\u7f6e\\u662f\\u5b8b\\u4f53\\u3002\\u3002\\u3002\\u3002<\\/p>\",\"reply_post_created_at\":\"2021-01-21T21:07:06+08:00\"}', NULL, '2021-01-22 08:12:52', '2021-01-22 08:12:52');
INSERT INTO `notifications` VALUES (122, 'replied', 'App\\Models\\User', 1, '{\"user_id\":5,\"thread_id\":26,\"thread_username\":\"A_Salty_Fish\",\"thread_title\":\"[LeetCode] 300. \\u6700\\u957f\\u4e0a\\u5347\\u5b50\\u5e8f\\u5217\",\"thread_created_at\":\"2020-12-09T19:58:16+08:00\",\"post_id\":180,\"post_content\":\"<p>\\u5176\\u4ed6\\u5b57\\u4f53\\u90fd\\u662f\\u96c5\\u9ed1\\u554a\\uff0c\\u5c31\\u4ee3\\u7801\\u5757\\u662f\\u5b8b\\u7684\\uff0c\\ud83e\\udd14<\\/p>\",\"reply_post_id\":\"179\",\"post_created_at\":\"2021-01-22T08:12:51+08:00\",\"reply_post_user_id\":1,\"reply_post_content\":\"<p>\\u5b8b\\u4f53\\u662f\\u56e0\\u4e3a\\u4f60\\u7684\\u6d4f\\u89c8\\u5668\\u8bbe\\u7f6e\\u662f\\u5b8b\\u4f53\\u3002\\u3002\\u3002\\u3002<\\/p>\",\"reply_post_created_at\":\"2021-01-21T21:07:06+08:00\"}', NULL, '2021-01-22 08:12:52', '2021-01-22 08:12:52');
INSERT INTO `notifications` VALUES (123, 'replied', 'App\\Models\\User', 4, '{\"user_id\":1,\"thread_id\":26,\"thread_username\":\"A_Salty_Fish\",\"thread_title\":\"[LeetCode] 300. \\u6700\\u957f\\u4e0a\\u5347\\u5b50\\u5e8f\\u5217\",\"thread_created_at\":\"2020-12-09T19:58:16+08:00\",\"post_id\":181,\"post_content\":\"<p>\\u6d4f\\u89c8\\u5668\\uff0c\\u5b57\\u4f53\\u8bbe\\u7f6e\\uff0c\\u4ee3\\u7801\\u5757\\u5b57\\u4f53\\u3002<\\/p>\\n\\n<p>\\u4f60\\u7684\\u4e3b\\u9898\\u6837\\u5f0f\\u6ca1\\u5b9a\\u4e49\\u4ee3\\u7801\\u5757\\u5b57\\u4f53\\uff0c\\u6240\\u4ee5\\u5c31\\u7ee7\\u627f\\u6d4f\\u89c8\\u5668\\u8bbe\\u7f6e\\u4e86\\u3002<\\/p>\",\"reply_post_id\":\"180\",\"post_created_at\":\"2021-01-22T10:53:51+08:00\",\"reply_post_user_id\":5,\"reply_post_content\":\"<p>\\u5176\\u4ed6\\u5b57\\u4f53\\u90fd\\u662f\\u96c5\\u9ed1\\u554a\\uff0c\\u5c31\\u4ee3\\u7801\\u5757\\u662f\\u5b8b\\u7684\\uff0c\\ud83e\\udd14<\\/p>\",\"reply_post_created_at\":\"2021-01-22T08:12:51+08:00\"}', NULL, '2021-01-22 10:53:51', '2021-01-22 10:53:51');
INSERT INTO `notifications` VALUES (124, 'replied', 'App\\Models\\User', 5, '{\"user_id\":1,\"thread_id\":26,\"thread_username\":\"A_Salty_Fish\",\"thread_title\":\"[LeetCode] 300. \\u6700\\u957f\\u4e0a\\u5347\\u5b50\\u5e8f\\u5217\",\"thread_created_at\":\"2020-12-09T19:58:16+08:00\",\"post_id\":181,\"post_content\":\"<p>\\u6d4f\\u89c8\\u5668\\uff0c\\u5b57\\u4f53\\u8bbe\\u7f6e\\uff0c\\u4ee3\\u7801\\u5757\\u5b57\\u4f53\\u3002<\\/p>\\n\\n<p>\\u4f60\\u7684\\u4e3b\\u9898\\u6837\\u5f0f\\u6ca1\\u5b9a\\u4e49\\u4ee3\\u7801\\u5757\\u5b57\\u4f53\\uff0c\\u6240\\u4ee5\\u5c31\\u7ee7\\u627f\\u6d4f\\u89c8\\u5668\\u8bbe\\u7f6e\\u4e86\\u3002<\\/p>\",\"reply_post_id\":\"180\",\"post_created_at\":\"2021-01-22T10:53:51+08:00\",\"reply_post_user_id\":5,\"reply_post_content\":\"<p>\\u5176\\u4ed6\\u5b57\\u4f53\\u90fd\\u662f\\u96c5\\u9ed1\\u554a\\uff0c\\u5c31\\u4ee3\\u7801\\u5757\\u662f\\u5b8b\\u7684\\uff0c\\ud83e\\udd14<\\/p>\",\"reply_post_created_at\":\"2021-01-22T08:12:51+08:00\"}', NULL, '2021-01-22 10:53:52', '2021-01-22 10:53:52');
INSERT INTO `notifications` VALUES (125, 'replied', 'App\\Models\\User', 1, '{\"user_id\":5,\"thread_id\":2,\"thread_username\":\"admin\",\"thread_title\":\"[\\u6d4b\\u8bd5] \\u957f\\u5e16\\u5b50\\u6d4b\\u8bd5\",\"thread_created_at\":\"2020-08-16T12:05:04+08:00\",\"post_id\":183,\"post_content\":\"<p>\\u6d4b\\u8bd5\\u6d4b\\u8bd5\\uff01<\\/p>\",\"reply_post_id\":0,\"post_created_at\":\"2021-02-23T14:53:11+08:00\"}', NULL, '2021-02-23 14:53:11', '2021-02-23 14:53:11');
INSERT INTO `notifications` VALUES (126, 'system', 'App\\Models\\User', 32, '{\"title\":\"\\u6b22\\u8fce\\u52a0\\u5165ParaParty \\u5f00\\u53d1\\u7ad9\",\"content\":\"jdksahd\\u4f60\\u597d\\uff0c\\u4f60\\u5df2\\u7ecf\\u6210\\u4e3aParaParty \\u5f00\\u53d1\\u7ad9 \\u7684\\u666e\\u901a\\u4f1a\\u5458 \\uff0c\\u8bf7\\u4f60\\u5728\\u53d1\\u8868\\u8a00\\u8bba\\u65f6\\uff0c\\u9075\\u5b88\\u5f53\\u5730\\u6cd5\\u5f8b\\u6cd5\\u89c4\\u3002\\u795d\\u4f60\\u5728\\u8fd9\\u91cc\\u73a9\\u7684\\u6109\\u5feb\\u3002\",\"raw\":{\"tpl_id\":1}}', NULL, '2021-03-01 22:24:44', '2021-03-01 22:24:44');
INSERT INTO `notifications` VALUES (127, 'system', 'App\\Models\\User', 33, '{\"title\":\"\\u6b22\\u8fce\\u52a0\\u5165ParaParty \\u5f00\\u53d1\\u7ad9\",\"content\":\"15516630315\\u4f60\\u597d\\uff0c\\u4f60\\u5df2\\u7ecf\\u6210\\u4e3aParaParty \\u5f00\\u53d1\\u7ad9 \\u7684\\u666e\\u901a\\u4f1a\\u5458 \\uff0c\\u8bf7\\u4f60\\u5728\\u53d1\\u8868\\u8a00\\u8bba\\u65f6\\uff0c\\u9075\\u5b88\\u5f53\\u5730\\u6cd5\\u5f8b\\u6cd5\\u89c4\\u3002\\u795d\\u4f60\\u5728\\u8fd9\\u91cc\\u73a9\\u7684\\u6109\\u5feb\\u3002\",\"raw\":{\"tpl_id\":1}}', NULL, '2021-03-09 15:46:15', '2021-03-09 15:46:15');
INSERT INTO `notifications` VALUES (128, 'system', 'App\\Models\\User', 34, '{\"title\":\"\\u6b22\\u8fce\\u52a0\\u5165ParaParty \\u5f00\\u53d1\\u7ad9\",\"content\":\"dzy_test\\u4f60\\u597d\\uff0c\\u4f60\\u5df2\\u7ecf\\u6210\\u4e3aParaParty \\u5f00\\u53d1\\u7ad9 \\u7684\\u666e\\u901a\\u4f1a\\u5458 \\uff0c\\u8bf7\\u4f60\\u5728\\u53d1\\u8868\\u8a00\\u8bba\\u65f6\\uff0c\\u9075\\u5b88\\u5f53\\u5730\\u6cd5\\u5f8b\\u6cd5\\u89c4\\u3002\\u795d\\u4f60\\u5728\\u8fd9\\u91cc\\u73a9\\u7684\\u6109\\u5feb\\u3002\",\"raw\":{\"tpl_id\":1}}', NULL, '2021-04-15 14:26:41', '2021-04-15 14:26:41');
INSERT INTO `notifications` VALUES (129, 'replied', 'App\\Models\\User', 1, '{\"user_id\":10,\"thread_id\":34,\"thread_username\":\"admin\",\"thread_title\":\"[\\u516c\\u544a] \\u606d\\u559c\\u672c\\u9879\\u76ee\\u65a9\\u83b7\\u817e\\u8baf\\u4e91 2020 \\u4e2d\\u5c0f\\u4f01\\u4e1a\\u5f00\\u53d1\\u8005\\u5927\\u8d5b\\u5e74\\u5ea6\\u6700\\u4f73\\u6280\\u672f\\u7a81\\u7834\\u5956\",\"thread_created_at\":\"2021-01-21T13:50:46+08:00\",\"post_id\":184,\"post_content\":\"<p>\\u771f\\u4e0d\\u9519<\\/p>\",\"reply_post_id\":0,\"post_created_at\":\"2021-04-19T19:17:41+08:00\"}', NULL, '2021-04-19 19:17:41', '2021-04-19 19:17:41');

-- ----------------------------
-- Table structure for operation_logs
-- ----------------------------
DROP TABLE IF EXISTS `operation_logs`;
CREATE TABLE `operation_logs`  (
  `id` bigint UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '日志 id',
  `user_id` bigint UNSIGNED NOT NULL DEFAULT 0 COMMENT '用户 id',
  `path` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT 'url路径',
  `method` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '请求方式',
  `ip` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT 'ip 地址',
  `input` text CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT 'body请求数据',
  `type` tinyint UNSIGNED NOT NULL DEFAULT 0 COMMENT '日志类型:0后台操作',
  `created_at` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `updated_at` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `idx_user`(`user_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of operation_logs
-- ----------------------------

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders`  (
  `id` bigint UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '订单 id',
  `order_sn` char(22) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '订单编号',
  `payment_sn` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '支付编号',
  `amount` decimal(10, 2) UNSIGNED NOT NULL COMMENT '订单总金额',
  `master_amount` decimal(10, 2) UNSIGNED NOT NULL DEFAULT 0.00 COMMENT '站长分成金额',
  `author_amount` decimal(10, 2) UNSIGNED NOT NULL DEFAULT 0.00 COMMENT '作者分成金额',
  `third_party_amount` decimal(8, 2) UNSIGNED NOT NULL DEFAULT 0.00 COMMENT '第三者收益金额',
  `be_scale` double(3, 1) NOT NULL DEFAULT 0.0 COMMENT '作者受邀时的分成比例',
  `user_id` bigint UNSIGNED NOT NULL COMMENT '付款人 id',
  `payee_id` bigint UNSIGNED NOT NULL COMMENT '收款人 id',
  `third_party_id` bigint UNSIGNED NULL DEFAULT NULL COMMENT '第三者收益人 id',
  `type` tinyint UNSIGNED NOT NULL DEFAULT 0 COMMENT '交易类型：1注册、2打赏、3付费主题、4付费用户组',
  `group_id` bigint UNSIGNED NULL DEFAULT NULL COMMENT '用户组 id',
  `thread_id` bigint UNSIGNED NULL DEFAULT NULL COMMENT '主题 id',
  `status` tinyint UNSIGNED NOT NULL DEFAULT 0 COMMENT '订单状态：0待付款；1已付款；2.取消订单；3支付失败；4订单过期',
  `payment_type` smallint UNSIGNED NOT NULL DEFAULT 0 COMMENT '付款方式：微信（10：pc扫码，11：h5支付，12：微信内支付',
  `is_anonymous` tinyint UNSIGNED NOT NULL DEFAULT 0 COMMENT '是否匿名(0否1是)',
  `expired_at` datetime(0) NULL DEFAULT NULL COMMENT '付费注册过期时长',
  `created_at` datetime(0) NOT NULL COMMENT '创建时间',
  `updated_at` datetime(0) NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `orders_thread_id_index`(`thread_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 21 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of orders
-- ----------------------------
INSERT INTO `orders` VALUES (1, '1', '2', 1.00, 1.00, 1.00, 1.00, 1.0, 1, 2, 3, 17, 1, 1, 1, 10, 0, '2021-12-01 13:39:46', '2020-12-01 13:39:50', '2020-12-01 13:39:51');
INSERT INTO `orders` VALUES (2, '1', '2', 1.00, 1.00, 1.00, 1.00, 1.0, 2, 2, 3, 17, 1, 1, 1, 10, 0, '2021-12-01 13:39:46', '2020-12-01 13:39:50', '2020-12-01 13:39:51');
INSERT INTO `orders` VALUES (3, '1', '2', 1.00, 1.00, 1.00, 1.00, 1.0, 3, 2, 3, 17, 1, 1, 1, 10, 0, '2021-12-01 13:39:46', '2020-12-01 13:39:50', '2020-12-01 13:39:51');
INSERT INTO `orders` VALUES (4, '2020120611340710210051', '202012062010210051', 1.00, 0.00, 0.00, 0.00, 0.0, 8, 1, 0, 17, NULL, NULL, 0, 0, 1, NULL, '2020-12-06 11:34:07', '2020-12-06 11:34:07');
INSERT INTO `orders` VALUES (5, '2020120611505410154991', '202012063910154991', 1.00, 0.00, 0.00, 0.00, 0.0, 8, 1, 0, 17, NULL, NULL, 0, 0, 0, NULL, '2020-12-06 11:50:54', '2020-12-06 11:50:54');
INSERT INTO `orders` VALUES (6, '2020120611534456579910', '202012061456579910', 1.00, 0.00, 0.00, 0.00, 0.0, 8, 1, 0, 17, NULL, NULL, 0, 20, 0, NULL, '2020-12-06 11:53:44', '2020-12-06 11:53:51');
INSERT INTO `orders` VALUES (7, '2020120611553998561025', '202012067298561025', 1.00, 0.00, 0.00, 0.00, 0.0, 8, 1, 0, 17, NULL, NULL, 1, 0, 0, NULL, '2020-12-06 11:55:39', '2020-12-06 11:55:44');
INSERT INTO `orders` VALUES (8, '2020120611581454515554', '202012062254515553', 1.00, 0.00, 0.00, 0.00, 0.0, 8, 1, 0, 17, NULL, NULL, 0, 0, 0, NULL, '2020-12-06 11:58:14', '2020-12-06 11:58:14');
INSERT INTO `orders` VALUES (9, '2020120612033656569853', '202012065656569852', 1.00, 0.00, 0.00, 0.00, 0.0, 8, 1, 0, 17, NULL, NULL, 0, 0, 0, NULL, '2020-12-06 12:03:36', '2020-12-06 12:03:36');
INSERT INTO `orders` VALUES (10, '2020120616053648101995', '202012061548101995', 1.00, 0.00, 0.00, 0.00, 0.0, 4, 1, 0, 17, NULL, NULL, 0, 0, 0, NULL, '2020-12-06 16:05:36', '2020-12-06 16:05:36');
INSERT INTO `orders` VALUES (11, '2020120616161097100524', '202012067997100524', 1.00, 0.00, 0.00, 0.00, 0.0, 4, 1, 0, 17, NULL, NULL, 0, 0, 0, NULL, '2020-12-06 16:16:10', '2020-12-06 16:16:10');
INSERT INTO `orders` VALUES (12, '2020120617100297100504', '202012065997100504', 1.00, 0.00, 0.00, 0.00, 0.0, 4, 1, 0, 17, NULL, NULL, 0, 0, 0, NULL, '2020-12-06 17:10:02', '2020-12-06 17:10:02');
INSERT INTO `orders` VALUES (13, '2020120622332957100545', '202012063757100545', 1.00, 0.00, 0.00, 0.00, 0.0, 8, 1, 0, 17, NULL, NULL, 0, 0, 0, NULL, '2020-12-06 22:33:29', '2020-12-06 22:33:29');
INSERT INTO `orders` VALUES (14, '2020120623031955561024', '202012066455561024', 1.00, 0.00, 0.00, 0.00, 0.0, 8, 1, 0, 17, NULL, NULL, 1, 0, 0, NULL, '2020-12-06 23:03:19', '2020-12-06 23:03:30');
INSERT INTO `orders` VALUES (15, '2020120708150355101505', '202012073655101505', 1.00, 0.00, 1.00, 0.00, 0.0, 8, 1, 0, 17, NULL, 6, 1, 20, 0, NULL, '2020-12-07 08:15:03', '2020-12-07 08:15:07');
INSERT INTO `orders` VALUES (16, '2020120711474852101101', '202012073852101101', 1.00, 0.00, 1.00, 0.00, 0.0, 9, 1, 0, 17, NULL, 6, 1, 20, 0, NULL, '2020-12-07 11:47:48', '2020-12-07 11:47:53');
INSERT INTO `orders` VALUES (17, '2020120712044710210056', '202012072310210056', 1.00, 0.00, 1.00, 0.00, 0.0, 10, 1, 0, 17, NULL, 6, 1, 20, 0, NULL, '2020-12-07 12:04:47', '2020-12-07 12:04:53');
INSERT INTO `orders` VALUES (18, '2020120922455854525049', '202012096554525048', 1.00, 0.00, 0.00, 0.00, 0.0, 4, 1, 0, 17, NULL, 6, 0, 0, 0, NULL, '2020-12-09 22:45:58', '2020-12-09 22:45:58');
INSERT INTO `orders` VALUES (19, '2020120922502751575010', '202012093851575010', 1.00, 0.00, 0.00, 0.00, 0.0, 11, 1, 0, 17, NULL, 6, 0, 0, 0, NULL, '2020-12-09 22:50:27', '2020-12-09 22:50:27');
INSERT INTO `orders` VALUES (20, '2020120922513998985453', '202012098898985453', 1.00, 0.00, 0.00, 0.00, 0.0, 4, 1, 0, 17, NULL, 6, 0, 0, 0, NULL, '2020-12-09 22:51:39', '2020-12-09 22:51:39');
INSERT INTO `orders` VALUES (21, '2020123108401749495454', '202012312049495453', 1.00, 0.00, 0.00, 0.00, 0.0, 5, 1, 0, 17, NULL, 6, 0, 20, 0, NULL, '2020-12-31 08:40:17', '2020-12-31 08:40:23');

-- ----------------------------
-- Table structure for paraparty_activities
-- ----------------------------
DROP TABLE IF EXISTS `paraparty_activities`;
CREATE TABLE `paraparty_activities`  (
  `id` bigint UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '回复编号',
  `thread_id` bigint UNSIGNED NOT NULL COMMENT '帖子编号',
  `is_first` tinyint UNSIGNED NOT NULL DEFAULT 0 COMMENT '是否首个回复',
  `category_id` bigint UNSIGNED NOT NULL COMMENT '板块编号',
  `created_at` datetime(0) NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `paraparty_activities_category_id_created_at_index`(`category_id`, `created_at`) USING BTREE,
  INDEX `paraparty_activities_category_id_index`(`category_id`) USING BTREE,
  INDEX `paraparty_activities_created_at_index`(`created_at`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 186 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of paraparty_activities
-- ----------------------------
INSERT INTO `paraparty_activities` VALUES (1, 1, 1, 7, '2020-11-29 19:02:44');
INSERT INTO `paraparty_activities` VALUES (2, 2, 1, 7, '2020-11-29 17:58:37');
INSERT INTO `paraparty_activities` VALUES (106, 3, 1, 7, '2020-08-16 19:53:33');
INSERT INTO `paraparty_activities` VALUES (107, 4, 1, 7, '2020-11-24 22:10:34');
INSERT INTO `paraparty_activities` VALUES (108, 5, 1, 7, '2020-11-25 14:36:01');
INSERT INTO `paraparty_activities` VALUES (109, 5, 0, 7, '2020-11-25 15:26:13');
INSERT INTO `paraparty_activities` VALUES (110, 5, 0, 7, '2020-11-25 15:29:55');
INSERT INTO `paraparty_activities` VALUES (111, 6, 1, 7, '2020-12-05 14:23:41');
INSERT INTO `paraparty_activities` VALUES (112, 6, 0, 7, '2020-12-07 12:20:26');
INSERT INTO `paraparty_activities` VALUES (113, 6, 0, 7, '2020-12-07 12:20:54');
INSERT INTO `paraparty_activities` VALUES (114, 1, 0, 7, '2020-12-08 10:51:00');
INSERT INTO `paraparty_activities` VALUES (115, 7, 1, 27, '2020-12-08 11:33:18');
INSERT INTO `paraparty_activities` VALUES (116, 1, 0, 7, '2020-12-08 14:01:45');
INSERT INTO `paraparty_activities` VALUES (117, 8, 1, 10, '2020-12-08 14:24:14');
INSERT INTO `paraparty_activities` VALUES (118, 9, 1, 28, '2020-12-08 14:38:31');
INSERT INTO `paraparty_activities` VALUES (119, 9, 0, 28, '2020-12-08 15:01:52');
INSERT INTO `paraparty_activities` VALUES (120, 8, 0, 10, '2020-12-08 15:07:52');
INSERT INTO `paraparty_activities` VALUES (121, 7, 0, 27, '2020-12-08 15:10:14');
INSERT INTO `paraparty_activities` VALUES (122, 7, 0, 27, '2020-12-08 15:10:36');
INSERT INTO `paraparty_activities` VALUES (123, 7, 0, 27, '2020-12-08 15:10:41');
INSERT INTO `paraparty_activities` VALUES (124, 4, 0, 7, '2020-12-08 15:11:10');
INSERT INTO `paraparty_activities` VALUES (125, 4, 0, 7, '2020-12-08 15:11:40');
INSERT INTO `paraparty_activities` VALUES (126, 10, 1, 21, '2020-12-08 15:48:25');
INSERT INTO `paraparty_activities` VALUES (127, 10, 0, 21, '2020-12-08 15:57:23');
INSERT INTO `paraparty_activities` VALUES (128, 11, 1, 7, '2020-12-08 15:59:32');
INSERT INTO `paraparty_activities` VALUES (129, 8, 0, 10, '2020-12-08 16:20:31');
INSERT INTO `paraparty_activities` VALUES (130, 10, 0, 21, '2020-12-08 16:21:36');
INSERT INTO `paraparty_activities` VALUES (131, 9, 0, 28, '2020-12-08 16:38:48');
INSERT INTO `paraparty_activities` VALUES (132, 7, 0, 27, '2020-12-08 17:16:20');
INSERT INTO `paraparty_activities` VALUES (133, 7, 0, 27, '2020-12-08 17:18:59');
INSERT INTO `paraparty_activities` VALUES (134, 7, 0, 27, '2020-12-08 17:32:14');
INSERT INTO `paraparty_activities` VALUES (135, 12, 1, 4, '2020-12-08 19:03:14');
INSERT INTO `paraparty_activities` VALUES (136, 7, 0, 27, '2020-12-08 19:40:48');
INSERT INTO `paraparty_activities` VALUES (137, 13, 1, 28, '2020-12-08 19:51:18');
INSERT INTO `paraparty_activities` VALUES (138, 14, 1, 11, '2020-12-08 21:23:33');
INSERT INTO `paraparty_activities` VALUES (139, 15, 1, 10, '2020-12-08 21:26:18');
INSERT INTO `paraparty_activities` VALUES (140, 16, 1, 10, '2020-12-08 21:34:41');
INSERT INTO `paraparty_activities` VALUES (141, 17, 1, 10, '2020-12-08 21:34:41');
INSERT INTO `paraparty_activities` VALUES (142, 18, 1, 11, '2020-12-08 21:40:42');
INSERT INTO `paraparty_activities` VALUES (143, 19, 1, 11, '2020-12-08 21:41:49');
INSERT INTO `paraparty_activities` VALUES (144, 20, 1, 10, '2020-12-08 21:44:30');
INSERT INTO `paraparty_activities` VALUES (145, 7, 0, 27, '2020-12-08 21:47:39');
INSERT INTO `paraparty_activities` VALUES (146, 21, 1, 7, '2020-12-08 22:05:23');
INSERT INTO `paraparty_activities` VALUES (147, 22, 1, 19, '2020-12-08 22:38:14');
INSERT INTO `paraparty_activities` VALUES (148, 23, 1, 19, '2020-12-08 22:38:44');
INSERT INTO `paraparty_activities` VALUES (149, 24, 1, 19, '2020-12-08 22:39:45');
INSERT INTO `paraparty_activities` VALUES (150, 7, 0, 27, '2020-12-09 09:52:21');
INSERT INTO `paraparty_activities` VALUES (151, 25, 1, 4, '2020-12-09 19:37:26');
INSERT INTO `paraparty_activities` VALUES (152, 25, 0, 4, '2020-12-09 19:38:45');
INSERT INTO `paraparty_activities` VALUES (153, 25, 0, 4, '2020-12-09 19:41:06');
INSERT INTO `paraparty_activities` VALUES (154, 25, 0, 4, '2020-12-09 19:43:11');
INSERT INTO `paraparty_activities` VALUES (155, 25, 0, 4, '2020-12-09 19:47:49');
INSERT INTO `paraparty_activities` VALUES (156, 25, 0, 4, '2020-12-09 19:48:17');
INSERT INTO `paraparty_activities` VALUES (157, 26, 1, 10, '2020-12-09 19:58:16');
INSERT INTO `paraparty_activities` VALUES (158, 27, 1, 4, '2020-12-09 20:12:33');
INSERT INTO `paraparty_activities` VALUES (159, 28, 1, 4, '2020-12-09 20:12:36');
INSERT INTO `paraparty_activities` VALUES (160, 29, 1, 28, '2020-12-10 09:20:06');
INSERT INTO `paraparty_activities` VALUES (161, 30, 1, 10, '2020-12-11 17:17:55');
INSERT INTO `paraparty_activities` VALUES (162, 26, 0, 10, '2020-12-12 23:16:50');
INSERT INTO `paraparty_activities` VALUES (163, 29, 0, 28, '2020-12-14 21:53:32');
INSERT INTO `paraparty_activities` VALUES (164, 28, 0, 4, '2020-12-14 21:54:09');
INSERT INTO `paraparty_activities` VALUES (165, 31, 1, 8, '2020-12-15 11:42:22');
INSERT INTO `paraparty_activities` VALUES (166, 31, 0, 8, '2020-12-15 12:47:28');
INSERT INTO `paraparty_activities` VALUES (167, 32, 1, 7, '2020-12-22 14:13:17');
INSERT INTO `paraparty_activities` VALUES (168, 2, 0, 7, '2020-12-22 14:15:41');
INSERT INTO `paraparty_activities` VALUES (169, 32, 0, 7, '2020-12-22 14:53:18');
INSERT INTO `paraparty_activities` VALUES (170, 32, 0, 7, '2020-12-22 16:30:10');
INSERT INTO `paraparty_activities` VALUES (171, 32, 0, 7, '2020-12-22 23:25:54');
INSERT INTO `paraparty_activities` VALUES (172, 32, 0, 7, '2020-12-24 16:14:47');
INSERT INTO `paraparty_activities` VALUES (173, 26, 0, 10, '2020-12-31 16:59:21');
INSERT INTO `paraparty_activities` VALUES (174, 30, 0, 10, '2021-01-20 11:26:38');
INSERT INTO `paraparty_activities` VALUES (175, 33, 1, 27, '2021-01-20 11:27:32');
INSERT INTO `paraparty_activities` VALUES (176, 34, 1, 29, '2021-01-21 13:50:46');
INSERT INTO `paraparty_activities` VALUES (177, 34, 0, 29, '2021-01-21 14:14:33');
INSERT INTO `paraparty_activities` VALUES (178, 26, 0, 10, '2021-01-21 14:18:29');
INSERT INTO `paraparty_activities` VALUES (179, 26, 0, 10, '2021-01-21 21:07:07');
INSERT INTO `paraparty_activities` VALUES (180, 26, 0, 10, '2021-01-22 08:12:53');
INSERT INTO `paraparty_activities` VALUES (181, 26, 0, 10, '2021-01-22 10:53:52');
INSERT INTO `paraparty_activities` VALUES (182, 35, 1, 27, '2021-02-23 14:47:13');
INSERT INTO `paraparty_activities` VALUES (183, 2, 0, 7, '2021-02-23 14:53:12');
INSERT INTO `paraparty_activities` VALUES (184, 34, 0, 29, '2021-04-19 19:17:41');
INSERT INTO `paraparty_activities` VALUES (185, 36, 1, 27, '2021-04-20 11:05:21');
INSERT INTO `paraparty_activities` VALUES (186, 36, 0, 27, '2021-04-20 11:05:29');

-- ----------------------------
-- Table structure for paraparty_homepage_banners
-- ----------------------------
DROP TABLE IF EXISTS `paraparty_homepage_banners`;
CREATE TABLE `paraparty_homepage_banners`  (
  `id` bigint NOT NULL,
  `status` smallint NULL DEFAULT NULL,
  `weight` int NULL DEFAULT NULL,
  `title` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `sub_title` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `bin_text` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `image` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `background` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of paraparty_homepage_banners
-- ----------------------------
INSERT INTO `paraparty_homepage_banners` VALUES (1, 1, 100, '武汉大学 ACM 协会寒假培训', '这个寒假，一起 AC！', '立即前往 ▶', 'https://space.bilibili.com/369023052', '/statics/Banner/%E6%AD%A6%E6%B1%89%E5%A4%A7%E5%AD%A6ACM.png', 'linear-gradient( 135deg, #79F1A4 10%, #0E5CAD 100%)');
INSERT INTO `paraparty_homepage_banners` VALUES (2, 1, 100, '肖秀荣考研', '考研人，考研魂', '立即前往 ▶', NULL, '/statics/Banner/%E8%82%96%E7%A7%80%E8%8D%A3.png', 'linear-gradient( 135deg, #FDEB71 10%, #F8D800 100%)');
INSERT INTO `paraparty_homepage_banners` VALUES (3, 1, 100, '互联网+创新创业大赛', '第六届创新创业大赛圆满落幕', '立即前往 ▶', NULL, '/statics/Banner/%E5%88%9B%E6%96%B0%E5%88%9B%E4%B8%9A%E5%A4%A7%E8%B5%9B.png', 'linear-gradient( 135deg, #E2B0FF 10%, #9F44D3 100%)');

-- ----------------------------
-- Table structure for paraparty_homepage_sliders
-- ----------------------------
DROP TABLE IF EXISTS `paraparty_homepage_sliders`;
CREATE TABLE `paraparty_homepage_sliders`  (
  `id` bigint NOT NULL,
  `status` smallint NULL DEFAULT NULL,
  `weight` int NULL DEFAULT NULL,
  `title` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `author` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `image` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `thread_id` bigint NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of paraparty_homepage_sliders
-- ----------------------------
INSERT INTO `paraparty_homepage_sliders` VALUES (1, 1, 100, '腾讯云开发大会', '', '/statics/Slider/%E8%85%BE%E8%AE%AF%E4%BA%91%E5%BC%80%E5%8F%91%E5%A4%A7%E4%BC%9A.png', NULL);
INSERT INTO `paraparty_homepage_sliders` VALUES (2, 1, 100, '武大计院的雪', '', '/statics/Slider/%E8%AE%A1%E9%99%A2%E7%9A%84%E9%9B%AA.png', NULL);
INSERT INTO `paraparty_homepage_sliders` VALUES (3, 1, 100, '金秋艺术节', '', '/statics/Slider/%E9%87%91%E7%A7%8B%E8%89%BA%E6%9C%AF%E8%8A%82.jpg', NULL);
INSERT INTO `paraparty_homepage_sliders` VALUES (4, 1, 100, '最美逆行者', '', '/statics/Slider/%E6%9C%80%E7%BE%8E%E9%80%86%E8%A1%8C%E8%80%85.jpg', NULL);
INSERT INTO `paraparty_homepage_sliders` VALUES (5, 1, 100, '樱花', '', '/statics/Slider/%E6%A8%B1%E8%8A%B1.jpg', NULL);

-- ----------------------------
-- Table structure for paraparty_reference
-- ----------------------------
DROP TABLE IF EXISTS `paraparty_reference`;
CREATE TABLE `paraparty_reference`  (
  `id` bigint UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '引用编号',
  `post_id` bigint UNSIGNED NOT NULL COMMENT '回复编号',
  `target_tid` bigint UNSIGNED NOT NULL COMMENT '目标帖子编号',
  `target_pid` bigint UNSIGNED NOT NULL COMMENT '目标回复编号',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of paraparty_reference
-- ----------------------------

-- ----------------------------
-- Table structure for pay_notify
-- ----------------------------
DROP TABLE IF EXISTS `pay_notify`;
CREATE TABLE `pay_notify`  (
  `id` bigint UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '支付通知 id',
  `payment_sn` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '支付编号',
  `user_id` bigint UNSIGNED NOT NULL COMMENT '付款人 id',
  `trade_no` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '商户平台交易号',
  `status` tinyint UNSIGNED NOT NULL DEFAULT 0 COMMENT '0未接受到通知，1收到通知',
  `created_at` datetime(0) NOT NULL COMMENT '创建时间',
  `updated_at` datetime(0) NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 18 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of pay_notify
-- ----------------------------
INSERT INTO `pay_notify` VALUES (1, '202012062010210051', 8, '', 0, '2020-12-06 11:34:07', '2020-12-06 11:34:07');
INSERT INTO `pay_notify` VALUES (2, '202012063910154991', 8, '', 0, '2020-12-06 11:50:54', '2020-12-06 11:50:54');
INSERT INTO `pay_notify` VALUES (3, '202012061456579910', 8, '', 0, '2020-12-06 11:53:44', '2020-12-06 11:53:44');
INSERT INTO `pay_notify` VALUES (4, '202012067298561025', 8, '202012067298561025', 1, '2020-12-06 11:55:39', '2020-12-06 11:55:44');
INSERT INTO `pay_notify` VALUES (5, '202012062254515553', 8, '', 0, '2020-12-06 11:58:14', '2020-12-06 11:58:14');
INSERT INTO `pay_notify` VALUES (6, '202012065656569852', 8, '', 0, '2020-12-06 12:03:36', '2020-12-06 12:03:36');
INSERT INTO `pay_notify` VALUES (7, '202012061548101995', 4, '', 0, '2020-12-06 16:05:36', '2020-12-06 16:05:36');
INSERT INTO `pay_notify` VALUES (8, '202012067997100524', 4, '', 0, '2020-12-06 16:16:10', '2020-12-06 16:16:10');
INSERT INTO `pay_notify` VALUES (9, '202012065997100504', 4, '', 0, '2020-12-06 17:10:02', '2020-12-06 17:10:02');
INSERT INTO `pay_notify` VALUES (10, '202012063757100545', 8, '', 0, '2020-12-06 22:33:29', '2020-12-06 22:33:29');
INSERT INTO `pay_notify` VALUES (11, '202012066455561024', 8, '202012066455561024', 1, '2020-12-06 23:03:19', '2020-12-06 23:03:30');
INSERT INTO `pay_notify` VALUES (12, '202012073655101505', 8, '202012073655101505', 1, '2020-12-07 08:15:03', '2020-12-07 08:15:07');
INSERT INTO `pay_notify` VALUES (13, '202012073852101101', 9, '202012073852101101', 1, '2020-12-07 11:47:48', '2020-12-07 11:47:53');
INSERT INTO `pay_notify` VALUES (14, '202012072310210056', 10, '202012072310210056', 1, '2020-12-07 12:04:47', '2020-12-07 12:04:53');
INSERT INTO `pay_notify` VALUES (15, '202012096554525048', 4, '', 0, '2020-12-09 22:45:58', '2020-12-09 22:45:58');
INSERT INTO `pay_notify` VALUES (16, '202012093851575010', 11, '', 0, '2020-12-09 22:50:27', '2020-12-09 22:50:27');
INSERT INTO `pay_notify` VALUES (17, '202012098898985453', 4, '', 0, '2020-12-09 22:51:39', '2020-12-09 22:51:39');
INSERT INTO `pay_notify` VALUES (18, '202012312049495453', 5, '', 0, '2020-12-31 08:40:17', '2020-12-31 08:40:17');

-- ----------------------------
-- Table structure for post_goods
-- ----------------------------
DROP TABLE IF EXISTS `post_goods`;
CREATE TABLE `post_goods`  (
  `id` bigint UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '商品 id',
  `user_id` bigint UNSIGNED NOT NULL DEFAULT 0 COMMENT '用户 id',
  `post_id` bigint UNSIGNED NOT NULL DEFAULT 0 COMMENT '帖子 id',
  `platform_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '平台商品 id',
  `title` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '商品标题',
  `price` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '价格',
  `image_path` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '商品封面图',
  `type` tinyint UNSIGNED NOT NULL DEFAULT 0 COMMENT '商品来源:0淘宝 1天猫 2京东 等',
  `status` tinyint UNSIGNED NOT NULL DEFAULT 0 COMMENT '商品状态:0正常 1失效/下架',
  `ready_content` text CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '预解析内容',
  `detail_content` text CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '解析详情页地址',
  `created_at` datetime(0) NOT NULL COMMENT '创建时间',
  `updated_at` datetime(0) NOT NULL COMMENT '更新时间',
  `deleted_at` datetime(0) NULL DEFAULT NULL COMMENT '删除时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `idx_user`(`user_id`) USING BTREE,
  INDEX `idx_post`(`post_id`) USING BTREE,
  INDEX `idx_platform`(`platform_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of post_goods
-- ----------------------------

-- ----------------------------
-- Table structure for post_mentions_user
-- ----------------------------
DROP TABLE IF EXISTS `post_mentions_user`;
CREATE TABLE `post_mentions_user`  (
  `post_id` bigint UNSIGNED NOT NULL,
  `mentions_user_id` bigint UNSIGNED NOT NULL,
  PRIMARY KEY (`post_id`, `mentions_user_id`) USING BTREE,
  INDEX `post_mentions_user_mentions_user_id_foreign`(`mentions_user_id`) USING BTREE,
  CONSTRAINT `post_mentions_user_mentions_user_id_foreign` FOREIGN KEY (`mentions_user_id`) REFERENCES `users` (`id`) ON DELETE CASCADE ON UPDATE RESTRICT,
  CONSTRAINT `post_mentions_user_post_id_foreign` FOREIGN KEY (`post_id`) REFERENCES `posts` (`id`) ON DELETE CASCADE ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of post_mentions_user
-- ----------------------------

-- ----------------------------
-- Table structure for post_mod
-- ----------------------------
DROP TABLE IF EXISTS `post_mod`;
CREATE TABLE `post_mod`  (
  `post_id` bigint UNSIGNED NOT NULL COMMENT '帖子 id',
  `stop_word` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '触发的敏感词，半角逗号隔开',
  PRIMARY KEY (`post_id`) USING BTREE,
  CONSTRAINT `post_mod_post_id_foreign` FOREIGN KEY (`post_id`) REFERENCES `posts` (`id`) ON DELETE CASCADE ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of post_mod
-- ----------------------------

-- ----------------------------
-- Table structure for post_user
-- ----------------------------
DROP TABLE IF EXISTS `post_user`;
CREATE TABLE `post_user`  (
  `post_id` bigint UNSIGNED NOT NULL COMMENT '帖子 id',
  `user_id` bigint UNSIGNED NOT NULL COMMENT '用户 id',
  `created_at` datetime(0) NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`post_id`, `user_id`) USING BTREE,
  INDEX `post_user_user_id_foreign`(`user_id`) USING BTREE,
  CONSTRAINT `post_user_post_id_foreign` FOREIGN KEY (`post_id`) REFERENCES `posts` (`id`) ON DELETE CASCADE ON UPDATE RESTRICT,
  CONSTRAINT `post_user_user_id_foreign` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`) ON DELETE CASCADE ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of post_user
-- ----------------------------
INSERT INTO `post_user` VALUES (1, 12, '2020-12-08 15:32:05');
INSERT INTO `post_user` VALUES (2, 5, '2020-12-22 14:16:13');
INSERT INTO `post_user` VALUES (117, 10, '2020-12-08 16:19:50');
INSERT INTO `post_user` VALUES (117, 12, '2020-12-08 15:29:35');
INSERT INTO `post_user` VALUES (120, 10, '2020-12-08 16:20:55');
INSERT INTO `post_user` VALUES (123, 16, '2020-12-08 15:42:40');
INSERT INTO `post_user` VALUES (129, 1, '2020-12-08 18:00:33');
INSERT INTO `post_user` VALUES (131, 9, '2020-12-08 19:36:01');
INSERT INTO `post_user` VALUES (131, 10, '2020-12-09 09:47:35');
INSERT INTO `post_user` VALUES (135, 10, '2020-12-08 19:03:31');
INSERT INTO `post_user` VALUES (157, 1, '2020-12-09 20:01:50');
INSERT INTO `post_user` VALUES (157, 5, '2021-01-21 14:18:44');
INSERT INTO `post_user` VALUES (157, 10, '2020-12-09 20:55:08');
INSERT INTO `post_user` VALUES (158, 4, '2020-12-11 17:12:44');
INSERT INTO `post_user` VALUES (159, 1, '2020-12-09 21:49:42');
INSERT INTO `post_user` VALUES (159, 9, '2020-12-09 20:21:02');
INSERT INTO `post_user` VALUES (159, 10, '2020-12-09 21:27:09');
INSERT INTO `post_user` VALUES (160, 5, '2020-12-22 14:16:55');
INSERT INTO `post_user` VALUES (165, 5, '2020-12-22 14:16:29');

-- ----------------------------
-- Table structure for posts
-- ----------------------------
DROP TABLE IF EXISTS `posts`;
CREATE TABLE `posts`  (
  `id` bigint UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '回复 id',
  `user_id` bigint UNSIGNED NULL DEFAULT NULL COMMENT '发表用户 id',
  `thread_id` bigint UNSIGNED NULL DEFAULT NULL COMMENT '关联主题 id',
  `reply_post_id` bigint UNSIGNED NULL DEFAULT NULL COMMENT '回复 id',
  `reply_user_id` bigint UNSIGNED NULL DEFAULT NULL COMMENT '回复用户 id',
  `content` text CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL COMMENT '内容',
  `ip` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT 'ip 地址',
  `port` int UNSIGNED NOT NULL DEFAULT 0 COMMENT '端口',
  `reply_count` int UNSIGNED NOT NULL DEFAULT 0 COMMENT '关联回复数',
  `like_count` int UNSIGNED NOT NULL DEFAULT 0 COMMENT '喜欢数',
  `created_at` datetime(0) NOT NULL COMMENT '创建时间',
  `updated_at` datetime(0) NOT NULL COMMENT '更新时间',
  `deleted_at` datetime(0) NULL DEFAULT NULL COMMENT '删除时间',
  `deleted_user_id` bigint UNSIGNED NULL DEFAULT NULL COMMENT '删除用户 id',
  `is_first` tinyint UNSIGNED NOT NULL DEFAULT 0 COMMENT '是否首个回复',
  `is_comment` tinyint UNSIGNED NOT NULL DEFAULT 0 COMMENT '是否是回复回帖的内容',
  `is_approved` tinyint UNSIGNED NOT NULL DEFAULT 1 COMMENT '是否合法',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `posts_user_id_foreign`(`user_id`) USING BTREE,
  INDEX `posts_deleted_user_id_foreign`(`deleted_user_id`) USING BTREE,
  INDEX `posts_thread_id_index`(`thread_id`) USING BTREE,
  INDEX `idx_reply_post_id`(`reply_post_id`) USING BTREE,
  CONSTRAINT `posts_deleted_user_id_foreign` FOREIGN KEY (`deleted_user_id`) REFERENCES `users` (`id`) ON DELETE SET NULL ON UPDATE RESTRICT,
  CONSTRAINT `posts_user_id_foreign` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`) ON DELETE SET NULL ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 186 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of posts
-- ----------------------------
INSERT INTO `posts` VALUES (1, 1, 1, NULL, NULL, '<t><p>歪比歪比，歪比巴卜。</p></t>', '127.0.0.1,113.73.211.181', 60252, 0, 1, '2020-08-16 12:04:22', '2020-12-08 11:45:57', NULL, NULL, 1, 0, 1);
INSERT INTO `posts` VALUES (2, 1, 2, NULL, NULL, '<t><p>这里是一楼</p></t>', '127.0.0.1,113.73.211.181', 37442, 0, 1, '2020-08-16 12:05:04', '2020-08-16 12:05:04', NULL, NULL, 1, 0, 1);
INSERT INTO `posts` VALUES (3, 1, 2, NULL, NULL, '<t>这里是 2 楼</t>', '127.0.0.1,113.73.211.181', 49970, 1, 0, '2020-08-16 12:08:51', '2020-08-16 13:17:27', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (4, 1, 2, NULL, NULL, '<t>这里是 3 楼</t>', '240e:61:141b:7100:759b:d8a0:6431:70d8', 33164, 0, 0, '2020-08-16 12:10:24', '2020-08-16 12:10:24', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (5, 1, 2, NULL, NULL, '<t>这里是 4 楼</t>', '240e:61:141b:7100:759b:d8a0:6431:70d8', 33164, 0, 0, '2020-08-16 12:10:54', '2020-08-16 12:10:54', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (6, 1, 2, NULL, NULL, '<t>这里是 5 楼</t>', '240e:61:141b:7100:759b:d8a0:6431:70d8', 33594, 0, 0, '2020-08-16 12:10:55', '2020-08-16 12:10:55', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (7, 1, 2, NULL, NULL, '<t>这里是 6 楼</t>', '240e:61:141b:7100:759b:d8a0:6431:70d8', 34914, 0, 0, '2020-08-16 12:10:57', '2020-08-16 12:10:57', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (8, 1, 2, NULL, NULL, '<t>这里是 7 楼</t>', '240e:61:141b:7100:759b:d8a0:6431:70d8', 33594, 0, 0, '2020-08-16 12:10:57', '2020-08-16 12:10:57', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (9, 1, 2, NULL, NULL, '<t>这里是 8 楼</t>', '240e:61:141b:7100:759b:d8a0:6431:70d8', 34914, 0, 0, '2020-08-16 12:10:57', '2020-08-16 12:10:57', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (10, 1, 2, NULL, NULL, '<t>这里是 9 楼</t>', '240e:61:141b:7100:759b:d8a0:6431:70d8', 33164, 0, 0, '2020-08-16 12:11:00', '2020-08-16 12:11:00', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (11, 1, 2, NULL, NULL, '<t>这里是 10 楼</t>', '240e:61:141b:7100:759b:d8a0:6431:70d8', 33594, 0, 0, '2020-08-16 12:11:02', '2020-08-16 12:11:02', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (12, 1, 2, NULL, NULL, '<t>这里是 11 楼</t>', '113.73.211.181', 54744, 0, 0, '2020-08-16 12:25:44', '2020-08-16 12:25:44', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (13, 1, 2, NULL, NULL, '<t>这里是 12 楼</t>', '113.73.211.181', 55814, 0, 0, '2020-08-16 12:25:44', '2020-08-16 12:25:44', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (14, 1, 2, NULL, NULL, '<t>这里是 13 楼</t>', '113.73.211.181', 55814, 0, 0, '2020-08-16 12:25:45', '2020-08-16 12:25:45', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (15, 1, 2, NULL, NULL, '<t>这里是 14 楼</t>', '113.73.211.181', 57912, 0, 0, '2020-08-16 12:25:46', '2020-08-16 12:25:46', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (16, 1, 2, NULL, NULL, '<t>这里是 15 楼</t>', '113.73.211.181', 58996, 0, 0, '2020-08-16 12:25:46', '2020-08-16 12:25:46', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (17, 1, 2, NULL, NULL, '<t>这里是 16 楼</t>', '113.73.211.181', 60438, 0, 0, '2020-08-16 12:25:47', '2020-08-16 12:25:47', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (18, 1, 2, NULL, NULL, '<t>这里是 17 楼</t>', '113.73.211.181', 55814, 0, 0, '2020-08-16 12:25:48', '2020-08-16 12:25:48', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (19, 1, 2, NULL, NULL, '<t>这里是 18 楼</t>', '113.73.211.181', 57912, 0, 0, '2020-08-16 12:25:49', '2020-08-16 12:25:49', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (20, 1, 2, NULL, NULL, '<t>这里是 19 楼</t>', '113.73.211.181', 60438, 0, 0, '2020-08-16 12:25:49', '2020-08-16 12:25:49', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (21, 1, 2, NULL, NULL, '<t>这里是 20 楼</t>', '113.73.211.181', 55814, 0, 0, '2020-08-16 12:25:50', '2020-08-16 12:25:50', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (22, 1, 2, NULL, NULL, '<t>这里是 21 楼</t>', '113.73.211.181', 58996, 0, 0, '2020-08-16 12:25:50', '2020-08-16 12:25:50', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (23, 1, 2, NULL, NULL, '<t>这里是 22 楼</t>', '113.73.211.181', 10050, 0, 0, '2020-08-16 12:25:51', '2020-08-16 12:25:51', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (24, 1, 2, NULL, NULL, '<t>这里是 23 楼</t>', '113.73.211.181', 55814, 0, 0, '2020-08-16 12:25:51', '2020-08-16 12:25:51', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (25, 1, 2, NULL, NULL, '<t>这里是 24 楼</t>', '113.73.211.181', 58996, 0, 0, '2020-08-16 12:25:51', '2020-08-16 12:25:51', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (26, 1, 2, NULL, NULL, '<t>这里是 25 楼</t>', '113.73.211.181', 60438, 0, 0, '2020-08-16 12:25:52', '2020-08-16 12:25:52', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (27, 1, 2, NULL, NULL, '<t>这里是 26 楼</t>', '113.73.211.181', 54744, 0, 0, '2020-08-16 12:25:53', '2020-08-16 12:25:53', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (28, 1, 2, NULL, NULL, '<t>这里是 27 楼</t>', '113.73.211.181', 58996, 0, 0, '2020-08-16 12:25:54', '2020-08-16 12:25:54', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (29, 1, 2, NULL, NULL, '<t>这里是 28 楼</t>', '113.73.211.181', 60438, 0, 0, '2020-08-16 12:25:54', '2020-08-16 12:25:54', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (30, 1, 2, NULL, NULL, '<t>这里是 29 楼</t>', '113.73.211.181', 18492, 0, 0, '2020-08-16 12:25:55', '2020-08-16 12:25:55', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (31, 1, 2, NULL, NULL, '<t>这里是 30 楼</t>', '113.73.211.181', 57912, 0, 0, '2020-08-16 12:25:55', '2020-08-16 12:25:55', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (32, 1, 2, NULL, NULL, '<t>这里是 31 楼</t>', '113.73.211.181', 54744, 0, 0, '2020-08-16 12:25:55', '2020-08-16 12:25:55', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (33, 1, 2, NULL, NULL, '<t>这里是 32 楼</t>', '113.73.211.181', 21280, 0, 0, '2020-08-16 12:25:56', '2020-08-16 12:25:56', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (34, 1, 2, NULL, NULL, '<t>这里是 33 楼</t>', '113.73.211.181', 10050, 0, 0, '2020-08-16 12:25:56', '2020-08-16 12:25:56', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (35, 1, 2, NULL, NULL, '<t>这里是 34 楼</t>', '113.73.211.181', 55814, 0, 0, '2020-08-16 12:25:57', '2020-08-16 12:25:57', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (36, 1, 2, NULL, NULL, '<t>这里是 35 楼</t>', '113.73.211.181', 57912, 0, 0, '2020-08-16 12:25:57', '2020-08-16 12:25:57', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (37, 1, 2, NULL, NULL, '<t>这里是 36 楼</t>', '113.73.211.181', 18492, 0, 0, '2020-08-16 12:25:58', '2020-08-16 12:25:58', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (38, 1, 2, NULL, NULL, '<t>这里是 37 楼</t>', '113.73.211.181', 55814, 0, 0, '2020-08-16 12:25:59', '2020-08-16 12:25:59', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (39, 1, 2, NULL, NULL, '<t>这里是 38 楼</t>', '113.73.211.181', 58996, 0, 0, '2020-08-16 12:25:59', '2020-08-16 12:25:59', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (40, 1, 2, NULL, NULL, '<t>这里是 39 楼</t>', '113.73.211.181', 54744, 0, 0, '2020-08-16 12:26:00', '2020-08-16 12:26:00', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (41, 1, 2, NULL, NULL, '<t>这里是 40 楼</t>', '113.73.211.181', 54744, 0, 0, '2020-08-16 12:26:00', '2020-08-16 12:26:00', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (42, 1, 2, NULL, NULL, '<t>这里是 41 楼</t>', '113.73.211.181', 58996, 0, 0, '2020-08-16 12:26:01', '2020-08-16 12:26:01', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (43, 1, 2, NULL, NULL, '<t>这里是 42 楼</t>', '113.73.211.181', 54744, 0, 0, '2020-08-16 12:26:02', '2020-08-16 12:26:02', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (44, 1, 2, NULL, NULL, '<t>这里是 43 楼</t>', '113.73.211.181', 21280, 0, 0, '2020-08-16 12:26:02', '2020-08-16 12:26:02', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (45, 1, 2, NULL, NULL, '<t>这里是 44 楼</t>', '113.73.211.181', 58996, 0, 0, '2020-08-16 12:26:02', '2020-08-16 12:26:02', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (46, 1, 2, NULL, NULL, '<t>这里是 45 楼</t>', '113.73.211.181', 57912, 0, 0, '2020-08-16 12:26:03', '2020-08-16 12:26:03', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (47, 1, 2, NULL, NULL, '<t>这里是 46 楼</t>', '113.73.211.181', 60438, 0, 0, '2020-08-16 12:26:04', '2020-08-16 12:26:04', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (48, 1, 2, NULL, NULL, '<t>这里是 47 楼</t>', '113.73.211.181', 55814, 0, 0, '2020-08-16 12:26:04', '2020-08-16 12:26:04', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (49, 1, 2, NULL, NULL, '<t>这里是 48 楼</t>', '113.73.211.181', 10050, 0, 0, '2020-08-16 12:26:05', '2020-08-16 12:26:05', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (50, 1, 2, NULL, NULL, '<t>这里是 49 楼</t>', '113.73.211.181', 55814, 0, 0, '2020-08-16 12:26:06', '2020-08-16 12:26:06', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (51, 1, 2, NULL, NULL, '<t>这里是 50 楼</t>', '113.73.211.181', 58996, 0, 0, '2020-08-16 12:26:07', '2020-08-16 12:26:07', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (52, 1, 2, NULL, NULL, '<t>这里是 51 楼</t>', '113.73.211.181', 55814, 0, 0, '2020-08-16 12:26:07', '2020-08-16 12:26:07', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (53, 1, 2, NULL, NULL, '<t>这里是 52 楼</t>', '113.73.211.181', 54744, 0, 0, '2020-08-16 12:26:08', '2020-08-16 12:26:08', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (54, 1, 2, NULL, NULL, '<t>这里是 53 楼</t>', '113.73.211.181', 60438, 0, 0, '2020-08-16 12:26:08', '2020-08-16 12:26:08', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (55, 1, 2, NULL, NULL, '<t>这里是 54 楼</t>', '113.73.211.181', 58996, 0, 0, '2020-08-16 12:26:08', '2020-08-16 12:26:08', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (56, 1, 2, NULL, NULL, '<t>这里是 55 楼</t>', '113.73.211.181', 55814, 0, 0, '2020-08-16 12:26:09', '2020-08-16 12:26:09', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (57, 1, 2, NULL, NULL, '<t>这里是 56 楼</t>', '113.73.211.181', 58996, 0, 0, '2020-08-16 12:26:09', '2020-08-16 12:26:09', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (58, 1, 2, NULL, NULL, '<t>这里是 57 楼</t>', '113.73.211.181', 57912, 0, 0, '2020-08-16 12:26:09', '2020-08-16 12:26:09', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (59, 1, 2, NULL, NULL, '<t>这里是 58 楼</t>', '113.73.211.181', 54744, 0, 0, '2020-08-16 12:26:10', '2020-08-16 12:26:10', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (60, 1, 2, NULL, NULL, '<t>这里是 59 楼</t>', '113.73.211.181', 58996, 0, 0, '2020-08-16 12:26:11', '2020-08-16 12:26:11', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (61, 1, 2, NULL, NULL, '<t>这里是 60 楼</t>', '113.73.211.181', 55814, 0, 0, '2020-08-16 12:26:11', '2020-08-16 12:26:11', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (62, 1, 2, NULL, NULL, '<t>这里是 61 楼</t>', '113.73.211.181', 18492, 0, 0, '2020-08-16 12:26:11', '2020-08-16 12:26:11', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (63, 1, 2, NULL, NULL, '<t>这里是 62 楼</t>', '113.73.211.181', 57912, 0, 0, '2020-08-16 12:26:12', '2020-08-16 12:26:12', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (64, 1, 2, NULL, NULL, '<t>这里是 63 楼</t>', '113.73.211.181', 54744, 0, 0, '2020-08-16 12:26:13', '2020-08-16 12:26:13', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (65, 1, 2, NULL, NULL, '<t>这里是 64 楼</t>', '113.73.211.181', 57912, 0, 0, '2020-08-16 12:26:13', '2020-08-16 12:26:13', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (66, 1, 2, NULL, NULL, '<t>这里是 65 楼</t>', '113.73.211.181', 58996, 0, 0, '2020-08-16 12:26:14', '2020-08-16 12:26:14', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (67, 1, 2, NULL, NULL, '<t>这里是 66 楼</t>', '113.73.211.181', 55814, 0, 0, '2020-08-16 12:26:15', '2020-08-16 12:26:15', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (68, 1, 2, NULL, NULL, '<t>这里是 67 楼</t>', '113.73.211.181', 54744, 0, 0, '2020-08-16 12:26:15', '2020-08-16 12:26:16', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (69, 1, 2, NULL, NULL, '<t>这里是 68 楼</t>', '113.73.211.181', 58996, 0, 0, '2020-08-16 12:26:16', '2020-08-16 12:26:16', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (70, 1, 2, NULL, NULL, '<t>这里是 69 楼</t>', '113.73.211.181', 55814, 0, 0, '2020-08-16 12:26:16', '2020-08-16 12:26:16', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (71, 1, 2, NULL, NULL, '<t>这里是 70 楼</t>', '113.73.211.181', 54744, 0, 0, '2020-08-16 12:26:17', '2020-08-16 12:26:17', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (72, 1, 2, NULL, NULL, '<t>这里是 71 楼</t>', '113.73.211.181', 54744, 0, 0, '2020-08-16 12:26:17', '2020-08-16 12:26:17', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (73, 1, 2, NULL, NULL, '<t>这里是 72 楼</t>', '113.73.211.181', 10050, 0, 0, '2020-08-16 12:26:17', '2020-08-16 12:26:17', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (74, 1, 2, NULL, NULL, '<t>这里是 73 楼</t>', '113.73.211.181', 58996, 0, 0, '2020-08-16 12:26:18', '2020-08-16 12:26:18', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (75, 1, 2, NULL, NULL, '<t>这里是 74 楼</t>', '113.73.211.181', 55814, 0, 0, '2020-08-16 12:26:18', '2020-08-16 12:26:18', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (76, 1, 2, NULL, NULL, '<t>这里是 75 楼</t>', '113.73.211.181', 57912, 0, 0, '2020-08-16 12:26:19', '2020-08-16 12:26:19', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (77, 1, 2, NULL, NULL, '<t>这里是 76 楼</t>', '113.73.211.181', 60438, 0, 0, '2020-08-16 12:26:19', '2020-08-16 12:26:19', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (78, 1, 2, NULL, NULL, '<t>这里是 77 楼</t>', '113.73.211.181', 57912, 0, 0, '2020-08-16 12:26:20', '2020-08-16 12:26:20', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (79, 1, 2, NULL, NULL, '<t>这里是 78 楼</t>', '113.73.211.181', 55814, 0, 0, '2020-08-16 12:26:20', '2020-08-16 12:26:20', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (80, 1, 2, NULL, NULL, '<t>这里是 79 楼</t>', '113.73.211.181', 60438, 0, 0, '2020-08-16 12:26:20', '2020-08-16 12:26:20', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (81, 1, 2, NULL, NULL, '<t>这里是 80 楼</t>', '113.73.211.181', 60438, 0, 0, '2020-08-16 12:26:22', '2020-08-16 12:26:22', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (82, 1, 2, NULL, NULL, '<t>这里是 81 楼</t>', '113.73.211.181', 21280, 0, 0, '2020-08-16 12:26:22', '2020-08-16 12:26:22', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (83, 1, 2, NULL, NULL, '<t>这里是 82 楼</t>', '113.73.211.181', 18492, 0, 0, '2020-08-16 12:26:22', '2020-08-16 12:26:22', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (84, 1, 2, NULL, NULL, '<t>这里是 83 楼</t>', '113.73.211.181', 57912, 0, 0, '2020-08-16 12:26:23', '2020-08-16 12:26:23', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (85, 1, 2, NULL, NULL, '<t>这里是 84 楼</t>', '113.73.211.181', 54744, 0, 0, '2020-08-16 12:26:24', '2020-08-16 12:26:24', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (86, 1, 2, NULL, NULL, '<t>这里是 85 楼</t>', '113.73.211.181', 55814, 0, 0, '2020-08-16 12:26:25', '2020-08-16 12:26:25', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (87, 1, 2, NULL, NULL, '<t>这里是 86 楼</t>', '113.73.211.181', 21280, 0, 0, '2020-08-16 12:26:26', '2020-08-16 12:26:26', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (88, 1, 2, NULL, NULL, '<t>这里是 87 楼</t>', '113.73.211.181', 54744, 0, 0, '2020-08-16 12:26:26', '2020-08-16 12:26:26', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (89, 1, 2, NULL, NULL, '<t>这里是 88 楼</t>', '113.73.211.181', 60438, 0, 0, '2020-08-16 12:26:27', '2020-08-16 12:26:27', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (90, 1, 2, NULL, NULL, '<t>这里是 89 楼</t>', '113.73.211.181', 55814, 0, 0, '2020-08-16 12:26:28', '2020-08-16 12:26:28', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (91, 1, 2, NULL, NULL, '<t>这里是 90 楼</t>', '113.73.211.181', 54744, 0, 0, '2020-08-16 12:26:29', '2020-08-16 12:26:29', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (92, 1, 2, NULL, NULL, '<t>这里是 91 楼</t>', '113.73.211.181', 58996, 0, 0, '2020-08-16 12:26:30', '2020-08-16 12:26:30', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (93, 1, 2, NULL, NULL, '<t>这里是 92 楼</t>', '113.73.211.181', 10050, 0, 0, '2020-08-16 12:26:30', '2020-08-16 12:26:30', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (94, 1, 2, NULL, NULL, '<t>这里是 93 楼</t>', '113.73.211.181', 54744, 0, 0, '2020-08-16 12:26:31', '2020-08-16 12:26:31', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (95, 1, 2, NULL, NULL, '<t>这里是 94 楼</t>', '113.73.211.181', 58996, 0, 0, '2020-08-16 12:26:31', '2020-08-16 12:26:31', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (96, 1, 2, NULL, NULL, '<t>这里是 95 楼</t>', '113.73.211.181', 58996, 0, 0, '2020-08-16 12:26:32', '2020-08-16 12:26:32', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (97, 1, 2, NULL, NULL, '<t>这里是 96 楼</t>', '113.73.211.181', 60438, 0, 0, '2020-08-16 12:26:32', '2020-08-16 12:26:32', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (98, 1, 2, NULL, NULL, '<t>这里是 97 楼</t>', '113.73.211.181', 10050, 0, 0, '2020-08-16 12:26:33', '2020-08-16 12:26:33', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (99, 1, 2, NULL, NULL, '<t>这里是 98 楼</t>', '113.73.211.181', 60438, 0, 0, '2020-08-16 12:26:33', '2020-08-16 12:26:33', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (100, 1, 2, NULL, NULL, '<t>这里是 99 楼</t>', '113.73.211.181', 60438, 0, 0, '2020-08-16 12:26:33', '2020-08-16 12:26:33', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (101, 1, 2, NULL, NULL, '<t>这里是 100 楼</t>', '113.73.211.181', 55814, 1, 0, '2020-08-16 12:26:34', '2020-08-16 13:29:31', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (102, 1, 2, 3, 1, '<t>这里是 101 楼<br/>\n回复 2 楼的帖子</t>', '127.0.0.1,113.73.211.181', 50668, 0, 0, '2020-08-16 13:17:27', '2020-08-16 13:17:27', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (103, 1, 2, 101, 1, '<t>这里是 102 楼<br/>\n回复 100 楼的帖子</t>', '127.0.0.1,113.73.211.181', 18496, 0, 0, '2020-08-16 13:29:31', '2020-08-16 13:29:31', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (104, 1, 1, NULL, NULL, '<t>Are you ready?<br/>\n<br/>\nAdrenaline is pumping, <br/>\nAdrenaline is pumping, <br/>\nGenerator. Automatic Lover.<br/>\n<br/>\nAtomic, Atomic, Overdrive, <br/>\nBlockbuster,<br/>\nBrainpower.<br/>\n<br/>\nCall me a leader. Cocaine, <br/>\nDon\'t you try it, Don\'t you try it.<br/>\n<br/>\nInnovator, Kill machine,<br/>\nThere\'s no fate.<br/>\nTake control.<br/>\nBrainpower,<br/>\nLet the bass kick!<br/>\n<br/>\n[color=blue]O-oooooooooo AAAAE-A-A-I-A-U- JO-oooooooooooo AAE-O-A-A-U-U-A- E-eee-ee-eee AAAAE-A-E-I-E-A-<br/>\nJO-ooo-oo-oo-oo EEEEO-A-AAA-AAAA [/color]<br/>\n<br/>\n[color=red]O-oooooooooo AAAAE-A-A-I-A-U- JO-oooooooooooo AAE-O-A-A-U-U-A- E-eee-ee-eee AAAAE-A-E-I-E-A-<br/>\nJO-ooo-oo-oo-oo EEEEO-A-AAA-AAAA [/color]<br/>\n<br/>\n[color=purple]O-oooooooooo AAAAE-A-A-I-A-U- JO-oooooooooooo AAE-O-A-A-U-U-A- E-eee-ee-eee AAAAE-A-E-I-E-A-<br/>\nJO-ooo-oo-oo-oo EEEEO-A-AAA-AAAA-O----------[/color]</t>', '127.0.0.1,113.73.211.181', 52942, 0, 0, '2020-08-16 13:38:29', '2020-08-16 13:38:29', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (105, 1, 1, NULL, NULL, '<t>When we\'re alone and the world is gone<br/>\nI turn to you, you\'re my number one<br/>\nGood days and bad days can\'t compare<br/>\nTo the feeling I have when I\'ve got you there<br/>\n<br/>\nSo hold on so tightly, that you\'ll never let me go<br/>\nHold on so tightly, we won\'t break if we explode<br/>\nHold on so tightly, that you\'ll never let me go<br/>\nHold on so tightly, together we are unshakable<br/>\n<br/>\nUnshakable<br/>\n<br/>\nUnshakable<br/>\nWe are unshakable<br/>\nUnshakable</t>', '127.0.0.1,113.73.211.181', 23104, 0, 0, '2020-08-16 13:40:21', '2020-08-16 13:40:21', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (106, 1, 3, NULL, NULL, '<t><p>[img=ori]https://res.cloudinary.com/paracraft/image/upload/v1594796534/public/attachments/2020/07/15/N9HOvi8gcwzvSpGBlqE7K3EdkaZHtJQOUaCrfNPm.jpeg.jpg[/img]</p>\n\n<p>可可爱爱</p></t>', '127.0.0.1,113.73.211.181', 38116, 0, 0, '2020-08-16 19:53:33', '2020-08-16 19:53:33', NULL, NULL, 1, 0, 1);
INSERT INTO `posts` VALUES (107, 1, 4, NULL, NULL, '<t>GPA 计算公式<br/>\n<br/>\n[latex]\\overline{G} = \\frac{\\sum W_{i} * G_{i}}{\\sum W_{i}}[/latex]<br/>\n<br/>\n[latex]\\overline{P} = \\frac{\\sum W_{i} * GPA(G_{i})}{\\sum W_{i}}[/latex]</t>', '127.0.0.1,218.197.153.63', 17466, 0, 0, '2020-11-24 22:10:34', '2020-11-24 22:10:34', NULL, NULL, 1, 0, 1);
INSERT INTO `posts` VALUES (108, 1, 5, NULL, NULL, '<t>[code=pascal]var a,b : longint;<br/>\nbegin<br/>\n    readln(a, b);<br/>\n    writeln(a + b);<br/>\nend[/code]</t>', '127.0.0.1,218.197.153.63', 34586, 0, 0, '2020-11-25 14:36:01', '2020-11-25 14:36:01', NULL, NULL, 1, 0, 1);
INSERT INTO `posts` VALUES (109, 1, 5, NULL, NULL, '<t>A+B Problem 的 C++ 参考代码<br/>\n<br/>\n[code=cpp]#include &lt;iostream&gt;<br/>\n#include &lt;cstdio&gt;<br/>\n<br/>\nusing namespace std;<br/>\n<br/>\nint main() {<br/>\n    int a,b;<br/>\n    cin &gt;&gt; a &gt;&gt; b;<br/>\n    cout &lt;&lt; a+b;<br/>\n    return 0;<br/>\n}[/code]<br/>\n<br/>\n其中[code=cpp,inline]using namespace std;[/code]的含义为阿巴阿巴。</t>', '127.0.0.1,218.197.153.63', 62572, 0, 0, '2020-11-25 15:26:13', '2020-11-25 15:26:13', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (110, 1, 5, NULL, NULL, '<t>密集排版测试<br/>\r\n[code=kt]fun main(args: Array&lt;String&gt;) {<br/>\r\n    val (a, b) = readLine()!!.split(\' \').map(String::toInt)<br/>\r\n    println(a + b)<br/>\r\n}[/code]密集排版测试</t>', '127.0.0.1,218.197.153.63', 30998, 0, 0, '2020-11-25 15:29:55', '2020-11-25 15:29:55', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (111, 1, 6, NULL, NULL, '<t><p>普通分享<br/>\n[fileshare]18[/fileshare]</p>\n\n<p>密码保护分享：<br/>\n密码：[code=inline]123456[/code]<br/>\n[fileshare]19[/fileshare]</p>\n\n<p>付费分享：<br/>\n[fileshare]20[/fileshare]</p>\n</t>', '::1,2001:250:4001:103:a9dc:d7f7:79:5688', 20774, 0, 0, '2020-12-05 14:23:41', '2020-12-16 21:08:09', NULL, NULL, 1, 0, 1);
INSERT INTO `posts` VALUES (112, 10, 6, NULL, NULL, '<t><p>我来测试一下</p></t>', '2001:250:4001:103:185b:1a09:8209:6bdb', 14942, 0, 0, '2020-12-07 12:20:25', '2020-12-07 12:20:25', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (113, 10, 6, NULL, NULL, '<t><p>测试</p></t>', '2001:250:4001:103:185b:1a09:8209:6bdb', 54614, 0, 0, '2020-12-07 12:20:54', '2020-12-07 12:20:54', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (114, 1, 1, NULL, NULL, '<t><p>test122222</p></t>', '::1,218.197.153.63', 38718, 0, 0, '2020-12-08 10:51:00', '2020-12-08 14:01:24', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (115, 10, 7, NULL, NULL, '<t><p>冲鸭[color=red]冲鸭[b][/b]冲鸭[/color]</p></t>', '140.227.125.233', 64578, 0, 0, '2020-12-08 11:33:18', '2020-12-08 11:33:18', NULL, NULL, 1, 0, 1);
INSERT INTO `posts` VALUES (116, 1, 1, NULL, NULL, '<t><p>放弃编辑后发帖</p></t>', '::1,2001:250:4001:103:410:98a:939b:163', 23076, 0, 0, '2020-12-08 14:01:45', '2020-12-08 14:01:45', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (117, 4, 8, NULL, NULL, '<t><p>随便翻到的一本书[fileshare]24[/fileshare]</p></t>', '10.133.90.64,218.197.153.104', 45646, 0, 2, '2020-12-08 14:24:14', '2020-12-08 14:24:14', NULL, NULL, 1, 0, 1);
INSERT INTO `posts` VALUES (118, 1, 9, NULL, NULL, '<t><p>[size=xl]目录[/size]<br/>\n[ol]<br/>\n[li][url=https://wango.club/forums/topics/9?n=2]2L[/url]: 论坛基本结构与操作[/li]<br/>\n[li][url=https://wango.club/forums/topics/9?n=3]3L[/url]: 文件管理基本操作[/li]<br/>\n[/ol]</p></t>', '::1,2001:250:4001:103:410:98a:939b:163', 55048, 0, 0, '2020-12-08 14:38:31', '2020-12-15 13:46:00', NULL, NULL, 1, 0, 1);
INSERT INTO `posts` VALUES (119, 1, 9, NULL, NULL, '<t><p>访问论坛后顶部为搜索框与菜单，右上角为个人信息，左侧为通知中心等其余部分。主体部分为首页推送与论坛板各板块。<br/>\n[img=首页]https://res.cloudinary.com/paracraft/image/upload/v1607414666/sourcelay/help/home.png[/img]</p>\n\n<p>注册界面简明，只需输入用户名和密码。<br/>\n[img=注册]https://res.cloudinary.com/paracraft/image/upload/v1607414665/sourcelay/help/register.png[/img]</p>\n\n<p>登陆后可以在个人信息中进入设置界面修改一些基本信息。<br/>\n其中邮箱列用于获取您的 [url=http://gravatar.com/]Gravatar[/url] 的全年龄段头像。<br/>\n[img=修改信息]https://res.cloudinary.com/paracraft/image/upload/v1607414666/sourcelay/help/update.png[/img]</p>\n\n<p>进入板块或帖子后可以进行自由发帖，我们论坛采用的排版系统为[code=inline]BBCode[/code]语法的排版系统。因此常用的 BBCode 语法依然可以在我们论坛中正常使用。当然，如果不熟悉[code=inline]BBCode[/code]，我们依然在编辑框左下角提供了一系列的常用[code=inline]BBCode[/code]快捷键。 √<br/>\n[img=发帖]https://res.cloudinary.com/paracraft/image/upload/v1607414665/sourcelay/help/edit.png[/img]</p>\n\n\n<p>本论坛提供的特殊[code=inline]BBCode[/code]列表：<br/>\n[ul]<br/>\n[li][code][code=语言,inline]：代码块[/code][/li]<br/>\n[li][code][code=语言]：内联代码[/code][/li]<br/>\n[li][code][latex] LaTeX 语法支持[/code][/li]<br/>\n[li][code][black] 隐藏文本[/code][/li]<br/>\n[/ul]</p></t>', '::1,2001:250:4001:103:410:98a:939b:163', 26824, 0, 0, '2020-12-08 15:01:52', '2020-12-09 11:51:48', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (120, 9, 8, NULL, NULL, '<t><p>棒棒哒！</p></t>', '218.197.153.252', 19128, 0, 1, '2020-12-08 15:07:52', '2020-12-08 15:07:52', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (121, 9, 7, NULL, NULL, '<t><p>#冲鸭</p></t>', '218.197.153.252', 59222, 0, 0, '2020-12-08 15:10:13', '2020-12-08 15:10:13', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (122, 9, 7, NULL, NULL, '<t><p>啛啛喳喳c</p></t>', '218.197.153.252', 59222, 0, 0, '2020-12-08 15:10:35', '2020-12-08 15:10:35', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (123, 9, 7, NULL, NULL, '<t><p>虫儿</p></t>', '218.197.153.252', 12394, 0, 1, '2020-12-08 15:10:41', '2020-12-08 15:10:41', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (124, 9, 4, NULL, NULL, '<t><p>冲啊</p></t>', '218.197.153.252', 58078, 0, 0, '2020-12-08 15:11:10', '2020-12-08 15:11:10', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (125, 9, 4, NULL, NULL, '<t><p>冲啊</p></t>', '218.197.153.252', 58078, 0, 0, '2020-12-08 15:11:40', '2020-12-08 15:11:40', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (126, 9, 10, NULL, NULL, '<t><p>组队组队组队[color=purple]组队组队[/color]</p></t>', '218.197.153.252', 18694, 0, 0, '2020-12-08 15:48:25', '2020-12-08 15:48:25', NULL, NULL, 1, 0, 1);
INSERT INTO `posts` VALUES (127, 11, 10, NULL, NULL, '<t><p>好！加油！</p></t>', '::1,218.197.153.63', 25162, 1, 0, '2020-12-08 15:57:22', '2020-12-08 15:57:22', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (128, 12, 11, NULL, NULL, '<t><p>[img=微博图]https://wx4.sinaimg.cn/large/0067Lrddgy1glar6n6f7fj31hc0u07wk.jpg[/img]</p></t>', '221.234.202.178', 18704, 0, 0, '2020-12-08 15:59:32', '2020-12-08 15:59:32', NULL, NULL, 1, 0, 1);
INSERT INTO `posts` VALUES (129, 10, 8, NULL, NULL, '<t><p>我为什么不能下载，呜呜呜呜<br/>\n[size=xl][color=blue]垃圾dzy，你肯定是在针对我[/color][/size]</p></t>', '2001:250:4001:103:3c0b:187d:98c4:a687', 47728, 0, 1, '2020-12-08 16:20:30', '2020-12-08 16:20:30', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (130, 5, 10, 127, 11, '<t><p>[black]我就看看回复还有没有用[/black]</p></t>', '127.0.0.1,49.80.77.173', 63018, 0, 0, '2020-12-08 16:21:35', '2020-12-08 16:21:35', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (131, 1, 9, NULL, NULL, '<t><p>在论坛的搜索栏旁边的菜单中可以进入[url=/files]我的文件[/url]界面，在其中可以自由地管理您的文件。</p>\n\n<p>在已上传的文件中选择分享文件，可以将您的文件分享给其他人。<br/>\n[img=选择分享文件]https://res.cloudinary.com/paracraft/image/upload/v1607421561/sourcelay/help/shareFile.png[/img]</p>\n\n<p>我们对文件的分享提供了 3 种不同的分享模式。<br/>\n[img=选择分享模式]https://res.cloudinary.com/paracraft/image/upload/v1607421561/sourcelay/help/shareDialog.png[/img]<br/>\n[ol]<br/>\n[li]公开分享：会出现在文件聚合中[/li]<br/>\n[li]私密分享：不会出现在文件聚合中[/li]<br/>\n[li]付费分享：不会出现在文件聚合中[/li]<br/>\n[/ol]</p>\n\n<p>如果您有需要将你的文件嵌入到帖子中显示，则可以使用下图中最右边的按钮将分享直接嵌入到帖子内。<br/>\n[img=发帖]https://res.cloudinary.com/paracraft/image/upload/v1607414665/sourcelay/help/edit.png[/img]</p></t>', '::1,218.197.153.63', 24210, 0, 2, '2020-12-08 16:38:48', '2020-12-08 18:00:48', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (132, 5, 7, NULL, NULL, '<t><p>编辑测试</p></t>', '127.0.0.1,49.80.77.173', 37720, 0, 0, '2020-12-08 17:16:20', '2020-12-08 17:23:57', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (133, 1, 7, NULL, NULL, '<t><p>回帖测试</p></t>', '::1,2001:250:4001:103:410:98a:939b:163', 61502, 0, 0, '2020-12-08 17:18:59', '2020-12-08 17:18:59', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (134, 1, 7, NULL, NULL, '<t><p>又一个回帖测试</p></t>', '::1,2001:250:4001:103:410:98a:939b:163', 62350, 0, 0, '2020-12-08 17:32:14', '2020-12-08 17:32:14', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (135, 10, 12, NULL, NULL, '<t><p>奇怪的东西增加了！[black]答案[/black]<br/>\n[fileshare]25[/fileshare]</p></t>', '2001:250:4001:103:3c0b:187d:98c4:a687', 48358, 0, 1, '2020-12-08 19:03:14', '2020-12-08 19:03:14', NULL, NULL, 1, 0, 1);
INSERT INTO `posts` VALUES (136, 17, 7, NULL, NULL, '<t><p>冲冲来冲了</p></t>', '218.197.153.148', 33892, 2, 0, '2020-12-08 19:40:48', '2020-12-08 19:40:48', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (137, 1, 13, NULL, NULL, '<t><p>[size=xl]环境需求[/size]</p>\n\n<p>[size=l]生产环境需求[/size]<br/>\n[ul]<br/>\n[li]Discuz! Q：Mysql 5.7 +，PHP 7.3 +。详细信息参考 [url=https://discuz.com/docs/install.html#]Discuz! Q[/url] 文档[/li]<br/>\n[li]Java Runtime Environment：[url=https://openjdk.java.net/]Open JDK[/url][/li]<br/>\n[/ul]</p>\n\n<p>[size=l]开发环境需求[/size]<br/>\n[ul]<br/>\n[li]Discuz! Q：Mysql 5.7 +，PHP 7.3 +。详细信息参考 [url=https://discuz.com/docs/install.html#]Discuz! Q[/url] 文档[/li]<br/>\n[li]Java Development Kit：[url=https://openjdk.java.net/]Open JDK[/url][/li]<br/>\n[li]Node.Js 14：[url=https://nodejs.org/]Node.Js[/url][/li]<br/>\n[/ul]</p>\n\n<p>[size=xl]下载[/size]<br/>\n见我们的开源仓库：[url]https://github.com/SourceLay[/url]</p>\n\n\n<p>[size=xl]安装[/size]<br/>\n[ol]<br/>\n[li]参考环境需求部分安装运行本程序所需的所有依赖。[/li]<br/>\n[li]使用正常流程安装 Discuz! Q。需注意，数据表前缀请留空。不然 Spring Boot 程序无法正常识别数据库结构。[/li]<br/>\n[li]配置并编译完使用 Spring Boot 编写的文件管理系统部分的程序，并运行。[/li]<br/>\n[li]在 Discuz! Q 的 config 文件夹中将 [code=inline]paraparty_default.php[/code] 和 [code=inline]sourcelay_default.php[/code] 各复制一份并删除文件名中的 [code=inline]_default[/code]，使用记事本打开文件按照需求修改配置文件。[/li]<br/>\n[/ol]</p>\n\n</t>', '::1,2001:250:4001:103:410:98a:939b:163', 9998, 0, 0, '2020-12-08 19:51:18', '2020-12-09 16:13:38', NULL, NULL, 1, 0, 1);
INSERT INTO `posts` VALUES (138, 9, 14, NULL, NULL, '<t><p>[fileshare]27[/fileshare]</p></t>', '218.197.153.252', 9624, 0, 0, '2020-12-08 21:23:33', '2020-12-08 21:23:33', NULL, NULL, 1, 0, 1);
INSERT INTO `posts` VALUES (139, 9, 15, NULL, NULL, '<t><p>[fileshare]28[/fileshare]</p></t>', '218.197.153.252', 32338, 0, 0, '2020-12-08 21:26:18', '2020-12-08 21:26:18', NULL, NULL, 1, 0, 1);
INSERT INTO `posts` VALUES (140, 9, 16, NULL, NULL, '<t><p>[fileshare]29[/fileshare][fileshare]30[/fileshare]</p></t>', '218.197.153.252', 47492, 0, 0, '2020-12-08 21:34:41', '2020-12-08 21:34:41', NULL, NULL, 1, 0, 1);
INSERT INTO `posts` VALUES (141, 9, 17, NULL, NULL, '<t><p>[fileshare]29[/fileshare][fileshare]30[/fileshare]</p></t>', '218.197.153.252', 14414, 0, 0, '2020-12-08 21:34:41', '2020-12-08 21:34:41', NULL, NULL, 1, 0, 1);
INSERT INTO `posts` VALUES (142, 9, 18, NULL, NULL, '<t><p>[fileshare]31[/fileshare]</p></t>', '218.197.153.252', 15508, 0, 0, '2020-12-08 21:40:42', '2020-12-08 21:40:42', NULL, NULL, 1, 0, 1);
INSERT INTO `posts` VALUES (143, 9, 19, NULL, NULL, '<t><p>[fileshare]33[/fileshare][fileshare]32[/fileshare]</p></t>', '218.197.153.252', 23892, 0, 0, '2020-12-08 21:41:49', '2020-12-08 21:41:49', NULL, NULL, 1, 0, 1);
INSERT INTO `posts` VALUES (144, 9, 20, NULL, NULL, '<t><p>[fileshare]34[/fileshare]</p></t>', '218.197.153.252', 16938, 0, 0, '2020-12-08 21:44:30', '2020-12-08 21:44:30', NULL, NULL, 1, 0, 1);
INSERT INTO `posts` VALUES (145, 9, 7, 136, 17, '<t><p>CCC牛X！</p></t>', '218.197.153.252', 42154, 0, 0, '2020-12-08 21:47:38', '2020-12-08 21:47:38', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (146, 1, 21, NULL, NULL, '<r><p>文档：[url]https://mhchem.github.io/MathJax-mhchem/[/url]</p>\n\n<p>测试例子：<br/>\n[latex]<br/>\n\\ce{Zn<SUP><s>^</s>2</SUP>+  &lt;=&gt;[+ 2OH-][+ 2H+]  $\\underset{\\text{amphoteres Hydroxid}}{\\ce{Zn(OH)2 v}}$  &lt;=&gt;[+ 2OH-][+ 2H+]  $\\underset{\\text{Hydroxozikat}}{\\ce{[Zn(OH)4]<SUP><s>^</s>2</SUP>-}}$}<br/>\n[/latex]</p>\n\n<p>例子中用到的 BBCode <br/>\n[code=bbcode][latex]<br/>\n\\ce{Zn<SUP><s>^</s>2</SUP>+  &lt;=&gt;[+ 2OH-][+ 2H+]  $\\underset{\\text{amphoteres Hydroxid}}{\\ce{Zn(OH)2 v}}$  &lt;=&gt;[+ 2OH-][+ 2H+]  $\\underset{\\text{Hydroxozikat}}{\\ce{[Zn(OH)4]<SUP><s>^</s>2</SUP>-}}$}<br/>\n[/latex][/code]</p></r>', '::1,218.197.153.63', 52102, 0, 0, '2020-12-08 22:05:23', '2020-12-09 10:19:47', NULL, NULL, 1, 0, 1);
INSERT INTO `posts` VALUES (147, 9, 22, NULL, NULL, '<t><p>[fileshare]38[/fileshare]</p></t>', '218.197.153.252', 32436, 0, 0, '2020-12-08 22:38:14', '2020-12-08 22:38:14', NULL, NULL, 1, 0, 1);
INSERT INTO `posts` VALUES (148, 9, 23, NULL, NULL, '<t><p>[fileshare]37[/fileshare]</p></t>', '218.197.153.252', 43774, 0, 0, '2020-12-08 22:38:44', '2020-12-08 22:38:44', NULL, NULL, 1, 0, 1);
INSERT INTO `posts` VALUES (149, 9, 24, NULL, NULL, '<t><p>[fileshare]35[/fileshare]</p></t>', '218.197.153.252', 32436, 0, 0, '2020-12-08 22:39:45', '2020-12-08 22:39:45', NULL, NULL, 1, 0, 1);
INSERT INTO `posts` VALUES (150, 10, 7, 136, 17, '<t><p>我直呼内行</p></t>', '2001:250:4001:5013:9db3:89b7:e8c1:522', 13090, 0, 0, '2020-12-09 09:52:21', '2020-12-09 09:52:21', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (151, 9, 25, NULL, NULL, '<r><p>$$<br/>\nA=\\left[\\begin{array}{cccc}{a<EM><s>_</s>{11}} &amp; {a<e>_</e></EM>{12}} &amp; {\\cdots} &amp; {a<EM><s>_</s>{1 n}} <ESC><s>\\</s>\\</ESC> {a<e>_</e></EM>{21}} &amp; {a<EM><s>_</s>{22}} &amp; {\\cdots} &amp; {a<e>_</e></EM>{2 n}} <ESC><s>\\</s>\\</ESC> {\\vdots} &amp; {\\vdots} &amp; {\\ddots} &amp; {\\vdots} <ESC><s>\\</s>\\</ESC> {a<EM><s>_</s>{m 1}} &amp; {a<e>_</e></EM>{m 2}} &amp; {\\cdots} &amp; {a_{m n}}\\end{array}\\right]<br/>\n$$</p></r>', '218.197.153.252', 23820, 0, 0, '2020-12-09 19:37:26', '2020-12-09 19:37:26', NULL, NULL, 1, 0, 1);
INSERT INTO `posts` VALUES (152, 9, 25, NULL, NULL, '<r><p>[latex]$$<br/>\nA=\\left[\\begin{array}{cccc}{a<EM><s>_</s>{11}} &amp; {a<e>_</e></EM>{12}} &amp; {\\cdots} &amp; {a<EM><s>_</s>{1 n}} <ESC><s>\\</s>\\</ESC> {a<e>_</e></EM>{21}} &amp; {a<EM><s>_</s>{22}} &amp; {\\cdots} &amp; {a<e>_</e></EM>{2 n}} <ESC><s>\\</s>\\</ESC> {\\vdots} &amp; {\\vdots} &amp; {\\ddots} &amp; {\\vdots} <ESC><s>\\</s>\\</ESC> {a<EM><s>_</s>{m 1}} &amp; {a<e>_</e></EM>{m 2}} &amp; {\\cdots} &amp; {a_{m n}}\\end{array}\\right]<br/>\n$$[latex]</p></r>', '218.197.153.252', 23820, 0, 0, '2020-12-09 19:38:45', '2020-12-09 19:38:45', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (153, 9, 25, NULL, NULL, '<t><p>[latex]A x=\\lambda x[latex]</p></t>', '218.197.153.252', 27684, 0, 0, '2020-12-09 19:41:05', '2020-12-09 19:41:05', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (154, 9, 25, NULL, NULL, '<t><p>[latex]\\frac{m}{n}[/frac]</p></t>', '218.197.153.252', 15744, 0, 0, '2020-12-09 19:43:11', '2020-12-09 19:43:11', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (155, 9, 25, NULL, NULL, '<t><p>[latex] a \\div b</p></t>', '218.197.153.252', 24474, 0, 0, '2020-12-09 19:47:49', '2020-12-09 19:47:49', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (156, 9, 25, NULL, NULL, '<t><p>[latex] a \\div b [latex]</p></t>', '218.197.153.252', 59482, 0, 0, '2020-12-09 19:48:17', '2020-12-09 19:48:17', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (157, 4, 26, NULL, NULL, '<t><p>题目：给定一个无序的整数数组，找到其中最长上升子序列的长度。</p>\n\n<p>示例:<br/>\n[code]输入: [10,9,2,5,3,7,101,18]<br/>\n输出: 4 <br/>\n解释: 最长的上升子序列是 [2,3,7,101]，它的长度是 4。<br/>\n[/code]</p>\n\n<p>思路：定义 [latex]dp\\left[ i\\right][/latex] 为考虑前 i 个元素，以第 i 个数字结尾的最长上升子序列的长度，注意 [latex]nums\\left[ i\\right][/latex] 必须被选取。</p>\n\n<p>我们从小到大计算 [latex]dp\\left[ \\right][/latex] 数组的值，在计算 [latex]dp\\left[ i\\right][/latex] 之前，我们已经计算出 [latex]dp\\left[ 0...i-1\\right][/latex] 的值，则状态转移方程为：</p>\n\n<p>[latex]dp\\left[ i\\right] = max\\left( dp\\left[ j\\right]\\right) +1 [/latex]， 其中 [latex]0 \\leq j &lt; i[/latex] 且 [latex] num\\left[ j\\right] &lt; num\\left[ i\\right] [/latex]</p>\n\n<p>即考虑往 [latex]dp\\left[ 0...i-1\\right][/latex] 中最长的上升子序列后面再加一个 [latex]nums\\left[ i\\right][/latex]。由于 [latex]dp\\left[ j\\right][/latex] 代表 [latex]dp\\left[ 0...j\\right][/latex] 中以 [latex]nums\\left[ j\\right][/latex] 结尾的最长上升子序列，所以如果能从 [latex]dp\\left[ j\\right][/latex] 这个状态转移过来，那么 [latex]nums\\left[ i\\right][/latex] 必然要大于 [latex]nums\\left[ j\\right][/latex]，才能将 [latex]nums\\left[ i\\right][/latex] 放在 [latex]nums\\left[ j\\right][/latex] 后面以形成更长的上升子序列。</p>\n\n<p>最后，整个数组的最长上升子序列即所有 [latex]dp\\left[ i\\right][/latex] 中的最大值。</p>\n\n<p>[latex]LIS_{length} = max\\left(dp\\left[ i\\right]\\right)[/latex] , 其中 [latex]0 \\leq i &lt; n[/latex]</p>\n\n<p>示例代码：<br/>\n[code=cpp]class Solution {<br/>\npublic:<br/>\n    int lengthOfLIS(vector&lt;int&gt;&amp; nums) {<br/>\n        int n=(int)nums.size();<br/>\n        if (n == 0) return 0;<br/>\n        vector&lt;int&gt; dp(n, 0);<br/>\n        for (int i = 0; i &lt; n; ++i) {<br/>\n            dp[i] = 1;<br/>\n            for (int j = 0; j &lt; i; ++j) {<br/>\n                if (nums[j] &lt; nums[i]) {<br/>\n                    dp[i] = max(dp[i], dp[j] + 1);<br/>\n                }<br/>\n            }<br/>\n        }<br/>\n        return *max_element(dp.begin(), dp.end());<br/>\n    }<br/>\n};<br/>\n[/code]</p></t>', '2001:250:4001:103:68e0:9c05:2398:cbe0', 10998, 0, 3, '2020-12-09 19:58:16', '2020-12-09 19:58:16', NULL, NULL, 1, 0, 1);
INSERT INTO `posts` VALUES (158, 9, 27, NULL, NULL, '<r><p>对称矩阵<br/>\n前面我们学习了矩阵的特征值与特征向量，也了解了一些特殊的矩阵及其特征值、特征向量，特殊矩阵的特殊性应该会反映在其特征值、特征向量中。如马尔科夫矩阵，有一特征值为[latex]1[/latex]，本讲介绍（实）对称矩阵。<br/>\n先提前介绍两个对称矩阵的特性：</p>\n<LIST type=\"decimal\"><LI><s>1. </s>特征值为实数；（对比第二十一讲介绍的旋转矩阵，其特征值为纯虚数。）</LI>\n<LI><s>2. </s>特征向量相互正交。（当特征值重复时，特征向量也可以从子空间中选出相互正交正交的向量。）<br/>\n典型的状况是，特征值不重复，特征向量相互正交。<br/>\n那么在通常（可对角化）情况下，一个矩阵可以化为：[latex]A=S\\varLambda S^{-1}[/latex];<br/>\n在矩阵对称的情况下，通过性质2可知，由特征向量组成的矩阵S中的列向量是相互正交的，此时如果我们把特征向量的长度统一化为1，就可以得到一组标准正交的特征向量。则对于对称矩阵有[latex]A=Q\\varLambda Q^{-1}[/latex]，而对于标准正交矩阵，有[latex]Q=Q<SUP><s>^</s>T</SUP>[/latex]，所以对称矩阵可以写为</LI></LIST>\n\n<p>[latex]A=Q\\varLambda Q<SUP><s>^</s>T\\tag</SUP>{1}[/latex]   ·······（1）<br/>\n观察<URL url=\"1\"><s>[</s>latex<e>](1)</e></URL>[/latex]式，我们发现这个分解本身就代表着对称，[latex]\\left(Q\\varLambda Q<SUP><s>^</s>T\\right</SUP>)<SUP><s>^</s>T</SUP>=\\left(Q<SUP><s>^</s>T\\right</SUP>)<SUP><s>^</s>T\\varLambda<e>^</e></SUP>TQ<SUP><s>^</s>T</SUP>=Q\\varLambda Q<SUP><s>^</s>T</SUP>[/latex]。<URL url=\"1\"><s>[</s>latex<e>](1)</e></URL>[/latex]式在数学上叫做谱定理（spectral theorem），谱就是指矩阵特征值的集合。（该名称来自光谱，指一些纯事物的集合，就像将特征值分解成为特征值与特征向量。）在力学上称之为主轴定理（principle axis theorem），从几何上看，它意味着如果给定某种材料，在合适的轴上来看，它就变成对角化的，方向就不会重复。<br/>\n现在我们来证明性质1。对于矩阵[latex]\\underline{Ax=\\lambda x}[/latex]，对于其共轭部分总有[latex]\\bar A\\bar x=\\bar\\lambda \\bar x[/latex]，根据前提条件我们只讨论实矩阵，则有[latex]A\\bar x=\\bar\\lambda \\bar x[/latex]，将等式两边取转置有[latex]\\overline{\\bar{x}<SUP><s>^</s>TA</SUP>=\\bar{x}<SUP><s>^</s>T\\bar\\lambda</SUP>}[/latex]。将“下划线”式两边左乘[latex]\\bar{x}<SUP><s>^</s>T</SUP>[/latex]有[latex]\\bar{x}<SUP><s>^</s>TAx</SUP>=\\bar{x}<SUP><s>^</s>T\\lambda</SUP> x[/latex]，“上划线”式两边右乘[latex]x[/latex]有[latex]\\bar{x}<SUP><s>^</s>TAx</SUP>=\\bar{x}<SUP><s>^</s>T\\bar\\lambda</SUP> x[/latex]，观察发现这两个式子左边是一样的，所以[latex]\\bar{x}<SUP><s>^</s>T\\lambda</SUP> x=\\bar{x}<SUP><s>^</s>T\\bar\\lambda</SUP> x[/latex]，则有[latex]\\lambda=\\bar{\\lambda}[/latex]（这里有个条件，[latex]\\bar{x}<SUP><s>^</s>Tx\\neq</SUP> 0[/latex]），证毕。<br/>\n观察这个前提条件，[latex]\\bar{x}<SUP><s>^</s>Tx</SUP>=\\begin{bmatrix}\\bar x_1&amp;\\bar x_2&amp;\\cdots&amp;\\bar x_n\\end{bmatrix}\\begin{bmatrix}x_1<ESC><s>\\</s>\\</ESC>x_2<ESC><s>\\</s>\\</ESC>\\vdots<ESC><s>\\</s>\\</ESC>x_n\\end{bmatrix}=\\bar x_1x_1+\\bar x_2x_2+\\cdots+\\bar x_nx_n[/latex]，设[latex]x_1=a+ib, \\bar x_1=a-ib[/latex]则[latex]\\bar x_1x_1=a<SUP><s>^</s>2</SUP>+b<SUP><s>^</s>2</SUP>[/latex]，所以有[latex]\\bar{x}<SUP><s>^</s>Tx</SUP>&gt;0[/latex]。而[latex]\\bar{x}<SUP><s>^</s>Tx</SUP>[/latex]就是[latex]x[/latex]长度的平方。</p></r>', '218.197.153.252', 46312, 0, 1, '2020-12-09 20:12:33', '2020-12-09 20:12:33', NULL, NULL, 1, 0, 1);
INSERT INTO `posts` VALUES (159, 9, 28, NULL, NULL, '<r><p>[size=xl]对称矩阵[/size]<br/>\n前面我们学习了矩阵的特征值与特征向量，也了解了一些特殊的矩阵及其特征值、特征向量，特殊矩阵的特殊性应该会反映在其特征值、特征向量中。如马尔科夫矩阵，有一特征值为[latex]1[/latex]，本讲介绍（实）对称矩阵。<br/>\n先提前介绍两个对称矩阵的特性：<br/>\n[ol]<br/>\n[li]特征值为实数；（对比第二十一讲介绍的旋转矩阵，其特征值为纯虚数。）[/li]<br/>\n[li]特征向量相互正交。（当特征值重复时，特征向量也可以从子空间中选出相互正交正交的向量。）[/li] <br/>\n[/ol]<br/>\n典型的状况是，特征值不重复，特征向量相互正交。<br/>\n那么在通常（可对角化）情况下，一个矩阵可以化为：[latex]A=S\\varLambda S^{-1}[/latex];<br/>\n在矩阵对称的情况下，通过性质2可知，由特征向量组成的矩阵S中的列向量是相互正交的，此时如果我们把特征向量的长度统一化为1，就可以得到一组标准正交的特征向量。则对于对称矩阵有[latex]A=Q\\varLambda Q^{-1}[/latex]，而对于标准正交矩阵，有[latex]Q=Q<SUP><s>^</s>T</SUP>[/latex]，所以对称矩阵可以写为</p>\n\n<p>[latex]A=Q\\varLambda Q<SUP><s>^</s>T\\tag</SUP>{1}[/latex]   ·······（1）<br/>\n观察<URL url=\"1\"><s>[</s>latex<e>](1)</e></URL>[/latex]式，我们发现这个分解本身就代表着对称，[latex]\\left(Q\\varLambda Q<SUP><s>^</s>T\\right</SUP>)<SUP><s>^</s>T</SUP>=\\left(Q<SUP><s>^</s>T\\right</SUP>)<SUP><s>^</s>T\\varLambda<e>^</e></SUP>TQ<SUP><s>^</s>T</SUP>=Q\\varLambda Q<SUP><s>^</s>T</SUP>[/latex]。<URL url=\"1\"><s>[</s>latex<e>](1)</e></URL>[/latex]式在数学上叫做谱定理（spectral theorem），谱就是指矩阵特征值的集合。（该名称来自光谱，指一些纯事物的集合，就像将特征值分解成为特征值与特征向量。）在力学上称之为主轴定理（principle axis theorem），从几何上看，它意味着如果给定某种材料，在合适的轴上来看，它就变成对角化的，方向就不会重复。<br/>\n现在我们来证明性质1。对于矩阵[latex]\\underline{Ax=\\lambda x}[/latex]，对于其共轭部分总有[latex]\\bar A\\bar x=\\bar\\lambda \\bar x[/latex]，根据前提条件我们只讨论实矩阵，则有[latex]A\\bar x=\\bar\\lambda \\bar x[/latex]，将等式两边取转置有[latex]\\overline{\\bar{x}<SUP><s>^</s>TA</SUP>=\\bar{x}<SUP><s>^</s>T\\bar\\lambda</SUP>}[/latex]。将“下划线”式两边左乘[latex]\\bar{x}<SUP><s>^</s>T</SUP>[/latex]有[latex]\\bar{x}<SUP><s>^</s>TAx</SUP>=\\bar{x}<SUP><s>^</s>T\\lambda</SUP> x[/latex]，“上划线”式两边右乘[latex]x[/latex]有[latex]\\bar{x}<SUP><s>^</s>TAx</SUP>=\\bar{x}<SUP><s>^</s>T\\bar\\lambda</SUP> x[/latex]，观察发现这两个式子左边是一样的，所以[latex]\\bar{x}<SUP><s>^</s>T\\lambda</SUP> x=\\bar{x}<SUP><s>^</s>T\\bar\\lambda</SUP> x[/latex]，则有[latex]\\lambda=\\bar{\\lambda}[/latex]（这里有个条件，[latex]\\bar{x}<SUP><s>^</s>Tx\\neq</SUP> 0[/latex]），证毕。<br/>\n观察这个前提条件，[latex]\\bar{x}<SUP><s>^</s>Tx</SUP>=\\begin{bmatrix}\\bar x_1&amp;\\bar x_2&amp;\\cdots&amp;\\bar x_n\\end{bmatrix}\\begin{bmatrix}x_1<ESC><s>\\</s>\\</ESC>x_2<ESC><s>\\</s>\\</ESC>\\vdots<ESC><s>\\</s>\\</ESC>x_n\\end{bmatrix}=\\bar x_1x_1+\\bar x_2x_2+\\cdots+\\bar x_nx_n[/latex]，设[latex]x_1=a+ib, \\bar x_1=a-ib[/latex]则[latex]\\bar x_1x_1=a<SUP><s>^</s>2</SUP>+b<SUP><s>^</s>2</SUP>[/latex]，所以有[latex]\\bar{x}<SUP><s>^</s>Tx</SUP>&gt;0[/latex]。而[latex]\\bar{x}<SUP><s>^</s>Tx</SUP>[/latex]就是[latex]x[/latex]长度的平方。<br/>\n拓展这个性质，当[latex]A[/latex]为复矩阵，根据上面的推导，则矩阵必须满足[latex]A=\\bar{A}<SUP><s>^</s>T</SUP>[/latex]时，才有性质1、性质2成立（教授称具有这种特征值为实数、特征向量相互正交的矩阵为“好矩阵”）。<br/>\n继续研究[latex]A=Q\\varLambda Q<SUP><s>^</s>T</SUP>=\\Bigg[q_1\\ q_2\\ \\cdots\\ q_n\\Bigg]\\begin{bmatrix}\\lambda_1&amp; &amp;\\cdots&amp; <ESC><s>\\</s>\\</ESC>&amp;\\lambda_2&amp;\\cdots&amp;<ESC><s>\\</s>\\</ESC>\\vdots&amp;\\vdots&amp;\\ddots&amp;\\vdots<ESC><s>\\</s>\\</ESC>&amp; &amp;\\cdots&amp;\\lambda_n\\end{bmatrix}\\begin{bmatrix}\\quad q_1<SUP><s>^</s>T\\quad<ESC><s>\\</s>\\</ESC>\\quad</SUP> q_1<SUP><s>^</s>T\\quad<ESC><s>\\</s>\\</ESC>\\quad</SUP> \\vdots \\quad<ESC><s>\\</s>\\</ESC>\\quad q_1<SUP><s>^</s>T\\quad\\end</SUP>{bmatrix}=\\lambda_1q_1q_1<SUP><s>^</s>T</SUP>+\\lambda_2q_2q_2<SUP><s>^</s>T</SUP>+\\cdots+\\lambda_nq_nq_n<SUP><s>^</s>T</SUP>[/latex]，注意这个展开式中的[latex]qq<SUP><s>^</s>T</SUP>[/latex]，[latex]q[/latex]是单位列向量所以[latex]q<SUP><s>^</s>Tq</SUP>=1[/latex]，结合我们在第十五讲所学的投影矩阵的知识有[latex]\\frac{qq<SUP><s>^</s>T</SUP>}{q<SUP><s>^</s>Tq</SUP>}=qq<SUP><s>^</s>T</SUP>[/latex]是一个投影矩阵，很容易验证其性质，比如平方它会得到[latex]qq<SUP><s>^</s>Tqq<e>^</e></SUP>T=qq<SUP><s>^</s>T</SUP>[/latex]于是多次投影不变等。<br/>\n每一个对称矩阵都可以分解为一系列相互正交的投影矩阵。<br/>\n在知道对称矩阵的特征值皆为实数后，我们再来讨论这些实数的符号，因为特征值的正负号会影响微分方程的收敛情况（第二十三讲，需要实部为负的特征值保证收敛）。用消元法取得矩阵的主元，观察主元的符号，**主元符号的正负数量与特征向量的正负数量相同<br/>\n[size=l]正定性[/size]<br/>\n如果对称矩阵是“好矩阵”，则正定矩阵（positive definite）是其一个更好的子类。正定矩阵指特征值均为正数的矩阵（根据上面的性质有矩阵的主元均为正）。<br/>\n举个例子，[latex]\\begin{bmatrix}5&amp;2<ESC><s>\\</s>\\</ESC>2&amp;3\\end{bmatrix}[/latex]，由行列式消元知其主元为[latex]5,\\frac{11}{5}[/latex]，按一般的方法求特征值有[latex]\\begin{vmatrix}5-\\lambda&amp;2<ESC><s>\\</s>\\</ESC>2&amp;3-\\lambda\\end{vmatrix}=\\lambda<SUP><s>^</s>2</SUP>-8\\lambda+11=0, \\lambda=4\\pm\\sqrt 5[/latex]。<br/>\n正定矩阵的另一个性质是，所有子行列式为正。对上面的例子有[latex]\\begin{vmatrix}5\\end{vmatrix}=5, \\begin{vmatrix}5&amp;2<ESC><s>\\</s>\\</ESC>2&amp;3\\end{vmatrix}=11[/latex]。<br/>\n我们看到正定矩阵将早期学习的的消元主元、中期学习的的行列式、后期学习的特征值结合在了一起。</p></r>', '218.197.153.252', 49360, 0, 3, '2020-12-09 20:12:36', '2020-12-12 23:10:01', NULL, NULL, 1, 0, 1);
INSERT INTO `posts` VALUES (160, 1, 29, NULL, NULL, '<t><p>　　欢迎来自[url=https://cloud.tencent.com/act/event/developer2020]腾讯云企业级开发者大赛 2020[/url] 的游客。在开始游览前，恳请您仔细阅读本份须知以了解本站的一些基本情况。</p>\n\n<p>[size=l][color=purple]体验本站功能前建议先注册账号并登陆[/color][/size]</p>\n\n<p>[size=l]程序基本情况[/size]</p>\n\n<p>　　本站主要想法是将 [url=https://discuz.com/docs/]Discuz! Q[/url] 中的附件功能扩展为一个带有文件聚合的网盘平台，并与传统的论坛附件模式相结合。打造一个付费知识分享程序平台。并提供[color=blue]信息讨论[/color]，[color=blue]文件管理[/color]和[color=blue]资料分享[/color]三大功能。</p>\n\n<p>[size=l]站点简介[/size]</p>\n\n<p>　　为了应对[color=blue]大学生对各种学习资料的查找有着巨大的需求[/color]的情况，为了解决[color=blue]现有的查找途径都有着或多或少的不方便的问题[/color]，本站为一款面向[color=blue]大学生[/color]，专注于[color=blue]全学科[/color]学习资料、竞赛信息的[color=blue]分享论坛[/color]。为广大大学生提供[color=blue]学习文件管理系统和信息资源分享平台[/color]，涉及日常学习、学科竞赛、升学就业、校园生活等多个方面，[color=blue]解决不同学生之间的信息不对称的情况[/color]，[color=blue]打通主要的信息获取渠道[/color]，致力于做到[color=blue]大学生学习资源分享领域[/color]这一细分领域的前列。</p>\n\n<p>[table]<br/>\n[tr]<br/>\n[td]信息讨论：[/td]<br/>\n[td]用户对[color=blue]日常学习[/color]，[color=blue]学科比赛[/color]，[color=blue]校园生活[/color]等信息进行讨论。[/td]<br/>\n[/tr]<br/>\n[tr]<br/>\n[td]文件管理：[/td]<br/>\n[td]用户对日常学习中产生的[color=blue]各种电子文件[/color]进行[color=blue]归档[/color]、[color=blue]分类[/color]、[color=blue]整理[/color]。[/td]<br/>\n[/tr]<br/>\n[tr]<br/>\n[td]资料分享：[/td]<br/>\n[td]用户间进行[color=blue]电子教材[/color]，[color=blue]考试试卷[/color]，[color=blue]读书笔记[/color]等资料的分享。[/td]<br/>\n[/tr]<br/>\n[/table]</p>\n\n<p>[size=l]站点基本情况[/size]</p>\n\n<p>[ol]<br/>\n[li]本站的域名暂定为一个开发阶段使用的临时域名，不保证本域名在日后依然可以正常访问到本站。[/li]<br/>\n[li]由于本站依然在开发中的状态，可能还有众多功能未完善，请各位游客海涵。[/li]<br/>\n[li]本站的初次加载时间可能会比较长，请耐心等候。[/li]<br/>\n[li]本站中的文件购买功能暂时使用的是站内的虚拟钱包。[/li]<br/>\n[/ol]</p>\n\n<p>　　在大概了解了本站的一些情况后，下面是我们为您准备的游览指引。在游览指引中，您可以对本站已经实现了的功能有一个大概的了解。</p>\n\n\n<p>[size=l]游览指引[/size]<br/>\n[ol]<br/>\n[li]基本功能介绍：[url=https://wango.club/forums/topics/9]社区操作指南[/url][/li]<br/>\n[li]排版系统在数学方面的文章的使用样例：[url=https://wango.club/forums/topics/28]对称矩阵及正定性[/url][/li]<br/>\n[li]排版系统在计算机方面的文章的使用样例：[url=https://wango.club/forums/topics/26]LeetCode 300. 最长上升子序列[/url][/li]<br/>\n[li]发帖编辑器会对 BBCode 标签进行着色：在编辑器中使用编辑器下方功能栏里的快捷排版功能即可体验。[/li]<br/>\n[li]标签搜索：[url=https://wango.club/search?q=tag%3A%E5%B8%AE%E5%8A%A9]搜索[帮助]标签下的所有帖子[/url]，如想对一个帖子添加标签，只需要简单地在帖子标题最前面添加[code=inline][标签名][/code]就可以将本帖子与这个标签关联在一起。[/li]<br/>\n[li]个人文件管理：[url=https://wango.club/files]我的文件[/url]，文件上传下载均使用腾讯云对象存储直传，中间不经过服务器中转。[/li]<br/>\n[li]文件聚合：[url=https://wango.club/stream]文件分享大厅[/url]，该页面展示了所有的公开分享文件的信息。[/li]<br/>\n[li]文件分享功能展示：[url=https://wango.club/forums/topics/6]文件分享测试[/url][/li]<br/>\n[/ol]</p></t>', '2001:250:4001:103:2c9c:3dea:9676:34e6', 37128, 0, 1, '2020-12-10 09:20:06', '2020-12-14 11:37:36', NULL, NULL, 1, 0, 1);
INSERT INTO `posts` VALUES (161, 4, 30, NULL, NULL, '<t><p>自己整理的[b]Windows[/b]考试资料。<br/>\nWPF test代码经过了md的代码着色处理，附上了目录。<br/>\nPPT除去了无用的图片，将一些文字合并，去除了一些元素的色彩。<br/>\n[fileshare]41[/fileshare][fileshare]40[/fileshare]</p></t>', '59.172.176.142', 56688, 0, 0, '2020-12-11 17:17:55', '2020-12-11 17:17:55', NULL, NULL, 1, 0, 1);
INSERT INTO `posts` VALUES (162, 19, 26, NULL, NULL, '<t><p>代码的颜色偏浅了()</p></t>', '111.8.49.183', 64417, 2, 0, '2020-12-12 23:16:50', '2020-12-12 23:16:50', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (163, 10, 29, NULL, NULL, '<t><p>好耶</p></t>', '59.172.176.153', 60977, 0, 0, '2020-12-14 21:53:32', '2020-12-14 21:53:32', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (164, 10, 28, NULL, NULL, '<t><p>不错，学到了很多</p></t>', '59.172.176.153', 56656, 0, 0, '2020-12-14 21:54:09', '2020-12-14 21:54:09', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (165, 5, 31, NULL, NULL, '<t><p>[fileshare]43[/fileshare]</p></t>', '49.80.77.173', 6808, 0, 1, '2020-12-15 11:42:22', '2020-12-15 11:42:22', NULL, NULL, 1, 0, 1);
INSERT INTO `posts` VALUES (166, 1, 31, NULL, NULL, '<t><p>有点意思</p></t>', '59.172.176.227', 56574, 0, 0, '2020-12-15 12:47:28', '2020-12-15 12:47:28', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (167, 5, 32, NULL, NULL, '<t><p>怎么都没人说话</p></t>', '49.80.77.173', 8113, 0, 0, '2020-12-22 14:13:17', '2020-12-22 14:13:17', NULL, NULL, 1, 0, 1);
INSERT INTO `posts` VALUES (168, 5, 2, NULL, NULL, '<t><p>在服务器响应够快的情况下，访问这个帖子，真是丝般流畅，啊哈哈！</p></t>', '49.80.77.173', 8378, 0, 0, '2020-12-22 14:15:41', '2020-12-22 14:15:41', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (169, 1, 32, NULL, NULL, '<t><p>寒假来一起重构吧 √</p>\n\n<p>突然发现 CTRL + ENTER 的发送快捷键没实现。好蛋疼。</p></t>', '59.172.176.227', 51086, 1, 0, '2020-12-22 14:53:18', '2020-12-22 14:53:40', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (170, 5, 32, 169, 1, '<t><p>顺带怎么发图功能都没了（</p></t>', '49.80.77.173', 8971, 1, 0, '2020-12-22 16:30:09', '2020-12-22 16:30:09', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (171, 1, 32, 170, 5, '<t><p>好问题，我删的。[s]因为发现了个迷惑bug[/s]</p></t>', '59.172.176.227', 52827, 0, 0, '2020-12-22 23:25:54', '2020-12-22 23:25:54', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (172, 9, 32, NULL, NULL, '<t><p>因为腾讯的推广计划还没到账（bushi</p></t>', '59.172.176.212', 56740, 0, 0, '2020-12-24 16:14:47', '2020-12-24 16:14:47', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (173, 5, 26, 162, 19, '<t><p>y1s1，qs</p></t>', '49.80.77.173', 6400, 0, 0, '2020-12-31 16:59:19', '2020-12-31 16:59:19', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (174, 30, 30, NULL, NULL, '<t><p>[color=purple][size=m][b]fdfdsfsda[/b][/size][/color]</p></t>', '61.158.152.127', 5697, 0, 0, '2021-01-20 11:26:37', '2021-01-20 11:26:37', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (175, 30, 33, NULL, NULL, '<t><p>测试帖子内容</p></t>', '61.158.152.127', 5697, 0, 0, '2021-01-20 11:27:32', '2021-01-20 11:27:32', NULL, NULL, 1, 0, 1);
INSERT INTO `posts` VALUES (176, 1, 34, NULL, NULL, '<t><p>[url=https://discuz.chat/thread/15414]官方论坛帖[/url]</p>\n\n<p>十分感谢腾讯云能够给予我们这个项目如此大的期望，我们也会继续努力完善本项目最终让本项目真正给更多的用户带去优质的讨论服务。</p>\n\n<p>[img=奖状图]https://res.cloudinary.com/paracraft/image/upload/blog/10d021f3c940d4c6182acb767be64e46e821ab4e.jpg[/img]</p>\n</t>', '113.117.138.169', 20068, 0, 0, '2021-01-21 13:50:46', '2021-01-21 13:58:46', NULL, NULL, 1, 0, 1);
INSERT INTO `posts` VALUES (177, 5, 34, NULL, NULL, '<t><p>[i][b][size=xl][color=red]耶[/color][color=yellow]耶[/color][color=green]耶[/color][color=blue]！[/color][/size][/b][/i]</p></t>', '58.216.219.228', 5965, 0, 0, '2021-01-21 14:14:32', '2021-01-21 14:14:33', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (178, 5, 26, 162, 19, '<t><p>[b]而且还是宋体，怎么搞的（[/b]</p></t>', '58.216.219.228', 6340, 1, 0, '2021-01-21 14:18:28', '2021-01-21 14:18:28', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (179, 1, 26, 178, 5, '<t><p>宋体是因为你的浏览器设置是宋体。。。。</p></t>', '113.117.138.169', 20974, 1, 0, '2021-01-21 21:07:06', '2021-01-21 21:07:06', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (180, 5, 26, 179, 1, '<t><p>其他字体都是雅黑啊，就代码块是宋的，&#129300;</p></t>', '58.216.219.228', 2926, 1, 0, '2021-01-22 08:12:51', '2021-01-22 08:12:51', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (181, 1, 26, 180, 5, '<t><p>浏览器，字体设置，代码块字体。</p>\n\n<p>你的主题样式没定义代码块字体，所以就继承浏览器设置了。</p></t>', '14.20.152.149', 16907, 0, 0, '2021-01-22 10:53:51', '2021-01-22 10:53:51', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (182, 5, 35, NULL, NULL, '<t><p>[url=https://sm.ms/image/BsKFPf5VNMGbdoX][img]https://i.loli.net/2021/02/23/BsKFPf5VNMGbdoX.png[/img][/url]<br/>\n[url=https://sm.ms/image/yqFOhwLN6mMKrCj][img]https://i.loli.net/2021/02/23/yqFOhwLN6mMKrCj.png[/img][/url]</p></t>', '58.216.219.228', 10062, 0, 0, '2021-02-23 14:47:13', '2021-02-23 14:47:13', NULL, NULL, 1, 0, 1);
INSERT INTO `posts` VALUES (183, 5, 2, NULL, NULL, '<t><p>测试测试！</p></t>', '58.216.219.228', 10552, 0, 0, '2021-02-23 14:53:11', '2021-02-23 14:53:11', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (184, 10, 34, NULL, NULL, '<t><p>真不错</p></t>', '59.172.176.177', 57091, 0, 0, '2021-04-19 19:17:41', '2021-04-19 19:17:41', NULL, NULL, 0, 0, 1);
INSERT INTO `posts` VALUES (185, 10, 36, NULL, NULL, '<t><p>很好看哦，大家也可以收藏一下<br/>\n[fileshare]46[/fileshare]</p></t>', '59.172.176.177', 62842, 0, 0, '2021-04-20 11:05:21', '2021-04-20 11:05:21', NULL, NULL, 1, 0, 1);
INSERT INTO `posts` VALUES (186, 10, 36, NULL, NULL, '<t><p>好耶</p></t>', '59.172.176.177', 62877, 0, 0, '2021-04-20 11:05:29', '2021-04-20 11:05:29', NULL, NULL, 0, 0, 1);

-- ----------------------------
-- Table structure for questions
-- ----------------------------
DROP TABLE IF EXISTS `questions`;
CREATE TABLE `questions`  (
  `id` bigint UNSIGNED NOT NULL AUTO_INCREMENT,
  `thread_id` bigint UNSIGNED NULL DEFAULT NULL COMMENT '主题 id',
  `user_id` bigint UNSIGNED NULL DEFAULT NULL COMMENT '提问人用户 id',
  `be_user_id` bigint UNSIGNED NULL DEFAULT NULL COMMENT '被提问的用户 id',
  `content` text CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL COMMENT '回答内容',
  `ip` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '回答人 ip 地址',
  `port` int UNSIGNED NOT NULL DEFAULT 0 COMMENT '回答人端口',
  `price` decimal(8, 2) UNSIGNED NOT NULL DEFAULT 0.00 COMMENT '问答价格',
  `onlooker_unit_price` decimal(8, 2) UNSIGNED NOT NULL DEFAULT 0.00 COMMENT '围观单价',
  `onlooker_price` decimal(8, 2) UNSIGNED NOT NULL DEFAULT 0.00 COMMENT '当前围观总价格',
  `onlooker_number` bigint UNSIGNED NOT NULL DEFAULT 0 COMMENT '当前围观总人数',
  `is_onlooker` tinyint NOT NULL DEFAULT 1 COMMENT '是否允许围观',
  `is_answer` tinyint NOT NULL DEFAULT 0 COMMENT '是否已回答 0未回答 1已回答 2已过期',
  `is_approved` tinyint UNSIGNED NOT NULL DEFAULT 1 COMMENT '回答内容是否合法',
  `updated_at` datetime(0) NOT NULL COMMENT '更新时间',
  `created_at` datetime(0) NOT NULL COMMENT '创建时间',
  `expired_at` datetime(0) NOT NULL COMMENT '过期时间',
  `answered_at` datetime(0) NULL DEFAULT NULL COMMENT '回答时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `idx_thread_id`(`thread_id`) USING BTREE,
  INDEX `idx_user_id`(`user_id`) USING BTREE,
  INDEX `idx_be_user_id`(`be_user_id`) USING BTREE,
  CONSTRAINT `questions_thread_id_foreign` FOREIGN KEY (`thread_id`) REFERENCES `threads` (`id`) ON DELETE SET NULL ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of questions
-- ----------------------------

-- ----------------------------
-- Table structure for reports
-- ----------------------------
DROP TABLE IF EXISTS `reports`;
CREATE TABLE `reports`  (
  `id` bigint UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '举报 id',
  `user_id` bigint UNSIGNED NOT NULL DEFAULT 0 COMMENT '用户 id',
  `thread_id` bigint UNSIGNED NOT NULL DEFAULT 0 COMMENT '主题 id',
  `post_id` bigint UNSIGNED NOT NULL DEFAULT 0 COMMENT '回复 id',
  `type` tinyint UNSIGNED NOT NULL DEFAULT 0 COMMENT '举报类型:0个人主页 1主题 2评论/回复',
  `reason` text CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '举报理由',
  `status` tinyint UNSIGNED NOT NULL DEFAULT 0 COMMENT '举报状态:0未处理 1已处理',
  `created_at` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `updated_at` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `idx_user`(`user_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of reports
-- ----------------------------

-- ----------------------------
-- Table structure for session_tokens
-- ----------------------------
DROP TABLE IF EXISTS `session_tokens`;
CREATE TABLE `session_tokens`  (
  `token` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT 'token',
  `scope` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '作用域',
  `payload` text CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL COMMENT '负载',
  `user_id` int UNSIGNED NULL DEFAULT NULL COMMENT '用户 id',
  `created_at` datetime(0) NOT NULL COMMENT '创建时间',
  `expired_at` datetime(0) NOT NULL COMMENT '过期时间',
  UNIQUE INDEX `session_tokens_token_unique`(`token`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of session_tokens
-- ----------------------------

-- ----------------------------
-- Table structure for settings
-- ----------------------------
DROP TABLE IF EXISTS `settings`;
CREATE TABLE `settings`  (
  `key` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '设置项 key',
  `value` text CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL COMMENT '设置项 value',
  `tag` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT 'default' COMMENT '设置项 tag',
  PRIMARY KEY (`key`, `tag`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of settings
-- ----------------------------
INSERT INTO `settings` VALUES ('miniprogram_video', '1', 'wx_miniprogram');
INSERT INTO `settings` VALUES ('password_length', '0', 'default');
INSERT INTO `settings` VALUES ('password_strength', '', 'default');
INSERT INTO `settings` VALUES ('post_count', '186', 'default');
INSERT INTO `settings` VALUES ('privacy', '0', 'agreement');
INSERT INTO `settings` VALUES ('privacy_content', '', 'agreement');
INSERT INTO `settings` VALUES ('qcloud_sms', '0', 'qcloud');
INSERT INTO `settings` VALUES ('qcloud_vod', '0', 'qcloud');
INSERT INTO `settings` VALUES ('register', '0', 'agreement');
INSERT INTO `settings` VALUES ('register_captcha', '0', 'default');
INSERT INTO `settings` VALUES ('register_close', '1', 'default');
INSERT INTO `settings` VALUES ('register_content', '', 'agreement');
INSERT INTO `settings` VALUES ('register_type', '0', 'default');
INSERT INTO `settings` VALUES ('register_validate', '', 'default');
INSERT INTO `settings` VALUES ('site_author', '1', 'default');
INSERT INTO `settings` VALUES ('site_author_scale', '10', 'default');
INSERT INTO `settings` VALUES ('site_close', '0', 'default');
INSERT INTO `settings` VALUES ('site_id', 'efb38ab5dcb6488894342314b7d1953f', 'default');
INSERT INTO `settings` VALUES ('site_install', '2020-08-15 21:56:48', 'default');
INSERT INTO `settings` VALUES ('site_manage', '[{\"key\":1,\"desc\":\"PC端\",\"value\":true},{\"key\":2,\"desc\":\"H5端\",\"value\":true},{\"key\":3,\"desc\":\"小程序端\",\"value\":true}]', 'default');
INSERT INTO `settings` VALUES ('site_master_scale', '0', 'default');
INSERT INTO `settings` VALUES ('site_mode', 'public', 'default');
INSERT INTO `settings` VALUES ('site_name', 'ParaParty 开发站', 'default');
INSERT INTO `settings` VALUES ('site_secret', 'u9r4LYQY3TIjTjFLIKbYvAfvcSRvOGnC', 'default');
INSERT INTO `settings` VALUES ('support_file_ext', 'doc,docx,pdf,zip', 'default');
INSERT INTO `settings` VALUES ('support_img_ext', 'png,gif,jpg,jpeg,heic', 'default');
INSERT INTO `settings` VALUES ('support_max_size', '5', 'default');
INSERT INTO `settings` VALUES ('thread_count', '33', 'default');
INSERT INTO `settings` VALUES ('user_count', '34', 'default');

-- ----------------------------
-- Table structure for sourcelay_file_info
-- ----------------------------
DROP TABLE IF EXISTS `sourcelay_file_info`;
CREATE TABLE `sourcelay_file_info`  (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '文件id',
  `user_id` bigint NOT NULL COMMENT '上传用户id',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '文件名',
  `type` varchar(127) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '文件MIME类型',
  `folder` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '文件所在的目录',
  `size` bigint NOT NULL COMMENT '文件大小',
  `md5` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '文件校验码',
  `status` smallint NULL DEFAULT NULL COMMENT '文件状态',
  `download_count` int NULL DEFAULT 0 COMMENT '文件下载量',
  `like_count` int NULL DEFAULT 0 COMMENT '文件点赞量',
  `created_at` datetime(0) NOT NULL COMMENT '文件上传时间',
  `updated_at` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '文件更新时间',
  `is_shared` tinyint NOT NULL COMMENT '文件是否分享',
  `is_essence` tinyint NOT NULL COMMENT '文件是否加精',
  `deleted_at` datetime(0) NULL DEFAULT NULL COMMENT '文件删除时间',
  `deleted_id` bigint NULL DEFAULT NULL COMMENT '执行删除操作的用户id',
  `random_id` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '随机生成的文件id',
  `storage_name` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '在COS中的存储名',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 297 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of sourcelay_file_info
-- ----------------------------
INSERT INTO `sourcelay_file_info` VALUES (155, 1, 'users', 'text/directory', '/', 0, NULL, 1, 0, 0, '2020-12-03 22:41:27', '2020-12-03 22:41:27', 0, 0, NULL, NULL, 'f78a369c-ac21-4a58-89de-c6f04b26730a', NULL);
INSERT INTO `sourcelay_file_info` VALUES (156, 1, '1', 'text/directory', '/users/', 0, NULL, 1, 0, 0, '2020-12-03 22:41:27', '2020-12-03 22:41:27', 0, 0, NULL, NULL, 'e390dae5-1d47-467f-b69c-ea23a14f270e', NULL);
INSERT INTO `sourcelay_file_info` VALUES (157, 1, 'ArgaosRidge_ZH-CN1737206146_1920x1080.jpg', 'image/jpeg', '/users/1/', 338167, 'e5e71ee07fd74d320591caeb3a47667b', 1, 0, 0, '2020-12-03 22:41:27', '2020-12-08 11:14:17', 0, 0, NULL, NULL, 'd85376cb-0953-4453-8c2f-7c6ab845d671', '/d8/53/d85376cb-0953-4453-8c2f-7c6ab845d671');
INSERT INTO `sourcelay_file_info` VALUES (158, 1, 'KIVΛ,Iceloki - V.mp3', 'audio/mpeg', '/users/1/', 10564551, '4d043c68c5342e3b43c2b14fe92e208f', 1, 2, 0, '2020-12-03 22:46:07', '2020-12-03 22:46:07', 0, 0, NULL, NULL, '87c9d818-29e9-4514-b985-a624f89a1ce7', '/87/c9/87c9d818-29e9-4514-b985-a624f89a1ce7');
INSERT INTO `sourcelay_file_info` VALUES (164, 4, '4', 'text/directory', '/users/', 0, NULL, 1, 0, 0, '2020-12-03 22:56:33', '2020-12-03 22:56:33', 1, 0, NULL, NULL, 'd69821ef-6166-4e09-971c-2fbd9de4bd36', NULL);
INSERT INTO `sourcelay_file_info` VALUES (165, 4, 'bc9-1.pptx', 'application/vnd.openxmlformats-officedocument.presentationml.presentation', '/users/4/', 145345, 'b1b5afd5a35694a4328cb830add43420', 1, 203, 0, '2020-12-03 22:56:33', '2020-12-03 22:56:33', 0, 0, NULL, NULL, 'a2e06ef5-3a82-4c6f-a520-cd8e2a355405', '/a2/e0/a2e06ef5-3a82-4c6f-a520-cd8e2a355405');
INSERT INTO `sourcelay_file_info` VALUES (177, 7, 'vert.png', 'image/png', '/users/7/', 2475, 'ce379a09ac28c1b6d4c8e78214eda087', 1, 0, 0, '2020-12-03 23:10:27', '2020-12-03 23:10:27', 0, 0, NULL, NULL, 'acaab16c-8353-47f2-980a-bd6df6c7b5f0', '/ac/aa/acaab16c-8353-47f2-980a-bd6df6c7b5f0');
INSERT INTO `sourcelay_file_info` VALUES (179, 6, '6', 'text/directory', '/users/', 0, NULL, 1, 0, 0, '2020-12-04 10:09:02', '2020-12-04 10:09:02', 0, 0, NULL, NULL, '5607be98-fced-4493-a5a6-6a74d4be88ca', NULL);
INSERT INTO `sourcelay_file_info` VALUES (180, 6, '3deca4005d1634a93e36b3605297678e96f13a386efc24925010b2cd30bec7d3.jpg', 'image/jpeg', '/users/6/', 804974, '261c53035220da2875a304b9dd324e35', 1, 0, 0, '2020-12-04 10:09:02', '2020-12-04 10:09:02', 0, 0, '2020-12-04 10:11:26', NULL, '27422bf0-cc5b-4200-aca6-0e8b7e05fbfe', '/27/42/27422bf0-cc5b-4200-aca6-0e8b7e05fbfe');
INSERT INTO `sourcelay_file_info` VALUES (181, 6, '0ed2560ccb5c0d08037000edd5ad0444d89dca31a9c43811f525742b84a5f4b8.jpg', 'image/jpeg', '/users/6/', 621654, '1452c04c9bc459b561e42321aacc233e', 1, 0, 0, '2020-12-04 10:11:10', '2020-12-04 10:11:10', 0, 0, '2020-12-04 10:11:36', NULL, '312f9ac2-943a-48b2-9305-05da72bb077c', '/31/2f/312f9ac2-943a-48b2-9305-05da72bb077c');
INSERT INTO `sourcelay_file_info` VALUES (182, 6, '6f26b549da33a0fcb97a37185e5e1ea9fe670fe7096527a8561d9df46fadfe63.jpg', 'image/jpeg', '/users/6/', 863137, '6c9ca056a0f2e029d10c110018e0288d', 1, 2, 0, '2020-12-04 10:11:49', '2020-12-04 10:11:49', 0, 0, NULL, NULL, 'eb4035a0-2c60-4c37-b923-03f4679eb50b', '/eb/40/eb4035a0-2c60-4c37-b923-03f4679eb50b');
INSERT INTO `sourcelay_file_info` VALUES (183, 6, '15b74bed171dbda7f6d9b9a1898830dbd84b26028c250e68719bc32cdb6eabfc.jpg', 'image/jpeg', '/users/6/', 399257, '6c9ca056a0f2e029d10c110018e0288d', 1, 0, 0, '2020-12-04 10:11:50', '2020-12-04 10:11:50', 0, 0, NULL, NULL, 'bdde4ec3-871b-4467-a627-d73369bdd80d', '/bd/de/bdde4ec3-871b-4467-a627-d73369bdd80d');
INSERT INTO `sourcelay_file_info` VALUES (184, 6, '0ed2560ccb5c0d08037000edd5ad0444d89dca31a9c43811f525742b84a5f4b8.jpg', 'image/jpeg', '/users/6/', 621654, '1452c04c9bc459b561e42321aacc233e', 1, 0, 0, '2020-12-04 11:05:38', '2020-12-04 11:05:38', 0, 0, NULL, NULL, '7c7a5268-73e3-4fe1-b69a-ab918258c9d2', '/7c/7a/7c7a5268-73e3-4fe1-b69a-ab918258c9d2');
INSERT INTO `sourcelay_file_info` VALUES (185, 4, 'sz9-6.pptx', 'application/vnd.openxmlformats-officedocument.presentationml.presentation', '/users/4/', 163257, '45ce18ba29107a3dee268b8dc258cc71', 1, 0, 0, '2020-12-04 22:36:08', '2020-12-04 22:36:08', 0, 0, NULL, NULL, '0d5b87fe-500f-4707-a07d-c2d4502b0aaf', '/0d/5b/0d5b87fe-500f-4707-a07d-c2d4502b0aaf');
INSERT INTO `sourcelay_file_info` VALUES (186, 1, '114514', 'text/directory', '/users/1/', 0, NULL, 1, 0, 0, '2020-12-05 11:23:20', '2020-12-05 11:23:20', 0, 0, NULL, NULL, '15fc2583-e4e6-4b45-a587-5aa14f8dc0fa', NULL);
INSERT INTO `sourcelay_file_info` VALUES (187, 1, 'test', 'text/directory', '/users/1/', 0, NULL, 1, 0, 0, '2020-12-05 11:33:15', '2020-12-05 11:33:15', 0, 0, NULL, NULL, 'fbaec59d-2810-4212-99d1-7b170f152f8c', NULL);
INSERT INTO `sourcelay_file_info` VALUES (188, 1, '2020-03-29 (8).png', 'image/png', '/users/1/114514/', 3050474, '5a741d9c7332bce2a1f29f1536e9e344', 1, 581, 1, '2020-12-05 11:38:47', '2020-12-05 07:37:34', 1, 0, NULL, NULL, '18f74bb7-0489-47c1-8340-c076646cfc90', '/18/f7/18f74bb7-0489-47c1-8340-c076646cfc90');
INSERT INTO `sourcelay_file_info` VALUES (189, 1, '2020-04-11 (63).png', 'image/png', '/users/1/114514/', 2515006, '4b6547aaab2509e335dbe79e69714597', 1, 173, 0, '2020-12-05 11:39:04', '2020-12-05 07:37:34', 1, 0, NULL, NULL, '12e7de5b-eefe-499b-ac34-6f94988fcf1b', '/12/e7/12e7de5b-eefe-499b-ac34-6f94988fcf1b');
INSERT INTO `sourcelay_file_info` VALUES (190, 1, '2020-04-11 (113).png', 'image/png', '/users/1/114514/', 2755491, 'd1b8f791235f6b305116e653aab30987', 1, 164, 0, '2020-12-05 11:39:16', '2020-12-05 07:37:34', 1, 0, NULL, NULL, 'e7d1a0be-7ebb-4eb8-9107-55092e26f1a8', '/e7/d1/e7d1a0be-7ebb-4eb8-9107-55092e26f1a8');
INSERT INTO `sourcelay_file_info` VALUES (191, 1, '2020-04-01 (10).png', 'image/png', '/users/1/', 2516150, NULL, 0, 0, 0, '2020-12-07 23:24:40', '2020-12-07 23:24:40', 0, 0, NULL, NULL, 'b654a5b4-c15b-4696-9fc5-26ef3091d38d', '/b6/54/b654a5b4-c15b-4696-9fc5-26ef3091d38d.png');
INSERT INTO `sourcelay_file_info` VALUES (192, 1, '2020-07-22 (16).png', 'image/png', '/users/1/', 3374595, NULL, 0, 0, 0, '2020-12-07 23:25:09', '2020-12-07 23:25:09', 0, 0, NULL, NULL, 'cb49d32d-579b-4799-b494-5c093237da50', '/cb/49/cb49d32d-579b-4799-b494-5c093237da50.png');
INSERT INTO `sourcelay_file_info` VALUES (193, 4, 'Java虚拟机规范中文版.pdf', 'application/pdf', '/users/4/', 10627675, '6b776ba21afb209538a8199d4123d393', 1, 162, 0, '2020-12-08 14:18:18', '2020-12-08 14:18:18', 1, 0, NULL, NULL, '71da18d8-3918-40a5-9aae-3cffc2954367', '/71/da/71da18d8-3918-40a5-9aae-3cffc2954367.pdf');
INSERT INTO `sourcelay_file_info` VALUES (194, 15, '15', 'text/directory', '/users/', 0, NULL, 1, 0, 0, '2020-12-08 15:35:54', '2020-12-08 15:35:54', 0, 0, NULL, NULL, '8d1cebbf-f60b-462f-bf39-190622e52f82', NULL);
INSERT INTO `sourcelay_file_info` VALUES (195, 15, 'bunny_iH.ply2', 'application/octet-stream', '/users/15/', 2417019, '470d8aa180b61a8153fe85b7adb97364', 1, 1, 0, '2020-12-08 15:35:54', '2020-12-08 15:35:54', 0, 0, NULL, NULL, '4b23abb4-4480-48b4-9301-93ff6971715b', '/4b/23/4b23abb4-4480-48b4-9301-93ff6971715b.ply2');
INSERT INTO `sourcelay_file_info` VALUES (196, 11, '11', 'text/directory', '/users/', 0, NULL, 1, 0, 0, '2020-12-08 17:07:56', '2020-12-08 17:07:56', 0, 0, NULL, NULL, '59e0e52a-cebd-485f-9780-da19d0dd9654', NULL);
INSERT INTO `sourcelay_file_info` VALUES (197, 11, 'Takahiro Ando - Guhehehe.mp3', 'audio/mpeg', '/users/11/', 4383337, 'bbd385e1418ed1aec7d12959b0531987', 1, 0, 0, '2020-12-08 17:07:56', '2020-12-08 17:07:56', 0, 0, NULL, NULL, '928ace93-e69d-4e5d-bed0-f44ae6ab5d89', '/92/8a/928ace93-e69d-4e5d-bed0-f44ae6ab5d89.mp3');
INSERT INTO `sourcelay_file_info` VALUES (198, 11, 'QQ图片20200804222718.jpg', 'image/jpeg', '/users/11/', 39062, '890805fba22200314097e109c4eb403c', 1, 0, 0, '2020-12-08 17:08:51', '2020-12-08 17:08:51', 0, 0, NULL, NULL, '9d19d4fd-122a-4990-8368-4c341f8e9340', '/9d/19/9d19d4fd-122a-4990-8368-4c341f8e9340.jpg');
INSERT INTO `sourcelay_file_info` VALUES (199, 1, 'ignotus.mp3', 'audio/mpeg', '/users/1/', 6084760, 'fa0cba5d338d7ad3279108251a3e8e71', 1, 2, 0, '2020-12-08 18:06:55', '2020-12-08 18:06:55', 0, 0, NULL, NULL, 'ab923def-c80f-4eeb-a8b1-2de1750fd60d', '/ab/92/ab923def-c80f-4eeb-a8b1-2de1750fd60d.mp3');
INSERT INTO `sourcelay_file_info` VALUES (200, 10, '10', 'text/directory', '/users/', 0, NULL, 1, 0, 0, '2020-12-08 18:58:43', '2020-12-08 18:58:43', 0, 0, NULL, NULL, '218f4208-24e1-413a-9328-80e460069d13', NULL);
INSERT INTO `sourcelay_file_info` VALUES (201, 10, '居余马线性代数课后详细答案.doc', 'application/msword', '/users/10/', 7228186, 'f6cb11b6b8b68562728ecdefe8c03000', 1, 124, 1, '2020-12-08 18:58:43', '2020-12-08 18:58:43', 1, 0, '2020-12-25 20:07:24', NULL, 'd1b33a64-3422-4b2f-99e4-f244f573e58a', '/d1/b3/d1b33a64-3422-4b2f-99e4-f244f573e58a.doc');
INSERT INTO `sourcelay_file_info` VALUES (202, 10, '习题答案', 'text/directory', '/users/10/', 0, NULL, 1, 0, 0, '2020-12-08 18:58:57', '2020-12-08 18:58:57', 0, 0, '2020-12-25 20:07:46', NULL, '79da1d15-1bc3-4143-8719-82658760ee3d', NULL);
INSERT INTO `sourcelay_file_info` VALUES (203, 9, '9', 'text/directory', '/users/', 0, NULL, 1, 0, 0, '2020-12-08 19:31:55', '2020-12-08 19:31:55', 0, 0, NULL, NULL, '15736fff-29ed-4503-942f-ebc3800a5fa7', NULL);
INSERT INTO `sourcelay_file_info` VALUES (204, 9, 'Learning Features that Predict Developer Responses for iOS App Store Reviews(1).pdf', 'application/pdf', '/users/9/', 6892406, '69688b5b094c39408a6cd8022cb52b39', 1, 0, 0, '2020-12-08 19:31:55', '2020-12-08 19:31:55', 0, 0, '2020-12-08 21:21:31', NULL, 'eff8c80e-f9a4-4899-b8e8-6b4c257ed9eb', '/ef/f8/eff8c80e-f9a4-4899-b8e8-6b4c257ed9eb.pdf');
INSERT INTO `sourcelay_file_info` VALUES (205, 9, '77225439_p0.jpg', 'image/jpeg', '/users/9/', 1424625, '0fe6b98e52c1be10e1d5ddec358a3d2a', 1, 0, 0, '2020-12-08 19:32:34', '2020-12-08 19:32:34', 0, 0, '2020-12-08 21:21:25', NULL, 'b3405d1d-3881-42bb-835d-ccc7f29b0711', '/b3/40/b3405d1d-3881-42bb-835d-ccc7f29b0711.jpg');
INSERT INTO `sourcelay_file_info` VALUES (206, 9, 'QQ图片20201204205321.png', 'image/png', '/users/9/', 260461, 'e1cdef9023292fce1c0f604f52c89faa', 1, 2, 0, '2020-12-08 19:32:50', '2020-12-08 19:32:50', 1, 0, '2020-12-08 21:21:33', NULL, '2d59976f-4350-4cdd-a312-e82aa95c1a0b', '/2d/59/2d59976f-4350-4cdd-a312-e82aa95c1a0b.png');
INSERT INTO `sourcelay_file_info` VALUES (207, 9, '伪君子.pdf', 'application/pdf', '/users/9/', 2869805, '584345737d3b6afaef3a6521c0d69134', 1, 111, 1, '2020-12-08 21:21:54', '2020-12-08 21:21:54', 1, 0, '2020-12-25 20:35:12', NULL, '050fbe67-71de-4544-99ac-83185df4d9b0', '/05/0f/050fbe67-71de-4544-99ac-83185df4d9b0.pdf');
INSERT INTO `sourcelay_file_info` VALUES (208, 9, 'Argumentation in Artificial Intelligence.pdf', 'application/pdf', '/users/9/', 5984657, '62ef108ae96a34c30c4bdfd441cc0c44', 1, 125, 0, '2020-12-08 21:25:17', '2020-12-08 21:25:17', 1, 0, NULL, NULL, '88577b2a-b4ff-40df-a82e-cc08fc61fc01', '/88/57/88577b2a-b4ff-40df-a82e-cc08fc61fc01.pdf');
INSERT INTO `sourcelay_file_info` VALUES (209, 9, '大话数据结构.pdf', 'application/pdf', '/users/9/', 51521335, 'd1eb80f498b81137c90e9e52bb824f84', 1, 128, 0, '2020-12-08 21:26:55', '2020-12-08 21:26:55', 1, 0, NULL, NULL, '6fd0841c-0bb6-4e6d-9a46-a69553cc34be', '/6f/d0/6fd0841c-0bb6-4e6d-9a46-a69553cc34be.pdf');
INSERT INTO `sourcelay_file_info` VALUES (210, 9, '数据结构(C++语言版)第三版_邓俊辉.pdf', 'application/pdf', '/users/9/', 25493651, '8a922799867b6e0ddbf774ba8d8c5990', 1, 128, 0, '2020-12-08 21:27:53', '2020-12-08 21:27:53', 1, 0, NULL, NULL, '290846fd-6ca0-4a78-89ac-4d8597490687', '/29/08/290846fd-6ca0-4a78-89ac-4d8597490687.pdf');
INSERT INTO `sourcelay_file_info` VALUES (211, 9, '经济学原理第7版 宏观经济学分册 曼昆.pdf', 'application/pdf', '/users/9/', 90782459, '1362ba8173ccc20cb8c4477075f15933', 1, 114, 0, '2020-12-08 21:29:11', '2020-12-08 21:29:11', 1, 0, NULL, NULL, '2aeed488-2c54-4a26-949e-e95288de3c70', '/2a/ee/2aeed488-2c54-4a26-949e-e95288de3c70.pdf');
INSERT INTO `sourcelay_file_info` VALUES (212, 9, '经济学原理第7版 微观经济学分册 曼昆.pdf', 'application/pdf', '/users/9/', 40931412, '421b8e71e0c91a8ecd4f04e4a49da13d', 1, 113, 0, '2020-12-08 21:29:46', '2020-12-08 21:29:46', 1, 0, NULL, NULL, 'dd48784a-9fb8-43df-926a-0147d2ea9c4e', '/dd/48/dd48784a-9fb8-43df-926a-0147d2ea9c4e.pdf');
INSERT INTO `sourcelay_file_info` VALUES (213, 9, '社会心理学  第11版_13920285.pdf', 'application/pdf', '/users/9/', 197859170, '7399c05711caaa4548b56e932a3f27a4', 1, 116, 1, '2020-12-08 21:30:38', '2020-12-08 21:30:38', 1, 0, NULL, NULL, '245fb8a5-e2d1-40cc-b1e8-db426f1c9f1e', '/24/5f/245fb8a5-e2d1-40cc-b1e8-db426f1c9f1e.pdf');
INSERT INTO `sourcelay_file_info` VALUES (214, 4, 'JavaEE实验课考核说明.docx', 'application/vnd.openxmlformats-officedocument.wordprocessingml.document', '/users/4/', 20464, 'ec35ca461ea1be92b97e1e4a6a5452ff', 1, 0, 0, '2020-12-08 21:36:37', '2020-12-08 21:36:37', 0, 0, NULL, NULL, '99b4f985-fe41-4ba9-b87f-e864dd589ce9', '/99/b4/99b4f985-fe41-4ba9-b87f-e864dd589ce9.docx');
INSERT INTO `sourcelay_file_info` VALUES (215, 4, '2009_CVPR_Single_Image_Haze_Removal_Using_Dark_Channel_Prior.pdf', 'application/pdf', '/users/4/', 4389504, '05a01b46ed3cc293728cf0568db2034f', 1, 0, 0, '2020-12-08 21:36:51', '2020-12-08 21:36:51', 0, 0, '2020-12-09 22:18:00', NULL, 'eac6350f-c30a-418a-8fc7-c6bd9e1d80ff', '/ea/c6/eac6350f-c30a-418a-8fc7-c6bd9e1d80ff.pdf');
INSERT INTO `sourcelay_file_info` VALUES (216, 4, '2011_PAMI_Single Image Haze Removal Using Dark Channel Prior.pdf', 'application/pdf', '/users/4/', 6985526, '7352ca162e9ce0630b55049caa6c7501', 1, 0, 0, '2020-12-08 21:37:23', '2020-12-08 21:37:23', 0, 0, '2020-12-09 22:18:34', NULL, '579ded51-f516-4548-953b-77add25bb42c', '/57/9d/579ded51-f516-4548-953b-77add25bb42c.pdf');
INSERT INTO `sourcelay_file_info` VALUES (217, 4, '2015_FaceNet_a unified embedding for face recognition and clustering.pdf', 'application/pdf', '/users/4/', 4705274, '147323a1677df9827f3cf9488cbcc0c1', 1, 0, 0, '2020-12-08 21:37:49', '2020-12-08 21:37:49', 0, 0, '2020-12-09 22:18:33', NULL, 'dea1a909-df27-45ba-bdda-6bf9f2d98d6a', '/de/a1/dea1a909-df27-45ba-bdda-6bf9f2d98d6a.pdf');
INSERT INTO `sourcelay_file_info` VALUES (218, 9, '算法设计与分析.pdf', 'application/pdf', '/users/9/', 33094060, 'd6451177fa8ad123f9f3b372027308cf', 1, 117, 0, '2020-12-08 21:43:42', '2020-12-08 21:43:42', 1, 0, NULL, NULL, 'b5968e00-8f10-4450-a53c-7bc150fa3936', '/b5/96/b5968e00-8f10-4450-a53c-7bc150fa3936.pdf');
INSERT INTO `sourcelay_file_info` VALUES (219, 9, '交互式计算机图形学  基于WEBGL的自顶向下方法  第7版_13946564.pdf', 'application/pdf', '/users/9/', 320346670, '0f515396c60c90f613a34923fe99cb03', 1, 0, 0, '2020-12-08 21:48:44', '2020-12-08 21:48:44', 0, 0, NULL, NULL, '219e9a6e-9d81-47ce-93b7-ea2b232536a6', '/21/9e/219e9a6e-9d81-47ce-93b7-ea2b232536a6.pdf');
INSERT INTO `sourcelay_file_info` VALUES (220, 9, '经济学人20200125.pdf', 'application/pdf', '/users/9/', 20597015, '934cacb9d952c88b79308b4d984f8d7b', 1, 218, 0, '2020-12-08 22:36:36', '2020-12-08 22:36:36', 1, 0, NULL, NULL, '9063eccb-8dfa-4c95-a2a6-31be333fe470', '/90/63/9063eccb-8dfa-4c95-a2a6-31be333fe470.pdf');
INSERT INTO `sourcelay_file_info` VALUES (221, 9, '科学美国人202002.pdf', 'application/pdf', '/users/9/', 29037400, '1647b3174769e4a81c33258d648de941', 1, 109, 0, '2020-12-08 22:36:54', '2020-12-08 22:36:54', 1, 0, NULL, NULL, '0641e276-a6b2-41cd-8dbe-7b4af1a3589b', '/06/41/0641e276-a6b2-41cd-8dbe-7b4af1a3589b.pdf');
INSERT INTO `sourcelay_file_info` VALUES (222, 9, 'TIME 20200127.pdf', 'application/pdf', '/users/9/', 45098126, '32250dd0b7ed5e492292e09a12dc284d', 1, 104, 0, '2020-12-08 22:37:09', '2020-12-08 22:37:09', 1, 0, NULL, NULL, '0a376427-305d-4f0a-8dfa-790812ddec86', '/0a/37/0a376427-305d-4f0a-8dfa-790812ddec86.pdf');
INSERT INTO `sourcelay_file_info` VALUES (223, 4, 'WebGL编程指南.pdf', 'application/pdf', '/users/4/', 85204246, 'a39b2628394cc5025511f4f32891ca66', 1, 100, 0, '2020-12-08 22:47:31', '2020-12-08 22:47:31', 1, 0, NULL, NULL, '1c0de074-ed5a-4daf-9a57-525bc5ebfe04', '/1c/0d/1c0de074-ed5a-4daf-9a57-525bc5ebfe04.pdf');
INSERT INTO `sourcelay_file_info` VALUES (224, 9, '数学资料', 'text/directory', '/users/9/', 0, NULL, 1, 0, 0, '2020-12-09 21:00:30', '2020-12-09 21:00:30', 0, 0, NULL, NULL, 'ba23bd71-a010-4e66-8475-ff73ec974123', NULL);
INSERT INTO `sourcelay_file_info` VALUES (225, 9, '思政课资料', 'text/directory', '/users/9/', 0, NULL, 1, 0, 0, '2020-12-09 21:01:40', '2020-12-09 21:01:40', 0, 0, '2020-12-25 20:35:24', NULL, 'ccaa187a-3821-4e9b-9f4d-26939b976652', NULL);
INSERT INTO `sourcelay_file_info` VALUES (226, 4, 'WPF Test__.pdf', 'application/pdf', '/users/4/', 351172, '7ff659fcbeba5924a9f1c32d15fea5d9', 1, 81, 1, '2020-12-11 17:14:03', '2020-12-11 17:14:03', 1, 0, NULL, NULL, '1aa94adc-c8d9-4566-8786-c7f08f01e9bf', '/1a/a9/1aa94adc-c8d9-4566-8786-c7f08f01e9bf.pdf');
INSERT INTO `sourcelay_file_info` VALUES (227, 4, 'WPF Test__.md', 'application/octet-stream', '/users/4/', 52633, 'b11b686729dee91acc8bdb908b878870', 1, 0, 0, '2020-12-11 17:14:09', '2020-12-11 17:14:09', 0, 0, NULL, NULL, '04510990-2d45-4132-b5f5-2537d6fee678', '/04/51/04510990-2d45-4132-b5f5-2537d6fee678.md');
INSERT INTO `sourcelay_file_info` VALUES (228, 4, '打印PPT.zip', 'application/zip', '/users/4/', 7932488, '48e188caae1fe8a0c84e1888f9a7217a', 1, 74, 0, '2020-12-11 17:14:24', '2020-12-11 17:14:24', 1, 0, NULL, NULL, 'bc89eebf-c371-48ef-b1cd-514a6e5fba7c', '/bc/89/bc89eebf-c371-48ef-b1cd-514a6e5fba7c.zip');
INSERT INTO `sourcelay_file_info` VALUES (229, 23, '23', 'text/directory', '/users/', 0, NULL, 1, 0, 0, '2020-12-13 13:17:52', '2020-12-13 13:17:52', 0, 0, NULL, NULL, '5e866070-46f6-48b4-ad24-53f5a7f4a35e', NULL);
INSERT INTO `sourcelay_file_info` VALUES (230, 23, '[Nekomoe kissaten][Liz to Aoi Tori][Movie][BDRip][Ma10p_1080p][x265_FLACx3_DTS-HDMAx5].mkv', 'video/x-matroska', '/users/23/', 10510327306, NULL, 0, 0, 0, '2020-12-13 13:17:52', '2020-12-13 13:17:52', 0, 0, NULL, NULL, '56e27d91-b0dd-4d1e-af72-c2eedbb68a77', '/56/e2/56e27d91-b0dd-4d1e-af72-c2eedbb68a77.mkv');
INSERT INTO `sourcelay_file_info` VALUES (231, 23, '待处理.jpg', 'image/jpeg', '/users/23/', 308895, 'e2e0275d3655d28bd97d671266281b33', 1, 0, 0, '2020-12-13 13:26:50', '2020-12-13 13:26:50', 0, 0, NULL, NULL, 'a78b5650-cbcf-4796-8461-901603935bf1', '/a7/8b/a78b5650-cbcf-4796-8461-901603935bf1.jpg');
INSERT INTO `sourcelay_file_info` VALUES (232, 23, '情深须臾内，若孑立千年', 'text/directory', '/users/23/', 0, NULL, 1, 0, 0, '2020-12-13 13:27:24', '2020-12-13 13:27:24', 0, 0, NULL, NULL, 'ddab0ea2-d92a-49ff-9d5f-60bf3f3310e7', NULL);
INSERT INTO `sourcelay_file_info` VALUES (233, 23, '00000001.jpg', 'image/jpeg', '/users/23/情深须臾内，若孑立千年/', 579579, 'a790ab26d3e7415ca9d0bdb670a7d82e', 1, 47, 0, '2020-12-13 13:27:36', '2020-12-13 13:27:36', 1, 0, NULL, NULL, '9e5b24b6-cdd5-4588-b74d-8499bb57810c', '/9e/5b/9e5b24b6-cdd5-4588-b74d-8499bb57810c.jpg');
INSERT INTO `sourcelay_file_info` VALUES (234, 23, '00000003.jpg', 'image/jpeg', '/users/23/情深须臾内，若孑立千年/', 161956, '88e371c870bc054b4b45754a3c172e8d', 1, 0, 0, '2020-12-13 13:27:41', '2020-12-13 13:27:41', 0, 0, NULL, NULL, 'd569fe6e-383e-4ea0-9610-5eaa332e60d2', '/d5/69/d569fe6e-383e-4ea0-9610-5eaa332e60d2.jpg');
INSERT INTO `sourcelay_file_info` VALUES (235, 23, '00000004.jpg', 'image/jpeg', '/users/23/情深须臾内，若孑立千年/', 450380, '8ff43a64329f2cdf8c0a5dadc1749b6f', 1, 0, 0, '2020-12-13 13:27:43', '2020-12-13 13:27:43', 0, 0, NULL, NULL, '4cacea9f-f427-4cf6-9d20-73c7c3e1200d', '/4c/ac/4cacea9f-f427-4cf6-9d20-73c7c3e1200d.jpg');
INSERT INTO `sourcelay_file_info` VALUES (236, 23, '00000005.jpg', 'image/jpeg', '/users/23/情深须臾内，若孑立千年/', 558390, '85c5e49b5f1e7d616f6aa817bf4a1660', 1, 0, 0, '2020-12-13 13:27:46', '2020-12-13 13:27:46', 0, 0, NULL, NULL, '922edd8f-fb8f-4fe0-87db-478892487b8a', '/92/2e/922edd8f-fb8f-4fe0-87db-478892487b8a.jpg');
INSERT INTO `sourcelay_file_info` VALUES (237, 23, '00000006.jpg', 'image/jpeg', '/users/23/情深须臾内，若孑立千年/', 702435, '33157559a9b4e42b97f5012c126bbe07', 1, 0, 0, '2020-12-13 13:27:49', '2020-12-13 13:27:49', 0, 0, NULL, NULL, 'aee3a813-6719-4c4c-93e1-fc463d706675', '/ae/e3/aee3a813-6719-4c4c-93e1-fc463d706675.jpg');
INSERT INTO `sourcelay_file_info` VALUES (238, 23, '00000007.jpg', 'image/jpeg', '/users/23/情深须臾内，若孑立千年/', 600122, '0cfc3187af74e64f1d5f39fb2a3a1831', 1, 0, 0, '2020-12-13 13:27:52', '2020-12-13 13:27:52', 0, 0, NULL, NULL, '1d71d433-b3d4-4828-8ac4-efce82fa2f2c', '/1d/71/1d71d433-b3d4-4828-8ac4-efce82fa2f2c.jpg');
INSERT INTO `sourcelay_file_info` VALUES (239, 23, '00000008.jpg', 'image/jpeg', '/users/23/情深须臾内，若孑立千年/', 357933, '8a18a2246bd3f470a5e252c9f97b6318', 1, 0, 0, '2020-12-13 13:27:56', '2020-12-13 13:27:56', 0, 0, NULL, NULL, '0c71f0cb-bd5e-43e9-b91d-fdcaee285011', '/0c/71/0c71f0cb-bd5e-43e9-b91d-fdcaee285011.jpg');
INSERT INTO `sourcelay_file_info` VALUES (240, 23, '00000009.jpg', 'image/jpeg', '/users/23/情深须臾内，若孑立千年/', 476146, '19adee27dbdbfeafd6044bb043048132', 1, 0, 0, '2020-12-13 13:28:00', '2020-12-13 13:28:00', 0, 0, NULL, NULL, 'e0b36182-5716-4f1b-bd37-e57673b9663e', '/e0/b3/e0b36182-5716-4f1b-bd37-e57673b9663e.jpg');
INSERT INTO `sourcelay_file_info` VALUES (241, 23, '00000010.jpg', 'image/jpeg', '/users/23/情深须臾内，若孑立千年/', 690825, 'd02b134253f2a59860e291a4318c4092', 1, 0, 0, '2020-12-13 13:28:03', '2020-12-13 13:28:03', 0, 0, NULL, NULL, 'e2429451-8b77-4f47-a4b7-da4d440fe0d5', '/e2/42/e2429451-8b77-4f47-a4b7-da4d440fe0d5.jpg');
INSERT INTO `sourcelay_file_info` VALUES (242, 23, '00000011.jpg', 'image/jpeg', '/users/23/情深须臾内，若孑立千年/', 650501, '3fe49645c16ba2846170c0764b2ed4da', 1, 0, 0, '2020-12-13 13:28:06', '2020-12-13 13:28:06', 0, 0, NULL, NULL, 'a6338c64-dca8-4e72-a7f1-5af0fa7242e6', '/a6/33/a6338c64-dca8-4e72-a7f1-5af0fa7242e6.jpg');
INSERT INTO `sourcelay_file_info` VALUES (243, 23, '00000012.jpg', 'image/jpeg', '/users/23/情深须臾内，若孑立千年/', 794554, '0d444bcabc98eba17a1cee3158d27213', 1, 0, 0, '2020-12-13 13:28:08', '2020-12-13 13:28:08', 0, 0, NULL, NULL, 'a14ebe6e-f527-4024-900c-0903ea26292f', '/a1/4e/a14ebe6e-f527-4024-900c-0903ea26292f.jpg');
INSERT INTO `sourcelay_file_info` VALUES (244, 23, '00000013.jpg', 'image/jpeg', '/users/23/情深须臾内，若孑立千年/', 665229, '3ba6950a4634c7e8140422f22cb86da8', 1, 0, 0, '2020-12-13 13:28:11', '2020-12-13 13:28:11', 0, 0, NULL, NULL, '63ec988e-5f84-4018-9d26-addabf8fd9c3', '/63/ec/63ec988e-5f84-4018-9d26-addabf8fd9c3.jpg');
INSERT INTO `sourcelay_file_info` VALUES (245, 23, '00000014.jpg', 'image/jpeg', '/users/23/情深须臾内，若孑立千年/', 505184, '30c79a9d14f0d474d3210c2fac2852fb', 1, 0, 0, '2020-12-13 13:28:13', '2020-12-13 13:28:13', 0, 0, NULL, NULL, '0a2c4582-0448-4357-9258-cebd0ff00bbf', '/0a/2c/0a2c4582-0448-4357-9258-cebd0ff00bbf.jpg');
INSERT INTO `sourcelay_file_info` VALUES (246, 23, '00000015.jpg', 'image/jpeg', '/users/23/情深须臾内，若孑立千年/', 733128, '6a68629089a988baed6922026f47718b', 1, 0, 0, '2020-12-13 13:28:16', '2020-12-13 13:28:16', 0, 0, NULL, NULL, 'eb4e8581-e852-4ffd-be8d-d580c0671939', '/eb/4e/eb4e8581-e852-4ffd-be8d-d580c0671939.jpg');
INSERT INTO `sourcelay_file_info` VALUES (247, 23, '00000016.jpg', 'image/jpeg', '/users/23/情深须臾内，若孑立千年/', 557750, 'efb2ccc6a37bb624e3ad95a7d8923c9b', 1, 0, 0, '2020-12-13 13:28:19', '2020-12-13 13:28:19', 0, 0, NULL, NULL, '24572db7-41c1-4f81-87b5-97509478da0d', '/24/57/24572db7-41c1-4f81-87b5-97509478da0d.jpg');
INSERT INTO `sourcelay_file_info` VALUES (248, 23, '00000017.jpg', 'image/jpeg', '/users/23/情深须臾内，若孑立千年/', 564980, 'b0a8bcff74600f02cc684dd00c8ce341', 1, 0, 0, '2020-12-13 13:28:21', '2020-12-13 13:28:21', 0, 0, NULL, NULL, 'a38cf2c1-fa03-4120-8cdb-d22ead1cdc6a', '/a3/8c/a38cf2c1-fa03-4120-8cdb-d22ead1cdc6a.jpg');
INSERT INTO `sourcelay_file_info` VALUES (249, 23, '00000018.jpg', 'image/jpeg', '/users/23/情深须臾内，若孑立千年/', 70012, 'ab7706f02b353526c341759cd678909b', 1, 0, 0, '2020-12-13 13:28:24', '2020-12-13 13:28:24', 0, 0, NULL, NULL, '8ba7c1a0-9375-42b4-b8bb-fcf93e602835', '/8b/a7/8ba7c1a0-9375-42b4-b8bb-fcf93e602835.jpg');
INSERT INTO `sourcelay_file_info` VALUES (250, 23, '00000019.jpg', 'image/jpeg', '/users/23/情深须臾内，若孑立千年/', 584963, 'd8f086aa8ce2cccebf3620a61a54670c', 1, 1, 0, '2020-12-13 13:28:27', '2020-12-13 13:28:27', 0, 0, NULL, NULL, '9f4df3ef-8683-4ba6-90e4-a84a895e69c4', '/9f/4d/9f4df3ef-8683-4ba6-90e4-a84a895e69c4.jpg');
INSERT INTO `sourcelay_file_info` VALUES (251, 23, '[Nekomoe kissaten][Liz to Aoi Tori][Movie][BDRip][Ma10p_1080p][x265_FLACx3_DTS-HDMAx5].mkv', 'video/x-matroska', '/users/23/', 10510327306, NULL, 0, 0, 0, '2020-12-13 13:30:21', '2020-12-13 13:30:21', 0, 0, NULL, NULL, '0c8ea520-d980-431d-8623-314030a76fa7', '/0c/8e/0c8ea520-d980-431d-8623-314030a76fa7.mkv');
INSERT INTO `sourcelay_file_info` VALUES (252, 23, '[Nekomoe kissaten][Liz to Aoi Tori][Movie][BDRip][Ma10p_1080p][x265_FLACx3_DTS-HDMAx5].mkv', 'video/x-matroska', '/users/23/', 10510327306, NULL, 0, 0, 0, '2020-12-13 13:38:24', '2020-12-13 13:38:24', 0, 0, NULL, NULL, 'e64ca8e7-d44c-4e31-af06-c117eb04da94', '/e6/4c/e64ca8e7-d44c-4e31-af06-c117eb04da94.mkv');
INSERT INTO `sourcelay_file_info` VALUES (253, 5, '5', 'text/directory', '/users/', 0, NULL, 1, 0, 0, '2020-12-15 11:40:15', '2020-12-15 11:40:15', 0, 0, NULL, NULL, 'a9d884b4-dfb2-4480-9415-1e6c1614249e', NULL);
INSERT INTO `sourcelay_file_info` VALUES (254, 5, 'Key20th MEMORIAL BOOK [Digital].zip', 'application/zip', '/users/5/', 130620809, '6f15db4c853a38df5ef2444c193465c1', 1, 79, 0, '2020-12-15 11:40:15', '2020-12-15 11:40:15', 1, 0, NULL, NULL, '99eb4f2b-c6ca-4edb-a953-d05897af5a22', '/99/eb/99eb4f2b-c6ca-4edb-a953-d05897af5a22.zip');
INSERT INTO `sourcelay_file_info` VALUES (255, 27, 'DL in MRI', 'text/directory', '/users/27/', 0, NULL, 1, 0, 0, '2020-12-19 14:01:33', '2020-12-19 14:01:33', 0, 0, NULL, NULL, 'ed01fb93-c216-41fe-80e1-69e1c218533d', NULL);
INSERT INTO `sourcelay_file_info` VALUES (256, 27, 'Attention Is All You Need——程勇.pdf', 'application/pdf', '/users/27/DL in MRI/', 483367, 'ba32edea23f91fed7adca990f66dba32', 1, 0, 0, '2020-12-19 14:01:59', '2020-12-19 14:01:59', 0, 0, NULL, NULL, '4fa155f6-20c7-452d-a07b-2830665e467e', '/4f/a1/4fa155f6-20c7-452d-a07b-2830665e467e.pdf');
INSERT INTO `sourcelay_file_info` VALUES (257, 27, 'U-Net+注意力机制.pdf', 'application/pdf', '/users/27/DL in MRI/', 4631734, 'f0636eb6705401ba0b2eacd4eacfafee', 1, 0, 0, '2020-12-19 14:02:05', '2020-12-19 14:02:05', 0, 0, NULL, NULL, '0f6469ca-170c-4388-b34d-d6dd66354d8d', '/0f/64/0f6469ca-170c-4388-b34d-d6dd66354d8d.pdf');
INSERT INTO `sourcelay_file_info` VALUES (258, 27, '注意力模型：机器翻译1.pdf', 'application/pdf', '/users/27/DL in MRI/', 249825, 'a988ee046b70676b2a3e7d667878bfae', 1, 0, 0, '2020-12-19 14:02:11', '2020-12-19 14:02:11', 0, 0, NULL, NULL, '0337635f-ad7a-4f0d-82a4-a1c928297cfc', '/03/37/0337635f-ad7a-4f0d-82a4-a1c928297cfc.pdf');
INSERT INTO `sourcelay_file_info` VALUES (259, 27, 'Neural Architecture Search：A Survey.pdf', 'application/pdf', '/users/27/DL in MRI/', 513920, 'bbd9d10ff070ed226115b38804f36777', 1, 0, 0, '2020-12-19 14:03:19', '2020-12-19 14:03:19', 0, 0, NULL, NULL, '20dccfd3-491a-45fc-9d8e-c6bcac8886d8', '/20/dc/20dccfd3-491a-45fc-9d8e-c6bcac8886d8.pdf');
INSERT INTO `sourcelay_file_info` VALUES (260, 27, 'PyTorch编程指导——程勇.pdf', 'application/pdf', '/users/27/DL in MRI/', 3523636, 'bfd9f8c3ed3b84113b4e9a68685a71e0', 1, 0, 0, '2020-12-19 14:03:25', '2020-12-19 14:03:25', 0, 0, NULL, NULL, '3ddfdb81-c4cd-4b7c-bcfb-229fe92ffda8', '/3d/df/3ddfdb81-c4cd-4b7c-bcfb-229fe92ffda8.pdf');
INSERT INTO `sourcelay_file_info` VALUES (286, 9, '00课程介绍.pptx', 'application/vnd.openxmlformats-officedocument.presentationml.presentation', '/users/9/思政课资料/', 945015, '348b432f95b9579ca2c744de9bf24156', 1, 0, 0, '2020-12-25 10:36:51', '2020-12-25 10:36:51', 0, 0, '2020-12-25 20:35:24', NULL, '6559727a-ff9c-4051-8c42-d03f922e3ee8', '/65/59/6559727a-ff9c-4051-8c42-d03f922e3ee8.pptx');
INSERT INTO `sourcelay_file_info` VALUES (287, 9, '01Windows操作系统概述.pptx', 'application/vnd.openxmlformats-officedocument.presentationml.presentation', '/users/9/思政课资料/', 588142, '439eb52e5442871f273f1043f0da0990', 1, 1, 0, '2020-12-25 11:02:14', '2020-12-25 11:02:14', 0, 0, '2020-12-25 20:35:24', NULL, '57c210c8-e19f-4f2d-8631-1319dd779cac', '/57/c2/57c210c8-e19f-4f2d-8631-1319dd779cac.pptx');
INSERT INTO `sourcelay_file_info` VALUES (288, 10, '商务智能.docx', 'application/vnd.openxmlformats-officedocument.wordprocessingml.document', '/users/10/习题答案/', 14025, 'f4be6b14cc0c5a1a4d4fa742a6035c99', 1, 0, 0, '2020-12-25 19:27:25', '2020-12-25 19:27:25', 0, 0, '2020-12-25 20:07:46', NULL, '823ed758-a2b0-4345-a61b-b34a0458a501', '/82/3e/823ed758-a2b0-4345-a61b-b34a0458a501.docx');
INSERT INTO `sourcelay_file_info` VALUES (289, 10, 'SourceLayLOGO2.png', 'image/png', '/users/10/', 17004, '482387ed01178be3303de218be2f1c4d', 1, 18, 0, '2020-12-25 19:49:40', '2020-12-25 19:49:40', 1, 0, NULL, NULL, 'dc3b673a-1d71-4a1c-b971-2c6cb1af7486', '/dc/3b/dc3b673a-1d71-4a1c-b971-2c6cb1af7486.png');
INSERT INTO `sourcelay_file_info` VALUES (290, 5, '好东西', 'text/directory', '/users/5/', 0, NULL, 1, 0, 0, '2020-12-31 08:34:26', '2020-12-31 08:34:26', 0, 0, NULL, NULL, '507775e3-a236-4a56-8653-2c5f75c9522d', NULL);
INSERT INTO `sourcelay_file_info` VALUES (291, 29, '29', 'text/directory', '/users/', 0, NULL, 1, 0, 0, '2021-01-08 21:36:55', '2021-01-08 21:36:55', 0, 0, NULL, NULL, '76a29691-fe25-4bed-89bd-2db0fed44583', NULL);
INSERT INTO `sourcelay_file_info` VALUES (292, 29, '疯狂原始人2：新纪元.The.Croods.A.New.Age.2020.HD1080P.X264.DD5.1.English.CHS-ENG.mkv', 'video/x-matroska', '/users/29/', 3836059274, NULL, 0, 0, 0, '2021-01-08 21:36:55', '2021-01-08 21:36:55', 0, 0, NULL, NULL, '6b926533-19ac-4181-af05-7d13e3ac1eaa', '/6b/92/6b926533-19ac-4181-af05-7d13e3ac1eaa.mkv');
INSERT INTO `sourcelay_file_info` VALUES (293, 10, 'box1', 'text/directory', '/users/10/', 0, NULL, 1, 0, 0, '2021-04-16 15:23:39', '2021-04-16 15:23:39', 0, 0, NULL, NULL, '4787fcf9-a59e-48d9-b1e4-2f03db8b2132', NULL);
INSERT INTO `sourcelay_file_info` VALUES (294, 10, '6xRQUKDfs-54km4jpTR9z_3j5c.jpg', 'image/jpeg', '/users/10/', 2610365, '02b9454f0031c6abaab374bb7108b63d', 1, 0, 0, '2021-04-19 19:20:22', '2021-04-19 19:20:22', 0, 0, '2021-04-19 19:21:31', NULL, '768c8237-a981-4ece-befd-e250cf8594ac', '/76/8c/768c8237-a981-4ece-befd-e250cf8594ac.jpg');
INSERT INTO `sourcelay_file_info` VALUES (295, 10, 'picture', 'text/directory', '/users/10/', 0, NULL, 1, 0, 0, '2021-04-19 19:20:49', '2021-04-19 19:20:49', 0, 0, NULL, NULL, '6786cc10-1c35-4ea1-a599-bd538821f551', NULL);
INSERT INTO `sourcelay_file_info` VALUES (296, 10, 'IzXxvHAfVAl0AhTUVyBvCf8zF8.jpg', 'image/jpeg', '/users/10/picture/', 4316610, 'dd7af94e8adc9b9473c610113ad4f462', 1, 0, 0, '2021-04-19 19:21:02', '2021-04-19 19:21:02', 0, 0, '2021-04-19 19:21:07', NULL, '76ac9123-0ac5-4cb2-879a-b007fcc63481', '/76/ac/76ac9123-0ac5-4cb2-879a-b007fcc63481.jpg');
INSERT INTO `sourcelay_file_info` VALUES (297, 10, '6xRQUKDfs-54km4jpTR9z_3j5c.jpg', 'image/jpeg', '/users/10/picture/', 2610365, '02b9454f0031c6abaab374bb7108b63d', 1, 0, 0, '2021-04-19 19:21:13', '2021-04-19 19:21:13', 0, 0, NULL, NULL, '23364549-7285-4f9b-9112-66e085f77bad', '/23/36/23364549-7285-4f9b-9112-66e085f77bad.jpg');

-- ----------------------------
-- Table structure for sourcelay_file_like_info
-- ----------------------------
DROP TABLE IF EXISTS `sourcelay_file_like_info`;
CREATE TABLE `sourcelay_file_like_info`  (
  `id` bigint NOT NULL COMMENT '点赞id',
  `user_id` bigint NOT NULL COMMENT '用户id',
  `created_at` datetime(0) NOT NULL COMMENT '点赞时间',
  `file_id` bigint NULL DEFAULT NULL COMMENT '文件id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of sourcelay_file_like_info
-- ----------------------------
INSERT INTO `sourcelay_file_like_info` VALUES (0, 4, '2020-12-10 12:40:57', 207);
INSERT INTO `sourcelay_file_like_info` VALUES (1, 4, '2020-12-10 12:41:10', 188);
INSERT INTO `sourcelay_file_like_info` VALUES (2, 4, '2020-12-10 12:41:20', 201);
INSERT INTO `sourcelay_file_like_info` VALUES (3, 4, '2020-12-11 17:12:57', 213);
INSERT INTO `sourcelay_file_like_info` VALUES (4, 24, '2020-12-16 20:16:22', 226);

-- ----------------------------
-- Table structure for sourcelay_file_shared_info
-- ----------------------------
DROP TABLE IF EXISTS `sourcelay_file_shared_info`;
CREATE TABLE `sourcelay_file_shared_info`  (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '分享id',
  `file_id` bigint NOT NULL COMMENT '文件id',
  `user_id` bigint NOT NULL COMMENT '文件分享者',
  `shared_desc` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '文件分享描述',
  `shared_type` smallint NOT NULL COMMENT '文件分享类型（1密码 2给钱）',
  `password` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '文件分享密码',
  `is_anonymous` tinyint NOT NULL COMMENT '文件是否匿名分享',
  `cost` int NULL DEFAULT NULL COMMENT '文件所需积分',
  `view_count` int NULL DEFAULT NULL COMMENT '文件浏览数',
  `download_count` int NULL DEFAULT NULL COMMENT '文件下载数',
  `is_recommended` tinyint NOT NULL COMMENT '是否被推荐',
  `recommended_at` datetime(0) NULL DEFAULT NULL COMMENT '推荐时间',
  `created_at` datetime(0) NULL DEFAULT NULL COMMENT '分享时间',
  `deleted_at` datetime(0) NULL DEFAULT NULL COMMENT '撤销分享时间',
  `deleted_id` bigint NULL DEFAULT NULL COMMENT '撤销分享的id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 47 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of sourcelay_file_shared_info
-- ----------------------------
INSERT INTO `sourcelay_file_shared_info` VALUES (18, 188, 1, '公开分享测试', 0, NULL, 0, NULL, 0, 579, 0, NULL, '2020-12-05 14:18:30', NULL, NULL);
INSERT INTO `sourcelay_file_shared_info` VALUES (19, 190, 1, '密码分享测试，密码：123456', 1, '123456', 0, NULL, 0, 164, 0, NULL, '2020-12-05 14:18:46', NULL, NULL);
INSERT INTO `sourcelay_file_shared_info` VALUES (20, 189, 1, '付费分享测试', 2, NULL, 0, 100, 0, 173, 0, NULL, '2020-12-05 14:19:02', NULL, NULL);
INSERT INTO `sourcelay_file_shared_info` VALUES (23, 165, 4, 'dzyTest', 0, '123456', 0, 0, 0, 513, 0, NULL, '2020-12-05 15:52:31', NULL, NULL);
INSERT INTO `sourcelay_file_shared_info` VALUES (24, 193, 4, 'A_Salty_Fish的java虚拟机规范中文版', 0, NULL, 0, NULL, 0, 162, 0, NULL, '2020-12-08 14:21:49', NULL, NULL);
INSERT INTO `sourcelay_file_shared_info` VALUES (25, 201, 10, '答案！', 0, NULL, 0, NULL, 0, 124, 0, NULL, '2020-12-08 19:02:19', '2020-12-25 20:07:24', NULL);
INSERT INTO `sourcelay_file_shared_info` VALUES (26, 206, 9, '这是一个漂亮小改改', 1, '123', 0, NULL, 0, 2, 0, NULL, '2020-12-08 19:33:20', '2020-12-08 21:21:33', NULL);
INSERT INTO `sourcelay_file_shared_info` VALUES (27, 207, 9, '赵少侯伪君子剧本', 0, NULL, 0, NULL, 0, 110, 0, NULL, '2020-12-08 21:22:43', '2020-12-25 20:35:12', NULL);
INSERT INTO `sourcelay_file_shared_info` VALUES (28, 208, 9, '', 0, NULL, 0, NULL, 0, 125, 0, NULL, '2020-12-08 21:25:34', NULL, NULL);
INSERT INTO `sourcelay_file_shared_info` VALUES (29, 209, 9, '', 0, NULL, 0, NULL, 0, 128, 0, NULL, '2020-12-08 21:27:23', NULL, NULL);
INSERT INTO `sourcelay_file_shared_info` VALUES (30, 210, 9, '', 0, NULL, 0, NULL, 0, 128, 0, NULL, '2020-12-08 21:28:10', NULL, NULL);
INSERT INTO `sourcelay_file_shared_info` VALUES (31, 213, 9, '', 0, NULL, 0, NULL, 0, 115, 0, NULL, '2020-12-08 21:40:03', NULL, NULL);
INSERT INTO `sourcelay_file_shared_info` VALUES (32, 211, 9, '', 0, NULL, 0, NULL, 0, 114, 0, NULL, '2020-12-08 21:40:05', NULL, NULL);
INSERT INTO `sourcelay_file_shared_info` VALUES (33, 212, 9, '', 0, NULL, 0, NULL, 0, 113, 0, NULL, '2020-12-08 21:40:07', NULL, NULL);
INSERT INTO `sourcelay_file_shared_info` VALUES (34, 218, 9, '', 0, NULL, 0, NULL, 0, 117, 0, NULL, '2020-12-08 21:44:00', NULL, NULL);
INSERT INTO `sourcelay_file_shared_info` VALUES (35, 220, 9, '', 0, NULL, 0, NULL, 0, 115, 0, NULL, '2020-12-08 22:36:48', NULL, NULL);
INSERT INTO `sourcelay_file_shared_info` VALUES (36, 220, 9, '', 0, NULL, 0, NULL, 0, 103, 0, NULL, '2020-12-08 22:37:38', NULL, NULL);
INSERT INTO `sourcelay_file_shared_info` VALUES (37, 221, 9, '', 0, NULL, 0, NULL, 0, 109, 0, NULL, '2020-12-08 22:37:41', NULL, NULL);
INSERT INTO `sourcelay_file_shared_info` VALUES (38, 222, 9, '', 0, NULL, 0, NULL, 0, 104, 0, NULL, '2020-12-08 22:37:43', NULL, NULL);
INSERT INTO `sourcelay_file_shared_info` VALUES (39, 223, 4, '一本很好的学习WebGL的书，就是版本有点老。', 0, NULL, 0, NULL, 0, 100, 0, NULL, '2020-12-08 22:48:36', NULL, NULL);
INSERT INTO `sourcelay_file_shared_info` VALUES (40, 226, 4, 'Windows WPF Test pdf 打印版', 0, NULL, 0, NULL, 0, 81, 0, NULL, '2020-12-11 17:15:40', NULL, NULL);
INSERT INTO `sourcelay_file_shared_info` VALUES (41, 228, 4, 'Windows PPT 打印版', 0, NULL, 0, NULL, 0, 74, 0, NULL, '2020-12-11 17:15:54', NULL, NULL);
INSERT INTO `sourcelay_file_shared_info` VALUES (42, 233, 23, '', 0, NULL, 0, NULL, 0, 47, 0, NULL, '2020-12-13 13:29:13', NULL, NULL);
INSERT INTO `sourcelay_file_shared_info` VALUES (43, 254, 5, '', 0, NULL, 0, NULL, 0, 66, 0, NULL, '2020-12-15 11:41:47', NULL, NULL);
INSERT INTO `sourcelay_file_shared_info` VALUES (44, 254, 5, '', 0, NULL, 0, NULL, 0, 7, 0, NULL, '2020-12-15 11:41:51', '2020-12-31 08:34:49', 5);
INSERT INTO `sourcelay_file_shared_info` VALUES (45, 254, 5, 'Key20th MEMORIAL BOOK', 0, NULL, 0, NULL, 0, 5, 0, NULL, '2020-12-15 11:42:08', '2020-12-31 08:34:51', 5);
INSERT INTO `sourcelay_file_shared_info` VALUES (46, 289, 10, 'SourceLay', 1, '123456', 0, NULL, 0, 12, 0, NULL, '2021-04-19 19:16:59', NULL, NULL);
INSERT INTO `sourcelay_file_shared_info` VALUES (47, 289, 10, 'SourceLay', 2, NULL, 0, 5000, 0, 4, 0, NULL, '2021-04-19 19:18:14', NULL, NULL);

-- ----------------------------
-- Table structure for sourcelay_file_sharedorder
-- ----------------------------
DROP TABLE IF EXISTS `sourcelay_file_sharedorder`;
CREATE TABLE `sourcelay_file_sharedorder`  (
  `order_id` bigint NOT NULL,
  `fileshared_id` bigint NOT NULL,
  `created_at` datetime(0) NOT NULL COMMENT '创建时间',
  `updated_at` datetime(0) NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`order_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of sourcelay_file_sharedorder
-- ----------------------------
INSERT INTO `sourcelay_file_sharedorder` VALUES (15, 20, '2020-12-07 08:15:03', '2020-12-07 08:15:03');
INSERT INTO `sourcelay_file_sharedorder` VALUES (16, 20, '2020-12-07 11:47:48', '2020-12-07 11:47:48');
INSERT INTO `sourcelay_file_sharedorder` VALUES (17, 20, '2020-12-07 12:04:47', '2020-12-07 12:04:47');
INSERT INTO `sourcelay_file_sharedorder` VALUES (18, 20, '2020-12-09 22:45:58', '2020-12-09 22:45:58');
INSERT INTO `sourcelay_file_sharedorder` VALUES (19, 20, '2020-12-09 22:50:27', '2020-12-09 22:50:27');
INSERT INTO `sourcelay_file_sharedorder` VALUES (20, 20, '2020-12-09 22:51:39', '2020-12-09 22:51:39');
INSERT INTO `sourcelay_file_sharedorder` VALUES (21, 20, '2020-12-31 08:40:17', '2020-12-31 08:40:17');

-- ----------------------------
-- Table structure for sourcelay_file_tag_relation_info
-- ----------------------------
DROP TABLE IF EXISTS `sourcelay_file_tag_relation_info`;
CREATE TABLE `sourcelay_file_tag_relation_info`  (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT 'relation id',
  `file_id` bigint NOT NULL COMMENT '文件id',
  `tag_id` bigint NOT NULL COMMENT 'tag id',
  `created_at` datetime(0) NULL DEFAULT NULL COMMENT '关系建立时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of sourcelay_file_tag_relation_info
-- ----------------------------

-- ----------------------------
-- Table structure for sourcelay_file_thread_relation_info
-- ----------------------------
DROP TABLE IF EXISTS `sourcelay_file_thread_relation_info`;
CREATE TABLE `sourcelay_file_thread_relation_info`  (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '关系对应id',
  `file_id` bigint NULL DEFAULT NULL,
  `fileshare_id` bigint NULL DEFAULT NULL COMMENT '文件id',
  `thread_id` bigint NULL DEFAULT NULL COMMENT '帖子id',
  `post_id` bigint NULL DEFAULT NULL COMMENT '帖子回复id',
  `priority` int NULL DEFAULT NULL COMMENT '对应帖子权重',
  `created_at` datetime(0) NULL DEFAULT NULL COMMENT '关系建立时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 44 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of sourcelay_file_thread_relation_info
-- ----------------------------
INSERT INTO `sourcelay_file_thread_relation_info` VALUES (13, 193, 24, 8, 117, 30, '2020-12-08 16:19:50');
INSERT INTO `sourcelay_file_thread_relation_info` VALUES (15, 201, 25, 12, 135, 30, '2020-12-08 19:03:31');
INSERT INTO `sourcelay_file_thread_relation_info` VALUES (16, 207, 27, 14, 138, 30, '2020-12-08 21:23:33');
INSERT INTO `sourcelay_file_thread_relation_info` VALUES (17, 208, 28, 15, 139, 30, '2020-12-08 21:26:18');
INSERT INTO `sourcelay_file_thread_relation_info` VALUES (18, 209, 29, 16, 140, 30, '2020-12-08 21:34:41');
INSERT INTO `sourcelay_file_thread_relation_info` VALUES (19, 210, 30, 16, 140, 30, '2020-12-08 21:34:41');
INSERT INTO `sourcelay_file_thread_relation_info` VALUES (20, 209, 29, 17, 141, 30, '2020-12-08 21:34:41');
INSERT INTO `sourcelay_file_thread_relation_info` VALUES (21, 210, 30, 17, 141, 30, '2020-12-08 21:34:41');
INSERT INTO `sourcelay_file_thread_relation_info` VALUES (22, 213, 31, 18, 142, 30, '2020-12-08 21:40:42');
INSERT INTO `sourcelay_file_thread_relation_info` VALUES (23, 212, 33, 19, 143, 30, '2020-12-08 21:41:49');
INSERT INTO `sourcelay_file_thread_relation_info` VALUES (24, 211, 32, 19, 143, 30, '2020-12-08 21:41:49');
INSERT INTO `sourcelay_file_thread_relation_info` VALUES (25, 218, 34, 20, 144, 30, '2020-12-08 21:44:30');
INSERT INTO `sourcelay_file_thread_relation_info` VALUES (26, 222, 38, 22, 147, 30, '2020-12-08 22:38:14');
INSERT INTO `sourcelay_file_thread_relation_info` VALUES (27, 221, 37, 23, 148, 30, '2020-12-08 22:38:44');
INSERT INTO `sourcelay_file_thread_relation_info` VALUES (28, 220, 35, 24, 149, 30, '2020-12-08 22:39:45');
INSERT INTO `sourcelay_file_thread_relation_info` VALUES (29, 228, 41, 30, 161, 30, '2020-12-11 17:17:55');
INSERT INTO `sourcelay_file_thread_relation_info` VALUES (30, 226, 40, 30, 161, 30, '2020-12-11 17:17:55');
INSERT INTO `sourcelay_file_thread_relation_info` VALUES (31, 254, 43, 31, 165, 30, '2020-12-15 11:42:22');
INSERT INTO `sourcelay_file_thread_relation_info` VALUES (41, 188, 18, 6, 111, 100, '2020-12-16 21:08:31');
INSERT INTO `sourcelay_file_thread_relation_info` VALUES (42, 190, 19, 6, 111, 100, '2020-12-16 21:08:31');
INSERT INTO `sourcelay_file_thread_relation_info` VALUES (43, 189, 20, 6, 111, 100, '2020-12-16 21:08:31');
INSERT INTO `sourcelay_file_thread_relation_info` VALUES (44, 289, 46, 36, 185, 100, '2021-04-20 11:05:21');

-- ----------------------------
-- Table structure for sourcelay_tag_info
-- ----------------------------
DROP TABLE IF EXISTS `sourcelay_tag_info`;
CREATE TABLE `sourcelay_tag_info`  (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT 'tag id',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT 'tag名',
  `user_id` bigint NULL DEFAULT NULL COMMENT '创建tag的用户id',
  `file_count` int NULL DEFAULT NULL COMMENT '与该tag相关的文件数',
  `download_count` int NULL DEFAULT NULL COMMENT '与该tag相关的文件下载数',
  `view_count` int NULL DEFAULT NULL COMMENT '该tag下文件的浏览数',
  `is_recommended` tinyint NULL DEFAULT NULL COMMENT '是否推荐该tag',
  `recommended_at` datetime(0) NULL DEFAULT NULL COMMENT '推荐时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of sourcelay_tag_info
-- ----------------------------

-- ----------------------------
-- Table structure for stop_words
-- ----------------------------
DROP TABLE IF EXISTS `stop_words`;
CREATE TABLE `stop_words`  (
  `id` bigint UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '敏感词 id',
  `user_id` bigint UNSIGNED NULL DEFAULT NULL COMMENT '创建用户 id',
  `ugc` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '用户内容处理方式',
  `username` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '用户名处理方式',
  `signature` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '用户签名处理方式',
  `dialog` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '短消息处理方式',
  `find` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '敏感词或查找方式',
  `replacement` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '替换词或替换规则',
  `created_at` datetime(0) NOT NULL COMMENT '创建时间',
  `updated_at` datetime(0) NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of stop_words
-- ----------------------------

-- ----------------------------
-- Table structure for thread_topic
-- ----------------------------
DROP TABLE IF EXISTS `thread_topic`;
CREATE TABLE `thread_topic`  (
  `thread_id` bigint UNSIGNED NOT NULL COMMENT '主题ID',
  `topic_id` bigint UNSIGNED NOT NULL COMMENT '话题ID',
  `created_at` datetime(0) NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`thread_id`, `topic_id`) USING BTREE,
  INDEX `thread_topic_topic_id_foreign`(`topic_id`) USING BTREE,
  CONSTRAINT `thread_topic_thread_id_foreign` FOREIGN KEY (`thread_id`) REFERENCES `threads` (`id`) ON DELETE CASCADE ON UPDATE RESTRICT,
  CONSTRAINT `thread_topic_topic_id_foreign` FOREIGN KEY (`topic_id`) REFERENCES `topics` (`id`) ON DELETE CASCADE ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of thread_topic
-- ----------------------------
INSERT INTO `thread_topic` VALUES (1, 1, '2020-08-16 12:04:22');
INSERT INTO `thread_topic` VALUES (2, 2, '2020-08-16 12:05:04');
INSERT INTO `thread_topic` VALUES (3, 2, '2020-08-16 19:53:33');
INSERT INTO `thread_topic` VALUES (4, 2, '2020-11-24 22:10:34');
INSERT INTO `thread_topic` VALUES (4, 3, '2020-11-24 22:10:34');
INSERT INTO `thread_topic` VALUES (5, 2, '2020-11-25 14:36:01');
INSERT INTO `thread_topic` VALUES (5, 4, '2020-11-25 14:36:01');
INSERT INTO `thread_topic` VALUES (6, 2, '2020-12-05 14:23:42');
INSERT INTO `thread_topic` VALUES (6, 5, '2020-12-05 14:23:42');
INSERT INTO `thread_topic` VALUES (9, 6, '2020-12-08 14:38:31');
INSERT INTO `thread_topic` VALUES (13, 6, '2020-12-08 19:51:18');
INSERT INTO `thread_topic` VALUES (14, 7, '2020-12-08 21:23:33');
INSERT INTO `thread_topic` VALUES (15, 8, '2020-12-08 21:26:18');
INSERT INTO `thread_topic` VALUES (16, 8, '2020-12-08 21:34:41');
INSERT INTO `thread_topic` VALUES (17, 8, '2020-12-08 21:34:41');
INSERT INTO `thread_topic` VALUES (18, 8, '2020-12-08 21:40:42');
INSERT INTO `thread_topic` VALUES (19, 8, '2020-12-08 21:41:49');
INSERT INTO `thread_topic` VALUES (20, 8, '2020-12-08 21:44:30');
INSERT INTO `thread_topic` VALUES (21, 2, '2020-12-08 22:05:23');
INSERT INTO `thread_topic` VALUES (21, 3, '2020-12-08 22:05:23');
INSERT INTO `thread_topic` VALUES (22, 9, '2020-12-08 22:38:14');
INSERT INTO `thread_topic` VALUES (23, 9, '2020-12-08 22:38:44');
INSERT INTO `thread_topic` VALUES (24, 10, '2020-12-08 22:39:45');
INSERT INTO `thread_topic` VALUES (26, 11, '2020-12-09 19:58:16');
INSERT INTO `thread_topic` VALUES (29, 6, '2020-12-10 09:20:06');
INSERT INTO `thread_topic` VALUES (30, 12, '2020-12-11 17:17:55');
INSERT INTO `thread_topic` VALUES (31, 13, '2020-12-15 11:42:22');
INSERT INTO `thread_topic` VALUES (34, 14, '2021-01-21 13:50:46');

-- ----------------------------
-- Table structure for thread_user
-- ----------------------------
DROP TABLE IF EXISTS `thread_user`;
CREATE TABLE `thread_user`  (
  `thread_id` bigint UNSIGNED NOT NULL COMMENT '主题 id',
  `user_id` bigint UNSIGNED NOT NULL COMMENT '用户 id',
  `created_at` datetime(0) NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`thread_id`, `user_id`) USING BTREE,
  INDEX `thread_user_user_id_foreign`(`user_id`) USING BTREE,
  CONSTRAINT `thread_user_thread_id_foreign` FOREIGN KEY (`thread_id`) REFERENCES `threads` (`id`) ON DELETE CASCADE ON UPDATE RESTRICT,
  CONSTRAINT `thread_user_user_id_foreign` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`) ON DELETE CASCADE ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of thread_user
-- ----------------------------

-- ----------------------------
-- Table structure for thread_video
-- ----------------------------
DROP TABLE IF EXISTS `thread_video`;
CREATE TABLE `thread_video`  (
  `id` bigint UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '音视频 id',
  `thread_id` bigint UNSIGNED NOT NULL COMMENT '主题 id',
  `post_id` bigint UNSIGNED NOT NULL COMMENT '帖子 id',
  `user_id` bigint UNSIGNED NOT NULL COMMENT '用户 id',
  `type` tinyint UNSIGNED NOT NULL DEFAULT 0 COMMENT '类型：0 视频 1 音频',
  `status` tinyint NOT NULL DEFAULT 0 COMMENT '音视频状态：0 转码中 1 转码完成 2 转码失败',
  `reason` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '转码失败原因',
  `file_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '文件名',
  `file_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '媒体文件唯一标识',
  `height` int UNSIGNED NOT NULL DEFAULT 0 COMMENT '视频高',
  `width` int UNSIGNED NOT NULL DEFAULT 0 COMMENT '视频宽',
  `duration` decimal(10, 2) UNSIGNED NOT NULL DEFAULT 0.00 COMMENT '视频时长',
  `media_url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '媒体播放地址',
  `cover_url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '媒体封面地址',
  `created_at` datetime(0) NOT NULL COMMENT '创建时间',
  `updated_at` datetime(0) NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `thread_video_thread_id_index`(`thread_id`) USING BTREE,
  INDEX `thread_video_post_id_index`(`post_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of thread_video
-- ----------------------------

-- ----------------------------
-- Table structure for threads
-- ----------------------------
DROP TABLE IF EXISTS `threads`;
CREATE TABLE `threads`  (
  `id` bigint UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主题 id',
  `user_id` bigint UNSIGNED NULL DEFAULT NULL COMMENT '创建用户 id',
  `last_posted_user_id` bigint UNSIGNED NULL DEFAULT NULL COMMENT '最后回复用户 id',
  `category_id` int UNSIGNED NULL DEFAULT NULL COMMENT '分类 id',
  `type` tinyint UNSIGNED NOT NULL DEFAULT 0 COMMENT '类型：0普通 1长文 2视频 3图片',
  `title` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '标题',
  `price` decimal(8, 2) UNSIGNED NOT NULL DEFAULT 0.00 COMMENT '价格',
  `attachment_price` decimal(8, 2) UNSIGNED NOT NULL DEFAULT 0.00 COMMENT '附件价格',
  `free_words` double UNSIGNED NOT NULL DEFAULT 0 COMMENT '免费字数百分比',
  `post_count` int UNSIGNED NOT NULL DEFAULT 0 COMMENT '回复数',
  `view_count` int UNSIGNED NOT NULL DEFAULT 0 COMMENT '查看数',
  `rewarded_count` int UNSIGNED NOT NULL DEFAULT 0 COMMENT '打赏数',
  `paid_count` int UNSIGNED NOT NULL DEFAULT 0 COMMENT '付费数',
  `longitude` decimal(10, 7) NOT NULL DEFAULT 0.0000000 COMMENT '经度',
  `latitude` decimal(10, 7) NOT NULL DEFAULT 0.0000000 COMMENT '纬度',
  `address` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '地址',
  `location` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '位置',
  `created_at` datetime(0) NOT NULL COMMENT '创建时间',
  `updated_at` datetime(0) NOT NULL COMMENT '更新时间',
  `deleted_at` datetime(0) NULL DEFAULT NULL COMMENT '删除时间',
  `deleted_user_id` bigint UNSIGNED NULL DEFAULT NULL COMMENT '删除用户 id',
  `is_approved` tinyint UNSIGNED NOT NULL DEFAULT 1 COMMENT '是否合法',
  `is_sticky` tinyint UNSIGNED NOT NULL DEFAULT 0 COMMENT '是否置顶',
  `is_essence` tinyint UNSIGNED NOT NULL DEFAULT 0 COMMENT '是否加精',
  `is_site` tinyint UNSIGNED NOT NULL DEFAULT 0 COMMENT '是否推荐到首页（0否 1是）',
  `is_anonymous` tinyint NOT NULL DEFAULT 0 COMMENT '是否匿名 0否 1是',
  `is_display` tinyint NOT NULL DEFAULT 1 COMMENT '是否显示 0否 1是',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `threads_user_id_foreign`(`user_id`) USING BTREE,
  INDEX `threads_last_posted_user_id_foreign`(`last_posted_user_id`) USING BTREE,
  INDEX `threads_deleted_user_id_foreign`(`deleted_user_id`) USING BTREE,
  INDEX `idx_category_id`(`category_id`) USING BTREE,
  INDEX `idx_is_sticky`(`is_sticky`) USING BTREE,
  CONSTRAINT `threads_deleted_user_id_foreign` FOREIGN KEY (`deleted_user_id`) REFERENCES `users` (`id`) ON DELETE SET NULL ON UPDATE RESTRICT,
  CONSTRAINT `threads_last_posted_user_id_foreign` FOREIGN KEY (`last_posted_user_id`) REFERENCES `users` (`id`) ON DELETE SET NULL ON UPDATE RESTRICT,
  CONSTRAINT `threads_user_id_foreign` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`) ON DELETE SET NULL ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 36 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of threads
-- ----------------------------
INSERT INTO `threads` VALUES (1, 1, 1, 7, 1, '[发帖] 测试帖', 0.00, 0.00, 0, 5, 102, 0, 0, 0.0000000, 0.0000000, '', '', '2020-08-16 12:04:22', '2020-12-08 14:01:45', NULL, NULL, 1, 0, 0, 0, 0, 1);
INSERT INTO `threads` VALUES (2, 1, 5, 7, 1, '[测试] 长帖子测试', 0.00, 0.00, 0, 104, 214, 0, 0, 0.0000000, 0.0000000, '', '', '2020-08-16 12:05:04', '2021-02-23 14:53:11', NULL, NULL, 1, 0, 0, 0, 0, 1);
INSERT INTO `threads` VALUES (3, 1, 1, 7, 1, '[测试] 带图发帖 ', 0.00, 0.00, 0, 1, 44, 0, 0, 0.0000000, 0.0000000, '', '', '2020-08-16 19:53:33', '2020-08-16 19:53:33', NULL, NULL, 1, 0, 0, 0, 0, 1);
INSERT INTO `threads` VALUES (4, 1, 9, 7, 1, '[测试][LaTeX] LaTeX 测试', 0.00, 0.00, 0, 3, 56, 0, 0, 0.0000000, 0.0000000, '', '', '2020-11-24 22:10:34', '2020-12-08 15:11:40', NULL, NULL, 1, 0, 0, 0, 0, 1);
INSERT INTO `threads` VALUES (5, 1, 1, 7, 1, '[测试][Prism] 代码高亮测试', 0.00, 0.00, 0, 3, 86, 0, 0, 0.0000000, 0.0000000, '', '', '2020-11-25 14:36:01', '2020-11-25 15:29:55', NULL, NULL, 1, 0, 0, 0, 0, 1);
INSERT INTO `threads` VALUES (6, 1, 10, 7, 1, '[测试][文件分享] 文件分享测试', 0.00, 0.00, 0, 3, 316, 0, 0, 0.0000000, 0.0000000, '', '', '2020-12-05 14:23:41', '2020-12-16 21:08:09', NULL, NULL, 1, 0, 0, 0, 0, 1);
INSERT INTO `threads` VALUES (7, 10, 10, 27, 1, '冲鸭', 0.00, 0.00, 0, 10, 91, 0, 0, 0.0000000, 0.0000000, '', '', '2020-12-08 11:33:18', '2020-12-09 09:52:21', NULL, NULL, 1, 0, 0, 0, 0, 1);
INSERT INTO `threads` VALUES (8, 4, 10, 10, 1, 'Java虚拟机规范中文版', 0.00, 0.00, 0, 3, 50, 0, 0, 0.0000000, 0.0000000, '', '', '2020-12-08 14:24:14', '2020-12-08 16:20:30', NULL, NULL, 1, 0, 0, 0, 0, 1);
INSERT INTO `threads` VALUES (9, 1, 1, 28, 1, '[帮助] SourceLay 社区操作指南', 0.00, 0.00, 0, 3, 494, 0, 0, 0.0000000, 0.0000000, '', '', '2020-12-08 14:38:31', '2020-12-15 13:46:00', NULL, NULL, 1, 1, 0, 0, 0, 1);
INSERT INTO `threads` VALUES (10, 9, 5, 21, 1, '服创冲冲冲！', 0.00, 0.00, 0, 3, 29, 0, 0, 0.0000000, 0.0000000, '', '', '2020-12-08 15:48:25', '2020-12-08 16:21:35', NULL, NULL, 1, 0, 0, 0, 0, 1);
INSERT INTO `threads` VALUES (11, 12, 12, 7, 1, '微博图床测试', 0.00, 0.00, 0, 1, 13, 0, 0, 0.0000000, 0.0000000, '', '', '2020-12-08 15:59:32', '2020-12-08 15:59:32', NULL, NULL, 1, 0, 0, 0, 0, 1);
INSERT INTO `threads` VALUES (12, 10, 10, 4, 1, '奇怪的东西', 0.00, 0.00, 0, 1, 33, 0, 0, 0.0000000, 0.0000000, '', '', '2020-12-08 19:03:14', '2020-12-08 19:03:14', NULL, NULL, 1, 0, 0, 0, 0, 1);
INSERT INTO `threads` VALUES (13, 1, 1, 28, 1, '[帮助]SourceLay 社区维护指南', 0.00, 0.00, 0, 1, 151, 0, 0, 0.0000000, 0.0000000, '', '', '2020-12-08 19:51:18', '2020-12-09 16:13:38', NULL, NULL, 1, 0, 0, 0, 0, 1);
INSERT INTO `threads` VALUES (14, 9, 9, 11, 1, '[剧本分享] 赵少侯 伪君子 剧本 PDF文件', 0.00, 0.00, 0, 1, 2, 0, 0, 0.0000000, 0.0000000, '', '', '2020-12-08 21:23:33', '2020-12-08 21:23:33', NULL, NULL, 1, 0, 0, 0, 0, 1);
INSERT INTO `threads` VALUES (15, 9, 9, 10, 1, '[书籍分享] Argumentation in Artificial Intelligence 2009 PDF', 0.00, 0.00, 0, 1, 9, 0, 0, 0.0000000, 0.0000000, '', '', '2020-12-08 21:26:18', '2020-12-08 21:26:18', NULL, NULL, 1, 0, 0, 0, 0, 1);
INSERT INTO `threads` VALUES (16, 9, 9, 10, 1, '[书籍分享] 数据结构相关书籍 PDF版本', 0.00, 0.00, 0, 1, 4, 0, 0, 0.0000000, 0.0000000, '', '', '2020-12-08 21:34:41', '2020-12-08 21:34:41', '2020-12-10 14:31:12', 1, 1, 0, 0, 0, 0, 1);
INSERT INTO `threads` VALUES (17, 9, 9, 10, 1, '[书籍分享] 数据结构相关书籍 PDF版本', 0.00, 0.00, 0, 1, 22, 0, 0, 0.0000000, 0.0000000, '', '', '2020-12-08 21:34:41', '2020-12-08 21:34:41', NULL, NULL, 1, 0, 0, 0, 0, 1);
INSERT INTO `threads` VALUES (18, 9, 9, 11, 1, '[书籍分享] 社会心理学 第11版 PDF', 0.00, 0.00, 0, 1, 7, 0, 0, 0.0000000, 0.0000000, '', '', '2020-12-08 21:40:42', '2020-12-08 21:40:42', NULL, NULL, 1, 0, 0, 0, 0, 1);
INSERT INTO `threads` VALUES (19, 9, 9, 11, 1, '[书籍分享] 经济学原理第七版 宏观微观两分册 PDF', 0.00, 0.00, 0, 1, 14, 0, 0, 0.0000000, 0.0000000, '', '', '2020-12-08 21:41:49', '2020-12-08 21:41:49', NULL, NULL, 1, 0, 0, 0, 0, 1);
INSERT INTO `threads` VALUES (20, 9, 9, 10, 1, '[书籍分享] 算法设计技巧与分析 PDF', 0.00, 0.00, 0, 1, 19, 0, 0, 0.0000000, 0.0000000, '', '', '2020-12-08 21:44:30', '2020-12-08 21:44:30', NULL, NULL, 1, 0, 0, 0, 0, 1);
INSERT INTO `threads` VALUES (21, 1, 1, 7, 1, '[测试][LaTeX] mhchem For MathJax 测试', 0.00, 0.00, 0, 1, 47, 0, 0, 0.0000000, 0.0000000, '', '', '2020-12-08 22:05:23', '2020-12-09 10:19:47', NULL, NULL, 1, 0, 0, 0, 0, 1);
INSERT INTO `threads` VALUES (22, 9, 9, 19, 1, '[杂志分享] 时代周刊 2020-01-27 PDF', 0.00, 0.00, 0, 1, 10, 0, 0, 0.0000000, 0.0000000, '', '', '2020-12-08 22:38:14', '2020-12-08 22:38:14', NULL, NULL, 1, 0, 0, 0, 0, 1);
INSERT INTO `threads` VALUES (23, 9, 9, 19, 1, '[杂志分享] 科学美国人 2020-02 PDF', 0.00, 0.00, 0, 1, 29, 0, 0, 0.0000000, 0.0000000, '', '', '2020-12-08 22:38:44', '2020-12-08 22:38:44', NULL, NULL, 1, 0, 0, 0, 0, 1);
INSERT INTO `threads` VALUES (24, 9, 9, 19, 1, '[经济学人] 2020-01-25 PDF', 0.00, 0.00, 0, 1, 25, 0, 0, 0.0000000, 0.0000000, '', '', '2020-12-08 22:39:45', '2020-12-08 22:39:45', NULL, NULL, 1, 0, 0, 0, 0, 1);
INSERT INTO `threads` VALUES (25, 9, 9, 4, 1, '线性代数', 0.00, 0.00, 0, 6, 20, 0, 0, 0.0000000, 0.0000000, '', '', '2020-12-09 19:37:26', '2020-12-09 19:48:17', '2020-12-09 20:22:07', 1, 1, 0, 0, 0, 0, 1);
INSERT INTO `threads` VALUES (26, 4, 1, 10, 1, '[LeetCode] 300. 最长上升子序列', 0.00, 0.00, 0, 7, 131, 0, 0, 0.0000000, 0.0000000, '', '', '2020-12-09 19:58:16', '2021-01-22 10:53:51', NULL, NULL, 1, 0, 0, 0, 0, 1);
INSERT INTO `threads` VALUES (27, 9, 9, 4, 1, '对称矩阵及正定性', 0.00, 0.00, 0, 1, 2, 0, 0, 0.0000000, 0.0000000, '', '', '2020-12-09 20:12:33', '2020-12-09 20:12:33', '2020-12-09 20:22:16', 1, 1, 0, 0, 0, 0, 1);
INSERT INTO `threads` VALUES (28, 9, 10, 4, 1, '对称矩阵及正定性', 0.00, 0.00, 0, 2, 99, 0, 0, 0.0000000, 0.0000000, '', '', '2020-12-09 20:12:36', '2020-12-14 21:54:09', NULL, NULL, 1, 0, 0, 0, 0, 1);
INSERT INTO `threads` VALUES (29, 1, 10, 28, 1, '[帮助] SourceLay 游览须知', 0.00, 0.00, 0, 2, 1099, 0, 0, 0.0000000, 0.0000000, '', '', '2020-12-10 09:20:06', '2020-12-14 21:53:32', NULL, NULL, 1, 1, 0, 0, 0, 1);
INSERT INTO `threads` VALUES (30, 4, 30, 10, 1, '[Windows] Windows考试打印资料', 0.00, 0.00, 0, 2, 91, 0, 0, 0.0000000, 0.0000000, '', '', '2020-12-11 17:17:55', '2021-01-20 11:26:37', NULL, NULL, 1, 0, 0, 0, 0, 1);
INSERT INTO `threads` VALUES (31, 5, 1, 8, 1, '[好物分享]Key20th MEMORIAL BOOK', 0.00, 0.00, 0, 2, 112, 0, 0, 0.0000000, 0.0000000, '', '', '2020-12-15 11:42:22', '2020-12-15 12:47:28', NULL, NULL, 1, 0, 0, 0, 0, 1);
INSERT INTO `threads` VALUES (32, 5, 9, 7, 1, '论坛好冷清啊', 0.00, 0.00, 0, 5, 141, 0, 0, 0.0000000, 0.0000000, '', '', '2020-12-22 14:13:17', '2020-12-24 16:14:47', NULL, NULL, 1, 0, 0, 0, 0, 1);
INSERT INTO `threads` VALUES (33, 30, 30, 27, 1, '测试帖子', 0.00, 0.00, 0, 1, 39, 0, 0, 0.0000000, 0.0000000, '', '', '2021-01-20 11:27:32', '2021-01-20 11:27:32', NULL, NULL, 1, 0, 0, 0, 0, 1);
INSERT INTO `threads` VALUES (34, 1, 10, 29, 1, '[公告] 恭喜本项目斩获腾讯云 2020 中小企业开发者大赛年度最佳技术突破奖', 0.00, 0.00, 0, 3, 104, 0, 0, 0.0000000, 0.0000000, '', '', '2021-01-21 13:50:46', '2021-04-19 19:17:41', NULL, NULL, 1, 0, 0, 0, 0, 1);
INSERT INTO `threads` VALUES (35, 5, 5, 27, 1, '论坛重建进度汇报', 0.00, 0.00, 0, 1, 40, 0, 0, 0.0000000, 0.0000000, '', '', '2021-02-23 14:47:13', '2021-02-23 14:47:13', NULL, NULL, 1, 0, 0, 0, 0, 1);
INSERT INTO `threads` VALUES (36, 10, 10, 27, 1, '和大家分享一个我觉得很好看的图片', 0.00, 0.00, 0, 2, 9, 0, 0, 0.0000000, 0.0000000, '', '', '2021-04-20 11:05:21', '2021-04-20 11:05:29', NULL, NULL, 1, 0, 0, 0, 0, 1);

-- ----------------------------
-- Table structure for topics
-- ----------------------------
DROP TABLE IF EXISTS `topics`;
CREATE TABLE `topics`  (
  `id` bigint UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '话题ID',
  `user_id` bigint UNSIGNED NULL DEFAULT NULL COMMENT 'user_id',
  `content` text CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL COMMENT '话题名称',
  `thread_count` int UNSIGNED NOT NULL DEFAULT 0 COMMENT '主题数',
  `view_count` int UNSIGNED NOT NULL DEFAULT 0 COMMENT '阅读数',
  `updated_at` datetime(0) NOT NULL COMMENT '更新时间',
  `created_at` datetime(0) NOT NULL COMMENT '创建时间',
  `recommended` tinyint UNSIGNED NOT NULL DEFAULT 0 COMMENT '是否推荐',
  `recommended_at` datetime(0) NULL DEFAULT NULL COMMENT '推荐时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 14 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of topics
-- ----------------------------
INSERT INTO `topics` VALUES (1, 1, '发帖', 1, 102, '2021-04-04 02:55:20', '2020-08-16 12:04:22', 0, NULL);
INSERT INTO `topics` VALUES (2, 1, '测试', 6, 757, '2021-04-04 02:46:19', '2020-08-16 12:05:04', 0, NULL);
INSERT INTO `topics` VALUES (3, 1, 'LaTeX', 2, 101, '2021-04-04 02:45:43', '2020-11-24 22:10:34', 0, NULL);
INSERT INTO `topics` VALUES (4, 1, 'Prism', 1, 84, '2021-04-04 02:45:57', '2020-11-25 14:36:01', 0, NULL);
INSERT INTO `topics` VALUES (5, 1, '文件分享', 1, 316, '2021-04-05 22:42:30', '2020-12-05 14:23:42', 0, NULL);
INSERT INTO `topics` VALUES (6, 1, '帮助', 3, 1715, '2021-03-22 04:06:13', '2020-12-08 14:38:31', 0, NULL);
INSERT INTO `topics` VALUES (7, 9, '剧本分享', 1, 2, '2021-02-08 13:30:31', '2020-12-08 21:23:33', 0, NULL);
INSERT INTO `topics` VALUES (8, 9, '书籍分享', 5, 69, '2021-03-28 06:46:27', '2020-12-08 21:26:18', 0, NULL);
INSERT INTO `topics` VALUES (9, 9, '杂志分享', 2, 34, '2021-03-31 07:34:20', '2020-12-08 22:38:14', 0, NULL);
INSERT INTO `topics` VALUES (10, 9, '经济学人', 1, 22, '2021-01-09 12:00:36', '2020-12-08 22:39:45', 0, NULL);
INSERT INTO `topics` VALUES (11, 4, 'LeetCode', 1, 123, '2021-04-03 16:02:09', '2020-12-09 19:58:16', 0, NULL);
INSERT INTO `topics` VALUES (12, 4, 'Windows', 1, 78, '2021-04-03 14:21:43', '2020-12-11 17:17:55', 0, NULL);
INSERT INTO `topics` VALUES (13, 5, '好物分享', 1, 110, '2021-04-28 10:06:36', '2020-12-15 11:42:22', 0, NULL);
INSERT INTO `topics` VALUES (14, 1, '公告', 1, 0, '2021-01-21 13:50:46', '2021-01-21 13:50:46', 0, NULL);

-- ----------------------------
-- Table structure for user_action_logs
-- ----------------------------
DROP TABLE IF EXISTS `user_action_logs`;
CREATE TABLE `user_action_logs`  (
  `id` bigint UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '日志 id',
  `user_id` bigint UNSIGNED NOT NULL DEFAULT 0 COMMENT '操作用户 id',
  `action` char(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '操作',
  `message` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '备注',
  `log_able_id` int UNSIGNED NOT NULL DEFAULT 0 COMMENT '模型 id',
  `log_able_type` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '模型',
  `created_at` datetime(0) NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 96 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of user_action_logs
-- ----------------------------
INSERT INTO `user_action_logs` VALUES (1, 1, 'revise', 'admin 修改了内容', 111, 'App\\Models\\Post', '2020-12-05 15:36:23');
INSERT INTO `user_action_logs` VALUES (2, 1, 'revise', 'admin 修改了内容', 114, 'App\\Models\\Post', '2020-12-08 10:57:29');
INSERT INTO `user_action_logs` VALUES (3, 1, 'revise', 'admin 修改了内容', 114, 'App\\Models\\Post', '2020-12-08 11:03:21');
INSERT INTO `user_action_logs` VALUES (4, 1, 'revise', 'admin 修改了内容', 114, 'App\\Models\\Post', '2020-12-08 11:04:43');
INSERT INTO `user_action_logs` VALUES (5, 1, 'revise', 'admin 修改了内容', 114, 'App\\Models\\Post', '2020-12-08 11:05:39');
INSERT INTO `user_action_logs` VALUES (6, 1, 'revise', 'admin 修改了内容', 114, 'App\\Models\\Post', '2020-12-08 11:10:38');
INSERT INTO `user_action_logs` VALUES (7, 1, 'revise', 'admin 修改了内容', 114, 'App\\Models\\Post', '2020-12-08 11:42:37');
INSERT INTO `user_action_logs` VALUES (8, 1, 'revise', 'admin 修改了内容', 1, 'App\\Models\\Post', '2020-12-08 11:45:51');
INSERT INTO `user_action_logs` VALUES (9, 1, 'revise', 'admin 修改了内容', 1, 'App\\Models\\Post', '2020-12-08 11:45:57');
INSERT INTO `user_action_logs` VALUES (10, 1, 'revise', 'admin 修改了内容', 114, 'App\\Models\\Post', '2020-12-08 14:01:24');
INSERT INTO `user_action_logs` VALUES (11, 1, 'revise', 'admin 修改了内容', 118, 'App\\Models\\Post', '2020-12-08 14:39:34');
INSERT INTO `user_action_logs` VALUES (12, 1, 'revise', 'admin 修改了内容', 119, 'App\\Models\\Post', '2020-12-08 15:26:12');
INSERT INTO `user_action_logs` VALUES (13, 1, 'revise', 'admin 修改了内容', 119, 'App\\Models\\Post', '2020-12-08 15:28:40');
INSERT INTO `user_action_logs` VALUES (14, 1, 'revise', 'admin 修改了内容', 119, 'App\\Models\\Post', '2020-12-08 15:29:18');
INSERT INTO `user_action_logs` VALUES (15, 1, 'revise', 'admin 修改了内容', 119, 'App\\Models\\Post', '2020-12-08 15:29:42');
INSERT INTO `user_action_logs` VALUES (16, 1, 'revise', 'admin 修改了内容', 118, 'App\\Models\\Post', '2020-12-08 15:32:19');
INSERT INTO `user_action_logs` VALUES (17, 4, 'revise', 'A_Salty_Fish 修改了内容', 119, 'App\\Models\\Post', '2020-12-08 16:06:46');
INSERT INTO `user_action_logs` VALUES (18, 4, 'revise', 'A_Salty_Fish 修改了内容', 119, 'App\\Models\\Post', '2020-12-08 16:08:22');
INSERT INTO `user_action_logs` VALUES (19, 1, 'revise', 'admin 修改了内容', 131, 'App\\Models\\Post', '2020-12-08 16:58:26');
INSERT INTO `user_action_logs` VALUES (20, 1, 'revise', 'admin 修改了内容', 131, 'App\\Models\\Post', '2020-12-08 16:58:52');
INSERT INTO `user_action_logs` VALUES (21, 1, 'revise', 'admin 修改了内容', 131, 'App\\Models\\Post', '2020-12-08 17:13:30');
INSERT INTO `user_action_logs` VALUES (22, 5, 'revise', '陆陆侠 修改了内容', 132, 'App\\Models\\Post', '2020-12-08 17:23:57');
INSERT INTO `user_action_logs` VALUES (23, 4, 'revise', 'A_Salty_Fish 修改了内容', 131, 'App\\Models\\Post', '2020-12-08 18:00:48');
INSERT INTO `user_action_logs` VALUES (24, 1, 'revise', 'admin 修改了内容', 137, 'App\\Models\\Post', '2020-12-08 20:01:22');
INSERT INTO `user_action_logs` VALUES (25, 1, 'revise', 'admin 修改了内容', 137, 'App\\Models\\Post', '2020-12-08 20:01:30');
INSERT INTO `user_action_logs` VALUES (26, 1, 'revise', 'admin 修改了内容', 137, 'App\\Models\\Post', '2020-12-08 20:02:39');
INSERT INTO `user_action_logs` VALUES (27, 1, 'revise', 'admin 修改了内容', 137, 'App\\Models\\Post', '2020-12-08 20:03:48');
INSERT INTO `user_action_logs` VALUES (28, 1, 'revise', 'admin 修改了内容', 137, 'App\\Models\\Post', '2020-12-08 20:04:27');
INSERT INTO `user_action_logs` VALUES (29, 1, 'revise', 'admin 修改了内容', 137, 'App\\Models\\Post', '2020-12-08 20:09:54');
INSERT INTO `user_action_logs` VALUES (30, 1, 'revise', 'admin 修改了内容', 137, 'App\\Models\\Post', '2020-12-08 20:10:50');
INSERT INTO `user_action_logs` VALUES (31, 1, 'revise', 'admin 修改了内容', 137, 'App\\Models\\Post', '2020-12-08 20:11:04');
INSERT INTO `user_action_logs` VALUES (32, 1, 'revise', 'admin 修改了内容', 119, 'App\\Models\\Post', '2020-12-08 20:15:22');
INSERT INTO `user_action_logs` VALUES (33, 1, 'revise', 'admin 修改了内容', 137, 'App\\Models\\Post', '2020-12-08 21:13:31');
INSERT INTO `user_action_logs` VALUES (34, 1, 'revise', 'admin 修改了内容', 137, 'App\\Models\\Post', '2020-12-08 21:14:01');
INSERT INTO `user_action_logs` VALUES (35, 1, 'revise', 'admin 修改了内容', 137, 'App\\Models\\Post', '2020-12-08 21:14:22');
INSERT INTO `user_action_logs` VALUES (36, 1, 'revise', 'admin 修改了内容', 146, 'App\\Models\\Post', '2020-12-09 10:19:47');
INSERT INTO `user_action_logs` VALUES (37, 1, 'revise', 'admin 修改了内容', 119, 'App\\Models\\Post', '2020-12-09 11:51:48');
INSERT INTO `user_action_logs` VALUES (38, 1, 'revise', 'admin 修改了内容', 137, 'App\\Models\\Post', '2020-12-09 16:13:38');
INSERT INTO `user_action_logs` VALUES (39, 9, 'revise', 'xiye 修改了内容', 159, 'App\\Models\\Post', '2020-12-09 20:20:18');
INSERT INTO `user_action_logs` VALUES (40, 1, 'revise', 'admin 修改了内容', 159, 'App\\Models\\Post', '2020-12-09 20:24:34');
INSERT INTO `user_action_logs` VALUES (41, 1, 'revise', 'admin 修改了内容', 160, 'App\\Models\\Post', '2020-12-10 09:21:13');
INSERT INTO `user_action_logs` VALUES (42, 1, 'revise', 'admin 修改了内容', 160, 'App\\Models\\Post', '2020-12-10 09:23:37');
INSERT INTO `user_action_logs` VALUES (43, 1, 'revise', 'admin 修改了内容', 160, 'App\\Models\\Post', '2020-12-10 09:24:54');
INSERT INTO `user_action_logs` VALUES (44, 1, 'revise', 'admin 修改了内容', 160, 'App\\Models\\Post', '2020-12-10 09:32:19');
INSERT INTO `user_action_logs` VALUES (45, 1, 'revise', 'admin 修改了内容', 160, 'App\\Models\\Post', '2020-12-10 09:33:18');
INSERT INTO `user_action_logs` VALUES (46, 1, 'revise', 'admin 修改了内容', 160, 'App\\Models\\Post', '2020-12-10 09:35:35');
INSERT INTO `user_action_logs` VALUES (47, 1, 'revise', 'admin 修改了内容', 160, 'App\\Models\\Post', '2020-12-10 09:38:47');
INSERT INTO `user_action_logs` VALUES (48, 1, 'revise', 'admin 修改了内容', 160, 'App\\Models\\Post', '2020-12-10 09:39:04');
INSERT INTO `user_action_logs` VALUES (49, 1, 'revise', 'admin 修改了内容', 160, 'App\\Models\\Post', '2020-12-10 09:40:06');
INSERT INTO `user_action_logs` VALUES (50, 1, 'revise', 'admin 修改了内容', 160, 'App\\Models\\Post', '2020-12-10 09:40:49');
INSERT INTO `user_action_logs` VALUES (51, 1, 'revise', 'admin 修改了内容', 160, 'App\\Models\\Post', '2020-12-10 09:44:22');
INSERT INTO `user_action_logs` VALUES (52, 1, 'revise', 'admin 修改了内容', 160, 'App\\Models\\Post', '2020-12-10 09:47:58');
INSERT INTO `user_action_logs` VALUES (53, 1, 'revise', 'admin 修改了内容', 160, 'App\\Models\\Post', '2020-12-10 09:49:02');
INSERT INTO `user_action_logs` VALUES (54, 1, 'revise', 'admin 修改了内容', 160, 'App\\Models\\Post', '2020-12-10 09:49:15');
INSERT INTO `user_action_logs` VALUES (55, 1, 'revise', 'admin 修改了内容', 160, 'App\\Models\\Post', '2020-12-10 09:49:24');
INSERT INTO `user_action_logs` VALUES (56, 1, 'revise', 'admin 修改了内容', 160, 'App\\Models\\Post', '2020-12-10 09:49:39');
INSERT INTO `user_action_logs` VALUES (57, 1, 'revise', 'admin 修改了内容', 160, 'App\\Models\\Post', '2020-12-10 09:50:17');
INSERT INTO `user_action_logs` VALUES (58, 1, 'revise', 'admin 修改了内容', 160, 'App\\Models\\Post', '2020-12-10 09:50:29');
INSERT INTO `user_action_logs` VALUES (59, 1, 'revise', 'admin 修改了内容', 160, 'App\\Models\\Post', '2020-12-10 09:51:04');
INSERT INTO `user_action_logs` VALUES (60, 1, 'revise', 'admin 修改了内容', 160, 'App\\Models\\Post', '2020-12-10 09:51:14');
INSERT INTO `user_action_logs` VALUES (61, 1, 'revise', 'admin 修改了内容', 160, 'App\\Models\\Post', '2020-12-10 09:52:00');
INSERT INTO `user_action_logs` VALUES (62, 1, 'revise', 'admin 修改了内容', 160, 'App\\Models\\Post', '2020-12-10 09:52:09');
INSERT INTO `user_action_logs` VALUES (63, 1, 'revise', 'admin 修改了内容', 160, 'App\\Models\\Post', '2020-12-10 09:53:20');
INSERT INTO `user_action_logs` VALUES (64, 1, 'revise', 'admin 修改了内容', 160, 'App\\Models\\Post', '2020-12-10 09:53:34');
INSERT INTO `user_action_logs` VALUES (65, 1, 'revise', 'admin 修改了内容', 160, 'App\\Models\\Post', '2020-12-10 09:55:11');
INSERT INTO `user_action_logs` VALUES (66, 1, 'revise', 'admin 修改了内容', 160, 'App\\Models\\Post', '2020-12-10 09:55:35');
INSERT INTO `user_action_logs` VALUES (67, 1, 'revise', 'admin 修改了内容', 160, 'App\\Models\\Post', '2020-12-10 09:56:55');
INSERT INTO `user_action_logs` VALUES (68, 1, 'revise', 'admin 修改了内容', 160, 'App\\Models\\Post', '2020-12-10 10:07:10');
INSERT INTO `user_action_logs` VALUES (69, 1, 'revise', 'admin 修改了内容', 160, 'App\\Models\\Post', '2020-12-10 10:08:04');
INSERT INTO `user_action_logs` VALUES (70, 1, 'revise', 'admin 修改了内容', 160, 'App\\Models\\Post', '2020-12-10 10:08:09');
INSERT INTO `user_action_logs` VALUES (71, 1, 'revise', 'admin 修改了内容', 160, 'App\\Models\\Post', '2020-12-10 10:08:19');
INSERT INTO `user_action_logs` VALUES (72, 1, 'revise', 'admin 修改了内容', 160, 'App\\Models\\Post', '2020-12-10 10:09:23');
INSERT INTO `user_action_logs` VALUES (73, 1, 'revise', 'admin 修改了内容', 160, 'App\\Models\\Post', '2020-12-10 10:11:04');
INSERT INTO `user_action_logs` VALUES (74, 1, 'revise', 'admin 修改了内容', 160, 'App\\Models\\Post', '2020-12-10 10:12:11');
INSERT INTO `user_action_logs` VALUES (75, 1, 'revise', 'admin 修改了内容', 160, 'App\\Models\\Post', '2020-12-10 10:13:44');
INSERT INTO `user_action_logs` VALUES (76, 1, 'revise', 'admin 修改了内容', 160, 'App\\Models\\Post', '2020-12-10 10:14:09');
INSERT INTO `user_action_logs` VALUES (77, 1, 'revise', 'admin 修改了内容', 160, 'App\\Models\\Post', '2020-12-10 10:17:25');
INSERT INTO `user_action_logs` VALUES (78, 1, 'revise', 'admin 修改了内容', 160, 'App\\Models\\Post', '2020-12-10 10:19:31');
INSERT INTO `user_action_logs` VALUES (79, 1, 'revise', 'admin 修改了内容', 160, 'App\\Models\\Post', '2020-12-10 10:21:24');
INSERT INTO `user_action_logs` VALUES (80, 1, 'revise', 'admin 修改了内容', 160, 'App\\Models\\Post', '2020-12-10 10:22:45');
INSERT INTO `user_action_logs` VALUES (81, 1, 'revise', 'admin 修改了内容', 160, 'App\\Models\\Post', '2020-12-10 10:23:59');
INSERT INTO `user_action_logs` VALUES (82, 1, 'revise', 'admin 修改了内容', 160, 'App\\Models\\Post', '2020-12-10 15:19:12');
INSERT INTO `user_action_logs` VALUES (83, 1, 'revise', 'admin 修改了内容', 160, 'App\\Models\\Post', '2020-12-10 15:19:36');
INSERT INTO `user_action_logs` VALUES (84, 1, 'revise', 'admin 修改了内容', 160, 'App\\Models\\Post', '2020-12-11 16:36:35');
INSERT INTO `user_action_logs` VALUES (85, 1, 'revise', 'admin 修改了内容', 160, 'App\\Models\\Post', '2020-12-12 21:25:11');
INSERT INTO `user_action_logs` VALUES (86, 1, 'revise', 'admin 修改了内容', 159, 'App\\Models\\Post', '2020-12-12 23:10:01');
INSERT INTO `user_action_logs` VALUES (87, 1, 'revise', 'admin 修改了内容', 160, 'App\\Models\\Post', '2020-12-14 11:37:36');
INSERT INTO `user_action_logs` VALUES (88, 1, 'revise', 'admin 修改了内容', 118, 'App\\Models\\Post', '2020-12-15 13:45:41');
INSERT INTO `user_action_logs` VALUES (89, 1, 'revise', 'admin 修改了内容', 118, 'App\\Models\\Post', '2020-12-15 13:45:50');
INSERT INTO `user_action_logs` VALUES (90, 1, 'revise', 'admin 修改了内容', 118, 'App\\Models\\Post', '2020-12-15 13:46:00');
INSERT INTO `user_action_logs` VALUES (91, 1, 'revise', 'admin 修改了内容', 111, 'App\\Models\\Post', '2020-12-16 13:41:43');
INSERT INTO `user_action_logs` VALUES (92, 1, 'revise', 'admin 修改了内容', 111, 'App\\Models\\Post', '2020-12-16 21:08:01');
INSERT INTO `user_action_logs` VALUES (93, 1, 'revise', 'admin 修改了内容', 111, 'App\\Models\\Post', '2020-12-16 21:08:09');
INSERT INTO `user_action_logs` VALUES (94, 1, 'revise', 'admin 修改了内容', 169, 'App\\Models\\Post', '2020-12-22 14:53:40');
INSERT INTO `user_action_logs` VALUES (95, 1, 'revise', 'admin 修改了内容', 176, 'App\\Models\\Post', '2021-01-21 13:52:35');
INSERT INTO `user_action_logs` VALUES (96, 1, 'revise', 'admin 修改了内容', 176, 'App\\Models\\Post', '2021-01-21 13:58:46');

-- ----------------------------
-- Table structure for user_distributions
-- ----------------------------
DROP TABLE IF EXISTS `user_distributions`;
CREATE TABLE `user_distributions`  (
  `id` bigint UNSIGNED NOT NULL AUTO_INCREMENT,
  `pid` bigint UNSIGNED NULL DEFAULT NULL COMMENT '父级id',
  `user_id` bigint UNSIGNED NULL DEFAULT NULL COMMENT '用户ID',
  `be_scale` double(3, 1) NOT NULL DEFAULT 0.0 COMMENT '受邀时的分成比例',
  `level` tinyint NOT NULL DEFAULT 1 COMMENT '当前用户所处深度',
  `is_subordinate` tinyint UNSIGNED NOT NULL DEFAULT 0 COMMENT '是否可以 推广下线',
  `is_commission` tinyint UNSIGNED NOT NULL DEFAULT 0 COMMENT '是否可以 收入提成',
  `updated_at` datetime(0) NOT NULL COMMENT '更新时间',
  `created_at` datetime(0) NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `idx_user`(`user_id`) USING BTREE,
  CONSTRAINT `user_distributions_user_id_foreign` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`) ON DELETE CASCADE ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of user_distributions
-- ----------------------------

-- ----------------------------
-- Table structure for user_follow
-- ----------------------------
DROP TABLE IF EXISTS `user_follow`;
CREATE TABLE `user_follow`  (
  `id` bigint UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `from_user_id` bigint UNSIGNED NOT NULL COMMENT '关注人',
  `to_user_id` bigint UNSIGNED NOT NULL COMMENT '被关注人',
  `is_mutual` tinyint NOT NULL DEFAULT 0 COMMENT '是否互相关注：0否 1是',
  `created_at` datetime(0) NOT NULL COMMENT '创建时间',
  `updated_at` datetime(0) NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `from_user_id`(`from_user_id`) USING BTREE,
  INDEX `to_user_id`(`to_user_id`) USING BTREE,
  CONSTRAINT `user_follow_from_user_id_foreign` FOREIGN KEY (`from_user_id`) REFERENCES `users` (`id`) ON DELETE CASCADE ON UPDATE RESTRICT,
  CONSTRAINT `user_follow_to_user_id_foreign` FOREIGN KEY (`to_user_id`) REFERENCES `users` (`id`) ON DELETE CASCADE ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of user_follow
-- ----------------------------

-- ----------------------------
-- Table structure for user_login_fail_log
-- ----------------------------
DROP TABLE IF EXISTS `user_login_fail_log`;
CREATE TABLE `user_login_fail_log`  (
  `id` bigint UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '日志 id',
  `ip` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT 'ip 地址',
  `user_id` bigint UNSIGNED NOT NULL DEFAULT 0 COMMENT '用户 id',
  `username` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '用户名',
  `count` tinyint NOT NULL DEFAULT 1 COMMENT '错误次数',
  `created_at` datetime(0) NOT NULL COMMENT '创建时间',
  `updated_at` datetime(0) NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `user_login_fail_log_user_id_index`(`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of user_login_fail_log
-- ----------------------------
INSERT INTO `user_login_fail_log` VALUES (1, '10.133.90.64,218.197.153.104', 1, 'admin', 1, '2020-12-03 17:16:43', '2020-12-03 17:16:43');
INSERT INTO `user_login_fail_log` VALUES (2, '::1,218.197.153.63', 8, 'Eric_Lian', 1, '2020-12-06 09:56:58', '2020-12-06 09:56:58');
INSERT INTO `user_login_fail_log` VALUES (3, '::1,2001:250:4001:103:a9dc:d7f7:79:5688', 8, 'Eric_Lian', 1, '2020-12-06 09:57:04', '2020-12-06 09:57:04');
INSERT INTO `user_login_fail_log` VALUES (4, '2001:250:4001:103:410:98a:939b:163', 8, 'Eric_Lian', 1, '2020-12-08 17:04:06', '2020-12-08 17:04:06');
INSERT INTO `user_login_fail_log` VALUES (5, '10.133.90.64,218.197.153.104', 4, 'A_Salty_Fish', 1, '2020-12-09 11:09:13', '2020-12-09 11:09:13');
INSERT INTO `user_login_fail_log` VALUES (6, '59.172.176.227', 1, 'admin', 1, '2020-12-14 16:03:25', '2020-12-14 16:03:25');
INSERT INTO `user_login_fail_log` VALUES (7, '59.172.176.177', 10, 'Mozifei', 1, '2021-04-15 10:52:26', '2021-04-15 10:52:26');
INSERT INTO `user_login_fail_log` VALUES (8, '59.172.176.207', 4, 'A_Salty_Fish', 1, '2021-04-15 14:23:23', '2021-04-15 14:23:23');
INSERT INTO `user_login_fail_log` VALUES (9, '59.172.176.207', 1, 'admin', 2, '2021-04-15 14:24:47', '2021-04-15 14:24:55');

-- ----------------------------
-- Table structure for user_qq
-- ----------------------------
DROP TABLE IF EXISTS `user_qq`;
CREATE TABLE `user_qq`  (
  `id` bigint UNSIGNED NOT NULL AUTO_INCREMENT,
  `user_id` int UNSIGNED NOT NULL DEFAULT 0 COMMENT '用户 id',
  `openid` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT 'openid',
  `nickname` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT 'qq昵称',
  `sex` tinyint NOT NULL DEFAULT 0 COMMENT '性别',
  `province` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '省份',
  `city` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '城市',
  `headimgurl` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '头像',
  `created_at` datetime(0) NOT NULL COMMENT '创建时间',
  `updated_at` datetime(0) NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `user_id`(`user_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of user_qq
-- ----------------------------

-- ----------------------------
-- Table structure for user_qy_wechats
-- ----------------------------
DROP TABLE IF EXISTS `user_qy_wechats`;
CREATE TABLE `user_qy_wechats`  (
  `id` bigint UNSIGNED NOT NULL AUTO_INCREMENT,
  `user_id` int UNSIGNED NOT NULL DEFAULT 0 COMMENT '用户 id',
  `qy_userid` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '企业微信企业用户id, corpid_userid联合全局唯一',
  `nickname` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '企业微信昵称',
  `sex` tinyint NOT NULL DEFAULT 0 COMMENT '性别',
  `email` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '邮箱',
  `mobile` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '电话',
  `address` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '地址',
  `headimgurl` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '头像',
  `created_at` datetime(0) NOT NULL COMMENT '创建时间',
  `updated_at` datetime(0) NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `user_id`(`user_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of user_qy_wechats
-- ----------------------------

-- ----------------------------
-- Table structure for user_ucenters
-- ----------------------------
DROP TABLE IF EXISTS `user_ucenters`;
CREATE TABLE `user_ucenters`  (
  `id` bigint UNSIGNED NOT NULL AUTO_INCREMENT,
  `user_id` int UNSIGNED NOT NULL DEFAULT 0 COMMENT '用户 id',
  `ucenter_id` int UNSIGNED NOT NULL DEFAULT 0 COMMENT 'uc用户 id',
  `created_at` datetime(0) NOT NULL COMMENT '创建时间',
  `updated_at` datetime(0) NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `user_ucenters_user_id_index`(`user_id`) USING BTREE,
  INDEX `user_ucenters_ucenter_id_index`(`ucenter_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of user_ucenters
-- ----------------------------

-- ----------------------------
-- Table structure for user_wallet_cash
-- ----------------------------
DROP TABLE IF EXISTS `user_wallet_cash`;
CREATE TABLE `user_wallet_cash`  (
  `id` bigint UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '提现 id',
  `user_id` bigint UNSIGNED NOT NULL COMMENT '提现用户 id',
  `cash_sn` bigint UNSIGNED NOT NULL COMMENT '提现交易编号',
  `cash_charge` decimal(10, 2) UNSIGNED NOT NULL COMMENT '提现手续费',
  `cash_actual_amount` decimal(10, 2) UNSIGNED NOT NULL COMMENT '实际提现金额',
  `cash_apply_amount` decimal(10, 2) UNSIGNED NOT NULL COMMENT '提现申请金额',
  `cash_status` tinyint UNSIGNED NOT NULL DEFAULT 0 COMMENT '提现状态：1：待审核，2：审核通过，3：审核不通过，4：待打款， 5，已打款， 6：打款失败',
  `cash_mobile` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '提现到账手机号码',
  `cash_type` tinyint NOT NULL DEFAULT 1 COMMENT '提现转账类型：0：人工转账， 1：企业零钱付款',
  `remark` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '备注或原因',
  `trade_time` datetime(0) NULL DEFAULT NULL COMMENT '交易时间',
  `trade_no` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '交易号',
  `error_code` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '错误代码',
  `error_message` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '交易失败描叙',
  `refunds_status` tinyint UNSIGNED NOT NULL DEFAULT 0 COMMENT '返款状态，0未返款，1已返款',
  `created_at` datetime(0) NOT NULL COMMENT '创建时间',
  `updated_at` datetime(0) NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of user_wallet_cash
-- ----------------------------

-- ----------------------------
-- Table structure for user_wallet_fail_logs
-- ----------------------------
DROP TABLE IF EXISTS `user_wallet_fail_logs`;
CREATE TABLE `user_wallet_fail_logs`  (
  `id` bigint UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '日志 id',
  `ip` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT 'ip 地址',
  `user_id` bigint UNSIGNED NOT NULL DEFAULT 0 COMMENT '用户 id',
  `created_at` datetime(0) NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `user_wallet_fail_logs_user_id_index`(`user_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of user_wallet_fail_logs
-- ----------------------------

-- ----------------------------
-- Table structure for user_wallet_logs
-- ----------------------------
DROP TABLE IF EXISTS `user_wallet_logs`;
CREATE TABLE `user_wallet_logs`  (
  `id` bigint UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '钱包明细 id',
  `user_id` bigint UNSIGNED NOT NULL COMMENT '明细所属用户 id',
  `source_user_id` bigint UNSIGNED NOT NULL DEFAULT 0 COMMENT '金额来源用户',
  `change_available_amount` decimal(10, 2) NOT NULL COMMENT '变动可用金额',
  `change_freeze_amount` decimal(10, 2) NOT NULL COMMENT '变动冻结金额',
  `change_type` smallint UNSIGNED NOT NULL DEFAULT 0 COMMENT '10：提现冻结，11：提现成功，12：撤销提现解冻； 31：打赏收入，32：人工收入； 50：人工支出',
  `change_desc` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '变动描述',
  `order_id` bigint UNSIGNED NULL DEFAULT NULL COMMENT '关联订单记录ID',
  `user_wallet_cash_id` bigint UNSIGNED NULL DEFAULT NULL COMMENT '关联提现记录ID',
  `question_id` bigint UNSIGNED NOT NULL DEFAULT 0 COMMENT '关联问答记录 id',
  `created_at` datetime(0) NOT NULL COMMENT '创建时间',
  `updated_at` datetime(0) NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of user_wallet_logs
-- ----------------------------
INSERT INTO `user_wallet_logs` VALUES (1, 8, 0, -1.00, 0.00, 128, '文件购买支出', 7, NULL, 0, '2020-12-06 11:55:44', '2020-12-06 11:55:44');
INSERT INTO `user_wallet_logs` VALUES (2, 8, 0, -1.00, 0.00, 128, '文件购买支出', 14, NULL, 0, '2020-12-06 23:03:30', '2020-12-06 23:03:30');
INSERT INTO `user_wallet_logs` VALUES (3, 8, 0, -1.00, 0.00, 128, '文件购买支出', 15, NULL, 0, '2020-12-07 08:15:07', '2020-12-07 08:15:07');
INSERT INTO `user_wallet_logs` VALUES (4, 1, 0, 1.00, 0.00, 17, '', 15, NULL, 0, '2020-12-07 08:15:07', '2020-12-07 08:15:07');
INSERT INTO `user_wallet_logs` VALUES (5, 9, 0, -1.00, 0.00, 128, '文件购买支出', 16, NULL, 0, '2020-12-07 11:47:53', '2020-12-07 11:47:53');
INSERT INTO `user_wallet_logs` VALUES (6, 1, 0, 1.00, 0.00, 17, '', 16, NULL, 0, '2020-12-07 11:47:53', '2020-12-07 11:47:53');
INSERT INTO `user_wallet_logs` VALUES (7, 10, 0, -1.00, 0.00, 128, '文件购买支出', 17, NULL, 0, '2020-12-07 12:04:53', '2020-12-07 12:04:53');
INSERT INTO `user_wallet_logs` VALUES (8, 1, 0, 1.00, 0.00, 17, '', 17, NULL, 0, '2020-12-07 12:04:53', '2020-12-07 12:04:53');

-- ----------------------------
-- Table structure for user_wallets
-- ----------------------------
DROP TABLE IF EXISTS `user_wallets`;
CREATE TABLE `user_wallets`  (
  `user_id` bigint UNSIGNED NOT NULL COMMENT '钱包所属人 id',
  `available_amount` decimal(10, 2) UNSIGNED NOT NULL COMMENT '可用金额',
  `freeze_amount` decimal(10, 2) UNSIGNED NOT NULL COMMENT '冻结金额',
  `wallet_status` tinyint UNSIGNED NOT NULL DEFAULT 0 COMMENT '钱包状态:0正常，1冻结提现',
  `created_at` datetime(0) NOT NULL COMMENT '创建时间',
  `updated_at` datetime(0) NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of user_wallets
-- ----------------------------
INSERT INTO `user_wallets` VALUES (1, 3.00, 0.00, 0, '2020-08-15 21:56:49', '2020-12-07 12:04:53');
INSERT INTO `user_wallets` VALUES (2, 0.00, 0.00, 0, '2020-08-15 22:00:14', '2020-08-15 22:00:14');
INSERT INTO `user_wallets` VALUES (3, 0.00, 0.00, 0, '2020-11-24 16:01:25', '2020-11-24 16:01:25');
INSERT INTO `user_wallets` VALUES (4, 114514.00, 0.00, 0, '2020-11-24 20:38:05', '2020-11-24 20:38:05');
INSERT INTO `user_wallets` VALUES (5, 0.00, 0.00, 0, '2020-11-29 18:41:59', '2020-11-29 18:41:59');
INSERT INTO `user_wallets` VALUES (6, 0.00, 0.00, 0, '2020-11-30 21:50:25', '2020-11-30 21:50:25');
INSERT INTO `user_wallets` VALUES (7, 0.00, 0.00, 0, '2020-12-03 23:05:21', '2020-12-03 23:05:21');
INSERT INTO `user_wallets` VALUES (8, 114511.00, 0.00, 0, '2020-12-05 21:29:15', '2020-12-07 08:15:07');
INSERT INTO `user_wallets` VALUES (9, 114514.00, 0.00, 0, '2020-12-07 11:24:46', '2020-12-07 11:47:53');
INSERT INTO `user_wallets` VALUES (10, 114513.00, 0.00, 0, '2020-12-07 12:02:59', '2020-12-07 12:04:53');
INSERT INTO `user_wallets` VALUES (11, 0.00, 0.00, 0, '2020-12-08 15:13:06', '2020-12-08 15:13:06');
INSERT INTO `user_wallets` VALUES (12, 0.00, 0.00, 0, '2020-12-08 15:20:34', '2020-12-08 15:20:34');
INSERT INTO `user_wallets` VALUES (13, 0.00, 0.00, 0, '2020-12-08 15:23:26', '2020-12-08 15:23:26');
INSERT INTO `user_wallets` VALUES (14, 0.00, 0.00, 0, '2020-12-08 15:28:35', '2020-12-08 15:28:35');
INSERT INTO `user_wallets` VALUES (15, 0.00, 0.00, 0, '2020-12-08 15:35:40', '2020-12-08 15:35:40');
INSERT INTO `user_wallets` VALUES (16, 0.00, 0.00, 0, '2020-12-08 15:41:03', '2020-12-08 15:41:03');
INSERT INTO `user_wallets` VALUES (17, 0.00, 0.00, 0, '2020-12-08 19:39:47', '2020-12-08 19:39:47');
INSERT INTO `user_wallets` VALUES (18, 0.00, 0.00, 0, '2020-12-11 20:13:56', '2020-12-11 20:13:56');
INSERT INTO `user_wallets` VALUES (19, 0.00, 0.00, 0, '2020-12-12 23:16:36', '2020-12-12 23:16:36');
INSERT INTO `user_wallets` VALUES (20, 0.00, 0.00, 0, '2020-12-13 11:58:48', '2020-12-13 11:58:48');
INSERT INTO `user_wallets` VALUES (21, 0.00, 0.00, 0, '2020-12-13 12:11:03', '2020-12-13 12:11:03');
INSERT INTO `user_wallets` VALUES (22, 0.00, 0.00, 0, '2020-12-13 12:38:31', '2020-12-13 12:38:31');
INSERT INTO `user_wallets` VALUES (23, 0.00, 0.00, 0, '2020-12-13 13:10:54', '2020-12-13 13:10:54');
INSERT INTO `user_wallets` VALUES (24, 0.00, 0.00, 0, '2020-12-13 16:32:15', '2020-12-13 16:32:15');
INSERT INTO `user_wallets` VALUES (25, 0.00, 0.00, 0, '2020-12-13 18:52:32', '2020-12-13 18:52:32');
INSERT INTO `user_wallets` VALUES (26, 0.00, 0.00, 0, '2020-12-14 16:28:21', '2020-12-14 16:28:21');
INSERT INTO `user_wallets` VALUES (27, 0.00, 0.00, 0, '2020-12-19 14:00:11', '2020-12-19 14:00:11');
INSERT INTO `user_wallets` VALUES (28, 0.00, 0.00, 0, '2020-12-21 18:57:18', '2020-12-21 18:57:18');
INSERT INTO `user_wallets` VALUES (29, 0.00, 0.00, 0, '2021-01-08 21:35:28', '2021-01-08 21:35:28');
INSERT INTO `user_wallets` VALUES (30, 0.00, 0.00, 0, '2021-01-20 11:25:44', '2021-01-20 11:25:44');
INSERT INTO `user_wallets` VALUES (31, 0.00, 0.00, 0, '2021-01-21 19:29:38', '2021-01-21 19:29:38');
INSERT INTO `user_wallets` VALUES (32, 0.00, 0.00, 0, '2021-03-01 22:24:44', '2021-03-01 22:24:44');
INSERT INTO `user_wallets` VALUES (33, 0.00, 0.00, 0, '2021-03-09 15:46:15', '2021-03-09 15:46:15');
INSERT INTO `user_wallets` VALUES (34, 0.00, 0.00, 0, '2021-04-15 14:26:41', '2021-04-15 14:26:41');

-- ----------------------------
-- Table structure for user_wechats
-- ----------------------------
DROP TABLE IF EXISTS `user_wechats`;
CREATE TABLE `user_wechats`  (
  `id` bigint UNSIGNED NOT NULL AUTO_INCREMENT,
  `user_id` bigint UNSIGNED NULL DEFAULT NULL COMMENT '用户 id',
  `mp_openid` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '公众号openid',
  `dev_openid` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '开放平台openid',
  `min_openid` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '小程序openid',
  `nickname` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '微信昵称',
  `sex` tinyint NOT NULL DEFAULT 0 COMMENT '性别',
  `province` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '省份',
  `city` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '城市',
  `country` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '国家',
  `headimgurl` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '头像',
  `privilege` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '用户特权信息',
  `unionid` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '只有在用户将公众号绑定到微信开放平台帐号后，才会出现该字段',
  `created_at` datetime(0) NOT NULL COMMENT '创建时间',
  `updated_at` datetime(0) NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `user_id`(`user_id`) USING BTREE,
  INDEX `idx_mp_openid`(`mp_openid`) USING BTREE,
  INDEX `idx_dev_openid`(`dev_openid`) USING BTREE,
  INDEX `idx_min_openid`(`min_openid`) USING BTREE,
  INDEX `idx_unionid`(`unionid`) USING BTREE,
  CONSTRAINT `user_wechats_user_id_foreign` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`) ON DELETE CASCADE ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of user_wechats
-- ----------------------------

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`  (
  `id` bigint UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '用户 id',
  `username` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '用户名',
  `password` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '密码',
  `pay_password` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '支付密码',
  `mobile` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '手机号',
  `signature` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '签名',
  `last_login_ip` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '最后登录 ip 地址',
  `last_login_port` int UNSIGNED NOT NULL DEFAULT 0 COMMENT '最后登录端口',
  `register_ip` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '注册ip',
  `register_port` int UNSIGNED NOT NULL DEFAULT 0 COMMENT '注册端口',
  `register_reason` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '注册原因',
  `email` varchar(512) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '注册邮箱',
  `username_bout` int UNSIGNED NOT NULL DEFAULT 0 COMMENT '用户名修改次数',
  `thread_count` int UNSIGNED NOT NULL DEFAULT 0 COMMENT '主题数',
  `follow_count` int UNSIGNED NOT NULL DEFAULT 0 COMMENT '关注数',
  `fans_count` int UNSIGNED NOT NULL DEFAULT 0 COMMENT '粉丝数',
  `liked_count` int UNSIGNED NOT NULL DEFAULT 0 COMMENT '点赞数',
  `question_count` int UNSIGNED NOT NULL DEFAULT 0 COMMENT '提问数',
  `status` tinyint NOT NULL DEFAULT 0 COMMENT '用户状态：0正常 1禁用 2审核中 3审核拒绝 4审核忽略',
  `avatar` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '头像地址',
  `identity` char(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '身份证号码',
  `realname` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '身份证姓名',
  `avatar_at` datetime(0) NULL DEFAULT NULL COMMENT '头像修改时间',
  `login_at` datetime(0) NULL DEFAULT NULL COMMENT '最后登录时间',
  `joined_at` datetime(0) NULL DEFAULT NULL COMMENT '付费加入时间',
  `expired_at` datetime(0) NULL DEFAULT NULL COMMENT '付费到期时间',
  `created_at` datetime(0) NOT NULL COMMENT '创建时间',
  `updated_at` datetime(0) NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `users_username_unique`(`username`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 34 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES (1, 'admin', '$2y$10$zvP6eQEzVSFoCqY0h9OsreeDM3YCnB.H47ohcEZOoOgf1bUs1GWXi', '$2y$10$HjAZGESWpA4GSk/.fK4ll.aBjaeXpI9cCEoZ/9ehUQqetc..LeP2u', '', '', '59.172.176.227', 62349, '240e:61:141b:7100:4884:5d53:6dc8:bf90', 45974, '', '505311335@qq.com', 0, 11, 0, 0, 2, 0, 0, '', '', '', NULL, '2020-12-11 16:32:52', NULL, NULL, '2020-08-15 21:56:49', '2021-02-25 18:26:02');
INSERT INTO `users` VALUES (2, 'reference_bot', '$2y$10$a6.q3ZrR/QV1M.95EU21XuzV8n1NWqFijxQww3lcUGENltBX1vyJq', '', '', '', '2001:250:4001:103:30df:1422:6403:a407', 23128, '42.3.53.12', 47560, '', NULL, 0, 0, 0, 0, 0, 0, 0, '', '', '', NULL, '2020-11-24 20:26:07', '2020-08-15 22:00:14', NULL, '2020-08-15 22:00:14', '2020-11-24 20:26:08');
INSERT INTO `users` VALUES (3, '111', '$2y$10$.KtOjh9Xwx9miWK9hnCnjO/1JApAo4EMUZ2Q/QumsEhwjG.2Qyv0i', '', '', '', '218.197.153.221', 47202, '218.197.153.221', 47202, '', NULL, 0, 0, 0, 0, 0, 0, 0, '', '', '', NULL, '2020-11-24 16:01:25', '2020-11-24 16:01:25', NULL, '2020-11-24 16:01:25', '2020-11-24 16:02:04');
INSERT INTO `users` VALUES (4, 'A_Salty_Fish', '$2a$10$2kw6zWAGM5ZkpES.Y5UHpOSG3Yr2.r2M.OiQ2ivaGCVDkzFtP.wIu', '$2y$10$r9XXJOupc7lat1kxm.lYNusvdt4zFLGGqghVwk2ms9Dr00CnGQ6Aa', '', '', '59.172.176.142', 55392, '2001:250:4001:103:786a:fda7:f3ad:468e', 55366, '', '1309032417@qq.com', 0, 3, 0, 0, 1, 0, 0, '', '', '', NULL, '2020-12-11 17:10:54', '2020-11-24 20:38:04', NULL, '2020-11-24 20:38:05', '2020-12-31 21:19:06');
INSERT INTO `users` VALUES (5, '陆陆侠', '$2y$10$mxWu8Wnuel3.NzNC5vHz2.Z/cwRq58JI.MC4BOBuFsKmuEQpFGt5G', '$2y$10$lShsoBrAKS1W4YWiVD3vsejvs01hn.qgSEGWr/ntlih8OMy5.L77i', '', '', '58.216.219.228', 10062, '240e:47a:4200:20bc:fbf1:ff1e:3b22:618f', 58282, '', '306924625@qq.com', 0, 3, 0, 0, 4, 0, 0, '', '', '', NULL, '2021-02-23 14:49:27', '2020-11-29 18:41:59', NULL, '2020-11-29 18:41:59', '2021-02-25 14:45:36');
INSERT INTO `users` VALUES (6, 'yorkin', '$2y$10$4rJC7.PAQjIRev14I5fH2OCqH0zwxvSzVYZ.WcRIUlmHYObwSDTye', '', '', '', '127.0.0.1,117.140.155.45', 27296, '117.136.99.254', 25490, '', '1831305534@qq.com', 0, 0, 0, 0, 0, 0, 0, '', '', '', NULL, '2020-12-05 14:15:13', '2020-11-30 21:50:25', NULL, '2020-11-30 21:50:25', '2020-12-06 11:16:07');
INSERT INTO `users` VALUES (7, 'tyty', '$2y$10$fE89dIs4bDyNDdhjaFT3d.4Bf9nB3aCu91YBMWfFqGYKV/DhCCHZe', '', '', '', '127.0.0.1,171.43.245.165', 50600, '127.0.0.1,171.43.245.165', 50600, '', NULL, 0, 0, 0, 0, 0, 0, 0, '', '', '', NULL, '2020-12-03 23:05:21', '2020-12-03 23:05:21', NULL, '2020-12-03 23:05:21', '2020-12-05 21:15:16');
INSERT INTO `users` VALUES (8, 'Eric_Lian', '$2y$10$h93/RbjXJeue0omcbP/FD.Oq0jhKkIXqM6H.hyGVepIKzM7U6GA6C', '$2y$10$/1nT331lfFEe7Kz3MQF7t.HRCVlDjC75h.6xfvDT5qQchLYlrBsOW', '', '', '218.197.153.252', 63762, '::1,2001:250:4001:103:a9dc:d7f7:79:5688', 33030, '', 'public@superexercisebook.com', 0, 0, 0, 0, 0, 0, 0, '', '', '', NULL, '2020-12-09 22:48:57', '2020-12-05 21:29:15', NULL, '2020-12-05 21:29:15', '2020-12-09 22:49:01');
INSERT INTO `users` VALUES (9, 'xiye', '$2y$10$uL/20X.9Pbmk2LzvQ/52net7MMMA2BLWfI7nHw/xKnOXiY1XSYYIu', '$2y$10$AJelZHJYDX8uZTFNEcSrWOkrZhTZW90rcCLSwG2mlVxTc.RvZbKCq', '', '', '59.172.176.212', 56723, '218.197.153.252', 38684, '', 'xiyezry@qq.com', 0, 14, 0, 0, 1, 0, 0, '', '', '', NULL, '2020-12-24 16:14:31', '2020-12-07 11:24:45', NULL, '2020-12-07 11:24:46', '2020-12-25 20:35:23');
INSERT INTO `users` VALUES (10, 'Mozifei', '$2y$10$bIOPKnlLCxIlARyYjI26LuyX0HSCEeVSUhhFKnrg.hyLfSNp.q/KG', '$2y$10$xtWPR6vAG9yK44u5qs95UeMdwiO95njV3mulZ/Q/0tw5zgTpi6jna', '', '', '59.172.176.177', 64835, '2001:250:4001:103:185b:1a09:8209:6bdb', 48334, '', '1927870057@qq.com', 0, 3, 0, 0, 4, 0, 0, '', '', '', NULL, '2021-04-15 10:53:05', '2020-12-07 12:02:59', NULL, '2020-12-07 12:02:59', '2021-04-20 11:05:37');
INSERT INTO `users` VALUES (11, 'Eric', '$2y$10$twSUWpB1mzPUwE86A.3pRORP.X0VsPkf8oiNozLwGo/RgUNFvVhQ2', '$2y$10$vAS4mGanCZZjNWzu039BUOjOTs/nTrd3PciINL0uzf9s/ULNEgYCK', '', '', '218.197.153.252', 30744, '2001:250:4001:103:410:98a:939b:163', 59646, '', '9b7b052a-f2ec-40ca-8d9a-24b58315eec0@superexercisebook.com', 0, 0, 0, 0, 0, 0, 0, '', '', '', NULL, '2020-12-09 22:49:29', '2020-12-08 15:13:06', NULL, '2020-12-08 15:13:06', '2020-12-10 15:30:12');
INSERT INTO `users` VALUES (12, 'HTTP404', '$2y$10$rM1hWfWcmUpaDOpnZ4PLnOjtDo.k3HqpSKfOfsRdaDLMZjW.0U1ry', '', '', '', '221.234.202.178', 29706, '221.234.202.178', 29706, '', 'wzh292@Outlook.com', 0, 1, 0, 0, 2, 0, 0, '', '', '', NULL, '2020-12-08 15:20:34', '2020-12-08 15:20:34', NULL, '2020-12-08 15:20:34', '2020-12-08 16:03:54');
INSERT INTO `users` VALUES (13, 'wuziqiu', '$2y$10$FmsEGlTXmZ34jGfSu/SqYuGSH.a7pqAMh.wUgdexF/Hbf4ObjiqlO', '', '', '', '2001:250:4001:5013:c07:64fb:e230:12cd', 42636, '2001:250:4001:5013:c07:64fb:e230:12cd', 42636, '', NULL, 0, 0, 0, 0, 0, 0, 0, '', '', '', NULL, '2020-12-08 15:23:26', '2020-12-08 15:23:26', NULL, '2020-12-08 15:23:26', '2020-12-08 15:23:26');
INSERT INTO `users` VALUES (14, '11', '$2y$10$CzBCiuZI6CCj4EUBYzQGHev9RedOfqPJmWErMs4MaX58z69h54A7S', '', '', '', '89.31.126.214', 63132, '89.31.126.214', 63132, '', NULL, 0, 0, 0, 0, 0, 0, 0, '', '', '', NULL, '2020-12-08 15:28:35', '2020-12-08 15:28:35', NULL, '2020-12-08 15:28:35', '2020-12-08 15:28:59');
INSERT INTO `users` VALUES (15, 'NRJ', '$2y$10$Zmcj471uReByr2zNhYIIIuq0AacRjkvm7X0VXqvVXD.s40uLG9Ys2', '', '', '', '2001:250:4001:5012:34b0:a14b:bee5:d7f3', 58516, '2001:250:4001:5012:34b0:a14b:bee5:d7f3', 58516, '', NULL, 0, 0, 0, 0, 0, 0, 0, '', '', '', NULL, '2020-12-08 15:35:40', '2020-12-08 15:35:40', NULL, '2020-12-08 15:35:40', '2020-12-08 15:38:54');
INSERT INTO `users` VALUES (16, 'lpdink', '$2y$10$ovmct1v19QRqR09Y5UcSN.BZ/mGfDLrrAl2yaAwohkMDDbM/cE5rO', '', '', '', '218.197.153.235', 53308, '218.197.153.235', 53308, '', NULL, 0, 0, 0, 0, 0, 0, 0, '', '', '', NULL, '2020-12-08 15:41:03', '2020-12-08 15:41:03', NULL, '2020-12-08 15:41:03', '2020-12-08 15:43:05');
INSERT INTO `users` VALUES (17, 'ccc', '$2y$10$r7QXVSEZnGmt8twYGz8aC.h9lYM8gQVKF2Z4hIXoP.0DUaYlcLv16', '', '', '', '218.197.153.148', 29780, '218.197.153.148', 29780, '', NULL, 0, 0, 0, 0, 0, 0, 0, '', '', '', NULL, '2020-12-08 19:39:47', '2020-12-08 19:39:47', NULL, '2020-12-08 19:39:47', '2020-12-08 19:40:59');
INSERT INTO `users` VALUES (18, 'tw', '$2y$10$Zlo.jt83gA8q55Klw9mQUuJo.pygqG6Sox0MER0j63GugDUdpInXS', '', '', '', '59.172.176.197', 61797, '59.172.176.197', 61797, '', NULL, 0, 0, 0, 0, 0, 0, 0, '', '', '', NULL, '2020-12-11 20:13:56', '2020-12-11 20:13:56', NULL, '2020-12-11 20:13:56', '2020-12-13 10:45:57');
INSERT INTO `users` VALUES (19, 'Hyt', '$2y$10$TamwCgbKl8tD4cWrAxvHD.GVNIXYbA4/Tn1OyBHT57u0IRSKQaZ.G', '', '', '', '111.8.49.183', 64400, '111.8.49.183', 64400, '', NULL, 0, 0, 0, 0, 0, 0, 0, '', '', '', NULL, '2020-12-12 23:16:36', '2020-12-12 23:16:36', NULL, '2020-12-12 23:16:36', '2020-12-12 23:16:50');
INSERT INTO `users` VALUES (20, 'InkHin', '$2y$10$Axd2YlOBhB9GrOisjbR8gu8aUgMHos8tMWzEzEeODmqBL1IVA6HBq', '', '', '', '116.26.157.87', 38202, '116.26.157.87', 38202, '', NULL, 0, 0, 0, 0, 0, 0, 0, '', '', '', NULL, '2020-12-13 11:58:48', '2020-12-13 11:58:48', NULL, '2020-12-13 11:58:48', '2020-12-13 13:03:21');
INSERT INTO `users` VALUES (21, 'test', '$2y$10$tTdMzxJsgcsqNkty5feDle0XG.Ac552cWRMa3WzVBymR4/XgonGI2', '', '', '', '112.232.114.243', 14352, '112.232.114.243', 14352, '', NULL, 0, 0, 0, 0, 0, 0, 0, '', '', '', NULL, '2020-12-13 12:11:03', '2020-12-13 12:11:03', NULL, '2020-12-13 12:11:03', '2020-12-13 12:11:03');
INSERT INTO `users` VALUES (22, '15811100556', '$2y$10$GWeMckxJQHgCujyW5QHJQeImTFT1oMh7qYsJTthI2d9LOanKKAkP2', '', '', '', '183.92.251.130', 6543, '183.92.251.130', 6543, '', NULL, 0, 0, 0, 0, 0, 0, 0, '', '', '', NULL, '2020-12-13 12:38:31', '2020-12-13 12:38:31', NULL, '2020-12-13 12:38:31', '2020-12-13 12:38:31');
INSERT INTO `users` VALUES (23, 'referi', '$2y$10$jahVr0t7dXRmt59hiQeu1eUwrJw7pDZQBF4W6ZWt1Y0K6JwQ2ypIS', '', '', '', '59.172.176.250', 60355, '59.172.176.250', 60355, '', '765511198@qq.com', 0, 0, 0, 0, 0, 0, 0, '', '', '', NULL, '2020-12-13 13:10:54', '2020-12-13 13:10:54', NULL, '2020-12-13 13:10:54', '2020-12-21 18:46:13');
INSERT INTO `users` VALUES (24, 'Summer', '$2y$10$..klndu892u8XmzfBt6QnOM37VwEQa5t7aAUv082ihmvEp4z2NXS6', '', '', '', '59.172.176.149', 63828, '59.172.176.149', 63828, '', NULL, 0, 0, 0, 0, 0, 0, 0, '', '', '', NULL, '2020-12-13 16:32:15', '2020-12-13 16:32:15', NULL, '2020-12-13 16:32:15', '2020-12-16 20:18:17');
INSERT INTO `users` VALUES (25, '未命名', '$2y$10$XYmFItoTOJxnBJMU.cdouOiLkG4rCARHJ.YPVgJ7UgwRVwcCE52TW', '', '', '', '59.172.176.207', 50082, '59.172.176.207', 50082, '', NULL, 0, 0, 0, 0, 0, 0, 0, '', '', '', NULL, '2020-12-13 18:52:32', '2020-12-13 18:52:32', NULL, '2020-12-13 18:52:32', '2020-12-13 18:52:32');
INSERT INTO `users` VALUES (26, 'test07', '$2y$10$m/tyGjNyinSYa/juDkuO0eeX8o5OGPgXKYaLKXz5yeJ1yoUSFlhvG', '', '', '', '59.172.176.163', 13169, '59.172.176.163', 13169, '', NULL, 0, 0, 0, 0, 0, 0, 0, '', '', '', NULL, '2020-12-14 16:28:21', '2020-12-14 16:28:21', NULL, '2020-12-14 16:28:21', '2020-12-23 03:04:33');
INSERT INTO `users` VALUES (27, 'leo', '$2y$10$F5rr2kt0hO8hLFjOTfdzvOX4iEVyiPpbvVqUgcUwXgglu8RRpzGjW', '', '', '', '123.112.4.81', 4170, '123.112.4.81', 4170, '', NULL, 0, 0, 0, 0, 0, 0, 0, '', '', '', NULL, '2020-12-19 14:00:11', '2020-12-19 14:00:11', NULL, '2020-12-19 14:00:11', '2020-12-19 14:06:21');
INSERT INTO `users` VALUES (28, 'zhang', '$2y$10$bwVhF76UALFHl9QbtzTghenVqyBbG4K6eWP7npuHyOsTHad4jsZ4S', '', '', '', '202.103.243.65', 60506, '202.103.243.65', 60506, '', NULL, 0, 0, 0, 0, 0, 0, 0, '', '', '', NULL, '2020-12-21 18:57:18', '2020-12-21 18:57:18', NULL, '2020-12-21 18:57:18', '2020-12-21 19:11:33');
INSERT INTO `users` VALUES (29, 'hahahahaha', '$2y$10$kabZl1XgW2vBal3czmon7eJIbix/k9zZulyAhy30UZlKhjvJxZ5ee', '', '', '', '60.1.185.162', 23495, '60.1.185.162', 23495, '', NULL, 0, 0, 0, 0, 0, 0, 0, '', '', '', NULL, '2021-01-08 21:35:28', '2021-01-08 21:35:28', NULL, '2021-01-08 21:35:28', '2021-01-08 21:37:00');
INSERT INTO `users` VALUES (30, '135920', '$2y$10$SkPLHhhMZm7DHgUrrmXLz.Lo6XVKGTQhfI7j17qx/lPxUMfOOb91i', '', '', '', '61.158.152.127', 50958, '61.158.152.127', 50958, '', NULL, 0, 1, 0, 0, 0, 0, 0, '', '', '', NULL, '2021-01-20 11:25:44', '2021-01-20 11:25:43', NULL, '2021-01-20 11:25:44', '2021-01-20 11:27:45');
INSERT INTO `users` VALUES (31, 'Leo1007', '$2y$10$lpaj7vIwEQRPRYQx3u0R1OWhMaEP5K7xzA2z3e/f.OG0GU5VCQN5.', '', '', '', '42.238.94.234', 21342, '42.238.94.234', 21342, '', NULL, 0, 0, 0, 0, 0, 0, 0, '', '', '', NULL, '2021-01-21 19:29:38', '2021-01-21 19:29:38', NULL, '2021-01-21 19:29:38', '2021-01-21 19:29:38');
INSERT INTO `users` VALUES (32, 'jdksahd', '$2y$10$0DIf7IC7M7Qkl4NpY5uCCOxfVOECJ5wruaHRb9vM5ZzBCiojsN4AG', '', '', '', '183.193.170.100', 31501, '183.193.170.100', 31501, '', NULL, 0, 0, 0, 0, 0, 0, 0, '', '', '', NULL, '2021-03-01 22:24:44', '2021-03-01 22:24:44', NULL, '2021-03-01 22:24:44', '2021-03-01 22:24:44');
INSERT INTO `users` VALUES (33, '15516630315', '$2y$10$q3buGE9uapQs3eozDiDs0O7kdTuVRg.2bhSHU9eExofAO8KdPtaWK', '', '', '', '59.172.176.179', 58244, '59.172.176.162', 51216, '', NULL, 0, 0, 0, 0, 0, 0, 0, '', '', '', NULL, '2021-05-18 10:50:28', '2021-03-09 15:46:15', NULL, '2021-03-09 15:46:15', '2021-05-18 10:53:00');
INSERT INTO `users` VALUES (34, 'dzy_test', '$2y$10$I52Uyj1XV9cxkMYEoKdDye1XYv/D55mNDPWzn4Sf6Ybdu7HonsOku', '', '', '', '59.172.176.207', 54967, '59.172.176.207', 54967, '', NULL, 0, 0, 0, 0, 0, 0, 0, '', '', '', NULL, '2021-04-15 14:26:57', '2021-04-15 14:26:41', NULL, '2021-04-15 14:26:41', '2021-05-13 12:02:34');

-- ----------------------------
-- Table structure for wechat_offiaccount_replies
-- ----------------------------
DROP TABLE IF EXISTS `wechat_offiaccount_replies`;
CREATE TABLE `wechat_offiaccount_replies`  (
  `id` bigint UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '规则名',
  `keyword` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '关键词',
  `match_type` tinyint UNSIGNED NOT NULL DEFAULT 0 COMMENT '匹配类型:0全匹配1半匹配',
  `reply_type` tinyint UNSIGNED NOT NULL DEFAULT 1 COMMENT '消息回复类型',
  `content` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '回复文本内容',
  `media_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '素材ID',
  `media_type` tinyint UNSIGNED NOT NULL DEFAULT 0 COMMENT '素材类型:1图片2视频3语音4图文',
  `type` tinyint UNSIGNED NOT NULL DEFAULT 2 COMMENT '数据类型:0被关注回复1消息回复2关键词回复',
  `status` tinyint NOT NULL DEFAULT 1 COMMENT '是否开启:0关闭1开启',
  `created_at` datetime(0) NOT NULL COMMENT '创建时间',
  `updated_at` datetime(0) NOT NULL COMMENT '更新时间',
  `deleted_at` datetime(0) NULL DEFAULT NULL COMMENT '删除时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `idx_keyword`(`keyword`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of wechat_offiaccount_replies
-- ----------------------------

SET FOREIGN_KEY_CHECKS = 1;
