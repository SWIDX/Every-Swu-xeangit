package com.web.community.springboot.web.dto;


import com.web.community.springboot.domain.posts.Posts;
import lombok.Getter;

@Getter
public class PostsResponseDto {

    final Long id;
    final String title;
    final String content;
    final String author;

    public PostsResponseDto(Posts entity){
        this.id = entity.getId();
        this.title= entity.getTitle();
        this.content= entity.getContent();
        this.author=entity.getAuthor();
    }

}
