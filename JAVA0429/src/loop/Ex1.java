package loop;

public class Ex1 {

	public static void main(String[] args) {
		/*
		 * 반복문(Loop)
		 * 	- 특정 문장 또는 블럭을 주어진 조건에 따라 반복 실행하는 문
		 * 	- for문과 while문(do-while)
		 * 	- for문과 while문은 문법적 구조는 다르지만, 동작 방식이 동일함
		 * 		=> 따라서, 상호 100% 전환이 가능
		 * 	- for문은 주로 반복 횟수가 정해져 있는 반복문에서 사용하며,
		 * 	  while문은 주로 반복횟수가 정해져있지 않은 반복문에서 사용
		 * 
		 * 
		 * 1. while문
		 * => 조건식의 위치가 고정되어 있음
		 * => 초기식은 while문 보다 윗쪽에 위치해야 하며
		 * 	  증감식은 while문 안쪽에 위치해야 함
		 * => 주로 반복횟수를 알 수 없을 때 사용
		 * 
		 * 
		 * <기본 문법>
		 * while( 조건식 _){
		 * 		// 조건식이 true일 동안 반복할 실행문
		 * 		// 증감식
		 * 
		 * }
		 * 
		 * 
		 * */
		
		int i = 0;
		while(i < 10) {
			System.out.println(i+"안녕하세요");
			i++;
			
		}
		
		System.out.println("\n========================================\n");
		
		
		
		i = 1;
		while(i<=10) {
			System.out.print(i+" ");
			i++;
			
		}
		System.out.println();
		System.out.println(i);
		
		System.out.println("\n========================================\n");
		
		
		
		i = 2;
		while(i <= 10) {
			
			System.out.print(i+" ");
			i += 2 ;
		}
		
		System.out.println("\n========================================\n");
		
		
		
		i = 10;
		while(i>=1) {
			
			System.out.print(i + " ");
			i--;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
