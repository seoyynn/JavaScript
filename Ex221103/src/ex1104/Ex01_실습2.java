package ex1104;

import java.util.Scanner;

public class Ex01_실습2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] team = { "박유정", "박서연", "조연경", "김종현" };
		
		int num = 0;

		System.out.print("이름 : ");
		String name = sc.next();

		for (int i = 0; i < team.length; i++) {
			if (name.equals(team[i])) {
				num = i+1;

			}

		}
		System.out.println(name + "님은 " + num +"번 인덱스에 있습니다");

	}

}
