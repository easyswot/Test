package enum_;

public class Test2 {

	public static void main(String[] args) {
		/*
		 * enum(Week2)을 활용하여
		 * 
		 * 주말까지 며칠 남았는지 출력 (주말이면 "이미 주말" 출력)
		 * 
		 * 예) 오늘은 -요일... 주말까지 -일 남았다
		 * */
		
		Test2 t = new Test2();
		t.compareWeek2(Week2.월);
		

	}
	
	public void compareWeek2(Week2 week) {
//		System.out.println(week.ordinal());
//		System.out.println(week.compareTo(Week2.SUNDAY));
		
		if(week.compareTo(Week2.일) <= 1) {
//			System.out.println("주말인데도...ㅎ");
			System.out.println("이미 주말!");
		} else {
			System.out.println("오늘은 " + week + "요일 ... 주말까지 " + week.compareTo(Week2.일) + "일 남았다.");
		}
		
		
		
	}
	
	
}

enum Week2 {
//	MONDAY, TUESDAY, WEDNESDAY, THUSDAY, FRIDAY, SATURDAY, SUNDAY
//	SUNDAY, SATURDAY, FRIDAY, THURSDAY, WEDESDAY, TUESDAY, MONDAY
	일, 토, 금, 목, 수, 화, 월
	// 0, 1, 2, 3, 4, 5, 6
}