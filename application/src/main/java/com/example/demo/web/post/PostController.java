package com.example.demo.web.post;

import com.example.demo.domain.dto.post.PostCreateRequest;
import com.example.demo.dto.ApiRes;
import com.example.demo.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @PostMapping("/post")
    public ApiRes post(@RequestBody PostCreateRequest request) {
        return new ApiRes<>(postService.post(request));
    }
}
