import java.util.Scanner;

public class Ex11_별짓기5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("원하는 별짓기 개수 입력 : ");
		int num = sc.nextInt();

		for (int j = 1; j <= num; j++) {

			for (int i = 1; i <= j; i++) {
				System.out.print("*");
			}
			System.out.println();

		}

	}

}
