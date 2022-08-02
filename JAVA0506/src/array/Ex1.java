package array;

public class Ex1 {

	public static void main(String[] args) {
		/*
		 * 
		 * 
		 * 
		 * 
		 * 
		 * */
//		int[] arr = new int[3];
//		System.out.println(arr.length);
//		System.out.println(arr[0]);
//		
//		String[] class1 = {"김윤진", "차동원", "홍길동"};
//		System.out.println(class1[0]);
//		System.out.println(class1[1]);
//		System.out.println(class1[2]);
//		System.out.println(class1);
		
//		배열 선언 : 데이터타입[] 변수명;
		int[] score;
//		스택(stack) 공간에 배열 주소를 저장할 참조데이터타입 변수 score가 생성됨
//		=> 이때, int형의 의미는 해당 배열에 저장될 데이터타입이 정수(int)라는 의미
//		score = 10 ;
		
//		배열 생성 : 변수명 = new 데이터타입[배열크기]
		score = new int[5]; // 정수 데이터 5개 저장 공간이 생성되고 주소값을 score에 저장
		
		System.out.println(score.length);
		System.out.println("0번 인텍스 요소 : " + score[0]);
		System.out.println("1번 인텍스 요소 : " + score[1]);
		System.out.println("2번 인텍스 요소 : " + score[2]);
		System.out.println("3번 인텍스 요소 : " + score[3]);
		System.out.println("4번 인텍스 요소 : " + score[4]);
		
//		5개 크기를 갖는 배열의 인덱스는 0~4까지 존재
//		이때, 4보다 큰 인덱스를 사용할 경우 아래와 같이 오류 발생
		
//		System.out.println("5번 인텍스 요소 : " + score[5]);
		
//		배열 초기화 : 변수명[인덱스] = 데이터;
		
//		int score1 = 80, score2 = 100, score3 = 50, score4 = 90, score5 = 77;
//		=> 5개의 값을 기본형 변수 대신에 배열에 저장
		score[0] = 80;
		score[1] = 100;
		score[2] = 50;
		score[3] = 90;
		score[4] = 77;
		
		System.out.println("0번 인덱스 요소 : " + score[0]);
		System.out.println("1번 인덱스 요소 : " + score[1]);
		System.out.println("2번 인덱스 요소 : " + score[2]);
		System.out.println("3번 인덱스 요소 : " + score[3]);
		System.out.println("4번 인덱스 요소 : " + score[4]);
		System.out.println("\n===================================================================\n");
		
//		반복문을 사용한 배열의 모든 인텍스에 접근
//		배열 크기가 변하면 코드도 변경되어야 함
//		따라서, 배열의 크기를 동적으로 대응할 수 있도록 작성할 필요가 있음
//		즉, 조건식 부분에 배열 크기를 직접 입력하지 않고 배열명.length를 지정
		
		for(int i = 0 ; i < score.length ; i++) {
			System.out.println(i + "번 인덱스 요소 : " + score[i]);
		}
		
		System.out.println("\n===================================================================\n");
		
//		배열 선언 및 생성을 동시에 수행
//		데이터타입[] 변수명 = new 데이터타입[배열크기]
//		int[] arr;
//		arr = new int[10];

//		위 두 문장을 한 문장으로 결합
		int[] arr = new int[10];
		arr[0] = 10;
		System.out.println(arr[0]);
		
		
//		배열 선언, 생성, 초기화를 동시게 수행
//		데이터타입[] 변수명 = {데이터1, 데이터2, ... , 데이터n}
		int[] arr2 = {10, 20, 30};
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		
		int[] arr3;
//		arr3 = {10, 20, 30};
//		arr3 = new int[3] {10, 20, 30};
//		배열 생성 문법과 한꺼번에 초기화하는 문법을 결합하여 사용할 때
//		배열 크기는 데이터의 개수로 자동 지정되므로 배열크기 지정을 생략
		
		arr3 = new int[] {10, 20, 30};
		
		System.out.println("배열 arr3의 크기 : " + arr3);
		for(int i = 0 ; i < arr3.length ; i++) {
			System.out.println("arr3의 "+i + "번 인덱스 요소 : " + arr3[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
