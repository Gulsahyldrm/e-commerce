package com.ecommerce.category.web;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CategoryResponse {

    public int categoryId;
    public String categoryName;


}
