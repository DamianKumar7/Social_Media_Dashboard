package com.trendogram.DataCollectionMicroService.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trendogram.DataCollectionMicroService.Entities.SocialMediaPostEntity;
import com.trendogram.DataCollectionMicroService.Services.SocialMediaPostService;

@RestController
@RequestMapping("/posts")
public class SocialMediaPostController {
    @Autowired
    private SocialMediaPostService socialMediaPostService;

    // Define endpoints for social media post operations

    // @PostMapping("/{userId}")
    // public ResponseEntity<SocialMediaPostEntity> createPost(@PathVariable Long userId, @RequestBody SocialMediaPostEntity post) {
    //     SocialMediaPostEntity createdPost = socialMediaPostService.createPost(userId, post);
    //     return ResponseEntity.status(HttpStatus.CREATED).body(createdPost);
    // }

    // Other social media post endpoints
}
