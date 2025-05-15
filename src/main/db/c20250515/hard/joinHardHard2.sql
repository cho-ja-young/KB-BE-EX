-- 학생 기준 출력
SELECT A.emp AS '부하직원', B.emp AS '직속상관', B.empTel AS '직속상관연락처'
FROM emptbl A
         INNER JOIN emptbl B ON A.manager = B.emp
WHERE A.emp = '우대리';