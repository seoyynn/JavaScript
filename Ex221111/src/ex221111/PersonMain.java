package ex221111;

public class PersonMain {

	public static void main(String[] args) {

		// Person 설계도 클래스를 이용해서 실제 사람(객체)이 만들어지는 클래스

		// 1. 사람(객체) 생성하기
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person("조연경", 27, 165);

		p1.name = "장두식";
		p1.age = 27;
		p1.height = 170;

		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.height);
		
		p1.name = "장쎄이얜";
		System.out.println(p1.name);
		
		p2.name = "장서연";
		p2.age = 25;
		p2.height = 200;

		System.out.println(p2.name);
		System.out.println(p2.age);
		System.out.println(p2.height);
		
		p1.coading();
		p1.think();
		
		p2.coading();
		p2.think();

	}

}
