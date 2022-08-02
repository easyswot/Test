import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		/*
		 * 		4
		 * 		6	2
		 * 		9 	3	1
		 * 		19 	10	7	?
		 * 
		 * 위와 같은 규칙을 좀 더 일반화하여 각 행의 제일 첫 번째 숫자들만 주어지면 N 크기의 모든
		 * 격자판 정보를 출력하는 프로그램을 작성
		 * 
		 * 입력 예시
		 * 4
		 * 4 6 9 19
		 * 
		 * 출력 예시
		 *  4				[1][1] = [1][0] - [0][0]
		 *  6	2
		 *  9	3	1
		 *  19	10	7	6
		 * 
		 * 
		 * 
		 * 
		 * */
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[][] arr = new int[N][];
		
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = new int[i+1];
			arr[i][0] = sc.nextInt();
		}
		
		
		
//		int N = 4;
//		int[][] arr= {
//				{4},
//				{6, 0},
//				{9, 0, 0},
//				{19, 0, 0, 0}
//		};
		
		
		
		for(int i = 1; i < arr.length ; i++) {
			for(int j = 1 ; j < arr[i].length ; j++) {
				arr[i][j] = arr[i][j-1]-arr[i-1][j-1];
			}
		}
		
		
		
		
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length ; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		// 향상된 for문
//		for(int[] arr2 : arr) {
//			
//			for(int num : arr2) {
//				System.out.print(num);
//			}
//			
//		}
		
		
		
		
		
		
		

	}

}
