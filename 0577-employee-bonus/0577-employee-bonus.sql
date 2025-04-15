SELECT e.name, b.bonus FROM Employee e
LEFT JOIN Bonus b ON b.empId = e.empId
where b.bonus < 1000 or b.bonus is null;