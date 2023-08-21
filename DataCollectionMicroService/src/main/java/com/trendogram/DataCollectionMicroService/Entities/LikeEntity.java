package com.trendogram.DataCollectionMicroService.Entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class LikeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    // @ManyToOne
    // @JoinColumn(name = "user_id")
    // private User user;
    
    @ManyToOne
    @JoinColumn(name = "post_id")
    private SocialMediaPostEntity post;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SocialMediaPostEntity getPost() {
        return post;
    }

    public void setPost(SocialMediaPostEntity post) {
        this.post = post;
    }


    
    
}
