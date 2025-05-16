package by.sankevich.storage.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long productId;

    @ManyToMany
    @JoinTable (name = "product_order",
    joinColumns = @JoinColumn (name = "product_id", referencedColumnName = "productId"),
    inverseJoinColumns = @JoinColumn (name = "order_id", referencedColumnName = "orderId"))
    private List<Order> orderList;

    @Column (name = "name")
    private String name;

    @Column (name = "description")
    private String description;

    @Column (name = "price")
    private Float price;

    @Column (name = "amount")
    private Long amount;
}
