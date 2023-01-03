package ex1109;

public class Ex06_완전수 {
	public static void main(String[] args) {

		// 완전수란?
		// 약수를 나열했을 때, 자기자신제외 합이 자기자신인 경우
		// 6 -> 1, 2, 3, 6(자기자신 제외)

		int startValue = 2;
		int endValue = 1000;
		getPerfectNumber(startValue, endValue);
	}

	public static void getPerfectNumber(int startValue, int endValue) {

		System.out.print(startValue + " ~ " + endValue + "까지의 완전수 : ");
		for (int i = 0; i < 1000; i++) {

			int sum = 0;
			for (int j = 1; j < i; j++) {

				if (i % j == 0) {
					sum += j;
				}

			}
			if (sum == i) {
				System.out.print(i + " ");
			}

		}
	}

}
