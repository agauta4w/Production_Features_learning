package com.codewithayush.production_ready_features.service;

import com.codewithayush.production_ready_features.dtos.PostDto;
import com.codewithayush.production_ready_features.entities.PostEntity;
import com.codewithayush.production_ready_features.exceptions.ResourceNotFoundException;
import com.codewithayush.production_ready_features.repositories.PostRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService{

    Logger log = LoggerFactory.getLogger(PostServiceImpl.class);

    private final PostRepository postRepository;
    private final ModelMapper modelMapper;

//    public PostServiceImpl(PostRepository postRepository) {
//        this.postRepository = postRepository;
//    }
    // In place of constructor using requiredArgsConstructor annotation from lombok


    @Override
    public List<PostDto> getAllPosts() {

        log.error("error log");
        log.warn("warn log");
        log.info("info log");
        log.trace("trace log");
        log.debug("debug log");

        return postRepository.findAll()
                .stream()
                .map(postEntity -> modelMapper.map(postEntity, PostDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public PostDto createNewPost(PostDto inputPost) {
        // Ensure POST creates a new entity even if client provided an id
        inputPost.setId(null);
        PostEntity postEntity = modelMapper.map(inputPost, PostEntity.class);
        return modelMapper.map(postRepository.save(postEntity), PostDto.class);
    }

    @Override
    public PostDto getPostById(Long postId) {
        PostEntity postEntity = postRepository
                .findById(postId).orElseThrow(() -> new ResourceNotFoundException("Post not found with id: " + postId));
        return modelMapper.map(postEntity, PostDto.class);
    }

    @Override
    public PostDto updatePost(Long postId, PostDto inputPost) {
        PostEntity postEntity = postRepository
                .findById(postId).orElseThrow(() -> new ResourceNotFoundException("Post not found with id: " + postId));
        modelMapper.map(inputPost, postEntity);
        return modelMapper.map(postRepository.save(postEntity), PostDto.class);
    }
}
