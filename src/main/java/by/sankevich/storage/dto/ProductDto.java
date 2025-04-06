package by.sankevich.storage.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter

public class ProductDto {
    private Long productId;
    private List <Long> orderIdList;
    private String name;
    private String description;
    private Float price;
    private Long amount;
}
