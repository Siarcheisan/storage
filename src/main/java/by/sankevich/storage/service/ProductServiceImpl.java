package by.sankevich.storage.service;

import by.sankevich.storage.dto.ProductDto;
import by.sankevich.storage.entity.Product;
import by.sankevich.storage.mapper.ProductMapper;
import by.sankevich.storage.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor

public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    /**
     * @param productDto
     * @return
     */
    @Override
    public ProductDto save(ProductDto productDto) {
        Product product = productMapper.toEntity(productDto);
        Product savedInDbProduct = productRepository.save(product);
        return productMapper.toDto(savedInDbProduct);
    }

    /**
     * @param id
     */
    @Override
    public void delete(Long id) {
        productRepository.deleteById(id);
    }

    /**
     * @param id
     * @return
     */
    @Override
    public ProductDto get(Long id) {
        Product product = productRepository.findById(id).orElse(new Product());
        return productMapper.toDto(product);

    }

    /**
     * @return
     */
    @Override
    public List<ProductDto> getAllProducts() {
        List<Product> products = productRepository.findAll();
        List<ProductDto> productDtos = new ArrayList<>();
        for (Product product : products) {
            ProductDto productDto = productMapper.toDto(product);
            productDtos.add(productDto);
        }
        return productDtos;
    }
}
