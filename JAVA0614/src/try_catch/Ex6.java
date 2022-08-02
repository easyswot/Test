package try_catch;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Ex6 {

	public static void main(String[] args) {
		/*
		 * 예외 처리에 대한 위임 (= 예외던지기 = throws)
		 * - 예외 발생 시 예외가 발생한 메서드(자신)에서 직접 처리 (try ~ catch) 하지 않고
		 * 	 자신의 메서드를 호출한 곳으로 예외 처리를 위임할 수 있음
		 * - 메서드 선언부 마지막에 throws 키워드를 사용하여 발생 가능성이 있는
		 * 	 예외 클래스 이름을 명시하여 해당 예외가 발생했을 때 예외를 던짐(throws)
		 * - 주로, 메서드 내의 특정 코드에서 예외가 발생할 것으로 예상되는 경우
		 * 	 외부에서 해당 메서드를 호출하는 시점에서 미리 알 수 있도록
		 * 	 내부 예외를 외부로 던진 후 외부에서 해당 예외를 감지하고 처리하도록 할 때 사용
		 * - throws 키워드를 통해 예외를 위임하는 경우 발생한 위치에서는
		 * 	 예외 처리를 수행하지 않아도 컴파일 에러가 발생하지 않으며
		 * 	 예외 처리를 위임 받은 곳에서 반드시 예외를 처리하는 코드 (try - catch)를 기술 해야 함
		 * 	 => 만약, 위임받은 예외를 직접 처리하지 않으면 자신의 메서드에서도
		 * 		throws 키워드를 통해 호출한 곳으로 위임할 수 있음
		 * - throws 키워드 뒤에 기술되는 예외 클래스는 catch 블록과 마찬가지로
		 * 	 각각의 예외 클래스를 따로 기술하거나 상위 타입 예외클래스 하나만으로 대체 가능
		 * 
		 * ex1) throws ArithmeticException, NullPointerException 기술 시
		 * 		두 개의 예외만 외부로 던지고, 나머지 예외는 직접 처리해야 한다.
		 * ex2) throws RuntimeException 기술 시
		 * 		RuntimeException 계열 예외는 외부로 던지고, 나머지 예외는 직접 처리
		 * ex3) throws Exception 기술 시 모든 예외를 외부로 던짐
		 * 
		 * < 기본 문법 >
		 * [제한자] 리턴타입 메서드명([매개변수]) throws 예외클래스1, 예외클래스2 ... {}
		 * 
		 * */
		try {
			팀장();
		} catch (Exception e) {
			System.out.println("main() 메서드에서 최종적으로 모든 예외 처리");
		}
		
		
		
	}	// main() 메서드 끝
	
	public static void 팀장() throws Exception {
		// 1) 팀장 메서드에서 직접 위임된 예외를 처리
//		try {
//			대리1();	// ArithmeticException, NullPointerException
//			대리2();	// ClassNotFoundException, SQLException
//		} catch (RuntimeException e) {
//			System.out.println("팀장이 ArithmeticException, NullPointerException 예외를 모드 처리");
//		} catch(Exception e) {
//			System.out.println("팀장이 나머지 모든 예외를 직접 처리");
//		}
		// 2) 팀장() 메서드를 호출한 곳으로 예외 위임
		대리1();
		대리2();
	}
	
	public static void 대리1() throws ArithmeticException, NullPointerException {
		// 사원1에서 예외가 발생했을 때 위임(throws)된 경우
		// 1) 대리1() 메서드에서 직접 위임된 예외를 처리
//		try {
//			사원1();
//			사원2();
//		} catch (ArithmeticException e) {
//			System.out.println("사원1로부터 위임받은 ArithmeticException 예외를 대리1 직접 처리");
//		} catch (NullPointerException e) {
//			System.out.println("사원2로부터 위임받은 NullPointerException 예외를 대리1 직접 처리");
//		}
		
		사원1();
		사원2();
		
	}
	
	public static void 대리2() throws Exception {
		// RuntimeException을 제외한 나머지 예외를 위임받을 경우
		// 예외 발생 코드와 마찬가지로 명시적인 컴파일에러가 발생하게 된다
		사원3();	// ClassNotFoundException 예외 위임되는 위치
		사원4();	// SQLException 예외가 위임되는 위치
		// => 하나의 예외로 묶어서 던지려면 공통 클래스인 Exception 클래스 사용해야 함
	}
	
	public static void 사원1() throws ArithmeticException {
		// 사원1에서 예외가 발생했을 때
		// 1) 직접 예외를 처리하는 경우 : try ~ catch 문 직접 사용
//		try {
//			System.out.println(3/0);	// ArithmeticException 발생
//		} catch (ArithmeticException e) {
//			System.out.println("사원 1에서 예외를 직접 처리");
//		}
		System.out.println(3/0);
		
	}
	
	public static void 사원2() throws NullPointerException {
//		try {
//			String str = null;
//			System.out.println(str.length());
//		} catch (NullPointerException e) {
//			System.out.println("사원 2 에서 예외를 직접 처리");
//		}
		String str = null;
		System.out.println(str.length());
		
	}
	
	public static void 사원3() throws ClassNotFoundException {
		// 명시적으로 예외를 처리하거나 위임을 해야한다.
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		Class.forName("com.mysql.jdbc.Driver");
	}
	
	public static void 사원4() throws SQLException {
		DriverManager.getConnection("");
	}
	
	
}
