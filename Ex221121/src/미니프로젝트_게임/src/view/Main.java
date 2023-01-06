package view;

import java.util.Random;
import java.util.Scanner;

import model.MenuDao;
import model.MenuDto;
import model.ZombieDao;

public class Main {

	public static void main(String[] args) {
		
		ZombieDao dao = new ZombieDao();
		MenuDto dto = null;
		MenuDao mdao = new MenuDao();
		int subNumber = 0;
		
		

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		// 아스키코드
		// Zombie world
		
		while (true) {
			System.out.print("[1]로그인 [2]회원가입 [3]정보수정 [4]랭킹조회 [5]회원탈퇴 [6]종료 >> ");
			int menu = sc.nextInt();

			if (menu == 1) {
				// [1] 로그인
				System.out.print("ID : ");
				String id = sc.next();
				System.out.print("PW : ");
				String pw = sc.next();
				

				boolean result = mdao.login(id, pw);
				if (result == true) {
					System.out.println("로그인 성공");
					
					System.out.print("[1] 게임시작 [2] 이전메뉴 >> ");
					subNumber = sc.nextInt(); 
					
				} else {
					System.out.println("로그인 실패");
				}
				
				if(subNumber == 1) {
					// 실제 좀비게임 게임시작
					int selectNum = sc.nextInt();
					int answer = rd.nextInt();
					
					
					if(answer == 1) {
						System.out.println("GAMEOVER");
						break;
					}else if(answer == 2) {
						System.out.println("탈출 성공");
					}
					
				}else if(subNumber == 2){
					// 이전메뉴
				}else {
					System.out.println("다시입력해주세요.");
				}
				
			

			} else if (menu == 2) {
				// [2] 회원가입
				System.out.print("ID : ");
				String id = sc.next();
				System.out.print("PW : ");
				String pw = sc.next();
				System.out.print("NICK : ");
				String nick = sc.next();


				
				dto = new MenuDto(id, pw, nick);

				int cnt = mdao.insert(dto);
				if (cnt > 0) {
					System.out.println("회원가입 성공");
				} else {
					System.out.println("회원가입 실패");
				}

			

			} else {
				System.out.println("다시 입력해 주십시오.");
			}

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}// main

}
