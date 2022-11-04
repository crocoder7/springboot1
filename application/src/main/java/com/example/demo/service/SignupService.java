package com.example.demo.service;

import com.example.demo.domain.dto.user.SignupRequest;
import com.example.demo.domain.dto.user.SignupResponse;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class SignupService {

    private final UserRepository userRepository;

    @Transactional
    public SignupResponse signUp(SignupRequest signupRequest) {
        User user = User.builder()
                .userId(signupRequest.getUserId())
                .userName(signupRequest.getUserName())
                .password(signupRequest.getPassword())
                .build();
        User savedUser = userRepository.save(user);
        return SignupResponse.of(savedUser);
    }
}
