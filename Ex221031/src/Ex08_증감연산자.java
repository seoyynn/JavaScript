
public class Ex08_증감연산자 {

	public static void main(String[] args) {

		int num = 20;
		
		//num에 1을 더해서 다시 저장~!
		num = num +1;
		System.out.println(num);
		num += 1;
		System.out.println(num);
		num++; // ++ -> 1 자동으로 더해줌
		System.out.println(num);
		num--; // -- -> 1 자동으로 빼줌
		System.out.println(num);
	}

}
