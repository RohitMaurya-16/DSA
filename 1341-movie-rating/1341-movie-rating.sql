(
    SELECT U.name AS results
    FROM Users U
    JOIN MovieRating MR ON U.user_id = MR.user_id
    GROUP BY U.user_id
    ORDER BY COUNT(MR.movie_id) DESC, U.name ASC
    LIMIT 1
)
UNION ALL
(
    SELECT M.title AS results
    FROM Movies M
    JOIN MovieRating MR ON M.movie_id = MR.movie_id
    WHERE DATE_FORMAT(MR.created_at, '%Y-%m') = '2020-02'
    GROUP BY M.movie_id
    ORDER BY AVG(MR.rating) DESC, M.title ASC
    LIMIT 1
);