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
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long receiverId;

    @OneToMany (mappedBy = "receiver" )
    private List <Order> orderList;

    @Column (name = "company_name")
    private String companyName;

    @Column (name = "phone_number")
    private Long phoneNumber;

    @Column (name = "tax_registration_number")
    private Long taxRegistrationNumber;
}
