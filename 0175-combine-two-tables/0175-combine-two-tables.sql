# Write your MySQL query statement below
select p1.firstName, p1.lastName, p2.city,p2.state from 
Person p1 left Join Address p2 ON p1.personId=p2.personId