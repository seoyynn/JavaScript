package ex221111;

public class PocketMon {
	
	// 필드
	String monName;
	String att;
	String type;
	
	
	// 메소드
	public PocketMon(String monName, String att, String type) {
		this.monName = monName;
		this.att = att;
		this.type = type;
	}


	public String getMonName() {
		return monName;
	}


	public void setMonName(String monName) {
		this.monName = monName;
	}


	public String getAtt() {
		return att;
	}


	// getter setter 메소드
	public void setAtt(String att) {
		this.att = att;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}
	
	
	
	

}
