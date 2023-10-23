package com.ecommerce.order.web;

import com.ecommerce.order.api.OrderDto;
import com.ecommerce.order.api.OrderService;
import com.ecommerce.product.web.ProductRequest;
import com.ecommerce.product.web.ProductResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class OrderController {
    @Autowired
    OrderService orderService;


    @PostMapping
    public OrderResponse createOrder(@RequestBody OrderRequest request){
        return toResponse(orderService.createOrder(request.toDto()));
    }

    @GetMapping("{id}")
    public OrderResponse findProduct(@PathVariable(value = "id")int id){
        return toResponse((OrderDto) orderService.findOrderByUserId(id));
    }

    private OrderResponse toResponse(OrderDto dto){
        return OrderResponse.builder()
                .orderId(dto.getOrderId())
                .orderName(dto.orderName)
                .build();

    }

}
