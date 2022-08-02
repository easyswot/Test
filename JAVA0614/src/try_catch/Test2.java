package try_catch;

import java.util.Random;

public class Test2 {

	public static void main(String[] args) {
		/*
		 * 반복문을 사용하여 0~9까지의 난수 발생 => 10번 반복
		 * => 발생한 난수를 정수형 변수 num에 저장 후
		 * 	  10 / num 결과를 화면에 출력
		 * => Exception 발생 시
		 * 	  "피연산자가 0이므로 연산에서 제외됩니다" 출력
		 * 
		 * */
		
		Random r = new Random();
		
			
		for(int i = 0 ; i < 10 ; i++) {
			
			try {
				int num = r.nextInt(10);
				System.out.println(10 + " / " + "num" + " = " + 10/num);
				
			} catch (ArithmeticException e) {
				System.out.println("피연산자가 0이므로 연산에서 제외됩니다.");
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		try {
//			
//			int n = (int)(Math.random() * 10);
//			System.out.println(10 + " / " + "n" + " = " + 10/n);
//			
//		} catch (ArithmeticException e) {
//			System.out.println("피연산자가 0이므로 연산에서 제외됩니다.");
//		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
