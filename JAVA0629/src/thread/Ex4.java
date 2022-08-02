package thread;

public class Ex4 {

	public static void main(String[] args) {
		/*
		 * 멀티스레딩 환경에서의 문제점
		 * - 복수개의 스레드에서 동일한 객체의 데이터에 접근할 경우
		 * 	 각 스레드에서 사용되는 데이터의 일관성이 깨질 수 있다
		 * 	 => A라는 스레드에서 접근해서 사용하는 데이터를
		 * 		B라는 스레드에서 동시에 접근해서 변경할 경우
		 * 		올바를 테이터가 아니게 될 수 있음 (= 데이터 일관성이 깨졌다) 
		 * - 공유데이터에 대한 일관성 문제를 해결하기 위해서
		 * 	 Lock 개념과 동기화(Synchronize) 기능을 사용
		 * 	 => 메서드 또는 특정 코드 블럭에 Synchronize
		 * 
		 * 
		 * */
		Account account = new Account(100000);
		
		// 출금 스레드 수행할 객체 2개 생성
		WithdrawThread iBanking = new WithdrawThread("인터넷 뱅킹", account, 2000);
		WithdrawThread mBanking = new WithdrawThread("모바일 뱅킹", account, 2000);
		
		iBanking.start();
		mBanking.start();
	}

}

class Account {
	int balance;

	public Account(int balance) {
		this.balance = balance;
	}
	
	// 입금 deposit()
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}
	
	// 출금 withdraw()
	public synchronized int withdraw(int amount) {
		if(amount <= balance) {
			balance -= amount;
		} else {
			System.out.println("잔액이 부족하여 출금할 수 없습니다.");
			amount = 0;
		}
		System.out.println("출금한 금액 : " + amount + "원, 출금 후 잔액 : " + balance + "원");
		return amount;
	}
	
}

class WithdrawThread extends Thread {

	Account account;
	int amount;
	
	public WithdrawThread(String threadName, Account account, int amount) {
		super(threadName);	// 슈퍼클래스(Thread)를 통해 스레드 이름 초기화
		this.account = account;
		this.amount = amount;
	}
	
	@Override
	public void run() {
		for(int i = 1 ; i < 6 ; i++) {
			
			// 현재 스레드를 0.5초 일시정지
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			int money = account.withdraw(amount);
		}
	}
	
}



















