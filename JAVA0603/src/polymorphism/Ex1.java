package polymorphism;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Ex1 {

	public static void main(String[] args) {
		
		/*
		 * 다형성(polymorphism)
		 * - 하나의 클래스 타입 참조변수로 여러 인스턴스를 참조할 수 있는 특성
		 * - 서브클래스 타입 인스턴스들을 슈퍼클래스 타입으로 업캐스팅하여
		 * 	 공통된 방법으로 여러 인스턴스의 멤버에 접근
		 * 	 ex) Employee 타입 변수로 Manager와 Engineer 인스턴스를 참조하여
		 * 		 각 객체내의 메서드(getEmployee() 등)를 공통으로 다루는 것 
		 * - 슈퍼클래스 타입 배열에 서브클래스 타입 인스턴스를 저장하거나
		 * 	 메서드 정의시 매개변수 하나에 여러 타입의 인스턴스를 파라미터로 전달할 때 활용
		 * 
		 * <주의사항>
		 * 업캐스팅 후 슈퍼클래스 타입으로 서브클래스를 다룰 때
		 * 멤버변수는 참조변수 타입에 따라 결정되고,
		 * 메서드는 실제 인스턴스에 따라 결정됨
		 * => 메서드 오버라이딩 시 업캐스팅 후에도 오버라이딩 된 메서드만 호출되지만
		 * 	  변수에 대한 오버라이딩 시 업캐스팅 후에는 해당 변수에 접근하는
		 * 	  참조변수 타입에 따라 접근하는 변수가 달라진다.
		 * 
		 * 
		 * */
		
		Animal a1 = new Dog("dog1");
		System.out.println(a1.name);
		
		Dog d1 = new Dog("dog2");
		System.out.println(d1.name);
		
		// ------------------------------------------------------------------------------------
		
		Circle c = new Circle();
		Rectangle r = new Rectangle();
		Triangle t = new Triangle();
		
		// 만약, 상속을 통한 메서드 오버라이딩 없이 각 클래스 자율적으로 메서드를 정의할 경우
		// => 각각의 클래스 메서드가 다르므로 통일성이 사라짐
		
		// 추상화를 통해 슈퍼클래스인 Shape 클래스를 정의하고
		// 상속을 통해 Shape 클래스의 draw() 메서드를 오버라이딩 하게 되면
		// 각 인스턴스에서 호출하는 메서드가 동일하므로 코드의 통일성이 향상됨
		
		Shape s = c;
		s.draw();
		
		s = r;
		s.draw();
		
		s = t;
		s.draw();
		
		System.out.println("--------------------------------------------");
		
		// 다형성을 배열에 적용 시키는 경우
		Shape[] sArr = new Shape[3];
		
		// Shape 타입 배열 각 인덱스에 Circle, Rectangle, Triangle 인스턴스 생성하여 저장
		sArr[0] = new Circle();
		sArr[1] = new Rectangle();
		sArr[2] = new Triangle();
		
		// 반복문을 활용하여 draw 메서드 호출
		
		for(int i = 0 ; i < sArr.length ; i++) {
			sArr[i].draw();
		}
		
		// 향상된 for문 활용하여 draw 메서드 호출
		
		for(Shape shape : sArr) {
			shape.draw();
		}
		
		// ---------------------------------------------
		ArrayList<Shape> arr = new ArrayList<Shape>();
		arr.add(new Circle());
		arr.add(new Rectangle());
		arr.add(new Triangle());
		
		for(int i = 0 ; i < arr.size() ; i++) {
//			if(arr.get(i) instanceof Shape) {
//				Shape shape = (Shape)arr.get(i);
//				shape.draw();
//			}
			arr.get(i).draw();
		}
		
		for(Shape shape : arr) {
			shape.draw();
		}
		
		
		
		
		
	}

}

// 도형(Shape) 클래스 정의
class Shape {
	public void draw() {
		System.out.println("도형 그리기");
	}
}

class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("원 그리기");
	}
}

class Rectangle extends Shape {
	@Override
	public void draw() {
		System.out.println("사각형 그리기");
	}
}

class Triangle extends Shape {
	@Override
	public void draw() {
		System.out.println("삼각형 그리기");
	}
}





// ---------------------------------------------------------------------------------------------------
class Animal {
	String name;
	
}

class Dog extends Animal{
	String name;

	public Dog(String name) {
		this.name = name;
	}
	
}

class Cat extends Animal {
	String name;

	public Cat(String name) {
		this.name = name;
	}
	
}









