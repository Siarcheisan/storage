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
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long deliveryId;
    @OneToMany (mappedBy = "delivery")
    private List <Order> order;
    private Date dateOfDelivery;
    private String deliveryType;
    private Float deliveryCost;


}
