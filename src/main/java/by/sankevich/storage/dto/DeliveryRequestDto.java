package by.sankevich.storage.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter

public class DeliveryRequestDto {
    private Long deliveryId;
    private List<Long> orderIdList;
    private String deliveryType;
    private Float deliveryCost;
}
