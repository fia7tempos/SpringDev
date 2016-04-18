
/* Drop Tables */

DROP TABLE TB_MEMO CASCADE CONSTRAINTS;



/* Drop Sequences */

DROP SEQUENCE seq_memo;




/* Create Sequences */

CREATE SEQUENCE seq_memo;



/* Create Tables */

CREATE TABLE TB_MEMO
(
	no number NOT NULL,
	title varchar2(100 char) NOT NULL,
	name varchar2(20) NOT NULL,
	pwd varchar2(128) NOT NULL,
	email varchar2(50) NOT NULL,
	content varchar2(4000) NOT NULL,
	regdate date DEFAULT sysdate NOT NULL,
	PRIMARY KEY (no)
);


select * from tb_memo;


