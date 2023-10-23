package com.ecommerce.user.web;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserResponse {

    public int userId;
    public String userName;
    public String password;



}
