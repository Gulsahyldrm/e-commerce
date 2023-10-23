package com.ecommerce.product.impl;

import com.ecommerce.product.api.ProductDto;
import com.ecommerce.product.api.ProductService;
import com.ecommerce.product.impl.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public ProductDto addProduct(ProductDto product)
    {
        var result = productRepository.save(fromDto(product));
        return ProductDto.toDto(result);

    }

    @Override
    public ProductDto findProduct(int productId) {
       var find = productRepository.findById(productId).get();
        return toDto(find);
    }



    public ProductDto fromEntity(Product product) {
        return ProductDto.builder()
                .productId(product.getProductId())
                .productName(product.getProductName())
                .price(product.getPrice())
                .build();

    }

    public List<ProductDto>fromEntityList(List<Product> productList){
        List<ProductDto> dtoList = new ArrayList<>();
        for (Product product : productList) {
            dtoList.add(fromEntity(product));
        }
        return dtoList;
    }
    @Override
    public List<ProductDto> findProductsByCategoryId(int categoryId){
        return fromEntityList(productRepository.findAllByCategory_CategoryId(categoryId));
    }

    public ProductDto toDto(Product product){
        return ProductDto.builder()
                .productId(product.getProductId())
                .productName(product.getProductName())
                .price(product.getPrice())
                .categoryId(product.getCategory())
                .build();
    }

    public  Product fromDto(ProductDto dto){
        return Product.builder()
                .productId(dto.productId)
                .productName(dto.productName)
                .price(dto.price)
                .category(dto.categoryId)
                .build();
    }

}
