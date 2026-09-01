# Write your MySQL query statement below
select DATE_FORMAT(trans_date, '%Y-%m') AS month, country, count(state) as trans_count,
 count(case when state='approved' then 1 end) as approved_count, sum(amount) as trans_total_amount,
 sum(case when state='approved' then amount else 0 end) as approved_total_amount
 from Transactions
 GROUP BY
    DATE_FORMAT(trans_date, '%Y-%m'),
    country;

    # you have to learn date_format if you want only month you can use Month(tran_date) but you will only get only month thats why use Date_Format(columnn_name, '%Y-%m')
