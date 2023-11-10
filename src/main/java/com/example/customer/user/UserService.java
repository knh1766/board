package com.example.customer.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
@RequiredArgsConstructor
@Service
public class UserService {
    private  final UserJPARepository userJPARepository;
}
