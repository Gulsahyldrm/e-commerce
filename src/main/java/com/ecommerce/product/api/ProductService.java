package com.ecommerce.product.api;

import java.util.List;

public interface ProductService {

    public ProductDto addProduct(ProductDto product);
    public ProductDto findProduct(int productId);
    public List<ProductDto> findProductsByCategoryId(int categoryId);

}
