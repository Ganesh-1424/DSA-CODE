# Write your MySQL query statement below
SELECT customer_id, COUNT(customer_id) AS count_no_trans 
FROM Visits LEFT JOIN Transactions 
on Visits.visit_id=Transactions.visit_id
where Transaction_id is NULL
GROUP BY customer_id;