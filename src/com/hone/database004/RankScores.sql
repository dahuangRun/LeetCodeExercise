/*
分数排名：https://leetcode-cn.com/problems/nth-highest-salary/description/
*/

--方法1：对于每一个分数，找出表中有多少个大于或等于该分数的不同的分数，然后按降序排列即可

SELECT Score, 
(SELECT COUNT(DISTINCT Score) FROM Scores WHERE Score >= s.Score) Rank
FROM Scores s ORDER BY Score DESC;


--方法2

SELECT Score,
(SELECT COUNT(*) FROM (SELECT DISTINCT Score s FROM Scores) t WHERE s >= Score) Rank
FROM Scores ORDER BY Score DESC;

--方法3：使用内交的方式
Join是Inner Join的简写形式，自己和自己内交，条件是右表的分数大于等于左表，然后群组起来根据分数的降序排列，十分巧妙的解法：

SELECT s.Score, COUNT(DISTINCT t.Score) Rank
FROM Scores s JOIN Scores t ON s.Score <= t.Score
GROUP BY s.Id ORDER BY s.Score DESC;

/*
 * 当然我们也可以稍稍扩展一下将整个创建数据库及创建表格的方式都完成
*/

CREATE DATABASE leetcode;

--创建Employee表
Create table If Not Exists scores (
	Id int, 
	Score DECIMAL(3,2)
	)ENGINE=InnoDB DEFAULT CHARSET=utf8;


--插入数据
insert into Employee (Id, Salary) values ('1', '100');
insert into Employee (Id, Salary) values ('2', '200');
insert into Employee (Id, Salary) values ('3', '300');

