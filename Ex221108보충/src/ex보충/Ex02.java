package ex보충;

public class Ex02 {

	public static void main(String[] args) {

		// 1. 정수형 데이터를 5개 보관할 수 있는 numbers 배열 생성
		// 생성하면서 값 1-5 넣어주기
		// 2. 배열 안에 있는 모든값을 출력

		int[] numbers = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
	}

}
