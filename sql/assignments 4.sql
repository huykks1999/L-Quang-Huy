DROP DATABASE IF EXISTS Employees_tren_lop;
CREATE DATABASE IF NOT EXISTS Employees_tren_lop;
USE Employees_tren_lop;
DROP TABLE IF EXISTS Departments,
                     Employee_Table,
                     Employee_Skill_table;
                     
CREATE TABLE Departments (
    Department_Number SMALLINT AUTO_INCREMENT PRIMARY KEY,
    Department_Name VARCHAR(30)
);

CREATE TABLE Employee_Table (
    Employee_Number SMALLINT AUTO_INCREMENT PRIMARY KEY,
    Employee_Name VARCHAR(30),
    Department_Number SMALLINT,
    FOREIGN KEY (Department_Number)
        REFERENCES Departments (Department_Number)
);

CREATE TABLE Employee_Skill_Table (
    Employee_Number SMALLINT,
    Skill_Code VARCHAR(10),
    Data_Register DATE,
    FOREIGN KEY (Employee_Number)
        REFERENCES Employee_Table (Employee_Number),
    PRIMARY KEY (Employee_Number , Skill_Code)
); 

INSERT INTO Departments(
          Department_Name
          ) VALUES
(           'Phong A'),
(           'Phong B'),
(           'Phong C'),
(           'Phong D'),
(           'Phong E'),
(           'Phong F'),
(           'Phong G'),
(           'Phong H'),
(           'Phong I'),
(           'Phong K');

INSERT INTO Employee_Table(
       Employee_name,            Department_Number
       ) VALUES
(     'Le Quang Huy',                   1            ),
(     'Nguyen Tuan Hung',               2            ),
(     'Nguyen Bao Lan',                 1            ),
(     'Nguyen Do Khai',                 1            ),
(     'Nguyen Van Manh',                1            ),
(     'Tran Duc Tien',                  4            ),
(     'Le The Phong',                   8            ),
(     'Nguyen Quang Khai',              9            ),
(     'Nguyen Bao Chau',                10           ),
(     'Le Thuy Linh',                   9           ),
(     'Le Van Long',                    6            ),
(     'Le Thanh Huyen',                 7            );

INSERT INTO Employee_Skill_Table(
	  Employee_Number,              Skill_Code,               Data_Register
      )VALUES
(          1,                         'Java',                 '2016-12-12'),
(          1,                         'C#',                   '2017-11-11'),
(          1,                         'PHP',                  '2015-10-10'),
(          2,                         'Java',                 '2018-01-01'),
(          2,                         'C++',                  '2013-03-11'),
(          3,                         'Java',                 '2016-04-15'),
(          4,                         'JS',                   '2017-08-08'),
(          5,                         'PYTHON',               '2018-09-09'),
(          6,                         'SQL',                  '2015-06-28'),
(          7,                         'SQL',                  '2011-09-15');


-- Questions 3:
SELECT 
    E.employee_number, e.employee_name, ES.Skill_code
FROM
    Employee_Table e
JOIN
    Employee_Skill_Table es ON e.Employee_number = es.employee_number
WHERE
    Skill_code = 'Java';
 
 -- Questions 4:
SELECT 
    d.Department_name, COUNT(employee_name) AS 'So nhan vien'
FROM
    Departments D
JOIN
    Employee_Table E ON e.Department_number = d.Department_number
GROUP BY e.Department_number
HAVING COUNT(employee_name) > 3;

-- Questions 5:
SELECT d.Department_name, GROUP_CONCAT(employee_name separator ', ') AS 'Nhan vien'
FROM 
Departments d
JOIN 
Employee_Table e ON e.department_number = d.department_number
GROUP BY D.department_number;

-- QUESTIONS 6: DS nhan vien nhieu hon 1 skill us distinct:
SELECT E.Employee_name, count(skill_code) AS Number_of_skill, GROUP_CONCAT(Skill_code) AS Skill
FROM
Employee_Table E 
JOIN
Employee_Skill_Table ek ON e.Employee_number=ek.employee_number
GROUP BY ek.employee_number
HAVING Number_of_skill > 1;


       
