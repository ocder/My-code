CREATE TABLE Student

(Sno Char(7) NOT NULL UNIQUE,

Sname VarChar(20) NOT NULL,

Ssex Char(2) NOT NULL,

Sage Smallint,

Clno Char(5) NOT NULL);

CREATE TABLE Course

(Cno Char(1) NOT NULL UNIQUE,

Cname VarChar(20) NOT NULL,

Credit Smallint);

CREATE TABLE Class

(Clno Char(5) NOT NULL,

Speciality VarChar(20) NOT NULL,

Inyear Char(4) NOT NULL,

Number Integer,

Monitor Char(7));

CREATE TABLE Grade

(Sno Char(7) NOT NULL,

Cno Char(1) NOT NULL,

Gmark Numeric(4,1));

INSERT INTO Student

VALUES('2000101','李勇','男',20,'00311');

INSERT INTO Student

VALUES('2000102','刘诗晨','女',19,'00311');

INSERT INTO Student

VALUES('2000103','王一鸣','男',20,'00312');

INSERT INTO Student

VALUES('2000104','张婷婷','女',21,'00312');

INSERT INTO Student

VALUES('2001101','李勇敏','女',19,'01311');

INSERT INTO Student

VALUES('2001102','贾向东','男',22,'01311');

INSERT INTO Student

VALUES('2001103','陈宝玉','男',20,'01311');

INSERT INTO Student

VALUES('2001104','张逸凡','男',21,'01311');

INSERT INTO Course

VALUES('1','数据库',4);

INSERT INTO Course

VALUES('2','离散数学',3);

INSERT INTO Course

VALUES('3','管理信息系统',2);

INSERT INTO Course

VALUES('4','操作系统',4);

INSERT INTO Course

VALUES('5','数据结构',4);

INSERT INTO Course

VALUES('6','数据处理',2);

INSERT INTO Course

VALUES('7','c语言',4);

INSERT INTO Class

VALUES('00311','计算机软件','2000',120,'2000101');

INSERT INTO Class

VALUES('00312','计算机应用','2000',140,'2000103');

INSERT INTO Class

VALUES('01311','计算机软件','2001',220,'2001103');

INSERT INTO Grade

VALUES('2000101','1',92);

INSERT INTO Grade

VALUES('2000101','3',88);

INSERT INTO Grade

VALUES('2000101','5',86);

INSERT INTO Grade

VALUES('2000102','1',78);

INSERT INTO Grade

VALUES('2000102','6',55);

INSERT INTO Grade

VALUES('2000103','3',65);

INSERT INTO Grade

VALUES('2000103','6',78);

INSERT INTO Grade

VALUES('2000103','5',66);

INSERT INTO Grade

VALUES('2000104','1',54);

INSERT INTO Grade

VALUES('2000104','6',83);

INSERT INTO Grade

VALUES('2001101','2',70);

INSERT INTO Grade

VALUES('2001101','4',83);

INSERT INTO Grade

VALUES('2001102','2',80);

INSERT INTO Grade

VALUES('2001102','4',90);

INSERT INTO Grade

VALUES('2000103','1',83);

INSERT INTO Grade

VALUES('2000103','2',76);

INSERT INTO Grade

VALUES('2000103','4',56);

INSERT INTO Grade

VALUES('2000103', '7', 88);

ALTER TABLE dbo.Student
ADD Nation VarChar(20);
SELECT * FROM dbo.Student;

ALTER TABLE dbo.Student
DROP COLUMN Nation;
SELECT * FROM dbo.Student;

INSERT INTO dbo.Grade
VALUES ('2001110', '3', 80);
SELECT * FROM dbo.Grade;

UPDATE dbo.Grade
SET Gmark = 70 WHERE Sno = '2001110';
SELECT * FROM dbo.Grade;

DELETE FROM dbo.Grade
    WHERE Sno = '2001110';
SELECT * FROM dbo.Grade;

CREATE INDEX Student.IX_CLASS
ON dbo.Student(Clno)l;
SELECT * FROM dbo.Student;

DROP INDEX Student.IX_CLASS;
SELECT * FROM dbo.Student;

SELECT DISTINCT Cno FROM Grade, Student WHERE Grade.Sno = Student.Sno;

SELECT * FROM Student WHERE Ssex = '女' AND Clno = '01311';

SELECT Sname, Ssex, (2014-Sage) AS '出生年份' FROM Student WHERE Clno IN ('01311', '01312');

SELECT * FROM Student WHERE Sname LIKE '李%';

SELECT COUNT (*) AS '李勇班级人数' FROM Student  WHERE Clno IN(SELECT Clno FROM Student WHERE Sname = '李勇');

SELECT MAX(Gmark) AS '最高分', MIN(Gmark) AS '最低分', AVG(Gmark) AS '平均成绩' FROM Grade g, Course c WHERE g.Cno IN(SELECT c.Cno FROM
Course WHERE c.Cname = '操作系统');

SELECT COUNT(DISTINCT Sno) AS '选修了课程的人数' FROM Grade;

SELECT COUNT(DISTINCT Sno) AS '选修了操作系统的人数' FROM Student S, Grade G WHERE S.Sno IN(SELECT G.Sno FROM Grade WHERE G.Cno = (SELECT Cno FROM Course WHERE Cname = '操作系统'))；

SELECT S.Sname FROM Student S WHERE S.Sno NOT IN (SELECT Sno FROM Grade) AND S.Clno = (SELECT Clno FROM Class WHERE Inyear = '2000' AND Speciality = '计算机软件');
/*13题
SELECT * FROM Student WHERE Clno = ( SELECT Clno FROM Student WHERE Sname = '李勇')AND Sname NOT IN('李勇')；

SELECT * FROM Student
WHERE Sno IN(SELECT Sno FROM Grade WHERE Grade.Cno IN(SELECT Cno FROM Grade
WHERE Sno=(SELECT Sno FROM Student WHERE Sname = '李勇')))AND Sname NOT IN('李勇');

SELECT * FROM Student
WHERE Sage < 25 AND Sage > (SELECT Sage FROM Student WHERE Sname = '李勇');

SELECT Sno, Sname FROM Student WHERE Sno IN(SELECT Sno FROM Grade WHERE Cno = (SELECT Cno FROM Course WHERE Cname = '操作系统'));

SELECT Sname FROM Student WHERE Sno NOT IN (SELECT Sno FROM Grade WHERE Cno = '1');

SELECT Sname FROM Student WHERE NOT EXISTS(SELECT * FROM Course WHERE NOT EXISTS (SELECT * FROM Grade WHERE Sno = Student.Sno
AND Cno = Course.Cno));
*/
SELECT Sno, Sname, Sage FROM Student WHERE Sage < (SELECT AVG(Sage) FROM Student);
