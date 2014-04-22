package br.com.elshaday.model.blog;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

import br.com.elshaday.model.user.User;

@XmlRootElement
@Entity
@Table(name="tb_comments")
@NamedQuery(name="Comment.list",query="SELECT c FROM Comments c")
public class Comments {
	
	@Id @GeneratedValue
	private Long id;
	private String text;
	@Temporal(TemporalType.DATE)
	private Calendar date;
	@OneToOne
	@JoinColumn(name="user_id")
	private User user;
	@OneToOne
	@JoinColumn(name="post_id")
	private Post post;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Calendar getDate() {
		return date;
	}
	public void setDate(Calendar date) {
		this.date = date;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Comments [id=" + id + ", text=" + text + ", date=" + date
				+ ", user=" + user + "]";
	}
	public Post getPost() {
		return post;
	}
	public void setPost(Post post) {
		this.post = post;
	}
	
	
	
}
