package com.ecommerce.user.api;

import com.ecommerce.user.impl.User;

public interface UserService {
     UserDto save(UserDto user);

    UserDto findUser(int userId);


    User getEntityUser(int userId);
}
