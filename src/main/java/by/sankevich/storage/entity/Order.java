package by.sankevich.storage.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table (name = "ordering")
public class Order {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long orderId;

    @ManyToMany
    @JoinTable (name = "supplier_order",
    joinColumns = @JoinColumn (name = "order_id", referencedColumnName = "orderId"),
    inverseJoinColumns = @JoinColumn (name = "supplier_id", referencedColumnName = "supplierId"))
    private List <Supplier> supplierList;

    @ManyToOne
    @JoinColumn (name = "receiver_id")
    private Receiver receiver;

    @ManyToOne
    @JoinColumn(name = "delivery_id")
    private Delivery delivery;

    @ManyToMany
    @JoinTable (name = "product_order",
    joinColumns = @JoinColumn (name ="order_id", referencedColumnName = "orderId" ),
    inverseJoinColumns = @JoinColumn (name = "product_id", referencedColumnName = "productId"))
    private List <Product> productList;

    @Column (name = "amount_of_goods")
    private Long amountOfGoods;
}
