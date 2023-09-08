package ua.com.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.ecommerce.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
