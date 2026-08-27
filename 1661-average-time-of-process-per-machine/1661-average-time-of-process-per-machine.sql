SELECT 
    machine_id,
    ROUND(
        AVG(CASE WHEN activity_type = 'end' THEN timestamp ELSE -timestamp END) * 2, # using if else condition id true timestamp+ else -
        3
    ) AS processing_time
FROM Activity
GROUP BY machine_id;
