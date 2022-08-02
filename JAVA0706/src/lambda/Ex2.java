package lambda;

import java.util.Random;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 2. Supplier 계열 (공급자)
		 * - 파라미터를 받지 않는다.
		 * - 자체적으로 리턴할 값을 생성한다.
		 * 
		 * */
		
		// 익명의 내부클래스 방식
		Supplier<String> supplier = new Supplier<String>() {

			@Override
			public String get() {
				return "Hello";
			}
		};
		
		System.out.println(supplier.get());
		
		// 람다식
//		Supplier<String> supplier2 = () -> { return "Hello2"; };
		// 파라미터없음 : 소괄호() 생략불가
		// 단순한 리턴문 1개 : 중괄호{} 생략 가능, return 생략 가능
		// <T>의 값이 return 타입을 결정함
		Supplier<String> supplier2 = () -> "Hello2";
		System.out.println(supplier2.get());
		
		// PSupplier
		// P : Boolean, Integer, Long, Double을 의미
		IntSupplier supplier3 = () -> {
			Random r = new Random();
			return r.nextInt(10 + 1);
		};
		
		System.out.println(supplier3.getAsInt());
		
		
	}

}
