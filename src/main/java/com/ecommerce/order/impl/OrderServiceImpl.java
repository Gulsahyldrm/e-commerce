package com.ecommerce.order.impl;

import com.ecommerce.basketProduct.api.BasketProductService;
import com.ecommerce.basketProduct.impl.BasketProduct;
import com.ecommerce.order.api.OrderDto;
import com.ecommerce.order.api.OrderService;
import com.ecommerce.product.api.ProductService;
import com.ecommerce.product.impl.Product;
import com.ecommerce.user.api.UserService;
import com.ecommerce.user.impl.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepository orderRepository;
    @Autowired
    UserService userService;
    @Autowired
    BasketProductService basketProductService;
    @Autowired
    BasketProduct basketProduct;
    @Autowired
    OrderDto orderDto;
    @Autowired
    ProductService productService;
    @Autowired
    Order order;

    @Override
    public OrderDto createOrder( OrderDto orderDto) {
        var result = orderRepository.save(fromDto(new Order(),orderDto));
        return toDto(result);
    }
    @Override
    public List<Order> findOrderByUserId(int id) {
        User user = userService.getEntityUser(id);
          List<Order> orders =orderRepository.findOrderByUser_UserId(user.getUserId());
           return orders;

    }

    public Order fromDto(Order entity, OrderDto dto) {
       var user= userService.getEntityUser(dto.userId);
        entity.setUser(user);
        entity.setOrderName(dto.orderName);
        return entity;
    }


    public  OrderDto toDto(Order order) {
        return OrderDto.builder()
                .orderName(order.getOrderName())
                .orderId(order.orderId)
                .userId(order.getUser().getUserId())
                .build();
    }
}

