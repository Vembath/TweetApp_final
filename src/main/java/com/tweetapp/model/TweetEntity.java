package com.tweetapp.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@Document(collection = "tweets")
public class TweetEntity {
	@Id
	//@GeneratedValue

	@NotNull
	private String id;

	private String email;

	@NotNull
	private String body;

	private int likes = 0;               // Default value of likes during creation is 0
	private Date timestamp = new Date(); // Default date is taken as current date

	//	@JoinColumn(name = "id", referencedColumnName = "id")
	//@OneToMany(targetEntity = ReplyEntity.class, cascade = CascadeType.ALL, mappedBy = "id")
	private List<ReplyEntity> replies;

	public TweetEntity(String email, String body) {
		this.email = email;
		this.body = body;
	}

}
