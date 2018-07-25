/*
查找连续的数：https://leetcode-cn.com/problems/consecutive-numbers/description/
编写一个 SQL 查询，查找所有至少连续出现三次的数字
注意，因为是查找连续的
*/


--方法1：多表查询 
select distinct l1.Num as ConsecutiveNums from Logs l1,Logs l2,Logs l3 where 
	l1.Id=l2.Id-1
	and l2.Id=l3.Id-1
	and l1.Num=l2.Num
	and l2.Num=l3.Num;　　

--方法2：联表查询
select distinct l1.Num as ConsecutiveNums from Logs l1
	join Logs l2 on l1.Id=l2.Id-1
	join Logs l3 on l2.Id=l3.Id-1
	where L1.Num=L2.Num
	and L2.Num=L3.Num;


/*
 * 当然我们也可以稍稍扩展一下将整个创建数据库及创建表格的方式都完成
*/

CREATE DATABASE leetcode;

--创建Logs表
Create table If Not Exists Logs (
	Id int not null auto_increment, 
	Num int,
	primary key (Id)
	)ENGINE=InnoDB DEFAULT CHARSET=utf8;


--插入数据
insert into Logs (Id, Num) values ('1', '1');
insert into Logs (Id, Num) values ('2', '1');
insert into Logs (Id, Num) values ('3', '1');
insert into Logs (Id, Num) values ('4', '2');
insert into Logs (Id, Num) values ('5', '1');
insert into Logs (Id, Num) values ('6', '2');
insert into Logs (Id, Num) values ('7', '2');

