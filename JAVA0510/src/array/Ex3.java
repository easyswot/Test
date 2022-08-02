package array;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 * 다차원 배열
		 * - 1차원 배열 여러개가 모여 2차원 이상의 배열을 이루는 것
		 * - 일반적으로 다차원 배열 = 2차원 배열을 의미
		 * 
		 * 
		 * 2차원 배열
		 * - 행, 열 구조로 이루어진 배열
		 * - 실제 데이터가 저장되는 공간 = 열
		 * 	 열 공간의 주소를 저장하는 공간 = 행
		 * - 배열 크기
		 * 	 1) 행 크기 : 배열명.length
		 * 	 2) 열 크기 : 배열명[행인덱스].length
		 * 
		 * < 2차원 배열 선언 기본 문법 >
		 * 데이터타입[][] 변수명;
		 * 
		 * < 2차원 배열 생성 기본 문법 >
		 * 변수명 = new 데이터타입[행크기][열크기];
		 * 
		 * < 2차원 배열 인텍스 접근 기본 문법 >
		 * 변수명[행인덱스][열인덱스];
		 * 
		 * < 2차원 배열 내의 모든 요소 접근을 위한 for문 >
		 * for(int i = 0 ; i < 배열명.length ; i++) {
		 * 		for(int j = 0 ; j < 배열명[i].length ; j++) {
		 * 			//배열명[i][j]을 사용하여 배열 각 요소 접근
		 * 		}
		 * }
		 * 
		 * < 2차원 배열 선언 및 생성, 초기화를 한꺼번에 수행하는 방법 >
		 * 데이터타입[][] 변수명 = {
		 * 		{1, 2, 3},
		 * 		{1, 2, 3},
		 * 		{1, 2, 3}
		 * }
		 * 
		 * => 바깥 중괄호{} 내의 안쪽 중괄호{} 개수 : 행의 개수
		 * => 안쪽 중괄수{} 내의 
		 * 
		 * */
		
		int[][] arr;
		arr = new int[2][3];
		
		arr[0][0] = 1; arr[0][1] = 2; arr[0][2] = 3;
		arr[1][0] = 4; arr[1][1] = 5; arr[1][2] = 6;
		
		System.out.println(arr[0][0] + " " + arr[0][1] + " " + arr[0][2]);
		System.out.println(arr[1][0] + " " + arr[1][1] + " " + arr[1][2]);
		
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length ; j++) {
				System.out.print(arr[i][j] + " ");
				
			}
			
		}
		

		
		System.out.println("\n===================================================\n");
		
		
		
		int[][] arr2 = {
				{1, 2, 3},
				{4, 5, 6}
		};
		
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length ; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		System.out.println("\n===================================================\n");
		
		// 2차원 배열에서 각 행의 열 개수가 동일하지 않을 수 있다.
		// 1. 데이터를 한꺼번에 초기화하는 방법
		int[][] arr3 = {
				{1, 2, 3},
				{4, 5},
				{6, 7, 8, 9, 10}
		};
		
		for(int i = 0 ; i < arr3.length; i++) {
			
			for(int j = 0 ; j < arr3[i].length ; j++) {
				System.out.print(arr3[i][j]+ " ");
			}
			System.out.println();
		}
		
		System.out.println("\n===================================================\n");
		
		int[][] arr4 = new int[3][];
//		arr4[0] = new int[3];
//		arr4[1] = new int[2];
//		arr4[2] = new int[5];
		
//		arr4[0] = {1, 2, 3};				//안됨
//		arr4[1] = {4, 5};
//		arr4[2] = {6, 7, 8, 9, 10};
		
		
		arr4[0] = new int[]{1, 2, 3};
		arr4[1] = new int[]{4, 5};
		arr4[2] = new int[]{6, 7, 8, 9, 10};
		
		for(int i = 0 ; i < arr4.length ; i++) {
			for(int j = 0 ; j < arr4[i].length ; j++) {
				System.out.print(arr4[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
