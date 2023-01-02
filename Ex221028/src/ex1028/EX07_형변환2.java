package ex1028;

public class EX07_형변환2 {

	public static void main(String[] args) {

		byte num1 = 3; // -128 ~ 127
		int num2 = 8000;
		
		num1 = (byte)num2;
		System.out.println(num1);
		// -> 출력했을때의 값 = 64
		// ㄴ> 싸이클을 돌아서 남은값이 나옴 (-128 부터 127까지 31바퀴를 돔)(8000 / 256 = 31 ... 64)
		
		int num3 = 128; //256씩 더하기
		num1 = (byte)num3;
		System.out.println(num1);
		// 값이 양의 방향으로 넘어가는 현상 -> Overflow
		
		int num4 = -129;
		num1 = (byte)num4;
		System.out.println(num1);
		// 값이 음의 방향으로 넘어가는 현상 -> Underflow
		
		int num5 = 30000;
		short num6 = 0;
		
		num6 = (short)num5; // 들어있는 값과는 상관없음, 자료형이 일치해야함 -> 명시적 형변환
		// int 는 정수형, short는 실수형 이기 때문에 자료형을 일치시켜줘야함
		
		
	}

}
