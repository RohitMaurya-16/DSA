# Write your MySQL query statement below
with XYZ as (
    select 
    d.name as Department,
    e.name as Employee,
    e.salary as Salary,
    dense_rank() over(partition by e.departmentId order by e.salary desc) as rnk
    from Employee e
    join Department d on e.departmentId=d.id
)

select Department, Employee, Salary from XYZ
where rnk<=3

-- PARTITION BY E.departmentId

-- This divides the employees into separate groups by department so that rankings are calculated independently for each department (e.g., the top earners in IT are ranked separately from HR).