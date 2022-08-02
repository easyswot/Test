package review;

public class Test1 {

	public static void main(String[] args) {
		ItwillBank ib1 = new ItwillBank("111-1111-111", "가나다", 10000, false);
		ItwillBank ib2 = new ItwillBank("333-3333-333", "라마바", 1000, true);
		System.out.println("가나다 출금 금액 : " + ib1.withdraw(100000));
		ib1.showAccountInfo();
		
		System.out.println("===================================================");
		
		System.out.println("라마바 출금 금액 : " + ib2.withdraw(20000));
		ib2.showAccountInfo();
		
		
	}

}


class Account {
	
	String accountNo;
	String ownerName;
	int balance;
	
	
	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	public void showAccountInfo() {
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("예금주명 : " + ownerName);
		System.out.println("현재잔고 : " + balance + "원");
	}
	
	public void deposit (int amount) {
		balance += amount;
	}
	
	public int withdraw(int amount) {
		if(balance < amount) {
			return 0;
		} else {
			balance -= amount;
			return amount;
		}
	}
}

/*
 * Account 클래스를 상속받는 ItwillBank 클래스 정의
 * 멤버변수 :  VIP 여부 boolean, isVip
 * 생성자 : 기본생성자 없이 모든 멤버변수를 초기화
 * 메서드 : 출금기능 (오버라이딩)
 * 			1) VIP일 경우 isVip = true 은행잔고에 관계없이 출금
 * 			2) 아닐 경우 출금가능/불가 여부가 결정되어 수행되도록 구현
 * 
 * */

class ItwillBank extends Account {
	boolean isVip;
	
	// 생성자 alt shift s o
	public ItwillBank(String accountNo, String ownerName, int balance, boolean isVip) {
		super(accountNo, ownerName, balance);
		this.isVip = isVip;
	}

	@Override
	public int withdraw(int amount) {
//		if( isVip ) {
//			balance -= amount;
//			return amount;
//		}
//		
//		if(balance < amount) {
//			System.out.println("출금불가");
//			return 0;
//		} else {
//			balance -= amount;
//			return amount;
//		}
		
//		if(!isVip && balance < amount) {
//			System.out.println("출금불가");
//			return 0;
//		} else {
//			balance -= amount;
//			return amount;
//		}
		
		if(!isVip) {
			return super.withdraw(amount);
		} else {
			balance -= amount;
			return amount;
		}
		
	}

	
	
	
}