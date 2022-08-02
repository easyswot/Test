package polymorphism;

public class Test2 {

	public static void main(String[] args) {
		
//		G g = new P1();
//		C1 c = g;
		
		
	}

}

//			G
//		P1		P2
//	  C1 C2	   C3 C4

class G {}
class P1 extends G {}
class P2 extends G {}
class C1 extends P1 {}
class C2 extends P1 {}
class C3 extends P2 {}
class C4 extends P2 {}
