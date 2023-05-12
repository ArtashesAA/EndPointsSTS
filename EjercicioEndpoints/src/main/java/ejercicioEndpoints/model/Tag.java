package ejercicioEndpoints.model;

public class Tag {

	private Integer id;
	private String label;
	private String date;
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
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Tag [getId()=" + getId() + ", getLabel()=" + getLabel() + ", getDate()=" + getDate() + "]";
	}
	
	
	
}
