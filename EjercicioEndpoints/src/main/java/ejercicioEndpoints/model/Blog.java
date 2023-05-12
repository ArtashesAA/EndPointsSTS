package ejercicioEndpoints.model;

public class Blog {
	private Integer id;
	private String title;
	private String date;
	private User user;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Blog [getId()=" + getId() + ", getTitle()=" + getTitle() + ", getDate()=" + getDate() + ", getUser()="
				+ getUser() + "]";
	}
	
}
