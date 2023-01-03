package 이차원배열;

public class Ex03_실습3 {

	public static void main(String[] args) {

		// 5행 5열의 이차원배열 생성

		int[][] a = new int[5][5];

//		// 0번 행
//		a[0][0] = 1;
//		a[0][1] = 2;
//		a[0][2] = 3;
//		a[0][3] = 4;
//		a[0][4] = 5;
//
//		// 1번 행
//		a[1][0] = 6;
//		a[1][1] = 7;
//		a[1][2] = 8;
//		a[1][3] = 9;
//		a[1][4] = 10;

		int cnt = 1;

		for (int j = 0; j < a.length; j++) {

			for (int i = 0; i < a[0].length; i++) {
				a[j][i] = cnt++;
				System.out.print(a[j][i] + "\t"); 
			}
			System.out.println();
		}

	}

}
