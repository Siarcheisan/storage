package by.sankevich.storage.service;

import by.sankevich.storage.dto.SupplierDto;
import by.sankevich.storage.entity.Supplier;
import by.sankevich.storage.mapper.SupplierMapper;
import by.sankevich.storage.repository.SupplierRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service

public class SupplierServiceImpl implements SupplierService {
    private final SupplierRepository supplierRepository;
    private final SupplierMapper supplierMapper;

    /**
     * @param supplierDto
     * @return
     */
    @Override
    public SupplierDto save(SupplierDto supplierDto) {
        Supplier supplier = supplierMapper.toEntity(supplierDto);
        Supplier supplierToDb = supplierRepository.save(supplier);
        return supplierMapper.toDto(supplierToDb);
    }

    /**
     * @param id
     */
    @Override
    public void delete(Long id) {
        supplierRepository.deleteById(id);

    }

    /**
     * @param id
     * @return
     */
    @Override
    public SupplierDto get(Long id) {
        Supplier supplier = supplierRepository.findById(id).orElse(new Supplier());
        return supplierMapper.toDto(supplier);
    }

    /**
     * @return
     */
    @Override
    public List<SupplierDto> getAllSuppliers() {
        List<Supplier> suppliers = supplierRepository.findAll();
        List<SupplierDto> supplierDtos = new ArrayList<>();
        for (Supplier supplier : suppliers) {
            SupplierDto supplierDto = supplierMapper.toDto(supplier);
            supplierDtos.add(supplierDto);
        }
        return supplierDtos;
    }

}