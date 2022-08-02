package typecasting;

public class Ex1 {

	public static void main(String[] args) {
		/*
		 * 형변환 (Type Casting)
		 * 
		 * 1. 자동형변환 (=묵시적형변환, 암시적형변환)
		 * 	- 작은데이터 타입 -> 큰 데이터 타입
		 * 	  형변환 할 시에는 자연스럽게 변환이 가능하므로
		 * 	  자동형변환이 발생
		 * 		ex) byte b = 127;
		 * 			int i = b;
		 * 			System.out.println(i);
		 * */
//			int a = 3;
//			float b = 1.0F;
//			double c = a + b;
			//1. a + b 연산을 하기 위해서 int형인 a -> float로 자동형변환
			//2. a 연산 결과는 float, double형인 c에 저장할 때 자동형변환이 발생
			//총 2번 자동형변환이 일어남
//			System.out.println(c);
			
//			float a = (float)100.0;
//			int b = (int)100.0F;
//		short s = 130;
//		byte b = (byte)s;
//		System.out.println(b);
		
		//	byte, short, char 끼리 형변환
		//	byte, short는 음수까지 표현할 수 있기 때문에
		//	char형으로 형변환 시 데이터 오버플로우가 발생할 수 이싿
		//	그러므로, 자동형변환X, 강제형변환O
		byte b = 127;
		char c = (char)b;
		System.out.println(c);
		
		short s = 10000;
		c = (char)s;
		System.out.println(c);
		
		
		
		
		
	}

}
