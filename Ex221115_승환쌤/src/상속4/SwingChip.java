package 상속4;

public class SwingChip extends Snack{
	
	// Snack에서 물려준 Eat이란 기능을 반드시!!
	// 오버라이딩(재정의)해줘야만 합니다
	
	@Override
	public void Eat() {
		System.out.println("스윙칩을 먹어봐용");
	}

}
