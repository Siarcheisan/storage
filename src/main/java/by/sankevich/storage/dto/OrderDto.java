package by.sankevich.storage.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter

public class OrderDto {
    private Long orderId;
    private List<SupplierDto> supplier;

    private ReceiverDto receiver;

    private DeliveryRequestDto delivery;

    private List <ProductDto> productList;

    private Long amountOfGoods;
}
