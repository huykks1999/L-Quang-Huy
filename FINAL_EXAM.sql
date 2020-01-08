DROP DATABASE IF EXISTS Students;
CREATE DATABASE Students;
USE Students;
DROP TABLE IF EXISTS STUDENT, Subjects, StudentSubject;


-- QUESTIONS 3:
CREATE TABLE Student (
    RN CHAR(10) PRIMARY KEY,
    Student_name VARCHAR(30) NOT NULL,
    AGE TINYINT NOT NULL,
    GENDER CHAR(10)
);

CREATE TABLE Subjects (
    sID CHAR(10) PRIMARY KEY,
    sName VARCHAR(30) NOT NULL
);

CREATE TABLE StudentSubject (
    RN CHAR(10) NOT NULL,
    sID CHAR(10) NOT NULL,
    MARK TINYINT NOT NULL,
    DATEs DATE NOT NULL,
    PRIMARY KEY (RN , sID),
    FOREIGN KEY (RN)
        REFERENCES Student (RN)
        ON DELETE CASCADE,
    FOREIGN KEY (sID)
        REFERENCES Subjects (sID)
        ON DELETE CASCADE
);
 
 INSERT INTO Student
(		RN,                   Student_name,                     Age,                      Gender)
VALUES
(      '01',                 'Le Quang Huy',                    18,                      '0'),
(      '02',                 'Nguyen Quang Ngoc',               19,                      '1'),    
(      '03',                 'Le Tien Hung',                    20,                      'NULL'), 
(      '04',                 'Tran Manh Cuong',                 18,                      '0'),
(      '05',                 'Dinh The Hung',                   17,                      '1'),
(      '06',                 'Nguyen Van Hai',                  20,                      '0') 
;

INSERT INTO Subjects
(         sID,                sNAME)
VALUES
(         '1',               'TOAN'),
(         '2',               'ly'),
(         '3',               'hoa'),
(         '4',               'van'),
(         '5',               'anh')
;

INSERT INTO StudentSubject
(        RN,               sID,                  MARK,               DATEs)
VALUES
(       '01',              '1',                   9,            '2017-10-29'),
(       '01',              '2',                   8,            '2017-10-28'),
(       '02',              '1',                   9,            '2017-10-27'),
(       '03',              '1',                   6,            '2017-10-26'),
(       '04',              '5',                   5,            '2017-10-25'),
(       '05',              '1',                   4,            '2017-10-24'),
(       '06',              '2',                   3,            '2017-10-23'),
(       '06',              '3',                   2,            '2017-10-22')
;

-- QUESTIONS 2;
-- EX A: 
SELECT 
    S.sNAME
FROM
    Subjects s
        LEFT JOIN
    StudentSubject SS ON S.sID = SS.sID
WHERE
    SS.sID IS NULL;

-- EX B: 
SELECT 
    S.sID, s.sName, COUNT(SS.MARK)
FROM
    Subjects s
        JOIN
    StudentSubject ss ON s.sID = ss.sID
GROUP BY s.sID
HAVING COUNT(SS.MARK) >= 2
ORDER BY COUNT(SS.MARK);
    
    
    
-- QUESTIONS 3:
CREATE OR REPLACE VIEW Student_Info AS
    SELECT 
        Stu.RN,
        S.sID,
        Stu.Student_Name,
        Stu.age,
        stu.Gender,
        s.sName,
        ss.Dates
    FROM
        Student stu
            JOIN
        StudentSubject ss ON stu.RN = ss.RN
            JOIN
        Subjects S ON S.sID = ss.sID;

UPDATE Student_Info 
SET 
    Gender = 'male'
WHERE
    Gender = '1'
;
    
UPDATE Student_Info 
SET 
    Gender = 'Female'
WHERE
    Gender = '0'
;

UPDATE Student_Info 
SET 
    Gender = 'Unknown'
WHERE
    Gender = 'NULL'
;

SELECT 
    *
FROM
    Student_Info;


-- QUESTIONS 5:

DROP PROCEDURE IF EXISTS Delete_info;
DELIMITER $$
CREATE PROCEDURE Delete_info(p_Student_name char(30), p_mark tinyint)
BEGIN 
       DELETE FROM Student 
       WHERE Student_name = p_Student_name;
       DELETE FROM student ;
       
END $$
DELIMITER ; 
DELETE FROM student;
CALL Delete_info('*','0')  ;    

SELECT * FROM student;
SELECT * FROM studentsubject;


 

 

           
 
