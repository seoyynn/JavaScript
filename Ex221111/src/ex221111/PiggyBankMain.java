package ex221111;


public class PiggyBankMain {

	public static void main(String[] args) {
		
		// 스캐너처럼 생성먼저 하고나서
		PiggyBank pig1 = new PiggyBank();
		
		// 변수 불러와!
		pig1.deposit(1500);
		pig1.withdraw(700);
		pig1.showMoney();
		
	}

}
