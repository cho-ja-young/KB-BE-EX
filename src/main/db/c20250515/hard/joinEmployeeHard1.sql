-- 현재 재직 중인 직원의 정보를 출력
-- 출력항목 : emp_no, first_name, last_name, title

SELECT E.emp_no, E.first_name, E.last_name, T.title
FROM employees E
    LEFT OUTER JOIN titles T ON E.emp_no = T.emp_no
WHERE T.to_date = '9999-01-01';


-- 현재 재직 중인 직원의 정보를 출력
-- 출력항목 : 직원의 기본 정보 모두, title, salary

SELECT E.emp_no, E.birth_date, E.first_name, E.last_name, E.gender, E.hire_date, T.title, S.salary
FROM employees E
LEFT OUTER JOIN titles T ON E.emp_no = T.emp_no
LEFT OUTER JOIN salaries S ON T.emp_no = S.emp_no
WHERE T.to_date = '9999-01-01' AND S.to_date = '9999-01-01';

