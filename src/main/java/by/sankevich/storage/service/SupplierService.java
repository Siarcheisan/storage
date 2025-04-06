package by.sankevich.storage.service;

import by.sankevich.storage.dto.SupplierDto;
import by.sankevich.storage.entity.Supplier;

import java.util.List;

public interface SupplierService {
    SupplierDto save (SupplierDto supplierDto);
    void delete (Long id);
    SupplierDto get (Long id);
    List <SupplierDto> getAllSuppliers ();
}
