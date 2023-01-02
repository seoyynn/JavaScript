
public class Ex04_구구단4 {

	public static void main(String[] args) {

		for (int j = 2; j <= 9; j++) {
			System.out.println("==" + j + "단==");

			for (int i = 1; i <= 9; i++) {

				System.out.println(j + "*" + i + "=" + j * i);

			}
			System.out.println();
		}
	}

}
