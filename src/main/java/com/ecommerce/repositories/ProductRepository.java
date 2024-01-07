package com.ecommerce.repositories;

import com.ecommerce.dto.ProductDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductDto, Long> {
    // You can add custom query methods here if needed


}

