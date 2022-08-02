package enum_;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 * enum에 속성 추가
		 * 
		 * 1. ordinal 은 마치 배열처럼 0부터 시작
		 * 	  그리고, ordinal은 정수 데이터
		 * 	  => 특정 데이터를 지정해 주고 싶다
		 * 예) 지역번호 : (서울 : 02, 경기도 : 031, 인천 : 032, 부산 : 051)
		 * 	   URL : NAVER ("https://www.naver.com"),
		 * 			 DAUM ("https://www.daum.net"),
		 * 			 GOOGLE ("https://www.google.com")
		 * 
		 * 2. 시스템 유지보수 중 enum의 멤버가 추가되거나 변경된다면?
		 * 	  => 기존 ordinal이 깨질 수 있다.
		 * 	  => ordinal로 계산하고 있던 모든 로직을 찾아 수정해야 한다.
		 * 	  예) 평일만 관리하고 있었다. (월, 화, 수, 목, 금 -> 0, 1, 2, 3, 4)
		 * 		  -> 주말도 관리해야 할 것 같다 (일, 월, 화, 수, 목, 금, 토 -> 0, 1, 2, 3, 4, 5, 6)
		 * 
		 * 3. 모두 같은 뜻인데 DB의 테이블마다 다른 데이터로 관리되고 있다.
		 * 예) 학교 데이터 (졸업여부 : Y/N)
		 * 	   공장 생산관리 데이터 (입고완료여부 : 1/0)
		 * 						(출고완료여부 : true/false)
		 * 	  배민(결제완료여부 : T/F)
		 * */
		
		// 1. 지역번호
		Area 부산 = Area.부산;
		System.out.println(부산);
		System.out.println(부산.value);
		
		// 2. 사이트
		Site 구글 = Site.GOOGLE;
		System.out.println(구글);
		System.out.println(구글.url);
		
		// 3. 같은 뜻인데 다른 데이터로 관리되고 있을 경우
		Status status = Status.Y;
		System.out.println(status.n);
		System.out.println(status.b);
		System.out.println(status.s);
		
		if(status.b ) {
			
		}
		
		Status s = Status.N;
		System.out.println(s.n);
		System.out.println(s.b);
		System.out.println(s.s);
		
		EnumTest y = EnumTest.Y;
		System.out.println(y.c.longName);
		System.out.println(y.c.d);
		if(y.c.b) {
			
		}
		System.out.println(y.c.shortName);
		
	}

}

class A {
	
	public static final A 서울 = new A("02");
	public static final A 인천 = new A();
	public static final A 부산 = new A("051");
	String 지역번호;
	
	public A() {}
	
	public A(String 지역번호) {
		this.지역번호 = 지역번호;
	}
	
}

// (↑==↓)

// 1. ordinal 은 마치 배열처럼 0부터 시작한다
enum Area {
	
	서울("02"), 경기도("031"), 인천, 부산("051");
	
	String value;
	
	private Area() {}

	private Area(String value) {
		this.value = value;
	}

}

// 2. enum(Site)	-> NAVER, DAUM, GOOGLE을 URL과 연관
enum Site {
	
	NAVER("https://www.naver.com"),
	DAUM("https://www.daum.net"),
	GOOGLE("https://www.google.com");
	
	String url;
	
//	private Site() {}

	private Site(String url) {
		this.url = url;
	}
	
}


// 3. 모두 같은 뜻인데 DB의 테이블마다 다른 데이터로 관리되고 있다.
// enum(Status) -> Y(1, true, "t")와 N(0, false, "f")
enum Status {
	Y(1, true, "t"),
	N(0, false, "f");
	
	int n;
	boolean b;
	String s;
	
//	private Status() {}
	
	private Status(int n, boolean b, String s) {
		this.n = n;
		this.b = b;
		this.s = s;
	}
	
}

// --------------------------------------------------------------

enum EnumTest {
	Y(EnumType.T, new ClassType(1, true, 1.0, "T", "TRUE")),
	N(EnumType.F, new ClassType(0, false, 0, "F", "FALSE"));
	
	// 멤버변수
	EnumType e;
	ClassType c;
	
	// 그 멤버변수를 초기화 시키는 생성자
	private EnumTest(EnumType e, ClassType c) {
		this.e = e;
		this.c = c;
	}	
}

class ClassType {
	int i;
	boolean b;
	double d;
	String shortName;
	String longName;
	
	public ClassType(int i, boolean b, double d, String shortName, String longName) {
		this.i = i;
		this.b = b;
		this.d = d;
		this.shortName = shortName;
		this.longName = longName;
	}
	
	
}

enum EnumType {
	T, F
}










