package ex221108;

public class Ex00_메소드 {

	public static void main(String[] args) {

		System.out.println(100 + 2);
		System.out.println(100 - 2);
		System.out.println(100 * 2);
		System.out.println(100 / 2);

		System.out.println("--------------------");

		// add메소드 호출
		add(5, 10);
		sub(5, 10);
		mul(5, 10);
		div(10, 5);
	}

	// 메소드 구조
	// 1. 접근제한자 - public(내/외부에서 접근 가능한 제한자)
	// 2. static - 저장 위치
	// 3. 리턴타입 - return 키워드 사용해서 반환
	// ㄴ> 리턴값이 없는경우 -> 리턴타입 자리에 void
	// 4. 메소드이름(메소드에서 쓰일 매개변수 나열)

	public static void add(int a, int b) {
		System.out.println(a + b);
	}

	public static void sub(int a, int b) {
		System.out.println(a - b);
	}

	public static void mul(int a, int b) {
		System.out.println(a * b);
	}

	public static void div(int a, int b) {
		System.out.println(a / b);
	}

}
