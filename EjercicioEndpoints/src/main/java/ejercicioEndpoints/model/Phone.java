package ejercicioEndpoints.model;

public class Phone {

	private Integer value;
	private String type;
	private User user;
	
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
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Phone [getValue()=" + getValue() + ", getType()=" + getType() + ", getUser()=" + getUser() + "]";
	}
	
	
}
