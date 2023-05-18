package ejercicioEndpoints.model;

public class Detail {

	private Integer anyo;
	private String content;
	private String type;
	private Double budget;

	public Detail() {

	}

	public Detail(Integer anyo, String content, String type, Double budget) {
		this.anyo = anyo;
		this.content = content;
		this.type = type;
		this.budget = budget;
	}

	public Integer getAnyo() {
		return anyo;
	}

	public void setAnyo(Integer anyo) {
		this.anyo = anyo;
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

	public Double getBudget() {
		return budget;
	}

	public void setBudget(Double budget) {
		this.budget = budget;
	}

	@Override
	public String toString() {
		return "Detail [getAnyo()=" + getAnyo() + ", getContent()=" + getContent() + ", getType()=" + getType()
				+ ", getBudget()=" + getBudget() + "]";
	}

}
