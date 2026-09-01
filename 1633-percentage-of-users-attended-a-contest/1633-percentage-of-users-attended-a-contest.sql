# Write your MySQL query statement below
-- select r.contest_id,  round((count(r.user_id)/(select count(*) from Users))*100,2) as percentage
-- from  Users u
-- left join  Register r on u.user_id=r.user_id 
-- group by r.contest_id 
-- order by percentage desc, r.contest_id asc
SELECT r.contest_id,
       ROUND((COUNT(r.user_id) / (SELECT COUNT(*) FROM Users)) * 100, 2) AS percentage
FROM Register r
GROUP BY r.contest_id
ORDER BY percentage DESC, r.contest_id ASC;