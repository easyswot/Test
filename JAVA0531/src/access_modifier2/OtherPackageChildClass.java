package access_modifier2;

import access_modifier.ParentClass;

public class OtherPackageChildClass extends ParentClass {
	// 패키지가 다르고 상속관계에 있는 서브클래스에서 접근 범위
	public void useMember() {
		// 상속관계에서 슈퍼클래스의 멤버에 접근할 때
		// 슈퍼클래스의 인스턴스를 생성하여 접근할 경우 상속 관계로써의 접근이 아니게 된다
		ParentClass p = new ParentClass();
		p.publicVar = 10;		// 누구나 접근 가능
//		p.protectedVar = 20;	// 다른 패키지이고 상속관계가 아니므로 접근 불가
//		p.defaultVar = 30;		// 다른 패키지이므로 접근 불가
//		p.privateVar = 40;		// 다른 클래스에서 접근 불가
		
		publicVar = 10;			// 누구나 접근 가능
		protectedVar = 20;		// 다른 패키지이지만 상속 관계이므로 접근 가능
//		defaultVar = 30;		// 다른 패키지이므로 접근 불가
//		privateVar = 40;		// 다른 클래스에서 접근 불가
		
		
	}
}
