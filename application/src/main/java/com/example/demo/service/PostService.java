package com.example.demo.service;

import com.example.demo.domain.dto.post.PostCreateRequest;
import com.example.demo.domain.dto.post.PostDto;
import com.example.demo.entity.Post;
import com.example.demo.entity.User;
import com.example.demo.repository.PostRepository;
import com.example.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    private final UserRepository userRepository;

    @Transactional
    public PostDto post(PostCreateRequest postCreateRequest) {
        User user = userRepository.findById(1L).orElseThrow(() -> new RuntimeException("Cannot find the user"));

        Post post = Post.builder()
                .title(postCreateRequest.getTitle())
                .content(postCreateRequest.getContent())
                .user(user)
                .build();
        Post savedPost = postRepository.save(post);

        return PostDto.of(savedPost);
    }
}
