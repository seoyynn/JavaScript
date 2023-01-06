package controller;

import model.MemberDAO;
import model.MemberDTO;

// Controller의 역할
	// 사용자가 요청한 값이 있으면 controller에서 DAO로 연결
	// 조금 더 view를 간단하게, 사용자가 view에서 딱 입력과 결과값만 볼 수 있도록
public class ManagementSystem {
	
	MemberDAO dao = new MemberDAO();
	MemberDTO dto = null;
	
	public void loginCon(String id, String pw){
		
		boolean result = dao.login(id, pw);
		
		if(result) {
			System.out.print("로그인성공~!");
		}else {
			System.out.print("로그인실패~!~!");
		}
	}
	
	public void insertCon(String id, String pw, String nick, int age) {
		dto = new MemberDTO(id, pw, nick, age);

		int cnt = dao.insert(dto);

		if (cnt > 0) {
			System.out.println("회원가입성공");
		} else {
			System.out.println("회원가입실패");
		}
	}
	
	public void updateCon(String id, String pw) {
		dto = new MemberDTO(id, pw);
		
		int cnt = dao.update(dto);
		
		if(cnt > 0) {
			System.out.println("회원정보 수정완료~!");
		}else {
			System.out.println("회원정보 수정실패~!");
		}
	}
	
	public void deleteCon(String id) {

		int cnt = dao.delete(id);
		
		if(cnt > 0) {
			System.out.println("탈퇴 완료~");
		}else {
			System.out.println("탈퇴 실패~");
		}
	}

}
