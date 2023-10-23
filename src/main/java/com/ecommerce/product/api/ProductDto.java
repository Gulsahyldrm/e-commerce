package com.ecommerce.product.api;

import com.ecommerce.category.impl.Category;
import com.ecommerce.product.impl.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {
    public int productId;
    public String productName;
    public double price;
    public Category categoryId;

    public static ProductDto toDto(Product product) {
        return ProductDto.builder()
                .productId(product.getProductId())
                .productName(product.getProductName())
                .price(product.getPrice())
                .categoryId(product.getCategory())
                .build();
    }
}
