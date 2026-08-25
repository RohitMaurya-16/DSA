# Write your MySQL query statement below
select emp.name as Employee
from Employee emp
Inner join Employee mgr ON
emp.managerId=mgr.Id
where  emp.salary>=mgr.salary