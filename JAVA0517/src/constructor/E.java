package constructor;

class Personal {
	String name;
	int age;
	
	public Personal(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class E {

	public static void main(String[] args) {
		Personal p1 = new Personal("af", 20);
		Personal p2 = new Personal("af", 20);
		
		if(p1==p2) {
			System.out.println("same");
		} else {
			System.out.println("different");
		}
		
		
		String str1 = "aa";
		String str2 = "aa";
		
		if(str1==str2) {
			System.out.println("same");
		} else {
			System.out.println("differ");
		}
		
		
		String str3 = new String("aaa");
		String str4 = new String("aaa");
		
		if(str3==str4) {				// 동등비교연산자를 사용해 비교하면 주소가 다르므로ㅗ 다르다고 나옴
			System.out.println("same");
		} else {
			System.out.println("differ");
		}
		
		
		if(str1 == str3) {
			System.out.println("same");
		} else {
			System.out.println("diff");
		}
		
		
		if(str3.equals(str4)) {			// equals 주소말고 변수가 같은지 아닌지
			System.out.println("same");
		} else {
			System.out.println("dif");
		}

	}

}