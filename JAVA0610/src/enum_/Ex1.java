package enum_;

import java.time.LocalDate;
import java.time.Month;

public class Ex1 {
	public static void main(String[] args) {
		/*
		 * 상수를 사용하여 한정된 데이터를 관리하는 경우
		 * 간편한 선언을 통해 관리할 수 있는 장점이 있으나
		 * 해당 값의 범위를 벗어나는 값을 사용할 경우 컴파일 시점에서 오류 발견이 불가능하므로
		 * 추가적인 작업을 통해 범위 내의 값인지 판별하는 작업이 별도로 필요함
		 * => 이를 해결하기 위해 열거형(enum type) 필요
		 * 
		 * < 열거타입 정의 방법 >
		 * [접근제한자] enum 열거타입명 {
		 * 		// 열거타입에서 사용할 값(상수)을 차례대로 나열
		 * }
		 * 
		 * - 기본적으로 클래스, 인터페이스 정의 문법과 유사함
		 * - 단, 열거타입 중괄호 내에는 상수로 사용될 이름만 지정
		 * 
		 * */
		
		BadWeek badWeek = new BadWeek();
		
		// Setter 호출하여 파라미터로 요일 전달 시 정확한 정수값을 몰라도
		// 상수 호출만으로 해당 정수 사용 및 전달이 가능
		badWeek.setMyWeek(BadWeek.WEEK_FRIDAY);
		
		if(badWeek.getMyWeek() == BadWeek.WEEK_FRIDAY) {
			System.out.println("오늘은 금요일 입니다.");
		}
		
		// 요일 정보를 상수로 관리하는 경우의 문제점
		// => 상수 데이터들이 정수일 경우 해당 정수를 전달받은 메서드(Setter) 호출 시
		//	  상수 범위값이 아닌 다른 값을 전달해도 컴파일에러(문법적 오류)가 발생하지 않는다
		badWeek.setMyWeek(100);	// 100 이라는 정수값을 갖는 요일은 없으나
		// int 타입 파라미터 이므로 컴파일 시점에서는 아무런 문제가 발생하지 않는다
		// 그러나, 해당 데이터를 사용하기 위한 시점에는 문제가 발생할 수 있다.
		// => 따라서, 별도로 해당 범위 내의 데이터인지 판별하여 추가적인 작업을 수행해야 함
		
		System.out.println("========================================================");
		
		// 열거타입 사용
//		EnumWeek myWeek = new EnumWeek();	// 열거타입 인스턴스 생성 불가
		EnumWeek myWeek = EnumWeek.FRIDAY;	// 금요일로 설정
		System.out.println("오늘은 " + myWeek + " 입니다.");
		if(myWeek == EnumWeek.FRIDAY) {	// 상수 비교 방법이 동일함
			System.out.println("오늘은 금요일 입니다.");
		}
		
		System.out.println("----------------------------------");
		GoodWeek gw = new GoodWeek();
		gw.setMyWeek(EnumWeek.FRIDAY);
		System.out.println("오늘의 요일 : " + gw.getMyWeek());
		gw.printWeek();
		
		// 열거타입 사용 시 장점
		// => 정의 시 지정된 상수 외의 다른 값은 절대 전달 불가능
//		gw.setMyWeek(5);
//		gw.setMyWeek("MONDARY");
		// => 반드시 열거타입명.상수명으로 지정된 값만 전달해야 한다
		gw.setMyWeek(EnumWeek.SATURDAY);
		
		System.out.println("===========================================================");
		
		// LocalDate 클래스의 getMonth() 메서드를 호출하면 열거타입 Month 객체 리턴됨
		LocalDate today = LocalDate.now(); // 싱글톤 : new로 생성할 수 없게 막아두고 메서드로 객체 리턴어쩌구 
		System.out.println(today);
//		LocalDate today2 = LocalDate.now();
//		
//		if(today == today2) {
//			System.out.println("같음");
//		} else {
//			System.out.println("다름");
//		}
		
		int monthValue = today.getMonthValue();
		System.out.println("오늘은 " + monthValue + "월 입니다.");
		
		Month month = today.getMonth();
		System.out.println("오늘은 " + month + "월 입니다.");
		
		switch (month) {
		case JANUARY	: System.out.println("오늘은 1월 입니다.");		break;
		case JUNE		: System.out.println("오늘은 6월 입니다.");		break;
		case DECEMBER	: System.out.println("오늘은 12월 입니다.");	break;

		default:
			break;
		}
		
		
	}

}

// 열거타입 정의
enum EnumWeek {
	// 열거형 정의 시 중괄호 내에는 값을 갖는 상수 이름만 나열함(별도의 값을 지정하지 않는다.)
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

// 열거타입을 사용하는 클래스
class GoodWeek {

	EnumWeek myWeek;	// 클래스 내에서 열거타입 변수 선언 가능(로컬변수로도 가능)
	
	public EnumWeek getMyWeek() {
		return myWeek;
	}

	public void setMyWeek(EnumWeek myWeek) {
		this.myWeek = myWeek;
	}
	
	public void printWeek() {
		// 저장된 요일(myWeek)을 판별하여 월요일~일요일 까지 출력 => switch~case 사용
		// - 주의사항 switch문에 enum 타입 변수를 전달할 경우
		//	 case 문에서 비교값으로 enum 타입 값을 지정할 때 열거타입명 없이 상수 바로 적용
		switch (myWeek) {
		case MONDAY		: System.out.println("오늘은 월요일 입니다.");	break;
		case TUESDAY	: System.out.println("오늘은 화요일 입니다.");	break;
		case WEDNESDAY	: System.out.println("오늘은 수요일 입니다.");	break;
		case THURSDAY	: System.out.println("오늘은 목요일 입니다.");	break;
		case FRIDAY		: System.out.println("오늘은 금요일 입니다.");	break;
		case SATURDAY	: System.out.println("오늘은 토요일 입니다.");	break;
		case SUNDAY		: System.out.println("오늘은 일요일 입니다.");	break;

		default:
			break;
		}
		
	}
	
}

// --------------------------------------------------------------------------------------------------
// 열거타입을 사용하지 않고, 상수만 사용하는 경우
class BadWeek {

	// 요일 정보를 상수로 관리하는 경우의 장점
	// => 외부에서 실제 데이터를 정확하게 알지 못해도 상수명(변수명)만으로 값을 사용 가능하며
	//	  클래스명만으로 접근 가능하여 접근이 쉬움. 또한, 값 변경이 불가능하여 안전함
	public static final int WEEK_MONDAY		= 0;
	public static final int WEEK_TUESDAY	= 1;
	public static final int WEEK_WEDNESDAY	= 2;
	public static final int WEEK_THURSDAY	= 3;
	public static final int WEEK_FRIDAY		= 4;
	public static final int WEEK_SATURDAY	= 5;
	public static final int WEEK_SUNDAY		= 6;
	
	private int myWeek;
	
	public int getMyWeek() {
		return myWeek;
	}

	public void setMyWeek(int myWeek) {
//		this.myWeek = myWeek;
		
		// 요일에 대한 정상 범위 판별 없이 저장 작업을 수행할 경우
		// 실제 저장된 요일을 꺼내서 사용하는 시점에는 문제가 발생할 수 있다
		// 따라서, 조건문 등을 사용하여 전달받은 파라미터에 대한 검증이 추가적으로 필요
		if(myWeek >= WEEK_MONDAY && myWeek <= WEEK_SUNDAY) {
			this.myWeek = myWeek;
		} else {
			System.out.println("요일 입력 에러");
		}
	}
	
	
}

