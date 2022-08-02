package operator;

public class Ex6 {

	public static void main(String[] args) {
		/*
		 * Ampersend Vertical bar Caret
		 * 논리 연산자(&&, ||, !, ^)
		 * - 두 피연산자 간의 논리적인 판별을 수행하는 연산자
		 * - 피연산자는 모두 boolean 타입 데이터만 사용 가능하며,
		 * 	 결과값도 boolean 타입으로 리턴
		 * 
		 * <AND 연산자 (& 또는 &&) - 논리곱>
		 * - 두 피연산자가 모두 true일 경우에만 결과가 true이고,
		 * 	 하나라도 false일 경우 결과값이 false
		 * -F AND F = F, F AND T = F, T AND F = F, T AND T = T
		 * 
		 * <OR 연산자 (| 또는 ||) - 논리 합>
		 * - 두 ㅣ연산자 중 하나라도 true 일 경우 결과값이 true이고,
		 * 	 모두 false일 경우에만 false
		 * 	 F OR F = F, F OR T = T, T OR F = T, T OR T = T
		 * 
		 * <NOT 연산자(!) - 논리부정>
		 * - 단항 연산자로, 현재 값을 반대로 반전
		 * 	 !T = F, !F = T
		 * 
		 * <XOR 연산자 (^) - 베타적 논리합>
		 * - 두 피연산자가 서로 다를 때 true, 같을 때 false
		 * 
		 * 
		 * 
		 * */
		
		boolean a = false;
		boolean b = true;
		
		//AND 연산자(&&) : 둘 다 만족(true)할 경우에만 true
		System.out.println("a(false && a(false) = " + (a && a));
		System.out.println("a(false && b(false) = " + (a && b));
		System.out.println("b(false && a(false) = " + (b && a));
		System.out.println("b(false && b(false) = " + (b && b));
		
		//OR 연산자(||) : 하나라도 만족(ture)할 경우에 true
		System.out.println("a(false || a(false) = " + (a || a));
		System.out.println("a(false || b(false) = " + (a || b));
		System.out.println("b(false || a(false) = " + (b || a));
		System.out.println("b(false || b(false) = " + (b || b));
		
		//NOT 연산자(!)
		System.out.println("!a(false) = " + (!a));
		System.out.println("!b(true) = " + (!b));
		
		//XOR 연산자(^)
		System.out.println("a(false ^ a(false) = " + (a ^ a));
		System.out.println("a(false ^ b(false) = " + (a ^ b));
		System.out.println("b(false ^ a(false) = " + (b ^ a));
		System.out.println("b(false ^ b(false) = " + (b ^ b));
		
		System.out.println("======================================================");
		
		int i = 10;
		System.out.println(i++ > 9 || i++ < 10);
		System.out.println(i);
		
		int j = 10;
		System.out.println(j++ > 9 | j++ < 10);
		System.out.println(j);
		
		
		
		
		
		
		
		

	}

}
