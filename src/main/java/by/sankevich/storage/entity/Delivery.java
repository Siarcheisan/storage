package by.sankevich.storage.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Delivery {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long deliveryId;


    @OneToMany (mappedBy = "delivery")
    private List <Order> orderList;

    @Column (name = "date_of_delivery")
    private Date date;

    @Column (name = "delivery_type")
    private String deliveryType;

    @Column (name = "delivery_cost")
    private Float deliveryCost;
}
