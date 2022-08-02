package object;

import java.util.Objects;

public class Test1 {

	public static void main(String[] args) {
		/*
		 * Account
		 * 
		 * 
		 * 
		 * */
		
		Account acc1 = new Account("111-1111-111", "가나다", 10000);
		Account acc2 = new Account("111-1111-111", "가나다", 10000);
		
		if(acc1.equals(acc2)) {
			System.out.println("두 계좌는 동일");
		} else {
			System.out.println("두 계좌는 다름");
		}
		
		// 주소값이 아닌 멤버변수의 정보가 출력되도록
		System.out.println(acc1);
		
		
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
	
//	@Override
//	public boolean equals(Object obj) {
//		if(obj instanceof Account) {
//			Account a = (Account)obj;
//			
//			if(this.accountNo.equals(a.accountNo) && this.ownerName.equals(a.ownerName) && this.balance==a.balance) {
//				return true;
//			}
//		}
//		return false;
//	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return Objects.equals(accountNo, other.accountNo) && balance == other.balance
				&& Objects.equals(ownerName, other.ownerName);
	}	
	

//	@Override
//	public String toString() {
//		return "계좌번호 : " + accountNo + "\n예금주명 : " + ownerName + "\n현재잔고 : " + balance;
//	}
	
	// alt shift s s
	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", ownerName=" + ownerName + ", balance=" + balance + "]";
	}
	
	
}