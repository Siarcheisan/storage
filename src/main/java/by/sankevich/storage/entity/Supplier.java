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
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long supplierId;
    @ManyToMany
    private List<Order> orderList;
    private String companyName;

}
