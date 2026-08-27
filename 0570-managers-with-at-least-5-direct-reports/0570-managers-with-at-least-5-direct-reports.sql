# Write your MySQL query statement below
select name from Employee
where id in(select managerId  from Employee group by managerId  having count(id)>=5) # use having with group by where clause doest help in count