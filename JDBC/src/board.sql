select * from emp;
select * from dept;
-- board(게시판) 테이블 / 번호, 제목, 내용, 작성자, 작성일, 조회수
create table board(
 num number not null,
 title varchar2(50) not null,
 content varchar2(2000) not null,
 writer varchar2(50) not null,
 indate date default sysdate,
 count number default 0,
 primary key(num)
);

create sequence board_num;

insert into board(num,title,content,writer) 
values(board_num.nextval,'게시판연습','게시판연습','관리자');

select * from board;

