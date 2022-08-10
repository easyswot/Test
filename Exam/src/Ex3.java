
public class Ex3 {

	public static void main(String[] args) {
		/*
		 * 레퍼런스 형변환
		 * => 업캐스팅, 다운캐스팅
		 * */
		A a = new D();
//		B b = a;	// 이유 :형변환이 안됨 강제형변환 해줘야 함
		B b = (B)a;
		
					// 어떤 데이터타입에 들어갈 수 있는가
		new G();	// A, C, G
		new B();	// A, B
		new F();	// A, C, F
		
	}

}

class A {}
class B extends A {}
class C extends A {}
class D extends B {}
class E extends B {}
class F extends C {}
class G extends C {}