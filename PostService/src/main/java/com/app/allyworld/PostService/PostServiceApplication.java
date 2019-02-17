package com.app.allyworld.PostService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.app.allyworld.PostService.entity.Comments;
import com.app.allyworld.PostService.entity.Likes;
import com.app.allyworld.PostService.entity.Post;
import com.app.allyworld.PostService.service.PostService;

@SpringBootApplication
//@EnableOAuth2Sso
/* @EnableWebSecurity */
public class PostServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner populateData(PostService postService) {
		return (arg) -> {
			List<Integer> likes = new ArrayList<>();
			likes.add(1);
			likes.add(2);
			List<Integer> comments = new ArrayList<>();
			comments.add(1);
			comments.add(2);
			comments.add(3);
			postService.addNewPost(new Post( 1, "Feeling Excited!!",
					"https://images.pexels.com/photos/67636/rose-blue-flower-rose-blooms-67636.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260",
					new Likes(1000, likes), new Comments(comments, "wow..nice!!", 10))); // Post
			/* newppost = postServiceImpl.addNewPost(post); */
		};
	}

}