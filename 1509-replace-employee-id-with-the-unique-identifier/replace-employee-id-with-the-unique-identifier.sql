# Write your MySQL query statement below
/* Write your PL/SQL query statement below */
select b.unique_id ,a.name from employees a left join employeeuni b
on a.id = b.id ; 
