package ex1103;

public class Ex03_실습3 {

	public static void main(String[] args) {

//		int[] a = {2, 8, 10, 15, 20, 7};
//		
//		System.out.print("가장 큰 수는 ");
//		
//		int max = 0;
//		for(int i = 0; i < a.length; i++) {
//			if(max < a[i]) {
//				max = a[i];
//			}
//		}
//		System.out.println(max + "입니다.");
		
//		int[] a = {-2, -8, -10, -15, -20, -7};
//		
//		System.out.print("가장 큰 수는 ");
//		
//		int max = a[0];
//		for(int i = 0; i < a.length; i++) {
//			if(max < a[i]) {
//				max = a[i];
//			}
//		}
//		System.out.println(max + "입니다.");
		
		int[] a = {2, 8, 10, 15, 20, 7, 1};
		
		System.out.print("가장 작은 수는 ");
		
		int min = a.length;
		for(int i = 0; i < a.length; i++) {
			if(min > a[i]) {
				min = a[i];
			}
		}
		
		System.out.println(min + " 입니다.");
		
	}

}
