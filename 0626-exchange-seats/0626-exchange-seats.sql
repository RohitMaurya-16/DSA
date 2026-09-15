# Write your MySQL query statement below
# here we will use:
-- LEAD(student, 1): Grabs the student name from the next row.
-- LAG(student, 1): Grabs the student name from the previous row.
SELECT 
    id,
    CASE 
        -- 1. If ID is ODD, grab the name from the NEXT row.
        --    If it's the last row, LEAD() returns NULL, so COALESCE keeps the current name.
        WHEN id % 2 != 0 THEN COALESCE(LEAD(student, 1) OVER (ORDER BY id), student)
        
        -- 2. If ID is EVEN, grab the name from the PREVIOUS row.
        ELSE LAG(student, 1) OVER (ORDER BY id)
    END AS student
FROM seat;
