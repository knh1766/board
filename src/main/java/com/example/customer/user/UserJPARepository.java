package com.example.customer.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJPARepository  extends JpaRepository<User,Integer> {
}
