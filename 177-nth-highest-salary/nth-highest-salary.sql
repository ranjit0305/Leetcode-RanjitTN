CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  SET N=N-1;
  RETURN (
      # Write your MySQL query statement below.
    Select distinct(salary) from employee order by salary Desc Limit 1 Offset N
  );
END