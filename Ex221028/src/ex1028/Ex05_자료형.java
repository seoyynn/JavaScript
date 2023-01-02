package ex1028;

public class Ex05_자료형 {

	public static void main(String[] args) {

		// 1. 논리형
		// boolean : 1bit or 1byte (1과 0)
		// 참 혹은 거짓 (true or false) -> Java에서 소문자로 쓰기
		// 1byte = 8bit = 2^8 = 256가지
		
		// 지금 더운 상태를 저장하는 변수
		boolean isHot = false; // true
		System.out.println(isHot);
		
		// 2. 문자형
		// char : 2byte = 2^16 = 65536경우의 수를 가질 수 있음 (0부터 65536)
		// -> 모든 유니코드 문자 표현 가능 (알파벳, 아랍어 등등)
		char grade = 'A';
		char num = '4';
		char single = '\'';
				// 역슬래쉬를 사용하고싶으면 '\'' -> ( \t = 탭기능, \n = 엔터기능 )
		
		// 3. 정수형
		// byte (-128 ~ 127) -> 0포함
		byte age = 27;
		// short(-32768 ~ 32767) -> 0포함
		short lunch = 7000;
		// int (숫자 짱큼)
		int account = 2000000000;
		// long (대빵 짱큼)
		long microbe = 39000000000000L; //정수를 입력하면 int데이터타입으로 읽기때문에 맨 끝에 L(소문자,대문자 상관없음)을 꼭 써줘야 함.
		
		// 4. 실수형
		// float
		float height = 170.8F; //실수형의 대표 데이터타입은 double이기때문에 끝에 F 또는 값 앞에 (float)를 써줘서 float이라는걸 인식시켜줘야 함.
		//double
		double a = 123456789.123456789;
		
		
		char A = '아';
		char B = '찔';
		char C = '행';
		System.out.print(A);
		System.out.print(B);
		System.out.println(C);
		
		
		// 레퍼런스 타입 : 기본 데이터 타입 8개 이외의 타입 (다 대문자로 시작)
		// 자바 책 65p
		// 문자열을 담는 타입 -> String
		String name = "바보";
		System.out.println("한가연" + name);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
