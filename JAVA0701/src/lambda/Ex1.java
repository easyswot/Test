package lambda;

public class Ex1 {

	public static void main(String[] args) {
		/*
		 * 람다의 실행블록에서 변수 참조 (this)
		 * 
		 * 람다식은 컴파일러에 의해 익명의 내부클래스로 처리되기 때문에
		 * 변수에 대한 참조 규칙이 동일하다.
		 * - 외부클래스의 멤버를 자유롭게 사용할 수 있다.
		 * - 자바8 부터는 일반 로컬 변수도 사용할 수 있는데
		 * 	 final 키워드가 적용된 것 처럼 새로운 값을 할당할 수는 없다.
		 * 
		 * 하지만 this를 사용하는 방법이 약간 다르다.
		 * - 람다식에서 this는 타겟인터페이스가 아닌 외부클래스를 나타낸다.
		 * - 따라서, 람다식 내에서 this와 외부클래스.this는 동일한 객체를 나타낸다.
		 * */
		VariableUseTest vut = new VariableUseTest();
		vut.lambdaTest();
		
		
		
	}

}

@FunctionalInterface
interface MyFuncInterface {
	int interfaceMember = 20;
	String method(String msg);
}

class VariableUseTest {
	
	private int memberVar = 10;		
	
	public void useFIMethod(MyFuncInterface mi) {
		System.out.println(mi.method("홍길동"));
	}
	
	public void lambdaTest () {
		int localVar = 30;
		
		// 람다식
		useFIMethod((String msg) -> {
			
//			this.memberVar				// VariableUseTest 클래스의 멤버변수를 가리키므로 접근 가능
//			memberVar					// 접근 가능
			
//			interfaceMember				// 접근 불가
//			this.interfaceMember		// 접근 불가
			
			System.out.println("this : " + this);
			System.out.println("외부클래스.this : " + VariableUseTest.this);
			System.out.println("변수참조 : " + localVar + " : " + memberVar);
//			localVar++;		// 마치 final이 적용된것처럼 로컬변수 수정은 불가
			return "람다식";
		});
		
		// 익명내부클래스 타입
		useFIMethod(new MyFuncInterface() {
			
			@Override
			public String method(String msg) {
//				this.memberVar			// 인터페이스를 가리키므로 접근 불가
//				memberVar				// 접근 가능
				
//				interfaceMember			// 접근 가능
//				this.interfaceMember	// 접근 가능
				
				System.out.println("this : " + this);	// 인터페이스 안에서 열린 느낌으로 this
				System.out.println("외부클래스.this : " + VariableUseTest.this);
				System.out.println("변수참조 : " + localVar + " : " + memberVar);
//				localVar++;		// 마치 final이 적용된것처럼 로컬변수 수정은 불가
				return "익명의 내부클래스";
			}
		});
	}
	
}


























