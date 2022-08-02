
public class Test3 {

	public static void main(String[] args) {
		/*
		 * 마방진(magic square)이란 가로, 세로, 대각선의 합이 같은 사각형이다
		 * 홀수 n을 입력으로 받아 n*n 마방진을 만들
		 * 
		 * 구현 방법 :
		 * 1. 시작은 첫 행, 한 가운데 열에 1을 둔다.
		 * 2. 행은 감소, 열은 증가하면서 순차적으로 수를 넣
		 * 3. 행은 감소하므로 첫 행보다 작아지는 경우에는 마지막 행으로 넘어감
		 * 4. 열을 증가하므로 마지막 열보다 커지는 경우에는 첫 열로 넘어감
		 * 5. 넣은 수가 n의 배수이면 행만 증가, 열은 변화 없음
		 * 
		 * 
		 * 
		 * */
		
		int n = 3;
		int col = n/2;
		int row = 0;
		int[][] arr = new int[n][n];
		
		
		for(int i = 1 ; i <= n*n ; i++) {
			arr[row][col] = i;
			
			if(i % n == 0) {
				row++;
			} else {
			
			row--;
			col++;
			}
			
			if(row < 0) 	row = n-1;
			if(col > n-1)  	col = 0;
			
		}
		
		
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length ; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
//		for(int i = num ; i <= n*n ; i++) {
//			
//			arr[row][col] = i;
//			row--;
//			col++;
//			if(row<0) {
//				row = n;
//			} else if(col>(n-1)) {
//				col = 0;
//			} else if(i%n==0) {
//				row +=2;
//				col--;
//			}
//		}
		
		
		
		
		
		
		
		
		
		
		

	}
	
//	public static int[][] name(int n) {
//		
//	}

}
