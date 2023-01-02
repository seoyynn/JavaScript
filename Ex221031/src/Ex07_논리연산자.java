
public class Ex07_논리연산자 {

	public static void main(String[] args) {

		
		// 논리연산자
		// 결과 값 : boolean 자료형
		// 부정연산자(NOT)
		// 앞선 값에 반대되는 값으로 나타내고 싶을 때 사용!
		boolean check = true;
		System.out.println(check);
		System.out.println(!check); // !-> 부정연산자
		
		
		// %%(AND)연산자, 곱 연산자
		// ||(OR)연산자, 합 연산자
		System.out.println((1 < 3) && (4 < 5)); // true
		System.out.println((2 < 1) && (4 < 5)); // false
		System.out.println((1 < 3) || (4 < 2)); // true
		System.out.println((2 < 1) || (4 < 2)); // false
		
		
	}

}
