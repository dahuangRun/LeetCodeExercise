/*
 第二高的薪水：https://leetcode-cn.com/problems/second-highest-salary/description/
 主要是通过两个选择来筛选出第二高的薪水
*/

SELECT max(Salary) as SecondHighestSalary from Employee where SALARY < (select max(SALARY) from Employee); 


/*
当然我们也可以稍稍扩展一下将整个创建数据库及创建表格的方式都完成
*/

CREATE DATABASE leetcode

--创建Employee表
Create table If Not Exists Employee (
	Id int, 
	Salary int
	)ENGINE=InnoDB DEFAULT CHARSET=utf8;


--插入数据
insert into Employee (Id, Salary) values ('1', '100');
insert into Employee (Id, Salary) values ('2', '200');
insert into Employee (Id, Salary) values ('3', '300');
