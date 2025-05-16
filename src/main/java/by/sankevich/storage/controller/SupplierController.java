package by.sankevich.storage.controller;

import by.sankevich.storage.dto.SupplierDto;
import by.sankevich.storage.entity.Supplier;
import by.sankevich.storage.repository.SupplierRepository;
import by.sankevich.storage.service.SupplierService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/suppliers")
@AllArgsConstructor
@RestController
public class SupplierController {
    private final SupplierService supplierService;

    @PostMapping
    public ResponseEntity <SupplierDto> save(@RequestBody SupplierDto supplier) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(supplierService.save(supplier));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity <Void> delete(@PathVariable Long id) {
        supplierService.delete(id);
        return ResponseEntity
                .status(HttpStatus.NO_CONTENT)
                .build();
    }


    @GetMapping("/{id}")
    public ResponseEntity <SupplierDto> get(@PathVariable Long id) {
        return ResponseEntity
                .ok(supplierService.get(id));
    }

    @GetMapping
    public ResponseEntity <List<SupplierDto>> getAllSuppliers() {
        return ResponseEntity
                .ok(supplierService.getAllSuppliers());
    }
}
