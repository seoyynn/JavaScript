package ex1104;

import java.util.Arrays;

public class Ex01_실습3 {

	public static void main(String[] args) {

		// .split() : 특정 문자를 기준으로 문자열을 잘라주는 함수(기능)
		// 변수.split(특정문자)
		// split 자체가 배열데이터타입

		String score = "A,A,B,C,D,A,C,D,D,D,F";
		String[] scores = score.split(",");

		System.out.println(Arrays.toString(scores));

		int cntA = 0;
		int cntB = 0;
		int cntC = 0;
		int cntD = 0;
		int cntF = 0;

		for (int i = 0; i < scores.length; i++) {

			if (scores[i].equals("A")) {
				cntA++;
			} else if (scores[i].equals("B")) {
				cntB++;
			} else if (scores[i].equals("C")) {
				cntC++;
			} else if (scores[i].equals("D")) {
				cntD++;
			} else {
				cntF++;
			}
		}

		System.out.println("A : " + cntA);
		System.out.println("B : " + cntB);
		System.out.println("C : " + cntC);
		System.out.println("D : " + cntD);
		System.out.println("F : " + cntF);

	}

}
