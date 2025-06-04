package by.sankevich.storage.mapper;

import by.sankevich.storage.dto.OrderDto;
import by.sankevich.storage.entity.Order;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper (componentModel = "spring", uses = {DeliveryMapper.class, ProductMapper.class, ReceiverMapper.class, SupplierMapper.class})
public interface OrderMapper {
    Order toEntity (OrderDto orderDto);
    OrderDto toDto (Order order);
    List <OrderDto> toDtoList (List <Order> orderList);
}
