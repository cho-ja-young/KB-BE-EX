-- <심화1>
-- 다음 컬럼을 가지는 usertbl 과 buytbl 테이블을 정의하세요
DROP TABLE IF EXISTS usertbl;
DROP TABLE IF EXISTS buytbl;

CREATE TABLE usertbl
(
    userID    CHAR(8)     NOT NULL,
    name      VARCHAR(10) NOT NULL,
    birthYear INT         NOT NULL,
    CONSTRAINT PRIMARY KEY PK_userTBL_userID (userID)
);

CREATE TABLE buytbl
(
    num       INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    userid    CHAR(8)            NOT NULL,
    prodName  CHAR(6)            NOT NULL,
    FOREIGN KEY (userid) REFERENCES usertbl (userID)
);


-- 다음 조건을 만족하는 usertbl 테이블을 정의하세요.(UNIQUE)
CREATE TABLE usertbl
(
    userID    CHAR(8)     NOT NULL,
    name      VARCHAR(10) NOT NULL,
    birthYear INT         NOT NULL,
    email CHAR(30) NULL UNIQUE,
    CONSTRAINT PRIMARY KEY PK_userTBL_userID (userID)
);

-- 다음 조건을 만족하는 usertbl 테이블을 정의하세요.(CHECK)
CREATE TABLE usertbl
(
    userID    CHAR(8)     NOT NULL,
    name      VARCHAR(10) NULL,
    birthYear  INT CHECK  (birthYear >= 1900 AND birthYear <= 2023),
    mobile1    char(3) NOT NULL,
    CONSTRAINT PRIMARY KEY PK_userTBL_userID (userID)
);


-- 다음 조건을 만족하는 usertbl 테이블을 정의하세요.(DEFAULT)
DROP TABLE IF EXISTS userTBL;

CREATE TABLE userTBL
(
    userID    CHAR(8)     NOT NULL PRIMARY KEY,
    name      VARCHAR(10) NOT NULL,
    birthYear INT         NOT NULL DEFAULT -1,
    addr      CHAR(2)     NOT NULL DEFAULT '서울',
    mobile1   CHAR(3)     NULL,
    mobile2   CHAR(8)     NULL,
    height    SMALLINT    NULL     DEFAULT 170,
    mDate     DATE        NULL
);

-- 기본값 추가 확인할 수 있는 데이터 추가
INSERT INTO usertbl
VALUES ('LHL', '이혜리', default, default, '011', '1234567',
        default, '2023.12.12');

-- 열 이름이 명시되지 않으면 DEFAULT로 설정된 값을 자동 입력
INSERT INTO usertbl(userID, name)
VALUES ('KAY', '김아영');

-- 값이 직접 작성되면 DEFAULT로 설정된 값은 무시
INSERT INTO usertbl
VALUES ('WB', '원빈', 1982, '대전', '019', '9876543', 176,
        '2020.5.5');


-- 앞에서 만든 userTBL 에 대해서 다음 조건을 처리하도록 수정하세요.
-- mobile1 컬럼을 삭제
ALTER TABLE usertbl DROP COLUMN mobile1;
-- name 컬럼명을 uName 으로 변경
ALTER TABLE usertbl CHANGE COLUMN name uName VARCHAR(20) NULL;
-- 기본키를 제거
ALTER TABLE usertbl DROP PRIMARY KEY;