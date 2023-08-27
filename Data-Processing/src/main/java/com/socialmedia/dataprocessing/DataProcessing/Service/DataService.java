package com.socialmedia.dataprocessing.DataProcessing.Service;


import com.socialmedia.dataprocessing.DataProcessing.DTO.Tweet;
import com.socialmedia.dataprocessing.DataProcessing.DTO.UserDetails;
import com.socialmedia.dataprocessing.DataProcessing.Model.TweetData;
import com.socialmedia.dataprocessing.DataProcessing.Repository.TwitterDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataService {

    @Autowired
    TwitterDataRepository twitterDataRepository;

    public Tweet getTweetWithHighestLikes(UserDetails userDetails) {
        String emailId = userDetails.getEmailId();

        TweetData tweetData = twitterDataRepository.findTweetWithHighestLikes(emailId);
        if(tweetData!= null){
            Tweet tweet = new Tweet();
            tweet.setTweetId(tweet.getTweetId());
            tweet.setLikeCount(tweetData.getLikeCount());
            tweet.setEmailId(tweetData.getEmailId());
            tweet.setRetweetCount(tweetData.getRetweetCount());
            tweet.setTweetBody(tweetData.getTweetBody());
            tweet.setTimestamp(tweetData.getTimestamp());

            return tweet;
        }

        return null;
    }
}
