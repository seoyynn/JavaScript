package ex1103;

public class Ex03_실습2_1 {

	public static void main(String[] args) {

		
		int[] intArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
		
		int a = 0;
		
		System.out.print("intArray에 들어있는 홀수는 ");
		for(int i = 0; i < intArray.length; i++) {
			
			if(i % 2 == 1) {
				System.out.print(intArray[i] + " ");
				a++;
				
			}
			
		}
		System.out.print("입니다." + " ");
		
		System.out.print("홀수의 총 개수는 " + a + "개 입니다.");
	}

}
