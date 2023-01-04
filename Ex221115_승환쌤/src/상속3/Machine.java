package 상속3;

public class Machine {
	
	// 뽑기기능필요!
	
	// 파이리 인형 뽑기 기능
//	public void pickPocket(Piri piri) {
//		piri.pick();
//	}
//	
//	// 꼬부기 인형 뽑기 기능
//	public void pickPocket(Kkobuck kkobuck) {
//		kkobuck.pick();
//	}
//	
//	// 피카츄 인형 뽑기 기능
//	public void pickPocket(Pika pika) {
//		pika.pick();
//	}
//
//	// 이브이 인형 뽑기 기능
//	public void pickPocket(Eevee eevee) {
//		eevee.pick();
//	}
	
	// 메소드 이름은 그대로 유지한채로
	// 다른 매개변수를 받아서 새로운 메소드를 만드는 기능!
	// -> 메소드 오버로딩 : 다형성!
	
	public void pickPocket(Pocket pocket) {
		pocket.pick();
	}

}
