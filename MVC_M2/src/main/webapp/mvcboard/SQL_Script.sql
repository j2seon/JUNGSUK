create table mvcboard(
    idx number PRIMARY key,
    name VARCHAR2(50) not null,
    title VARCHAR2(200) not null,
    content  VARCHAR2(2000) not null,
    postdate date DEFAULT sysdate not null,
    ofile VARCHAR2(200),
    sfile VARCHAR2(50),
    downcount number(5) DEFAULT 0 not null,
    pass VARCHAR2(50) not null,
    vistitcount number DEFAULT 0 not null
);

drop table mvcboard;

create sequence seq_board_num
    increment by 1
    START with 1
    nocache;
    
    

-- 더미 데이터 입력(5정도 값입력)

insert into mvcboard(idx,name, title, content, pass)
values (seq_board_num.nextval,'장보고','자료실 제목 2','내용2','1234');
insert into mvcboard(idx,name, title, content, pass)
values (seq_board_num.nextval,'장','자료실 제목 3','내용3','1234');
insert into mvcboard(idx,name, title, content, pass)
values (seq_board_num.nextval,'장보','자료실 제목 4','내용4','1234');
insert into mvcboard(idx,name, title, content, pass)
values (seq_board_num.nextval,'장보고','자료실 제목 5','내용5','1234');

select * from mvcboard;
commit;