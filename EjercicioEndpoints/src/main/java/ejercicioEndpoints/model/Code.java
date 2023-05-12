package ejercicioEndpoints.model;

public class Code {

	private Integer id;
	private String packagee;
	private String file;
	private Project project;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPackagee() {
		return packagee;
	}
	public void setPackagee(String packagee) {
		this.packagee = packagee;
	}
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	@Override
	public String toString() {
		return "Code [getId()=" + getId() + ", getPackagee()=" + getPackagee() + ", getFile()=" + getFile()
				+ ", getProject()=" + getProject() + "]";
	}
	
	
	
}
