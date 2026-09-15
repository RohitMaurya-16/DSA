# Write your MySQL query statement below
SELECT ROUND(SUM(tiv_2016), 2) AS tiv_2016
FROM Insurance
-- Rule 1: The 2015 investment must be shared with at least one other person
WHERE tiv_2015 IN (
    SELECT tiv_2015 
    FROM Insurance 
    GROUP BY tiv_2015 
    HAVING COUNT(*) > 1
)
-- Rule 2: The location (lat, lon) must be completely unique (count = 1)
AND (lat, lon) IN (
    SELECT lat, lon 
    FROM Insurance 
    GROUP BY lat, lon 
    HAVING COUNT(*) = 1
);