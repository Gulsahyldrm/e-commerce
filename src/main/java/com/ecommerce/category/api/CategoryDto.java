package com.ecommerce.category.api;

import com.ecommerce.product.api.ProductDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDto {
    public int categoryId;
    public String categoryName;
    public List<ProductDto> productList;
}
