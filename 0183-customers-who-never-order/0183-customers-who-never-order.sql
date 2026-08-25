# Write your MySQL query statement below
Select name as Customers   #use ad Customers to output column name Customers
from Customers
where id not in(select customerId from Orders)
