package com.ecommerce.user.impl;

import com.ecommerce.user.api.UserDto;
import com.ecommerce.user.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;
    @Override
    public UserDto save(UserDto user) {
        var result = userRepository.save(fromDto(user));
        return toDto(result);
    }

    @Override
    public UserDto findUser(int userId) {
       var result = userRepository.findById(userId).get();
        return toDto(result);
    }

    @Override
    public User getEntityUser(int userId) {
        var result = userRepository.findById(userId).get();
        return result;
    }


    public static UserDto toDto(User user) {
        return UserDto.builder()
                .userId(user.userId)
                .birthDate(user.birthDate)
                .fullName(user.fullName)
                .userName(user.userName)
                .build();
    }
    public User fromDto(UserDto dto) {
        return User.builder()
                .userId(dto.userId)
                .birthDate(dto.birthDate)
                .fullName(dto.fullName)
                .userName(dto.userName)
                .password(dto.password)

                .build();
    }
}
