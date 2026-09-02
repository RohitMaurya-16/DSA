-- select s.product_id, s.year as first_year , s.quantity, s.price
-- from Sales s
-- where s.year=(select min(year) from Sales where product_id=s.product_id)
# Write your MySQL query statement below
select product_id,year as first_year, quantity, price
from Sales
where(product_id, year) in (select  product_id, min(year) from Sales group by product_id)