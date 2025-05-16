package by.sankevich.storage.mapper;

import by.sankevich.storage.dto.SupplierDto;
import by.sankevich.storage.entity.Order;
import by.sankevich.storage.entity.Supplier;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Mapper (componentModel = "spring")
public interface SupplierMapper {
     Supplier toEntity (SupplierDto supplierDto);
     SupplierDto toDto (Supplier supplier);
}
