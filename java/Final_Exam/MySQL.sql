-- =============================================
-- Create database
-- =============================================

-- Drop the database if it already exists
DROP DATABASE IF EXISTS QuanLy;
-- Create database
CREATE DATABASE IF NOT EXISTS QuanLy;
USE QuanLy;

-- Drop the table if it already exists
DROP TABLE IF EXISTS 	Managers;
CREATE TABLE	Managers (
		ID  				SMALLINT AUTO_INCREMENT PRIMARY KEY,
		Email				CHAR(30) UNIQUE NOT NULL,
        Password 			NVARCHAR(50) NOT NULL,
        FirstName			NVARCHAR(50) NOT NULL,
        LastName			NVARCHAR(50) NOT NULL,
        Phone				VARCHAR(12) NOT NULL,
        ExpInYear           INTEGER
        );
        
DROP TABLE IF EXISTS 	Employees;
CREATE TABLE	Employees (
		ID  				SMALLINT AUTO_INCREMENT PRIMARY KEY,
		Email				CHAR(30) UNIQUE NOT NULL,
        Password 			NVARCHAR(50) NOT NULL,
        FirstName			NVARCHAR(50) NOT NULL,
        LastName			NVARCHAR(50) NOT NULL,
        Phone				VARCHAR(12) NOT NULL,
        ProsKills           VARCHAR(30) NOT NULL,
        ProjectName         ENUM('Testing System' , 'CRM' , 'TimeSheet')
        
        );
 INSERT INTO Managers  (Email,						  `Password`,	 	 FirstName,					LastName,		       Phone	,  ExpInYear )     
 VALUES          ('huy.lequangkks@vti.com.vn',	   'Huydz',		            'Lê',			        'Quang Huy',	  '0966621846',        2 ),
                ('hung.lequangkks@vti.com.vn',	   'Hungdz',		        'Lê',			        'Quang Hung',	  '0866621846',        4 );
                
                
INSERT INTO Employees  (Email,						  `Password`,	 	 FirstName,					LastName,		       Phone	,    proSkills,    projectName )     
 VALUES          ('le.vanduongkks@vti.com.vn',	   'duong112',		        'Lê',			        'Van Duong',	  '0966621846',       'Java',      'CRM'),
                ('tran.tuananhkks@vti.com.vn',	   'anh111',		        'Tran',			        'Tuan Anh',	  '0866621846',        'C++',           'TimeSheet')         
			;
            
          select * from managers;  
          select * from employees;
                
      