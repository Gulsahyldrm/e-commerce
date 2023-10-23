package com.ecommerce.order.web;

import com.ecommerce.order.api.OrderDto;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OrderRequest {

    public int orderId;
    public String orderName;

    public OrderDto toDto(){
        return OrderDto.builder()
                .orderId(orderId)
                .orderName(orderName)
                .build();
    }


}
