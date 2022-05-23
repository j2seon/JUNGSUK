create table T_member(
    id VARCHAR2(10) PRIMARY key,
    pwd VARCHAR2(10) NOT NULL ,
    name VARCHAR2(50) NOT NULL,
    email VARCHAR2(100) NULL,
    joinDate date default sysdate
);
select * from T_member;