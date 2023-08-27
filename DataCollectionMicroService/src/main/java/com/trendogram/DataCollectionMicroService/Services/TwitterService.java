package com.trendogram.DataCollectionMicroService.Services;
import java.util.Date;
import java.util.List;

import org.springframework.social.twitter.api.SearchResults;
import org.springframework.stereotype.Service;

import com.trendogram.DataCollectionMicroService.Entities.Tweet;
import com.trendogram.DataCollectionMicroService.Entities.User;
import com.trendogram.DataCollectionMicroService.Repositories.TweetRepository;
import com.trendogram.DataCollectionMicroService.Repositories.UserFeignClient;

@Service
public class TwitterService {

    private final TweetRepository tweetRepository;
    private final UserFeignClient userFeignClient;

    public TwitterService(TweetRepository tweetRepository, UserFeignClient userFeignClient) {
        this.tweetRepository = tweetRepository;
        this.userFeignClient = userFeignClient;
    }

    public void saveTweet(String content, String username) {
        User user = userFeignClient.getUserByUsername(username);
        if (user != null) {
            Tweet tweet = new Tweet();
            tweet.setContent(content);
            tweet.setUsername(username);
            tweet.setCreatedAt(new Date());
            tweetRepository.save(tweet);
        }
    }

    public SearchResults searchTweets(String query) {
        return null;
    }

    public List<org.springframework.social.twitter.api.Tweet> getUserTimeline(String username) {
        return null;
    }
}
