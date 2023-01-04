package ex221111;

import java.util.ArrayList;

public class ContactMain {

	public static void main(String[] args) {

		ArrayList<Contact> contacts = new ArrayList<Contact>();

		// 객체생성
		contacts.add(new Contact("장서연", 27, "010-5105-9721")); // 생성과 동시에 추가
		contacts.add(new Contact("한가연", 27, "010-7771-1241"));
		contacts.add(new Contact("장은수", 28, "010-8752-2041"));
		contacts.add(new Contact("장석환", 24, "010-8447-3533"));

		for (int i = 0; i < contacts.size(); i++) {
			String name = contacts.get(i).getName();
			int age = contacts.get(i).getAge();
			String tel = contacts.get(i).getTel();

			// 장서연(27) : 010-5105-9721

			System.out.printf(i+1 + ". %s(%d) : %s%n", name, age, tel);
			// printf -> ""안에 넣어야하는 문자열이 많을 때, 변수랑 문자랑 한번에 쓰기위해 사용
			// %s -> 문자열
			// %d -> 정수
			// %n -> 엔터기능
		}
	}

}
