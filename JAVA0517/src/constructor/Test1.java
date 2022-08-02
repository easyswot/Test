package constructor;

class Account {
	
	String accountNo;
	String ownerName;
	int balance;
	
	
	// 기본 생성자와 동일한 Account() 생성자 정의
	// => 생성자 내에서 멤버변수를 다음과 같이 초기화
	//	  계좌번호(accountNo) : "111-1111-111"
	//	  예금주명(ownerName) : "홍길동"
	//	  현재잔고(balance)	: 10000
	

	public Account() {
		accountNo = "111-1111-111";
		ownerName = "홍길동";
		balance = 10000;
	}
	
	
	
	// 파라미터 3개(계좌번호, 예금주명, 현재잔고)를 전달받아 초기화하는 생성자 정의
//	public Account(String accountNo, String ownerName, int balance) {
//		this.accountNo = accountNo;
//		this.ownerName = ownerName;
//		this.balance = balance;
//	}
	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	
}






public class Test1 {

	public static void main(String[] args) {
		
		Account a = new Account();
		System.out.println("계좌번호 : " + a.accountNo);
		System.out.println("예금주명 : " + a.ownerName);
		System.out.println("현재잔액 : " + a.balance);
		
		System.out.println("------------------------------");
		
		Account a2 = new Account("222-2222-222", "어쩌구", 10);
		System.out.println("계좌번호 : " + a2.accountNo);
		System.out.println("예금주명 : " + a2.ownerName);
		System.out.println("현재잔액 : " + a2.balance);
		

	}

}






























