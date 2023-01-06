package model;

public class MenuDto {

	// 필드
	String id;
	String pw;
	String nick;

	// 생성자 메소드
	public MenuDto(String id, String pw, String nick) {
		super();
		this.id = id;
		this.pw = pw;
		this.nick = nick;
	}

	
	
	// getter/setter메소드
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


}
