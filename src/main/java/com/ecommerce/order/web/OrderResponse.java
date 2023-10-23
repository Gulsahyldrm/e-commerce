package com.ecommerce.order.web;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OrderResponse {

    public int orderId;
    public String orderName;


}
