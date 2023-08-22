package com.trendogram.DataCollectionMicroService.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trendogram.DataCollectionMicroService.Repositories.SocialMediaPostRepository;

@Service
public class SocialMediaPostService {
    @Autowired
    private SocialMediaPostRepository socialMediaPostRepository;

    // @Autowired
    // private UserService userService;

    // Define methods for social media post operations

    // Example method: createPost
    // public SocialMediaPost createPost(Long userId, SocialMediaPost post) {
    //     User user = userService.getUserById(userId);
    //     post.setUser(user);
    //     return socialMediaPostRepository.save(post);
    // }

    // Other social media post methods
}
