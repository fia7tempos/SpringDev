
/* Drop Tables */

DROP TABLE tb_emp CASCADE CONSTRAINTS;
DROP TABLE tb_dept CASCADE CONSTRAINTS;



/* Drop Sequences */

DROP SEQUENCE seq_dept;
DROP SEQUENCE seq_emp;




/* Create Sequences */

CREATE SEQUENCE seq_dept INCREMENT BY 10 START WITH 10;
CREATE SEQUENCE seq_emp;



/* Create Tables */

CREATE TABLE tb_dept
(
	deptno number NOT NULL,
	dname varchar2(20) NOT NULL,
	PRIMARY KEY (deptno)
);


CREATE TABLE tb_emp
(
	empno number NOT NULL,
	ename varchar2(20) NOT NULL,
	sal number DEFAULT 0 NOT NULL,
	deptno number NOT NULL,
	PRIMARY KEY (empno)
);



/* Create Foreign Keys */

ALTER TABLE tb_emp
	ADD FOREIGN KEY (deptno)
	REFERENCES tb_dept (deptno)
;

insert into TB_DEPT(deptno, dname)
values(seq_dept.nextval,'운영부');
insert into TB_DEPT(deptno, dname)
values(seq_dept.nextval,'영업부');
insert into TB_DEPT(deptno, dname)
values(seq_dept.nextval,'개발부');

select * from TB_DEPT;

insert into tb_emp(empno,ename,sal,deptno)
values(seq_emp.nextval,'신해철',7000000,10);
insert into tb_emp(empno,ename,sal,deptno)
values(seq_emp.nextval,'서태지',6000000,20);
insert into tb_emp(empno,ename,sal,deptno)
values(seq_emp.nextval,'양현석',5000000,30);
insert into tb_emp(empno,ename,sal,deptno)
values(seq_emp.nextval,'최유댕',10000000,20);
insert into tb_emp(empno,ename,sal,deptno)
values(seq_emp.nextval,'전소미',5500000,30);

update tb_emp set ename='김도연'
where empno=3;

select * from TB_EMP;

select e.empno,e.ename,e.sal,d.dname
from tb_emp e join tb_dept d 
on e.deptno = d.deptno
order by e.empno asc;

select sum(sal) as total
from TB_EMP;




order by empno asc;