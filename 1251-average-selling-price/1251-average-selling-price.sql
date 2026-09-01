# Write your MySQL query statement below
select p.product_id,  COALESCE(Round(sum(p.price*u.units)/sum(u.units),2),0) as average_price
from Prices p left join UnitsSold u on p.product_id=u.product_id 
and u.purchase_date between p.start_date and  p.end_date
group by product_id

# we use Coalesce to check if product has no matching sales record it will output 0 as you can see in end of bracket
# Rouns it use round the value by 2 digits.