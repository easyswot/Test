package method;

class OverloadingMethod {
	
	// int형 정수 2개를 전달받아 덧셈 결과를 출력하는 add() 메서드 정의
	public void add(int a, int b) {
		System.out.println("add(int int) 호출됨");
		System.out.println("정수의 합 : " + (a+b));
	}
	
	// double형 정수 2개를 전달받아 덧셈 결과를 출력하는 add() 메서드 정의
	public void add(double a, double b) {
		System.out.println("add(double double) 호출됨");
		System.out.println("실수의 합 : " + (a+b));
	}
	
	// long형 정수 2개를 전달받아 덧셈 결과를 출력하는 add() 메서드 정의
	public void add(long a, long b) {
		System.out.println("add(long long) 호출됨");
		System.out.println("long형 정수의 합 : " + (a+b));
	}
	
	
}






public class Test2 {

	public static void main(String[] args) {
		
		// OverloadingMethod 클래스의 인스턴스 생성 후
		// 각각 add() 메서드에 해당하는 데이터를 전달하여 덧셈결과 출력
		
		OverloadingMethod a = new OverloadingMethod();
		
		a.add(1, 20);
		a.add(1.2, 3.45);
		a.add(100L, 325120L);
		
		System.out.println("\n------------------------------\n");
		
		a.add(10, 1.32);		// 자동형변환됨
		a.add(3.14, 100L);		// long -> double
		a.add(200L, 10);		// byte -> short -> int -> long
		
		
	}

}




















