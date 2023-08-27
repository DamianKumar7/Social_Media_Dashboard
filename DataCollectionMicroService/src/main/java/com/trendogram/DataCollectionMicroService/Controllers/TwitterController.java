package com.trendogram.DataCollectionMicroService.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.twitter.api.SearchResults;
import org.springframework.social.twitter.api.Tweet;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.trendogram.DataCollectionMicroService.Services.TwitterService;

@RestController
public class TwitterController {

    @Autowired
    private final TwitterService twitterService;

    public TwitterController(TwitterService twitterService) {
        this.twitterService = twitterService;
    }

    @GetMapping("/search")
    public SearchResults searchTweets(@RequestParam String query) {
        return twitterService.searchTweets(query);
    }

    @GetMapping("/timeline")
    public List<Tweet> getUserTimeline(@RequestParam String username) {
        return twitterService.getUserTimeline(username);
    }
}
