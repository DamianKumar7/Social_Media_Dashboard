package com.trendogram.DataCollectionMicroService.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trendogram.DataCollectionMicroService.Repositories.CommentRepository;

@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;

    // @Autowired
    // private UserService userService;

    @Autowired
    private SocialMediaPostService socialMediaPostService;

    // Define methods for comment operations

    // // Example method: createComment
    // public Comment createComment(Long userId, Long postId, Comment comment) {
    //     User user = userService.getUserById(userId);
    //     SocialMediaPost post = socialMediaPostService.getPostById(postId);

    //     comment.setUser(user);
    //     comment.setPost(post);

    //     return commentRepository.save(comment);
    // }

    // Other comment methods
}
