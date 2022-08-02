package polymorphism;

public class Ex1 {

	public static void main(String[] args) {
		/*
		 * 레퍼런스 형변환
		 * - 참조형(레퍼런스 타입) 끼리의 형변환(상속 관계에서만 사용 가능)
		 * - 참조형 변수를 사용하여 다른 타입의 인스턴스(객체)를 참조하기 위해 변환하는 것
		 * - 업캐스팅(Up casting)과 다운캐스팅(Down casting) 으로 분류됨
		 * 
		 * 1. 업캐스팅(Up casting)
		 * - 슈퍼클래스의 레퍼런스가 서브클래스의 인스턴스를 참조하는 것
		 *   = 서브클래스의 인스턴스를 슈퍼클래스 타입으로 변환하는 것
		 * - 묵시정 형변환(자동 형변환)이 일어남
		 *   => 슈퍼클래스로붙어 상속된 멤버만 접근 가능하고, 서브클래스의 멤버는 접근 불가
		 * - 일반적인 클래스간의 형변환은 대부분 업캐스팅을 의미함
		 * - 업캐스팅을 통해 다형성(Polymorphism) 활용이 가능    
		 * 
		 * 2. 다운캐스팅(Down casting)
		 * - 서브클래스의 레퍼런스가 슈퍼클래스의 인스턴스를 참조하는 것(가리키는 것)
		 *   = 슈퍼클래스의 인스턴스를 서브클래스 타입으로 변환 하는 것
		 * - 참조 가능한 영역에 대한 확대 발생  
		 * - 자동 형변환이 일어나지 않으므로, 명시적(강제) 형변환이 필수!
		 *   => 즉, 형변환 연산자를 통해 좌변(서브클래스)의 데이터타입을 명시해야한다!
		 * - 명시적 형변환을 통해 문법적(구문)오류가 해결되더라도
		 *   실제 실행 시점에서 오류가 발생할 수도 있음
		 *   => 참조 가능 영역의 확대로 인해 존재하지 않는 영역에 대한 참조의 위험성 때문 
		 * 
		 * */

//		int a = 10;
//		long l = a;
//		long l = (long)a;		
		
//		1. 참조 데이터타입 에서의 묵시적 (자동) 형변환 = 업캐스팅
		Child c = new Child();
		c.parentPrn();
		c.childPrn();
		
		Parent p;
		p = c;	// 서브클래스 인스턴스 주소를 슈퍼클래스 타입 변수에 전달
		// => 슈퍼클래스 타입 변수(p)가 서브클래스 인스턴스(c)를 가리킴
		// => 이때, 자동으로 Child -> Parent 변환이 일어나므로 업캐스팅
		
		p.parentPrn();
//		p.childPrn();	// err 서브클래스에서 정의한 메서드는 접근 불가능!
		
		
//		2. 참조 데이터타입 에서의 명시적 (강제) 형변환 = 다운캐스팅
		Parent p2 = new Parent();
		
		// 슈퍼클래스 타입 Parent 변수 p2로 접근 가능한 메서드 : 1개
		p2.parentPrn();
		
		// 서브클래스 타입 레퍼런스 변수(c2) 선언
		Child c2;
//		c2 = p2;	// err 컴파일러에 의한 자동 형변환이 제공되지 않는다
					// 따라서, Parent -> Child 타입으로 변환시 명시적 형변환이 필수
//		c2 = (Child)p2;
		
		// 만약, 변환이 가능하다고 가정했을 때
		// 서브클래스 타입 레퍼런스 변수 (c2)로 접근 가능한 메서드 : 2개
//		c2.parentPrn();	// Parent꺼
//		c2.childPrn();	// 실제 Parent 인스턴스 "존재하지 않는" 메서드
		// => childPrn() 메서드는 실제 Parent 인스턴스에는 존재하지 않는 메서드이며
		//	Child 클래스가 이 메서드를 갖고 있으므로 컴파일 시점에는 참조 가능한 메서드
		//	따라서, 다운캐스팅 후에는 존재하지 않는 영역에 대한 참조 위험성이 발생하므로
		//	자바에서는 대부분의 다운캐스팅은 인정하지 않는다 = 실행 시 오류 발생
		
//		3. 다운 캐스팅이 가능한 경우
//		=> 이전에 이미 업캐스팅 된 인스턴스를 다시 다운캐스팅 하는 경우
		Parent p3 = new Child();	// Child -> Parent 로 업캐스팅(자동 형변환)
		p3.parentPrn();
//		p3.childPrn();
		
		// 다운캐스팅에 의해 참조 가능한 영역이 확대됨
		// 따라서, 서브클래스 타입 c3로 접근 가능한 메서드 : 2개
		Child c3 = (Child)p3;	// 명시적 형변환을 통한 다운캐스팅
		c.parentPrn();
		c.childPrn();
		
		/*
		 * 다운캐스팅(Down casting) - 결론
		 * - 서브클래스의 레퍼런스가 슈퍼클래스의 인스턴스를 참조 하는것
		 *   = 슈퍼클래스의 인스턴스를 서브클래스 타입으로 변환 하는 것
		 * - 참조 가능한 영역에 대한 확대 발생
		 * - 자동 형변환이 일어나지 않으므로, 명시적(강제) 형변환이 필수
		 *   => 즉, 형변환 연산자를 통해 좌변(서브클래스)의 데이터타입을 명시!
		 * ------------------------------------------------------
		 * => 최종결론!
		 *    - 이전에 이미 업캐스팅 된 레퍼런스를 다시 다운캐스팅 하는 경우에만 안전하다!
		 *    - 근본이 중요!
		 *      => new 키워드로 생성한 객체가 무엇인지가 중요!  
		 * 
		 * */
		
	}

}

class Parent {
	
	public void parentPrn() {
		System.out.println("슈퍼클래스의 parentPrn()");
	}
}

class Child extends Parent {
	
	public void childPrn() {
		System.out.println("서브클래스의 parentPrn()");
	}
}


