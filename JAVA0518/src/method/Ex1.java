package method;

class Student {
	private String name;
	private int age;
	private int score;
	
	// Getter / Setter메서드 자동 생성 단축키
	// Alt + Shift + S -> R
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
	// 멤버변수 name 값을 외부로 리턴하는 Getter 메서드 정의
	// => 파라미터:X, 리턴타입 : String(이름(name) 리턴)
//	public String getName() {
//		return name;
//	}
	
	
	// 이름(name)을 외부로 전달받아 내부 멤버변수 name에 저장하는 Setter 메서드 정의
	// => 파라미터: 이름(String타입,  name), 리턴타입 : 리턴값이 없으므로 void
//	public void setName(String name) {
//		this.name = name;
//	}
	
	
	// 멤버변수 age에 대한 Getter메서드 정의
//	public int getAge() {
//		return age;
//	}
	
	
	// 멤버변수 age에 대한 Setter메서드 정의
//	public void setAge(int age) {
//		this.age = age;
//	}
	
	
	// 멤버변수 score에 대한 Getter메서드 정의
//	public int getScore() {
//		return score;
//	}
	
	
	// 멤버변수 score에 대한 Setter메서드 정의
//	public void setScore(int score) {
//		this.score = score;
//	}
	
	
}


public class Ex1 {

	public static void main(String[] args) {
		
		/*
		 * 캡슐화(Encapsulation) = 은닉성
		 * - 객체 내부의 구조(멤버변수 및 메서드 처리 과정)를 외부로 부터 숨기고
		 *   메세지만드로 객체와 통신하도록 하는 것
		 * - 클래스 정의 시 멤버변수를 private 접근제한자를 사용하여 외부 접근을 차단하고
		 *   public 접근제한자가 선언된 Getter / Setter 메서드를 정의하여
		 *   간접적으로 객체 내의 멤버변수에 접근하도록 하는 것
		 * - 모든 Getter / Setter 메서드는 누구나 접근 가능하도록 접근제한자 public을 사용
		 * - Getter 메서드는 내부 멤버변수 값을 외부로 리턴하는 역할을 수행하여
		 *   메서드 이름은 getxxx() 형태 (xxx : 리턴할 멤버변수 이름) 하고
		 *   파라미터x, 리턴타입은 리턴할 멤버변수와의 데이터타입을 지정
		 *   ex) 멤버변수 name에 대한 Getter 메서드명 : public String getName(){}
		 * - Setter 메서드는 외부로부터 전달받은 값을 내부 멤버변수에 저장하는 역할을 수행하여
		 *   메서드 이름은 setxxx() 형태 (xxx : 데이터를 저장할 멤버변수 이름)
		 *   파라미터o, 전달받은 데이터의 데이터타입을 지정하고, 
		 * 
		 * */
		
		
		
		Student s1 = new Student();
//		s1.name = "홍길동";
		s1.setName("홍길동");
//		s1.age = 10;
//		s1.score = 100;
		s1.setAge(1);
		s1.setScore(1);
		System.out.println("이름 : " + s1.getName());
		System.out.println("나이 : " + s1.getAge());
		System.out.println("점수 : " + s1.getScore());
		
		
	}

}











































