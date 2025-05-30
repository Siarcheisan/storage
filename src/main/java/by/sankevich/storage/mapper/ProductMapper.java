package by.sankevich.storage.mapper;

import by.sankevich.storage.dto.ProductDto;
import by.sankevich.storage.entity.Order;
import by.sankevich.storage.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Mapper (componentModel = "spring")
public interface ProductMapper {
     @Mapping(target = "orderList", source = "orderIdList")
     Product toEntity(ProductDto productDto);
     default Order toOrder(Long id) {
          Order order = new Order();
          order.setOrderId(id);
          return order;
     }

     @Mapping(target = "orderIdList", source = "orderList")
     ProductDto toDto(Product product);

     default Long toId(Order order) {
          return order.getOrderId();
     }

}
