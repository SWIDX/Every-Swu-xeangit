package com.web.community.springboot.domain.posts;

import com.web.community.springboot.domain.posts.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> {

}