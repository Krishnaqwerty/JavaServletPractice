package com.customtable.model;



import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "comments")
public class Comment {
	
	@Id
	@Column(name = "id", length = 5)
	private String id ;
	
	@Column(name = "user", length = 20)
	private String user;
	
	
	@Column(name = "comment", length = 100)
	private String comment ;
	
	@ManyToOne
	@JoinColumn(name = "blogid")
	private BlogPost blogpost;
	
	

	public Comment() {
		// TODO Auto-generated constructor stub
	}


	public Comment(String id, String user, String comment) {
		super();
		this.id = id;
		this.user = user;
		this.comment = comment;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getUser() {
		return user;
	}


	public void setUser(String user) {
		this.user = user;
	}


	public String getComment() {
		return comment;
	}


	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
	
	


	public BlogPost getBlogpost() {
		return blogpost;
	}


	public void setBlogpost(BlogPost blogpost) {
		this.blogpost = blogpost;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comment other = (Comment) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
	

}
