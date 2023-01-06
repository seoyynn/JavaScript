package view;

import java.util.Scanner;

import model.ClassDAO;
import model.ClassDTO;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ClassDTO dto = null;
		ClassDAO dao = new ClassDAO();

		while (true) {

			System.out.print("[1] 로그인 [2] 회원가입 >> ");
			int menu = sc.nextInt();

			if (menu == 1) {

				System.out.print("ID : ");
				String id = sc.next();
				System.out.print("PW : ");
				String pw = sc.next();
				
				boolean result = dao.login(id, pw);
				
				if(result) {
					System.out.println("로그인 성공!");
				}else {
					System.out.println("로그인 실패!");
				}

			} else if (menu == 2) {
				
				System.out.print("ID : ");
				String id = sc.next();
				System.out.print("PW : ");
				String pw = sc.next();
				System.out.print("NICK : ");
				String nick = sc.next();
				System.out.print("AGE : ");
				int age = sc.nextInt();
				
				dto = new ClassDTO(id, pw, nick, age);
				
				int cnt = dao.insert(dto);
				
				if(cnt > 0) {
					System.out.println("회원가입 성공");
				}else {
					System.out.println("회원가입 실패");
				}
				
				

			} else {
				System.out.println("잘못입력하셨습니다");
			}

		}
	}

}
