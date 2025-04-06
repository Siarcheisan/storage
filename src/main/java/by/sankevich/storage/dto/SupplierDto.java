package by.sankevich.storage.dto;

import by.sankevich.storage.entity.Order;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter

public class SupplierDto {
    private Long supplierId;
    private List<Long> orderIdList;
    private String companyName;
}
