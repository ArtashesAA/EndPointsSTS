package ejercicioEndpoints.model;

public class Code {

	private Integer id;
	private Integer paquete;
	private String file;

	public Code() {

	}

	public Code(Integer id, Integer paquete, String file) {
		this.id = id;
		this.paquete = paquete;
		this.file = file;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPaquete() {
		return paquete;
	}

	public void setPaquete(Integer paquete) {
		this.paquete = paquete;
	}

	@Override
	public String toString() {
		return "Code [getPaquete()=" + getPaquete() + ", getFile()=" + getFile() + ", getId()=" + getId() + "]";
	}

}
