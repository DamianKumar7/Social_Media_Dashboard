package com.trendogram.DataCollectionMicroService.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.social.twitter.api.impl.TwitterTemplate;

@Configuration
public class TwitterConfig {

    private final String consumerKey = "oQzuZlCFr6vCrXLgpF5eHjtJC";
    private final String consumerSecret = "CJPxol2LGutKtT2KOUXqmrM1ZofXbzVTvrHKaqTSQmv0yyDQJF";
    private final String accessToken = "1276583108989448197-dl2ekgrJPIv5v0sgT5gEQgMKpDH4I9";
    private final String accessTokenSecret = "qSHEkiZ8ptj6VruPmUUnG08CuUwyxLekJ9valay4aTpnz";

    @Bean
    public TwitterTemplate twitterTemplate() {
        return new TwitterTemplate(consumerKey, consumerSecret, accessToken, accessTokenSecret);
    }
}
