DROP TRIGGER IF EXISTS not_accept_changes;
DROP TRIGGER IF EXISTS reduceSalary;

-- 3.1.4.2
DELIMITER $$
CREATE TRIGGER not_accept_changes
BEFORE UPDATE ON trip
FOR EACH ROW
BEGIN
    DECLARE reservations INT;

    SELECT COUNT(res.res_tr_id)
    INTO reservations
    FROM trip t LEFT JOIN reservation res 
	    ON t.tr_id = res.res_tr_id
    WHERE t.tr_id = OLD.tr_id;

    IF reservations <> 0
    THEN
        SET NEW.tr_departure = OLD.tr_departure,
            NEW.tr_return = OLD.tr_return,
            NEW.tr_cost = OLD.tr_cost;
    END IF;
END$$
DELIMITER ;
/*
SELECT tr_cost 
FROM travel_agency.reservation res JOIN trip t 
	ON res.res_tr_id = t.tr_id
WHERE res_tr_id = 22; # 7

UPDATE trip SET tr_cost = 1;

SELECT tr_cost 
FROM travel_agency.reservation res RIGHT JOIN trip t 
	ON res.res_tr_id = t.tr_id
WHERE tr_id = 22; # 7
*/
-- 3.1.4.3
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
/*
INSERT INTO worker VALUES('ΧΨ109234','Πόπη','Παπακαλιάτη',5000.32,15);
SELECT * FROM worker;
UPDATE worker
SET wrk_salary=4000.00
WHERE wrk_AT='ΧΨ109234';

UPDATE worker
SET wrk_salary=6000.00
WHERE wrk_AT='ΧΨ109234';
*/