package review;

import java.nio.file.spi.FileSystemProvider;

class Person {
	
	// 멤버변수 (= 속성, 필드)
	String name;
	String jumin;
	int age;
	
	// 생성자 (클래스 이름과 동일한게 생성자)
	// (생성자 오버로딩 : 식별이 가능하면 됨)
	public Person() {
//		this.		// 멤버변수, 멤버 메서드에 접근
		this("가나다");		// 다른 생성자 호출 가능
		System.out.println("생성자 호출");
		
		// 다른 생성자를 호출하는 this()는 제일 첫줄에 나와야 함
	}
	
	// String 하나만 전달했을 경우 어떤 생성자를 호출할지 구분이 안됨
	public Person(String name) {
		this.name = name;
	}

//	public Person(String jumin) {
//		this.jumin = jumin;
//	}
	
	// 매개변수 순서라도 바꿔서 "무조건 식별 가능하도록" 해야함
	public Person(String name, int age) {
		
	}

	public Person(int age, String jumin) {
		
	}
	
	
	// 메서드
	// [접근제한자] 리턴타입 메서드명(매개변수, ...){구현}
	void method() {}
	
	// 메서드 오버로딩 (식별이 가능하면 된다)
	void method(String s) {}
	void method (int i) {}
	int method(String s, int i) { return 0; }
//	void method(String s, int i) {}	// 리턴타입은 식별에 상관없음 무조건 식별이 가능하게 달라야한다
	
	// 접근제한자(넓 -> 좁)
	// 1. public	: 제한 없음
	// 2. protected	: 다른 패키지면 접근 불가, 상속관계이면 (다른 패키지 이더라도)가능
	// 3. default	: 다른 패키지면 접근 불가
	// 4. private	: 자신 클래스 내부에서만 접근 가능
}



public class Ex1 {
	// static(공유, 메모리에 더 빨리 로딩됨)	공유, 메모리에 먼저 로딩(적재)
	int a = 10;
	String nName = "라마바";
	static int b = 20;
	static String sName = "사아자";
			
			

	public static void main(String[] args) {
//		System.out.println(0);
//		System.out.println(nName);
		System.out.println(b);
		System.out.println(sName);
		
	}
	 
	public static void staticMethod() {
//		System.out.println(a);
//		System.out.println(nName);
		System.out.println(b);
		System.out.println(sName);
//		normalMethod();		// 메모리에 없음
	}
	
	public void normalMethod() {
		// static 메모리에 더 빨리 로딩됨
		// 인스턴스 멤버 즉, 일반메서드가 메모리에 로딩되는 시점에는
		// 이미 static 멤버들은 메모리에 로딩되어있는 상태이기 때문에 접근 가능
		System.out.println(a);
		System.out.println(nName);
		System.out.println(b);
		System.out.println(sName);
	}
	
	
}
/*
 * 상속
 * 
 * - 부모(슈퍼) 클래스에 모든 멤버(생성자 제외)를 물려받는
 * 	 => private 접근제한자가 적용되어있는 멤버도 상속 대상에서 제외
 * 
 * 
 * */

class P {
	private String house = "이층집";
	
	public void run() {
		System.out.println("느리게 뜀");
	}
			
}

class C extends P {
	String car = "외제차";
	
	// 오버라이딩
	@Override
	public void run() {
		System.out.println("빨리 뜀");
	}
	

	
	
}


class S extends C{

	String computer = "컴퓨터";

	// 어노테이션 : 컴파일러를 위한 주석
	@Override
	public void run() {
		System.out.println("엄청 빨리 뜀");
	}
	
}

// super

class AA {
	String name = "AA";
}

class BB extends AA {
	String name = "BB";
}

class CC extends BB {
	String name = "CC";
	public void method() {
		String name = "";
		System.out.println(name);
		System.out.println(this.name);
		System.out.println(super.name);
	}
}













