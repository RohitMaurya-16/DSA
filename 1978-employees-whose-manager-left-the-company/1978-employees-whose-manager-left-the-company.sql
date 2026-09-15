# Write your MySQL query statement below
select e2.employee_id from Employees e2
WHERE e2.manager_id NOT IN (SELECT e1.employee_id FROM employees e1)
AND e2.salary < 30000
ORDER BY e2.employee_id ASC;
