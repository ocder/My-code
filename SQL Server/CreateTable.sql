CREATE TABLE Employee
(Eno        CHAR(4)NOT NULL UNIQUE,
Ename       CHAR(8)NOT NULL,
Sex         CHAR(2)NOT NULL DEFAULT('男'),
Age         INT NULL,
Is_Marry    CHAR(1)NULL,
Title       CHAR(6)NULL,
Dno         CHAR(2)NULL);