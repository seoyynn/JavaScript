package ex1109;

import java.util.Scanner;

public class Ex01_큰수확인 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int result = largerNumbers(num1, num2);
		System.out.println("큰 수 확인 : " + result);

	}

	public static int largerNumbers(int num1, int num2) {

		int result = 0;

		if (num1 > num2) {
			result = num1;
		} else if(num1 < num2) {
			result = num2;
		}

		return result;
	}

}
