SELECT *
FROM buytbl
INNER JOIN usertbl ON buytbl.userID = usertbl.userID
WHERE buytbl.userID = 'JYP';
