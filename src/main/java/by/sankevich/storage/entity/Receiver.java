package by.sankevich.storage.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Receiver {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long receiverId;
    @OneToMany (mappedBy = "receiver" )
    private List <Order> order;
    private String companyName;
    private Long phoneNumber;
    private Long taxRegistrationNumber;
}
