# Write your MySQL query statement below
with temp1 as ( select movie_id,avg(rating) as avgrating from MovieRating where month(created_at)='02' AND YEAR(created_at) = 2020 group by movie_id order by avg(rating) desc 
),
temp2 as (
SELECT movie_id, avgrating
FROM temp1
WHERE avgrating = (SELECT MAX(avgrating) FROM temp1)
),
temp3 as (
    select a.title from Movies a join temp2 b on a.movie_id=b.movie_id
),
temp4 as (
select MIN(title) as title from temp3
),
temp5 as (
select user_id,count(user_id) cnt_id from MovieRating group by user_id
),
temp6 as (
    SELECT user_id, cnt_id
FROM temp5
WHERE cnt_id = (SELECT MAX(cnt_id) FROM temp5)
),
temp7 as (
        select min(a.name) name from Users a join temp6 b on a.user_id=b.user_id
),
temp8 as (
    select name as results from temp7
    union all
    select title as results from temp4
)
select  * from temp8