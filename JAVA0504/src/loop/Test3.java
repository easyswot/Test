package loop;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		/*
		 * 정수 n을 입력받아 n층의 별 계단을 출력
		 * 
		 * n=5인 경우
		 * 	**				i = 1일 때 공백 = 0
		 * 	 **				i = 2일 때 공백 = 1
		 * 	  **			i = 3일 때 공백 = 2
		 * 	   **			i = 4일 때 공백 = 3
		 * 		**			i = 5일 때 공백 = 4
		 * 
		 * 
		 * 
		 * */
		
//		int n = 6;
//		for(int i = 0 ; i < n ; i++) {	// 줄바꿈
//			System.out.println("**");
//			for(int j = 0 ; j <= i ; j++) {	// 공백찍기
//				System.out.print(" ");
//			}
//		}
		
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		for(int i = 0 ; i < n ; i++) {	// 줄바꿈
//			
//			for(int j = 0 ; j < i ; j++) {	// 공백찍기
//				System.out.print(" ");
//			}
//			System.out.println("**");
//		}
		
		
		
		
//		   n=5인 경우
//		  	*					i = 1일 때 공백 = 4 별 = 1
//		   **					i = 2일 때 공백 = 3 별 = 2
//		  ***	 				i = 3일 때 공백 = 2 별 = 3
//		 **** 	  				i = 4일 때 공백 = 1 별 = 4
//		*****  					i = 5일 때 공백 = 0 별 = 5	

//		int line = 5;
//		int star = 1;
//		int space = line - star;
//		
//		for(int i = 1 ; i <= line ; i++) {	//줄바꿈
//			
//			for(int j = 1 ; j <= space ; j++) {	//공백
//				System.out.print(" ");
//			}
//			
//			for(int j = 1 ; j <= star ; j++) {	//열찍기
//				System.out.print("*");
//			}
//			System.out.println();
//			
//			star++;
//			space--;
//		}
		
		
		
		
//		int n = 5;
//		for(int i = n ; i > 0 ; i--) {
//			
//			for(int j = 1 ; j <= i ; j++) {
//				
//				System.out.print(" ");
//			}
//			
//			for(int k = n-i ; k >= 0 ; k--) {
//				
//			System.out.print("*");
//			
//			}
//			
//			System.out.println();
//		}
		
//		for(int i = 1 ; i <= 5 ; i++) {
//			
//			for(int j = 1 ; j <= 5-i ; j++) {
//				System.out.print(" ");
//			}
//			
//			for(int j = 1 ; j <= i ; j++) {
//				System.out.print("*");
//			}
//			
//			System.out.println();
//		}
		
		
		
		
		
		
		
		
		
//		*****
//		 ****
//		  ***
//		   **
//		    *
		
		int line = 20;
		int star = line;
		int space = 0;
		
		for(int i = 0 ; i < line ; i++) {
			
			for(int j = 0 ; j < space ; j++) {
				System.out.print(" ");
			}
			
			for(int j = 0 ; j < star ; j++) {
				System.out.print("*");
			}
			
			System.out.println();
			
			space++;
			star--;
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
