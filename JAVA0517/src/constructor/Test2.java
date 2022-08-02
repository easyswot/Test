package constructor;

class Account2 {
	String accountNo;
	String ownerName;
	int balance;
	
	// 1. 파라미터 없는 기본 생성자 정의
	// => 111-1111-111, 홍길동, 0
	public Account2() {
		accountNo = "111-1111-111";
		ownerName = "홍길동";
		balance = 0;
	}
	
	
	// 2. 계좌번호를 전달받아 초기화하는 생성자 정의 나머지는 다음과 같이 초기화
	// => 홍길동, 0
	
	public Account2(String accountNo) {
		this.accountNo = accountNo;
		ownerName = "홍길동";
		balance = 0;
	}
	
	
	// 3. 계좌번호, 예금주명을 전달받아 초기화하는 생성자 정의, 나머지는 다음과 같이 초기화
	// => 0
	
	public Account2(String accountNo, String ownerName) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		balance = 0;
	}
	
	
	// 4. 계좌번호, 예금주명, 현재잔고를 전달받아 초기화하는 생성자 정의
	
	public Account2(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	
	// showAccountInfo() 메서드 정의
	// => 파라미터 X, 리턴값X , 멤버변수에 접근하여 다음과 같이 출력
	//	  계좌번호 : xxx-xxxx-xxx
	//	  예금주명 : xxx
	//	  현재잔고 : xxxx원
	
	public void showAccountInfo() {
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("예금주명 : " + ownerName);
		System.out.println("현재잔고 : " + balance + "원");
	}

	
}


public class Test2 {

	public static void main(String[] args) {
		
		Account2 a = new Account2();
		a.showAccountInfo();
		
		System.out.println("------------------------------");
		
		Account2 b = new Account2("222-2222-222");
		b.showAccountInfo();
		
		System.out.println("------------------------------");
		
		Account2 c = new Account2("333-3333-333", "abc");
		c.showAccountInfo();
		
		System.out.println("------------------------------");
		
		Account2 d = new Account2("444-4444-444", "def", 10);
		d.showAccountInfo();
		
		Account2[] arr = {a, b, c, d};
		for(int i=0 ; i<arr.length ; i++) {
			arr[i].showAccountInfo();
		}
		
	}

}











