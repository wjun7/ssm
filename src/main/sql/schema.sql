-- 创建图书表
CREATE TABLE `book` (
  `book_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '图书ID',
  `name` varchar(100) NOT NULL COMMENT '图书名称',
  `number` int(11) NOT NULL COMMENT '馆藏数量',
  PRIMARY KEY (`book_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='图书表'

-- 初始化图书数据
INSERT INTO `book` (`book_id`, `name`, `number`)
VALUES
	(1000, 'Java程序设计', 10),
	(1001, '数据结构', 10),
	(1002, '设计模式', 10),
	(1003, '编译原理', 10)

-- 创建预约图书表
CREATE TABLE `appointment` (
  `book_id` bigint(20) NOT NULL COMMENT '图书ID',
  `student_id` bigint(20) NOT NULL COMMENT '学号',
  `appoint_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '预约时间' ,
  PRIMARY KEY (`book_id`, `student_id`),
  INDEX `idx_appoint_time` (`appoint_time`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='预约图书表'

CREATE TABLE `userlist` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '用户列表主键ID',
  `name` varchar(100) NOT NULL COMMENT '名字',
  `idcard` varchar(50) NOT NULL COMMENT '身份证id',
  `phone` varchar(20) NOT NULL COMMENT '电话号码',
  `user_id` int(11) NOT NULL COMMENT '用户列表真ID',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='用户列表';

CREATE TABLE `apply` (
  `apply_id` int(20) NOT NULL AUTO_INCREMENT COMMENT '看房申请表ID',
  `house_id` varchar(20) NOT NULL COMMENT '房子id',
  `address` varchar(100) NOT NULL COMMENT '地址',
  `area` DOUBLE(10) NOT NULL COMMENT '面积',
  `price` DOUBLE(10) NOT NULL COMMENT '价格',
  `userlist_id` int(20) NOT NULL COMMENT '用户列表主键id',
  `status` varchar(20) NOT NULL COMMENT '房子状态',
  PRIMARY KEY (`apply_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='看房申请表';

CREATE TABLE `applyout` (
  `aoid` int(20) NOT NULL AUTO_INCREMENT COMMENT '退房申请表ID',
  `house_id` varchar(20) NOT NULL COMMENT '房子id',
  `address` varchar(100) NOT NULL COMMENT '地址',
  `userlist_id` int(20) NOT NULL COMMENT '用户列表主键id',
  `status` varchar(20) NOT NULL COMMENT '房子状态',
  PRIMARY KEY (`aoid`)
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='退房申请表';


CREATE TABLE `checkout` (
  `cid` int(20) NOT NULL AUTO_INCREMENT COMMENT '结账表主键ID',
  `house_id` varchar(20) NOT NULL COMMENT '房子id',
  `address` varchar(100) NOT NULL COMMENT '地址',
  `status` varchar(20) NOT NULL COMMENT '房子状态',
  `userlist_id` int(20) NOT NULL COMMENT '房子状态',
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='结账表';


CREATE TABLE `zulist` (
  `zid` int(20) NOT NULL AUTO_INCREMENT COMMENT '租客表ID',
  `house_id` varchar(20) NOT NULL COMMENT '房子id',
  `address` varchar(100) NOT NULL COMMENT '地址',
  `contract_id` int(20) NOT NULL COMMENT '合同表id',
  `price` DOUBLE(20) NOT NULL COMMENT '价格',
  `userlist_id` int(20) NOT NULL COMMENT '用户列表主键id',
  PRIMARY KEY (`zid`)
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='租客表';

CREATE TABLE `hetong` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '合同表ID',
  `house_id` varchar(20) NOT NULL COMMENT '房子id',
  `chuzu` VARCHAR(20) NOT NULL AUTO_INCREMENT COMMENT '出租',
  `chuzu_idcard` VARCHAR(50) NOT NULL AUTO_INCREMENT COMMENT '出租身份证id',
  `price` DOUBLE(20) NOT NULL COMMENT '价格',
  `zuke` VARCHAR(20) NOT NULL COMMENT '租客',
  `zuke_idcard` VARCHAR(20) NOT NULL COMMENT '租客身份证id',
  `fromdate` VARCHAR(20) NOT NULL COMMENT '开始日期',
  `todate` VARCHAR(20) NOT NULL COMMENT '借宿日期',
  `address` varchar(100) NOT NULL COMMENT '地址',
  `payday` int(20) NOT NULL COMMENT '缴款日期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='合同表';

CREATE TABLE `houselist` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '房子表ID',
  `houseid` varchar(20) NOT NULL COMMENT '房子id',
  `area` DOUBLE(10) NOT NULL COMMENT '面积',
  `price` DOUBLE(10) NOT NULL COMMENT '价格',
  `status` varchar(20) NOT NULL COMMENT '房子状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='房子表';

CREATE TABLE `paid` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '已付款表ID',
  `house_id` varchar(20) NOT NULL COMMENT '房子id',
  `address` varchar(100) NOT NULL COMMENT '地址',
  `price` DOUBLE(10) NOT NULL COMMENT '价格',
  `date` Date(20) NOT NULL COMMENT '日期',
  `paydate` Date(20) NOT NULL COMMENT '支付日期',
  `name` varchar(100) NOT NULL COMMENT '名字',
  `userlist_id` int(20) NOT NULL COMMENT '用户列表主键id',
  `status` varchar(20) NOT NULL COMMENT '房子状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='已付款表';

CREATE TABLE `schedule` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '日程表ID',
  `date` Date(20) NOT NULL COMMENT '日期',
  `content` varchar(300) NOT NULL COMMENT '内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='日程表';








