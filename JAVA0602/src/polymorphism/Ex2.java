package polymorphism;

import org.omg.CosNaming.IstringHelper;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 클래스들의 관계 (Has-a, Is-a)
		 * 
		 * 1. Has - a (포함관계)
		 * - 어떤 객체가 다른 객체에 포함되는 관계
		 * - 대부분의 클래스들의 관계는 Has-a 관계가 적용됨
		 * - 자동차 has a 타이어, 스마트폰 has a 스피커, 영웅 has a 무기
		 * 	1) 집합 관계
		 * 		- 객체가 다른 객체에 포함될 때 해당 객체가 없어도 동작에 문제가 없는 관계
		 * 		ex) 자동차 has a 라디오 => 자동차는 라디오가 없어도 자동차
		 * 			컴퓨터 has a 스피커 => 컴퓨터는 스피커가 없어도 컴퓨터
		 * 
		 *  2) 구성 관계
		 *  	- 객체가 다른 객체에 포함될때 해당 객체 없이는 동작이 불가능한 관계
		 *  	=> 객체 상호간의 라이프 사이클이 동일한 관계
		 *  	ex) 자동차 has a 엔진
		 *  		컴퓨터 has a CPU
		 *  
		 * 
		 * 
		 * 2. Is - a (상속 관계) 
		 * - 비슷한 속성 및 동작을 갖는 객체 사이의 관계
		 * 		ex) 초등학생, 중학생, 고등학생 객체들의 공통점은 학생
		 * 		=> 이때, 학생은 초등학생, 중학생, 고등학생의 상위 개념이므로 모두를 포함
		 * 		=> 초등학생 is a 학생 => 학생의 모든 구성요소는 초등학생이 갖고 있음
		 * 		   스마트폰 is a 핸드폰 => 핸드폰과 모든 구성요소는 스마트폰이 갖고 있음
		 * - Is-a 관계가 성립하는 경우 좌변의 객체는 우변의 객체를 상속받아 정의한 객체 성립
		 * - Is-a 관계를 판별하는데 사용하는 연산자 : instanceof 연산자
		 * 
		 * 3. instanceof 연산자
		 * - 좌변의 객체(참조변수)가 우변(클래스) 타입인지 판별하는 연산자
		 * 
		 * 
		 * 
		 * 
		 * */
		
		SmartPhone sp = new SmartPhone("010-1234-5678", "안드로이드");
		sp.call();
		sp.sms();
		sp.KakaoTalk();
		
		System.out.println("----------------------------------------------");
		
		// instanceof 연산자 활용
		// sp는 SmartPhone 입니까?
		if(sp instanceof SmartPhone) {
			System.out.println("sp는 SmartPhone 이다");
		} else {
			System.out.println("sp는 SmartPhone이 아니다");
		}
		
		System.out.println("----------------------------------------------");
		
		if(sp instanceof HandPhone) {
			System.out.println("sp는 HandPhone 이다");
		} else {
			System.out.println("sp는 HandPhone이 아니다");
		}
		
		System.out.println("----------------------------------------------");
		
		HandPhone hp = new HandPhone("010-1111-2222");
		
		if(hp instanceof SmartPhone) {
			System.out.println("hp는 SmartPhone 이다");
		} else {
			System.out.println("hp는 SmartPhone이 아니다");
		}
		
		System.out.println("----------------------------------------------");
		
		HandPhone hp2 = new SmartPhone("010-5432-8554", "안드로이드");
		hp2.call();
		hp2.sms();
//		hp2.kakaoTalk();
		
		System.out.println("----------------------------------------------");
		
		// hp2는 SmartPhone입니까
		if(hp2 instanceof SmartPhone) {
			System.out.println("hp2는 SmartPhone 이다");
			System.out.println("그러므로 hp2는 SmartPhone으로 형변환이 가능하다");
			
			SmartPhone sp2 = (SmartPhone)hp2;
			sp2.call();
			sp2.sms();
			sp2.KakaoTalk();
			
		} else {
			System.out.println("hp2는 SmartPhone이 아니다");
		}
		
		System.out.println("----------------------------------------------");
		
		if(hp2 instanceof HandPhone) {
			System.out.println("hp2는 HandPhone 이다");
			
		} else {
			System.out.println("hp2는 HandPhone이 아니다");
		}
		
	}

}

class HandPhone {
	String number;
	
	public HandPhone(String number) {
		this.number = number;
	}
	
	public void call() {
		System.out.println("전화 가능");
	}
	
	public void sms() {
		System.out.println("문자 기능");
	}
	
}

class SmartPhone extends HandPhone {
	String osName;
	
	public SmartPhone(String number, String osName) {
		// 슈퍼클래스(HandPhone) 생성자 중 기본 생성자가 없으므로
		// 반드시 파라미터 생성자를 명시적으로 호출해야한다.
		super(number);		// 슈퍼클래스의 파라미터 생성자를 호출하는 생성자 super()
		this.osName = osName;
	}

	public void KakaoTalk() {
		System.out.println("카톡 기능");
	}
}


