-- 3.1.3.1
DROP PROCEDURE IF EXISTS addNewDriver;
DELIMITER $
CREATE PROCEDURE addNewDriver(IN AT CHAR(10) , IN name VARCHAR(20), IN lastname VARCHAR(20),IN salary FLOAT(7,2), IN drv_license ENUM('A', 'B', 'C', 'D'), IN drv_route ENUM('LOCAL', 'ABROAD'), IN drv_experience TINYINT(4))     
BEGIN   
    DECLARE min INT;
    DECLARE branch INT(11);
    SET min=0;
    
    SELECT COUNT(wrk_AT) INTO min 
    FROM worker
    INNER JOIN branch on worker.wrk_br_code=branch.br_code
    INNER JOIN driver on worker.wrk_AT=driver.drv_AT
    GROUP BY worker.wrk_br_code
    ORDER BY count(wrk_AT) ASC
    LIMIT 0,1;
    
	SELECT br_code INTO branch
    FROM worker
    INNER JOIN branch on worker.wrk_br_code=branch.br_code
    INNER JOIN driver on worker.wrk_AT=driver.drv_AT
    GROUP BY worker.wrk_br_code
    ORDER BY min ASC
    LIMIT 0,1;
    
    INSERT INTO worker 
    VALUES(AT, name, lastname, salary, branch);
    
     INSERT INTO driver
     VALUES( AT, drv_license, drv_route, drv_experience);
END$
DELIMITER ;
CALL addNewDriver('ΛΖ103412','Αλέκα','Λάλη',4582.78,'D','LOCAL',6);    
SELECT * FROM worker;
SELECT * FROM driver;    

-- 3.1.3.3
DROP PROCEDURE IF EXISTS deleteWorker;
DELIMITER $
CREATE PROCEDURE deleteWorker(IN name VARCHAR(20), IN lastname VARCHAR(20))
BEGIN 
    DECLARE AT CHAR(10);
    DECLARE type ENUM('LOGISTICS', 'ADMINISTRATIVE', 'ACCOUNTING');
    
    SELECT wrk_AT INTO AT 
    FROM worker
    WHERE wrk_name=name AND WRK_lname=lastname; 
    
    SELECT adm_type INTO type
    FROM admin
    WHERE AT=adm_AT;
    
    IF(type='ADMINISTRATIVE')
	THEN
       SELECT 'THIS WORKER IS AN ADMINISTRATIVE AND CAN NOT BE DELETED'as warning;
    ELSE DELETE FROM admin WHERE AT=adm_AT;
		 DELETE FROM worker WHERE AT=wrk_AT;
	END IF;
END$
DELIMITER ;

SELECT * FROM admin;
SELECT * FROM worker;
CALL deleteWorker('Μήτσος','Παυλάτος');
CALL deleteWorker('Μανωλία','Μπούρνοβα');
