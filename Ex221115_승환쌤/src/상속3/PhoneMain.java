package 상속3;

public class PhoneMain {

	public static void main(String[] args) {

		Phone p1 = new Phone();
		p1.call();
		p1.send();
		
		System.out.println("========================");
		
		Lollipop p2 = new Lollipop();
		p2.Message();
		p2.call();
		
		System.out.println("========================");
		
		// 업캐스팅 -> 상위클래스 객체명 = 하위클래스객체
		// p2의 Message 기능 사용못함
		// 상위 클래스에 있는 기능만 사용할 수 있다
		// ★★★★★ 단!!! 업캐스팅을 했을때 하위클래스에서 이미 오버라이딩(재정의) 해준 경우는 업캐스팅 하더라도
		// 재정의한 기능이 사용되어진다!
		Phone p3 = p2;
		p3.call(); // p2로부터 온 기능이기 때문에 p2입력값 그대로 출력됨
		p3.send();
		
		
		
	}

}
