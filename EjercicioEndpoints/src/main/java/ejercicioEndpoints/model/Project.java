package ejercicioEndpoints.model;

public class Project {

	private Integer id;
	private String description;
	private String language;
	private Boolean open;
	private Detail detail;
	
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
	public Boolean getOpen() {
		return open;
	}
	public void setOpen(Boolean open) {
		this.open = open;
	}
	public Detail getDetail() {
		return detail;
	}
	public void setDetail(Detail detail) {
		this.detail = detail;
	}
	
	@Override
	public String toString() {
		return "Project [getId()=" + getId() + ", getDescription()=" + getDescription() + ", getLanguage()="
				+ getLanguage() + ", getOpen()=" + getOpen() + ", getDetail()=" + getDetail() + "]";
	}
	
	
}
