INSERT INTO customer(id,address, name)
SELECT '1','Patna', 'Ankit Singh'
WHERE
NOT EXISTS (
SELECT id FROM customer WHERE id = '1'
);

INSERT INTO orders(id,product_name, product_rating,customer_id)
SELECT '1','Mobile', 4,'1'
WHERE
NOT EXISTS (
SELECT id FROM orders WHERE id = '1'
);
