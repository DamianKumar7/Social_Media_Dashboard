package com.socialmedia.dataprocessing.DataProcessing.Model;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "twitterdb")
public class TweetData {
    @Id
    @Column(name = "tweet_id")
    private Long tweetId;

    @Column(name = "email_id")
    private String emailId;

    @Column(name = "like_count")
    private Integer likeCount;

    @Column(name = "retweet_count")
    private Integer retweetCount;

    @Column(name = "timestamp")
    private Timestamp timestamp;

    @Column(name = "tweet_body")
    private String tweetBody;
}
