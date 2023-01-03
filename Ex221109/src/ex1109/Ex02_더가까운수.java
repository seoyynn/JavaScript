package ex1109;

import java.util.Scanner;

public class Ex02_더가까운수 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int result = close(num1, num2);
		System.out.println("10에 가까운 수 >> " + result);

	}

	public static int close(int a, int b) {

		Math.abs(10 - a);
		Math.abs(10 - b);

//		int result = 0;
//		
//		if((10 - a)*-1 < (10 - b)*-1) {
//			result = a;
//		}else {
//			result = b;
//		}
		if (a < b) {
			return a;
		} else if (b < a) {
			return b;
		}

		return 0;
	}

}
