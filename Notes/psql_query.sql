/*

emacs 
m-x sql-mysql
user:- root
pass:- ahmadjar
data:- test
server:- 127.0.0.1
port	= 3306

then open hi.sql 
M-x sql-set-product Mysql
M-x sql-set-sqli-buffer-generally *SQL*

;; important note
;; always when open new file.sql 
M-x ssp 
M-x ssb

M-x sql-save-connection ;; save it in .emacs as alist
M-x sql-connect         ;; connect to old  connections which saved as list in .emacs


[important ]note :- no need to write the name of sql database,it will show the current database 
sql-list-all-tables     c-c s  [list all tables in the database]

sql-list-table   .     [list columns of the table]

send pragraph    C-c C-c 

send buffer      C-c C-b
send string      C-c C-s
tab  =  c-i 
enter = c-m           c-j c-o 

mysql -u root -pahmadjar

;; emacs mysql to fix error [[ No prompt found or ‘comint-prompt-regexp’ not set properly ]]
put this in .emacs
(sql-set-product-feature 'mysql :prompt-regexp "^\\(MariaDB\\|MySQL\\) \\[[_a-zA-Z]*\\]> ")





\l         ==> list databases ===> \l \list
\c emp    ==> switch database ==> \c   \connect
\dt         ==> list tables 
\d+         ==> list tables 
\d company ==> describe this table
\q ==>  how to quit in psql

*/


--  create table
CREATE TABLE demo (
name varchar(25),
id serial,
start_date date);


--  list tables
\dt


--  create table and insert

CREATE TABLE COMPANY(
   ID INT PRIMARY KEY     NOT NULL,
   NAME           TEXT    NOT NULL,
   AGE            INT     NOT NULL,
   ADDRESS        CHAR(50),
   SALARY         REAL,
   JOIN_DATE	  DATE
);


INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY,JOIN_DATE) VALUES (1, 'Paul', 32, 'California', 20000.00,'2001-07-13');
INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY,JOIN_DATE) VALUES (2, 'Paul', 32, 'California', 20000.00,'2001-07-13');
INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY,JOIN_DATE) VALUES (3, 'Paul', 32, 'California', 20000.00,'2001-07-13');

INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY,JOIN_DATE) VALUES (4, 'Paul', 33, 'xCalifornia', 20000.00,'2001-07-13');

SELECT *   FROM COMPANY;

SELECT COMPANY.  , COMPANY.id  FROM COMPANY;

sql-postgres-options

(custom-set-variables
        '(sql-postgres-options (quote ("-p" "pager=off" ))))



