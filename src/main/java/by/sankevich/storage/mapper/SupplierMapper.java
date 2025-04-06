package by.sankevich.storage.mapper;

import by.sankevich.storage.dto.SupplierDto;
import by.sankevich.storage.entity.Order;
import by.sankevich.storage.entity.Supplier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class SupplierMapper {
    public Supplier toEntity (SupplierDto supplierDto){
        Supplier supplier = new Supplier();
        supplier.setSupplierId(supplierDto.getSupplierId());
        supplier.setCompanyName(supplierDto.getCompanyName());
        List < Order> orderList = new ArrayList<>();
        for (Long id:supplierDto.getOrderIdList() ) {
            Order order = new Order();
            order.setOrderId(id);
            orderList.add(order);
        }
        supplier.setOrderList(orderList);
        return supplier;
    }
    public SupplierDto toDto (Supplier supplier){
        SupplierDto supplierDto = new SupplierDto();
        supplierDto.setSupplierId(supplier.getSupplierId());
        supplierDto.setCompanyName(supplier.getCompanyName());
        List <Long> orderIdList = new ArrayList<>();
        for (Order order: supplier.getOrderList()){
            orderIdList.add(order.getOrderId());
        }
        supplierDto.setOrderIdList(orderIdList);
        return supplierDto;
    }
}
