package review;

public class Ex2 {

	public static void main(String[] args) {
//		A a = new B1();
//		B2 b2 = a;
//		B1 b1 = a;
//		C3 c3 = a;
//		C1 c1 = a;
		
//		A a = new C1();
//		B2 b2 = a;
//		B1 b1 = a;
//		C3 c3 = a;
//		C1 c1 = a;
		
//		A a = new C3();
//		B2 b2 = a;
//		B1 b1 = a;
//		C3 c3 = a;
//		C2 c2 = a;
		
//		A a = new B1();
//		B2 b2 = a;
//		B1 b1 = a;
//		C3 c3 = a;
//		C1 c1 = a;
		
//		B1 b1 = new D2();
//		A a = b1;
//		B2 b2 = b1;
//		C2 c2 = b1;
//		D1 d1 = b1;
//		C3 c3 = b1;
		
//		B1 b2 = new C3();	0
//		A a = b2;			0
//		C3 C3 = a;			0
//		D4 d4 = a;			x
//		D1 d1 = a;			x
//		C4 c4 = b2;			x
		
		
	}

}

class A {}
class B1 extends A {}
class B2 extends A {}
class C1 extends B1 {}
class C2 extends B1 {}
class C3 extends B2 {}
class C4 extends B2 {}
class D1 extends C1 {}
class D2 extends C1 {}
class D3 extends C3 {}
class D4 extends C3 {}


















