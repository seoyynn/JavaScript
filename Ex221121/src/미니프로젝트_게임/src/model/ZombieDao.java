package model;

public class ZombieDao {
	
	boolean result;

	public int random(int answer) {

		// 랜덤으로 1 or 2만 나오게 만듬
		
		if(answer == 1 && answer == 2) {
			
			int randomVal = (int) (Math.random() * 2 + 1 - 1) + 1; // 1 ~ 2 의 무작위 수
//		System.out.print(randomVal + " ");
			
			if(randomVal == answer) {
				// a = 선택받아야함 
				// 게임이 계속 진행됨
				return 1;
			}else if(randomVal != answer) {
				// 게임이 멈춰야함
				return 2;
			}
			
		}
		return answer;


	}

}
