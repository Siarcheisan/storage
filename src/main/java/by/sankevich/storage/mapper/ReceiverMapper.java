package by.sankevich.storage.mapper;

import by.sankevich.storage.dto.ReceiverDto;
import by.sankevich.storage.entity.Order;
import by.sankevich.storage.entity.Receiver;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Mapper (componentModel = "spring")
public interface ReceiverMapper {
     @Mapping(target = "orderList", source = "orderIdList")
     Receiver toEntity(ReceiverDto receiverDto);

     @Mapping(target = "orderIdList", source = "orderList")
     ReceiverDto toDto(Receiver receiver);

     default Order toOrder(Long id) {
          Order order = new Order();
          order.setOrderId(id);
          return order;
     }
     default Long toId(Order order) {
          return order.getOrderId();
     }
}
