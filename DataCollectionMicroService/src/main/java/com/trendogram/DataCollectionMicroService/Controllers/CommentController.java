package com.trendogram.DataCollectionMicroService.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trendogram.DataCollectionMicroService.Entities.CommentEntity;
import com.trendogram.DataCollectionMicroService.Services.CommentService;

@RestController
@RequestMapping("/comments")
public class CommentController {
    @Autowired
    private CommentService commentService;

    // Define endpoints for comment operations

    // @PostMapping("/{userId}/{postId}")
    // public ResponseEntity<CommentEntity> createComment(
    //     @PathVariable Long userId, @PathVariable Long postId, @RequestBody CommentEntity comment) {
    //     CommentEntity createdComment = commentService.createComment(userId, postId, comment);
    //     return ResponseEntity.status(HttpStatus.CREATED).body(createdComment);
    // }

    // Other comment endpoints
}
