
public class Ex01_산술연산자 {

	public static void main(String[] args) {

		 int num1 = 7;
		 int num2 = 3;
		 
		 System.out.println(num1 + num2); // 더하기
		 System.out.println(num1 - num2); // 빼기
		 System.out.println(num1 / num2); // 몫
		 System.out.println(num1 % num2); // 나머지
		 System.out.println(num1 * num2); // 곱하기
		 
		 double num3 = 7.0;
		 double num4 = 3.0;
		 
		 // 정수 연산 정수 -> 정수
		 System.out.println(num1 / num2);
		 // 실수 연산 실수 -> 실수
		 System.out.println(num3 / num4);
		 // 정수 연산 실수 -> 실수
		 System.out.println(num1 / num4);
		
	}

}
