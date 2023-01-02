
public class Ex09_별짓기3 {

	public static void main(String[] args) {

//		for (int j = 1; j <= 5; j++) {
//			
//			for (int i = 5; i > 0; i--) {
//				if(j < i) {
//					System.out.print(" ");
//				}else {
//					System.out.print("*");
//				}
//			}
//
//			System.out.println();
//
//		}

//		for (int j = 1; j <= 5; j++) {
//			
//			for (int i = 5; i > 0; i--) {
//				
//				if (j < i) {
//					System.out.print(" ");
//				} else {
//					System.out.print("*");
//				}
//			}
//			
//			System.out.println();
//		}
		
		for (int j = 1; j <= 5; j++) {
			
			for (int i = 1; i <= 5 - j; i++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= j; k++) {
				System.out.print("*");
			}
			System.out.println();
			
		}

	}

}
