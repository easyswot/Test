package ex05_09;

public class Ex8 {

	public static void main(String[] args) {
		// 278p
		
		// Q1) extends
		// 자바에서 어떤 클래스의 기능을 확장하여 새로운 클래스를 만들기 위해
		// 상속을 합니다. 이때, 사용하는 예약어는 --- 입니다
		
		// Q2) super
		// 하위클래스가 상위 클래스의 생성자를 호출하거나 상위 클래스의 멤버변수,
		// 메서드를 호출하기 위해 사용하는 예약어로 상위클래스의 주소, 즉 참조값을 나타내는
		// 예약어는 --- 입니다
		
		// Q3) 메서드 오버라이딩(method overriding)
		// 클래스를 상속받은 상태에서 상위 클래스에 이미 정의되어 있는 메서드를 하위 클래스에서
		// 사용하기에 적절하지 않은 경우에 해당 메서드를 재정의 할 수 있습니다. 이것을 ---
		
	}

}

// Q4)
// 정답 : 상위클래스(Employee)에 디폴트 생성자가 없으므로
//		 하위클래스(Engineer)에서 생성자를 정의하고 super()를 사용하여
//		 상위클래스의 생성자를 명시적으로 호출해야함

class Employee {
	public String name;
	public String grade;
	public Employee(String name) {
		this.name = name;
	}
}

//class Engineer extends Employee {
//	
////	public Engineer(String name) {	// 기본생성자의 부재로 Engineer 오류
////		super(name);
////	}
//
//	private String skillset;
//	public String getSkillset() {	//skillset's get method
//		return skillset;
//	}
//	
//	public void setSkillset(String skillset) {	// skillset's set method
//		this.skillset = skillset;
//	}
//}

