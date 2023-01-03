package 이차원배열;

import java.util.Scanner;

public class Ex07_숙제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][] num = { { 4, 5, 4, 1, 2 },
						{  },
						{ 10, 20, 30, 20, 20 } };
		
		for (int j = 0; j < num.length; j++) {

			for (int i = 0; i < num[j].length; i++) {
				System.out.print(num[j][i] + "\t");
			}
			System.out.println();
		}
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[1][i] = sc.nextInt());
		}
		

	}

}
