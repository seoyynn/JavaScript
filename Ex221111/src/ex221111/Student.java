package ex221111;

public class Student {
	
	//필드
	String name;
	String number;
	int age;
	int scoreJava;
	int scoreWeb;
	int scoreAndroid;
	
	// 생성자 메소드
	// this : 자기 자신의 객체, 현재 실행되는 메소드가 속한 객체
	// 같은필드에있는 변수라는걸 알려주기 위해 this를 사용함
	// 필드의 변수명 = this.변수명 동일(파란색) , String name == this.name = (name)이 같음

	public Student(String name, String number, int age, int scoreJava, int scoreWeb, int scoreAndroid) {
		this.name = name;
		this.number = number;
		this.age = age;
		this.scoreJava = scoreJava;
		this.scoreWeb = scoreWeb;
		this.scoreAndroid = scoreAndroid;
	}

	public void show() {

		System.out.println(name + "님 안녕하세요");
		System.out.println("[" + number + "," + age + "살]");
		System.out.println(name + "님의 Java점수는 " + scoreJava + "점 입니다.");
		System.out.println(name + "님의 Web점수는 " + scoreWeb + "점 입니다.");
		System.out.println(name + "님의 Android점수는 " + scoreAndroid + "점 입니다.");
		System.out.println("========================================================");
	}

}
