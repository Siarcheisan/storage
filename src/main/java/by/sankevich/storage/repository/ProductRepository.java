package by.sankevich.storage.repository;

import by.sankevich.storage.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ProductRepository extends JpaRepository <Product, Long> {
}
