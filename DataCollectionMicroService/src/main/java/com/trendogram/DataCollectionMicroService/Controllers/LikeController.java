package com.trendogram.DataCollectionMicroService.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trendogram.DataCollectionMicroService.Entities.LikeEntity;
import com.trendogram.DataCollectionMicroService.Services.LikeService;


@RestController
@RequestMapping("/likes")
public class LikeController {
    @Autowired
    private LikeService likeService;

    // Define endpoints for like operations

    // @PostMapping("/{userId}/{postId}")
    // public ResponseEntity<LikeEntity> addLikeToPost(@PathVariable Long userId, @PathVariable Long postId) {
    //     LikeEntity like = likeService.addLikeToPost(userId, postId);
    //     return ResponseEntity.status(HttpStatus.CREATED).body(like);
    // }

    // Other like endpoints
}
