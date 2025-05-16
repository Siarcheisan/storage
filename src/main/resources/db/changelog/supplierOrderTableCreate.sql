CREATE TABLE supplier_order (
supplier_id  bigint REFERENCES supplier(supplier_id),
order_id bigint REFERENCES ordering(order_id)
)