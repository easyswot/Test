package thread;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 * 스레드 우선순위(Priority)
		 * - 실행중인 스레드가 우선적으로 실행되도록 조정 가능한 값
		 * - 1 ~ 10 까지의 값을 부여 가능하며, 기본값은 5이다.
		 * - 스레드 우선순위가 높을수록 실행될 수 있는 확률이 높으나
		 * 	 절대적으로 작용하지는 않음
		 * 	 => 어디까지나 CPU 스케줄에 따라 실행되며, 자주 실행될 수 있는 "확률"을 높임
		 * - 현재 우선순위 확인 : int getPriority()
		 * - 현재 우선순위 변경 : void setPriority(int priority);
		 * 	 => 우선순위 값을 1 ~ 10 범위 내에서 지정가능하며 상수 지정도 가능
		 * 	    Thread.MIN_PRIORITY(1), Thread.NORM_PRIORITY(5), Thread.MAX_PRIORITY(10)
		 * - 우선순위에 의한 실행 도중 우선순위가 높은 스레드가 지속적으로 추기될 경우
		 * 	 우선순위가 낮은 스레드가 실행되지 못할 수도 있다 = 기아(Starvation) 상태
		 * 	 => 기아 상태를 방지하기 위해서는 모든 스레드가
		 * 		최소한의 시간만큼 일시정지 되도록 구현해야함(=sleep() 메서드 활용)
		 * 
		 * 
		 * */
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 1; i <= 100000; i++) {
					System.out.println("★★★★★★★★★★★★");
				}
			}
		});
		
		// 현재 우선순위 확인 : getPriority()
		System.out.println("t1 스레드으 우선순위 : " + t1.getPriority());
		
		// 현재 스레드 우선순위 변경 : setPriority()
		t1.setPriority(8);
		System.out.println("t1 스레드으 우선순위 : " + t1.getPriority());
		
		t1.setPriority(Thread.MAX_PRIORITY);
		System.out.println("t1 스레드으 우선순위 : " + t1.getPriority());
		
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 1; i <= 100000; i++) {
					System.out.println("○○○○○○○○○○○○○○○○");
				}
			}
		});
		
		Thread t3 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 1; i <= 100000; i++) {
					System.out.println("================");
				}
			}
		});
		
		// t1, t2, t3 스레드의 우선순위 서로 다르게 변경
		t1.setPriority(Thread.NORM_PRIORITY);	// 5	★★★★★★★★★★★★
		t2.setPriority(Thread.MIN_PRIORITY);	// 1	○○○○○○○○○○○○○○○○
		t3.setPriority(Thread.MAX_PRIORITY);	// 10	================
		
		
		t1.start();
		t2.start();
		t3.start();
	}

}
