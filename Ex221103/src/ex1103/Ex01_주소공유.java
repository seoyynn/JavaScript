package ex1103;

public class Ex01_주소공유 {

	public static void main(String[] args) {
		
		// 배열 -> 레퍼런스 변수(참조변수) -> 주소값을 저장함
		// 주소를 공유할 수 있다 -> 같은 공간을 공유할 수 있다

		int[] intArray = new int[5];
		int[] myArray = intArray;
		
		System.out.println(intArray);
		System.out.println(myArray); // -> 주소 같음
		
		intArray[1] = 5;
		
		System.out.println(intArray[1]);
		System.out.println(myArray[1]); // -> intArray 의 값이 나옴
		
		myArray[1] = 7;
		
		System.out.println(intArray[1]);
		System.out.println(myArray[1]); // -> myArray 의 값이 나옴
		
		
	}

}
