drop table member;

create table member (
    id VARCHAR2(100) not null PRIMARY key,
    pass VARCHAR2(100),
    name VARCHAR2(100)
);

insert into member Values('2','1234','김똘');

commit;

select *from member;

