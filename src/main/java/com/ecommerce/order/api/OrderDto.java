package com.ecommerce.order.api;

import com.ecommerce.basketProduct.api.BasketProductDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {
    public int orderId;
    public String orderName;
    public int userId;
    public List<BasketProductDto> productList;
}


