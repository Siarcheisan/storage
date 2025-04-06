package by.sankevich.storage.controller;

import by.sankevich.storage.dto.SupplierDto;
import by.sankevich.storage.entity.Supplier;
import by.sankevich.storage.repository.SupplierRepository;
import by.sankevich.storage.service.SupplierService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/suppliers")
@AllArgsConstructor
@RestController
public class SupplierController {
    private final SupplierService supplierService;

    @PostMapping
    public SupplierDto save(@RequestBody SupplierDto supplier) {
        return supplierService.save(supplier);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        supplierService.delete(id);

    }


    @GetMapping("/{id}")
    public SupplierDto get(@PathVariable Long id) {
        return supplierService.get(id);
    }

    @GetMapping
    public List<SupplierDto> getAllSuppliers() {
        return supplierService.getAllSuppliers();
    }
}
