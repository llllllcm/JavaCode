--这个文件主要用来写建库和建表的语句.
--一般来说在建表的时候把代码保留下来，以备后续部署其他机器的时候就可以直接拷贝过去.
create database if not exists Blog_system charset utf8;
use Blog_system;

--删除旧表，重新创建新表，删除旧表是为了防止之前的残留数据对后续的程序有影响.
drop table if exists user;
drop table if exists blog;

--真正进行建表.
create table blog (
    blogId int primary key auto_increment,
    title varchar(128),
    content varchar(4096),
    postTime datetime,
    userId int
);

create table user(
    userId int primary key auto_increment,
    username varchar(20) unique,
    password varchar(20)
);
--插入一些语句
insert into blog values(1,'第一篇博客','1111111111',now(),1);
insert into blog values(2,'第二篇博客','1222222211111',now(),1);
insert into blog values(3,'第三篇博客','111111113333333311',now(),1);
insert into blog values(4,'第四篇博客','你好哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈2',now(),1);
insert into blog values(5,'第五篇博客','你好哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈2',now(),1);
insert into blog values(6,'第六篇博客','你好哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈2',now(),1);

--插入一些用户数据
insert into user values(1,'zhangsan','123');
insert into user values(2,'lisi','123');



