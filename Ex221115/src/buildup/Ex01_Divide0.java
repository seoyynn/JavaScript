package buildup;

public class Ex01_Divide0 {
	// Divide0 -> 0으로 나누겠다
	public static void main(String[] args) {
		
		// 자바의 오류
		// 1. 컴파일 오류 : 문법적인 오류
		System.out.println("컴파일오류");
		
		// 2. 런타임 오류 : 문법적인 오류는 아니지만, 실행 시에 나타나는 오류
//		System.out.println(100 / 0);
		
		// try문에서 예외사항이 발생했을 경우
		// catch문에서 잡아줌
		try {
			// 무조건 한번은 실행되어야함 (do-while의 do같은경우?)
			System.out.println(100 / 0);

		}catch(ArithmeticException e) {
			
			System.out.println("0으로 나누셨네용");
			
		}
		
		System.out.println("다음코드");
		
	}

}
