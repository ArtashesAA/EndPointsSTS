package ejercicioEndpoints.model;

public class User {

	private Integer id;
	private String nick;
	private String name;
	private Project project;
	private Blog blog;

	public User() {

	}

	public User(Integer id, String nick, String name, Project project, Blog blog) {
		this.id = id;
		this.nick = nick;
		this.name = name;
		this.project = project;
		this.blog = blog;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public Blog getBlog() {
		return blog;
	}

	public void setBlog(Blog blog) {
		this.blog = blog;
	}

	@Override
	public String toString() {
		return "User [getIdUser()=" + getId() + ", getNick()=" + getNick() + ", getName()=" + getName()
				+ ", getProject()=" + getProject() + ", getBlog()=" + getBlog() + "]";
	}

}
