package 인터페이스;

public class 서연Person implements Person, Person2{
	
	// 인터페이스를 상속 받을때는 inplements 라는 키워드를 사용한다
	// 인터페이스 상속은 다중 상속이 가능하다

	public void sleep() {

		System.out.println("뒹굴르면서 자기~");
		
	}
	
	public void eat() {
		System.out.println("와구와구 먹기");
	}
	
}
