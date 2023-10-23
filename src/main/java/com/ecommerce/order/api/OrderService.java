package com.ecommerce.order.api;

import com.ecommerce.order.api.OrderDto;
import com.ecommerce.order.impl.Order;

import java.util.List;

public interface OrderService {
   public OrderDto createOrder(OrderDto orderDto);
    public List<Order> findOrderByUserId(int  id);



}
