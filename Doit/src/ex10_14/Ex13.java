package ex10_14;

public class Ex13 {

	public static void main(String[] args) {
		// 484
		
		/*
		 * 1.
		 * 지역 내부 클래스에서 외부 클래스 메서드의 지역변수를 사용할 수 있지만,
		 * 그 값을 변경하면 오류 발생. 이때 사용하는 지역변수는 xxx변수가 되기 때문
		 * => final
		 * 
		 * */
		
//		int a = 10;
//		class A {
//			public void method() {
//				System.out.println(a);	// 사용은 가능
//				a = 20;					// 변경은 불가능 (마치 final 처럼)
//			}
//		}
		
		/*
		 * 2.
		 * 내부 클래스 중 클래스 이름 없이 인터페이스나 추상 클래스 자료형에
		 * 직접 대입하여 생성하는 클래스
		 * => 익명 내부 클래스
		 * 
		 * */
		
		
		/*
		 * 3.
		 * 자바에서 제공하는 함수형 프로그래밍 방식으로
		 * 인터페이스의 메서드를 직접 구현하는 코드
		 * => 람다식
		 * 
		 * */
		
		/*
		 * 4.
		 * 람다식으로 구현할 수 있는 인터페이스는 메서드를 하나만 가져야 합니다.
		 * 이러한 인터페이스를 xxx라고 합니다.
		 * => 함수형 인터페이스(FunctionalInterface)
		 * 
		 * */
		
		/*
		 * 5.
		 * 다으모가 같이 두 정수를 매개변수로 하는 메서드가 인터페이스에 정의되어있습니다.
		 * 두 정수의 합을 반환하는 람다식을 구현하고 호출
		 * 
		 * */
		Calc cal = (num1, num2) -> num1 + num2;
		System.out.println(cal.add(10, 20));
		
		/*
		 * 6.
		 * 자바에서 자료 처리를 추상화하여 여러 자료형의 자료를
		 * 동일하게 처리할 수 있도록 제공하는 클래스
		 * => stream
		 * 
		 * */
		
		
		
		

	}

}

@FunctionalInterface
interface Calc {
	public int add(int num1, int num2);
}

