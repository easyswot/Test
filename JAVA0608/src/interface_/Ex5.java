package interface_;

public class Ex5 {

	public static void main(String[] args) {
		/* 
		 * 
		 * - interface는 모두 추상메서드 밖에 없다
		 * 	 그런데 거의 모든 상황에서 동일하게 동작할 메서드이지만
		 * 	 추상메서드로 선언할 수 밖에 없으므로 즉, 상속받는 모든 클래스는
		 * 	 추상메서드를 재정의 할 수 밖에 없다 (실제로 동작이 90% 같은 상황)
		 * 
		 * interface 에서 static
		 * 
		 * */
		SubClass1 s1 = new SubClass1();
		I.method();
//		s1.method();	// method()가 뜨지 않음
		

	}

}

interface I {
	static void method() {
		System.out.println("static method");
	}
}

class SubClass1 implements I {
	// 오버라이딩 하지 않아도 에러 발생하지 않음
//	public void m() {
//		I.method();
//	}
}

class SubClass2 implements I {
	
}




