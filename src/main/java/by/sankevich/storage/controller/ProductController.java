package by.sankevich.storage.controller;

import by.sankevich.storage.dto.ProductDto;
import by.sankevich.storage.entity.Product;
import by.sankevich.storage.repository.ProductRepository;
import by.sankevich.storage.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping ("/products")

@RequiredArgsConstructor
@RestController
public class ProductController {
    private final ProductService productService;


    @PostMapping
    public ResponseEntity <ProductDto> save(@RequestBody ProductDto product) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(productService.save(product));
    }


    @DeleteMapping("/{id}")
    public ResponseEntity <Void> delete(@PathVariable Long id) {
        productService.delete(id);
        return ResponseEntity
                .status(HttpStatus.NO_CONTENT)
                .build();
    }


    @GetMapping("/{id}")
    public ResponseEntity <ProductDto> findProductById(@PathVariable Long id) {
        return ResponseEntity
                .ok(productService.get(id));
    }

    @GetMapping
    public ResponseEntity <List<ProductDto>> getAllProducts() {
        return ResponseEntity
                .ok(productService.getAllProducts());
    }
}
