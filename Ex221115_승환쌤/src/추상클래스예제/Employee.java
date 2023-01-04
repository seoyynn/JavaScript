package 추상클래스예제;

public abstract class Employee {
	
	// 1. 사번, 이름, 연봉 또는 시급을 저장할 수 있는 필드값 만들기
	String empno;
	String name;
	int pay;
	int workDay;
	
	// 2.월급을 계산하는 기능 getMoneyPay -> 추상메소드
	public abstract int getMoneyPay();
	
	// 3. 사번 : 이름 : 연봉을 출력시키는 print() -> 일반메소드
	
	public void print() {
		System.out.printf("%s : %s : %d%n", empno, name, pay);
	}

}
