create table member03(
   id VARCHAR2(10) not null,
   pass VARCHAR2(10) not null,
   name VARCHAR2(30) not null,
   regidate date default sysdate not null,
   grade VARCHAR2(50)not null, 
   primary key (id)
);



insert into member03(id,pass,name,grade)
VALUES('admin','1234','관리자','vip');
insert into member03(id,pass,name,grade)
VALUES('hong','1234','홍길동','sliver');
insert into member03(id,pass,name,grade)
VALUES('jjs','1234','주진선','gold');

select * from member03;