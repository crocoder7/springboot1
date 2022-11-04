package com.example.demo.domain.dto.user;

import com.example.demo.domain.dto.post.PostDto;
import com.example.demo.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private Long seq;

    private String userId;

    private String userName;

    private List<PostDto> postList;

    public static UserDto of(User user) {
        return UserDto.builder()
                .seq(user.getSeq())
                .userId(user.getUserId())
                .userName(user.getUserName())
                .postList(user.getPostList().stream().map(v -> PostDto.of(v)).collect(Collectors.toList()))
                .build();
    }
}
