package method;

public class Ex1 {

	public static void main(String[] args) {
		/*
		 * 메소드(Method)
		 * - 객체의 동작을 나타내는 최소 단위
		 * - 메서드를 정의한 후에는 반드시 호출되어야만 사용가능
		 * - 이때, 호출하는 메서드를 Caller, 호출 당하는 메서드를 Worker라고 함
		 * - main() 메서드도 메서드의 일종
		 * => JVM에 의해 자동으로 호출되는 메서드 = 프로그램의 시작점
		 * - 메서드를 호출할 때 전달하는 값을 전달인자(Argument)라고 하며
		 * 	 이 값을 메서드에서 전달받기 위해 선언하는 변수를 매개변수(Parameter) 라고 함
		 *   => 이때, 메서드 호출 시 전달하는 값이 없을 수도 있다
		 *   => 메서드를 호출할 때 반드시 선언부의 매개변수 타입과 개수에 맞게
		 *      데이터를 전달하여 호출해야 한다.
		 * - 메서드 수행이 끝날 때 호출한 곳으로 전달할(되돌려줄) 값을 리턴값이라고 하며
		 *   리턴값에 해당하는 데이터타입을 리턴타입 부분에 명시해야함
		 *   => 메서드 수행 후 리턴값이 없을 수도 있다
		 *      만약, 리턴값이 없을 경우 리턴 타입에 반드시 void 라는 타입을 명시해야 함
		 *   => 한번에 리턴 가능한 데이터는 한개
		 * - 메서드 수행이 종료되면, 반드시 메서드를 호출한 곳으로 돌아와야 함
		 *   이때, 리턴값이 존재한다면 호출한 곳으로 돌아올 때 가지고 옴
		 *   
		 * < 메서드 정의 방범(형태)에 따른 분류 >
		 *  1. 매개변수 x, 리턴값 x 메서드
		 *  2. 매개변수 x, 리턴값 o 메서드
		 *  3. 매개변수 o, 리턴값 x 메서드
		 *  4. 매개변수 o, 리턴값 o 메서드
		 * */
		
		// 1. 매개변수 x, 리턴값 x 메서드
		// => 매개변수가 없으므로 메서드 호출 시 소괄호() 안에 아무 데이터도 전달하지 않음
		// => 리턴값이 없으므로 메서드 호출결과를 저장할 변수를 선언하거나
		//    출력문 등의 내부에서 메서드 호출 불가능 하며, 단독으로 호출해야 함
		
		System.out.println("야 불좀 꺼");
		bro_1();
		System.out.println("turn off");
		
		
		System.out.println("\n========================================\n");
		
		// 2. 매개변수 x, 리턴값 o 메서드
		System.out.println("야 물좀");
		String result = bro_2();
//		String result = "water"; 과 동일한 코드로 사용됨
		System.out.println("동생이 갖다준것 : " + result);
		
		
		System.out.println("\n========================================\n");
		
		// 3. 매개변수 o, 리턴값 x 메서드
		System.out.println("야 1000원으로 맛있는거 사먹으셈");
		bro_3(1000);
		
		System.out.println("\n========================================\n");
		
		// 4. 매개변수 o, 리턴값 o 메서드
		System.out.println("야 2000원 으로 과자 사오셈");
		String snack = bro_4(2000);
		System.out.println("사온 것 : " + snack);
	}
	
	// 4. 매개변수 o, 리턴값 o 메서드
	public static String bro_4(int money) {
		System.out.println("bro : 과자 사오라고 " + money + "원 줌");
		money -= 200;
		System.out.println("bro : 과자 사고 " + money + "원 남음");
		return "과자";
	}
	
	
	
	
	
	// 3. 매개변수 o, 리턴값 x 메서드
	public static void bro_3(int money) {
		System.out.println("bro : 맛있는거 사먹으라고 " + money + "원 줌");
		money -= 200;
		System.out.println("bro : 과자 사먹고 " + money + "원 남음");
	}
	
	
	// 2. 매개변수 x, 리턴값 o 메서드
	public static String bro_2() {
		System.out.println("bro : 물 떠오라고 함");
		
		String result = "water";
		return result;
	}
	
	
	// 1. 매개변수 x, 리턴값 x 메서드
	// => 리턴값이 없으므로 리턴타입에 void타입 명시(생략불가)
	// => 매개변수가 없으므로 메서드 선언부 소괄호()안에 아무것도 기술하지 않음
	public static void bro_1() {
			System.out.println("bro : 불 끄래서 불끔");
			
		}
		
		
		
		

	}


