-- INSERT statement ---
 INSERT INTO EMP e(e.empno, e.ename) 
 VALUES(?, ?);
 

-- UPDATE statement ---
UPDATE EMP e
   SET e.job =?
     , e.hiredate = sysdate
     , e.sal = ?
     , e.deptno = ? 
 WHERE e.empno = ?;
 
 
 -- DELETE statement ---
 DELETE EMP e
 WHERE e.empno = ?;