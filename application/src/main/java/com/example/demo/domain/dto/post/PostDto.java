package com.example.demo.domain.dto.post;

import com.example.demo.entity.Post;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PostDto {

    private Long seq;

    private String title;

    private String content;

    public static PostDto of(Post post) {
        return PostDto.builder()
                .seq(post.getSeq())
                .title(post.getTitle())
                .content(post.getContent())
                .build();
    }
}
