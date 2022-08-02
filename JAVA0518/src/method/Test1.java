package method;

class Account {
	private String accountNo;
	private String ownerName;
	private int balance;
	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public int getBalance() {
		return balance;
	}
//	public void setBalance(int balance) {
//		this.balance = balance;
//	}
	
	// 입금기능 (deposit) 메서드
	public void deposit(int amount) {
		balance += amount;
		System.out.println("입금할 금액 : " + amount + "원");
		System.out.println("입금 후 현재 잔고 : " + balance + "원");
	}
}






public class Test1 {

	public static void main(String[] args) {
		
		Account a = new Account();
		a.setAccountNo("111-1111-111");
		a.setOwnerName("abc");
//		a.setBalance(10000);
		
		a.deposit(20000);
		// => 은행 계좌 기증 중 잔고설정(setBalance())은 적합하지 않은 기능이므로
		//    입금기능(deposit())을 통해 처리하는 것이 더 적합
		//    setBalance(10000) => deposit(10000) 입금처리
		
		System.out.println("계좌번호 : " + a.getAccountNo());
		System.out.println("예금주명 : " + a.getOwnerName());
//		System.out.println("현재잔고 : " + a.getBalance());
		

	}

}

