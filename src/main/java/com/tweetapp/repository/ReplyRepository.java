package com.tweetapp.repository;

import com.tweetapp.model.ReplyEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReplyRepository extends MongoRepository<ReplyEntity, String> {
//	@Query("INSERT INTO REPLIES r (tweet)")
//	ReplyEntity saveReplyByTweetId(long tweetId, String tweet);

//	@Query("SELECT t FROM TweetEntity t WHERE t.email = ?1 and t.id = ?2")
}
