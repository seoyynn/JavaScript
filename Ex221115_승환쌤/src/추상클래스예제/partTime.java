package 추상클래스예제;

public class partTime {

	public static void main(String[] args) {

		// PartTimeEmployee 객체를 만들어주세요!

		PartTimeEmployee pte = new PartTimeEmployee("001", "장서연", 100, 25);
		pte.print();
		System.out.println(pte.getMoneyPay()); // int타입이니까 출력문을 써줘야함
		
		System.out.println("===================");


		TempEmployee tel = new TempEmployee("002", "장두식", 30000000);
		tel.print();
		System.out.println(tel.getMoneyPay());
	}

}
