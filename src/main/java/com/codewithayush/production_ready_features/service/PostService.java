package com.codewithayush.production_ready_features.service;

import com.codewithayush.production_ready_features.dtos.PostDto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PostService {

    List<PostDto> getAllPosts();

    PostDto createNewPost(PostDto inputPost);

    PostDto getPostById(Long postId);
}
