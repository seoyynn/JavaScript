package 이차원배열;

public class Ex05_실습5 {

	public static void main(String[] args) {

		int[][] a = new int[5][5];

		int cnt = 21;

		// 입력부
		for (int j = 0; j < a.length; j++) {

			for (int i = 0; i < a[j].length; i++) {
				a[j][i] = cnt++;
			}
		}

		// 출력부
		for (int j = 0; j < a.length; j++) {

			for (int i = 0; i < a[j].length; i++) {
				System.out.print(a[j][4 - i] + "\t");
			}
			System.out.println();
		}

	}

}
