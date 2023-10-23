package com.ecommerce.user.web;

import com.ecommerce.user.api.UserDto;
import com.ecommerce.user.api.UserService;
import com.ecommerce.user.impl.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
@RequiredArgsConstructor
public class UserController {
    @Autowired
    UserService userService;



    @PostMapping("register")
    public UserResponse register(@RequestBody UserRequest userRequest) {
        return toResponse(userService.save(userRequest.toDto()));
    }



    @GetMapping("/{id}")
    public UserResponse find(@PathVariable(value = "id") String userId) {
        return toResponse(userService.findUser(Integer.parseInt(userId)));
    }

    public UserResponse toResponse(UserDto dto){
        return UserResponse.builder()
                .userId(dto.userId)
                .userName(dto.userName)
                .password(dto.password)
                .build();
    }


}
