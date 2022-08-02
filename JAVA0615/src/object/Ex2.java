package object;

import java.util.Objects;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 3. equals() 메서드
		 * - 두 객체가 같은 객체인지 판별하는 메서드
		 * - Object 클래스의 equals() 메서드는 두 객체의 주소값(참조값)을 비교하여
		 * 	 주소값이 같으면 true, 서로 다르면 false 리턴
		 * - Object 클래스의 equals() 메서드는 기본적으로 주소값을 비교할 때
		 * 	 메서드 내부에서 동등비교연산(==)을 통해 비교하게 되므로
		 * 	 일반적인 동등 비교연산 결과와 동일함
		 * - 문법 구조 : boolean equals(Object obj)
		 * 	 => 파라미터로 전달된 Object 타입 객체 obj의 주소값을 자신의 주소값과 비교하여
		 * 		true 또는 false 리턴
		 * - 일반적으로 객체의 동등 여부를 비교할 때는 Object 클래스의 equals() 메서드를
		 * 	 그대로 사용하지 않고, 비교 대상 클래스 내에서 오버라이딩 한 후
		 * 	 해당 객체의 멤버변수 값을 1:1로 비교하여 모든 데이터 같으면 true,
		 * 	 하나라도 다를 경우 false를 리턴하도록 오버라이딩 한다 
		 * - 대부분 자바에서 제공하는 API 들은 equals() 메서드 이미 오버라이딩 되어 있으므로
		 * 	 해당 객체들의 값 비교시 equals() 메서드 활용이 가능함
		 * 	 (ex. String, Wrapper 클래스 계열 등)
		 * 
		 * < 결론 >
		 * 어떤 두 객체의 실제 값을 비교하고 싶을 때는
		 * 해당 객체의 equals() 메서드를 호출하여 객체간의 비교를 수행하면 되고
		 * 자신이 직접 클래스를 정의할 때는 equals() 메서드를 오버라이딩하여
		 * 객체 내의 멤버변수 끼리 비교가 가능하도록 구현해야한다.
		 * 
		 * */
		// ----------------동등비교연산자(==)을 사용한 변수값 비교-------------------
		int num1 = 10;
		int num2 = 10;
		
		if(num1==num2) {
			System.out.println("num1, num2 same");
		} else {
			System.out.println("num1, num2 different");
		}

		Object o1 = new Object();
		Object o2 = new Object();
		
		// 인스턴스를 생성할 때마다 서로 다른 메모리 공간에 인스턴스가 생성되므로
		// 해당 인스턴스의 주소값도 인스턴스마다 달라진다
		if(o1==o2) {
			System.out.println("o1, o2 same");
		} else {
			System.out.println("o1, o2 different");
		}
		
		Object o3 = o1;
		if(o1==o3) {
			System.out.println("o1, o3 same");
		} else {
			System.out.println("o1, o2 different");
		}
		
		
		
		// ----------------equals() 메서드를 사용한 객체 비교---------
		// 일반적으로 현실에서 두 객체가 같은가? 라는 질문은 두 객체의 주소값이 아닌
		// 객체 내에 저장된 실제 데이터가 같은지 물어보는 것이 일반적이다.
		// 그러나, equals() 메서드는 두 객체의 주소값을 비교하므로
		// 두 객체에 저장된 데이터가 같더라고 false가 리턴되므로 적합하지 않다.
		if(o1.equals(o2)) {
			System.out.println("o1, o2 same");
		} else {
			System.out.println("o1, o2 different");
		}
		
		
		System.out.println("--------------------------------------");
		Person p1 = new Person("가나다", 20);
		Person p2 = new Person("가나다", 20);
		
		if(p1 == p2) {
			System.out.println("p1, p2 same");
		} else {
			System.out.println("p1, p2 different");
		}
		
		if(p1.equals(p2)) {
			System.out.println("p1, p2 same");
		} else {
			System.out.println("p1, p2 different");
		}
		
		EqualsPerson ep1 = new EqualsPerson("가나다", 1);
		EqualsPerson ep2 = new EqualsPerson("가나다", 1);
		
		System.out.println(ep1.equals(ep2));
		
		
	}

}

class EqualsPerson {
	String name;
	int age;
	
	public EqualsPerson() {}
	public EqualsPerson(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// Object 클래스의 equals() 메서드를 오버라이딩 하여
	// 멤버변수의 데이터가 모두 같으면 true 하나라도 다른 경우 false를 리턴하도록 재정의
//	@Override
//	public boolean equals(Object obj) {
////		if(this.name == obj.name) {}	// 참조영역 축소로 인해 obj에서 age, name 변수가 보이지 않는다
//			// => 따라서, 다시 다운캐스팅을 통해 참조영역을 확대하면 멤버변수가 보이게 된다
//			// Object obj -> EqualsPerson p로 다운캐스팅
//		if(obj instanceof EqualsPerson) {
//			EqualsPerson p = (EqualsPerson)obj;
//			
//			if(this.name.equals(p.name) && this.age == p.age) {
//				return true;
//			}
//		}
//		
//		return false;
//		
//	}
	
	// equals() 메서드 자동 오버라이딩 단축키 : alt shift s h
	@Override
	public boolean equals(Object obj) {
		if (this == obj)		// str.equals(str) 즉, 파라미터로 자기자신 전달(비교할 필요 없음)
			return true;		// 비교도 안하고 true하는 이유 : this와 obj 둘 다 자기 자신이기 때문
		if (obj == null)		// str.equals(null) 즉, 파라미터로 아무것도 전달되지 않음(비교할 것이 없음)
			return false;		// 매개변수로 null값이 전달돼서 비교 할 값이 없음
		if (getClass() != obj.getClass())	// p.equals(p2) p:Person, p2:Person2
											// 즉, 다른 클래스 객체가 전달됨(비교할 필요 없음)
			return false;		// 클래스가 다른 케이스는 비교하지 않겠다.
		
		// 다운캐스팅 시 instanceof로 확실히 클래스를 확인 후 다운캐스팅 하는 것이 안전함
		// 그런데 145 라인까지 정상적으로 실행되었다는 말은 무조건 같은 클래스 타입이므로
		// instanceof로 확인할 필요가 없어서 바로 다운캐스팅 하고 있음
		EqualsPerson other = (EqualsPerson) obj;	// 다운캐스팅 해주는 상황 그러나 if로 판단하지 않고 다운캐스팅 하고 있는 이유는?
													// 위에 거친 3개의 if문을 거치면서 같은 클래스임을 증명했으므로 다시 한 번 확인할 필요가 없기 때문
		return age == other.age && Objects.equals(name, other.name);
	}
	
	
}
























