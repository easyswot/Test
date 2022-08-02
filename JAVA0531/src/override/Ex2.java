package override;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 멤버변수에 대한 오버라이딩
		 * - Parent 클래스로부터 상속 받은 멤버변수와
		 *   동일한 이름의 변수를 서브클래스에서 선언하면
		 *   메서드 오버라이딩과 마찬가지로 멤버변수에 대한 은닉이 발생하여
		 *   슈퍼클래스의 멤버변수는 보이지 않고, 서브클래스의 멤버변수에만 접근 가능해진다!
		 * 
		 * 레퍼런스 super
		 * - 레퍼런스 this와 마찬가지로 인스턴스의 주소를 저장하는 참조변수
		 * - 레퍼런스 this는 자신의 인스턴스 주소를 저장하는 반면,
		 *   레퍼런스 super는 부모의 인스턴스 주소를 저장함
		 * - 메서드(또는 변수) 오버라이딩으로 인해 슈퍼클래스의 멤버가 은닉되었을 때
		 *   서브클래스에서 슈퍼클래스의 은닉된 멤버에 접근하기 위해 사용
		 * - super.super 형식처럼 super 키워드를 중첩해서 사용할 수 없다!
		 * 
		 * < 기본 사용 문법 >
		 * 서브클래스의 메서드 내에서
		 * super.부모의멤버변수 또는 super.부모의메서드()
		 *     
		 * < 변수 사용 시 선언 방법에 따른 접근 순서 > 
		 * 1. 변수명만 지정했을 경우
		 *    현재 선언된 메서드 내에서 먼저 탐색 -> 없을 경우 자신의 멤버변수에서 탐색
		 *    -> 부모의 멤버변수에서 탐색
		 *    
		 * 2. this.변수명을 지정했을 경우
		 *    자신의 멤버변수에서 탐색 -> 부모의 멤버변수에서 탐색   
		 *    
		 * 3. super.변수명을 지정했을 경우
		 *    부모의 멤버변수에서 탐색
		 * */
		
		
		
		Child2 c = new Child2();
		System.out.println(c.tv);
		
		c.watchTv();
		c.watchMyParentTv();
		
		System.out.println("=====================================");
		
		c.scope();
		
		System.out.println("=====================================");
		SonOfChild s = new SonOfChild();
		s.scope();
		
		System.out.println("======================================");
		
		SpiderMan sm = new SpiderMan();
		System.out.println("현재 스파이더맨 모드인가? " + sm.isSpider);
		sm.jump();
		
		sm.isSpider = true;
		System.out.println("현재 스파이더맨 모드인가? " + sm.isSpider);
		sm.jump();
		
		
	}

}

class Person {
	String name;
	int age;
	
	public void jump() {
		System.out.println("일반인의 점프");
	}
	
	public void eat() {
		System.out.println("밥 먹기");
	}
	
}

class SpiderMan extends Person {
	boolean isSpider;
	
	@Override
	public void jump() {
		// 만약, isSpider 가 true이면 "스파이더맨의 강력한 점프!" 를 출력하고,
		// 아니면, 슈퍼클래스의 Person 클래스의 jump() 메서드를 호출만약, isSpider가 true이면 스파이더맨의 강력한 점프 출력 아니면 일반
		if(isSpider) {
			System.out.println("스파이더맨의 강력한 점프");
		} else {
			// 자신의 오버라이딩 된 jump() 메서드가 아닌 슈퍼클래스의 jump() 메서드를 호출
			super.jump();
		}
	}
}


class Parent2 {
	String tv = "부모님이 구입한 TV";
	
	public void watchTv() {
		System.out.println("부모님 댁에서 " + tv + "를 보자");
	}
	
	String name = "Parent의 멤버변수 name";
}

class Child2 extends Parent2 {
	String tv = "내가 구입한 TV";

	@Override
	public void watchTv() {
		System.out.println("우리집에서 " + tv + "를 보자");
		System.out.println("super.tv = " + super.tv);
	}
	
	public void watchMyParentTv() {
//		watchTv();			// 자신의 클래스인 Child 클래스에 오버라이딩된 메서드가 호출
		
		// 슈퍼클래스인 Parent 클래스의 watchTv() 메서드를 호출하기 위해서는
		// 레퍼런스 super를 사용하여 부모(Parent) 인스턴스에 접근 해야한다!
		super.watchTv();	
	}
	
	String name = "Child의 멤버변수 name";
	
	public void scope() {
		String name = "Child 클래스 메서드 내의 로컬변수 name";
		System.out.println("name = " + name);
		System.out.println("this.name = " + this.name);
		System.out.println("super.name = "  + super.name);
	}
	
}

class SonOfChild extends Child2 {
	String name = "SonOfChild의 멤버변수 name";
	
	public void scope() {
		System.out.println("name = " + name);
		System.out.println("this.name = " + this.name);
		System.out.println("super.name = "  + super.name);
//		System.out.println("super.super.name = " + super.super.name);	//err 사용불가
	}
}

//==========================================================================================
class 할아버지 {
	String name2;
}

class 아버지 extends 할아버지 {
	String name;
}

class 나 extends 아버지{
	String name;
	
	public void method() {
		String name;
		System.out.println(name2);			// method안에서 먼저
		System.out.println(this.name2);		// method 생략 멤버변수부터
		System.out.println(super.name2);	// 멤버변수 생략 부모클래스부터
	}
}

