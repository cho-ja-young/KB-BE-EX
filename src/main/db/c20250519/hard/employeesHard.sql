-- <심화2>
-- 다음 정보를 가지는 직원 정보를 출력하는 EMPLOYEES_INFO 뷰를 작성하세요.

-- EMPLOYEES_INFO 뷰가 있다면 삭제
DROP VIEW IF EXISTS EMPLOYEES_INFO;

-- EMPLOYEES_INFO 뷰 생성
CREATE VIEW EMPLOYEES_INFO
AS
SELECT
    E.emp_no,
    E.birth_date,
    E.first_name,
    E.last_name,
    E.gender,
    E.hire_date,
    T.title,
    T.from_date AS 't_from',
    T.to_date AS 't_to',
    S.salary,
    S.from_date AS 's_from',
    S.to_date AS 's_to'
FROM
    employees E
        INNER JOIN titles T
            ON E.emp_no = T.emp_no
        INNER JOIN salaries S
                   ON T.emp_no = S.emp_no;


-- EMPLOYEES_INFO 뷰에서 재직자의 현재 정보만 출력하세요.
SELECT *
FROM
    EMPLOYEES_INFO
WHERE
    s_to = '9999-01-01';


-- 다음 정보를 가지는 부서 정보를 출력하는 EMP_DEPT_INFO 뷰를 작성하세요.

-- EMP_DEPT_INFO 뷰가 있다면 삭제
DROP VIEW IF EXISTS EMP_DEPT_INFO;

-- EMP_DEPT_INFO 뷰 생성
CREATE VIEW EMP_DEPT_INFO
AS
SELECT
    DE.emp_no,
    DE.dept_no,
    D.dept_name,
    DE.from_date,
    DE.to_date
FROM
    dept_emp DE
        INNER JOIN departments D
                   ON DE.dept_no = D.dept_no;

-- EMP_DEPT_INFO로 현재 재직자의 부서 정보를 출력하세요.
SELECT *
FROM
    EMP_DEPT_INFO
WHERE
    to_date = '9999-01-01'
ORDER BY emp_no;