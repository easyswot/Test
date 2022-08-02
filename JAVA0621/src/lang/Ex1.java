package lang;

import java.util.Iterator;

public class Ex1 {

	public static void main(String[] args) {
		/*
		 * java.lang.Math 클래스
		 * - 수학적인 다양한 기능을 상수와 static 메서드로 제공
		 * - 모든 멤버가 static 으로 선언되어 있으므로 클래스명만 접근 가능
		 *   ex) Math.PI, Math.random()
		 * 
		 * */
		
		// Math 클래스의 상수
		System.out.println("PI값 : " + Math.PI);
		
		int num = -10;
		// Math클래스의 static 메서드
		System.out.println("num의 절대값 : " + Math.abs(num));
		System.out.println("num과 20중 큰 값 : " + Math.max(num, 20));
		System.out.println("num과 20중 작은 값 : " + Math.min(num, 20));
		System.out.println("4의 제곱근 : " + Math.sqrt(4));
		
		
		System.out.println();
		
		// ---------------------------------------------------------------
		double dNum = 3.141592;
		System.out.println("실수 dNum의 소수점 첫째자리 반올림값 : " + Math.round(dNum));
		// 항상 소수점 첫째자리에서 반올림이 일어나므로 x번째 자리 반올림을 위해서는
		// 반올림할 숫자의 반올림 자리 수를 첫번째 자리에 위치하도록 변형해야 한다.
		// ex) 실수 3.141592의 소수점 4번째 자리 숫자 (5)를 반올림하기 위해서
		//	   해당 숫자를 소수점 첫번째 자리로 이동시키기 위한 값을 직접 곱하거나
		//	   해당 숫자에 10^(x-1) 값을 곱해야 함
		//	   ex) 3.141592 * 1000 또는 3.141592 * (10^(4-1))
		//	   => 또한, 원래자리로 숫자를 되돌리기 위해 다시 곱한 값만큼 나눗셈 수행
		//	   ex) 3.141592 * 1000 / 1000
		System.out.println("상수 dNum의 소수점 넷째자리 반올림값 : " + Math.round(dNum)*1000/1000);
		
		// ----------------------------------------------------------------------------------
		/*
		 * Math.random()
		 * - 난수(임의의 수) 발생을 위한 메서드
		 * - Math.random() : 0.0 <= x <1.0 범위 double 타입 난수 발생
		 * 
		 * < 난수 발생 기본 공식 >
		 * 1. (정수화)(Math.random()*상한값) : 0 ~ 상한값-1 (0 <= x < 상한값)
		 * 2. (정수화)(Math.random()*상한값) + 1 : 1 ~ 상한값 (1 <= x <= 상한값)
		 * 3. 복합 공식 (확률적으로 난수 중복을 최소화하기 위한 공식)
		 * 	  (정수화)(Math.random()*(상한값 - 하한값 +1) + 하한값)
		 * */
		System.out.println(Math.random());
		
		for(int i = 1 ; i <= 10 ; i++) {
//			System.out.println(Math.random());	// 0.0 <= x < 1.0
			
			// 정수 1자리 범위의 난수를 발생시키기 위해서는
			// Math.random() 결과를 원하는 자릿수 만큼 정수를 이동시키고
			// 남은 자리 숫자들을 제거
//			System.out.println((int)(Math.random() * 10));	// 0<=x<10
			
			// 0을 제외하고 1부터 상한값까지의 난수 발생을 위해서는
			// 난수 발생 결과에 +1을 수행
//			System.out.println((int)(Math.random() * 10) + 1);	// 1<=x<10
			
			// 0을 제외하고 x부터 상한값 까지의 난수 발생을 위해서는
			// 난수 발생 결과에 +x를 수행
//			System.out.println((int)(Math.random()*10) + 5);	// 5<=x<15
			
		}
		
		// 복합 공식 적용 시
		// (정수화)(Math.random()*(상한값 - 하한값 +1) + 하한값)
		int upperNum = 10;
		int lowerNum = 1;
		for(int i = 1 ; i <= 10 ; i++) {
			System.out.println((int)(Math.random() * (upperNum - lowerNum + 1) + lowerNum));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
