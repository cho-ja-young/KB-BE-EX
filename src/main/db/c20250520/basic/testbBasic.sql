-- testdb 에 다음 컬럼 목록을 가지는 usertbl 을 만드세요.
CREATE TABLE usertbl
(
    userID CHAR(8) NOT NULL PRIMARY KEY ,
    name VARCHAR(10) NOT NULL ,
    birthYear INT NOT NULL,
    addr NCHAR(2) NOT NULL
);

-- 데이터 추가하고,클러스터형 인덱스의 테이블 내용을 확인
INSERT INTO usertbl VALUES ('LSG', '이승기', 1987, '서울');
INSERT INTO usertbl VALUES ('KBS', '김범수', 1979, '경남');
INSERT INTO usertbl VALUES ('KKH', '김경호', 1971, '전남');
INSERT INTO usertbl VALUES ('JYP', '조용필', 1950, '경기');
INSERT INTO usertbl VALUES ('SSK', '성시경', 1979, '서울');

-- 인덱스 확인
SHOW INDEX FROM usertbl;
-- 테이블 확인
DESC usertbl;
-- 테이블 내용 확인
SELECT * FROM usertbl;


-- ALTER 를 사용하여 usertbl에서 PRIMARY KEY 제약 조건을 제거하고 name 컬럼에 pk_name 이라는 제약조건명으로 기본키를 설정하세요.
ALTER TABLE usertbl DROP PRIMARY KEY;
ALTER TABLE usertbl ADD CONSTRAINT pk_name PRIMARY KEY (name);

-- 테이블 내용 확인
SELECT * FROM usertbl;
-- 인덱스 확인
SHOW INDEX FROM usertbl;