package com.ecommerce.category.api;

import com.ecommerce.category.impl.Category;

import java.util.List;

public interface CategoryService {


     CategoryDto addCategory(CategoryDto categoryDto);


     List<CategoryDto> findOrderByProductId();

}
