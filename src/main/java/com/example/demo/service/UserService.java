package com.example.demo.service;

import com.example.demo.domain.dto.user.UserDto;
import com.example.demo.domain.entity.User;
import com.example.demo.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public UserDto findUserById(Long seq) {
        User user = userRepository.findById(seq).orElseThrow(() -> new RuntimeException("Cannot find the user"));
        return UserDto.of(user);
    }
}
