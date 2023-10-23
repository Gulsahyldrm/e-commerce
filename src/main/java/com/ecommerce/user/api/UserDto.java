package com.ecommerce.user.api;

import com.ecommerce.user.impl.User;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    public int userId;
    public String userName;
    public String password;
    public String fullName;
    public String birthDate;






}

