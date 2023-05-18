package ejercicioEndpoints.model;

public class Article {

	private Integer id;
	private String title;
	private String abstracto;
	private String content;
	private Tag tag;

	public Article() {

	}
	
	public Article(Integer id, String title) {
		this.id = id;
		this.title = title;
	}

	public Article(Integer id, String title, String abstracto, String content, Tag tag) {
		this.id = id;
		this.title = title;
		this.abstracto = abstracto;
		this.content = content;
		this.tag = tag;
	}

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

	public String getAbstracto() {
		return abstracto;
	}

	public void setAbstracto(String abstracto) {
		this.abstracto = abstracto;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Tag getTag() {
		return tag;
	}

	public void setTag(Tag tag) {
		this.tag = tag;
	}

	@Override
	public String toString() {
		return "Article [getId()=" + getId() + ", getTitle()=" + getTitle() + ", getAbstracto()=" + getAbstracto()
				+ ", getContent()=" + getContent() + ", getTag()=" + getTag() + "]";
	}

}
