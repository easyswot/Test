package loop;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 2. for문
		 * 
		 * < 기본 문법 >
		 * for(초기식 ; 조건식 ; 증감식) {
		 * 		// 조건식이 true일 때 반복 실행할 문장들
		 * 
		 * }
		 * 
		 * => 초기식(1) : 반복 횟수를 제어할 제어변수를 선언하고 필요에 따라 초기화 수행
		 * => 조건식(2) : 제어변수를 사용하여 반복문을 반복(종료)하는 조건식 지정
		 * 				(조건식 결과가 true일 동안 계속 반복 수행하고, false이면 종료)
		 * => 실행문(3) : 조건식 결과가 true일 동안 반복 실행할 문장을 기술
		 * 				(한 문장 또는 여러 문장)
		 * => 증감식(4) : 실행문 실행 후 조건식으로 이동하기 전 제어변수를 증감시킴
		 * => 초기식 -> 조건식 -> 실행문 -> 증감식 -> 조건식 -> 실행문 순으로 반복
		 * 
		 * 
		 * */
		
//		Hello World 10번 출력
		
		int i = 1;
		while(i <= 10) {
			
			System.out.println(i + " : Hello, World");
			i++;
		}
		
		
		
		
		System.out.println("\n==================================================\n");
		
		
		
		
		
		for(i = 1 ; i <= 10 ; i++) {
			
			System.out.println(i + " : Hello, World");
			
		}
		
		
		
		
		System.out.println("\n==================================================\n");
		
		
		
		
		
		//2~10까지 짝수 출력
		
		for(i = 2 ; i <= 10 ; i += 2) {
			
			System.out.print(i + " ");
			
		}
		
		
		
		System.out.println("\n\n==================================================\n");
		
		
		
		//10~1까지 1씩 감소하면서 출력
		
		for(i = 10 ; i >= 1 ; i--) {
			System.out.print(i + " ");
		}
		
		
		
		System.out.println("\n\n==================================================\n");
		
		
		
		// for문에서 구성요소 제외 가능 예
		
		i = 1;
		for(; i <= 10 ; i++) {
			System.out.println(i + " ");
		}
		System.out.println();
		System.out.println("for문 종료 후 제어 변수 i = " + i);
		
		
		
		System.out.println("\n==================================================\n");
		
		
		
		// 제어변수 i 중복 선언 불가
		// 만약, 제어변수 i의 값만 변경하려면 선언 코드만 제외하고 사용
		
//		for(i = 1 ; i < = 10 ; i++) {
//			
//			
//			
//		}
		
		
		
		
		
		
		
		

	}

}
