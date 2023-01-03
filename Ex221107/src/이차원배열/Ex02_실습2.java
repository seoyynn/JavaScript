package 이차원배열;

public class Ex02_실습2 {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 6, 7 };
		int[][] array2 = {};

		// 학생 3명의 국,영,수,사,과 를 저장하고 출력하기
		int[][] scores = { { 50, 15, 80, 10, 45 },
						 { 70, 44, 12, 86, 34 },
						 { 80, 11, 44, 85, 56 } };

		// 점수 -> 변수
		// 여러과목의 점수 -> 이차원배열

		// 학생들의 모든 점수 출력
		// 0번학생 ~ 2번 학생
		// 0번학생 -> 0번과목 ~ 4번과목
		// 1번학생 -> 0번과목 ~ 4번과목
		// 2번학생 -> 0번과목 ~ 4번과목

		for (int j = 0; j < scores.length; j++) {
			
			int sum = 0;
			
			System.out.print(j + "번 학생 : ");
			for (int i = 0; i < scores[j].length; i++) {
				System.out.print(scores[j][i] + " ");
				
				sum += scores[j][i];

			}
			System.out.println("평균점수 : " + sum/scores[j].length);
		}

	}

}


















