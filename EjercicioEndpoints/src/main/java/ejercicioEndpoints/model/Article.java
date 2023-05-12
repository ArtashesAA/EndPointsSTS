package ejercicioEndpoints.model;

public class Article {

	private Integer id;
	private String title;
	private Boolean abstracto;
	private String content;
	private Blog blog;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Boolean getAbstracto() {
		return abstracto;
	}
	public void setAbstracto(Boolean abstracto) {
		this.abstracto = abstracto;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Blog getBlog() {
		return blog;
	}
	public void setBlog(Blog blog) {
		this.blog = blog;
	}
	@Override
	public String toString() {
		return "Article [getId()=" + getId() + ", getTitle()=" + getTitle() + ", getAbstracto()=" + getAbstracto()
				+ ", getContent()=" + getContent() + ", getBlog()=" + getBlog() + "]";
	}
	
	
}
