package com.blogApp.springbootbasic.domain;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Post {
    private Integer id;
    @NotNull
    @Size(min = 3, max = 50, message = "Title must be minimum 3 characters and maximum 50 character")
    private String title;
    @NotNull
    @Size(min = 3, max = 500, message = "Description must be minimum 3 characters and maximum 500 characters")
    private String description;

    private String body;
    private PostStatus status;
    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;
    private List<Comment> comments;
}
