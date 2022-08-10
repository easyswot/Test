
public class Ex5 {

	public static void main(String[] args) {
		/*
		 * Account 클래스 정의
		 * 
		 * 멤버변수 : 계좌번호, 예금주명, 현재잔고 선언
		 * 생성자 : 모든 멤버변수를 초기화하는 생성자
		 * 메서드 : 입금(deposit)
		 * 		  출금(withdraw)
		 * */
		Account a = new Account("111-1111-111", "가나다", 10000);
		System.out.println();
		a.deposit(1000);
		System.out.println();
		a.withdraw(10000);
		
		
	}

}
//class Account {
//	String accountNo;
//	String ownerName;
//	int balance;
//	
//	public Account(String accountNo, String ownerName, int balance) {
//		this.accountNo = accountNo;
//		this.ownerName = ownerName;
//		this.balance = balance;
//	}
//	
//	public void showAccountInfo() {
//		System.out.println("계좌번호 : " + accountNo);
//		System.out.println("예금주명 : " + ownerName);
//		System.out.println("현재잔고 : " + balance + "원");
//	}
//	
//	public void deposit(int amount) {
//		balance += amount;
//		System.out.println("입금한 금액 : " + amount + "원");
//		System.out.println("입금 후 현재잔고 : " + balance + "원");
//	}
//	
//	public void withdraw(int amount) {
//		if(amount > balance) {
//			System.out.println("잔고부족으로 출금 불가");
//		} else {
//			balance -= amount;
//			System.out.println("출금한 금액 : " + amount + "원");
//			System.out.println("출금 후 현재잔고 : " + balance + "원");
//		}
//		
//	}
//	
//}