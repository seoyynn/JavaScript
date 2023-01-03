package ex221108;

public class Ex01_변수O리턴O {

	public static void main(String[] args) {

		System.out.println(sum(2, 5)); // 결과값을 보고싶으면 syso()안에 메소드 넣어줘야함
		sum(2, 5);
	}

	public static int sum(int a, int b) {

		int result = a + b;

		return result; // return 0; -> 에러보기싫어서 아무정수나 써줌
	}

}
