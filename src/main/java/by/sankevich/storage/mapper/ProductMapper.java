package by.sankevich.storage.mapper;

import by.sankevich.storage.dto.ProductDto;
import by.sankevich.storage.entity.Order;
import by.sankevich.storage.entity.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class ProductMapper {
    public Product toEntity (ProductDto productDto){
        Product product = new Product();
        product.setName(productDto.getName());
        product.setDescription(productDto.getDescription());
        product.setPrice(productDto.getPrice());
        product.setAmount(productDto.getAmount());
        List < Order> orderList = new ArrayList<>();
        for (Long id: productDto.getOrderIdList()){
            Order order = new Order();
            order.setOrderId(id);
            orderList.add(order);
        }
        product.setOrderList(orderList);
        return product;
    }

    public ProductDto toDto (Product product){
        ProductDto productDto = new ProductDto();
        productDto.setProductId(product.getProductId());
        productDto.setName(product.getName());
        productDto.setDescription(product.getDescription());
        productDto.setPrice(product.getPrice());
        productDto.setAmount(product.getAmount());
        return productDto;
    }

}
