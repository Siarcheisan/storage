package by.sankevich.storage.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;
@Getter
@Setter
public class DeliveryResponseDto {
    private Long deliveryId;
    private List<Long> orderIdList;
    private Date date;
    private String deliveryType;
    private Float deliveryCost;
}
