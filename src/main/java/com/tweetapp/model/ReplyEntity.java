package com.tweetapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.web.jsf.FacesContextUtils;

//import javax.persistence.*;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
//@Table(name = "replies")
public class ReplyEntity {
	@Id
	//@GeneratedValue
	//@Column(name = "reply_id")
	private String replyId;

//	@ManyToOne(fetch = FetchType.LAZY, optional = false)
//	@JoinColumn(name = "id", nullable = true)
//	private TweetEntity tweet;
	//@Column(nullable = true)
	private String id;
	private String body;
	private String email;
	private int likes = 0;
	private Date date = new Date();

//	public ReplyEntity(String email, String body, TweetEntity tweet) {
//		this.tweet = tweet;
	public ReplyEntity(String id, String email, String body) {
		this.id = id;
		this.email = email;
		this.body = body;
	}
}