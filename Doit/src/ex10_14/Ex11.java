package ex10_14;

public class Ex11 {

	public static void main(String[] args) {
		/*
		 * 1. 두 개의 인스턴스가 메모리는 다르더라도 논리적으로 동일하다는 것을 구현하는 object의 메서드
		 * 
		 * = equals
		 * 
		 * 2. String 클래스는 멤버로 가지는 문자열 변수가 final 이어서 변하지 않음
		 * 다음과 같이 두 개의 String 변수를 연결할 때 힙 메모리에 생성되는
		 * String 인스턴스를 그려보세요
		 * 
		 * a -> "abc", d -> "def"
		 * a -> "abcdef" (원래 메모리 끊어지고 새로운 메모리에 연결)
		 * 
		 * */
		
		String a = "abc";
		String d = "def";
		a += d;
		System.out.println(a);
		
		/*
		 * 3. 기본 자료형을 멤버변수로 포함하여 메서드를 제공함으로써 기본 자료형의 객체를 제공하는 클래스
		 * = wrapper 클래스
		 */
		
		/*
		 * 4. 다음 코드의 출력 결과가 '진돗개 멍멍이' 가 되도록 MyDog 클래스를 수정
		 * 
		 * 
		 * 
		 * 
		 * */
		MyDog dog = new MyDog("멍멍이", "진돗개");
		System.out.println(dog);
		

	}

}

class MyDog {

	String a;
	String b;

	public MyDog(String a, String b) {
		this.a = a;
		this.b = b;
	}
	
	@Override
	public String toString() {
		return b + " " + a;
	}
	
	
}


