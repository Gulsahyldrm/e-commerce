package com.ecommerce.product.web;

import com.ecommerce.category.web.CategoryRequest;
import com.ecommerce.product.api.ProductDto;

public class ProductRequest {
    private String productName;
    private double price;
    private CategoryRequest category;

    public ProductDto toDto(){
        return ProductDto.builder()
                .productName(productName)
                .price(price)
                .build();
    }
}
