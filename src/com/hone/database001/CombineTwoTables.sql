/*
链接两张表：https://leetcode-cn.com/problems/combine-two-tables/description/
*/

SELECT p.FirstName , p.LastName ,a.City,a.State from Person p left join 
Address a on p.PersonId = a.PersonId;


/*
当然我们也可以稍稍扩展一下将整个创建数据库及创建表格的方式都完成
*/

CREATE DATABASE leetcode

--创建Person表
CREATE TABLE IF NOT EXISTS Person(
	PersonId INT UNSIGNED AUTO_INCREMENT,
	FirstName VARCHAR(100),
	LastName VARCHAR(100),
	PRIMARY KEY (PersonId)
	)ENGINE=InnoDB DEFAULT CHARSET=utf8;

--创建Address表
CREATE TABLE IF NOT EXISTS Address(
	AddressId INT AUTO_INCREMENT NOT NULL,
	PersonId INT NOT NULL,
	City VARCHAR(100),
	State VARCHAR(100),
	PRIMARY KEY (AddressId)
	)ENGINE=InnoDB DEFAULT CHARSET=utf8;

--插入数据
insert into Person (PersonId, LastName, FirstName) values ('1', 'Wang', 'Allen');
insert into Person (PersonId, LastName, FirstName) values ('2', 'li', 'xin');



insert into Address (AddressId, PersonId, City, State) values ('1', '2', 'New York City', 'New York');
insert into Address (AddressId, PersonId, City, State) values ('2', '3', 'New York City', 'New York');


