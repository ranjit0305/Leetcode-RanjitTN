SELECT customer_number
FROM (
    SELECT customer_number, COUNT(order_number) as order_count
    FROM Orders
    GROUP BY customer_number
) as customer_orders
WHERE order_count = (
    SELECT MAX(order_count) 
    FROM (
        SELECT customer_number, COUNT(order_number) as order_count
        FROM Orders
        GROUP BY customer_number
    ) as counts
);
