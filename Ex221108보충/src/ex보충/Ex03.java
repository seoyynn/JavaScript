package ex보충;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		// 랜덤함수
		Random rd = new Random();

		int num1 = rd.nextInt(100); // 10을 포함하고 있지 않음, 0-9
		System.out.println(num1 + 1);// +1을 하면 0은 나오지않고 0-10까지 나옴

		System.out.println("-------------------------");
		// 1. 정수형 데이터 5개 보관할 수 있는 numbers 배열 생성
		// 2. 배열의 모든 인덱스 안에 있는 데이터를 랜덤한 값으로 변경
		// 3. 배열안에 있는 값을 한번에 출력

		int[] numbers = new int[5];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = rd.nextInt(10) + 1;
			System.out.print(numbers[i] + " ");

		}
		System.out.println();
		
		// 배열 안에 있는 값을 한번에 출력하는 방법
		System.out.println(Arrays.toString(numbers));
		
		

	}

}
