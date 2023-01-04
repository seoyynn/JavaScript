package ex221111;

public class TvMain {

	public static void main(String[] args) {

		Tv t1 = new Tv();
		
		t1.channel = 7;
		t1.color = "red";
		t1.print();
		
		System.out.println();
		
		t1.channelUp();
		t1.channelUp();
		t1.print();
		
		System.out.println();
		
		t1.color = "black";
		t1.channelDown();
		t1.print();
		
	}

}
