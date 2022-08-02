package access_modifier;

public class ParentClass {
	public int publicVar;		// 모든 클래스에서 접근 가능(제한없음)
	protected int protectedVar;	// 같은 패키지 또는 다른 패키지이더라도
								// 상속관계에 있는 서브클래스만 접근 가능
	int defaultVar;				// 같은 패키지에서만 접근 가능(다른 패키지에서 접근 불가)
	private int privateVar;		// 자신의 클래스 내에서만 접근 가능(다른 클래스에서 접근 불가)

	public void useMember() {
		this.publicVar = 10;
		this.protectedVar = 20;
		this.defaultVar = 30;
		this.privateVar = 40;
	}
}

