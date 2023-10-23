package com.ecommerce.user.web;

import com.ecommerce.user.api.UserDto;
import lombok.Builder;
import lombok.Data;

import java.util.SplittableRandom;

@Data
@Builder
public class UserRequest {

    public String userName;
    public String password;
    public String fullName;

    public UserDto toDto(){
        return UserDto.builder()
                .userName(userName)
                .password(password)
                .fullName(fullName)
                .build();
    }




}
