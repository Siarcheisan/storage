package by.sankevich.storage.mapper;

import by.sankevich.storage.dto.SupplierDto;
import by.sankevich.storage.entity.Order;
import by.sankevich.storage.entity.Supplier;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Mapper (componentModel = "spring")
public interface SupplierMapper {
     @Mapping(target = "orderList", source = "orderIdList")
     Supplier toEntity (SupplierDto supplierDto);
     @Mapping(target = "orderIdList", source = "orderList")
     SupplierDto toDto (Supplier supplier);

     default Order toOrder(Long id) {
          Order order = new Order();
          order.setOrderId(id);
          return order;
     }

     default Long toId(Order order) {
          return order.getOrderId();
     }
}
