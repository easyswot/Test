package access_modifier;

public class SamePackageSomeClass {
	public void useMember() {
		ParentClass p = new ParentClass();
		p.publicVar = 10;		// 누구나 접근 가능
		p.protectedVar = 20;	// 같은 패키지이므로 접근 가능
		p.defaultVar = 30;		// 같은 패키지이므로 접근 가능
//		p.privateVar = 40;		// x 다른 클래스에서 접근 불가
	}
}
