# Write your MySQL query statement below
SELECT today.id 
FROM Weather as today
LEFT JOIN Weather AS nextday
ON DATE_ADD(nextday.recordDate, INTERVAL 1 DAY) = today.recordDate
WHERE today.temperature > nextday.temperature;