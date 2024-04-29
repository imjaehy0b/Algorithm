# Write your MySQL query statement below
# 아이디가 가장 작은 고유 이메일 하나만 남겨두고 중복된 이메일을 모두 삭제하는 솔루션을 작성하세요.

delete p1.* from Person p1, Person p2
where p1.email = p2.email
and p1.id > p2.id;