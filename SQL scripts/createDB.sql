CREATE DATABASE IF NOT EXISTS travel_agency 
    CHARSET utf8mb4 COLLATE utf8mb4_0900_ai_ci;

USE travel_agency ;

CREATE TABLE IF NOT EXISTS branch (
    br_code   INT(8)      PRIMARY KEY AUTO_INCREMENT NOT NULL, 
    br_street VARCHAR(8)  NOT NULL,
    br_num    INT(4)      NOT NULL,
    br_city   VARCHAR(30) NOT NULL
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS phones (
    ph_br_code INT(11)  NOT NULL,
    ph_number  CHAR(10) NOT NULL,
    
    CONSTRAINT phonesPK PRIMARY KEY (ph_br_code, ph_number),
    CONSTRAINT ph_fk_br FOREIGN KEY (ph_br_code)
        REFERENCES branch(br_code) 
        ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS worker (
    wrk_AT      CHAR(10)    NOT NULL PRIMARY KEY,
    wrk_name    VARCHAR(20) NOT NULL,
    WRK_lname   VARCHAR(20) NOT NULL,
    wrk_salary  FLOAT(7,2)  NOT NULL,
    wrk_br_code INT(11)     NOT NULL,
    
    CONSTRAINT wrk_fk_br FOREIGN KEY (wrk_br_code)
        REFERENCES branch(br_code) 
        ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS driver (
    drv_AT         CHAR(10)                 NOT NULL PRIMARY KEY,
    drv_license    ENUM('A', 'B', 'C', 'D') NOT NULL,
    drv_route      ENUM('LOCAL', 'ABROAD')  NOT NULL,
    drv_experience TINYINT(4)               NOT NULL,

    CONSTRAINT drv_fk_wrk FOREIGN KEY (drv_AT)
        REFERENCES worker(wrk_AT)
        ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS guide (
    gui_AT CHAR(10) NOT NULL,
    gui_cv TEXT     NOT NULL,

    CONSTRAINT gui_fk_wrk FOREIGN KEY (gui_AT)
        REFERENCES worker(wrk_AT)
        ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS admin (
    adm_AT      CHAR(10)                                          NOT NULL PRIMARY KEY,
    adm_type    ENUM('LOGISTICS', 'ADMINISTRATIVE', 'ACCOUNTING') NOT NULL,
    adm_diploma VARCHAR(200)                                      NOT NULL,

    CONSTRAINT adm_fk_wrk FOREIGN KEY (adm_AT)
        REFERENCES worker(wrk_AT)
        ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS manages (
    mng_adm_AT CHAR(10) NOT NULL,
    mng_br_code INT(11) NOT NULL,

    CONSTRAINT mng_pk PRIMARY KEY (mng_adm_AT, mng_br_code),
    CONSTRAINT mng_fk_adm FOREIGN KEY (mng_adm_AT) REFERENCES admin(adm_AT) ON DELETE CASCADE ON UPDATE CASCADE,
    CONSTRAINT mng_fk_br FOREIGN KEY (mng_br_code) REFERENCES branch(br_code) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB;