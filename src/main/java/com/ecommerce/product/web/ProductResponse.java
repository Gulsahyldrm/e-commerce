package com.ecommerce.product.web;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductResponse {
    private String productId;
    private String productName;
    private double price;

}