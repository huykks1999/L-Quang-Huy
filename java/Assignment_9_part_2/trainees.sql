DROP DATABASE IF EXISTS Trainees;
CREATE DATABASE IF NOT EXISTS Trainees;
USE TRAINEES;

DROP TABLE IF EXISTS Information ;


CREATE TABLE Information (
    id INT AUTO_INCREMENT NOT NULL,
    Account VARCHAR(30) NOT NULL,
    first_name VARCHAR(30) NOT NULL,
    last_name VARCHAR(30) NOT NULL,
    email VARCHAR(30) NOT NULL,
    PRIMARY KEY (id , Account)
);

INSERT INTO Information
(         Account,                  first_name,                 last_name,                   email)
VALUES
(         'vl01',                     'Le',                    'Quang Huy',          'huylequangkks@gmail.com'),
(         'vl02',                     'Tran',                  'Manh Cuong',         'tranmanhcuong@gmail.com'),
(         'vl03',                     'Cao',                   'Tuan Anh',           'caotuananh@gmail.com'   ),
(         'vl04',                     'Le',                    'Huong Giang',        'lehuonggiang@gmail.com' ),
(         'vl05',                     'Nguyen',                'Van Toan',           'nguyenvantoan@gmail.com'),
(         'vl06',                     'Bui',                   'Ba Huy',             'buibahuy@gmail.com'     ),
(         'vl07',                     'Nguyen',                'Thi Thuy',           'nguyenthithuy@gmail.com'),
(         'vl08',                     'Tran',                  'Duc Viet',           'tranducviet@gmail.com'  ),
(         'vl09',                     'Tong',                  'Khanh Linh',         'tongkhanhlinh@gmail.com'),
(         'vl10',                     'Cao',                   'Bich Ngoc',          'caobichngoc@gmail.com'  )
;

SELECT * FROM Information;
/* update Information set Account = 't100' Where account = 'vl01';
