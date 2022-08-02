package array;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 
		 * n개의 숫자가 입력되면
		 * n개의 숫자를 왼쪽으로 하나씩 돌려서 출력
		 * 
		 * ex)
		 * 5
		 * 1 2 3 4 5
		 * 2 3 4 5 1
		 * 3 4 5 1 2
		 * 4 5 1 2 3
		 * 5 1 2 3 4
		 */
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n * 2];
		
		// 입력받는 부분
		for(int i = 0 ; i < n ; i++) {
			int num = sc.nextInt();
			arr[i] = num;
			arr[n + i] = num;
			
		}
		
		
		for(int i = 0 ; i < n ; i++) {
			
			// 출력
			for(int j = i ; j < n + i ; j++) {
				System.out.print(arr[j] + " ");
			}
			
			System.out.println();
		}
		
		

		// 1번 방법
//		int[] arr = {1, 2, 3, 4, 5};
//		
//		
//		for(int i = 0 ; i < arr.length ; i++) {
//			// 배열의 요소를 전부 출력
//			for(int j = 0 ; j < arr.length ; j++) {
//				System.out.print(arr[j] + " ");
//			}
//			System.out.println();
//			
//			// 배열 한 바퀴 돌리기
//			int temp = arr[0];
//			for(int j = 0; j < arr.length - 1 ; j++) {
//				arr[j] = arr[j + 1];
//			}
//			arr[arr.length - 1] = temp;	// 마지막 요소에 temp값을 저장
//		
//		}
		
		
		
		
		

	}

}
