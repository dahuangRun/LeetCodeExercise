/*
 第N高的薪水：https://leetcode-cn.com/problems/nth-highest-salary/description/
 我们需要构建一个函数，用于查找第n高的薪水
*/

CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
  	SELECT MAX(Salary) FROM Employee E1
  	WHERE N - 1 = 
  	(SELECT COUNT(DISTINCT(E2.Salary)) FROM Employee E2
      WHERE E2.Salary > E1.Salary)
  );
END


--DISTINCT:用于统计E2.Salary中所有不相等的数、也就是去掉重复记录的


/*
 * 当然我们也可以稍稍扩展一下将整个创建数据库及创建表格的方式都完成
*/

CREATE DATABASE leetcode;

--创建Employee表
Create table If Not Exists Employee (
	Id int, 
	Salary int,
	)ENGINE=InnoDB DEFAULT CHARSET=utf8;


--插入数据
insert into Employee (Id, Salary) values ('1', '100');
insert into Employee (Id, Salary) values ('2', '200');
insert into Employee (Id, Salary) values ('3', '300');

