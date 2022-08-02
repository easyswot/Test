package Lambda;



// 1. 파라미터와 리턴타입이 없는 경우(파라미터:x, 리턴타입:x)
@FunctionalInterface
interface MyFunc1 {
	// 함수형 인터페이스 어노테이션(@FunctionalInterface) 선언 시 에러 발생
	// => 함수형 인터페이스는 반드시 하나의 추상메서드(abstract method)를 가져야 함
	public void methodA();	// 추상메서드
//	public void methodB();	// 추상메서드
}

// 2. 파라미터가 있는 람다식(파라미터:o, 리턴타입:x)
@FunctionalInterface
interface MyFunc2 {
	void methodB(String msg);
}

// 3. 리턴타입이 있는 람다식(파라미터:o, 리턴타입:o)
@FunctionalInterface
interface MyFunc3 {
	String methodC(String msg);
}






public class Ex2 {
	
	public static void useFIMethodA(MyFunc1 fi) {
		fi.methodA();
	}
	
	public static void useFIMethodB(MyFunc2 fi) {
		fi.methodB("가나다");
	}
	
	public static String useFIMethodC(MyFunc3 fi) {
		return fi.methodC("가나다");
	}

	public static void main(String[] args) {
		/*
		 * 함수형 인터페이스(Functional Interface) 또는 타겟타입(target type)
		 * - 람다식은 결과적으로 "인터페이스 타입의 클래스를 손쉽게 구현하는 방법"
		 * - 반드시 하나의 abstract 메서드만 존재
		 * - 만약 abstract 메서드가 없거나 두개 이상 존재한다면 람다식으로 대체할 수 없다
		 * - 함수형 인터페이스 @FunctionalInterface 어노테이션 선언 
		 * */
		
		useFIMethodA(new MyFunc1() {
			
			@Override
			public void methodA() {
				System.out.println("익명 내부클래스 형태");
				
			}
		});
		System.out.println("-------------");
		
		System.out.println("파라미터:x 리턴타입:x");
		
		// 표현방식1
		useFIMethodA(() -> {
			System.out.println("람다식1");
		});
		
		// 표현방식2
		useFIMethodA(() -> System.out.println("람다식1"));
		
		
		System.out.println("파라미터:o 리턴타입:x");
		
		// 표현방식1
		useFIMethodB((String msg) -> {
			System.out.println("람다식1 : " + msg);
		});
		
		// 표현방식2
		// 파라미터개수 1, 실행문1 -> 소괄호 중괄호 생략 가능
		useFIMethodB(msg -> System.out.println("람다식2 : " + msg));
		
		System.out.println("파라미터:o 리턴타입:o");
		
		// 표현방식1
		String result = useFIMethodC((String msg) -> {
			return "람다식1 : " + msg;
		});
		System.out.println(result);
		
		// 표현방식2
		// 파라미터개수 1, 실행문1 -> 소괄호 중괄호 생략 가능
		result = useFIMethodC(msg -> "람다식3 : " + msg);
		System.out.println(result);
		
		
		
		
		
		
		
		
	}

}
