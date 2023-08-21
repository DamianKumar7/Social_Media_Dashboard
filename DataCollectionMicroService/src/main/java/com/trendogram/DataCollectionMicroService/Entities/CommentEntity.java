package com.trendogram.DataCollectionMicroService.Entities;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "comments")
public class CommentEntity {
    
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    // @ManyToOne
    // @JoinColumn(name = "user_id")
    // private User user;
    
    @ManyToOne
    @JoinColumn(name = "post_id")
    private SocialMediaPostEntity post;
    
    private LocalDateTime timestamp;
    private String content;
    private int likesCount;
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
    public LocalDateTime getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public int getLikesCount() {
        return likesCount;
    }
    public void setLikesCount(int likesCount) {
        this.likesCount = likesCount;
    }

    

    



}
