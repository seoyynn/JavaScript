import java.util.ArrayList;

public class Ex01_ArrayList {

	public static void main(String[] args) {

		// 1. 선언 및 생성
		// 배열
		int[] a = new int[5];

		// ArrayList(가변리스트)
		// 제네릭기법
		// ArrayList는 import해야 함 (클래스 형태이기 때문)
		// ArrayList<데이터 타입> 변수명 = new ArrayList<데이터타입>();
		// () : 메소드를 사용해서 생성
		// <데이터타입> 안에는 객체타입으로 들어가야함
		// ㄴ> int형태 -> Integer
		// 생성할 때 크기지정 X

		ArrayList<Integer> arr = new ArrayList<Integer>();

		// 2. 값 추가
		// 배열
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;

		// ArrayList - 메소드를 이용해서 값 추가
		// 변수명.add(값);
		// 변수명.add(인덱스, 값);
		// 크기 : 변수명.size()
		System.out.println("값 추가 전 ArrayList 크기 : " + arr.size());
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		System.out.println("값 추가 후 ArrayList 크기 : " + arr.size());

		// 3. 값 조회
		// 배열
		System.out.println("배열의 0번 인덱스 : " + a[0]);

		// ArrayList -> 변수명.get(인덱스번호)

		for (int i = 0; i < arr.size(); i++) {
			System.out.println("ArrayList의"+ i +"번 인덱스 : " + arr.get(i));
		}
		System.out.println();
		
		// 4. 값 삭제
		// ArrayList
		// 선택삭제 : 변수명.remove(인덱스) -> 뒤의 값이 앞으로 당겨짐
		// 전체삭제 : 변수명.clear(), >  변수명.removeAll()
		arr.remove(0);
		System.out.println(arr.get(0));
		System.out.println(arr.size()); 
		
		arr.clear();
		System.out.println(arr.size()); 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
