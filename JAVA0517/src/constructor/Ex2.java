package constructor;

class OverloadingPerson{
	
	String name;
	int age;
	boolean isHungry;
	
	// 기본생성자 직접 정의
	public OverloadingPerson() {
		System.out.println("OverloadingPerson() 생성자 호출됨");
		name = "홍길동";
		age = 20;
		isHungry = true;
	}
	
	// 생성자 오버로딩
	// 이름, 나이, 배고픔을 전달받아 멤버변수를 초기화하는 생성자 정의
	public OverloadingPerson(String name, int age, boolean isHungry) {
		System.out.println("OverloadingPerson(String, int, boolean) 생성자 호출됨");
		this.name = name;
		this.age = age;
		this.isHungry = isHungry;
	}
	
	public void print() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("배고픔 : " + isHungry);
	}
	
}

public class Ex2 {

	public static void main(String[] args) {
		//
		
		OverloadingPerson op = new OverloadingPerson();
		op.print();
		
		OverloadingPerson op2 = new OverloadingPerson("abc", 30, false);
		op.print();

	}

}
