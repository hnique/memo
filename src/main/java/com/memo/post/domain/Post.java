package com.memo.post.domain;

import java.time.ZonedDateTime;

import lombok.Data;
import lombok.ToString;

@Data  // getter, setter
@ToString
public class Post {
	private int id;
	private int userId;
	private String subject;
	private String content;
	private String imagePath;
	private ZonedDateTime createdAt;
	private ZonedDateTime updatedAt;
}
