package com.ecommerce.order.impl;

import com.ecommerce.basketProduct.impl.BasketProduct;
import com.ecommerce.user.impl.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int orderId;

    private String orderName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userId")
    public User user;

    @OneToMany(mappedBy = "basket", cascade = CascadeType.ALL)
    private List<BasketProduct> productList;





}
