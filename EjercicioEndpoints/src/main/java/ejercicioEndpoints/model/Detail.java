package ejercicioEndpoints.model;

public class Detail {

	private String date;
	private String content;
	private String type;
	private String budget;
	private Project project;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBudget() {
		return budget;
	}
	public void setBudget(String budget) {
		this.budget = budget;
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	@Override
	public String toString() {
		return "Detail [getDate()=" + getDate() + ", getContent()=" + getContent() + ", getType()=" + getType()
				+ ", getBudget()=" + getBudget() + ", getProject()=" + getProject() + "]";
	}
	
}
