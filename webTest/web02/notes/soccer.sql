-- M-x sql-mysql
-- M-x ssp ssb 
-- c-c s   list tables 
-- c-c c-c (sql-send-paragraph)
-- c-. 

CREATE DATABASE IF NOT EXISTS soccer;

CREATE DATABASE IF NOT EXISTS hibernate;

use soccer;

DROP DATABASE IF EXISTS hibernate;

SHOW DATABASES;

use mysql;


use hibernate

use test;

use mysql;

SHOW TABLES;

select user.Host from user;

SELECT * from user ;

SHOW CREATE table User;


use soccer ;

use soccer ;

CREATE TABLE IF NOT EXISTS objectIDs
(
table_name VARCHAR(30) ,
ID_number INTEGER  NOT NULL ,
PRIMARY KEY (table_name)
);

;;     (fiplr-find-root (expand-file-name "") fiplr-root-markers)

CREATE TABLE IF NOT EXISTS League
(
LID INTEGER,
year INTEGER NOT NULL,
season VARCHAR(10) NOT NULL,
title VARCHAR(30) NOT NULL,
PRIMARY KEY (LID)
);

ALTER TABLE League modify LID INTEGER auto_increment;

SHOW CREATE table League;

describe  League;


CREATE TABLE IF NOT EXISTS player
(
PID INTEGER,
name VARCHAR(30) NOT NULL,
address VARCHAR(30) NOT NULL,
city VARCHAR(30) NOT NULL,
province VARCHAR(30)   NOT NULL,
postal_code VARCHAR(20) NOT NULL,
PRIMARY KEY (PID)
);

ALTER TABLE player modify PID INTEGER auto_increment;

describe  player;

CREATE TABLE IF NOT EXISTS Registration
(
LID INTEGER NOT NULL,
PID INTEGER  NOT NULL,
division VARCHAR(20) NOT NULL,
PRIMARY KEY (LID,PID)
);

describe  Registration;

INSERT INTO objectIDs (table_name, ID_number)
VALUES ('League',  7);           

INSERT INTO objectIDs (table_name, ID_number)
VALUES ('player',  1);           

-- Create the initial set of leagues.

INSERT INTO League ( year, season, title)
  VALUES ( 2003, 'Spring', 'Soccer League (Spring ''03)');

INSERT INTO League ( year, season, title)
  VALUES ( 2003, 'Summer', 'Summer Soccer Fest 2003');

INSERT INTO League (LID, year, season, title)
  VALUES (3, 2003, 'Fall', 'Fall Soccer League (2003)');

INSERT INTO League (LID, year, season, title)
  VALUES (4, 2004, 'Spring', 'Soccer League (Spring ''04)');

INSERT INTO League (LID, year, season, title)
  VALUES (5, 2004, 'Summer', 'The Summer of Soccer Love 2004');

Insert Into League (LID, year, season, title)
  VALUES (6, 2004, 'Fall', 'Fall Soccer League (2004)');


SELECT * FROM League ;

SELECT *  FROM League ;

SELECT * FROM objectIDs;

SELECT * FROM player  ;

SELECT address, province, postal_code, PID, city, name
FROM player;





INSERT INTO player (name, address, city, province, postal_code)
VALUES ("ali", "jordan", "zarka" ,"what", "962");           

INSERT INTO player (name, address, city, province, postal_code)
VALUES ("ahmed", "jordan", "zarka" ,"what", "988");           

-- use c-c s

SHOW TABLES;



select * from player ;

show databases;

update player  set name='saad',  address='iraq', city='mosel', province='good', postal_code='889'  where PID=10;


SHOW CREATE TABLE league;


INSERT INTO league (year, season,title)
VALUES (1990,"winter","wow leage");           


INSERT INTO league (year, season,title)
VALUES (2001,"winter","wow leage 2");           



DELETE FROM league WHERE LID=7;

update  league set year=2000, season="summer", title="wow 2" where LID=8;

show tables;

select * from registration;


DESCRIBE registration;

select * from League;

select * from Registration;

select * from player;

select * from player where name='ahmed';

select * from player where name='ali';



SELECT  League  ,table_name2.columnName2
   FROM 
   WHERE ;



SHOW DATABASES;                            

CREATE DATABASE IF NOT EXISTS emp;

use emp;

CREATE TABLE IF NOT EXISTS employee
(
id INTEGER,
name VARCHAR(20) ,
salary  INTEGER,
PRIMARY KEY (id)
);

INSERT INTO employee (id,name,salary)
VALUES (1,"ahmad",99);

select * from employee;

ALTER TABLE employee  modify id  INTEGER auto_increment;

SHOW CREATE TABLE employee;


x
