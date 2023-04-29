//datbase creation
create database trai;
use trai;


//table creation
//create table abc
create table abc(
cname varchar(200),
num bigint(20),
address varchar(200),
city varchar(200),
state varchar(200),
pincode bigint(20),
IDProof varchar(200),
cstyp varchar(200),
status varchar(200),
SMS varchar(200),
Calls varchar(200),
Roaming varchar(200),
Internet varchar(200),
Hello_Tunes varchar(200)
);

//create table airtel
create table airtel(
cname varchar(200),
num bigint(20),
address varchar(200),
city varchar(200),
state varchar(200),
pincode bigint(20),
IDProof varchar(200),
cstyp varchar(200),
status varchar(200),
SMS varchar(200),
Calls varchar(200),
Roaming varchar(200),
Internet varchar(200),
Hello_Tunes varchar(200)
);

//create table bansal
create table bansal(
cname varchar(200),
num bigint(20),
address varchar(200),
city varchar(200),
state varchar(200),
pincode bigint(20),
IDProof varchar(200),
cstyp varchar(200),
status varchar(200),
SMS varchar(200),
Calls varchar(200),
Roaming varchar(200),
Internet varchar(200),
Hello_Tunes varchar(200)
);


//create table cmpny
create table cmpny(
cname varchar(300) NOT NULL,
pass varchar(200),
addrs varchar(200),
state varchar(200),
status varchar(200)
);

alter table cmpny add primary key(cname);

//create table package

create table package(
cname varchar(200),
pcktyp varchar(200),
pckname varchar(200) NOT NULL,
price int(11),
validity varchar(200),
des varchar(200)
);

alter table package add primary key(pckname);

//create table shifali
create table shifali(
cname varchar(200),
num bigint(20),
address varchar(200),
city varchar(200),
state varchar(200),
pincode bigint(20),
IDProof varchar(200),
cstyp varchar(200),
status varchar(200),
SMS varchar(200),
Calls varchar(200),
Roaming varchar(200),
Internet varchar(200),
Hello_Tunes varchar(200)
);
