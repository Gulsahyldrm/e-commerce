package com.ecommerce.basketProduct.web;

import com.ecommerce.basketProduct.api.BasketProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class BasketProductController {
    @Autowired
    BasketProductService basketProductService;
}
