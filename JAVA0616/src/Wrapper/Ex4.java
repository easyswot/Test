package Wrapper;

public class Ex4 {

	public static void main(String[] args) {
		/*
		 * Wrapper 클래스의 다양한 메서드
		 * - Wrapper 클래스 타입을 활용하면 기본 데이터타입들을 다양하게 처리 가능
		 * - 주로 Wrapper 클래스의 static 메서드를 직접 호출하여
		 * 	 기본 데이터타입 데이터를 처리하도록 작업을 수행하는 형태로 사용
		 * 
		 * 
		 * */
		// 기본 데이터타입 변수 선언 시
		int num1 = 10, num2 = 20;
		
		// Integer 타입 객체 생성 시
		// "abc" vs new String("abc")
		Integer n1 = new Integer(10);
		Integer n2 = new Integer(10);
//		Integer n1 = 10;
//		Integer n2 = 10;
		
		int sum = n1 + n2;	// 오토언박싱 후 연산 수행
		System.out.println(sum);
		
		System.out.println("--------------------");
		
		// Integer 클래스의 static 메서드 활용
		// 1. 두 정수에 대한 대소 관계 비교
		System.out.println("num1과 num2 중 큰 값 : " + Integer.max(num1, num2));
		System.out.println("num1과 num2 중 작은 값 : " + Integer.min(num1, num2));
		System.out.println("num1과 num2 중 큰 값 : " + Integer.max(num1, sum));	// 오토언박싱
		System.out.println("num1과 num2 중 큰 값 : " + Integer.max(n1, num2));	// n1이 오토언박싱
		
		System.out.println("num1과 num2가 같은가 : " + n1.equals(n2));
		System.out.println("num1과 num2가 같은가 : " + (n1 == n2));
		// Object 클래스의 equals() 메서드가 Integer 클래스에서 오버라이딩 되어있기 때문에
		// 값을 비교하여 true가 리턴됨
		
		// 2. 어떤 정수에 대한 진법 변환
		// => 해당 진법의 문자열 형태로 리턴하는 메서드를 사용 : toXXXString()
		System.out.println("10진수 num1에 대한 2진수 변환 : " + Integer.toBinaryString(num1));
		System.out.println("10진수 num1에 대한 2진수 변환 : " + Integer.toOctalString(num1));
		System.out.println("10진수 num1에 대한 2진수 변환 : " + Integer.toHexString(num1));
		
		System.out.println("-----------------------------");
		
		// Character 클래스의 메서드 활용
		// => 주로 특정 문제에 대한 판별을 Character.isXXX() 메서드로 수행하거나
		//	  특정 문자로 변환을 Sharacter.toXXX() 메서드로 수행
		
		char ch = 'F';
		if(ch >= 'A' && ch <= 'Z') {
			System.out.println(ch + " :  대문자");
		} else if(ch >= 'a' && ch <= 'z') {
			System.out.println(ch + " :  소문자");
		} else if(ch >= '0' && ch <= '9') {
			System.out.println(ch + " :  숫자");
		}
		
		// 2. Character 클래스의 isXXX() 메서드를 호출하여 판별할 경우
		ch = ' ';
		System.out.println(ch + " 문자는 대문자인가? " + Character.isUpperCase(ch));
		System.out.println(ch + " 문자는 소문자인가? " + Character.isLowerCase(ch));
		System.out.println(ch + " 문자는 숫자인가? " + Character.isDigit(ch));
		System.out.println(ch + " 문자는 공백문자인가? " + Character.isSpace(ch));
		System.out.println(ch + " 문자는 공백문자인가? " + Character.isSpaceChar(ch));
		
		// => @Deprecated 처리된 메서드 : 사용은 가능하지만
		//	  보안 상의 이유나 다른 메서드 제공 등으로 인해
		//	  현재는 사용하는 것을 별로 추천하지 않는 메서드
		
		System.out.println("----------------------------------");
		
		// Character 클래스의 메서드를 활용하여
		// 대문자, 소문자, 숫자, 공백, 기타문자 판별
		ch = 'q';
		if(Character.isUpperCase(ch)) {
			System.out.println(ch + " : 대문자");
		} else if(Character.isLowerCase(ch)) {
			System.out.println(ch + " : 소문자");
		} else if(Character.isDigit(ch)) {
			System.out.println(ch + " : 숫자");
		} else if(Character.isSpaceChar(ch)) {
			System.out.println(ch + " : 공백");
		} else {
			System.out.println(ch + " : 기타문자");
		}
		
		
		
		
		
		
		
		
	}

}
