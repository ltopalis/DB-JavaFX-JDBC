-- 3.1.4.3
DROP TRIGGER IF EXISTS reduceSalary;
DELIMITER $
CREATE TRIGGER reduceSalary BEFORE UPDATE ON worker
FOR EACH ROW 
BEGIN 
    DECLARE diff FLOAT(7,2);
    SET diff=0.0;
    SET diff=NEW.wrk_salary-OLD.wrk_salary;
    
    IF(diff<0)
    THEN 
       INSERT INTO branch(br_street) VALUES (NULL);
	END IF;
END $
DELIMITER ;

INSERT INTO worker VALUES('ΧΨ109234','Πόπη','Παπακαλιάτη',5000.32,15);
SELECT * FROM worker;
UPDATE worker
SET wrk_salary=4000.00
WHERE wrk_AT='ΧΨ109234';

UPDATE worker
SET wrk_salary=6000.00
WHERE wrk_AT='ΧΨ109234';
