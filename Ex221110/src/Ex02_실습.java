import java.util.ArrayList;
import java.util.Scanner;

public class Ex02_실습 {

	public static void main(String[] args) {

		ArrayList<String> team = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("이름을 입력하세요 : ");
//		String name1 = sc.next();
//		System.out.print("이름을 입력하세요 : ");
//		String name2 = sc.next();
//		System.out.print("이름을 입력하세요 : ");
//		String name3 = sc.next();
//		System.out.print("이름을 입력하세요 : ");
//		String name4 = sc.next();
//		System.out.print("이름을 입력하세요 : ");
//		String name5 = sc.next();
		
//		team.add(name1);
//		team.add(name2);
//		team.add(name3);
//		team.add(name4);
//		team.add(name5);
		
		String name = null;
		
		for(int i=0; i<5; i++) {
			System.out.print("이름을 입력하세요 : ");
			name = sc.next();
			team.add(name);
		}
		
		System.out.print("C조의 팀원은 ");
		for(int i=0; i<team.size(); i++) {
			System.out.print(team.get(i) + " ");
		}
		System.out.println("입니다");
		
		// 팀원 탈퇴 시키기~
		// 내가 입력한 이름이 있을 경우 해당 이름 삭제하고 나머지 팀원 출력
		// 만약에 없다면 전체팀원 출력
		System.out.print("탈퇴 시킬 팀원 : ");
		String delete = sc.next();
		team.remove(delete);
		
		System.out.print("C조의 팀원은 ");
		for(int i=0; i<team.size(); i++) {
			System.out.print(team.get(i) + " ");
		}
		System.out.println("입니다");
		
		
		
		
		
	}

}
