package com.example.demo.web.user;

import com.example.demo.dto.ApiRes;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/user/{seq}")
    public ApiRes findUserById(@PathVariable Long seq) {
        return new ApiRes<>(userService.findUserById(seq));
    }
}
