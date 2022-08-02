import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		/*
		 * 
		 * 파스칼의 삼각형
		 * 크기 N을 입력받고 N크기의 파스칼 삼각형을 출력
		 * 
		 * 입력 예시) 6
		 * 출력 예시 )
		 * 	1								 if j==0 => 1
		 * 	1	1						else if i==j => 1
		 * 	1	2	1					   else		 => [2][1] = [1][0]+[1][1]
		 * 	1	3	3	1
		 * 	1	4	6	4	1
		 * 	1	5	10	10	5	1
		 * 
		 * 
		 * */
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
//		int N = 3;
		
		int[][] arr = new int[N][];
		
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = new int[i+1];
			
			for(int j = 0 ; j < arr[i].length ; j++) {
				
//				if(j == 0) 			arr[i][j] = 1;
//				else if(i == j) 	arr[i][j] = 1;
				if(j == 0 || i == j)	arr[i][j] = 1;
				else					arr[i][j] = arr[i-1][j-1]+arr[i-1][j];
			}
		}
		
		
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length ; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		for(int i = 0 ; i < arr.length ; i++) {
//			for(int j = 0 ; j < arr[i].length ; j++) {
//				if(i == 0) {
//					arr[i][j] = 1;
//				} else if(i == j);
//			}
//		}
		


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
