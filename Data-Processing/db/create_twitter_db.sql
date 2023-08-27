-- Drop the existing twitterdb table if it exists
DROP TABLE IF EXISTS twitterdb;

-- Recreate the twitterdb table without email_id as primary key and foreign key
CREATE TABLE twitterdb (
    email_id VARCHAR(255),
    tweet_id BIGINT,
    like_count INT,
    retweet_count INT,
    timestamp TIMESTAMP,
    tweet_body TEXT,
    FOREIGN KEY (email_id) REFERENCES users (email_id)
);