
public class Ex3 {
	
	static int width;		// 클래스
	static int height;		// 클래스
	
	int num;			// 인스턴스
	
	Ex3(int n) {	// n -> 로컬변수
		num = n;
	}

	public static void main(String[] args) {
		Ex3 ex = new Ex3(1);
	}

}
