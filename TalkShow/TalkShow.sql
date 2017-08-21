create table Topic_xbbnhhw (tname varchar(20));
select * from Topic_xbbnhhw;
drop table Topic_xbbnhhw;
create table TOPIC_XBBNHHW(TOPIC_ID int NOT NULL generated always as IDENTITY(START WITH 1,INCREMENT BY 1),TOPIC_DESC varchar(150) CONSTRAINT primary_key PRIMARY KEY (TOPIC_ID));

create table TOPIC_XBBNHHW (TOPIC_ID int NOT NULL generated always as IDENTITY(START WITH 1,INCREMENT BY 1),TOPIC_DESC varchar(150) CONSTRAINT primary_key PRIMARY KEY (TOPIC_ID));
create table TOPIC_XBBNHHW (TOPIC_ID int NOT NULL generated always as IDENTITY(START WITH 1,INCREMENT BY 1),TOPIC_DESC varchar(150));

create table COMMENT_XBBNHHW(COMMENT_ID int NOT NULL generated always as IDENTITY(START WITH 1,INCREMENT BY 1),COMMENT_DESC varchar(150),COMMENT_DATE date,TOPIC_ID int);
select * from COMMENT_xbbnhhw;

delete from TOPIC_XBBNHHW where TOPIC_DESC='Games';