-- EXERCISE 1 :
-- QUESTION 1:
USE adventureworks;

SELECT 
    p.`name`
FROM
    PRODUCT P
WHERE
    P.ProductSubcategoryID IN (SELECT 
            PS.ProductSubcategoryID
        FROM
            ProductSubcategory PS
        WHERE
            `NAME` LIKE 'Bo%');
        
-- Questions 2:
SELECT 
    p.`name`
FROM
    Product P
WHERE
    P.ProductSubcategoryID IN (SELECT 
            PS.ProductSubcategoryID
        FROM
            ProductSubcategory PS
        WHERE
            PS.ProductSubcategoryID = 3)
        AND p.listprice IN (SELECT 
            MIN(P.LISTPRICE)
        FROM
            PRODUCT P
        WHERE
            p.ProductSubcategoryID = 3);


SELECT 
    p.`name`
FROM
    product p
WHERE
    p.ProductSubcategoryID = (SELECT 
            ps.ProductSubcategoryID
        FROM
            productsubcategory ps
        WHERE
            ps.`name` = 'Touring Bikes')
        AND p.listPrice IN (SELECT 
            MIN(p.listPrice)
        FROM
            product p
        WHERE
            p.ProductSubcategoryID = 3);
            
-- EXERCISES 2:
-- QUESTIONS 1+2:

SELECT 
    c.`Name`, p.`name`
FROM
    StateProvince P
        JOIN
    CountryRegion C ON c.CountryRegionCode = p.CountryRegionCode
WHERE
    C.`NAME` LIKE 'Canada%'
        OR C.`name` LIKE 'Germany'
;

-- Questions 3:
SELECT 
    o.SalesOrderID,
    o.OrderDAte,
    o.SalesPersonID,
    s.Bonus,
    s.SalesYTD
FROM
    SalesOrderHeader O
        JOIN
    SalesPerson S ON o.SalesPersonID = s.SalesPersonID;

-- Questions 4:
SELECT 
    o.SalesOrderID, o.OrderDAte, e.title, s.Bonus, s.SalesYTD
FROM
    SalesOrderHeader O
        JOIN
    SalesPerson S ON o.SalesPersonID = s.SalesPersonID
        JOIN
    Employee e ON e.employeeID = s.SalesPersonID;
