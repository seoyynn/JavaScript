package ex보충;

import java.util.Random;

public class Ex04 {

	public static void main(String[] args) {


		Random rd = new Random();

		// 1. 5칸짜리 정수형 배열생성
		int[] numbers = new int[5];
		
		// 2. 1부터 100까지 랜덤한 수로 초기화시키기
		int cnt = 0;
		
		for(int i=0; i<numbers.length; i++) {
			numbers[i] = rd.nextInt(100)+1;
			
		}

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 1) {
				System.out.print(numbers[i] + " ");
				cnt++;
			}

		}
		System.out.println();
		// 3. 배열안의 수 중에서 홀수만 찾아서 출력
		System.out.println("홀수의 총 개수는 " + cnt + "개 입니다");
	}

}
