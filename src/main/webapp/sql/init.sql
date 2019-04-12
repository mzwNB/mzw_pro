--##患者表
create table t_patient(
  id varchar2(36) primary key,--患者id
  name varchar2(20),--患者姓名
  sex number(1),--0 女    1男   2其他
  birth date,--患者生日
  idcard varchar2(20),--患者身份证
  address varchar2(100),--患者住址
  mobile varchar2(11)--患者手机号
);



--## 科室表
create table t_department(
  id varchar2(36) primary key,--科室编号
  name varchar2(50),--科室名称
  telephone varchar2(20),--科室办公室电话
  area varchar2(20)--科室所在区域
);



--## 分诊记录表
create table t_triage(
  id varchar2(36) primary key,--id
  status number(1),   --状态  0 等待诊断     1诊断中  2诊断结束
  illness_info varchar2(500),--症状描述
  advice varchar2(1000),--诊断建议
  pid varchar2(36),-- 外键指向 patient表的主键
  did varchar2(36),-- 科室id
  userid varchar2(36) --医生外键，指向用户表的外键
);




--##后台管理医生用户信息
drop table t_user

create table t_user(
  id varchar2(36) primary key,--id
  username varchar2(20),--后台系统登录的用户名
  password varchar2(20),--密码
  realname varchar2(20),--真实姓名
  sex number(1),--0女    1男 
  birth date,--出生年月日
  mobile varchar2(11),--联系电话
  email varchar2(30),--邮箱
  pic varchar2(100),--头像的路径
  dept_id varchar2(36)--科室的外键，表明医生属于哪个科室
);


--## 值班表
create table t_rota(
  id varchar2(36) primary key,
  rota_date date,--值班日期
  did varchar2(36),--科室外键
  userid varchar2(36)--医生用户的id
);


--## 通知表
create table t_notice(
  id varchar2(36) primary key,
  notice_date date,--通知时间。
  title varchar2(30),--标题
  content varchar2(300)--内容
);


--##日志表
create table t_log(
  id varchar2(36) primary key,
  type number(2), --1：登录日志    2: 诊断日志
  oprater varchar2(50),--日志操作人的真实姓名
  content varchar2(100),--操作内容。
  log_date date
);

--##文件信息表
create table t_files(
       id varchar2(36) primary key,
       file_name varchar2(50),
     file_path varchar2(50),--保存路径
       save_name varchar2(100),
       up_time date,--文件上传时间
       file_size number(12)
);

--## 药品信息
create table t_drug(
  id varchar2(36) primary key,
  name varchar2(50),--药品名
  spec varchar2(50),--规格
  unit varchar2(10),--单位
  product_company varchar2(50),--生产企业
  product_date date,--生产日期
  ok_date date,--保质期至
  import_price number(10,2),--进价
  price number(10,2),--零售价
  sale_status number(1),--销售状态  （0：正常销售    1：停售）
  is_import number(1),--是否是进口(0:是   1：非进口药)
  description varchar2(500)--产品说明
);

--## 审核表
create table t_exam(
  id varchar2(36) primary key,
  exam_status number(2),--审核状态   0 ：未审核    1：审核中   2：审核通过   3：审核未通过
  exam_advice varchar2(30),--审核意见
  exam_start_date date,--审核提交时间
  exam_end_date date,--审核结束时间
  d_id references t_drug(id)
);
