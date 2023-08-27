package com.socialmedia.dataprocessing.DataProcessing.Repository;

import com.socialmedia.dataprocessing.DataProcessing.Model.TweetData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TwitterDataRepository extends JpaRepository<TweetData, Long> {

    // Add custom query methods here if needed

    List<TweetData> findByEmailId(String emailId);

    @Query("SELECT t FROM twitterdb t WHERE t.email_id = :emailId AND t.like_count = (SELECT MAX(td.like_count) FROM twitterdb td WHERE td.email_id = :emailId)")
    TweetData findTweetWithHighestLikes(@Param("emailId") String emailId);

}
