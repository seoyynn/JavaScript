package 인터페이스;

public interface Person {
	
	// 인터페이스는 프로젝트가 시작될때
	// 필요한 기능들을 미리 정의하고 시작하는 기능!~!
	// ㄴ> 추상클래스보다 먼저 만들어지는 최초의 설계도
	
	// 변수 -> 상수 값만 올 수 있다
	int eyes = 2; // final 생략 --> public static final
	
	// 메소드 -> 추상메소드만 올 수 있다
	void sleep(); // abstract 생략 --> public abstract 생략가능!

}
