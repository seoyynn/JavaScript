package ex1104;

import java.util.Scanner;

public class Ex01_실습 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[5];
		
		for(int i=0; i<5; i++) {
			System.out.print(i+1 + "번째 입력 : ");
			a[i] = sc.nextInt();
		}
		
		
		System.out.print("입력된 정수는 ");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println(" 입니다.");
		
		int max = a[0];
		int min = a[0];
		int sum = 0;
		int ave = 0;
		
		System.out.print("최고 점수 : ");
		for(int i=0; i<a.length; i++) {
			if(max < a[i]) {
				max = a[i];
			}
			
		}
		System.out.println(max);
		
		System.out.print("최저 점수 : ");
		for(int i=0; i<a.length; i++) {
			if(min > a[i]) {
				min = a[i];
			}
		}
		System.out.println(min);
		
		System.out.print("점수 총합 : ");
		for(int i=0; i<a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println(sum);
		
		System.out.print("점수 평균 : ");
		for(int i=0; i<a.length; i++) {
			ave = sum / a.length;
		}
		System.out.println((double)ave);
	}

}
