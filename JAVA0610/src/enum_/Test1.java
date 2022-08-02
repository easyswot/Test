package enum_;

public class Test1 {

	public static void main(String[] args) {
		/*
		 * enum(Week) 과 switch-case 문을 활용하여
		 * 
		 * 평일이면(월-목) "하..."
		 * 금요일이면		"불금"
		 * 주말이면		"주말"
		 * */
		
		Week week = Week.SATURDAY;
		
//		switch (week) {
//		case MONDAY		: System.out.println("ha...");	break;
//		case TUESDAY	: System.out.println("ha...");	break;
//		case WEDNESDAY	: System.out.println("ha...");	break;
//		case THURSDAY	: System.out.println("ha...");	break;
//		case FRIDAY		: System.out.println("불금!");	break;
//		case SATURDAY	: System.out.println("주말!");	break;
//		case SUNDAY		: System.out.println("주말!");	break;
//
//		default:
//			break;
//		}
		
		switch (week) {
		case MONDAY		:
		case TUESDAY	:
		case WEDNESDAY	:
		case THURSDAY	: System.out.println("ha...");	break;
		case FRIDAY		: System.out.println("불금!");	break;
		case SATURDAY	:
		case SUNDAY		: System.out.println("주말!");	break;

		default:
			break;
		}

	}

}

enum Week {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
