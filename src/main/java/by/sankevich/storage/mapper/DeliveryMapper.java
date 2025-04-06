package by.sankevich.storage.mapper;

import by.sankevich.storage.dto.DeliveryRequestDto;
import by.sankevich.storage.dto.DeliveryResponseDto;
import by.sankevich.storage.entity.Delivery;
import by.sankevich.storage.entity.Order;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class DeliveryMapper {
    public Delivery toEntity (DeliveryRequestDto deliveryRequestDto){
        Delivery delivery = new Delivery();
        delivery.setDateOfDelivery(new Date());
        delivery.setDeliveryType(deliveryRequestDto.getDeliveryType());
        delivery.setDeliveryCost(deliveryRequestDto.getDeliveryCost());
        List < Order> orderList = new ArrayList<>();
        for (Long id:deliveryRequestDto.getOrderIdList()){
            Order order = new Order();
            order.setOrderId(id);
            orderList.add(order);
        }
        delivery.setOrder(orderList);
        return delivery;
    }
    public DeliveryResponseDto toDto (Delivery delivery){
        DeliveryResponseDto deliveryResponseDto = new DeliveryResponseDto();
        deliveryResponseDto.setDeliveryId(delivery.getDeliveryId());
        deliveryResponseDto.setDate(delivery.getDateOfDelivery());
        deliveryResponseDto.setDeliveryType(delivery.getDeliveryType());
        deliveryResponseDto.setDeliveryCost(delivery.getDeliveryCost());
        return deliveryResponseDto;
    }


}
