package ex05_09;

public class Ex5 {

	public static void main(String[] args) {
		
		// 168p
		// Q1	생성자
		// 클래스를 생성할 때 호출하는 ---는 멤버 변수를 초기화하는데 사용
		
		// Q2	인스턴스, 인스턴스변수
		// 클래스를 생성하여 메모리에 있는 상태를 ---라 하고 멤버변수를 다른말로 ---라고 함 
		
		// Q3	메서드
		// ---는 일반 함수에 객체 지향의 개념을 추기하여, 클래스 내부에 선언하고
		// 클래스 멤버변수를 사용하여 클래스 기능을 구현
		
		// Q4
		/*
		 * <MyDate 클래스 완성하기>
		 * - day, month, year 변수는 private으로 선언
		 * - 각 변수의 get, set 메서드를 public으로
		 * - 모든 멤버변수를 초기화하는 MyDate 생성자를 만듦
		 * - isValid() 메서드를 만들어 날짜가 유효한지 확인
		 * 	 => 복잡한 윤년까지 계산하지 말고, 2월은 28월까지
		 * 	 1, 3, 5, 7, 8, 10, 12월 31일
		 * 	 4, 6, 9, 11월 30일
		 * - main 메서드에서 생성한 MyDate 날짜가 유효한지 확인
		 * {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31} 
		 * 
		 * if day<1 || day>28
		 * */
		
		MyDate date1 = new MyDate(30, 2, 2000);
		System.out.println(date1.isValid());	// false
		
		MyDate date2 = new MyDate(2, 10, 2000);
		System.out.println(date2.isValid());	// true		
		
	}

}

class MyDate {
	private int day;
	private int month;
	private int year;
	
	
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public boolean isValid() {
		
		boolean result = false;
		
		if(month==2) {
			if(day > 0 && day < 29) {
				result = true;
			}
		}
		
		int[] arr31 = {1, 3 ,5, 7, 8, 10, 12};
		for(int i = 0 ; i < arr31.length ; i++) {
			if(month == arr31[i]) {
				if (day > 0 && day < 32) {
					result = true;
				}
			}
		}
		
		int[] arr30 = {4, 6, 9, 11};
		for(int i = 0 ; i < arr30.length ; i++) {
			if(month == arr30[i]) {
				if(day > 0 && day < 31) {
					result = true;
				}
			}
		}
		return result;
	}
	
	
	
	
}



