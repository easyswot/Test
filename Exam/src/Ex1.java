import java.lang.invoke.SwitchPoint;

public class Ex1 {

	public static void main(String[] args) {
		/*서술형18문제 실습4문제*/
		
		/*
		 * 자바의 특징
		 * 1. WORA (Write Once, Run Anywhere) 한번만 쓰고 어디서든 동작한다.
		 * 2. JVM (Java Virtual Machine)
		 * 3. G.C (Garbage Collector)
		 * 4. 객체지향 언어
		 * 
		 *    자바의 특징이 아닌것이 문제로 나올 수도
		 * */
		
		/*
		 * 순차(비구조적) > 절차(구조적) > 객체지향
		 * 크게 [ 절차(구조) > 객체지향 ]
		 * 
		 *  절차(구조적) 프로그래밍 언어 : C, Pascal
		 *  객체지향 프로그래밍 언어 : C++, Java, C#
		 *  
		 *     이 중에서 한가지 쓰시오
		 * */
		
		// 변수명 작성 규칙 
		// 1. $, _ 또는 문자로 시작
		// 2. 숫자로 시작 X
		// 3. 띄워쓰기 불가능
		// 4. 대소문자 구분 O
		// (다음중 안되는거)
		
		/*
		 * 키워드(예약어)
		 * - 이미 자바에 등록되어 있어 의미가 약속되어 있는 단어
		 * - 속성의 변수명, 메서드명으로 사용할 수 없음
		 * (abstract, default, goto, package, boolean
		 * do, if, else, private, this, break, double, protected
		 * import, public, case)
		 * Switch 이건 예약어 아님(대문자로 시작되는건 아님)
		 * (다음 중 예약어가 아닌 것)
		 * */
		
		/*
		 * 기본 자료형 변수 선언 및 초기화방법
		 * int a;						선언
		 * int a = 10;					선언과 동시에 초기화
		 * int a, b, c;					변수 여러개를 동시에 선언
		 * int a = 10, b = 20, c = 30;	변수 여러개를 선언과 동시에 초기화
		 * */
		
		// 기본자료형의 크기나 범위
		// => Wrapper 클래스 상수로 확인하면 됨
		// byte : -128 ~ 127
		// short : -32000 ~ 32000
		
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		
		/*
		 * 논리연산자 종류
		 * &&, &, ||, |, ^(XOR)
		 * && : 모두 true일 경우 true, 하나라도 false일 경우 false
		 * || : 모두 false일 경우 false, 하나라도 true일 경우 true
		 * XOR : 좌우 다를 경우 true, 좌우 같으면 false
		 * */
		
		// if문 사용법(양수&음수 판별, 홀수&짝수 판별 등)
		int n = 1;
		if (n == 0){
			System.out.println("0");
		} else if (n % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("양수");
		}
		
		int n2 = 0;
		if (n2 > 0)			System.out.println("양수");
		else if (n2 < 0)	System.out.println("음수");
		else				System.out.println("0");
		
		// for문 <--> while문 (구구단)
		for(int i = 2 ; i < 10 ; i++) {
			System.out.println("< " + i + "단 >");
			for(int j = 1 ; j < 10 ; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
			System.out.println();
		}
		
		int dan = 2;
		System.out.println("< " + dan + "단 > ");
		
		int b = 1;
		while(b < 10) {
			System.out.println(dan + " * " + b + " = " + dan * b);
			b++;
		}
		
		// switch ~ case 문 (기본문법, 특징, break문 유무에 따른 차이점)
		
		/*
		 * 형변환 (원인 및 해결책)
		 * int i = 10 + 1.0;
		 * 결과는 double 인데 int로 선언이 돼서
		 * 
		 * char ch = 'A';
		 * ch = ch + 2;
		 * char-> int
		 * int+int
		 * 결과는 int인데 자동형변환이 안돼서
		 * */
		// 해결책1
		char ch = 'A';
		ch = (char)(ch+2);
		
		// 해결책2 복합대입연산자 사용
		ch += 2;
		
		/*
		 * 배열 선언 및 초기화
		 * int[] arr;
		 * int arr[]	// 오류 안남 하지만 잘 안씀
		 * arr = {1, 2, 3};		// 안됨
		 * {1, 2, 3} 은 선언과 동시에 초기화 즉, 한줄로 표현할때만 가능
		 * */
		
		int arr1[];	// 되긴 하는데 잘 안씀
//		arr = {1, 2, 3};
		int[] arr = {1, 2, 3};
		
		arr1 = new int[2];
		
		int[] a = new int[3];
//		new int[3];				// O됨 가능 -> 0으로 초기화 됨
//		new int[3]{1, 2, 3};	// 초기화 할거면 크기 쓰면 안됨
//		new int[] {1, 2, 3};	// O
//		new int{1, 2, 3};
		
		/*
		 * 자바스크립트
		 * 
		 * 모달창(알림)을 통해 메세지를 출력 alert()
		 * 모달창을 통해 입력 받기 prompt()
		 * 모달창을 통해 예, 아니오를 선택할 수 있는 함수 confirm()
		 * 
		 * console창에서 데이터를 확인하는 함수 console.log()
		 * 웹페이지에서 디버깅 가능하도록 하는 키워드	debugger
		 * 
		 * */
		
		// ------------------------ 클래스 이후 ---------------------------------
		
		// 객체지향 프로그래밍 특징 APIE (캡슐화, 다형성, 상속성, 추상화)
		// 캡슐화(E)
			/*객체 내부 구조를 숨기고(은닉), 메서드를 통해 메세지만으로 데이터를 주고 받는것
			 * 클래스 내의 멤버변수 접근제한자를 private 으로 선언하여 외부접근을 제한하고,
			 * Getter / Setter 메서드를 정의하며 간접적으로 데이터를 주고 받도록 하는 것
			 * => 이 때, Getter / Setter 는 누구나 접근 가능하도록 public 접근제한자 적용
			 * */
		// 다형성(P)
			/*상속 관계에 있는 클래스 중 슈퍼클래스 타입으로 여러 서브클래스 인스턴스를 참조
			 * => 하나의 레퍼런스로 여러 인스턴스를 다루는 것
			 * 서브클래스 -> 슈퍼클래스로 변환 : 업캐스팅 (참조 영역 축소됨)
			 * 슈퍼클래스 -> 서브클래스로 변환 : 다운캐스팅 (참조 영역 확대됨)
			 * 예외) 오버라이딩된 메서드만
			 * 
			 * 다형성을 통해 하나의 참조변수로 여러 인스턴스를 다룰 수 있으므로
			 * 코드의 통일성이 향상됨
			 * */
		// 상속성(I)
			/*슈퍼클래스의 멤버를 서브클래스에서 물려받아 선언없이 사용 가능하게 하는 것
			 * 서브클래스 정의 시 서브클래스명 뒤에 extends 를 명시하고
			 * 슈퍼클래스의 이름을 extends 뒤에 명시함
			 * 상속의 장점: 코드 중복 제거, 코드의 재사용성 향상됨
			 * */
		// 추상화(A)
			/*대상 클래스 (객체)의 공통점을 추출하여 상위 클래스를 정의하는 것
			 * */
		
		// 클래스 (클래스 정의, 레퍼런스(this) 변수 선언, 인스턴스 생성 new , 인스턴스 변수 초기화 p.name="r")
		
		/*
		 * - 상속 (서브클래스 정의, 상속받은 변수 활용한 메서드 정의)
		 * 	 => A클래스를 상속받는 B클래스 정의시
		 * 
		 * 	 class A {
		 * 
		 * 		int num;
		 * 		
		 * 		public void print() {
		 * 			System.out.println("부모의 메서드");
		 * 			num = 10;	// 자신의 변수에 접근 가능
		 * 		}
		 * 	 }
		 * 
		 * 	 class B extends A {
		 * 		int num2;	// 추가적은 변수 선언
		 * 	
		 * 		@Override
		 * 		public void print() {
		 * 			System.out.println("자식의 메서드");
		 * 			num = 99;	// 부모의 변수
		 * 			num2 = 99;	// 자신의 변수
		 * 		}
		 * 	 }
		 * */
		
		// 접근제한자 종류 및 특징
		// 좁음                          넓음
		// private default protected public
		// private	: 자신의 클래스 내부에만 접근 가능(심지어 상속도 안됨)
		// default : 같은 패키지 
		// protected : 같은 패키지 (다른 패키지 이더라도 상속관계면 가능)
		// public : 제한 없음
		
		// 레퍼런스 형변환을 확인하기위한 연산자 instanceof
		
		/*
		 * 난수 발생에 활용되는 클래스 이름(패키지명.클래스명)
		 * => java.util.Random, java.lang.Math(기본적으로 임포트하지 않아도 되는)
		 * 
		 * 
		 * */
		
		/*
		 * final 키워드
		 * 변수(로컬, 멤버) : 마지막 변수다 -> 값을 변경할 수 없다
		 * 메서드			 : 마지막 메서드 -> override 재정의 할 수 없다
		 * 클래스			 : 마지막	-> 더 이상 확장할 수 없다 -> 상속을 통해 새로운 멤버를 추가할 수 없다
		 * 					=> 대표적인 클래스 String
		 * 
		 * */
		
		/*
		 * Error, Exception, try ~ catch ~ Finally
		 * Error : 개발자가 어찌할 수 없는 치명적인 오류
		 * Exception : 개발자가 의도하지 않은 실수로 인해 발생(커버 가능)		정답
		 * 				=> 모든 예외 클래스의 최상위 클래스
		 * */
		
		/*
		 * String 클래스에 메서드들
		 * - boolean contains(String) : 전달받은 문자열 포함 여부를 true / false로 리턴
		 * - equals() : 데이터가 같은지 판단 (대소문자 구별 O)
		 * - equalsIsIgnoreCase() : 데이터가 같은지 판단(대소문자 구별X)			정답
		 * */
		
		String str = "admin";
		System.out.println(str.equalsIgnoreCase("ADMIN"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
