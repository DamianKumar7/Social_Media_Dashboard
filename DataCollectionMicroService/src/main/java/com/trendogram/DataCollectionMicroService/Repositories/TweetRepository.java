package com.trendogram.DataCollectionMicroService.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trendogram.DataCollectionMicroService.Entities.Tweet;

@Repository
public interface TweetRepository extends JpaRepository<Tweet, Long> {
}
