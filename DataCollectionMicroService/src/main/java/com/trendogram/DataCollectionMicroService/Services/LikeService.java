package com.trendogram.DataCollectionMicroService.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trendogram.DataCollectionMicroService.Repositories.LikeRepository;

@Service
public class LikeService {
    @Autowired
    private LikeRepository likeRepository;

    // @Autowired
    // private UserService userService;

    @Autowired
    private SocialMediaPostService socialMediaPostService;

    // Define methods for like operations

    // Example method: addLikeToPost
    // public Like addLikeToPost(Long userId, Long postId) {
    //     User user = userService.getUserById(userId);
    //     SocialMediaPost post = socialMediaPostService.getPostById(postId);

    //     Like like = new Like();
    //     like.setUser(user);
    //     like.setPost(post);

    //     return likeRepository.save(like);
    // }

    // Other like methods
}
