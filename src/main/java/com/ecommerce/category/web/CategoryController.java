package com.ecommerce.category.web;

import com.ecommerce.category.api.CategoryDto;
import com.ecommerce.category.api.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@RestController
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @PostMapping
    public CategoryResponse createCategory(@RequestBody CategoryRequest request){
        return toResponse(categoryService.addCategory(request.toDto()));
    }

    @GetMapping
    public List<CategoryResponse> getCategories(){
        List<CategoryResponse> getCategories = categoryService.findOrderByProductId().stream()
                .map(this::toResponse)
                .collect(Collectors.toList());
        return getCategories;
    }

    private CategoryResponse toResponse(CategoryDto dto){
        return CategoryResponse.builder()
                .categoryId(dto.categoryId)
                .categoryName(dto.categoryName)
                .build();
    }


}
