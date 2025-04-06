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
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long productId;
    @ManyToMany
    private List<Order> orderList;
    private String name;
    private String description;
    private Float price;
    private Long amount;


}
