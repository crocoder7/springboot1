package com.example.demo.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ApiRes<T> {

    private Integer code;
    private LocalDateTime responseTime;
    private T data;

    public ApiRes(T data) {
        this.data = data;
        this.responseTime = LocalDateTime.now();
    }

    public static ApiRes success() {
        return ApiRes.builder()
                .code(200)
                .responseTime(LocalDateTime.now())
                .build();
    }
}
