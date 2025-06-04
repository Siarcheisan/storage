package by.sankevich.storage.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
public class Supplier {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long supplierId;

    @ManyToMany
    @JoinTable (name = "supplier_order",
    joinColumns = @JoinColumn (name ="supplier_id",referencedColumnName = "supplierId" ),
    inverseJoinColumns = @JoinColumn(name = "order_id", referencedColumnName = "orderId"))
    private List<Order> orderList;

    @Column (name = "company_name")
    private String companyName;
}
