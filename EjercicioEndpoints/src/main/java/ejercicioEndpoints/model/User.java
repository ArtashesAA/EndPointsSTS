package ejercicioEndpoints.model;

public class User {

	private String id;
	private String nick;
	private String name;
	private Phone phone;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Phone getPhone() {
		return phone;
	}
	public void setPhone(Phone phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "User [getId()=" + getId() + ", getNick()=" + getNick() + ", getName()=" + getName() + ", getPhone()="
				+ getPhone() + "]";
	}
	
}
