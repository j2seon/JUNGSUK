create table member(
   id VARCHAR2(10) not null,
   pass VARCHAR2(10) not null,
   name VARCHAR2(30) not null,
   regidate date default sysdate not null,
   primary key (id)
);