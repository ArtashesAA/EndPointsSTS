package ejercicioEndpoints.model;

public class Project {

	private Integer id;
	private String description;
	private String language;
	private Boolean open;
	private Code code;
	private Detail detail;
	private User user;
	private Tag tag;

	public Project() {

	}

	public Project(Integer id, String description, String language, Boolean open, Code code, Detail detail,
			User user, Tag tag) {
		this.id = id;
		this.description = description;
		this.language = language;
		this.open = open;
		this.code = code;
		this.detail = detail;
		this.user = user;
		this.tag = tag;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public boolean isOpen() {
		return open;
	}

	public void setOpen(Boolean open) {
		this.open = open;
	}

	public Code getCode() {
		return code;
	}

	public void setCode(Code code) {
		this.code = code;
	}

	public Detail getDetail() {
		return detail;
	}

	public void setDetail(Detail detail) {
		this.detail = detail;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Tag getTag() {
		return tag;
	}

	public void setTag(Tag tag) {
		this.tag = tag;
	}

	@Override
	public String toString() {
		return "Project [getIdProject()=" + getId() + ", getDescription()=" + getDescription()
				+ ", getLanguage()=" + getLanguage() + ", isOpen()=" + isOpen() + ", getCode()=" + getCode()
				+ ", getDetail()=" + getDetail() + ", getUser()=" + getUser() + ", getTag()=" + getTag() + "]";
	}

}
