package com.ecommerce.order.impl;

import com.ecommerce.order.impl.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order,Integer> {
    List<Order> findOrderByUser_UserId(int userId);
}
