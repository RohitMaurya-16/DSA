# Write your MySQL query statement below
select e1.name, b1.bonus from
Employee e1
left join Bonus b1 on e1.empId=b1.empId   # use left join  bcz by defult it will take inner join which will not show you null values

where bonus<1000 or bonus is null