# Write your MySQL query statement below
-- delete e1 from Activity e1, Activity e2
-- where e1.event_date>e2.event_date

-- selcect player_id, event_date from Activity 
select player_id ,min(event_date) as first_login
from Activity 
group by player_id
