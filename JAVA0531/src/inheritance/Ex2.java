package inheritance;

public class Ex2 {

	public static void main(String[] args) {
		
		SpiderMan sm = new SpiderMan();
		sm.name = "피터 파커";
		sm.age = 20;
		sm.nickName = "친절한 이웃 스파이더맨";
		sm.eat();
		sm.jump();
		sm.fireWeb();
//		sm.normalLife();	// 오류 private 접근제한자로 선언된 메서드는 상속 불가
		System.out.println();
		
		// 생성자도 상속 대상에서 제외됨
		// => 생성자의 이름은 클래스의 이름과 동일해야하는데
		//	  생성자를 상속받을 경우 자신의 이름이 아는 부모 클래스의 이름이 사용되므로
		//	  생성자 작성 규칙을 위반하게 되므로 생성자는 상속되지 않는다
		new Person();
		new Person("홍길동", 20);
		
//		new SpiderMan("피터 파커", 20);	// err
		// => 생성자도 상속되지 않으므로, 서브클래스 타입의 파라미터 생성자 호출 불가능
				
	}

}


class Person {
	String name;
	int age;
	
	public Person() {}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void eat() {
		System.out.println("밥 먹기!");
	}
	
	public void jump() {
		System.out.println("점프!");
	}
	
	private void normalLife() {
		System.out.println("평범한 삶!");
	}
	
}

class SpiderMan extends Person {
	String nickName;
	
	
	
//	public SpiderMan(String name, int age, String nickName) {
//		super(name, age);
//		this.nickName = nickName;
//	}



	public void fireWeb() {
		System.out.println("fire");
	}
}
