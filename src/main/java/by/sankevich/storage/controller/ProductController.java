package by.sankevich.storage.controller;

import by.sankevich.storage.dto.ProductDto;
import by.sankevich.storage.entity.Product;
import by.sankevich.storage.repository.ProductRepository;
import by.sankevich.storage.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping ("/products")

@RequiredArgsConstructor
@RestController
public class ProductController {
    private final ProductService productService;


    @PostMapping
    public ProductDto save(@RequestBody ProductDto product) {
        return productService.save(product);
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        productService.delete(id);
    }


    @GetMapping("/{id}")
    public ProductDto get(@PathVariable Long id) {
        return productService.get(id);
    }

    @GetMapping
    public List<ProductDto> getAllProducts() {
        return productService.getAllProducts();
    }


}
