package override;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 * 상속에서의 생성자
		 * - 생성자는 상속되지 않음
		 * 	 (생성자의 이름은 클래스명과 동일해야하는데, 부모의 생성자는 자식과 이름이 다름)
		 * - 서브클래스의 객체(인스턴스) 생성 시, 먼저 슈퍼클래스의 인스턴스를 생성한 후
		 * 	 서브클래스의 인스턴스가 생성됨
		 * 	 => 이 때, 서브클래스의 생성자 내에서 먼저 자동으로 슈퍼클래스의 기본생성자를 호출
		 * 		(생성자 super() 코드가 생략되어 있을 경우에도 암묵적으로 호출됨)
		 * 	 => 슈퍼클래스의 생성자 내에서 작업이 모두 끝나면
		 * 	    다시 서브클래스의 생성자로 돌아와서 다음 코드들을 실행하게 됨
		 * 		즉, 슈퍼클래스 생성자의 코드가 먼저 실행된 후 서브클래스 생성자 코드가 실행됨
		 * 
		 * 생성자 super()
		 * - 서브클래스의 생성자 내에서 슈퍼클래스의 생성자를 명시적으로 호출하는 코드
		 * - 서브클래스의 생성자 내에 생성자 super() 코드가 생략될 경우
		 * 	 컴바일러에 의해 슈퍼클래스의 기본생성자를 호출하는 super()가 자동으로 추가됨
		 * - 생성자 super()도 생성자 this()와 마찬가지로 생성자 내에서
		 * 	 반드시 첫번째로 실행되어야 한다(주석문 제외하고 첫줄에 코딩)
		 * 	 => 따라서, 생성자 this()와 생성자 super()는 하나의 생성자에서 기술불가
		 * 	 => 만약, 오버로딩 생성자 호출 this()와 슈퍼클래스를 호출하는 super()가
		 * 		함께 실행되어야 하는 경우 생성자 this()를 통해 다른 생성자를 먼저 호출한 후
		 * 		해당 오버로딩 생성자 내에서 생성자 super()를 통해 슈퍼클래스에 접근해야함
		 *      
		 * -* 주로, 슈퍼클래스의 기본생성자가 없는 상태에서 파라미터 생성자만 정의 했을 경우
		 *   서브클래스에서 슈퍼클래스 기본생성자를 호출하게 되면 오류가 발생하므로
		 *   이때, 슈퍼클래스의 파라미터 생성자를 명시적으로 호출하는 용도로 사용
		 *   super(전달할 데이터...);
		 * 
		 * 
		 * */
		
		new Child3();
		
		
	}

}

class Parent3 {
	public Parent3(String name) {
		System.out.println("Parent3() 생성자 호출됨");
	}
}

class Child3 extends Parent3 {
	public Child3() {
		super("홍길동");
		System.out.println("Child3() 생성자 호출");
	}
}


class Person2 {
	String name;
	int age;
	
	public Person2() {}
	public Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

class SpiderMan2 extends Person2 {
	boolean isSpider;
	
	
	public SpiderMan2(String name, int age, boolean isSpider) {
//		this.name = name;	// super.name = name과 동일
//		this.age = age;		// super.age = age; 와 동일한 코드
//		// 이처럼 슈퍼클래스의 생성자와 상속받은 멤버변수에 대한 초기화 코드가 중복될 경우
//		// 서브클래스의 생성자에서 직접 초기화 하지 않고 슈퍼클래스의 생성자를 호출하여
//		// 간접적으로 상속받은 멤버변수에 대한 초기화를 수행하고,
//		// 서브클래스에서 선언한 멤버변수만 직접 초기화하면 코드 중복 제거 가능
//		
		super(name, age);
		this.isSpider = isSpider;
	}
	/*
	 * 슈퍼 클래스를 통해 간접적으로 초기화 하도록 생성자를 자동 정의하는 단축키
	 * 1. alt shift s o 슈퍼클래스의 파라미터 생성자를 선택하여 자동 생성
	 * 	=> 슈퍼클래스의 멤버변수를 슈퍼클래스에서, 서브클래스의 멤버변수를 서브클래스에서
	 * 		초기화하는 생성자가 자동으로 생성됨
	 * 2. alt shift s c 누른 후 슈퍼클래스의 생성자 중 원하는 생성자 선택하면
	 * 	  슈퍼클래스의 생성자와 동일한 형태의 생성자가 자동으로 생성
	 * 	  (주로, 서브클래스에 멤버변수가 없을 때 
	 * */
}

