package com.socialmedia.dataprocessing.DataProcessing.DTO;


import lombok.*;


import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Tweet {

    private Long tweetId;

    private String emailId;

    private Integer likeCount;

    private Integer retweetCount;

    private Timestamp timestamp;

    private String tweetBody;


}
