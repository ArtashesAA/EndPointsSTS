package ejercicioEndpoints.model;

public class Tag {

	private Integer id;
	private String label;
	private Integer anyo;
	private Article articulo;
	private Project project;

	public Tag() {

	}

	public Tag(Integer id, String label, Integer anyo, Article articulo, Project project) {
		this.id = id;
		this.label = label;
		this.anyo = anyo;
		this.articulo = articulo;
		this.project = project;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Integer getAnyo() {
		return anyo;
	}

	public void setAnyo(Integer anyo) {
		this.anyo = anyo;
	}

	public Article getArticulo() {
		return articulo;
	}

	public void setArticulo(Article articulo) {
		this.articulo = articulo;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	@Override
	public String toString() {
		return "Tag [getId()=" + getId() + ", getLabel()=" + getLabel() + ", getAnyo()=" + getAnyo()
				+ ", getArticulo()=" + getArticulo() + ", getProject()=" + getProject() + "]";
	}

}
