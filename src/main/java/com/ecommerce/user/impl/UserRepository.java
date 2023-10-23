package com.ecommerce.user.impl;

import com.ecommerce.user.impl.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
