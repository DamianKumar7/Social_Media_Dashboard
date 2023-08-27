package com.socialmedia.dataprocessing.DataProcessing.Repository;

import com.socialmedia.dataprocessing.DataProcessing.Model.TweetData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TweetDbRepository extends JpaRepository<TweetData, Long> {

    // Add custom query methods here if needed

    List<TweetData> findByEmailId(String emailId);

    @Query("SELECT t FROM TweetData t WHERE t.emailId = :emailId AND t.likeCount = (SELECT MAX(td.likeCount) FROM TweetData td WHERE td.emailId = :emailId)")
    TweetData findTweetWithHighestLikes(@Param("emailId") String emailId);

    @Query("SELECT t FROM TweetData t WHERE t.emailId = :emailId AND t.retweetCount = (SELECT MAX(td.retweetCount) FROM TweetData td WHERE td.emailId = :emailId)")
    TweetData findTweetWithHighestRetweets(@Param("emailId") String emailId);
}
