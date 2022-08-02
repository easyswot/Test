package lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 * 3. Function 계열
		 * - 파라미터 리턴 모두 존재
		 * */
		FunctionTest ft = new FunctionTest();
		ft.addPerson((name, age) -> new Person(name, age), "홍길동", 20);
		
		ft.printPerson(name -> {
			
			if(ft.person.name.equals(name)) {
				return ft.person.toString();
			} else {
				return "unknown user";
			}
		}, "가나다");
		
		
	}

}

class Person {

	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}

class FunctionTest {
	
	Person person;
	
	// String과 Integer를 매개변수로 받고 Person을 리턴하는
	// BiFunction 타입에 String, Integer 받는 메서드 apply() 활용
	public void addPerson(BiFunction<String, Integer, Person> function, String name, Integer age) {
		person = function.apply(name, age);
	}
	
	// String을 파라미터로 받고 String을 리턴하는
	// Function 타입에 String을 받는 apply() 활동
	public void printPerson(Function<String, String> function, String name) {
		System.out.println(function.apply(name));
	}
	
}


















