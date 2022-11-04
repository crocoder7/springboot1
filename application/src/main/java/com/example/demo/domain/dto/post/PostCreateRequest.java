package com.example.demo.domain.dto.post;

import lombok.Data;

@Data
public class PostCreateRequest {

    private String title;

    private String content;
}
