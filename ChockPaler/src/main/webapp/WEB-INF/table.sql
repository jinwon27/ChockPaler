CREATE TABLE USERS(
num NUMBER PRIMARY KEY,
id VARCHAR2(30) NOT NULL,
pwd VARCHAR2(30) NOT NULL,
name VARCHAR2(10) NOT NULL,
email VARCHAR2(100),
regdate DATE,
gender VARCHAR2(10),
profile VARCHAR2(200)
);

CREATE SEQUENCE USERS_SEQ;

CREATE TABLE USERS_ACCOUNT(
id VARCHAR2(30) NOT NULL,
money NUMBER CHECK(money >= 0),
point NUMBER
);

CREATE TABLE USERS_ORDER(
num NUMBER PRIMARY KEY,
id VARCHAR2(30) NOT NULL,
item_code NUMBER,
addr VARCHAR2(100)
);

CREATE SEQUENCE USERS_ORDER_SEQ;

CREATE TABLE REVIEWS(
num NUMBER PRIMARY KEY,
writer VARCHAR2(30),
title VARCHAR2(100),
content CLOB,
regdate DATE
);

--이거 안씀 지울거임--
CREATE SEQUENCE REVIEWS_SEQ;
--이거도 안씀 지울거임--
CREATE TABLE ORDER_VIEW(
num NUMBER,
id VARCHAR2(30),
name VARCHAR2(10),
addr VARCHAR2(100),
item VARCHAR2(100),
count NUMBER,
price NUMBER
);

CREATE SEQUENCE items_seq;

CREATE TABLE ITEMS(
item_type VARCHAR2(50),
item_num NUMBER PRIMARY KEY,
name VARCHAR2(100),
detail VARCHAR2(300),
price NUMBER,
star_point NUMBER,
regdate DATE,
img VARCHAR2(300),
remain_count NUMBER CHECK(remain_count >= 0)
);

CREATE TABLE orderinquiry(
num NUMBER NOT NULL,
id VARCHAR2(50) NOT NULL,
addr VARCHAR2(200),
item_name VARCHAR2(200)
);

-- REVIEW 관리할 TABLE --
CREATE TABLE review(
num NUMBER PRIMARY KEY,
id VARCHAR2(100),
item_num NUMBER,
content  CLOB,
regdate DATE
);
-- REVIEW 관리할 SEQUENCE -- 
CREATE SEQUENCE review_seq;

CREATE TABLE basket( -- 장바구니
item_num NUMBER primary key, --상품번호 (장바구니 목록에서 삭제 할 때 필요)
id VARCHAR2(100),	--주문자 아이디(로그인 안하면 장바구니 못봄)
name VARCHAR2(100), 	--상품 이름
count NUMBER,	--주문한 수량
price NUMBER,	--수량 x가격(총액)
img VARCHAR2(300), --  상품이미지
);

-- 공지사항 태이블 --
CREATE SEQUENCE notice_seq;

CREATE TABLE notice(
num NUMBER PRIMARY KEY, -- 공지번호
title VARCHAR2(100), -- 제목
content CLOB, -- 내용
regdate DATE -- 날짜
);

CREATE TABLE buy(
num NUMBER PRIMARY KEY, -- 공지번호
title VARCHAR2(100), -- 제목
content CLOB, -- 내용
regdate DATE -- 날짜
);

-- 구매하기 태이블(장바구니 아이템 insert) --
CREATE TABLE buy(
order_num NUMBER,
id VARCHAR2(100),
addr VARCHAR2(100),
client_name VARCHAR2(50)
);

ALTER TABLE buy add
name VARCHAR2(100);

ALTER TABLE buy add
count NUMBER;

ALTER TABLE buy add
price NUMBER;
