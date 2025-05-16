package by.sankevich.storage.mapper;

import by.sankevich.storage.dto.ProductDto;
import by.sankevich.storage.entity.Order;
import by.sankevich.storage.entity.Product;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Mapper (componentModel = "spring")
public interface ProductMapper {
     Product toEntity(ProductDto productDto);

     ProductDto toDto(Product product);

}
