# Write your MySQL query statement below
#관리자보다 더 많이 버는 직원을 찾는 솔루션을 작성하세요.
select e.name as Employee
from Employee e join Employee m
on e.managerId = m.id 
and e.salary > m.salary ;

