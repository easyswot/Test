package default_method;

interface MyInterface {
	
	int a = 0;
	public int b = 1;
	public static int c = 2;
	public static final int d = 3;
	
	public void abMethod();
	default void deMethod() {
		System.out.println("default method");
	}
}

class MySubClass implements MyInterface {

	// 추상메서드는 반드시 오버라이딩
	@Override
	public void abMethod() {
		System.out.println("추상메서드");
		
	}
	
	// default Method는 오버라이딩이 선택사항
//	@Override
//	public void deMethod() {
//		
//	}
	
}

public class Ex1 {

	public static void main(String[] args) {
		
		// static method와 다르게
		// 클래스 이름으로 바로 접근 불가능
//		MyInterface.deMethod();
		MySubClass ms = new MySubClass();
		ms.abMethod();
		ms.deMethod();
		
		// interface에서 static메서드와 default메서드 공통점과 차이점
		// 공통점 : 바디{}를 가질 수 있는 메서드
		// 차이점 : static메서드는 메서드 자체를 상속 즉, 물려줬다기 보다는
		//		   인터페이스에 소속된 메서드를 공유해서 사용하는 느낌
		//		   default메서드는 진짜로 상속처럼 해당 메서드를 물려준 것
		
		System.out.println("------------------------------");
		/*
		 * 인터페이스의 default 메서드
		 * 충돌 발생 시 예외처리
		 * 1. (super)class vs interface (class Win)
		 * 2. interface vs interface
		 * 
		 * */
		C c = new C();
		c.method();
		
		SubClass sc = new SubClass();
		sc.method();
		
		System.out.println(MyInterface.a);
	}

}

// 1. class vs interface
class A {
	void method() {
		System.out.println("class A");
	}
}

interface B {
	default void method() {
		System.out.println("interface B");
	}
}

class C extends A implements B {

	@Override
	public void method() {
		// TODO Auto-generated method stub
		super.method();
	}
	
}

// 2. interface vs interface (반드시 override 필수)
interface I1 {
	default void method() {
		System.out.println("I1의 메서드");
	}
}

interface I2 {
	default void method() {
		System.out.println("I2의 메서드");
	}
}

class SubClass implements I1, I2 {

	@Override
	public void method() {
		System.out.println("재정의한 SubClass의 메서드");
		I1.super.method();
	}
	
}