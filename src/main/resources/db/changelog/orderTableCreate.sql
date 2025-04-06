CREATE TABLE ordering (
order_id bigserial PRIMARY KEY,
receiver_id bigint REFERENCES receiver(receiver_id),
delivery_id bigint REFERENCES delivery(delivery_id),
amount_of_goods bigint)