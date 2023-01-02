
public class Ex09_증감연산자2 {

	public static void main(String[] args) {

		int opr = 0;
		
		opr += 3; // opr == 3
		
		System.out.println(opr++); // 3
		// opr++ -> 출력하고 1 증가
		
		System.out.println(opr); // 4
		
		System.out.println(++opr); // 5
		// 1을 더해서 출력하고싶으면 ++을 앞으로 써야함
		
		System.out.println(opr); // 5
		
		System.out.println(opr--); // 5
		// opr-- -> 출력하고 감소
		
		System.out.println(opr); // 4
		
		System.out.println(--opr); // 3
		// --opr -> 감소하고 출력
		
		System.out.println(opr); // 3
	}

}
