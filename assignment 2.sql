DROP DATABASE IF EXISTS fresher;
CREATE DATABASE IF NOT EXISTS fresher;
USE FRESHER;
-- Questions 1:
DROP DATABASE IF EXISTS trainee;
CREATE TABLE IF NOT EXISTS trainee (
    Trainee_id SMALLINT AUTO_INCREMENT PRIMARY KEY,
    Full_name VARCHAR(30) NOT NULL,
    Birth_date DATE NOT NULL,
    Gender ENUM('male', 'female', 'unknown') NOT NULL,
    ET_IQ TINYINT NOT NULL,
    ET_Gmath TINYINT NOT NULL,
    ET_English TINYINT NOT NULL,
    Training_Class CHAR(4) NOT NULL,
    Evaluation_Notes TEXT
);
-- Questions 2:
ALTER TABLE Trainee
ADD VTI_Account CHAR(30) UNIQUE NOT NULL;

-- ASSIGNMENT 3:
-- Questions 1:
INSERT INTO Trainee
(
     Full_name,            Birth_Date,      Gender,    ET_IQ,    ET_Gmath,     ET_English,     Training_Class,     Evaluation_Notes
     )VALUES
	('Le Quang Huy',      '1999-10-29',     'Male',     10,         12,             20,               'A1',              'asas'),
	('Nguyen Tuan Hung',  '1998-12-12',     'Female',   15,         11,             22,               '2',               'asas'),
	('Le Thanh Hai',      '1999-10-10',     'Male',     10,         10,             22,               '2',               'asas'),
	('Nguyen Thi Hong',   '1999-09-07',     'Unknown',  2,          12,             22,               '2',               'asas'),
	('Truong Quang Ngoc', '1990-04-14',     'Male',     7,          1,              22,               '1',               'asas'),
	('Truong Quang Nam',  '1997-04-27',     'Female',   20,         12,             22,               '7',               'asas'),
	('Nguyen Van Duong',  '1991-09-18',     'Unknown',  1,          3,              22,               '9',               'asas'),
	('Pham Van Hieu',     '1999-12-15',     'Male',     8,          4,              22,               '10',              'asas'),
	('Pham Minh Hien',    '1989-05-04',     'Female',   9,          15,             22,               '11',              'asas'),
	('Le Van Nam',        '1999-05-15',     'Male',     10,         17,             22,               '12',              'asas');
-- QUESTIONS 2: Nhóm tên các thực tập sinh đã vượt qua bài test đầu vào theo tháng sinh:
SELECT 
    MONTH(Birth_date) AS Tháng, GROUP_CONCAT(fULL_NAME separator', ') AS 'Thực tập sinh', COUNT(MONTH(BIRTH_DATE))
FROM
    TRAINEE
GROUP BY MONTH(Birth_date);

-- Q2;
SELECT 
    MONTH(Birth_date) AS THÁNG, Full_name
FROM
    Trainee
ORDER BY MONTH(Birth_date);

-- Questions 3: Lay thong tin thuc tap sinh co ten dai nhat:
SELECT 
    *,
    (2019 - YEAR(Birth_date)) AS 'Tuổi',
    (SELECT 
            MAX(LENGTH(Full_name))
        FROM
            trainee) AS 'Độ dài tên'
FROM
    Trainee
WHERE
    LENGTH(Full_name) = (SELECT 
            MAX(LENGTH(Full_name))
        FROM
            trainee);

-- QUESTIONS 4: lấy thông tin người đã vượt qua bài test đầu vào:

SELECT 
    *
FROM
    trainee
WHERE
    (ET_IQ + ET_GMATH) > 20 AND ET_IQ >= 8
        AND ET_GMATH >= 8
        AND ET_ENGLISH >= 18;

-- QUESTIONS 5: XÓA THỰC TẬP SINH CÓ Trainee_id =3;
DELETE FROM TRAINEE 
WHERE
    Trainee_id = 3;

-- QUESTIONS 6:
UPDATE Trainee 
SET 
    Training_class = '2'
WHERE
    Trainee_id = 5;
 
  