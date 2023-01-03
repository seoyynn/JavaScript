package 이차원배열;

public class Ex04_실습4 {

	public static void main(String[] args) {

		int[][] a = new int[5][5];

		int cnt = 1;

		// 입력부
		for (int j = 0; j < a.length; j++) {

			for (int i = 0; i < a[j].length; i++) {
				a[j][i] = cnt++;
			}
		}

		// 출력부
		for (int j = 0; j < a.length; j++) {

			for (int i = 0; i < a[j].length; i++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
