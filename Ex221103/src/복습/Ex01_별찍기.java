package 복습;

public class Ex01_별찍기 {

	public static void main(String[] args) {

		for(int j = 0; j < 5; j++) {
			for(int i = 0; i < j+1; i++) {
				System.out.print('*');
			}
			System.out.println();
		}
		System.out.println();
		
		for(int j = 0; j < 5; j++) {
			for(int i = 5; i-1 > j; i--) {
				System.out.print('0');
			}
			System.out.println();
			for(int k = 0; k < j-1; k++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
	
	}

}
