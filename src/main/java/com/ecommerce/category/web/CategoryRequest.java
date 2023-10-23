package com.ecommerce.category.web;

import com.ecommerce.category.api.CategoryDto;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CategoryRequest {
    public int categoryId;
    public String categoryName;

    public CategoryDto toDto(){
        return CategoryDto.builder()
                .categoryId(categoryId)
                .categoryName(categoryName)
                .build();
    }
}
