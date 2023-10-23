package com.ecommerce.basketProduct.api;

import com.ecommerce.basketProduct.impl.BasketProduct;

public interface BasketProductService {
    BasketProductDto toDto(BasketProduct basketProduct);

    void save(BasketProduct basketProduct);
}
