package com.blogApp.springbootbasic.repository;

import com.blogApp.springbootbasic.domain.Post;
import com.blogApp.springbootbasic.domain.PostStatus;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Repository

public interface PostRepository {

    void addPost(Post post);
    List<Post> getPost();

    Post getPostById(Integer id);

    int removePostById(Integer id);
    void updatePostById(Integer id, Post post);


}
