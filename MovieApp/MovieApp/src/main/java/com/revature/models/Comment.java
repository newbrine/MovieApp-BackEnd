package com.revature.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "comment_table")
public class Comment {
	
	@Id
	@Column(name = "comment_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "comments")
	private String comments;
	
	@Column(name = "movie_id" )
	private int movieID;
	
	@Column(name = "user_id")
	private int userID;

	public Comment() {
		super();
	}

	public Comment(int id, String comment, int movieID, int userID) {
		super();
		this.id = id;
		this.comments = comment;
		this.movieID = movieID;
		this.userID = userID;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getComment() {
		return comments;
	}

	public void setComment(String comment) {
		this.comments = comment;
	}

	public int getMovieID() {
		return movieID;
	}

	public void setMovieID(int movieID) {
		this.movieID = movieID;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	@Override
	public String toString() {
		return "Comment [id=" + id + ", comment=" + comments + ", movieID=" + movieID + ", userID=" + userID + "]";
	}
	
	
	

}