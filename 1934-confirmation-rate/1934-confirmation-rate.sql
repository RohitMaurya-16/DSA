# Write your MySQL query statement below
SELECT 
    s.user_id, 
    IFNULL(
        ROUND(
            COUNT(CASE WHEN c.action='confirmed' THEN 1 END) * 1.0 / 
            NULLIF(COUNT(CASE WHEN c.action='confirmed' OR c.action='timeout' THEN 1 END), 0), 
            2
        ), 
        0
    ) AS confirmation_rate
FROM Signups s 
LEFT JOIN Confirmations c ON s.user_id = c.user_id
GROUP BY s.user_id;

# if data is null it will add as 0 

