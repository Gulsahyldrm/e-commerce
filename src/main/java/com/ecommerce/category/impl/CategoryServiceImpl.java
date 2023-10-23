package com.ecommerce.category.impl;

import com.ecommerce.category.api.CategoryDto;
import com.ecommerce.category.api.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public CategoryDto addCategory(CategoryDto categoryDto){
        var category= categoryRepository.save(toEntity(categoryDto));
        return toDto(category);
    }

    @Override
    public List<CategoryDto> findOrderByProductId() {
        List<CategoryDto> categoryList =  categoryRepository.findAll().stream()
                .map(this::toDto)
                .collect(Collectors.toList());
        return categoryList;
    }
    public Category toEntity(CategoryDto dto){
        Category category = new Category();
        category.setCategoryName(dto.categoryName);
        return category;
    }
    public CategoryDto toDto(Category category){
        return CategoryDto.builder()
                .categoryId(category.getCategoryId())
                .categoryName(category.getCategoryName())
                .build();
    }
}
