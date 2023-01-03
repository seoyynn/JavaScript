import java.util.ArrayList;
import java.util.Scanner;

public class Ex03_실습2 {

	public static void main(String[] args) {

		ArrayList<String> msic = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);

		System.out.println("=== Music Play List ===");
		System.out.println();

		String sname = null;
		int pstion = 0;
		int del = 0;

		while (true) {
			System.out.print("[1] 노래 추가 [2] 노래 조회 [3] 노래 삭제 [4] 종료 >> ");
			int num = sc.nextInt();
			if (num == 1) {
				System.out.print("[1] 원하는 위치에 추가 [2] 마지막 위치에 추가 >> ");
				int add1 = sc.nextInt();
				if (add1 == 1) {
					System.out.print("추가 할 위치 입력 >> ");
					pstion = sc.nextInt();
					System.out.print("추가 할 노래 입력 >> ");
					sname = sc.next();

					msic.add(pstion - 1, sname);

				} else if (add1 == 2) {
					System.out.print("추가 할 노래 입력 >> ");
					sname = sc.next();
					msic.add(sname);
				}

				System.out.println("추가가 완료되었습니다");
				System.out.println();

			} else if (num == 2) {
				System.out.println("======= 현재 재생 목록 =======");
				if (msic.size() == 0) {

					System.out.println("재생 목록이 없습니다!");
				} else {

					for (int i = 0; i < msic.size(); i++) {
						System.out.println(i + 1 + ". " + msic.get(i) + " ");
					}
				}
				System.out.println();

			} else if (num == 3) {
				System.out.print("[1] 선택 삭제 [2] 전체 삭제 >> ");
				del = sc.nextInt();

				if (del == 1) {
					System.out.print("삭제 할 노래 선택 >> ");
					int select = sc.nextInt();
					msic.remove(select-1);
					System.out.println("노래가 삭제 되었습니다.");
				} else if (del == 2) {
					msic.clear();
					System.out.println("노래가 삭제 되었습니다.");
				}

				System.out.println();

			} else if (num == 4) {
				System.out.println("뮤직플레이리스트를 종료합니다");
				break;
			} else {
				System.out.println("다시입력해주세요");
			}
		}

	}

}
