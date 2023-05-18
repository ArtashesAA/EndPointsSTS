package ejercicioEndpoints.model;

public class Blog {

	private Integer id;
	private String title;
	private Integer anyo;
	private Article articulo;

	public Blog() {

	}

	public Blog(Integer id, String title, Integer anyo, Article articulo) {
		this.id = id;
		this.title = title;
		this.anyo = anyo;
		this.articulo = articulo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Blog [getTitle()=" + getTitle() + ", getId()=" + getId() + ", getAnyo()=" + getAnyo()
				+ ", getArticulo()=" + getArticulo() + "]";
	}

}
