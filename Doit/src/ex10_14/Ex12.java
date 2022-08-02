package ex10_14;

import java.util.HashMap;

public class Ex12 {

	public static void main(String[] args) {
		/*446
		 * 
		 * 1. 자료구조를 사용하기 편리하도록 자바에서 제공하는 라이브러리
		 * = 컬렉션 프레임워크
		 * 
		 * 2. 클래스에서 여러 자료형을 사용할 때 자료형을 명시하지 않고 자료형을 의미하는 문자로 선언한 후 실제 클래스를 생성할 때 자료형을 명시하는 프로그래밍 방식
		 * = 제네릭 (프로그래밍)
		 * 
		 * 3. Collection 인터페이스를 구현한 클래스를 순회하기 위해 사용하는 인터페이스
		 * = iterator
		 */
		
		
		
		/*
		 * 모르겠는디요
		 * 
		 * 6. 다음 코드에서 CarTest의 테스트 결과가 true, true, false가 되도록 HashMap을 사용해 CarFactory 클래스를 구현
		 * 
		 * 
		 * 
		 * */
		CarFactory factory = CarFactory.getInstance();	// new로 생성하지 않고 메서드 생성해서 객체를 받아들이고 있다
														// => 싱글톤
		CarFactory factory2 = CarFactory.getInstance();
		Car sonata1 = factory.createCar("쏘나타");
		Car sonata2 = factory.createCar("쏘나타");
		System.out.println(sonata1 == sonata2);	// true
		
		Car torress1 = factory.createCar("토레스");
		Car torress2 = factory.createCar("토레스");
		System.out.println(sonata1 == sonata2);	// true
		
		System.out.println(sonata1 == torress1);	// false
		
		
		
		
		
		
		
		
	}

}

class CarFactory {
	
	// 3. CarFactory 객체가 1번만 생성되도록 멤버변수 정의
	//	=> static 메서드 내에서 static 멤버만 접근 가능
	
//	private static CarFactory instance = new CarFactory(); //new CarFactory() 있어도 되고 없어도 되고
	private static CarFactory instance;
	private CarFactory() {}	// 1. 외부에서 new 키워드로 객체 생성할 수 없도록 private
	
	// 2. CarFactory factory = CarFactory.getInstance();
	// => 리턴 타입 : CarFactory
	// => 클래스명.메서드명()으로 호출하는 것 보니 static
	
	public static CarFactory getInstance() {
		// 멀티스레드환경의 안전장치
		if(instance == null) {
			instance = new CarFactory();
		}
		
		return instance;	// new라는 키워드가 딱 한번만 실행되도록
	}
	
	HashMap<String, Car> carMap = new HashMap<String, Car>();
	
	
	public Car createCar(String name) {
		
		if(carMap.containsKey(name)) {
			return carMap.get(name);
		}
		
		Car car = new Car();
		carMap.put(name, car);
		
		return car;
	}
	
}



class Car {
	
}
