package ex221111;

public class Tv {

	int channel;
	String color;
	

	public void print() {
		System.out.printf("Tv의 현재 채널은 : %d이고, Tv의 색깔은 %s입니다.", channel, color);
		
	}
	
	public void channelUp() {
		++channel;
	}
	
	public void channelDown() {
		--channel;
	}
	
}
