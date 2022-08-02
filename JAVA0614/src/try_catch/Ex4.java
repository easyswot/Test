package try_catch;

public class Ex4 {

	public static void main(String[] args) {
		/*
		 * Exception 객체의 정보 활동
		 * - 예외 발생 시 해당 예외를 처리할 수 있는 예외 객체를 생성하여 전달되어짐
		 * 	 => 이때, catch 블록에서 해당 예외 객체를 전달 받을 수 있다.
		 * - 전달받은 객체의 겨러 베서드를 통새 객체 정보를 활둉 가능
		 * 
		 * 1. void printStackTrace()
		 * 	  => 예외 발생 시 코드를(메서드)의 호출 순서 및 예외 발생 상황을 출력 해준다.
		 * 	  ex) java.lang.ArithmeticException: / by zero
		 * 		  at try_catch.Ex4.main(Ex4.java:25)
		 * 		  1) java.lang.ArithmeticException: : 예외 발생 시 던져지는 예외 객체(클래스)
		 * 		  2) / by zero : 예외 발생 뭔인 메시지
		 * 		  3) at try_catch.Ex4.main(Ex4.java:25) : 예외 발생 위치(클래스 및 메서드, 코드 라인 정보)
		 * 			 => 예외 발생 위치는 메서드 호출 과정에 따라 복수개 출력 될 수 있음
		 * 
		 * 2. String getMessage()
		 * 	  => 예외 발생 시 전달되는 원인메시지를 문자열로 리턴해준다.
		 * 	  ex) AtrithmeticException 발생 시 원인 메세지인 "/ by zero" 문자열을 리턴해준다
		 * 
		 * 3. String getLocalizedMessage()
		 * 	  => 기본적으로 getMessage() 메서드와 기능은 동일하나
		 * 		 주로, 예외 원인 메세지를 수정하기 위해 오버라이딩해서 메세지 수정하여
		 * 		 수정된 메세지를 출력하기 위해 사용하는 메서드
		 * 		 (오버라이딩 하지 않을 경우 getMessage() 메서드와 동일함)
		 * */
		System.out.println("프로그램 시작");
		try {
			System.out.println("try 블록 시작");
			
			int num1 = 3;
			int num2 = 0;
			
			System.out.println(num1/num2);	// 예외(ArithmeticException)가 발생하는 코드
			
			System.out.println("try 블록 끝");
		} catch (Exception e) {
//			e.printStackTrace();
//			System.out.println("원인 : " + e.getMessage());
			System.out.println(e.getLocalizedMessage());
		}
		
		System.out.println("프로그램 종료");
		

	}

}
