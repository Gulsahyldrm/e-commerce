package com.ecommerce.product.impl;

import com.ecommerce.product.impl.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    List<Product> findAllByCategory_CategoryId(int categoryId);
}
