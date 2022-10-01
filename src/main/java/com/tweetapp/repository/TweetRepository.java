package com.tweetapp.repository;

import com.tweetapp.model.TweetEntity;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TweetRepository extends MongoRepository<TweetEntity, String> {
	List<TweetEntity> findTweetByEmail(String email);
	Optional<TweetEntity> findTweetById(String id);

    @Query("{ 'email' : ?0,'id' : ?1 }")
	TweetEntity findByEmailAndId(String email, String id);
}
