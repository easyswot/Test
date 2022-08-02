package override;

public class Test1 {

	public static void main(String[] args) {
		
		ItwillBank ib = new ItwillBank();
		ib.balance = 1;
		ib.withdraw(100000);
		
	}

}

class Account {
	String accountNo;
	String ownerName;
	int balance;
	
	// 멤버 정보를 출력하는 showAccountInfo() 메서드 작성
	public void showAccountInfo() {
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("예금주명 : " + ownerName);
		System.out.println("현재잔고 : " + balance + "원");
	}
	
	// 입금 기능(전달받은 입금금액(amount)을 현재잔고(balance)에 누적) deposit 메서드
	public void deposit(int amount) {
//		this.balance += amount;		// balance와 amount 이름이 다르므로 this.없어도 됨
		balance += amount;
		System.out.println("입금할 금액 : " + amount + "원");
		System.out.println("입금 후 현재잔고 : " + balance + "원");
	}

	// 출금 기능(매개변수 금액을 전달받아, 금액만큼 리턴) withdraw 메서드 작성	
	public int withdraw(int amount) {
		if(amount > balance) {
			System.out.println("출금할 금액 : " + amount + "원");
			System.out.println("잔액이 부족하여 출금 불가 (현재잔고 : " + balance + "원)");
			return 0;
		} else {
			balance -= amount;
			System.out.println("출금할 금액 : " + amount + "원");
			System.out.println("출금 후 현재잔고 : " + balance + "원");
			return amount;
		}
		
	}
	
}

/*
 * ItwillBank 클래스 정의 - Account 클래스 상속
 * - 출금 가능(withdraw()) 메서드 오버라이딩 수행
 * 	=> 잔고가 부족하더라도 무조건 출금하도록 구현
 * 	   은행 잔고에 관계없이 무조건 출금 수행(마이너스 통장)
 * 
 * */

class ItwillBank extends Account {

	@Override
	public int withdraw(int amount) {
		balance -= amount;
		System.out.println("출금할 금액 : " + amount + "원");
		System.out.println("출금 후 현재잔고 : " + balance + "원");
		return amount;
	}
	
}































