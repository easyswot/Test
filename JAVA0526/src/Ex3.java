
public class Ex3 {

	public static void main(String[] args) {
		
		Account acc = new Account("111-111-111", "가나다", "1234");
		
		Account other = new Account("459-972-456", "타파하", "6564");
		
		acc.deposit(100000);
		
		System.out.println("------------------------------");
		
		other.deposit(200000);
		
		System.out.println("------------------------------");
		
		acc.transfer("0000", other, 50000);
		
		System.out.println("------------------------------");
		
		acc.transfer("1234", other, 10000000);
		
		System.out.println("------------------------------");
		
		acc.transfer("1234", other, 1000);
		acc.showInfo();
		
		System.out.println("------------------------------");
		
		other.showInfo();
		
		System.out.println("------------------------------");
		
		other.transfer("6564", acc, 200000);
		other.showInfo();
		
		System.out.println("------------------------------");
		
		acc.showInfo();
		
	}

}


/*
 * < Account class 선언 >
 * 
 * 생성자 : 현재잔고를 제외한 모든 멤버변수를 초기화하는 생성자
 * 메서드 : 입금(deposit), 출금(withdraw), 계좌이체(transfer)
 * 
 * 			계좌이체
 * 			리턴x, 파라미터(비밀번호, 이체할 계좌, 금액)
 * 			- 비밀번호가 틀린 경우 "비밀번호가 일치하지 않습니다." 출력 후 메서드 종료
 * 			- 이체할 금액이 잔고보다 클 경우
 * 				"이체할 금액 : 2222"
 * 				"현재잔고 : 222"
 * 				"잔고가 부족하여 이체할 수 없습니다." 출력 후 메서드 종료
 * 
 * */

class Account {
	String accountNo;
	String ownerName;
	String password;
	int balance;
	
	public void showInfo() {
		System.out.println("예금주명 : " + ownerName);
		System.out.println("현재잔고 : " + balance + "원");
	}
	
	public void deposit(int amount) {
		System.out.println("입금금액 : " + amount + "원");
		balance += amount;
		System.out.println("입금 후 현재잔고 : " + balance + "원");
	}
	
	public int withdraw(int amount) {
		if(amount > balance) {
			System.out.println("잔고가 부족하여 출금할 수 없습니다.");
			return 0;
		} else {
			return amount;
		}
	}
	
	public void transfer(String password, Account other, int amount) {
		
		// 비밀번호 체크
		if(!this.password.equals(password)) {
			System.out.println("비밀번호가 일치하지 않습니다.");
			return;
		}
		
		// 잔고 체크
		if(amount > balance) {
			System.out.println("이체할 금액 : " + amount + "원");
			System.out.println("현재잔고 : " + balance + "원");
			System.out.println("잔고가 부족하여 이체할 수 없습니다.");
			return;
		}
		
		this.balance -= amount;
		other.balance += amount;
		
		
	}
	
	public Account(String accountNo, String ownerName, String password) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.password = password;
	}
	
}






