# Write your MySQL query statement below
-- 1. Low Salary Bucket
SELECT 'Low Salary' AS category,
       COUNT(CASE WHEN income < 20000 THEN 1 END) AS accounts_count
FROM Accounts

UNION ALL

-- 2. Average Salary Bucket
SELECT 'Average Salary' AS category,
       COUNT(CASE WHEN income BETWEEN 20000 AND 50000 THEN 1 END) AS accounts_count
FROM Accounts

UNION ALL

-- 3. High Salary Bucket
SELECT 'High Salary' AS category,
       COUNT(CASE WHEN income > 50000 THEN 1 END) AS accounts_count
FROM Accounts;
