package com.ecommerce.basketProduct.impl;

import com.ecommerce.basketProduct.impl.BasketProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BasketProductRepository extends JpaRepository<BasketProduct,Integer> {

}
