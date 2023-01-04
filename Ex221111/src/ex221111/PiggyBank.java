package ex221111;

public class PiggyBank {
	// 저금통 클래스
	
	// 필드
	int money;
	
	// 메소드
	// 1. 저금하는 메소드
	// 사용자가 입금할 돈을 입력하면(매개변수필요) 현재자산에(money)에 추가하는 기능
	public void deposit(int input) {
		money += input;
	}
	
	// 2. 출금하는 메소드
	// 사용자가 출금할 돈을 입력하면 현재자산에서 출금하는 기능
	public void withdraw(int output) {
		money -= output;
	}
	
	// 3. 잔액을 보여주는 메소드
	// 현재 재산을 출력하는 메소드
	public void showMoney() {
		System.out.println("현재 잔액(☞ﾟヮﾟ)☞ "+ money + "입니둥");
	}
	
	
	
	
}
