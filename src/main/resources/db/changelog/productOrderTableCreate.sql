CREATE TABLE product_order (
product_id bigint REFERENCES product(product_id),
order_id bigint REFERENCES ordering(order_id)
)