package polymorphism;

public class Test1 {

	public static void main(String[] args) {
		// 업캐스팅과 다운캐스팅 연습
		
		// 1. 업캐스팅
		핸드폰 h = new 핸드폰();
		h.문자();
		h.전화();
		
		전화기 c;
		c = h;
		
		c.전화();
//		c.문자();	// err
		
		System.out.println("------------------------------");
		
		스마트폰 s = new 스마트폰();
		s.카톡();
		s.전화();
		s.문자();
		
		h = s;
		
		h.전화();
		h.문자();
//		h.카톡();	// err
		
		System.out.println("------------------------------");
		
		c = s;
		c.전화();
//		c.문자();	// err
//		c.카톡();	// err
		
		System.out.println("------------------------------");
		
		
		
		
		// 2. 다운캐스팅
		전화기 c1 = new 핸드폰();
		c1.전화();
		
		핸드폰 h1 = (핸드폰)c1;
		
		h1.전화();
		h1.문자();
		
		System.out.println("------------------------------");
		
		전화기 c2 = new 스마트폰();
		c2.전화();
		
		스마트폰 s2 = (스마트폰)c2;
		s2.카톡();
		s2.전화();
		s2.문자();
		
		System.out.println("------------------------------");
		
		핸드폰 h2 = new 스마트폰();
		h2.전화();
		h2.문자();
		
		스마트폰 s1 = (스마트폰)h2;
		s1.카톡();
		s1.전화();
		s1.문자();
		
		System.out.println("------------------------------");
		
		
		
		
		
	}

}


class 전화기 {
	public void 전화() {
		System.out.println("전화 걸기");
	}
}

class 핸드폰 extends 전화기 {
	public void 문자() {
		System.out.println("문자 전송");
	}
}

class 스마트폰 extends 핸드폰 {
	public void 카톡() {
		System.out.println("카톡 메시지 전송");
	}
}
