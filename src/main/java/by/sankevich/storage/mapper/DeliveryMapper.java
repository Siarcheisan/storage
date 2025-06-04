package by.sankevich.storage.mapper;

import by.sankevich.storage.dto.DeliveryRequestDto;
import by.sankevich.storage.dto.DeliveryResponseDto;
import by.sankevich.storage.entity.Delivery;
import by.sankevich.storage.entity.Order;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Mapper(componentModel = "spring")
public interface DeliveryMapper {
    @Mapping(target = "orderList", source = "orderIdList")
    Delivery toEntity(DeliveryRequestDto deliveryRequestDto);

    @Mapping(target = "orderIdList", source = "orderList")
    DeliveryResponseDto toDto(Delivery delivery);

    default Order toOrder(Long id) {
        Order order = new Order();
        order.setOrderId(id);
        return order;
    }

    default Long toId(Order order) {
        return order.getOrderId();
    }
}
