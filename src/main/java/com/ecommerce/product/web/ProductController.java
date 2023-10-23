package com.ecommerce.product.web;

import com.ecommerce.product.api.ProductDto;
import com.ecommerce.product.api.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@RestController
public class ProductController {

    @Autowired
    ProductService service;


    @PostMapping
    public ProductResponse createProduct(@RequestBody ProductRequest request){
        return toResponse(service.addProduct(request.toDto()));
    }

    @GetMapping("{id}")
    public ProductResponse findProduct(@PathVariable(value = "id")int id){
        return toResponse(service.findProduct(id));
    }

    @GetMapping
    public List<ProductResponse> listProducts(){

  //mapleme kullanılacak
          return null;
    }

    private ProductResponse toResponse(ProductDto dto){
        return ProductResponse.builder()
                .productId(String.valueOf(dto.productId))
                .productName(dto.productName)
                .price(dto.price)
                .build();
    }



}
