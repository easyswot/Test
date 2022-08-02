package lambda;

import java.util.function.DoubleBinaryOperator;
import java.util.function.UnaryOperator;

public class Ex4 {

	public static void main(String[] args) {
		/*
		 * 4. Operator 계열
		 * - Function 계열과 유사하게 파라미터와 리턴을 갖는다.
		 * - 차이점은 Operator 계열은 매개변수 타입이 곧 리턴타입이 된다.
		 * - 매개변수를 전달받아 "어떠한 연산" 후 같은 데이터타입을 리턴할 때 사용
		 * 
		 * */
		// 익명 내부클래스 타입
		UnaryOperator<Double> op1 = new UnaryOperator<Double>() {
			@Override
			public Double apply(Double x) {
				return Math.pow(x, 2);
			}
		};
		
		// 람다식 형태
		UnaryOperator<Double> op2 = x -> Math.pow(x, 2);
		
		System.out.println(op1.apply(10.0));
		System.out.println(op2.apply(10.0));
		
		DoubleBinaryOperator op3 = (x, y) -> Math.pow(x, y);
		System.out.println(op3.applyAsDouble(100, 2));
		
	}

}
