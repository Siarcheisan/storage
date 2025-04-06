package by.sankevich.storage.service;

import by.sankevich.storage.dto.ProductDto;
import by.sankevich.storage.entity.Product;

import java.util.List;

public interface ProductService {
    ProductDto save (ProductDto product);
    void delete (Long id);
    ProductDto get (Long id);
    List <ProductDto> getAllProducts ();

}
