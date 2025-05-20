-- sqldb 에서 usertbl 테이블에서 다음 내용들을 확인하세요.
-- usertbl의 내용 확인
SELECT * FROM usertbl;

-- 인덱스 목록 확인
SHOW INDEX FROM usertbl;

-- usertbl 의 데이터 크기와 인덱스의 크기 확인
ANALYZE TABLE usertbl;
SHOW TABLE STATUS LIKE 'usertbl';


-- usertbl 의 addr 컬럼에 대해 idx_usertbl_addr 이름으로 인덱스를 만들고 인덱스 목록을 확인하세요.
CREATE INDEX idx_usertbl_addr ON usertbl(addr);
SHOW INDEX FROM usertbl;

-- usertbl 의 상태를 출력하여 인덱스의 내용이 만들어졌는지 확인하고,
-- 내용이 없다면 실제 적용되도록 한 후 인덱스의 크기를 확인
ANALYZE TABLE usertbl;
SHOW TABLE STATUS LIKE 'usertbl';


-- usertbl 에 대해 다음을 처리하세요.(1)
-- birthYear 컬럼에 대해 idx_usertbl_birthYear 이름의 보조인덱스를 생성
CREATE UNIQUE INDEX idx_usertbl_birthYear ON usertbl(birthYear);
-- (에러가 난다면 그 이유도 작성)
    -- 종복값이 있기 때문에 인덱스 생성 에러 발생

-- name 컬럼에 대해 idx_usertbl_name 이름의 보조인덱스를 생성
CREATE UNIQUE INDEX idx_usertbl_name ON usertbl(name);

-- 생성된 인덱스의 목록을 확인
SHOW INDEX FROM usertbl;


-- usertbl 에 대해 다음을 처리하세요.(2)
-- name 컬럼에 대한 보조 인덱스를 삭제 하세요.
DROP INDEX idx_usertbl_name ON usertbl;

-- name 과 birthYear 컬럼 조합으로 idx_usertbl_name_birthYear 이름의 인덱스를 생성하세요.
CREATE UNIQUE INDEX  idx_usertbl_name_birthYear ON usertbl(name, birthYear);

-- 인덱스의 목록을 확인
SHOW INDEX FROM usertbl;


-- usertbl 에서 앞에서 만든 인덱스를 삭제하세요.
DROP INDEX idx_usertbl_addr ON usertbl;
DROP INDEX idx_usertbl_name_birthYear ON usertbl;
SHOW INDEX FROM usertbl;


