# Write your MySQL query statement below
select email from Person
group by email
having count(email)>1

-- use of having vs where 

-- having-is used when grouping happend
-- where- is used when grouping not happend
-- always remember