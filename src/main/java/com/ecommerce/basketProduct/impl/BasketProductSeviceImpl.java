package com.ecommerce.basketProduct.impl;

import com.ecommerce.basketProduct.api.BasketProductDto;
import com.ecommerce.basketProduct.api.BasketProductService;
import com.ecommerce.order.api.OrderDto;
import com.ecommerce.order.impl.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BasketProductSeviceImpl implements BasketProductService {
    @Autowired
    BasketProductRepository repository;


    @Override
    public  BasketProductDto toDto(BasketProduct basketProduct) {
        return BasketProductDto.builder()
                .basketProductId(basketProduct.getBasketProductId())
                .count(basketProduct.getCount())
                .basketProductPrice(basketProduct.getBasketProductPrice())
                .productId(basketProduct.getProduct().getProductId())
                .build();
    }
}
