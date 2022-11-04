package com.example.demo.domain.dto.user;

import com.example.demo.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SignupResponse {

    private Long userSeq;

    private String userId;

    private String userName;

    public static SignupResponse of(User user) {
        return SignupResponse.builder()
                .userSeq(user.getSeq())
                .userId(user.getUserId())
                .userName(user.getUserName())
                .build();
    }
}
