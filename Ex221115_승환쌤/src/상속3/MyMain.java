package 상속3;

public class MyMain {

	public static void main(String[] args) {

		//피카츄, 꼬부기, 파이리 인형을 머신을 통해 뽑아주세용!
		
		Machine ma = new Machine();
		Pika pika = new Pika();
		Kkobuck kko = new Kkobuck();
		Piri piri = new Piri();
		Eevee ev = new Eevee();
		
		ma.pickPocket(kko);
		ma.pickPocket(pika);
		ma.pickPocket(piri);
		ma.pickPocket(ev);
		
	}

}
