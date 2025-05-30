package by.sankevich.storage.dto;

import lombok.Builder;
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
