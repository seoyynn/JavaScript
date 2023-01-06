package model;

public class ClassDTO {
	
	private String id;
	private String pw;
	private String nick;
	private int age;
	

	public ClassDTO(String id, String pw, String nick, int age) {
		super();
		this.id = id;
		this.pw = pw;
		this.nick = nick;
		this.age = age;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPw() {
		return pw;
	}


	public void setPw(String pw) {
		this.pw = pw;
	}
	
	public String getNick() {
		return nick;
	}


	public void setNick(String nick) {
		this.nick = nick;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	

}
