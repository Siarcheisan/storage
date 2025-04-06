package by.sankevich.storage.repository;

import by.sankevich.storage.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface SupplierRepository extends JpaRepository <Supplier, Long>  {
}
