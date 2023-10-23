package com.ecommerce.basketProduct.api;

import com.ecommerce.product.api.ProductDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BasketProductDto {
    public int basketProductId;
    public double basketProductPrice;
    public int count;
    public int productId;
}
