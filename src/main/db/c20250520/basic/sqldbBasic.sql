-- sqldb 데이터베이스에 다음과 같은 컬럼을 가지는 테이블 tbl1 을 생성하고, 자동 생성된 인덱스 목록을 확인하세요.
-- Primary Key 설정 시 자동으로 클러스터형 인덱스 생성
CREATE TABLE tbl1
(
    a INT PRIMARY KEY,-- 이 열에 클러스터형 인덱스 자동 생성
    b INT,
    c INT
);

-- 인덱스 확인
SHOW INDEX FROM tbl1;

-- sqldb 데이터베이스에 다음과 같은 컬럼을 가지는 테이블 tbl2 를 생성하고, 자동 생성된 인덱스 목록을 확인하세요.
-- UNIQUE 제약조건은 보조 인덱스 자동 생성
CREATE TABLE tbl2
(
    a INT PRIMARY KEY,-- 클러스터형 인덱스
    b INT UNIQUE,-- 보조 인덱스
    c INT UNIQUE,-- 보조 인덱스
    d INT
);

SHOW INDEX FROM tbl2;

-- sqldb 데이터베이스에 다음과 같은 컬럼을 가지는 테이블 tbl3 을 생성하고, 자동 생성된 인덱스 목록을 확인하세요.
-- UNIQUE 제약조건은 보조 인덱스 자동 생성
CREATE TABLE tbl3
(
    a INT UNIQUE,-- 보조 인덱스
    b INT UNIQUE,-- 보조 인덱스
    c INT UNIQUE,-- 보조 인덱스
    d INT
);

SHOW INDEX FROM tbl3;


-- sqldb 데이터베이스에 다음과 같은 컬럼을 가지는 테이블 tbl4 를 생성하고, 자동 생성된 인덱스 목록을 확인하세요.
-- Primary Key가 없고 Unique, Not Null 제약조건이 있는 경우
CREATE TABLE tbl4
(
    a INT UNIQUE NOT NULL,-- 클러스터형 인덱스로 생성
    b INT UNIQUE,
    c INT UNIQUE,
    d INT
);

SHOW INDEX FROM tbl4;


-- sqldb 데이터베이스에 다음과 같은 컬럼을 가지는 테이블 tbl5 를 생성하고, 자동 생성된 인덱스 목록을 확인하세요.
CREATE TABLE tbl5
(
    a INT UNIQUE NOT NULL ,
    b INT UNIQUE ,
    c INT UNIQUE ,
    d INT PRIMARY KEY
);

SHOW INDEX FROM tbl5;

