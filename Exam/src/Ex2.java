
public class Ex2 {
	
	int x;				// 멤버변수, 속성, 필드
	int y;				// 멤버변수, 속성, 필드
	static int z;		// 멤버변수, 속성, 필드		클래스변수

	public static void main(String[] args) {
		/*
		 * 변수 위치에 따른 구별
		 * 
		 * */
		
		int a;
		int b;
		
		// 클래스변수 : z
		// 인스턴스 변수 : x, y
		// 로컬 변수 : a, b, args
	}
	
	public static void method(int c) {
		int a;
		int b;
		// 로컬 변수 : a, b, c
	}

}
