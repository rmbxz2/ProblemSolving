# localhost not work in postgresql
solution:-
https://confluence.atlassian.com/bitbucketserverkb/fatal-ident-authentication-failed-for-user-unable-to-connect-to-postgresql-779171564.html

postgres=# show hba_file ;
 hba_file
--------------------------------------
/var/lib/pgsql/data/pg_hba.conf

then edit the file by modify
local	all	all	trust
host	all	127.0.0.1/32	trust
then restart 
sudo systemctl restart postgresql
================================================================
use 127.0.0.1 instead of localhost

postgresql work apt port 5432
sudo netstat -plnt
sudo lsof -i -P

sudo ss -tupln

check apache 
sudo lsof -i tcp:8080


=========== work postgresql ========
work ==> dont enter localhost, keep it empty like this
psql -U ahmad -d emp -W  

M-x getenv ==> PGPASSFILE    ~/.pgpass
export  PGPASSFILE=/home/ahmad/.pgpass
sql-connection-alist = nil
(setq sql-postgres-options '("-P" "pager=off" "-W" ))   ;; -W means include password


~/.pgpass
*:*:*:ahmad:ahmadjar
chmod 600 ~/.pgpass

M-x sql-postgresql , use 127.0.0.1 instead of localhost
'(sql-product 'postgres)
M-x ssb (defalias 'ssb  'sql-set-sqli-buffer-generally) ==> reconnect this buffer to postgresql
M-x ssp (defalias 'ssp  'sql-set-product )  ==>> set product type 


M-x sql-save-connection ;; save it in .emacs , then use M-x sql-connect to call it 
M-x sql-connect 

# connect very fast by command 
M-x sql-connect 
(setq sql-connection-alist
      '((pgsql-emp (sql-product 'postgres)
                    (sql-port 5432)
                    (sql-server "")
                    (sql-user "ahmad")
                    (sql-password "ahmadjar")
                    (sql-database "emp"))
                (mysql-emp (sql-product 'mysql)
                   (sql-port 3306)
                   (sql-server "localhost")
                   (sql-user "ahmad")
                   (sql-password "ahmadjar")
                   (sql-database "emp"))))




# not work
(setq sql-connection-alist
      '((my-db (sql-product 'postgres)
               (sql-database "postgresql://ahmad:ahmadjar@localhost:5433/emp"))))
=========== work postgresql ========





M-x sql-postgres  
use 127.0.0.1 instead of localhost
M-x ssb
M-x ssp

[important ]note :- no need to write the name of sql database,it will show the current database 
sql-list-all-tables     c-c s  [list all tables in the database]

sql-list-table   .     [list columns of the table]

send pragraph    C-c C-c 

send buffer      C-c C-b
send string      C-c C-s
tab  =  c-i 
enter = c-m           c-j c-o 


================================

su   :- switch you to the root account 
sudo :- runs a single command with root privileges

systemctl status  postgresql
systemctl start   postgresql
systemctl stop    postgresql
psql -U ahmad -d emp -W 

# postgres
\l         ==> list databases ===> \l \list
\c emp    ==> switch database ==> \c   \connect
\dt         ==> list tables 
\d+         ==> list tables 
\d company ==> describe this table
\q ==>  how to quit in psql


# install psql in fedora 34
https://computingforgeeks.com/install-postgresql-13-on-fedora/
sudo dnf module reset postgresql -y
sudo dnf module enable postgresql:13
  #  install psql 
sudo dnf install postgresql-server postgresql
  # init psql
  [T] sudo  /usr/bin/postgresql-setup initdb
  [X] sudo  /usr/pgsql-13/bin/postgresql-13-setup initdb
  sudo systemctl enable --now postgresql
  systemctl status postgresql

# (optional) Enable remote Access to PostgreSQL (Optional)
   sudo firewall-cmd --add-service=postgresql --permanent
   sudo firewall-cmd --reload
   then edit file var/lib/pgsql/13/data/postgresql.conf and /var/lib/pgsql/11/data/pg_hba.conf
   look at this link https://computingforgeeks.com/install-postgresql-13-on-fedora/


# Step 5 – Set PostgreSQL admin user’s password
sudo su - postgres
psql -c "alter user postgres with password 'ahmadjar'"


# change ahmad password to empty
# not work
sudo su - postgres
psql -c "ALTER USER ahmad PASSWORD '';"


sudo -u postgres psql -c "ALTER USER postgres PASSWORD 'postgres';"

# connect to psql
note :- postgres is an admin user
systemctl start postgresql
sudo -u postgres psql


# where is postgresql 
root@zink:#  ps -w w  auxw |  grep postgres | grep -- -D
postgres    1543  0.0  0.3 210496 27180 ?        S    06:18   0:00 /usr/lib/postgresql/11/bin/postgres -D /var/lib/postgresql/11/main -c config_file=/etc/postgresql/11/main/postgresql.conf
in fedora
postgres    4163  0.0  0.3 424648 25840 ?        Ss   14:56   0:00 /usr/bin/postmaster -D /var/lib/pgsql/data


# change the password of user postgres
ALTER USER postgres PASSWORD 'ahmadjar';
ALTER USER ahmad PASSWORD 'ahmadjar';

# create user
   sudo -u postgres psql
   postgres=# create database emp;
   postgres=# create user ahmad with encrypted password 'ahmadjar';
   postgres=# grant all privileges on database emp to ahmad;
   or or or 
   create user ahmad;
     \password ahmad;
   or or or
   create user ahmad with login password 'ahmadjar;
   grant all privileges on database soso to ahmad;

# how to quit in psql
\q

# how to create database
  create database emp;

# connect by new user ahmad to db emp
psql -U ahmad -d emp   -W
psql -U ahmad -d emp -h 127.0.0.1 -W
psql -U ahmad -d emp -h localhost -W
psql -U ahmad    -W
psql -U postgres -W

#
\l         ==> list databases ===> \l \list
\c emp    ==> switch database ==> \c   \connect

\dt         ==> list tables 
\d+         ==> list tables 
\d company ==> describe this table





# create table
CREATE TABLE demo (
name varchar(25),
id serial,
start_date date);

# list tables

\dt


# create table and insert

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

INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY,JOIN_DATE) VALUES (4, 'Paul', 33, 'California', 20000.00,'2001-07-13');

SELECT *   FROM COMPANY;

SELECT COMPANY.  , COMPANY.id  FROM COMPANY;


postgres
postgres
ahmadjar




-- create db 
create database hr;

-- describe this table	
\d employees;  

-- all employees
SELECT * FROM employees;

-- all depts
SELECT * FROM departments;


-- delete 
xxxDELETE FROM employees  WHERE salary = 111;


-- update all 
UPDATE employees SET  departement_id =28  where id=34 ;
UPDATE employees SET  departement_id =28  where id=35 ;
UPDATE employees SET  departement_id =28  where id=36 ;
UPDATE employees SET  departement_id =29  where id=37 ;



-- all emp for dept id
SELECT * FROM employees, departments  WHERE  departments.id=employees.departement_id;




-- all emp by left join
-- select all left columns and (select  right columns if they  NULL )
SELECT * FROM employees left join  departments  on  employees.departement_id=departments.id;

-- all emp by right join
-- select all right columns and (select  left columns if they  NULL )
SELECT * FROM employees right join  departments  on  employees.departement_id=departments.id;

-- all emp by inner join
-- no null
SELECT * FROM employees inner join  departments  on  employees.departement_id=departments.id;

--
INSERT INTO employees(id, address ,last_name, salary, departement_id)
    VALUES (1,'USA', 'Nash', 111, 28);


-- 
INSERT INTO employees  VALUES (2,'USA',NULL ,'Nash', 111, 28);


-- all employees
SELECT * FROM employees;

--
SELECT  employees.id, address, first_name, last_name, salary, departement_id  FROM employees  WHERE  departement_id=28;

--
SELECT * FROM employees WHERE departement_id =28;

==== notes ============================

soccer league into web03 

use soccer ;
use soccer ;

CREATE TABLE IF NOT EXISTS objectIDs
(
table_name VARCHAR(30) ,
ID_number INTEGER  NOT NULL ,
PRIMARY KEY (table_name)
);


CREATE TABLE IF NOT EXISTS League
(
LID INTEGER,
year INTEGER NOT NULL,
season VARCHAR(10) NOT NULL,
title VARCHAR(30) NOT NULL,
PRIMARY KEY (LID)
);

