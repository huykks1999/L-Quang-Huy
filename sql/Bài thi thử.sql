DROP DATABASE IF EXISTS CUSTOMER;
CREATE DATABASE IF NOT EXISTS CUSTOMER;
USE Customer;
DROP TABLE IF EXISTS Customer, Car_order , car;
CREATE TABLE CUSTOMER(
Customer_ID            INT AUTO_INCREMENT PRIMARY KEY,
Cus_Name              VARCHAR(30)     NOT NULL,
Phone                 CHAR(10)        NOT NULL,
Email                 VARCHAR(30)     NOT NULL,
Address               VARCHAR(50)     NOT NULL,
Note                  VARCHAR(100)    NOT NULL
);

CREATE TABLE CAR(
Car_ID               CHAR(15) PRIMARY KEY                  NOT NULL,
Maker                ENUM('HONDA', 'TOYOTA', 'NISSAN')     NOT NULL,
Model                CHAR(30)                              NOT NULL,
Car_Year             YEAR                                  NOT NULL,
Color                VARCHAR(10)                           NOT NULL,
Note                 VARCHAR(100)                          NOT NULL
)
;
CREATE TABLE CAR_ORDER(
Order_ID             INT AUTO_INCREMENT PRIMARY KEY    ,
Customer_ID          int              NOT NULL,
Car_ID               CHAR(15)         NOT NULL,
Amount               TINYINT DEFAULT       1            ,
SalePrice            INT              NOT NULL,
OrderDate            DATE             NOT NULL,
DeliveryDate         DATE             NOT NULL,
DeliveryAddress      VARCHAR(100)     NOT NULL,
Staus                ENUM('0','1','2')NOT NULL,
Note                 VARCHAR(100),
FOREIGN KEY   (Customer_ID) REFERENCES   Customer(Customer_ID) ON DELETE CASCADE,
FOREIGN KEY   (Car_ID) REFERENCES   Car(CAR_ID) ON DELETE CASCADE
 
);             

INSERT INTO CUSTOMER
(          Cus_Name,                Phone,                Email,                          Address,                  Note)
VALUES      
(       'Le Quang Huy',         '0393588160',       'lequanghuy@gmail.com '     ,       'So 1 linh nam',        'asasasasasassasa'),
(       'Nguyen Quang Hung',    '0383588160',       'nguyenquanghung@gmail.com',        'So 2 linh nam',        'dfdfdffdfdfdfdfd'),
(       'Tran Manh Cuong',      '0473588160',       'Tranmanhcuong@gmail.com'  ,        'So 3 linh nam',        'dffdfdfdfdfdfddf'),
(       'Nguyen Huy Hoang',     '0743588160',       'nguyenhuyhoang@gmail.com' ,        'So 4 linh nam',        'dfdfdffddfdfdffd'),
(       'Tran Thu Hien',        '0583588160',       'tranthuhien@gmail.com'    ,        'So 5 linh nam',        'fdfddffddffdfdfd'),
(       'Le Tien Bang',         '0953688160',       'letienbang@gmail.com'     ,        'So 6 linh nam',        'dffddfdffddffdfd'),
(       'Tran Bich Ngoc',       '0973588160',       'tranbichngic@gmail.com'   ,        'So 7 linh nam',        'fddfdfdfdfdffddf'),
(       'Tran Thu Thao',        '0103588160',       'tranthuthao@gmail.com'    ,        'So 8 linh nam',        'DSSDXVCVCVCVVCVC'),
(       'Le Van Duong',         '1234567654',       'levanduong@gmail.com'     ,        'So 9 linh nam',        'dbbbgbggbbgbgbgb'),
(       'Tran Trung Anh',       '0113588160',       'trantrunganh@gmail.com'   ,        'So 10 linh nam',       'bgbgbrrffeefefee')
;

INSERT INTO CAR
(Car_ID  ,             Maker,              Model,               Car_Year,                  Color,                 Note)
VALUES
( '01',              'HONDA',            'HONDA1G',              '1990',                  'BLACK',           'ASDADASASDADS'),
( '02',              'TOYOTA',           'TOYOTA12',             '1991',                  'YELLOW',          'FFDFDDFFDFDFD'),
( '03',              'NISSAN',           'NISSANT1',             '1992',                  'RED',             'KOKOKOKOKOOKK'),
( '04',              'HONDA',            'HONDAG6',              '1993',                  'BROWN',           'MMNNCNNCNCNCC'),
( '05',              'TOYOTA',           'TOYOTAG7',             '1994',                  'PURPLE',          'AWWAWAWAWAWAA'),
( '06',              'NISSAN',           'NISSANG8',             '1995',                  'BLACK',           'QWQWQWQQWQWQW'),
( '07',              'HONDA',            'HONDAM10',             '1996',                  'YELLOW',          'VCVCVCVCVCVVC'),
( '08',              'TOYOTA',           'TOYOTAM95',            '1997',                  'RED',             'AXAXAXAXAXAXA'),
( '09',              'NISSAN',           'NISSANG97',            '1998',                  'BROWN',           'BVBVBVBVBVBDD'),
( '10',              'HONDA',            'HONDAT150',            '1999',                  'PURPLE',          'AAAAAQQAQAQAQ')
;

INSERT INTO CAR_ORDER
(
   Customer_ID ,     Car_ID,      SalePrice,      OrderDate,      DeliveryDate,     DeliveryAddress,       Staus  ,       Note     ) 
   VALUES
      (1,             '01',          10000000,      '2019-01-01',   '2019-02-01',      'So 1 linh nam',        '0',        'DSDDSSDSD'),
      (2,             '02',          20000000,      '2019-02-02',   '2019-03-02',      'So 2 linh nam',        '1',        'VCXVCXCXV'),
      (3,             '04',          40000000,      '2019-03-03',   '2019-04-03',      'So 3 linh nam',        '2',        'AASAASASA'),
      (4,             '07',          70000000,      '2019-04-04',   '2019-05-04',      'So 4 linh nam',        '0',        'QQWWQQWQQ'),
      (1,             '10',          100000000,     '2019-05-05',   '2019-06-05',      'So 5 linh nam',        '1',        'OIIOIOIII'),
      (2,             '09',          90000000,      '2019-06-06',   '2019-07-06',      'So 6 linh nam',        '2',        'DSDDSSDSD'),
      (3,             '08',          80000000,      '2019-07-07',   '2019-08-07',      'So 7 linh nam',        '0',        'VCXVCXCXV'),
      (5,             '07',          70000000,      '2019-08-08',   '2019-09-08',      'So 8 linh nam',        '1',        'AASAASASA'),
      (6,             '06',          60000000,      '2019-09-09',   '2019-10-09',      'So 9 linh nam',        '2',        'QQWWQQWQQ'),
      (7,             '05',          50000000,      '2019-10-10',   '2019-11-10',      'So 10 linh nam',       '1',        'OIIOIOIII')
      ;
      
-- QUESTIONS 2:
SELECT C.Cus_name, Count(CO.Car_ID) 
FROM
Customer C
JOIN
Car_Order CO ON C.Customer_ID = CO.Customer_ID 
GROUP BY CO.Customer_id
ORDER BY COUNT(CO.Car_ID);

-- QUESTIONS 3:
CREATE VIEW TIM  AS SELECT Ca.Maker, COUNT(CO.Car_ID) AS So_Luong_DA_BAN
FROM
CAR Catim
JOIN
CAR_ORDER CO ON Ca.Car_ID = CO.Car_ID 
GROUP BY Maker
HAVING So_luong = MAX(So_luong)
;
SELECT MAKER, MAX(SO_LUONG_DA_BAN) AS so_luong FROM tim;
