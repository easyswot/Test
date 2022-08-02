package abstract_;

import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {
		
		// 추상클래스인 Flyer 클래스는 인스턴스 생성 불가
//		Flyer f = new Flyer();
		
		Flyer f1 = new Bird();
		f1.fly();
		
		Flyer f2 = new SuperMan();
		f2.fly();
		
		Flyer f3 = new Airplane();
		f3.fly();
		
		System.out.println("------------------------------------");
		
		// Flyer 클래스 인스턴스 생성은 불가능하지만, 참조변수 타입으로 활용 가능(다형성)
		Flyer f;
		f = new Bird();
		f.fly();
		
		f = new SuperMan();
		f.fly();
		
		f = new Airplane();
		f.fly();
		
		// Flyer배열 크기3 만들어서 각각 업캐스팅 수 
		// 향상된 for문으로 fly() 메서드 호출
		
		Flyer[] fArr = {new Bird(), new SuperMan(), new Airplane()};
		for (Flyer flyer : fArr) {
			flyer.fly();
		}
		
		System.out.println("----------------------------------------------------------");
		
		ArrayList arrList = new ArrayList();
		
		for (Object o : arrList) {
			if(o instanceof Flyer) {
				Flyer flyer = (Flyer)o;
				flyer.fly();
			}
		}
		
		
	}

}

// 날아다니는 것 (Flyer)
// fly() 추상메서드

// Bird 클래스 정의 - Flyer 클래스 상속
// => 추상 메서드 fly() 오버라이딩하여 구현 ("Bird 비행" 출력)

// SuperMan 클래스 정의 - Flyer 클래스 상속
// => 추상 메서드 fly() 오버라이딩하여 구현 ("SuperMan 비행" 출력)

// Airplane 클래스 정의 -> Flyer 클래스 상속
// => 추상메서드 fly() 오버라이딩하여 구현("Airplane 비행" 출력)

abstract class Flyer {
	 public abstract void fly();
}


class Bird extends Flyer {
	@Override
	public void fly() {
		System.out.println("Bird 비행");
	}
}

class SuperMan extends Flyer {
	@Override
	public void fly() {
		System.out.println("SuperMan 비행");
	}
}

class Airplane extends Flyer {
	@Override
	public void fly() {
		System.out.println("Airplane 비행");
	}
}