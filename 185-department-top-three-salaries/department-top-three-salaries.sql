SELECT 
    d.name AS Department,
    e1.name AS Employee,
    e1.salary AS Salary
FROM employee e1 JOIN department d ON e1.DepartmentId = d.id
WHERE 3 > (SELECT COUNT(distinct(salary)) FROM employee e2 
			WHERE e1.DepartmentId = e2.DepartmentId AND e1.Salary < e2.salary
		  );