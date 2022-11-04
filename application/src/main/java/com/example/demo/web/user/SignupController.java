package com.example.demo.web.user;

import com.example.demo.domain.dto.user.SignupRequest;
import com.example.demo.dto.ApiRes;
import com.example.demo.service.SignupService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SignupController {

    private final SignupService signupService;

    @PostMapping(value = "/signUp")
    private ApiRes signUp(@RequestBody SignupRequest signupRequest) {
        return new ApiRes<>(signupService.signUp(signupRequest));
    }
}
