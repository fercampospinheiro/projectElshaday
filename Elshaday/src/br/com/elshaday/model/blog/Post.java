package br.com.elshaday.model.blog;

import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
@Entity
@Table(name="tb_post")
@NamedQuery(name="Post.list",query="SELECT p FROM Post p")
public class Post {

	@Id @GeneratedValue
	private Long id;
	private String title;
	private String text;
	
	@Temporal(TemporalType.DATE)
	private Calendar date;
	
	@OneToOne(cascade=CascadeType.ALL,orphanRemoval=true)
	@JoinColumn(name="category_id")
	private Category category;
	
	@OneToMany(cascade=CascadeType.ALL, orphanRemoval=true)
	private List<Comments> comments;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public List<Comments> getComments() {
		return comments;
	}
	public void setComments(List<Comments> comments) {
		this.comments = comments;
	}
	@Override
	public String toString() {
		return "Post [id=" + id + ", title=" + title + ", text=" + text
				+ ", date=" + date + ", category=" + category + ", comments="
				+ comments + "]";
	}
	 
	
	
}
