package ex보충;

public class Ex01_배열 {

	public static void main(String[] args) {

		// 배열 : 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
		// new : 레퍼런스 변수 생성할 때 쓰임
		// 레퍼런스 변수 : 배열을 찾아갈 수 있는 주소값

		// 정수형 데이터5개를 보관할 수 있는 arr 배열 생성
		int[] arr = new int[5];
		System.out.println(arr);
		System.out.println(arr[2]);

		arr[2] = 7;
		System.out.println(arr[2]);

		// 배열을 생성함과 동시에 데이터를 집어넣는 방법
		String[] names = { "임경남", "장서연", "신인호" };
		System.out.println(names[0]);

	}

}
