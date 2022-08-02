package constructor;

// Account3 클래스 생성 Test2와 동일한 생성자를 선언
// (단, this를 활용해 모든 멤버변수를 초기화하는 생성자만 초기화를 담당하도록 설계)

class Account3 {
	
	private String accountNo;	// private - print 해야만 계좌번호 확인 가능
	String ownerName;
	int balance;
	
	public Account3() {
		this("111-1111-111", "홍길동", 10000);
	}
	
	public Account3(String accountNo) {
		this(accountNo, "홍길동", 10000);
	}

	public Account3(String accountNo, String ownerName) {
		this(accountNo, ownerName, 10000);
	}
	
// 오버로딩 성립되려면 구분이 되면 된다
	public Account3(String accountNo, int balance) {
		this(accountNo, "홍길동", balance);
	}
	
	public Account3(int balance, String ownerName) {
		this("111-1111-111", ownerName, balance);
	}
	
	public Account3(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	public void printAcc() {
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("예금주명 : " + ownerName);
		System.out.println("현재잔고 : " + balance + "원");
	}
	
}





public class Test4 {

	public static void main(String[] args) {
		
		Account3 a = new Account3();
		a.printAcc();
		
		System.out.println("\n--------------------\n");
		
		Account3 b = new Account3("222-2222-222");
		b.printAcc();
		
		System.out.println("\n--------------------\n");
		
		Account3 c = new Account3("333-3333-333", "abc");
		c.printAcc();
		
		System.out.println("\n--------------------\n");
		
		Account3 d = new Account3("444-4444-444", "cdf", 10);
		d.printAcc();
		
	}

}

