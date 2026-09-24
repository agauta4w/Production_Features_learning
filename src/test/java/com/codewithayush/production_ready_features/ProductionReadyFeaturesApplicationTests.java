package com.codewithayush.production_ready_features;

import com.codewithayush.production_ready_features.dtos.PostDto;
import com.codewithayush.production_ready_features.entities.PostEntity;
import com.codewithayush.production_ready_features.repositories.PostRepository;
import com.codewithayush.production_ready_features.service.PostService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ProductionReadyFeaturesApplicationTests {

    @Autowired
    PostService postService;

	@Test
	void contextLoads() {
	}

//    @Test
//    public  void getAllTest(){
//
//        List<PostDto> allPost = postService.getAllPosts();
//        System.out.println(allPost);
//    }

}
