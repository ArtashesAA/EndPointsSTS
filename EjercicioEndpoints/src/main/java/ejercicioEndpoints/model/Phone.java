package ejercicioEndpoints.model;

public class Phone {

	private Integer value;
	private String type;

	public Phone() {

	}

	public Phone(Integer value, String type) {
		this.value = value;
		this.type = type;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Phone [getValue()=" + getValue() + ", getType()=" + getType() + "]";
	}

}
