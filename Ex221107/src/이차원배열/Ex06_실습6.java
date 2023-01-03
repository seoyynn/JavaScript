package 이차원배열;

public class Ex06_실습6 {

	public static void main(String[] args) {

		int[][] a = new int[5][5];

		int cnt = 0;

		// 입력부
		for (int j = 0; j < a.length; j++) {
			for (int i = 0; i < a[j].length; i++) {
				a[j][i] = ++cnt;
			}
		}

		// 출력부
		for (int j = 0; j < a.length; j++) {
			for (int i = 0; i < a[j].length; i++) {
				if (j % 2 == 0) {
					System.out.print(a[j][i] + "\t");
				}else {
					System.out.print(a[j][4 - i] + "\t");
				}

			}
			System.out.println();
		}
		
	}

}
