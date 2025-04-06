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
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long orderId;
    @ManyToMany
    private List <Supplier> supplierList;
    @ManyToOne
    private Receiver receiver;
    @ManyToOne
    private Delivery delivery;
    @ManyToMany
    private List <Product> productList;

    private Long amountOfGoods;

}
