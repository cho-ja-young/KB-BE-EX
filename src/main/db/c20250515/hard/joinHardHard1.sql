-- 학생 기준 출력
SELECT S.stdName, S.addr, SC.clubName, C.roomNo
FROM stdtbl S
         INNER JOIN stdclubtbl SC ON S.stdName = SC.stdName
         INNER JOIN clubtbl C ON SC.clubName = C.clubName
ORDER BY S.stdName;

-- 동아리 기준 출력
SELECT C.clubName, C.roomNo, S.stdName, S.addr
FROM stdtbl S
         INNER JOIN stdclubtbl SC ON SC.stdName = S.stdName
         INNER JOIN clubtbl C ON  SC.clubName = C.clubName
ORDER BY C.clubName;